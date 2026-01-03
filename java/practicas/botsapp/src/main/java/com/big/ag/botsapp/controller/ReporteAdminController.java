package com.big.ag.botsapp.controller;

import com.big.ag.botsapp.entity.ReporteAdmin;
import com.big.ag.botsapp.service.ReporteAdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReporteAdminController {

    private final ReporteAdminService service;
    public ReporteAdminController(ReporteAdminService service){
        this.service = service;
    }

    @GetMapping("/admin")
    public List<ReporteAdmin> getReportesAdmin(){
        return service.getAdmin();
    }

    @GetMapping("/admin/historial")
    public List<ReporteAdmin> getReportesAdminHis(){
        return service.getAdminHistorial();
    }

    @GetMapping("/admin/{id}")
    public ReporteAdmin getReportesAdminByID(@PathVariable Long id){
        return service.getAdminById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró un reporte con el ID: " + id));
    }

    @PostMapping("/admin")
    public ReporteAdmin newReporteAdmin(@RequestBody ReporteAdmin admin){
        return service.saveAdmin(admin);
    }

    @PutMapping("/admin/{id}")
    public ReporteAdmin updateReporteAdmin(@PathVariable Long id, @RequestBody ReporteAdmin admin){
        return service.updateAdmin(id, admin);
    }
    @DeleteMapping("/admin/{id}")
    public void delReporteAdmin(@PathVariable Long id){
        service.delAdmin(id);
    }
}
