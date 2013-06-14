#! /usr/bin/env python
#coding=utf-8
# ex6.py. 2013-6-11

x = "There are %d types of people." % 10
binary = "binary"
do_not = "don't"
y = "Those who know %s and those who %s." % (binary, do_not)

print x
print y

print "I said: %r." % x
print "I also said: '%s'." % y

hilarious = False
joke_evaluation = "Isn't that joke so fun? %r"

print joke_evaluation % hilarious

w = "This is the left side of ..."
z = "a string with a right side."
print w + z
