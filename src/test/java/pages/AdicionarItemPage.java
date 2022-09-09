package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.printScreen;
import suporte.screenshot;

public class AdicionarItemPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public AdicionarItemPage(WebDriver driver) {
		this.driver = driver;
	}

	public void adicionarItem() throws IOException {
		driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']//span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo13 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo13);
	}
}
