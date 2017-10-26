package com.example.demo.user.repository;

import com.example.demo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */
@Repository("userRepository")
public interface UserRepository  extends JpaRepository<User, Long>{
    List<User> findByAddress(String address);
    User findByNameAndAge(String name, Integer age);

    @Query("select p from User p where p.name= :name and p.address= :address")
    User withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);

    User withNameAndAddressNamedQuery(String name,String address);


}
