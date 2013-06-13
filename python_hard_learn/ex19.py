#! /usr/bin/env python
#coding=utf-8
# function02. a little exciting

def cheese_and_crackers(cheese_count, boxes_crackers):
    print "You have %d cheeses!" % cheese_count
    print "You have %d boxes of crackers." % boxes_crackers
    print "Enough for a party.\n"


print "We can just give the function numbers directly:"
cheese_and_crackers(20, 30)

print "Or, we can use variables from the script:"
amount_of_cheese = 10
amount_of_crackers = 50

cheese_and_crackers(amount_of_cheese, amount_of_crackers)


print "do math inside, too:"
cheese_and_crackers(10+20, 20-12)
