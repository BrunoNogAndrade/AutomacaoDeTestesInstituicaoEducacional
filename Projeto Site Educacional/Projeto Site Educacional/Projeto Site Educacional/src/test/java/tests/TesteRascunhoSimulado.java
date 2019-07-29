package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Importação das pginas utilizadas nos testes
import Pages.PaginaPrincipalProfessorPage;
import Pages.DisciplinasPage;
import Pages.SelecaoConteudoExamePage;
import Pages.QuestoesExamePage;
import Pages.FinalizarCadastroExamePage;
import Pages.LoginPlataformaProfessorPage;

import static org.junit.Assert.assertEquals;

public class TesteRascunhoSimulado {

	// Inicializando o Google Chrome
	WebDriver driver = new ChromeDriver();

	@Rule
	// Instancia��o dos testes (@Before, @Tes, @After...)
	public TestName teste = new TestName();

	// Abertura da p�gina em que ser� iniciado o teste
	@Before
	public void abreBrowserErealizaLogin() {
		driver.manage().window().maximize();
		driver.get(" AQUI ESTAVA A PÁGINA DE ACESSO AO SITE QUE NÃO PODE SER CITADA");
	}

	// Teste falso positivo em que se tente logar com os campos vazios e
	// espera que o login n�o seja realizado, exibindo mensagem de erro ao tentar logar
	@Test
	public void loginInvalidoCamposVazios(){
		LoginPlataformaProfessorPage realizaLogin = new LoginPlataformaProfessorPage(driver)
			.botaoEntrar()
			.validaExistenciaMensagemErroLogin();
	}

	@Test
	public void loginInvalidoEmail(){
		LoginPlataformaProfessorPage realizaLogin = new LoginPlataformaProfessorPage(driver)
			.emailLogin("bruno.nog.andrade@")
			.senhaLogin("Bb91200814@")
			.botaoEntrar()
			// Valida se a mensagem de login ou senha inválidos foi exibida
			.validaIgualdadeDamensagemErroLogin();
	}

	// Realiza um Login v�lido e verifica um texto da p�gina
	// para confirma��oo do login realizado com sucesso
	@Test
	public void loginValido(){
		LoginPlataformaProfessorPage realizaLogin = new LoginPlataformaProfessorPage(driver)
			.emailLogin("bruno.nog.andrade@gmail.com")
			.senhaLogin("Bb91200814@")
			.botaoEntrar()
			// Valida o login pelo nome do professor que � exibido na p�gina principal
			.validaPaginaInicialNomeProfessor("Bruno Andrade");
	}

	@Test
	public void testePaginaInicial(){
		//Realiza Login no site
		LoginPlataformaProfessorPage realizaLogin = new LoginPlataformaProfessorPage(driver)
				.emailLogin("bruno.nog.andrade@gmail.com")
				.senhaLogin("Bb91200814@")
				.botaoEntrar();

		// Valida a exist�ncia do texto exibido na p�gina inicial
		PaginaPrincipalProfessorPage acessaPaginaPrincipalEiniciaNovoSimulado = new PaginaPrincipalProfessorPage(driver)
				//Verifica o texto principal da p�gina inicial, conferindo se esta presente na mesma
				// 	Para um teste n�o passar e falhar mude o texto do campo aseguir
				// Para passar fazer o oposto (texto correto)
				.verificaPaginaPrincipal("Selecione um curso para visualizar o Dashboard");
	}

	@Test
	public void cadastroNovoSimuladoComSucessoSemValidacoes() throws InterruptedException {
		//Realiza Login no site
		LoginPlataformaProfessorPage realizaLogin = new LoginPlataformaProfessorPage(driver)
				.emailLogin("bruno.nog.andrade@gmail.com")
				.senhaLogin("Bb91200814@")
				.botaoEntrar();

		// Clica em CRIAR simulado, preenche o nome do simulado e avan�a para a
		// pr�xima p�gina
		PaginaPrincipalProfessorPage acessaPaginaPrincipalEiniciaNovoSimulado = new PaginaPrincipalProfessorPage(driver)
				.clicaNovoSimulado()
				// Insere o nome do simulado
				.insereNomeSimulado("Teste Cadastro de Simulado AppProva")
				.botaoProximo();

		// seleciona a op��o de prova para ci�ncia da computa��o
		DisciplinasPage selecionaDisciplina = new DisciplinasPage(driver)
				.selecionaCienciaDaComputacao();

		// Seleciona os conte�dos de quest�es
		// Avançaa para a pr�xima tela (QUESTOES) clicando no bot�o PR�XIMO
		SelecaoConteudoExamePage selecionaConteudoExame = new SelecaoConteudoExamePage(driver)
				.selecionaAnaturezaComOusuario()
				.selecionaAlgebraBooleana()
				.selecionaAlgebraLinearEgeometriaAnalitica()
				.selecionaAlgoritmosDepesquisaEordenacao()
				.selecionaAlgoritmosEestruturaDeDados()
				.selecionaAlgoritmosEestruturaDeDadosCienciaDaComputacao()
				.clicaBotaoProximo();

		// Seleciona as quest�es do exame
		QuestoesExamePage selecionaQuestoes = new QuestoesExamePage(driver)
				.questao1().questao2().questao3().questao4().questao5().questao6()
				.questao7().questao8().questao9().questao10().questao11().questao12()
				.questao13().questao14().questao15().questao16().questao17().questao18()
				.questao19().questao20().questao21().questao22().questao23().questao24()
				.questao25().questao26().questao27().botaoProximaPagina();

		// Tela de Finaliza��o do cadastro
		FinalizarCadastroExamePage finalizaCadastroExame = new FinalizarCadastroExamePage(driver)
				.exibeOcultaPesquisaSatisfacao()
				.calendarioDataInicio()
				.calendarioDataTermino()
				// Inser��o do tempo de dura��o do exame
				.tempoDuracaoExame(01, 45)
				.checkExibirQuestoesCorrigidasParaOsAlunos()
				.salvarComoRascunho()
				// Verifica a mensagem de que o simulado foi salvo como rascunho
				.popUpRascunhoSalvoComSucesso("Simulado salvo como rascunho!");

		PaginaPrincipalProfessorPage realizaPesquisaSimulado = new PaginaPrincipalProfessorPage(driver)
				// Realiza pesquisa do nome do simulado cadastrado (mesmo nome do simulado cadastrado)
				.campoTextoPesquisaSimulado("Teste Cadastro de Simulado AppProva")
				.botaoBuscar()
				// O primeiro registro de simulado ser� aberto e sua publica��oo feita
				.abreSimulado()
				.publicaSimulado()
				.confirmaPublicacaoOK();
	}

