package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.Type_Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeVoucherRepos extends JpaRepository<Type_Voucher, Long> {
}
