package com.jiongbull.groovy.syntax

/**
 * 运算符.
 */
// 次方运算符
assert 2**3 == 8

def f = 3
f **= 2;
assert f == 9

// 非运算符
assert (!true) == false
assert (!'foo') == false
assert (!'') == true

// 安全占位符
// TODO 待验证
//def person = Person.find {it.id == 123}
//def name = pserson?.name
//assert name == null

// .@域访问操作符
class User {
    private final String name

    User(String name) {
        this.name = name
    }

    String getName() {
        "Name:$name"
    }
}

def user = new User('Bob')

assert user.name == 'Name:Bob'
assert user.@name == 'Bob'

// .&方法指针操作符
def list = ['a', 'b', 'c']
// 常规写法
list.each {
    println(it)
}

String printName(name) {
    println(name)
}

list.each(this.&printName)

// ?:二目运算符
displayName = user.name ? user.name : 'Amonymous'
displayName = user.name ?: 'Amonymous'

// *.展开运算符
// TODO 待验证
//class Car {
//    java.util.Map map
//    Car(java.util.Map map) {
//        this.map = map
//    }
//}
//users = [
//        new User(name: 'Jiong'),
//        null,
//        new User(name: 'Bull')]
//assert users*.name == ['Jiong', null, 'bull']