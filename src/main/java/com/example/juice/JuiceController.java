package com.example.juice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JuiceController {
    private final JuiceMapper juiceMapper;
    public JuiceController(JuiceMapper juiceMapper) {
        this.juiceMapper = juiceMapper;
    }
    @GetMapping("/juices/{startsWith}")
    public List<Juice> findByNames(@PathVariable("startsWith") String startsWith) {
        return juiceMapper.findByNameStartingWith(startsWith);
    }
}
