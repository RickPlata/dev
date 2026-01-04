package com.big.ag.botsapp.controller;

import com.big.ag.botsapp.entity.ReporteEquipos;
import com.big.ag.botsapp.service.ReporteEquiposService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReporteEquiposController {

    private final ReporteEquiposService service;
    public ReporteEquiposController(ReporteEquiposService service){
        this.service = service;
    }

    @GetMapping("/equipos")
    public List<ReporteEquipos> getReportesEquipos(){
        return service.getEquipos();
    }

    @GetMapping("/equipos/historial")
    public List<ReporteEquipos> getReportesEquiposHis(){
        return service.getEquiposHistorial();
    }

    @GetMapping("/equipos/{id}")
    public ReporteEquipos getReporteEquipoByID(@PathVariable Long id){
        return service.getEquiposById(id)
                .orElseThrow(() -> new RuntimeException("No se econtró un reporte de con el ID: " + id));
    }

    @PostMapping("/equipos")
    public ReporteEquipos newReporteEquipo(@RequestBody ReporteEquipos equipo){
        return service.saveEquipos(equipo);
    }

    @PutMapping("/equipos/{id}")
    public ReporteEquipos updateReporteEquipo(@PathVariable Long id, @RequestBody ReporteEquipos equipo){
        return service.updateEquipos(id, equipo);
    }

    @DeleteMapping("/equipos/{id}")
    public void delReportEquipos(@PathVariable Long id){
        service.delEquipos(id);
    }

    @PutMapping("/equipos/{id}/resolver")
    public ReporteEquipos resolverReporteEquipos(@PathVariable Long id){
        return service.updateEquipoHis(id);
    }
}