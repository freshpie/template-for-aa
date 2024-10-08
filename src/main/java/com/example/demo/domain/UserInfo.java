package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "user_info")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "user_id")
    private Long userId;


}