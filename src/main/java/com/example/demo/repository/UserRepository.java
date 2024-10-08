package com.example.demo.repository;

import com.example.demo.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserInfo, Long> {

    @Query(value = "SELECT userId FROM UserInfo")
    UserInfo findFirstByOrderByUserIdDESC();
}
