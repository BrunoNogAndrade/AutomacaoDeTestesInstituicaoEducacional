package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisciplinasPage extends BasePage {

	public DisciplinasPage(WebDriver driver) {
		super(driver);
	}

	public DisciplinasPage selecionaCienciaDaComputacao() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.row.groups-wrapper > div > div:nth-child(2) > ul > li:nth-child(3)")).click();
	return this;
	}
}
