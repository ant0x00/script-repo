#! /usr/bin/env python
#coding=utf-8
# Branches and Functions

from sys import exit

def gold_room():
    print "堆满黄金的屋子，你想拿走多少两金子？请输入你想要的数字：(数字必须包含0或1)"

    next = raw_input("> ")
    if "0" in next or "1" in next:
        how_much = int(next)
    else:
        dead("哥们，你死在不识数上了～")

    if how_much <0:
        dead("傻呀，都进来还不拿")
    elif how_much < 50:
        print "不贪的孩子，拿走吧，祝你幸福。你得到了%r两金子。" % next
        exit(0)
    else:
        dead("你挂了，因为你太贪了～")


def bear_room():
    print "屋里有大狗熊。。。"
    print "大熊有一堆蜂蜜，"
    print "大熊挡住了前面装满黄金的门，"
    print "怎么才能把熊引开进入黄金门里呢？"
    print "提示：你可以‘拿走蜂蜜’，或者‘嘲讽’狗熊，让他离开门口，然后就可以‘开门’进入黄金门了。"
    bear_moved = False

    while True:
        next = raw_input("> ")

        if next == "拿走蜂蜜":
            dead("敢抢狗熊的食，你死定了～")
        elif next == "嘲讽" and not bear_moved:
            print "狗熊挪了挪身子，你现在有机会过去开门。。。"
            bear_moved = True
        elif next == "嘲讽" and bear_moved:
            dead("把熊引开就得了，还得瑟，挂了吧～")
        elif next == "开门" and bear_moved:
            gold_room()
        else:
            print "你用的方法不对，再想想。。。"

def cthulhu_room():
    print "这里是魔鬼的地盘。。。"
    print "你是想‘逃走’，还是‘继续’？"

    next = raw_input("> ")

    if "逃走" in next:
        start()
    elif "继续" in next:
        dead("傻呀你，都说是魔鬼的地盘了，还不跑，挂了吧～")
    else:
        cthulhu_room()


def dead(why):
    print why, "游戏结束～"
    exit(0)

def start():
    print "你在一间黑屋子里。你的左边和右边各有一个门;"
    print "你想去‘右边’，还是‘左边’？"

    next = raw_input("> ")

    if next == "左边":
        bear_room()
    elif next == "右边":
        cthulhu_room()
    else:
        dead("傻呀，左右都不会打吗？")

start()
