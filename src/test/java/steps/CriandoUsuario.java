package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.FormularioPage;
import pages.HomePage;
import pages.ValidarEmailPage;
import pages.PaginaInicialPage;
import runner.ExecutorCucumberTest;

public class CriandoUsuario extends ExecutorCucumberTest { // o Extends, nessa classe usa o que está na classe CriandoUsuario + o que tem na classe ExecutorCucumberTest 
		
	HomePage homePage = new HomePage(driver);
	ValidarEmailPage validarEmailPage = new ValidarEmailPage(driver);
	FormularioPage formularioPage = new FormularioPage(driver);
	PaginaInicialPage paginaInicialPage = new PaginaInicialPage(driver);
	
	@Dado("^que eu esteja no site automationpractice$")		
	public void que_eu_esteja_no_site_automationpractice() throws Throwable {
	  homePage.acessarPaginaHome();
	}

	@Quando("^clico no botao Entrar$")
	public void clico_no_botao_Entrar() throws Throwable {
		homePage.clicarNoBotaoEntrar();
	}

	@Quando("^em seguida preencho o campo Endereco de email com um E-mail Valido$")
	public void em_seguida_preencho_o_campo_Endereco_de_email_com_um_E_mail_Valido() throws Throwable {
		validarEmailPage.preecherEmail();
	}

	@Quando("^Clico no botao Crie a sua conta aqui$")
	public void clico_no_bot_o_Crie_a_sua_conta_aqui() throws Throwable {
		validarEmailPage.clicarBotaoCrieSuaConta();
	}

	@Quando("^Preencho os dados obrigatorios do formulario de cadastro$")
	public void preencho_os_dados_obrigatorios_do_formulario_de_cadastro() throws Throwable {
		formularioPage.camposObrigatorios();
		
	}

	@Quando("^apos preencher, clicar no botao Registro$")
	public void apos_preencher_clicar_no_botao_Registro() throws Throwable {
		formularioPage.botaoRegistro();
	}

	@Entao("^A conta deve ser criada/cadastrada com sucesso\\.$")
	public void a_conta_deve_ser_criada_cadastrada_com_sucesso() throws Throwable {
		paginaInicialPage.validarLogin();
	}

}
