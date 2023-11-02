package com.example.tuirist_web.repositories;

import com.example.tuirist_web.models.Add_Programs;
import com.example.tuirist_web.models.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherRepos extends JpaRepository<Voucher, Long> {
}
