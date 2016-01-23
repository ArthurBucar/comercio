package br.com.javaparaweb.comercio.entidades;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "empregado")

public class Empregado  implements Serializable{

	private static final long serialVersionUID = -2417223544507074940L;
	@Id
	@GeneratedValue
	@Column(name = "cod_empregado")
	private Integer empregado;
	
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "cad_chefe")
	private Empregado chefe;

	public Integer getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Integer empregado) {
		this.empregado = empregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empregado getChefe() {
		return chefe;
	}

	public void setChefe(Empregado chefe) {
		this.chefe = chefe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
