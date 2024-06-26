package com.papsign.ktor.openapigen.parameters.parsers.builder.query.form

import com.papsign.ktor.openapigen.parameters.parsers.builders.query.form.FormBuilderFactory
import com.papsign.ktor.openapigen.parameters.parsers.testSelector
import org.junit.jupiter.api.Test

class ObjectBuilderTest {

    data class TestClass1(val string: String)

    @Test
    fun test1() {
        val key = "key"
        val expected = TestClass1("test")
        val parse = mapOf(
            key to listOf("string,test")
        )
        FormBuilderFactory.testSelector(expected, key, parse, false)
    }
}
