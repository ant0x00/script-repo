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
