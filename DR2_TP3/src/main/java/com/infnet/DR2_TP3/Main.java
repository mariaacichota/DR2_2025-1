package com.infnet.DR2_TP3;

import com.infnet.DR2_TP3.controller.PedidoController;
import com.infnet.DR2_TP3.controller.RegistroController;
import com.infnet.DR2_TP3.model.Item;
import com.infnet.DR2_TP3.model.Pedido;
import com.infnet.DR2_TP3.model.Registro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		Item item1 = new Item("SKU123", 2, 50.0);
		Item item2 = new Item("SKU456", 1, 30.0);

		List<Item> itens = Arrays.asList(item1, item2);
		PedidoController pedidoController = new PedidoController();

		Pedido pedido = pedidoController.criarPedido("PED000001", itens, 10, 5, Pedido.StatusPedido.CONCLUIDO); // Desconto de 10%, Frete de 5
		System.out.println("Pedido Criado:");
		pedidoController.exibirInformacoesPedido(pedido);

		Item item3 = new Item("SKU789", 3, 20.0);
		Pedido pedidoComItemAdicionado = pedidoController.adicionarItem(pedido, item3);
		System.out.println("\nPedido Após Adicionar Item:");
		pedidoController.exibirInformacoesPedido(pedidoComItemAdicionado);

		Pedido pedidoComItemRemovido = pedidoController.removerItem(pedidoComItemAdicionado, item2);
		System.out.println("\nPedido Após Remover Item:");
		pedidoController.exibirInformacoesPedido(pedidoComItemRemovido);


		Pedido pedidoComDescontoAlterado = pedidoController.aplicarDesconto(pedidoComItemRemovido, 15); // Novo desconto de 15%
		System.out.println("\nNovo Pedido com Desconto Alterado:");
		pedidoController.exibirInformacoesPedido(pedidoComDescontoAlterado);

		Pedido pedidoComFreteAlterado = pedidoController.alterarFrete(pedidoComDescontoAlterado, 10); // Novo frete de 10
		System.out.println("\nNovo Pedido com Frete Alterado:");
		pedidoController.exibirInformacoesPedido(pedidoComFreteAlterado);

		Pedido pedidoConcluido = pedidoController.atualizarStatusPedido(pedidoComFreteAlterado, Pedido.StatusPedido.CONCLUIDO); // Novo frete de 10
		System.out.println("\nNovo Pedido com Status Alterado:");
		pedidoController.exibirInformacoesPedido(pedidoConcluido);

		RegistroController registroController = new RegistroController();
		Registro registro = new Registro("R001", BigDecimal.valueOf(500.00), LocalDateTime.now(), Registro.StatusRegistro.PENDENTE);
		registroController.exibirInformacoesRegistro(registro);

		Registro registroComDesconto = registroController.aplicarDesconto(registro, BigDecimal.valueOf(10));
		System.out.println("\nRegistro com Desconto Alterado:");
		registroController.exibirInformacoesRegistro(registroComDesconto);

		Registro registroAprovado = registroController.atualizarStatus(registro, Registro.StatusRegistro.APROVADO);
		System.out.println("\nRegistro com Status Alterado:");
		registroController.exibirInformacoesRegistro(registroAprovado);
	}
}
