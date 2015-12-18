package com.jiongbull.groovy.syntax

/**
 * 数字.
 */
/* --------------------整型-------------------- */
// 基本类型
byte b = 1
char c = 2
short s = 3
int i = 4
long l = 5
// 高精度类型
BigInteger bi = 6

int xInt1 = 077
assert xInt1 == 63

int xInt2 = 0x77
assert xInt2 == 119

int xInt3 = 0b10101111
assert xInt3 == 175

/* --------------------浮点型-------------------- */
// 基本类型
float f = 1.234
double d = 2.345
// 高精度类型
BigDecimal bad = 3.456

assert 1e3 == 1_000.0
assert 2e4 == 20_000.0
assert 3e+1 == 30.0
assert 4E-2 == 0.04


