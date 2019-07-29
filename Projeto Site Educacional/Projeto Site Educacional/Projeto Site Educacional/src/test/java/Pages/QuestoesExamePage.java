package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestoesExamePage extends BasePage {

	public QuestoesExamePage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Desce a p�gina um pouco at� o alcance do bot�o para adi��o da primeira
	// quest�o
	// Em seguida clica-se no bot�o para adi��o, o mesmo � feito para as
	// quest�es seguintes

	public QuestoesExamePage questao1() {
		js.executeScript("window.scrollBy(0,1200)");
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(1) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao2() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(2) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao3() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(3) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao4() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(4) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao5() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(5) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao6() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(6) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao7() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(7) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao8() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(8) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao9() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(9) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao10() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(10) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao11() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(11) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao12() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(12) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao13() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(13) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao14() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(14) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao15() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(15) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao16() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(16) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao17() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(17) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao18() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(18) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao19() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(19) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao20() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(20) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao21() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(21) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao22() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(22) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao23() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(23) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao24() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(24) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao25() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(25) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao26() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(26) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	public QuestoesExamePage questao27() {
		aguardaCarregarElemento(By.cssSelector(
				"#questions-list > div:nth-child(27) > div > div > div.question-box__actions-wrapper > div.btn.add-question"))
						.click();
		js.executeScript("window.scrollBy(0,1200)");
	return this;
	}

	// Clica no bot�o para voltar ao topo da p�gina
	public QuestoesExamePage botaoTopoPagina() {
		aguardaCarregarElemento(
				By.cssSelector("a[class='btn-floating btn-large back-to-top background-light-primary-color']")).click();
	return this;
	}

	// Avan�a para a pr�xima tela (Finalizar) clicando no bot�o PR�XIMO
	public QuestoesExamePage botaoProximaPagina() {
		aguardaCarregarElemento(By.cssSelector("body > footer > div.next-action > a")).click();
	return this;
	}
}
