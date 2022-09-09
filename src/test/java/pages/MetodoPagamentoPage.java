package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.printScreen;
import suporte.screenshot;

public class MetodoPagamentoPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public MetodoPagamentoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void escolherPagamento() throws IOException {
		driver.findElement(By.xpath("//a[@class='bankwire']//span")).click();//// a[@class='bankwire']//span
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo17 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo17);
	}

	public void finalizarCompra() throws IOException {
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo18 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo18);
	}
}