	@Test
	public void cadastroNovoSimuladoComSucessoComValidacoes() throws InterruptedException {
				//Realiza Login no site
		LoginPlataformaProfessorPage realizaLogin = new LoginPlataformaProfessorPage(driver)
				.emailLogin("bruno.nog.andrade@gmail.com")
				.senhaLogin("Bb91200814@")
				.botaoEntrar();

					// Clica em CRIAR simulado, preenche o nome do simulado e avan�a para a
					// pr�xima p�gina
		PaginaPrincipalProfessorPage acessaPaginaPrincipalEiniciaNovoSimulado = new PaginaPrincipalProfessorPage(driver)
				//Verifica o texto principal da p�gina inicial, conferindo se esta presente na mesma
				// 	Para um teste n�o passar e falhar mude o texto do campo aseguir
				.verificaPaginaPrincipal("Selecione um curso para visualizar o Dashboard Enade")
				.clicaNovoSimulado()
				// Insere o nome do simulado
				.insereNomeSimulado("Teste Simulado Page objects5")
				.botaoProximo();

		// seleciona a op��o de prova para ci�ncia da computa��o
		DisciplinasPage selecionaDisciplina = new DisciplinasPage(driver)
				.selecionaCienciaDaComputacao();

		// Seleciona os conte�dos de questões
		// Avan�a para a pr�xima tela (QUESTOES) clicando no bot�o PR�XIMO
		SelecaoConteudoExamePage selecionaConteudoExame = new SelecaoConteudoExamePage(driver)
				.selecionaAnaturezaComOusuario()
				.selecionaAlgebraBooleana()
				.selecionaAlgebraLinearEgeometriaAnalitica()
				.selecionaAlgoritmosDepesquisaEordenacao()
				.selecionaAlgoritmosEestruturaDeDados()
				.selecionaAlgoritmosEestruturaDeDadosCienciaDaComputacao()
				.clicaBotaoProximo();

		// Seleciona as quest��es do exame
		QuestoesExamePage selecionaQuestoes = new QuestoesExamePage(driver)
				.questao1().questao2().questao3().questao4().questao5().questao6()
				.questao7().questao8().questao9().questao10().questao11().questao12()
				.questao13().questao14().questao15().questao16().questao17().questao18()
				.questao19().questao20().questao21().questao22().questao23().questao24()
				.questao25().questao26().questao27().botaoProximaPagina();

		// Tela de Finaliza��o do cadastro
		FinalizarCadastroExamePage finalizaCadastroExame = new FinalizarCadastroExamePage(driver)
				.exibeOcultaPesquisaSatisfacao()
				.calendarioDataInicio()
				.calendarioDataTermino()
				// Inser��o do tempo de dura��o do exame
				.tempoDuracaoExame(01, 45)
				.checkExibirQuestoesCorrigidasParaOsAlunos()
				.salvarComoRascunho()
				// Verifica a mensagem de que o simulado foi salvo como rascunho
				.popUpRascunhoSalvoComSucesso("Simulado salvo como rascunho!");

				// Sistema retorna a p�gina onde esta presente o menu com os simulados cadastrados
				// onde ser� feito a pesquisa do simulado cadastrado
		PaginaPrincipalProfessorPage realizaPesquisaSimulado = new PaginaPrincipalProfessorPage(driver)
				// Realiza pesquisa do nome do simulado cadastrado
				.campoTextoPesquisaSimulado("Teste Simulado Page objects5")
				.botaoBuscar()
				// Valida�� realizada para verificar se o nome consta na lista
				// Como o sistema permite o cadastro de simulados com mesmos nomes e registros
				// quando se faz o equals ele compara a tabela toda
				// Utilizar quando fazer o teste passando
					//.percorreTabelaSimuladosCadastrados("Teste Simulado Page objects5")
				// O primeiro registro de simulado ser� aberto e sua publica��o feita
				.abreSimulado()
				.publicaSimulado()
				.confirmaPublicacaoOK()
				// Confere a mensagem de publica��o do simulado
				// Para um teste falhar deve-se alterar a mensagem abaixo
				.popUpSimuladoPublicadoComSucesso("Simulado publicado com sucesso.");
	}

	@After
	public void fechaBrowser() {
		driver.quit();
	}
}