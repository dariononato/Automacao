package pages;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import suporte.printScreen;
import suporte.screenshot;

public class FormularioPage {
	@Rule
	public TestName test = new TestName();
	WebDriver driver;

	public FormularioPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void camposObrigatorios() throws IOException {
		driver.findElement(By.id("id_gender1")).click();
		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		driver.findElement(By.id("customer_firstname")).sendKeys("JoãoCorinthins");
		driver.findElement(By.id("customer_lastname")).sendKeys("CarlosCorinthians");
		driver.findElement(By.id("passwd")).sendKeys("1234567890");
		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		
		String screenshotArquivo5 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo5);
		
		//Data de nascimento Dia
		Select dia = new Select (driver.findElement(By.id("days")));
		dia.selectByValue("21");
		//Data de nascimento Mes
		Select mes = new Select (driver.findElement(By.id("months")));
		mes.selectByValue("1");		
		//Data de nascimento Ano
		Select ano = new Select (driver.findElement(By.id("years")));
		ano.selectByValue("1988");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		String screenshotArquivo6 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo6);
		
		//Endereço
		driver.findElement(By.id("company")).sendKeys("NTTDATA");
		driver.findElement(By.id("address1")).sendKeys("Rua Amaralina");
		driver.findElement(By.id("address2")).sendKeys("Rua Pereque");
		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		driver.findElement(By.id("city")).sendKeys("São Paulo");
		Select estado = new Select (driver.findElement(By.id("id_state")));
		estado.selectByValue("1");
		
		String screenshotArquivo7 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo7);
		
		driver.findElement(By.id("postcode")).sendKeys("12345");//00000
		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		Select pais = new Select (driver.findElement(By.id("id_state")));
		pais.selectByValue("1");
		
		driver.findElement(By.id("other")).sendKeys("testeNTTDATA");
		driver.findElement(By.id("phone")).sendKeys("1142061518");
		driver.findElement(By.id("phone_mobile")).sendKeys("(347) 466-7432");
		driver.findElement(By.id("alias")).sendKeys("ondrej6239@uorak.com");
		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		String screenshotArquivo8 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo8);
	}
	public void botaoRegistro() throws IOException {
		

		driver.findElement(By.id("submitAccount")).click();

		 try {
		    	Thread.sleep(2000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    	
		    }
		String screenshotArquivo9 = "C:\\Users\\dnonatos\\OneDrive - everis\\Escritorio\\Projetos\\MultiAtendimento\\Tchau Multi\\selenium"
				+ printScreen.evidencia() + test.getMethodName() + ".png";
		screenshot.tirar(driver, screenshotArquivo9);
	}
}
