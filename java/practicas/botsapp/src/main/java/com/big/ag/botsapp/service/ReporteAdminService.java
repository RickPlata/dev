package com.big.ag.botsapp.service;

import com.big.ag.botsapp.entity.ReporteAdmin;
import com.big.ag.botsapp.repository.ReporteAdminRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReporteAdminService {

        private final ReporteAdminRepository repository;

        public ReporteAdminService(ReporteAdminRepository repository){
            this.repository = repository;
        }

        public List<ReporteAdmin> getAdmin(){
            return repository.findByHis((byte) 0);
        }

        public Optional<ReporteAdmin> getAdminById(Long id){
            return repository.findById(id);
        }

        public ReporteAdmin saveAdmin(ReporteAdmin reporteAdmin){
            ReporteAdmin admin = new ReporteAdmin();

            admin.setNombre(reporteAdmin.getNombre());
            admin.setLab(reporteAdmin.getLab());
            admin.setMateria(reporteAdmin.getMateria());
            admin.setIncidencia(reporteAdmin.getIncidencia());

            admin.setHora(LocalTime.now());
            admin.setFecha(LocalDate.now());
            admin.setHis((byte) 0);

            return repository.save(admin);
        }

        public ReporteAdmin updateAdmin(Long id, ReporteAdmin reporteAdmin){
            return repository.findById(id)
                    .map(admin -> {

                        admin.setNombre(reporteAdmin.getNombre());
                        admin.setLab(reporteAdmin.getLab());
                        admin.setMateria(reporteAdmin.getMateria());
                        admin.setIncidencia(reporteAdmin.getIncidencia());

                        return repository.save(admin);
                    })
                    .orElseThrow(() -> new RuntimeException("Reporte administrativo no encontrado con el ID: " + id));

        }

        public void delAdmin(Long id){
            if(!repository.existsById(id)){
                throw new RuntimeException("Elemento con el ID: " + id + " no encontrado");
            }
            repository.deleteById(id);

        }

        public List<ReporteAdmin> getAdminHistorial(){
            return repository.findByHis((byte) 1);
        }

        public ReporteAdmin updateAdminHis(Long id){
            return repository.findById(id)
                    .map(admin -> {
                        admin.setHis((byte) 1);
                        return repository.save(admin);
                    })
                    .orElseThrow(() -> new RuntimeException("Reporte administrativo no encontrado con el ID: " + id));
        }

}