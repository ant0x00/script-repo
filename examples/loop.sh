############ Start
#!/bin/bash
#version=0.1

number=0

while [ "$number" -lt 10 ]; do
    echo "Number = $number"
    number=$((number+1))
done

num=0

until [ "$num" -ge 10 ]; do
    echo "Num = $num"
    num=$((num + 1))
done
