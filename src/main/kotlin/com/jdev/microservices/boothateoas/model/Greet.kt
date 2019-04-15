package com.jdev.microservices.boothateoas.model

import org.springframework.hateoas.ResourceSupport

class Greet(val name: String): ResourceSupport() {
    override fun toString(): String {
        return name
    }
}