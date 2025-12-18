package com.big.ag.botsapp.service;

import com.big.ag.botsapp.repository.ReporteAdminRepository;
import org.springframework.stereotype.Service;

@Service
public class ReporteAdminService {

        private final ReporteAdminRepository repository;

        public ReporteAdminService(ReporteAdminRepository repository){
            this.repository = repository;
        }
}
