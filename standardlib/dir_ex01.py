#!/usr/bin/env python

class A:
    def a(self):
        pass
    def b(self):
        pass

class C:
    def e(self):
        pass

class B(A, C):
    def c(self):
        pass
    def d(self):
        pass


def getmembers(klass, members=None):

    if members is None:
        members = []
    for k in klass.__bases__:
        getmembers(k, members)
    for m in dir(klass):
        if m not in members:
            members.append(m)
    return members


