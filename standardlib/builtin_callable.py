#!/usr/bin/env python
#coding=utf-8

# To check the object can be callable. The functions and lamba, class and others
# which have a __call__ instance, it return True.

def dump(function):
    if callable(function):
        print function, "is callable"
    else:
        print function, "is not callable"


class A:
    def method(self, value):
        return value


class B(A):
    def __call__(self, value):
        return value

