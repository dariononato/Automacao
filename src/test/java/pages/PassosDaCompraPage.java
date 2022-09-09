package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.printScreen;
import suporte.screenshot;

public class PassosDaCompraPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public PassosDaCompraPage(WebDriver driver) {
		this.driver = driver;
	}

	public void resumoCompra() throws IOException {
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span"))
				.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo14 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo14);
	}

	public void entrarNaCompra() throws IOException {
		driver.findElement(By.name("processAddress")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo15 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo15);
	}

	public void endereçoCliente() throws IOException {
		driver.findElement(By.id("cgv")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.findElement(By.name("processCarrier")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo16 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo16);
	}

}
