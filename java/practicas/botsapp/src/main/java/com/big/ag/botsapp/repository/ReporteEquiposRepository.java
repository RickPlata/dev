package com.big.ag.botsapp.repository;

import com.big.ag.botsapp.entity.ReporteEquipos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReporteEquiposRepository extends JpaRepository<ReporteEquipos, Long> {
    List<ReporteEquipos> findByHis(Byte his);
}
