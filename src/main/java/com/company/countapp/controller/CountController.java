package com.company.countapp.controller;

import com.company.countapp.entity.BuyItem;
import com.company.countapp.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "/count")
public class CountController {

    @Autowired
    CountService countService;

    @PostMapping
    public HttpEntity count (@RequestBody BuyItem buyItem) {
        Double num = countService.countPrice(buyItem);
        return ResponseEntity.ok(num);

    }
}
