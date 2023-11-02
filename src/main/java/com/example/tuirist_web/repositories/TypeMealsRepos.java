package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.Type_Meals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeMealsRepos extends JpaRepository<Type_Meals, Long> {
}
