package com.big.ag.botsapp.service;

import com.big.ag.botsapp.entity.ReporteEquipos;
import com.big.ag.botsapp.repository.ReporteEquiposRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReporteEquiposService {

    private final ReporteEquiposRepository repository;

    public ReporteEquiposService(ReporteEquiposRepository repository){
        this.repository = repository;
    }

    public List<ReporteEquipos> getEquipos(){
        return repository.findAll();
    }

    public Optional<ReporteEquipos> getEquiposById(Long id){
        return repository.findById(id);
    }

    public ReporteEquipos saveEquipos(ReporteEquipos reporteEquipos){
        return repository.save(reporteEquipos);
    }

    public ReporteEquipos updateEquipos(Long id, ReporteEquipos reporteEquipos){
        return repository.findById(id)
                .map(equipos -> {

                    equipos.setNombre(reporteEquipos.getNombre());
                    equipos.setLab(reporteEquipos.getLab());
                    equipos.setMateria(reporteEquipos.getMateria());
                    equipos.setIncidencia(reporteEquipos.getIncidencia());
                    equipos.setHora(reporteEquipos.getHora());
                    equipos.setFecha(reporteEquipos.getFecha());
                    equipos.setHis(reporteEquipos.getHis());

                    return repository.save(equipos);
                })
                .orElseThrow(() -> new RuntimeException("Admin no encontrado con id " + id));

    }

    public void delAdmin(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Elemento con el ID: " + id + " no encontrado");
        }
        repository.deleteById(id);

    }

}
