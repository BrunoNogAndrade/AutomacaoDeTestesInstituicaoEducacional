package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalizarCadastroExamePage extends BasePage {

	public FinalizarCadastroExamePage(WebDriver driver) {
		super(driver);
	}

	// Instanciação de biblioteca para ações JS (Scroll lock utilizado no teste)
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Campo para alteração do nome do Exame (caso desejar)
	public FinalizarCadastroExamePage nomeSimulado(String nomeSimulado) {
		aguardaCarregarElemento(By.id("mock_name")).sendKeys(nomeSimulado);
	return this;
	}

	// Permite ocultar a caixa de pesquisa de satisfação e exibila quandoinibida
	// Por padrão da aplicação a mesma é axibida e o primeiro click irá
	// ocultá-la
	public FinalizarCadastroExamePage exibeOcultaPesquisaSatisfacao(){
		js.executeScript("window.scrollBy(0,600)");
		aguardaCarregarElemento(
				By.cssSelector("a[class='_hj-f5b2a1eb-9b07_widget_open_close _hj-f5b2a1eb-9b07_action_toggle_widget']"))
				.click();
	return this;
	}

	// Altera a data de início e termino
	// Abre o calendário da data de início
	public FinalizarCadastroExamePage calendarioDataInicio() {
		// Desce um pouco a tela antes de clicar no campo para exibir o
		// calendário
		js.executeScript("window.scrollBy(0,500)");
		// Clica no campo para abrir o calendário
		aguardaCarregarElemento(By.id("start_time__date")).click();

		// Clica na lista dos meses
		aguardaCarregarElemento(By.cssSelector(
				"#start_time__date_root > div > div > div > div > div.picker__calendar-container > div > select.picker__select--month.browser-default"))
				.click();

		// Seleciona o mês
		aguardaCarregarElemento(By.cssSelector(
				"#start_time__date_root > div > div > div > div > div.picker__calendar-container > div > select.picker__select--month.browser-default > option:nth-child(7)"))
				.click();

		// Seleciona o dia
		aguardaCarregarElemento(By.cssSelector("#start_time__date_table > tbody > tr:nth-child(1) > td:nth-child(2) > div"))
				.click();

		// Clica em fechar o calendário
		aguardaCarregarElemento(By.cssSelector(
				"#start_time__date_root > div > div > div > div > div.picker__footer > button.btn-flat.picker__close"))
				.click();
	return this;
	}

	// Seleciona a data de termino
	// Abre o calendário da data de termino
	public FinalizarCadastroExamePage calendarioDataTermino() throws InterruptedException {
		Thread.sleep(1000);
		// Clica para exibir o calendário
		aguardaCarregarElemento(By.id("end_time__date")).click();

		// Clica para abrir a lista dos meses
		aguardaCarregarElemento(By.cssSelector(
				"#end_time__date_root > div > div > div > div > div.picker__calendar-container > div > select.picker__select--month.browser-default"))
				.click();

		// Seleciona o mês
		aguardaCarregarElemento(By.cssSelector(
				"#end_time__date_root > div > div > div > div > div.picker__calendar-container > div > select.picker__select--month.browser-default > option:nth-child(8)"))
				.click();

		// Seleciona o dia
		aguardaCarregarElemento(By.cssSelector("#end_time__date_table > tbody > tr:nth-child(1) > td:nth-child(5) > div"))
				.click();

		// Clica no botão fechar (para fechar o calendário)
		aguardaCarregarElemento(By.cssSelector(
				"#end_time__date_root > div > div > div > div > div.picker__footer > button.btn-flat.picker__close"))
				.click();
	return this;
	}

	// Tempo para realização da atividade (Horas e minutos)
	public FinalizarCadastroExamePage tempoDuracaoExame(int hora, int minutos) {
		aguardaCarregarElemento(By.name("duration_hours")).clear();
		aguardaCarregarElemento(By.name("duration_hours")).sendKeys(String.valueOf(hora));
		aguardaCarregarElemento(By.name("duration_minutes")).clear();
		aguardaCarregarElemento(By.name("duration_minutes")).sendKeys(String.valueOf(minutos));
	return this;
	}

	// Marca/Desmarca o check Gostaria de exibir para o aluno as questões
	// corrigidas
	public FinalizarCadastroExamePage checkExibirQuestoesCorrigidasParaOsAlunos() {
		aguardaCarregarElemento(By.cssSelector("#activities-finish-form > div:nth-child(7) > div > div > p > label"))
				.click();
	return this;
	}

	public FinalizarCadastroExamePage contadorQuestoesMarcadas(String quantidadeQuestoes){
		js.executeScript("window.scrollBy(0,800)");
		WebElement contadorQuestoes = driver.findElement(By.cssSelector(
				"#activities-finish-form > div.row.activities-finish--row.course-info--col > div.col.s12.m6.l8.course-info__item--large.activities-finish--col > div > div.added-questions__title"));
		String quantidadeQuestoesMarcadas = contadorQuestoes.getText();
		Assert.assertEquals(quantidadeQuestoes , quantidadeQuestoesMarcadas);
	return this;
	}

	// Botão para salvar o exame como rascunho
	public FinalizarCadastroExamePage salvarComoRascunho() {
		aguardaCarregarElemento(By.id("save_as_draft_button")).click();
	return this;
	}

	// Botão para publicação do exame
	public FinalizarCadastroExamePage publicarExame() {
		aguardaCarregarElemento(By.id("publish_button")).click();
	return this;
	}

	public FinalizarCadastroExamePage popUpRascunhoSalvoComSucesso(String mensagemParam){
		WebElement mensagemPopUp = driver.findElement(By.id("toast-container"));
		String mensagem = mensagemPopUp.getText();
		Assert.assertEquals(mensagemParam, mensagem);
	return this;
	}
}
