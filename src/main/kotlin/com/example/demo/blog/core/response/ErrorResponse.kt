package com.example.demo.blog.core.response

data class ErrorResponse(
    val message: String,
    val errorType: String = "Invalid Argument"
)