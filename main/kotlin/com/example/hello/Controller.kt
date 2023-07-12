package com.example.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class Controller {

    @GetMapping("/new")
    fun hi():String{
        return "hello world"
    }

    @PostMapping("/new1")
    fun h1(){
        println("saved")
    }
}