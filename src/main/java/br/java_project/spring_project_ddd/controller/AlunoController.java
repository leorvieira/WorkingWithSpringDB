package br.java_project.spring_project_ddd.controller;

import br.java_project.spring_project_ddd.domain.interfaces.StudentService;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    private final StudentService studentService;

    public AlunoController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<AlunoDTO> get() {

        return studentService.find();

    }

    @GetMapping("{id}")
    public AlunoDTO getById(@PathVariable int id) {

        return studentService.findByOne(id);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoDTO postStudent(@RequestBody AlunoDTO aluno) {

        return studentService.postStudent(aluno);

    }

}