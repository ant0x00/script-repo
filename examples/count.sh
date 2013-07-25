############ Start
#!/bin/bash
#version=0.1

count=0
for i in $(cat loop.sh); do
    count=$((count+1))
    echo "Word $count ($i) contains $(echo -n $i | wc -c) characters."
done

