# language: pt

Funcionalidade: Realizar uma Compra

	Eu como cliente
	quero Comprar um produto 
	para usufruir dele

@comprar-produto
Cenario: Realizar uma Compra
	Dado que eu esteja logado
	Quando realizo uma busca pelo item t-shirts;
	E Adiciono este item carrinho
	E Prossigo com a compra ate o metodo de pagamento;
	E Seleciono o metodo de pagamento via Banco.
	Entao A compra eh realizada com sucesso e o detalhe da compra deve ser exibido em tela