package com.jiongbull.groovy.syntax

/**
 * 标识符.
 */
/* --------------------普通标识符-------------------- */
/* 正确的定义. */
def name
def $name
def name_type

/* 错误的定义 */
//def foo.assert
//def 5type
//def a+b

/* --------------------引用标识符-------------------- */
def map = [:]
map."an identifier with a space and double quotes" = "ALLOWED" // 可以出现空格
map.'with-dash-signs-and-single-quotes' = "ALLOWED" // 可以出现横线

assert map."an identifier with a space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"

map.'single quote'
map."double quote"
map.'''triple single quote'''
map."""triple double quote"""
map./slashy string/
map.$/dollar slashy string/$

def firstname = "Homer"
map."Simson-${firstname}" = "Homer Simson"

assert map."Simson-Homer" == "Homer Simson"
