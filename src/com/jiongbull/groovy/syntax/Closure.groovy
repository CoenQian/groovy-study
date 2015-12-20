package com.jiongbull.groovy.syntax

/**
 * 闭包.
 */
// 最基本的闭包
item = 1
def clourse1 = { item++ }
println(clourse1())
// 使用->将参数与代码分离
def clourse2 = { -> item++ }
println(clourse2())
// 使用隐含参数it
def clourse3 = { println(it) }
clourse3(3)
// 使用明确的参数it替代
def clourse4 = { it -> println(it) }
clourse4(4)
// 使用显示参数
def clourse5 = { item -> print(item) }
clourse5(5)
// 接受两个参数的闭包
def clourse6 = { String x, int y -> println("key ${x} the value is ${y}") }
clourse6('Jiong', 27)
// 包含一个参数多个语句的闭包
def clourse7 = { reader ->
    def line = reader + 2
    println(line)
}
clourse7(4)

// 定义一个Closure类型的闭包
def listener = { e -> println("Clicked on $e.source") }
assert listener instanceof groovy.lang.Closure
// 定义直接指定为Closure类型的闭包
groovy.lang.Closure callback = { println('Done!') }
groovy.lang.Closure<Boolean> isTextFile = {
    File it -> it.name.endsWith('.txt')
}

// 调用闭包
def code = { 123 }
assert code() == 123
assert code.call() == 123

def isOdd = { int i -> i % 2 == 1 }
assert isOdd(3)
assert !isOdd.call(2)

def isEven = { it % 2 == 0 }
assert !isEven(3)
assert isEven.call(2)



