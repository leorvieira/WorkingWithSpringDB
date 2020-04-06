package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.FakeBanco;
import br.java_project.spring_project_ddd.domain.interfaces.StudentService;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService {

    @Override
    public List<AlunoDTO> find() {
        // toDo -> Chamar repository
        List<AlunoDTO> alunos = new ArrayList<AlunoDTO>();
        FakeBanco.getAlunos().forEach(a -> alunos.add(new AlunoDTO(a)));
        return alunos;
    }

    @Override
    public AlunoDTO findByOne(int id) {
        // toDo -> Chamar repository
        Stream<AlunoEntity> alunoEntity = 
            FakeBanco.getAlunos().stream().filter(a -> a.getMatricula() == id);
        return new AlunoDTO(alunoEntity.collect(Collectors.toList()).get(0));
    }

    @Override
    public AlunoDTO postStudent(AlunoDTO aluno) {
        // toDo -> Chamar repository
        AlunoEntity alunoEntity = new AlunoEntity(aluno);
        FakeBanco.setAluno(alunoEntity);
        return aluno;
    }

    @Override
    public Void postStudents(List<AlunoDTO> alunos) {
        // toDo -> Chamar repository
        alunos.forEach(aluno -> {
            AlunoEntity alunoEntity = new AlunoEntity(aluno);
            FakeBanco.setAluno(alunoEntity);

        });
        return null;
    }
}
