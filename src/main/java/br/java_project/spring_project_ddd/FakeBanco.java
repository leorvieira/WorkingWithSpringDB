package br.java_project.spring_project_ddd;

import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;

import java.util.ArrayList;
import java.util.List;

public final class FakeBanco {
		private static List<AlunoEntity> alunos = new ArrayList<AlunoEntity>();

		private FakeBanco() {
			alunos.add(new AlunoEntity());
		}

		private FakeBanco(AlunoEntity aluno) {
			alunos.add(aluno);
		}

		public static List<AlunoEntity> getAlunos() { return alunos; }

		public static void setAlunos(List<AlunoEntity> alunosList) {
			alunos = alunosList;
		}

		public static void setAluno(AlunoEntity aluno) { alunos.add(aluno); }
		};
