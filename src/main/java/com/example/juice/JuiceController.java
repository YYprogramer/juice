package com.example.juice;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JuiceController {
    private final JuiceMapper juiceMapper;
    public JuiceController(JuiceMapper juiceMapper) {
        this.juiceMapper = juiceMapper;
    }
    @GetMapping("/juices")
    public List<Juice> findAll() {
        return juiceMapper.findAll();
    }
}
