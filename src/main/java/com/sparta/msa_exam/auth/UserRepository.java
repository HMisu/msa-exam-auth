package com.sparta.msa_exam.auth;

import com.sparta.msa_exam.auth.core.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
