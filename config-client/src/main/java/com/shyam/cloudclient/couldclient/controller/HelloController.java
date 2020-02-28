package com.shyam.cloudclient.couldclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SVadikari on 2/21/20
 */

@RestController
@RefreshScope
class HelloController {

    @Value("${db.uri}")
    private String dbUri;

    @GetMapping("/")
    public String sayHello(@RequestParam String user) {
        return "Hello "+user +"from "+dbUri;
    }
}
