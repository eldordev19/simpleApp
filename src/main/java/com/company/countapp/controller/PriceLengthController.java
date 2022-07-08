package com.company.countapp.controller;


import com.company.countapp.dto.PriceLengthDto;
import com.company.countapp.service.PriceLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/price")
public class PriceLengthController {
    @Autowired
    PriceLengthService price_service;

    @GetMapping("/{id}")
    public HttpEntity getPriceLengthById(@PathVariable String id) {
        return ResponseEntity.ok(price_service.getPriceLengthById(id));
    }

    @GetMapping
    public HttpEntity getAllPriceLengths() {
        return ResponseEntity.ok(price_service.getAllPriceLengths());
    }

    @PostMapping
    public HttpEntity savePriceLength(@RequestBody PriceLengthDto priceDto) {
        price_service.savePriceLength(priceDto);
        return ResponseEntity.ok("successfully saved");
    }
    @PutMapping("/{id}")
    public HttpEntity updatePriceLength(@RequestBody PriceLengthDto priceDto, @PathVariable String id) {
        price_service.updatePriceLength(id, priceDto);
        return ResponseEntity.ok("successfully updated");
    }

    @DeleteMapping("/{id}")
    public HttpEntity deletePriceLength(@PathVariable String id){
        price_service.deletePriceLengthById(id);
        return ResponseEntity.ok("successfully deleted");
    }
}
