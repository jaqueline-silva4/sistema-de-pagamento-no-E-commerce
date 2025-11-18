package UserStory;

import java.time.LocalDate;

public abstract class Pagamentos {
	
	protected String nome;
	protected double valor;
	protected String descricao;
	protected LocalDate dataPagamento;
	protected boolean status;
	
	public Pagamentos(String nome, double valor, String descricao, LocalDate dataPagamento) {
		
		setNome(nome);
		setValor(valor);
		setDescricao(descricao);
		this.dataPagamento = dataPagamento;
		this.status = false;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido!");
		}
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		} else {
			System.out.println("Valor deve ser positivo!");
		}
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao != null && !descricao.isEmpty()) {
			this.descricao = descricao;
		} else {
			System.out.println("Descrição inválida!");
		}
	}

	public LocalDate getDataPagamento() {
		return this.dataPagamento;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void confirmarPagamento() {
		this.status = true;
		this.dataPagamento = LocalDate.now();
	}
	
	public void processarPagamento() {
		System.out.println("Valor: " + valor);
		System.out.println("Descrição: " + descricao);
		
		realizarPagamento();
		
		if(this.status) {
			System.out.println("\nPagamento confirmado!");
			System.out.println("Data de pagamento: " + dataPagamento);
			
		} else {
			System.out.println("Pagamento não realizado!");
			
		}
	}

	public abstract void realizarPagamento(); 
	
	
	
	
	
	
	
	
	
	

}
