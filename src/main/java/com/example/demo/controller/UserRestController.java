package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 사번 조회
     *
     * @return String userId
     */
    @GetMapping(value = "/user")
    public ResponseEntity<?> getUserId() {
        return ResponseEntity.ok(String.valueOf(userService.getUserId()));
    }


}
