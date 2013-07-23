#!/bin/bash

#Create the html structure here.

# variables definition
title="My System Information"
right_now=$(date +"%x %r %Z")
time_stamp="Updated on $right_now by $USER."

# Functions:

system_info()
{
    echo "<h2>System release info</h2>"
}

show_uptime()
{
    echo "<h2>System uptime</h2>"
    echo "<pre>"
    uptime
    echo "</pre>"
}

drive_space()
{
    echo "<h2>Filesystem space info</h2>"
    echo "<pre>"
    df -h
    echo "</pre>"
}

home_space()
{
    if [ "$(id -u)" = "0" ]; then
        echo "<h2>Home directory space by user</h2>"
        echo "<pre>"
        du -sh /home/* | sort -nr
        echo "</pre>"
    fi
}


write_page()
{
    cat <<- _EOF_
        <html>
        <head>
            <title>
            $title
            </title>
        </head>

        <body>
        <h1>$title $HOST</h1>
        <p>$time_stamp</p>
        $(system_info)
        $(show_uptime)
        $(drive_space)
        $(home_space)
        </body>
        </html>
_EOF_
}

usage()
{
    echo "Usage: sysinfo.sh [[[-f file] [-i]] | [-h]]"
}


default_name=sysinfo_page.html
interactive=

while [ "$1" != "" ]; do
    case $1 in
        -f | --file )           shift
                                default_name=$1
                                ;;
        -i | --interactive )    interactive=1
                                ;;
        -h | --help )           usage
                                exit
                                ;;
        * )                     usage
                                exit 1
    esac
    shift
done

if [ "$interactive" = "1" ]; then
    echo "interactive is on."
    reponse=
    echo -n "Enter name of output file [$default_name] >"
    read reponse
    if [ -n "$reponse" ]; then
        default_name=$reponse
    fi
    
    if [ -f $default_name ]; then
        echo -n "File exists. Overwrite it?? (y/n)"
        read response
        if [ "$response" != "y" ]; then
            echo "Exiting program."
            exit 1
        fi
    fi
else
    echo "interactive is OFF."
fi

echo "output file = $default_name"

