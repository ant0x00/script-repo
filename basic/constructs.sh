#!/bin/bash
# 1. Decision making
# 2. Loops

# Decision
if [ condition ]; then
   content
fi

case $var in
	"1")
	  ...
	;;
	"2")
	  ...
	;;
	*)
	...
	;;
esac

# loops template
while [ condition ]
do
  programs
done
############
until [ condition ]
do
  programs
done

###############
for var in con1 con2 con3...
do
  programs
done

##################
for ((init; constrict value; steps))
do 
  programs
done

