package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.Type_Sending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeSendingRepos extends JpaRepository<Type_Sending, Long> {
}
