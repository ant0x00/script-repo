#!/bin/bash

if [ -z $1 ]; then
  echo "usage:getlines nu"
  exit 0
fi
n=0
cat manifest-diff | while [ "$n" != "$1" ]
	do 
		read line
		echo $line
		newline=${line##<*\/}
		nnline=${newline%\"}
		cat /home/wangglon/workspace/tmp/default.xml | grep "$nnline" && tmp="ok" || tmp="nok"
		if [ "$tmp" == "nok" ]; then
			echo $line >>/home/wangglon/workspace/tmp/gits-collection
		fi
		n=$(($n+1))
done
