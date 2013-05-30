#!/bin/bash

read -p "Please input a number to perform the add operations:" nu

s=0

for(( i=1; i<=$nu; i=i+1 ))
do
	s=$(($s + $i))
done

echo "The result '1+2+3..+$nu' is: $s"
