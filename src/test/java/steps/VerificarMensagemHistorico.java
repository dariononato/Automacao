package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HistoricoPage;
import pages.LoginPage;
import pages.UsuarioPage;
import runner.ExecutorCucumberTest;

public class VerificarMensagemHistorico extends ExecutorCucumberTest{
	LoginPage loginPage = new LoginPage(driver);
	UsuarioPage usuarioPage = new UsuarioPage(driver);
	HistoricoPage historicoPage = new HistoricoPage(driver);
	
	@Dado("^que eu esteja logado com usuario que nao possua historico de compra$")
	public void que_eu_esteja_logado_com_usuario_que_nao_possua_historico_de_compra() throws Throwable {
		loginPage.acessarPaginaDeLogin();
	}

	@Quando("^eu clico em Historico de pedidos$")
	public void eu_clico_em_Historico_de_pedidos() throws Throwable {
		usuarioPage.clicarBotaoHistorico();
	}

	@Entao("^o sistema apresenta a mensagem You have not placed any orders$")
	public void o_sistema_apresenta_a_mensagem_You_have_not_placed_any_orders() throws Throwable {
		historicoPage.verificarMensagem();
	}

}
