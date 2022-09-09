package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.printScreen;
import suporte.screenshot;

public class LoginPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarPaginaDeLogin() throws IOException {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("dario10@teste.com");//dario10@teste.com Tem Histórico de compra
		driver.findElement(By.id("passwd")).sendKeys("1234567890");
		driver.findElement(By.id("SubmitLogin")).click();
		try {
	    	Thread.sleep(2000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    	
	    }
		String screenshotArquivo11 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo11);
	}
}
