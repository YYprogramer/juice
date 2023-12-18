package com.example.juice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JuiceController {
    private final JuiceService juiceService;
    public JuiceController(JuiceService juiceService) {

        this.juiceService = juiceService;
    }
    @GetMapping("/juices/{id}")
    public Juice getJuice(@PathVariable("id") int id) {
        return juiceService.findJuice(id);
    }
}
