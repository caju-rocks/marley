package caju.local.marley

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MarleyController {
    @GetMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }
}