package UserStory;

import java.time.LocalDate;

public class Pix extends Pagamentos {
	
	private String chavePix;
	private String banco;

	public Pix(String nome, double valor, String descricao, LocalDate dataPagamento, String chavePix, String banco) {
		super(nome, valor, descricao, dataPagamento);
		
		setChavePix(chavePix);
		setBanco(banco);
	}

	public String getChavePix() {
		return this.chavePix;
	}

	public void setChavePix(String chavePix) {
		if(chavePix != null && !chavePix.isEmpty()) {
			this.chavePix = chavePix;
		} else {
			System.out.println("Chave Pix inválida!");
		}
	}

	public String getBanco() {
		return this.banco;
	}

	public void setBanco(String banco) {
		if(banco != null && !banco.isEmpty()) {
			this.banco = banco;
		} else {
			System.out.println("Banco inválido!");
		}
	}
	
	public void processarPagamento() {
		System.out.println("[Tipo: Pix]\n");
		super.processarPagamento();
	}
	
	public String toString() {
		return "Chave Pix: " + chavePix + "\nBanco: " + banco;
		
	}
	
	@Override
	public void realizarPagamento() {
		System.out.println("\n---- Comprovante de Pagamento via pix ----");
		System.out.println(toString());
		
	}
	
	
	
	
	
	
	
	
	

}
