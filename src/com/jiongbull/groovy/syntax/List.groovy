package com.jiongbull.groovy.syntax

/**
 * 列表.
 */
// 使用动态List
def numbers = [1, 2, 3]
assert numbers instanceof java.util.List
assert numbers.size() == 3

// List中存储任意类型
def heterogeneous = [1, "a", true]

// 判断List默认类型
def arrayList = [1, 2, 3]
assert arrayList instanceof ArrayList

// 使用as强装类型
def linkedList = [2, 3, 4] as LinkedList
assert linkedList instanceof LinkedList

// 定义指定类型List
LinkedList otherLinked = [3, 4, 5]
assert otherLinked instanceof LinkedList

// 定义List使用
def letters = ['a', 'b', 'c', 'd']
// 判断item值
assert letters[0] == 'a'
assert letters[1] == 'b'
// 负数下表则从右向左索引
assert letters[-1] == 'd'
assert letters[-2] == 'c'
// 指定item赋值判断
letters[2] = 'C'
assert letters[2] == 'C'
// 给List追加item
letters << 'e'
//letters[4] = 'e'
assert letters[4] == 'e'
assert letters[-1] == 'e'
// 获取一段List子集
assert letters[1, 3] == ['b', 'd']
assert letters[2..4] == ['C', 'd', 'e']

// 多维List支持
def multi = [[0, 1], [2, 3]]
assert multi[1][0] == 2
