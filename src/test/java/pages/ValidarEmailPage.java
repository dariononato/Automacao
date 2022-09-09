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

public class ValidarEmailPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public ValidarEmailPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preecherEmail() throws IOException {

		driver.findElement(By.id("email_create")).sendKeys("dario10@teste.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo3 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo3);
	}

	public void preecherEmailInvalido() throws IOException {

		driver.findElement(By.id("email_create")).sendKeys("bloblobloblo");
	}
	public void preecherEmailExistente() throws IOException {

		driver.findElement(By.id("email_create")).sendKeys("dario@teste.com");
	}

	public void clicarBotaoCrieSuaConta() throws IOException {

		driver.findElement(By.id("SubmitCreate")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo4 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo4);
	}

	public void mensagemEmailInvalido() throws IOException {
		WebElement emailinvalido = driver.findElement(By.id("create_account_error"));
		String validandoMensagemInvalido = emailinvalido.getText();
		assertEquals("Invalid email address.", validandoMensagemInvalido); //Invalid email address.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

	public void mensagemEmailExistente() throws IOException {
		WebElement emailexistente = driver.findElement(By.id("create_account_error"));
		String validandoMensagemExistente = emailexistente.getText();
		assertEquals(
				"An account using this email address has already been registered. Please enter a valid password or request a new one.",
				validandoMensagemExistente);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}
