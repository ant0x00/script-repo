#!/usr/bin/env python

def function(a="Beijing", b="China"):
    return a, b


apply(function, ("whither", "canada"))

apply(function, (1, 2+3))

