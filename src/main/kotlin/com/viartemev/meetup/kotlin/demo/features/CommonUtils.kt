package com.viartemev.meetup.kotlin.demo.features

fun String.unquote(): String =
    if (length >= 2 && first() == '"' && last() == '"')
        substring(1, this.length - 1)
    else this
