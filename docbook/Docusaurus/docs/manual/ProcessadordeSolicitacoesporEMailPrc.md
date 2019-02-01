---
title: "Processador de Solicitações por E-Mail"
id: ProcessadordeSolicitacoesporEMailPrc
---
<div id="d179748e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Processador de Solicitações por E-Mail

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2007-02-28 02:57:59.0

<span class="emphasis">*Atualizado:*</span>2007-02-28 02:57:59.0

<div id="d179748e13" class="table">

<div class="table-title">

Table 1.1. ProcessadordeSolicitacoesporEMail
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna       |      Referência      |                      Valores(Padrão)                       |                                         Descrição                                          |                                                                                                              Comentário/Ajuda                                                                                                               |
| :---------------------: | :-----------------------: | :------------------: | :--------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      IMAP Password      |        p\_IMAPPwd         | Texto Curto (String) |                                                            |                                            null                                            |                                                                                                                    null                                                                                                                     |
|        IMAP Host        |        p\_IMAPHost        | Texto Curto (String) |                                                            |                                            null                                            |                                                                                                                    null                                                                                                                     |
|        IMAP User        |        p\_IMAPUser        | Texto Curto (String) |                                                            |                                            null                                            |                                                                                                                    null                                                                                                                     |
|         Perfil          |       AD\_Role\_ID        |    Tabela Direta     |                            (-1)                            |                                      Perfil de Acesso                                      |                                                                  O "Perfil" determina o nível de segurança e acesso que um usuário que exerça este Perfil terá no Sistema.                                                                  |
|   Tipo de Solicitação   |    R\_RequestType\_ID     |    Tabela Direta     |                                                            |                     Tipo de Solicitação (ex. Consulta, Reclamação, ..)                     |                                                Os "Tipos de Solicitação" são usados para processar e categorizar as solicitações. As opções são Consulta de Conta, Emissão de Garantia, etc.                                                |
|     User Importance     |    p\_DefaultPriority     |        Lista         |         Urgente Alta Média Baixa Menor Importância         |                             Priority of the issue for the User                             |                                                                                                                    null                                                                                                                     |
|     Confidentiality     | p\_DefaultConfidentiality |        Lista         | Informação Pública Confidencial Interno Informação Privada |                                  Type of Confidentiality                                   |                                                                                                                    null                                                                                                                     |
|     Usuário/Contato     |       AD\_User\_ID        |    Tabela Direta     |                            (-1)                            |           Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios           |                                               O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                                |
| Representante de Vendas |       SalesRep\_ID        |        Tabela        |            AD\_User - Internal(@AD\_User\_ID@)             |                 Representante de Vendas ou Promotor de Vendas da Companhia                 |                                        O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                         |
|  Parceiro de Negócios   |      C\_BPartner\_ID      |       Procurar       |                                                            |                            Identifica um Parceiro de Negócios.                             |                                    Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                     |
|  Inbox As Root Folder   |       p\_NestInbox        |       Sim-Não        |                            (Y)                             |              True if other folder (request, error,..) occupy in inbox folder               |                            Some email server as outlook, every folder occupy in inbox, with web mail as google, we easy create my folder outside inbox folder. this field define where request, error,.. occupy.                            |
|      Error Folder       |      p\_ErrorFolder       | Texto Curto (String) |                                                            |                            Mail folder to push unsuccess email                             |                           folder can define as hierarchy, use "\\" to separate folder. example customer\\error\\vietnam will puss email can't process to folder vietnam under folder error under folder customer                            |
|      Inbox Folder       |      p\_InboxFolder       | Texto Curto (String) |                                                            |                Mail folder, where process will take email and make request                 |                                              folder can define as hierarchy, use "\\" to separate folder. example customer\\vietnam will read email from folder vietnam under folder customer                                               |
|     Request Folder      |     p\_RequestFolder      | Texto Curto (String) |                                                            | After take email form inbox folder, and process it success, email will move to this folder | folder can define as hierarchy, use "\\" to separate folder. example customer\\vietnam will read email from folder vietnam under folder customer after take email form inbox folder, and process it success, email will move to this folder |

</div>

</div>

  

</div>
