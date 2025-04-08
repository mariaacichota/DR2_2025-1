package com.infnet.DR2_AT;

import com.infnet.DR2_AT.CodigoLegado.Pedido;
import com.infnet.DR2_AT.controller.PedidoController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		//Teste do código legado
		System.out.println("\n----CÓDIGO LEGADO----");
		Pedido pedido = new Pedido();
		pedido.endereco = "Avenida das Bromélias, 456";
		pedido.peso = 12.0;
		pedido.tipoFrete = "ECO";
		pedido.destinatario = "Maria Cichota";

		pedido.aplicarFretePromocional();

		System.out.println("=== ETIQUETA ===");
		System.out.println(pedido.gerarEtiqueta());

		System.out.println("\n=== RESUMO ===");
		System.out.println(pedido.gerarResumoPedido());

		if (pedido.isFreteGratis()) {
			System.out.println("\nFrete GRÁTIS aplicado!");
		} else {
			System.out.println("\nFrete normal.");
		}

		//Teste do código refatorado
		System.out.println("\n----CÓDIGO REFATORADO----");
		PedidoController controller = new PedidoController();

		String endereco = "Rua das Flores, 123";
		double peso = 8.5;
		String tipoFrete = "EXP";
		String destinatario = "Maria Cichota";

		controller.processarPedido(endereco, peso, tipoFrete, destinatario);
	}

}
