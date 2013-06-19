class Parent(object):
    def implicit(self):
        print "Parent implicit()."

class Son(Parent):
    def implicit(self):
        print "This is son."
        super(Son, self).implicit()

class Grandson(Parent, Son):
    pass

dad = Parent()
son = Son()
grandson = Grandson()

dad.implicit()
son.implicit()
grandson.implicit()
