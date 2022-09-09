package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HistoricoPage;
import pages.LoginPage;
import pages.UsuarioPage;
import runner.ExecutorCucumberTest;


public class VerificarHistorico extends ExecutorCucumberTest {
	LoginPage loginPage = new LoginPage(driver);
	UsuarioPage usuarioPage = new UsuarioPage(driver);
	HistoricoPage historicoPage = new HistoricoPage(driver);

	@Dado("^que eu esteja logado com usuario que possua historico de compra$")
	public void que_eu_esteja_logado_com_usuario_que_possua_historico_de_compra() throws Throwable {
		loginPage.acessarPaginaDeLogin();
	}

	@Quando("^eu clico em Historico de pedidos e detalhes$")
	public void eu_clico_em_Historico_de_pedidos_e_detalhes() throws Throwable {
		usuarioPage.clicarBotaoHistorico();
	}

	@Entao("^encontro a lista todo o historico da compra realizada\\.$")
	public void encontro_a_lista_todo_o_historico_da_compra_realizada() throws Throwable {
		historicoPage.verificarHistoricoDoCliente();
		historicoPage.verificarPedido();
	}

}
