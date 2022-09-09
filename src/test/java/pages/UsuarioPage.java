package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.printScreen;
import suporte.screenshot;

public class UsuarioPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public UsuarioPage(WebDriver driver) {
		this.driver = driver;
	}

	public void realizarBuscarNaUsuarioHome() throws IOException {
		// driver.findElement(By.id("search_query_top")).sendKeys("t-shirts");
		// driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click(); //// li[@class='']//a[@title='T-shirts']
		driver.findElement(By.xpath("//div[@class='product-container']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		String screenshotArquivo12 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo12);
	}

	public void clicarBotaoHistorico() throws IOException {
		driver.findElement(By.xpath("//i[@class=\"icon-list-ol\"]")).click();
	}
}
