package com.big.ag.botsapp.repository;

import com.big.ag.botsapp.entity.ReporteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReporteAdminRepository extends JpaRepository <ReporteAdmin, Long> {
    List<ReporteAdmin> findByHis(Byte his);
}
