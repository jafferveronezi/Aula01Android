package br.com.jaffer.primeiroprojeto.extensions

fun Double.format(digitos: Int) = String.format("%.${digitos}f", this)