package com.example.demo.user.service;

import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/26.
 */

@Service("userService")
public class UserServiceImpl implements  UserService {
    @Autowired
    @Qualifier(value = "userRepository")
    UserRepository userRepository;

    @Override
    public User findByNameAndAge(String name, Integer age) {
        return userRepository.findByNameAndAge(name, age);
    }

    @Override
    public User withNameAndAddressQuery(String name, String address) {
        return userRepository.withNameAndAddressQuery(name, address);
    }

    @Override
    public User withNameAndAddressNamedQuery(String name, String address) {
        return userRepository.withNameAndAddressNamedQuery(name, address);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }
}
