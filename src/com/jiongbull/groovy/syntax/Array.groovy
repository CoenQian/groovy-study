package com.jiongbull.groovy.syntax

/**
 * 数组.
 */
// 定义初始化String数组
String[] arrStr = ['Ananas', 'Banana', 'Kiwi']
assert arrStr instanceof String[]
assert !(arrStr instanceof List)

// 使用def定义初始化int数组
def numArr = [1, 2, 3] as int[]
assert numArr instanceof int[]
assert numArr.size() == 3

// 声明定义多维数组指明宽度
def matrix3 = new Integer[3][3]
assert matrix3.length == 3

// 声明多维数组不指定宽度
Integer[][] matrix2
matrix2 = [[1, 2], [3, 4]]
assert matrix2 instanceof Integer[][]

// 数组的元素使用及赋值操作
String[] names = ['Cédric', 'Guillaume', 'Jochen', 'Paul']
assert names[0] == 'Cédric'
names[2] = 'Blackdrag'
assert names[2] == 'Blackdrag'


