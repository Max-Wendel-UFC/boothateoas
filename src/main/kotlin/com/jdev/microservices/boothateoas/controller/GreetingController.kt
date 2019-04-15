package com.jdev.microservices.boothateoas.controller

import com.jdev.microservices.boothateoas.model.Greet
import org.springframework.hateoas.mvc.ControllerLinkBuilder
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import java.util.logging.Logger


@Controller
class GreetingController {


    @Autowired
    var env: Environment? = null

    fun greet(): Greet {
        val logger:Logger = Logger.getAnonymousLogger()
        logger.info("bootrest.customproperty " + env!!.getProperty("bootrest.customproperty"))
        return Greet("Hello World!")
    }

    @RequestMapping("/greeting")
    @ResponseBody
    fun greeting(@RequestParam(value = "name",required = false, defaultValue = "HATEOAS") name:String): HttpEntity<Greet> {
        val greet = Greet("""Hello $name!""")
        greet.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(GreetingController::class.java).greeting(name)).withSelfRel())

                return ResponseEntity<Greet>(greet, HttpStatus.OK)
    }
}