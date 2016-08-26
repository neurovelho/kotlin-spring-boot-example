package example.controller

import org.junit.runner.RunWith
import org.junit.Test
import org.springframework.test.context.junit4.SpringRunner
import org.junit.Assert.*

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest

@RunWith(SpringRunner::class)
@WebMvcTest
open class HelloControllerTest {
	@Autowired
	lateinit private var mvc: MockMvc
	
	@Test
	fun testFoo() {
		mvc.perform(get("/"))
		   .andExpect(status().isOk())
		   .andExpect(content().string("Hello, world!"))
	}
}