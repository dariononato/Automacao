package suporte;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void tirar(WebDriver driver, String arquivo) throws IOException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileHandler.copy(screenshot, new File(arquivo));
		} catch(Exception e) {
			System.out.println("Erro no momento de capturar" + e.getMessage());
			
		}
	}
 
}