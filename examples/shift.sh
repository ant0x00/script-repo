#!/bin/bash

echo "You start with $# positional parameters."

while [ "$1" != "" ]; do
    echo "Parameter 1 equals $1"
    echo "You now have $# positional parameters."

    shift
done
