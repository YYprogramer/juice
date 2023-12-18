package com.example.juice;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final JuiceMapper juiceMapper;
    public JuiceService(JuiceMapper juiceMapper) {
        this.juiceMapper = juiceMapper;
    }
    public User findUser(int id) {
        Optional<User> user = this.juiceMapper.findById(id);
        return user.get(); // Optional.get()は値が存在しない場合例外を発⽣させる
    }
}