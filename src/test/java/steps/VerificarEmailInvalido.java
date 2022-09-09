package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.ValidarEmailPage;
import runner.ExecutorCucumberTest;

public class VerificarEmailInvalido extends ExecutorCucumberTest{
	HomePage homePage = new HomePage(driver);
	ValidarEmailPage validarEmailPage = new ValidarEmailPage(driver);
	
	@Dado("^que eu esteja no site automation$")
	public void que_eu_esteja_no_site_automation() throws Throwable {
		homePage.acessarPaginaHome();
		
	}

	@Quando("^clico no botao Entrar da pagina Home$")
	public void clico_no_botao_Entrar_da_pagina_Home() throws Throwable {
		homePage.clicarNoBotaoEntrar();
	}

	@Quando("^em seguida preencho o campo Endereco de email invalido$")
	public void em_seguida_preencho_o_campo_Endereco_de_email_invalido() throws Throwable {
		validarEmailPage.preecherEmailInvalido();
	}

	@Quando("^Clico no botao para avancar$")
	public void clico_no_botao_para_avancar() throws Throwable {
		validarEmailPage.clicarBotaoCrieSuaConta();
	}

	@Entao("^o sistema apresenta a mensagem Invalid email address\\.$")
	public void o_sistema_apresenta_a_mensagem_Invalid_email_address() throws Throwable {
		validarEmailPage.mensagemEmailInvalido();
	}

}
