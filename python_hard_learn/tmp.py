#! /usr/bin/env python
#coding=utf-8
from sys import argv

script, from_file, in_file = argv
print "Copy %s to %s." % (from_file, in_file)

open(in_file, 'w').write(open(from_file).read())
