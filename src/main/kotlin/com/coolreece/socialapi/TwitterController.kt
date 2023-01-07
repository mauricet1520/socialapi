package com.coolreece.socialapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/twitter")
class TwitterController {


    @GetMapping("/tweet")
    fun getTweet(): Mono<String> {

        return Mono.just("Tweet")
    }


}