package UserStory;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();
		
		listaPagamentos.add(new Cartao("Jaqueline", 400.0, "Compra fone de ouvido", LocalDate.now(), "Jaqueline Miranda", "123456789012", YearMonth.of(2029, 9), 135, 5));
		
		listaPagamentos.add(new Pix("Gabriel Silva", 50.0, "Transferência", LocalDate.now(), "jaqueline.silva@gmail.com", "Nubank"));
		
		listaPagamentos.add(new Boleto("Ana Vitória", 130.0, "Conta de Luz", LocalDate.now(), "2345678935", LocalDate.of(2025, 11, 20)));
		
		System.out.println("=== Lista de Pagamentos ===");
		
		for(Pagamentos p : listaPagamentos) {
			System.out.println("\n>>> Pagamento de: " + p.getNome());
			
			p.confirmarPagamento();
			p.processarPagamento();
			
			System.out.println("-------------------------------------------------------");
		}
		
		
	}


}
