package UserStory;

import java.time.LocalDate;

public class Boleto extends Pagamentos {
	
	private String codigoBarras;
	private LocalDate dataVencimento;
	
	public Boleto(String nome, double valor, String descricao, LocalDate dataPagamento, String codigoBarras,
			LocalDate dataVencimento) {
		super(nome, valor, descricao, dataPagamento);
		
		setCodigoBarras(codigoBarras);
		setDataVencimento(dataVencimento);
	}

	public String getCodigoBarras() {
		return this.codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		if(codigoBarras != null && !codigoBarras.isEmpty()) {
			this.codigoBarras = codigoBarras;
		} else {
			System.out.println("Código de barras inválido!");
		}
	}

	public LocalDate getDataVencimento() {
		return this.dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		if(dataVencimento != null && !dataVencimento.isBefore(LocalDate.now())) {
			this.dataVencimento = dataVencimento;
		} else {
			System.out.println("Data de vencimento vencida!");
		}
	}
	
	
	public void processarPagamento() {
		System.out.println("[Tipo: Boleto]\n");
		super.processarPagamento();

	}
	
	@Override
	public void realizarPagamento() {
		System.out.println("Data de vencimento: " + dataVencimento);
	}
	
	
	
	

}
