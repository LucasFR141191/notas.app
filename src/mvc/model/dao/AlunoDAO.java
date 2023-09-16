package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mvc.model.Aluno;
import mvc.model.dao.Connect.ConnectionFactory;

public class AlunoDAO {

	public void save(Aluno aluno) {
		String sql = "INSERT INTO AlunoDAO ( nomeAluno,notaUm,notaDois,notaTres) VALUES (?,?,?,?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			statement.setString(1, aluno.getNomeAluno());
			statement.setInt(2, aluno.getnotaUm());
			statement.setInt(3, aluno.getnotaDois());
			statement.setInt(4, aluno.getnotaTres());

			statement.execute();
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar a tarefa", e);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}

	}

	public void update(Aluno aluno) {
		String sql = "UPDATE aluno SET nomeAluno = ?, notaUm = ?, notaDois = ?, notaTres = ? where codigo = ?";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();

			statement = connection.prepareStatement(sql);

			statement.setString(1, aluno.getNomeAluno());
			statement.setInt(2, aluno.getnotaUm());
			statement.setInt(3, aluno.getnotaDois());
			statement.setInt(4, aluno.getnotaTres());
			statement.setInt(5, aluno.getCodigo());

			statement.execute();
		} catch (SQLException e) {
			throw new RuntimeException("erro ao atualizar o projeto.", e);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}
}
