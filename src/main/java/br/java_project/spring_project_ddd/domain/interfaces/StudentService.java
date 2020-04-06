package br.java_project.spring_project_ddd.domain.interfaces;

import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;

import java.util.List;

public interface StudentService {
    List<AlunoDTO> find();

    AlunoDTO findByOne(int id);

    AlunoDTO postStudent(AlunoDTO aluno);

    Void postStudents(List<AlunoDTO> alunos);
}
