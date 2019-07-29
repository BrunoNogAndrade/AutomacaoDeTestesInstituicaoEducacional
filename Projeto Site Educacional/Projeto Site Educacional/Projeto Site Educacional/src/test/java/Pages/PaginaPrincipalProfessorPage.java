package Pages;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.*;

public class PaginaPrincipalProfessorPage extends BasePage {

	public PaginaPrincipalProfessorPage(WebDriver driver) {
		super(driver);
	}

	public PaginaPrincipalProfessorPage verificaPaginaPrincipal(String mensagem){
		WebElement textoPaginaPrincipal = aguardaCarregarElemento(By.cssSelector(
				"#root > div > div > div > div.style__wrap_label__3eKiS.flexboxgrid__row__1y_mg > div > span"));
		String textoNoElementoPaginaPrincipal = textoPaginaPrincipal.getText();
		assertEquals(textoNoElementoPaginaPrincipal, mensagem);
		return this;
	}

	public PaginaPrincipalProfessorPage clicaNovoSimulado() {
		aguardaCarregarElemento(By.cssSelector("a[href='/activities/new?via=sidebar']")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage radioButomExercicio() {
		aguardaCarregarElemento(By.cssSelector("#new_mock > span:nth-child(5) > label > label")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage radioButomSimuladoPadraoEnade() {
		aguardaCarregarElemento(By.cssSelector("#new_mock > span:nth-child(6) > label > label")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage insereNomeSimulado(String nomeSimulado) {
		aguardaCarregarElemento(By.id("mock_name")).sendKeys(nomeSimulado);
	return this;
	}

	public PaginaPrincipalProfessorPage botaoProximo() {
		aguardaCarregarElemento(By.id("wizard-form__submit-button")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage menuSimulados(){
		aguardaCarregarElemento(By.id("sidebar-mocks")).click();
	return this;
	}
	
	public PaginaPrincipalProfessorPage campoTextoPesquisaSimulado(String nomeSimulado){
		driver.findElement(By.cssSelector("#q_name_cont")).sendKeys(nomeSimulado);
	return this;
	}
	
	public PaginaPrincipalProfessorPage botaoBuscar(){
		driver.findElement(By.cssSelector("#mock-search-form > div.mock-search__buttons > button.search.btn.waves-effect.background-light-primary-color")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage percorreTabelaSimuladosCadastrados(String textoPesquisaSimulado){
		// Cria lista de objetos do tipo WebElement que recebe as células da tabela acima.
		List<WebElement> celulas = driver.findElements(By.id("mocks"));
		// Loop que imprime o valor de cada célula.
		for(WebElement c : celulas){
			//System.out.println(c.getText());
			String text = c.getText();
			assertEquals(textoPesquisaSimulado, text);
			}
		return this;
	}
//throws InterruptedException
	//Thread.sleep(1000);
	public PaginaPrincipalProfessorPage abreSimulado(){
		/*List<WebElement> li = driver.findElements(By.id("//*[@id='mocks']/tr[1]/td[1]/div/a"));
		li.get(1).click();*/
		aguardaCarregarElemento(By.xpath("//*[@id='mocks']/tr[1]/td[1]/div/a")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage publicaSimulado(){
		aguardaCarregarElemento(By.id("publish-button")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage confirmaPublicacaoOK(){
		aguardaCarregarElemento(By.linkText("OK")).click();
	return this;
	}

	public PaginaPrincipalProfessorPage popUpSimuladoPublicadoComSucesso(String mensagemPublicacaoSimulado){
		WebElement mensagemPopUpPublicacao = driver.findElement(By.id("toast-container"));
		String mensagem = mensagemPopUpPublicacao.getText();
		Assert.assertEquals(mensagemPublicacaoSimulado, mensagem);
	return this;
	}

	public PaginaPrincipalProfessorPage cancelarPublicacaoOuExclusaoSimulado(){
		aguardaCarregarElemento(By.cssSelector("href=\"#!\"")).click();
	return this;
	}

}
