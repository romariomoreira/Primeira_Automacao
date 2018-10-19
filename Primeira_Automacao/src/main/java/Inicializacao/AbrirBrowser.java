package Inicializacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirBrowser {

	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		
		// Abaixo como é usado para passar o endereço da pasta onde está o navegador, caso esteja em pasta diferente do projeto.
		//System.setProperty("Chromedriver", "C:/Users/romar/git/repository/Primeira_Automacao/chromedriver.exe");
		
		//Abaixo como é usado para passar o navegador quando estiver na mesma pasta do Projeto. 
		System.setProperty("Chromedriver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		
		driver.close();
				
		
		

	}

}
