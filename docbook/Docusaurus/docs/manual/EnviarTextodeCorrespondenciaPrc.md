---
title: "Enviar Texto de Correspondência"
id: EnviarTextodeCorrespondenciaPrc
---
<div id="d85428e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Enviar Texto de Correspondência

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-08-04 19:40:14.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Enviar e-mails de um usuário
selecionado a assinantes ativos de uma Área de Interesse OU a um Grupo
de Parceiros de Negócios

<span class="emphasis"> *Comentário/Ajuda:* </span>Selecione as Áreas de
interesse dos assinantes aos quais você enviará Texto de Correspondência
(e-mail) do Usuário selecionado. Adicionalmente, você pode enviar
correspondências aos contatos de um Grupo de Parceiros de Negócios. O
Usuário a partir do qual serão enviados os emails precisa ter uma
informação de Email válida. Se você não selecionar um usuário, a
correspondência será enviada do Usuário de Email de Solicitação da
Empresa.

<div id="d85428e21" class="table">

<div class="table-title">

Table 1.1. EnviarTextodeCorrespondencia
Parâmetros

</div>

<div class="table-contents">

|           Nome            |   Nome da coluna    |  Referência   |     Valores(Padrão)     |               Descrição                |                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                       |
| :-----------------------: | :-----------------: | :-----------: | :---------------------: | :------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Grupo de Parceiros     |  C\_BP\_Group\_ID   | Tabela Direta |          (-1)           |     Grupo de Parceiros de Negócios     |                                                                                                                                                                                                                             O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                                                                                                                                                                                              |
|       De: (Usuário)       |    AD\_User\_ID     |    Tabela     | AD\_User - Internal(-1) |      Usuário que enviará o email       |                                                                                                                                                                                                                               O email será enviado pelo usuário selecionado - ou então será enviado a partir do endereço ao qual o cliente enviou a requisição                                                                                                                                                                                                                               |
|     Área de Interesse     | R\_InterestArea\_ID | Tabela Direta |                         |      Área de Interesse ou Tópico       |                                                                                                                                                                                                                      Áreas de Interesse refletem o interesse de um contato em um tópico específico. Áreas de interesse podem ser utilizadas em Campanhas de Marketing.                                                                                                                                                                                                                       |
| Modelo de Correspondência |   R\_MailText\_ID   | Tabela Direta |                         | Modelos de texto para correspondências | O "Modelo de Correspondência" indica o modelo de texto utilizado nas resposta a mensagens de e-mail. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |

</div>

</div>

  

</div>
