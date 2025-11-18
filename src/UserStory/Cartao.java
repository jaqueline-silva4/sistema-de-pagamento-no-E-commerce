package UserStory;

import java.time.LocalDate;
import java.time.YearMonth;

public class Cartao extends Pagamentos {
	
	private String nomeTitular;
	private String numeroCartao;
	private YearMonth Validade;
	private int cvv;
	private int numeroParcelas;

	public Cartao(String nome, double valor, String descricao, LocalDate dataPagamento, String nomeTitular,
			String numeroCartao, YearMonth validade, int cvv, int numeroParcelas) {
		super(nome, valor, descricao, dataPagamento);
		
		setNomeTitular(nomeTitular);
		setNumeroCartao(numeroCartao);
		setDataValidade(validade);
		setCvv(cvv);
		setNumeroParcelas(numeroParcelas);
	}

	public String getNomeTitular() {
		return this.nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if(nomeTitular != null && !nomeTitular.isEmpty()) {
			this.nomeTitular = nomeTitular;
		} else {
			System.out.println("Nome do Titular inválido!");
		}
	}

	public String getNumeroCartao() {
		return this.numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		if(numeroCartao != null && !numeroCartao.matches("\\d{16}")) {
			this.numeroCartao = numeroCartao;
		} else {
			System.out.println("Número do cartão inválido!");
		}
	}

	public YearMonth getValidade() {
		return this.Validade;
	}

	public void setDataValidade(YearMonth validade) {
		if(validade != null && !validade.isBefore(YearMonth.now())) {
			this.Validade = validade;
		} else {
			System.out.println("Data de validade inválida!");
		}
	}

	public int getCvv() {
		return this.cvv;
	}

	public void setCvv(int cvv) {
		if(cvv > 0) {
			this.cvv = cvv;
		} else {
			System.out.println("CVV inválido!");
		}
	}

	public int getNumeroParcelas() {
		return this.numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		if(numeroParcelas > 0) {
			this.numeroParcelas = numeroParcelas;
		} else {
			System.out.println("Número de parcelas inválido!");
		}
	}
	
	public void processarPagamento() {
		System.out.println("[Tipo: Cartão de Crédito]\n");
		super.processarPagamento();
		
	}
	
	public String toString() {
		return "\n----- Detalhes do Cartão: -----" + "\n Nome do Titular: " + nomeTitular + "\n Número do cartão " + numeroCartao + "\n Data de validade: " + Validade +
				 "\n Número de parcelas: " + numeroParcelas;
	}
	
	@Override
	public void realizarPagamento() {
		System.out.println(toString());
		
	}
	
	
	
	
	
	

}
