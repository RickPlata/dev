package com.big.ag.botsapp.controller;

import com.big.ag.botsapp.entity.ReporteAdmin;
import com.big.ag.botsapp.service.ReporteAdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReporteAdminController {

    private final ReporteAdminService service;
    public ReporteAdminController(ReporteAdminService service){
        this.service = service;
    }

    @GetMapping("/admin")
    public List<ReporteAdmin> getReportesAdmin)(){
        return service.getAdmin();
    }

    @GetMapping("/admin/{id}")
    public List<ReporteAdmin> getReportesAdminByID)(@PathVariable Long id){
        return service.getAdminById(id);
    }

    @


}
