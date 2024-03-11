package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepos extends JpaRepository<City, Long> {
}
