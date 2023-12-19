package com.example.juice;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JuiceService {
    private final JuiceMapper juiceMapper;

    public JuiceService(JuiceMapper juiceMapper) {
        this.juiceMapper = juiceMapper;
    }

    public Juice findJuice(int id) {
        Optional<Juice> juice = this.juiceMapper.findById(id);
        if (juice.isPresent()) {
            return juice.get();
        } else {
            throw new JuiceNotFoundException("juice_id :" + id + " is not found");
        }
    }
}
