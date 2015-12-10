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
map."an identifier with a space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"