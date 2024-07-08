package caju.local.marley

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("logs")
class LoggingController {
    private val logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/all")
    fun all(): String {
        logger.trace("A TRACE Message")
        logger.debug("A DEBUG Message")
        logger.info("An INFO Message")
        logger.warn("A WARN Message")
        logger.error("An ERROR Message")
        return "All kind of logs produced (debug, info, warn, error)"
    }
    @GetMapping("/info")
    fun info(): String {
        logger.info("Info log printing")
        return "Info log produced"
    }

    @GetMapping("/debug")
    fun debug(): String {
        logger.info("Debug log printing")
        return "Debug log produced"
    }

    @GetMapping("/runner")
    fun debug(): String {
        logger.info("this was builded on a self-hosted github runner")
        return "Ok"
    }

    @GetMapping("/exception")
    fun exception(): String {
        try {
            throw Exception("Err")
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
        }
        return "Exception stack strace produced"
    }
}
