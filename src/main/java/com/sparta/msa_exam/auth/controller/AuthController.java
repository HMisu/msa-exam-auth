package com.sparta.msa_exam.auth.controller;

import com.sparta.msa_exam.auth.dto.AuthResponseDto;
import com.sparta.msa_exam.auth.dto.SignInRequestDto;
import com.sparta.msa_exam.auth.dto.SignUpRequestDto;
import com.sparta.msa_exam.auth.entity.User;
import com.sparta.msa_exam.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth/signIn")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody SignInRequestDto signInRequest) {
        String token = authService.signIn(signInRequest.getUserId(), signInRequest.getPassword());
        return ResponseEntity.ok(new AuthResponseDto(token));
    }

    @PostMapping("/auth/signUp")
    public ResponseEntity<?> signUp(@RequestBody SignUpRequestDto user) {
        User createdUser = authService.signUp(user);
        return ResponseEntity.ok(createdUser);
    }
}