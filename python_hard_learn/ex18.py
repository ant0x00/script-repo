#! /usr/bin/env python
#coding=utf-8
#ex18.py. 2013-6-13
# function01. a little exciting

# this one is like your scripts with argv

def print_two(*argv):
    arg1, arg2 = argv
    print "arg1: %r, arg2: %r" % (arg1, arg2)


def print_two_again(arg1, arg2):
    print "arg1: %r, arg2: %r" % (arg1, arg2)


def print_one(arg1):
    print "arg1: %r" % arg1


def print_none():
    print "Got nothing."

print_two("apple", "banana")
print_two_again("monday", "Tuesday")
print_one("Sunday")
print_none()
