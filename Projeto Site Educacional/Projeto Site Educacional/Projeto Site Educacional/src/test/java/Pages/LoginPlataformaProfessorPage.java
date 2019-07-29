package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginPlataformaProfessorPage extends BasePage{

	public LoginPlataformaProfessorPage(WebDriver elemento) {
		super(elemento);
	}
	
	// Navega-se e faz-se o login antes de iniciar os testes
	public LoginPlataformaProfessorPage emailLogin(String email){
		aguardaCarregarElemento(By.id("teacher_email")).sendKeys(email);
	return this;
	}

	public LoginPlataformaProfessorPage senhaLogin(String senha){
		aguardaCarregarElemento(By.id("teacher_password")).sendKeys(senha);
	return this;
	}

	public LoginPlataformaProfessorPage botaoEntrar(){
		aguardaCarregarElemento(By.name("commit")).click();
	return this;
	}

	// Verifica a existência da mensagem de login ou senha inválidos
	// por meio do assert True
	public LoginPlataformaProfessorPage validaIgualdadeDamensagemErroLogin(){
		// Valida se a mensagem de login ou senha inválidos foi exibida
		WebElement textoErroLogin = driver.findElement(By.cssSelector("#new_teacher > div.alert-messages"));
		String textoNoElementoErroLogin = textoErroLogin.getText();
		String mensagemLoginInvalido = "E-mail ou senha inválidos.";
		assertEquals (mensagemLoginInvalido, textoNoElementoErroLogin);
	return this;
	}

	public LoginPlataformaProfessorPage validaExistenciaMensagemErroLogin(){
		// Valida se a mensagem de login ou senha inválidos foi exibida
		WebElement textoErroLogin = driver.findElement(By.cssSelector("#new_teacher > div.alert-messages"));
		String textoNoElementoErroLogin = textoErroLogin.getText();
		Assert.assertTrue(driver.getPageSource().contains(textoNoElementoErroLogin));
		return this;
	}

	public LoginPlataformaProfessorPage validaPaginaInicialNomeProfessor(String nomeProfessor){
		// Valida se a mensagem de login ou senha inválidos foi exibida
		assertEquals(nomeProfessor, driver.findElement(
				By.cssSelector(
						"#nav-mobile > li.teacher-identification.primary-color > div.teacher-identification__name")).getText());
		return this;
	}


}
