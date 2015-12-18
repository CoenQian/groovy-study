package com.jiongbull.groovy.syntax

/**
 * 字符和字符串.
 */
/* --------------------单引号字符串-------------------- */
def name = 'Test Groovy!'
def body = 'Test $name'

assert name == 'Test Groovy!'
assert body == 'Test $name' // 不会替换$name占位符

assert 'ab' == 'a' + 'b' // 字符串拼接

/* --------------------三重单引号字符串-------------------- */
def aMultilineString = '''line one
line two
line three'''

println(aMultilineString)

// '\'可以去除第一行的\n
def strippedFirstNewLine = '''\
line one
line two
line three
'''

println(strippedFirstNewLine)
assert !strippedFirstNewLine.startsWith('\n')

/* --------------------双引号字符串-------------------- */
// ${}占位符可以替代字符串或表达式使用
def plainName = 'Guillaume' // 普通字符串
def greeting = "Hello ${plainName}"
assert greeting.toString() == 'Hello Guillaume'

def sum = "The sum of 2 and 3 equals ${2 + 3}"
assert sum.toString() == 'The sum of 2 and 3 equals 5'

def person = [name : 'Guillaume', age : 36]
assert "$person.name is $person.age years old".toString() == "Guillaume is 36 years old"

// $占位符只能配合A.B使用
//def number = 3.14
//println("$number.toString()")

def number = 1;
def eagerGString = "value == ${number}"
def lazyGString = "value == ${->number}"

assert eagerGString.toString() == "value == 1"
assert lazyGString.toString() == "value == 1"

number = 2;
assert eagerGString.toString() == "value == 1"
assert lazyGString.toString() == "value == 2"

assert "one: ${1}".hashCode() != "one: 1".hashCode()

def key = 'a'
def m = ["${key}" : "letter ${key}"]

assert m["a"] == null

/* --------------------多重双引号字符串-------------------- */
def tmpName = 'Groovy'
def template = """
    Dear Mr ${tmpName},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
"""

assert template.toString().contains('Groovy')

/* --------------------斜线字符串-------------------- */
// 普通使用
def fooPattern = /.*foo.*/
assert fooPattern == '.*foo.*'
// 含转义字符使用
def escapeSlash = /The character \/ is a forward slash/
assert escapeSlash == 'The character / is a forward slash'
// 多行支持
def multilineSlashy = /one
two
three/
assert multilineSlashy.contains('\n')
// 含占位符使用支持
def color = 'blue'
def interpolatedSlashy = /a ${color} car/

assert interpolatedSlashy.toString() == 'a blue car'

/* --------------------字符-------------------- */
char c1 = 'A'
assert c1 instanceof Character

def c2 = 'B' as char
assert c2 instanceof Character

def c3 = (char)'C'
assert c3 instanceof Character