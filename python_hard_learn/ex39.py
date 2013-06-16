#! /usr/bin/env python
#coding=utf-8
#Dicts. a very powerful tool.

states = {
    'Oregon': 'OR',
    'Floriada': 'FL',
    'California': 'CA',
    'New York': 'NY',
    'Michigan': 'MI'
}

cites = {
    'CA': 'San Francisco',
    'MI': 'Detroit',
    'FL': 'Jacksonville'
}

cites['NY'] = 'New York'
cites['OR'] = 'Portland'

print '#' * 10
print "NY State has: ", cites['NY']
print "OR State has: ", cites['OR']

print '#' * 10
print "Michigan's abbreviation is: ", states['Michigan']
print "Floriada's abbreviation is: ", states['Floriada']

print '#' * 20
print "Michigan has: ", cites[states['Michigan']]
print "Floriada has: ", cites[states['Floriada']]

print '#' * 20
for state, abbre in states.items():
    print "%s is abbreviated %s" % (state, abbre)

print '#' * 20
for abbrev, city in cites.items():
    print "%s has the city %s" % (abbrev, city)

print '#' * 20
state = states.get('Texas', None)
if not state:
    print "Sorry, no Texas."

print '#' * 20
city = cites.get('TX', 'Does not exist')
print "The city for state 'TX' is: %s" % city

