package com.jiongbull.groovy.syntax

/**
 * 闭包.
 */
/* --------------------闭包语法-------------------- */
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

/* --------------------闭包参数-------------------- */
def closureWithOneArg = { str -> str.toUpperCase() }
assert closureWithOneArg('groovy') == 'GROOVY'

def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'

def closureWithTwoArgs = { a, b -> a + b }
assert closureWithTwoArgs(1, 2) == 3

def closureWithTowArgsAndExplicitType = { a, int b -> a + b }
assert closureWithTowArgsAndExplicitType(1, 2) == 3

def closureWithTwoArgsAndDefaultValue = { int a, int b = 2 -> a + b }
assert closureWithTwoArgsAndDefaultValue(1) == 3

// 隐含参数
def greeting = { "Hello, $it!" }
assert greeting('Patrick').toString() == 'Hello, Patrick!'

// 不接受参数的闭包
def magicNumber = { -> 42 }
magicNumber()

// 可变长参数
def concat1 = { String... args -> args.join('') }
assert concat1('abc', 'def') == 'abcdef'
def concat2 = { String[] args -> args.join('') }
assert concat2('abc', 'def') == 'abcdef'

def multiConcat = { int n, String... args -> args.join('') * n }
assert multiConcat(2, 'abc', 'def') == 'abcdefabcdef'

/* --------------------闭包省略调运-------------------- */

def debugClosure(int num, String str, groovy.lang.Closure closure) {
    closure.call()
}

debugClosure(1, "groovy") {
    println("hello groovy!")
}