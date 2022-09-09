package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.ValidarEmailPage;
import runner.ExecutorCucumberTest;

public class VerificarEmailExistente extends ExecutorCucumberTest {

	HomePage homePage = new HomePage(driver);
	ValidarEmailPage validarEmailPage = new ValidarEmailPage(driver);

	@Dado("^que eu esteja no site$")
	public void que_eu_esteja_no_site() throws Throwable {
		homePage.acessarPaginaHome();
	}

	@Quando("^clico no botao Entrar na pagina Home$")
	public void clico_no_botao_Entrar_na_pagina_Home() throws Throwable {
		homePage.clicarNoBotaoEntrar();
	}

	@Quando("^preencho o campo Endereco de email ja cadastrado$")
	public void preencho_o_campo_Endereco_de_email_ja_cadastrado() throws Throwable {
		validarEmailPage.preecherEmailExistente();
	}

	@Quando("^Clico no botao para seguir com o cadastro$")
	public void clico_no_botao_para_seguir_com_o_cadastro() throws Throwable {
		validarEmailPage.clicarBotaoCrieSuaConta();
	}

	@Entao("^o sistema apresenta a mensagem An account using this email address has already been registered\\. Please enter a valid password or request a new one\\.$")
	public void o_sistema_apresenta_a_mensagem_An_account_using_this_email_address_has_already_been_registered_Please_enter_a_valid_password_or_request_a_new_one()
			throws Throwable {
		validarEmailPage.mensagemEmailExistente();
	}

}
