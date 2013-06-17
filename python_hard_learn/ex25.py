#! /usr/bin/env python
#coding=utf-8
# Even more practice. 2013-06-14
# this script only can be run via imported it.

def break_word(stuff):
    """Break up words for us."""
    words = stuff.split(' ')
    return words


def sort_words(words):
    """Sorts the words."""
    return sorted(words)


def print_first_word(words):
    """print the first word after popping it off."""
    word = words.pop(0)
    print word


def print_last_word(words):
    """Prints the last word after popping it off."""
    word = words.pop(-1)
    print word


def sort_sentance(sentance):
    """Takes in a full sentence and returns the sorted words."""
    words = break_word(sentance)
    return sort_words(words)


def print_first_and_last(sentance):
    """Prints the first and last words of the sentence."""
    words = break_word(sentance)
    print_first_word(words)
    print_last_word(words)


def print_first_and_last_sorted(sentance):
    """sorts the words then prints the first and last one."""
    words = sort_sentance(sentance)
    print_first_word(words)
    print_last_word(words)
