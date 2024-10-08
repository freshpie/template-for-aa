package com.example.demo.service;

import com.example.demo.domain.UserInfo;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * 사번 조회
     *
     * @return
     */
    @Transactional(readOnly = true)
    public Long getUserId() {
        UserInfo user = userRepository.findFirstByOrderByUserIdDESC();

        return user.getUserId();
    }






}
