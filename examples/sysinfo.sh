#!/bin/bash

#Create the html structure here.

title="My System Information"
cat <<- _EOF_
    <html>
    <head>
        <title>
        $title
        </title>
    </head>

    <body>
    <h1>$title</h1>
    </body>
    </html>
_EOF_
