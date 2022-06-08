package com.example.ci_project

object Greeter {
    fun getGreeting(input: String): String {
        return if (input == "hi") {
            "Hi there aaa"
        } else {
            ":("
        }
    }
}