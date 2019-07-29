package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SelecaoConteudoExamePage extends BasePage {

	// Instancialização da biblioteca para Scroll (utilizado nos testes)
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public SelecaoConteudoExamePage(WebDriver driver) {
		super(driver);
	}

	public SelecaoConteudoExamePage selecionaAnaturezaComOusuario() {
		js.executeScript("window.scrollBy(0,1200)");
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(1) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage selecionaAlgebraBooleana() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(2) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage selecionaAlgebraLinearEgeometriaAnalitica() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(3) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage selecionaAlgoritmosDepesquisaEordenacao() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(4) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage selecionaAlgoritmosEestruturaDeDados() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(5) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage selecionaAlgoritmosEestruturaDeDadosCienciaDaComputacao() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(6) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage selecionaAlgoritmosHeuriticos() {
		aguardaCarregarElemento(By.cssSelector(
				"body > main > div > div.tags-panel.row.z-depth-1.white > div.tag-selector.col.s6.m8.l9 > div.tag-selector__miller-columns > div > ul > li:nth-child(7) > p > label"))
				.click();
	return this;
	}

	public SelecaoConteudoExamePage clicaBotaoAnterior() {
		aguardaCarregarElemento(By.cssSelector("body > footer > div.previous-action > a")).click();
	return this;
	}

	public SelecaoConteudoExamePage clicaBotaoProximo() {
		aguardaCarregarElemento(By.cssSelector("body > footer > div.next-action > a")).click();
	return this;
	}
}
