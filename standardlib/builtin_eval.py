#!/usr/bin/env python
#coding=utf-8

def dump(expression):
    result = eval(expression)
    print expression, "==>", result, type(result)

