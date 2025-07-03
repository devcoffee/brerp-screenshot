# ScreenshotGenerator
Este projeto é uma aplicação para gerar screenshots automaticamente de telas do sistema iDempiere utilizando Selenium.

## Configuração e Uso
Siga os passos abaixo para configurar e executar a aplicação.

### 1. Importar o Projeto
Importe este projeto para dentro de um workspace do iDempiere que já esteja configurada e funcional.

### 2. Iniciar o Servidor
Certifique-se de que o servidor do iDempiere esteja em execução, pois a aplicação irá se conectar a ele para realizar o login e navegar pelas telas.

### 3. Configurar Variáveis de Ambiente
Abra o arquivo Selenium.java (localizado em src/org/brerp/screenshot/) e ajuste as variáveis de acordo com o seu ambiente local:
    * **URL**: Endereço do seu servidor iDempiere (ex: http://localhost:6080).
    * **user**: Nome de usuário para login.
    * **userPwd**: Senha do usuário.
    * **client**: Empresa que será utilizado.
    * **clientRole**: Perfil (Role) que será utilizado.
    * **outputDir**: Diretório onde as imagens geradas serão salvas.

### 4. Executar a Aplicação e Aguardar
Execute a aplicação a partir do Eclipse (usando a Run Configuration apropriada para a ScreenshotApplication). O processo irá iniciar um navegador, realizar as tarefas e salvar os arquivos no diretório configurado.

Para um tutorial mais detalhado, confira a [Documentação dev&Co.](https://documentacao.devcoffee.com.br/docs/dev-guides/CriacaoDocumentacao)
