package com.example.materialcalculator.domain

enum class Operation(val symbol: Char) {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('x'),
    DIVIDE('/')
}

val operationSymbols = Operation.entries.map { it.symbol }.joinToString("")

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.entries.find { it.symbol == symbol }
        ?: throw IllegalArgumentException("Invalid symbol")
}