package runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //Mostrando o tipo de Classe que será utilizada
@CucumberOptions(
		plugin = {}, //Report de Testes
		features = "src/test/resources/features", // o Caminho que está
		tags = {"@historico-compra"}, // Para rodar um cenário especifico  ~@ignore
		glue = {"steps"} // Aonde está os Steps		
)

public class ExecutorCucumberTest {
	public static WebDriver driver;
	@Rule
	public TestName test = new TestName();

	@BeforeClass
	public static void start () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dnonatos\\eclipse-workspace\\AtividadeNTT\\UserInterface\\Versão105Chrome.exe");
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		Thread.sleep(500);
	}
	@AfterClass
	public static void atop () {
		driver.quit();
		
	}
}
