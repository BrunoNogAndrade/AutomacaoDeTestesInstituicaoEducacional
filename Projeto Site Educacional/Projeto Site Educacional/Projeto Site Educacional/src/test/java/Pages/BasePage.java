package Pages;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void waitFindElement(By elemento) {
		WebDriverWait aguardar = new WebDriverWait(driver, 30);
		aguardar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	}

	public WebElement aguardaCarregarElemento(By elemento) {
		waitFindElement(elemento);
	return this.driver.findElement(elemento);
	}

	// Instanciação de biblioteca para ações JS (Scroll lock utilizado no teste)
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public BasePage scrollMouse(String valorInicial, String valorFinal){
		js.executeScript("window.scrollBy" + valorInicial + "," + valorFinal + ")");
		//js.executeScript("window.scrollBy(0,1200)");
		return this;
	}
}
