package com.jiongbull.groovy.syntax

/**
 * Map类型.
 */
// 定义一个Map
def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
// 获取一些指定key的value进行判断操作
assert colors['red'] == '#FF0000'
assert colors.green == '#00FF00'
// 给指定key的对赋值value操作与判断
colors['pink'] = '#FF00FF'
colors.yellow = '#FFFF00'
assert colors.pink == '#FF00FF'
assert colors['yellow'] == '#FFFF00'
// 判断Map的类型
assert colors instanceof LinkedHashMap
// 判断Map中不存在的key为null
assert colors.unknow == null

// 定义key类型为数字的Map
def numbers = [1: 'one', 2: 'two']
assert numbers[1] == 'one'

// 把一个定义的变量作为Map的key, 访问Map的该key是失败的
def key = 'name'
def person = [key: 'Guillaume']
assert !person.containsKey('name')
assert person.containsKey('key')

// 把一个定义的变量作为Map的key的正确写法--添加括弧, 访问Map的该key是成功的
person = [(key): 'Guillaume']
assert person.containsKey('name')
assert !person.containsKey('key')