############ Start
#!/bin/bash
#version=0.1

LOG_DIR=/var/log
ROOT_UID=0
LINES=50
E_XCD=66
E_NOTROOT=67
E_WRONGARGS=65

#need sudo to execute this script
if [ "$UID" -ne "$ROOT_UID" ]; then
	echo "Only sudo can run this script!"
	exit $E_NOTROOT
fi

case "$1" in
	"") lines=$LINES
		;;
	*[!0-9]*) echo "Usage: `basename $0` file-tocleanup"; exit $E_WRONGARGS 
		;;
	*)	lines=$1
		;;
esac

cd $LOG_DIR || {
	echo "Cannot change to necessary directory." >&2
	exit $E_XCD
}

tail -$lines messages >mesg.temp
mv mesg.temp messages

cat /dev/null >wtmp

echo "Logs cleaned up."

exit 0

############### End
