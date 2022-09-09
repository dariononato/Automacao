package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.printScreen;
import suporte.screenshot;

public class HomePage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarPaginaHome() throws IOException {
		  driver.get("http://automationpractice.com/index.php");
		    try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		    String screenshotArquivo1 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
					+ printScreen.evidencia() + test.getMethodName() + ".png";
			screenshot.tirar(driver, screenshotArquivo1);
	}
			
	public void clicarNoBotaoEntrar() throws IOException {
			
			driver.findElement(By.className("login")).click();
			 try {
			    	Thread.sleep(2000);
			    }catch(InterruptedException e) {
			    	e.printStackTrace();
			    	
			    }
			String screenshotArquivo2 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
					+ printScreen.evidencia() + test.getMethodName() + ".png";
			screenshot.tirar(driver, screenshotArquivo2);
		
	}
}
