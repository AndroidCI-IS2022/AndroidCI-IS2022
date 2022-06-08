package com.example.ci_project

object Greeter {

    fun getGoodResponse():String{
        return "Hi there"
    }

    fun getBadResponse():String{
        return ":("
    }

    fun getGreeting(input: String): String {
        return if (input == "hi") {
            "Hi there"
        } else {
            ":("
        }
    }
}