package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
