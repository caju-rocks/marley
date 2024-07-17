package caju.local.marley

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("delays")
class WaitController {

    @GetMapping("/custom")
    fun fiveSecondDelay(@RequestParam seconds: Long): String {
        Thread.sleep(seconds * 1000)
        return "$seconds seconds delay"
    }

    @GetMapping("/tenseconds")
    fun tenSecondDelay(): String {
        Thread.sleep(10 * 1000)
        return "10 seconds delay"
    }
}