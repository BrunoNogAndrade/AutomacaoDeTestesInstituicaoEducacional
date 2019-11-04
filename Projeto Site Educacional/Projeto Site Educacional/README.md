

# Projeto de Automação de Testes Desafio site educacional

### A Automação
A automação segue um roteiro proposto no desafio, sendo ele:

• Acessar corretamente a plataforma; 
• Acessar a área de criação de simulados; 
• Preencher corretamente cada passo da criação de um simulado: 
  o Criar um simulado do tipo "Exercício"; 
  o Escolher uma disciplina / curso;
  o Selecionar os conteúdos que devem compor 
  o exercício; 
  o Selecionar questões a serem adicionadas; 
  o Salvar o simulado como rascunho. 
• Acessar a área de simulados e buscar pelo simulado salvo anteriormente; 
• Publicar o simulado. 

### Pré-requisitos: 
 - JDK instalado conforme versão do sisteme operacional, download em  
 **URL**: https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.htm
 
 - Chrome Driver devidamente configurado no C: da máquina onde serão executados os testes
   Download em  **URL**: http://chromedriver.chromium.org/downloads
   Em Propriedades do sistema -> Avançado -> Variáveis do sistema Abra as variaveis do sistema e localize a "Path", inserindo o caminho do Chrome driver que voce colocou no C: como "C:\chromedriver"
   
  - Google Chrome instalado, download em  **URL**: https://www.google.com/intl/pt-BR/chrome/
  
  - Eclipse IDE instalado conforme versão do sistema operacional, download em
   **URL**: https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2019-03/R/eclipse-inst-win64.exe
     
### Mãos a obra: 
1. Passo: Abra o Eclipse e importe o projeto.

![Passo_1](https://user-images.githubusercontent.com/29817238/58355215-02baff80-7e4a-11e9-841c-c35040044c75.png)

2. Passo: Vá em Maven -> Existing Maven Projects
<img src=”caminho até a imagem”>

3. Passo: Selecione o diretório e verifique se em Projects o mesmo esta sendo exibido, em seguida clique em Finish. 
Projeto importado!

![Passo_3](https://user-images.githubusercontent.com/29817238/58355277-3564f800-7e4a-11e9-9ee3-5d085d6e757c.png)

4. Passo: Abra o projeto, em src/test/java voce encontrará os pacotes de Páginas e Testes. No pacote de páginas estão os métodos com os elementos de cada página da aplicação e, no teste onde estas serão chamadas quando preciso.

![Passo_4](https://user-images.githubusercontent.com/29817238/58355304-4e6da900-7e4a-11e9-8ed0-dfa4408a32ad.png)

5. Passo: Para a execução dos testes: Botão direito do mouse em cima do nomne do projeto -> Run As -> opção "3 JUnit Test". Após o comando os testes serão iniciados e deve-se aguardar a execução dos mesmos.

![Passo_5](https://user-images.githubusercontent.com/29817238/58355331-65140000-7e4a-11e9-8c04-08d416b9d08d.png)

6. Passo: Ao finalizar o eclipse abre a aba JUnit que fica ao lado da Package Explorer, na mesma são exibidos os testes realizados e os resultados que são Error e Failures (teste que não passa) e, abaixo os testes que passaram ficaram marcados com um "V" verde e os que não passaram ficam marcados com um "X" azul. 
<img src=”caminho até a imagem”>

![Passo_6](https://user-images.githubusercontent.com/29817238/58355337-6e9d6800-7e4a-11e9-8b5a-2cf28ec54af4.png)

### Fim
