package com.sparta.msa_exam.auth.dto;

import lombok.Getter;

@Getter
public class SignUpRequestDto {
    private String userId;
    private String username;
    private String password;
    private String role;
}
