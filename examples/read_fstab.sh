#!/bin/bash

File=/etc/fstab

{
read line1
read line2
} <$File

echo $line1
echo $line2

exit 0
