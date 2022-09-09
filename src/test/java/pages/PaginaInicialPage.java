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

public class PaginaInicialPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public PaginaInicialPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validarLogin() throws IOException {
		WebElement header_user_info = driver.findElement(By.className("header_user_info"));
		String nomeDoUsuario = header_user_info.getText();
		assertEquals("JoãoCorinthins CarlosCorinthians", nomeDoUsuario);

		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		String screenshotArquivo10 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo10);
	}
}
