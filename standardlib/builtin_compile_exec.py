#!/usr/bin/env python
#coding=utf-8
import sys, string

BODY = """
print "this is for compile function test."
"""

code = compile(BODY, "<script>", "exec")

print code

exec code

class CodeGereratorBackend:
    "A very simpole gererator for Python."
    def begin(self, tab='\t'):
        self.code = []
        self.tab = tab
        self.level = 0

    def end(self):
        self.code.append("") # make sure there's a newline at the end
        return compile(string.join(self.code, "\n"), "<code>", "exec")

    def write(self, string):
        self.code.append(self.tab * self.level + string)

    def indent(self):
        self.level = self.level + 1

    def dedent(self):
        if self.level == 0:
            raise SyntaxError, "internal error in code gererator."
        self.level -= 1


c = CodeGereratorBackend()
c.begin()
c.write("for i in range(5):")
c.indent()
c.write("print 'it is easy to use my tools to gererate code.'")
c.dedent()
exec c.end()

