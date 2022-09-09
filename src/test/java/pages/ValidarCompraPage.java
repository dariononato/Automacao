package pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import suporte.printScreen;
import suporte.screenshot;

public class ValidarCompraPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public ValidarCompraPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validacaoCompra() throws IOException {
		WebElement pageheading = driver.findElement(By.className("page-heading"));
		String validandoCompra = pageheading.getText();
		assertEquals("ORDER CONFIRMATION", validandoCompra);
		
		String screenshotArquivo19 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo19);

	}
}
