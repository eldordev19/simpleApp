package com.company.countapp.controller;

import com.company.countapp.dto.CanalDto;
import com.company.countapp.service.CanalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/canal")
public class CanalController {

    @Autowired
    CanalService canalService;

    @GetMapping("/{id}")
    public HttpEntity getCanalById(@PathVariable String id) {
        return ResponseEntity.ok(canalService.getCanalById(id));
    }

    @GetMapping
    public HttpEntity getAllCanals() {
        return ResponseEntity.ok(canalService.getAllCanals());
    }

    @PostMapping
    public HttpEntity saveCanal(@RequestBody CanalDto canalDto) {
        canalService.saveCanal(canalDto);
        return ResponseEntity.ok("successfully saved");
    }
    @PutMapping("/{id}")
    public HttpEntity updateCanal(@RequestBody CanalDto canalDto, @PathVariable String id) {
        canalService.updateCanal(id, canalDto);
        return ResponseEntity.ok("successfully updated");
    }

    @DeleteMapping("/{id}")
    public HttpEntity deleteCanal(@PathVariable String id){
        canalService.deleteCanalById(id);
        return ResponseEntity.ok("successfully deleted");
    }
}
