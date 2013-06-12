#! /usr/bin/env python
#coding=utf-8
# ex17.py. More files. copy content from one file to another

from sys import argv
from os.path import exists

script, from_file, to_file = argv
#script, from_file = argv

print "Copying from %s to %s" % (from_file, to_file)

in_file = open(from_file)
indata = in_file.read()

print "The input file is %d bytes long" % len(indata)

print "does the output file exist? %r" % exists(to_file)
print "Sure, hit Enter to continue, ^C to abort."
raw_input()

out_file = open(to_file, 'a')
out_file.write(indata)

print "Done."

out_file.close()
in_file.close()
