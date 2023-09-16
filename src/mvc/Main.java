package mvc;

import mvc.model.Aluno;
import mvc.model.dao.AlunoDAO;

public class Main {

	public static void main(String[] args) {

		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno aluno = new Aluno();
		aluno.setNomeAluno("Pedro");
		aluno.setnotaUm(10);
		aluno.setnotaDois(8);
		aluno.setnotaTres(9);
		
		alunoDAO.save(aluno);

	}

}
