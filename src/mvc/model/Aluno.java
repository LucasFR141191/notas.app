package mvc.model;

public class Aluno {
	private int codigo;
	private String nomeAluno;
	private int notaUm;
	private int notaDois;
	private int notaTres;

	public Aluno(int codigo, String nomeAluno, int notaUm, int notaDois, int notaTres) {
		super();
		this.codigo = codigo;
		this.nomeAluno = nomeAluno;
		this.notaUm = notaUm;
		this.notaDois = notaDois;
		this.notaTres = notaTres;
	}

	public Aluno() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getnotaUm() {
		return notaUm;
	}

	public void setnotaUm(int notaUm) {
		this.notaUm = notaUm;
	}

	public int getnotaDois() {
		return notaDois;
	}

	public void setnotaDois(int notaDois) {
		this.notaDois = notaDois;
	}

	public int getnotaTres() {
		return notaTres;
	}

	public void setnotaTres(int notaTres) {
		this.notaTres = notaTres;
	}

	@Override
	public String toString() {
		return this.nomeAluno;
	}
	
}
