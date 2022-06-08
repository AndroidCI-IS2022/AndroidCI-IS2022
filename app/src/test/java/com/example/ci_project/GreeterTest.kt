package com.example.ci_project

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)


class GreeterTest{
    private val goodResponse = "Hi there"
    private val badResponse = ":("

    @Test
    fun whenInputIsHi(){
        val input = "hi"
        val result = Greeter.getGreeting(input)
        assertThat(result).isEqualTo(goodResponse)
    }

    @Test
    fun whenInputIsNotHi(){
        val input = "I don't like you"
        val result = Greeter.getGreeting(input)
        assertThat(result).isEqualTo(badResponse)
    }


}