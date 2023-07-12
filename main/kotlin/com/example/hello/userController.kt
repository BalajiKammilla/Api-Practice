package com.example.hello


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


data class User(val id:Long,val name:String)


@RestController
@RequestMapping("/api/users")
class userController {

    private val users= mutableListOf<User>()
    private val counter=AtomicLong()


    @GetMapping
    fun getUSers():List<User>{
        return users
    }

    @PostMapping("/po")
    fun addUser( @RequestBody user: User): com.example.hello.User {
        val newUser=User(counter.incrementAndGet(), user.name)
        return newUser
    }
}

