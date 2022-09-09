# language: pt

Funcionalidade: Verificar o Historico de Compras

			Eu Como cliente
			quero validar o Historico de compras
			para validar os itens adquiridos
			

@historico-compra
Cenario: Varificar Historico de compras

			Dado que eu esteja logado com usuario que possua historico de compra
			Quando eu clico em Historico de pedidos e detalhes 
			Entao encontro a lista todo o historico da compra realizada.		
			
@historico-Sem-Compra
Cenario: Varificar Historico de compras

			Dado que eu esteja logado com usuario que nao possua historico de compra
			Quando eu clico em Historico de pedidos 
			Entao o sistema apresenta a mensagem You have not placed any orders		