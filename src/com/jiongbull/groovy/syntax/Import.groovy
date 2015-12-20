package com.jiongbull.groovy.syntax

/**
 * Imports引入.
 */
import groovy.xml.MarkupBuilder
def xml = new MarkupBuilder()
assert xml != null

import groovy.xml.*
def markupBuilder = new MarkupBuilder()
assert markupBuilder != null
assert new StreamingMarkupBuilder() != null

import static java.lang.Boolean.FALSE
assert !FALSE

import static java.util.Calendar.getInstance as now
assert now().class == Calendar.getInstance().class