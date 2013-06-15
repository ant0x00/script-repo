#! /usr/bin/env python
#coding=utf-8
#Loop and lists. 2013-6-15. 
# More and more interesting...

the_count = [1, 2, 3, 4, 5]
fruits = ['apple', 'oranges', 'pears', 'apricots']
change = [1, 'pennies', 2, 'dimes', 3, 'quarters']

# first for-loop goes through a list
for number in the_count:
    print "This is count %d" % number

#same as above.
for fruit in fruits:
    print "A fruit of type: %s" % fruit

# we can go throuth mixed list too. but have to use %r
for i in change:
    print "I got %r" % i

# build lists with an empty one
elements = []

for i in range(0, 6):
    print "Adding %d to the list." % i
    elements.append(i)

for i in elements:
    print "Element was: %d" % i
