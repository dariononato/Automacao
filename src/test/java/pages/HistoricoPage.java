package pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistoricoPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public HistoricoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verificarHistoricoDoCliente() throws IOException {
		WebElement titulo = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
		String validandoCompra = titulo.getText();
		assertEquals("ORDER HISTORY", validandoCompra);
	}
	public void verificarPedido() throws IOException {
		WebElement validarItem = driver.findElement(By.xpath("//*[@id=\"order-list\"]/thead/tr/th[1]"));
		String validandoCompra = validarItem.getText();
		assertEquals("Order reference", validandoCompra);
		
	}
	public void verificarMensagem() throws IOException {
		WebElement mensagem = driver.findElement(By.xpath("//*[@id=\"block-history\"]/p"));
		String validandoMensagem = mensagem.getText();
		assertEquals("You have not placed any orders.", validandoMensagem);
		
	}
}