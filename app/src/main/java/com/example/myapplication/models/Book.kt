package com.example.myapplication.models

data class Book(
    val title: String,
    val image: String ?= null,
    val details: String?= null
)