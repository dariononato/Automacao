package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.AdicionarItemPage;
import pages.LoginPage;
import pages.MetodoPagamentoPage;
import pages.PassosDaCompraPage;
import pages.UsuarioPage;
import pages.ValidarCompraPage;

import runner.ExecutorCucumberTest;

public class RealizarCompra extends ExecutorCucumberTest {
	LoginPage loginPage = new LoginPage(driver);
	UsuarioPage usuarioPage = new UsuarioPage(driver);
	AdicionarItemPage adicionarItemPage = new AdicionarItemPage(driver);
	PassosDaCompraPage passosDaCompraPage = new PassosDaCompraPage(driver);
	MetodoPagamentoPage metodoPagamentoPage = new MetodoPagamentoPage(driver);
	ValidarCompraPage validarCompraPage = new ValidarCompraPage(driver);

	@Dado("^que eu esteja logado$")
	public void que_eu_esteja_logado() throws Throwable {
		loginPage.acessarPaginaDeLogin();
	}

	@Quando("^realizo uma busca pelo item t-shirts;$")
	public void realizo_uma_busca_pelo_item_t_shirts() throws Throwable {
		usuarioPage.realizarBuscarNaUsuarioHome();

	}

	@Quando("^Adiciono este item carrinho$")
	public void adiciono_este_item_carrinho() throws Throwable {
		adicionarItemPage.adicionarItem();
	}

	@Quando("^Prossigo com a compra ate o metodo de pagamento;$")
	public void prossigo_com_a_compra_at_o_metodo_de_pagamento() throws Throwable {
		passosDaCompraPage.resumoCompra();
		passosDaCompraPage.entrarNaCompra();
		passosDaCompraPage.endereçoCliente();

	}

	@Quando("^Seleciono o metodo de pagamento via Banco\\.$")
	public void seleciono_o_metodo_de_pagamento_via_Banco() throws Throwable {
		metodoPagamentoPage.escolherPagamento();
		metodoPagamentoPage.finalizarCompra();
	}

	@Entao("^A compra eh realizada com sucesso e o detalhe da compra deve ser exibido em tela$")
	public void a_compra_eh_realizada_com_sucesso_e_o_detalhe_da_compra_deve_ser_exibido_em_tela() throws Throwable {
		validarCompraPage.validacaoCompra();
	}
}
