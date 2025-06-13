package com.ControlEscolar.ControlEscolar.contollers;

import com.ControlEscolar.ControlEscolar.model.Estudiante;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/estudante")

public class EstudianteController {

    private List<Estudiante> estudiantes = new ArrayList<>(Arrays.asList(
            new Estudiante(1, "Laura Garcia", "laura.g@gmail.com", 21, "Ciencias de la Computacion"),
            new Estudiante(2, "Carlos Fernandez", "carlos.f@gmail.com", 23, "Ingenieria Mecanica"),
            new Estudiante(3, "Ana Martinez", "Ana.m@gmail.com", 22, "Administracion de Empresas"),
            new Estudiante(4, "Miguel Lopez", "miguel.l@gmail.com", 224, "Ingenieria Electrica")
    ));

    @GetMapping
    public List<Estudiante> getEstudiantes() {return estudiantes;}

    @GetMapping("/{email}")
    public Estudiante getEstudiante(@PathVariable String email){
        for(Estudiante e : estudiantes){
            if(e.getEmail().equalsIgnoreCase(email)){
                return e;
            }
        }
        return null;
    }

    @PostMapping
    public Estudiante posEstudiante(@RequestBody Estudiante estudiante){
       estudiantes.add(estudiante);
       return estudiante;
    }

    @PutMapping
    public Estudiante putEstudiante(@RequestBody Estudiante estudiante){
        for(Estudiante e : estudiantes){
            if(e.getId() == estudiante.getId()){
                e.setAge(estudiante.getAge());
                e.setCoursem(estudiante.getCoursem());
                e.setEmail(estudiante.getEmail());
                e.setName(estudiante.getName());
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Estudiante deleteEstudiante(@PathVariable int id){
        for(Estudiante e : estudiantes){
            if(e.getId() == id){
                estudiantes.remove(e);

                return e;
            }
        }
        return null;
    }

    @PatchMapping
    public Estudiante patchEstudiante(@RequestBody Estudiante estudiante){
        for(Estudiante e : estudiantes){
            if(e.getId() == estudiante.getId()){
                if(estudiante.getAge() != null) {
                    e.setAge(estudiante.getAge());
                }
                if(estudiante.getEmail() != null) {
                    e.setEmail(estudiante.getEmail());
                }
                if(estudiante.getCoursem() != null) {
                    e.setCoursem(estudiante.getCoursem());
                }
                if(estudiante.getName() != null) {
                    e.setName(estudiante.getName());
                }
            }
            return e;
        }
        return null;
    }


}
