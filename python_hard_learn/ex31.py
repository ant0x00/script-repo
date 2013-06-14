#! /usr/bin/env python
#coding=utf-8
# making decisions. 2013-6-14

print "You enter a dark room with two doors. \
        do you go through #1 or #2?"

door = raw_input("> ")

if door == "1":
    print "There's a giant hear here eating a cheese cake. \
    What do you do?"
    print "1. Take the cake."
    print "2. Scream at the bear."

    bear = raw_input("> ")

    if bear == "1":
        print "The bear eats your face off. Good job~"
    elif bear == "2":
        print "The bear eats your legs off. Good job~"
    else:
        print "Well, doing %s is probably better. \
                Bear runs away." % bear
elif door == "2":
    print "You stare into the endless abyss at..."
    print "1. Blueberries."
    print "2. Yellow jackt clothespins."

    insanit = raw_input("> ")
    if insanit == "1" or insanit == "2":
        print "Your body survies powered by a mind of jello."
    else:
        print "The insanity rots your eyes into a pool of muck."

else:
    print "You stumble around and fall on a knife and die."
