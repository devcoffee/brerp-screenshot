---
title: "Imprimir Cartas de Cobrança"
id: ImprimirCartasdeCobrancaPrc
---
<div id="d120577e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Imprimir Cartas de Cobrança

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-11-30 01:28:36.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Imprimir Cartas de Cobrança
em papel ou enviar PDF

<span class="emphasis"> *Comentário/Ajuda:* </span>(Re)Imprimir Cartas
de Cobrança ou enviá-las como anexos em formato PDF ao Contato do
Parceiro de Negócios com um endereço de email válido.

![](/img/manual/ImprimirCartasdeCobranca.png)

<div id="d120577e22" class="table">

<div class="table-title">

Table 1.1. ImprimirCartasdeCobranca
Parâmetros

</div>

<div class="table-contents">

|              Nome              |    Nome da coluna    |  Referência   | Valores(Padrão) |                             Descrição                              |                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                       |
| :----------------------------: | :------------------: | :-----------: | :-------------: | :----------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Email PDF            |       EMailPDF       |    Sim-Não    |                 |      Enviar documentos em formato PDF ao parceiro de negócios      |                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                             |
|  Somente se o PN tiver saldo   |  IsOnlyIfBPBalance   |    Sim-Não    |       (Y)       |   Incluir somente se o Parceiro de Negócios tiver saldo pendente   |                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                             |
| Print Unprocessed Entries Only | PrintUnprocessedOnly |    Sim-Não    |       (Y)       | Print the unprocessed (unprinted) entries of the dunning run only. |                                                                                                                                                                                                                                 Print the unprocessed (unprinted) entries of the dunning run only. This allows you to reprint only certain dunning entries.                                                                                                                                                                                                                                  |
|   Processamento de Cobrança    |  C\_DunningRun\_ID   | Tabela Direta |                 |                     Processamento de Cobrança                      |                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                             |
|   Modelo de Correspondência    |   R\_MailText\_ID    | Tabela Direta |                 |               Modelos de texto para correspondências               | O "Modelo de Correspondência" indica o modelo de texto utilizado nas resposta a mensagens de e-mail. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |

</div>

</div>

  

</div>
