package example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {
	@GetMapping("/")
	fun sayHello() = "Hello, world!"
}