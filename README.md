# Desafio DB
## _Transferência Entre Contas pelo BugBank_

Este READ.md concentra-se em pontuar algumas informações importantes do projeto criado para seja possível executá-lo.

## Instalação e Configuração

O projeto requer o [Java 8 - Java SE Development Kit](https://nodejs.org/) instalado em seu computador. 

Como a instalação foi realizada em Windows, detalharemos apenas alguns pontos importantes deste processo. O tipo de instação no Windows é a padrão.

Ponto importante neste processo é a configuração do JAVA_HOME nas variáveis de ambiente e PATH.
- Procure no seu windows as variáveis de ambiente e em PATH, clique em editar e adicione o local de instalação do Java, salvando no final. Abaixo um exemplo de como deve ficar:
- C:\Program Files\Java\jdk1.8.0_202

Depois de configurada esta parte, configure o JAVA_HOME em Variáveis do Sistema. Clique em adiciona, caso ainda não exista da mesma forma como foi no PATH.
- C:\Program Files\Java\jdk1.8.0_202

O [MAVEN](https://maven.apache.org/download.cgi) é a ferramenta que foi escolhida para fazer o build do projeto e rodar as dependências. O link disponibilizado, baixe a versão .bin, por exemplo, na versão utiliza neste projeto foi a:
- 	apache-maven-3.9.6-bin.zip

Depois de descompactado, o local onde os arquivos foram colocados foi:
- C:\Program Files\Apache Maven\apache-maven-3.9.6-bin\apache-maven-3.9.6

Lembre-se que o MAVEN não possui um processo de instalação convencional. Nesta ferramenta, coloca-se em um determinado local do sistema operacional a pasta e, ao executar o comando "mvn" no terminal, o MAVEN roda dependendo do parâmetro que é adicionado na linha de comando. A pasta "Apache Maven" foi criada por mim dentro de "Program Files", então sinta-se a vontade de fazer da forma que lhe convém.
Outro ponto importante se tratando do MAVEN é a configuração do PATH e MAVEN_HOME. Bem como foi mostrado com o Java, fazer da mesma forma no MAVEN.

Path:
- %MAVEN_HOME%\bin

MAVEN_HOME:
- C:\Program Files\Apache Maven\apache-maven-3.9.6-bin\apache-maven-3.9.6

Configuração no IntelliJ

A classe TestRunner.java é onde você encontrará a configuração do Cucumber para rodar no JUnit. Para executar ela pela IDE é necessário fazer a seguinte configuração:
- Nas opção de 'Run', vá em 'Edit Configurations';
- Uma janela se abrirá e no canto esquerdo você deve procurar o símbolo de '+' para adicionar o JUnit e, após selecionado, nos campos de configuração que serão disponibilizados à direita, em 'Buil and run', você deve selecionar a versão do Java, neste caso a 1.8.0_202 (Java 8), e, no campo definido como 'Class', ao lado direito, há um ícone dentro do campo para procurar a classe TestRunner. Clique nele e uma janela se abrirá. Nesta janela, o IntelliJ irá buscar automaticamente uma classe compatível com a configuração que está sendo estabelecida. Se tudo der certo, ela deve encontrar o local e disponibilizar a indicação da classe. Você deve selecionar ela e tudo estará pronto para rodar o teste. Caso isso não aconteça, clique no campo disponível nesta janela e aponte o local da TestRunner.java. 
- Clique no botão 'Apply' e depois 'Ok'. No canto superior direito, aparecerá a classe TestRunner identificada pela IDE e pronta para ser executada. 
