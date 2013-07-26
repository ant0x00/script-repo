#!/usr/bin/env python
#coding=utf-8

# python will import Exception module automatically, so the import
# below is not neccessary.

#import Exception

class HTTPError(Exception):

    def __init__(self, url, errcode, errmsg):
        self.url = url
        self.errcode = errcode
        self.errmsg = errmsg

    def __str__(self):
        return(
                "<HTTPError for %s: %s %s>" %
                (self.url, self.errcode, self.errmsg)
               )

try:
    raise HTTPError("http://www.baidu.com/shit", 200, "NOT found")
except HTTPError as error:
    print error.url
    raise
