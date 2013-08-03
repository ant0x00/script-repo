#!/usr/bin/env python
#coding=utf-8

import os
import sys

program = "python"
arguments = ["hello.py"]

print os.execvp("python", (program,) + tuple(arguments))
print "Goodbye."

