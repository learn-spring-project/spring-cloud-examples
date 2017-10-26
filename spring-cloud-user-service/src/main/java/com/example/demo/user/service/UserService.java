package com.example.demo.user.service;

import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface UserService {
    User findByNameAndAge(String name, Integer age);

    User withNameAndAddressQuery(String name, String address);

    User withNameAndAddressNamedQuery(String name,String address);

    User findById(Long id);
}
