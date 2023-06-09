package org.example.controller;

import org.example.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public String async() {
        asyncService.async();
        return "async";
    }

    @GetMapping("/sync")
    public String sync() {
        asyncService.sync();
        return "sync";
    }

}
