package Inicializacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirBrowser {

	
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		System.setProperty("Chromedriver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		
				
		
		

	}

}
