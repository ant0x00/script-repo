#! /usr/bin/env python
#coding=utf-8
# ex21, return something by functions. 2013-06-14

def add(a, b):
    print "Adding %d + %d" % (a, b)
    return a + b


def subtract(a, b):
    print "Subtacting %d - %d" % (a, b)
    return a - b


def multiply(a, b):
    print "Multiplying %d * %d" % (a, b)
    return a * b


def divide(a, b):
    print "Dividing %d / %d" % (a, b)
    return a / b


print "Let's do some math with the own functions."

age = add(28, 2)
height = subtract(171, 1)
weight = multiply(64, 2)
iq = divide(200, 2)

print "Age: %d, Height: %d, weight: %d, iq: %d" % (age, height, weight, iq)


print "below is a puzzle:"

what = add(age, subtract(height, multiply(weight, divide(iq, 2))))

print "That becomes: ", what, "Can you do it by hand?"
