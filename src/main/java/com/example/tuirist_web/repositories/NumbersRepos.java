package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.Numbers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumbersRepos extends JpaRepository<Numbers, Long> {
}
