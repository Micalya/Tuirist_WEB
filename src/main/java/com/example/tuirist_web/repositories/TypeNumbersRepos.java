package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.Type_Numbers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeNumbersRepos extends JpaRepository<Type_Numbers, Long> {
}
