#! /usr/bin/env python
#coding=utf-8
#Else and If.

people = 30
cars = 40
buses = 15

if cars > people:
    print "We should take cars."
elif cars < people:
    print "We should not take cars."
else:
    print "we cannot decide."

if buses > cars:
    print "There are too many buses."
elif buses < cars:
    print "Maybe we could take the buses."
else:
    print "We still can't decide."

if people > buses:
    print "Let's just take the buses."
else:
    print "Fine, let's stay home."
