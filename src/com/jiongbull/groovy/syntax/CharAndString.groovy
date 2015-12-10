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

assert !strippedFirstNewLine.startsWith('\n')

/* --------------------双引号字符串-------------------- */
