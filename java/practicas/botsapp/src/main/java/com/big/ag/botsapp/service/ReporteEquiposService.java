package com.big.ag.botsapp.service;

import com.big.ag.botsapp.entity.ReporteAdmin;
import com.big.ag.botsapp.entity.ReporteEquipos;
import com.big.ag.botsapp.repository.ReporteEquiposRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReporteEquiposService {

    private final ReporteEquiposRepository repository;

    public ReporteEquiposService(ReporteEquiposRepository repository){
        this.repository = repository;
    }

    public List<ReporteEquipos> getEquipos(){
        return repository.findByHis((byte) 0);
    }

    public Optional<ReporteEquipos> getEquiposById(Long id){
        return repository.findById(id);
    }

    public ReporteEquipos saveEquipos(ReporteEquipos reporteEquipos){
        ReporteEquipos equipo = new ReporteEquipos();

        equipo.setNombre(reporteEquipos.getNombre());
        equipo.setLab(reporteEquipos.getLab());
        equipo.setEquipo(reporteEquipos.getEquipo());
        equipo.setMateria(reporteEquipos.getMateria());
        equipo.setIncidencia(reporteEquipos.getIncidencia());

        equipo.setHora(LocalTime.now());
        equipo.setFecha(LocalDate.now());
        equipo.setHis((byte) 0);

        return repository.save(equipo);
    }

    public ReporteEquipos updateEquipos(Long id, ReporteEquipos reporteEquipos){
        return repository.findById(id)
                .map(equipos -> {

                    equipos.setNombre(reporteEquipos.getNombre());
                    equipos.setLab(reporteEquipos.getLab());
                    equipos.setEquipo(reporteEquipos.getEquipo());
                    equipos.setMateria(reporteEquipos.getMateria());
                    equipos.setIncidencia(reporteEquipos.getIncidencia());


                    return repository.save(equipos);
                })
                .orElseThrow(() -> new RuntimeException("Reporte de equipo no encontrado con el ID: " + id));

    }

    public void delEquipos(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Elemento con el ID: " + id + " no encontrado");
        }
        repository.deleteById(id);

    }

    public List<ReporteEquipos> getEquiposHistorial(){
        return repository.findByHis((byte) 1);
    }

    public ReporteEquipos updateEquipoHis(Long id){
        return repository.findById(id)
                .map(equipo -> {
                    equipo.setHis((byte) 1);
                    return repository.save(equipo);
                })
                .orElseThrow(() -> new RuntimeException("Reporte de equipo no encontrado con el ID: " + id));
    }

}
