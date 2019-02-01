---
title: "Processamento de Cobrança"
id: ProcessamentodeCobranca
---
<div id="d179844e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processamento de Cobrança

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processamento de Cobrança -
    C\_DunningRun](#d179844e23)</span>
  - <span class="section">[2. Tabela: Registro -
    C\_DunningRunEntry](#d179844e252)</span>
  - <span class="section">[3. Tabela: Linha -
    C\_DunningRunLine](#d179844e572)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciar Processamentos de
Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciar
Processamentos de Cobrança

<span class="emphasis"> *Criado em:* </span>2004-03-06 00:59:09.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ProcessamentodeCobranca.png)

<div id="d179844e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processamento de Cobrança - C\_DunningRun

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Gerenciar Processamento de
Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciar
Processamento de Cobrança

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d179844e38" class="table">

<div class="table-title">

Table 1.1. Dunning Run
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                Descrição                 |                               Comentário/Ajuda                               |
| :-----------------------------: | :------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------: |
|    Processamento de Cobrança    |          ID          |                      |                            |                                                  |               Dunning Run                |                                                                              |
|             Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                             (ver o mesmo acima)                              |
|           Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                             (ver o mesmo acima)                              |
|              Ativo              |       Sim-Não        |         (Y)          |                            |                                                  |    (semelhante ao primeiro relatório)    |                             (ver o mesmo acima)                              |
|        Data da Cobrança         |         Data         |      (@\#Date@)      |                            |                                                  |             Date of Dunning              |                                                                              |
|            Cobrança             |    Tabela Direta     |                      |   cdunning\_cdunningrun    |                                                  |    Dunning Rules for overdue invoices    | The Dunning indicates the rules and method of dunning for past due payments. |
|        Nível de Cobrança        |    Tabela Direta     |                      | cdunninglevel\_cdunningrun | C\_DunningLevel.C\_Dunning\_ID=@C\_Dunning\_ID@  |                                          |                                                                              |
|            Descrição            | Texto Curto (String) |                      |                            |                                                  | Optional short description of the record |                 A description is limited to 255 characters.                  |
| Criar Processamento de Cobrança |        Botão         |                      |                            |                                                  |                                          |                                                                              |
|           Processado            |       Sim-Não        |                      |                            |                                                  |     The document has been processed      |     The Processed checkbox indicates that a document has been processed.     |
|             Enviar              |        Botão         |                      |                            |                                                  |                                          |                                                                              |
|       Encerrar Cobranças        |        Botão         |                      |                            |                                                  |                                          |                                                                              |
|        C\_DunningRun\_UU        | Texto Curto (String) |                      |                            |                                                  |                                          |                                                                              |

</div>

</div>

  

<div id="d179844e252" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Registro - C\_DunningRunEntry

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Registro de Processamento de
Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
detalhes de cartas de cobrança a um parceiro de negócios

<span class="emphasis"> *Relatório:* </span>Dunning Letter - Rpt
C\_Dunning

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d179844e271" class="table">

<div class="table-title">

Table 1.2. Entry
Fields

</div>

<div class="table-contents">

|             Nome do campo             |            Referência             |                          Valores (Padrão)                           |        Chave restritiva         |                                                                                                                                                     Regra de validação                                                                                                                                                      |                           Descrição                           |                                                Comentário/Ajuda                                                 |
| :-----------------------------------: | :-------------------------------: | :-----------------------------------------------------------------: | :-----------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
| Registro de Processamento de Cobrança |                ID                 |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                       Dunning Run Entry                       |                                                                                                                 |
|                Empresa                |           Tabela Direta           |                         (@AD\_Client\_ID@)                          |                                 |                                                                                                                                              AD\_Client.AD\_Client\_ID \< \> 0                                                                                                                                              |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|              Organização              |           Tabela Direta           |                           (@AD\_Org\_ID@)                           |                                 |                                                                                                                                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|       Processamento de Cobrança       |           Tabela Direta           |                                                                     |  cdunningrun\_cdunningrunentry  |                                                                                                                                                                                                                                                                                                                             |                          Dunning Run                          |                                                                                                                 |
|           Nível de Cobrança           |           Tabela Direta           |                       (@C\_DunningLevel\_ID@)                       | cdunninglevel\_cdunningrunentry | C\_DunningLevel.C\_Dunning\_ID=@C\_Dunning\_ID@ AND ((SELECT C\_DunningLevel\_ID FROM C\_DunningRun WHERE C\_DunningRun.C\_DunningRun\_ID=@C\_DunningRun\_ID@) IS NULL OR C\_DunningLevel.C\_DunningLevel\_ID IN (SELECT C\_DunningLevel\_ID FROM C\_DunningRun WHERE C\_DunningRun.C\_DunningRun\_ID=@C\_DunningRun\_ID@)) |                                                               |                                                                                                                 |
|                 Ativo                 |              Sim-Não              |                                 (Y)                                 |                                 |                                                                                                                                                                                                                                                                                                                             |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|         Parceiro de Negócios          |             Procurar              |                                                                     |   cbpartner\_cdunningrunentry   |                                                                                                                                   C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                                                                                                    |                 Identifies a Business Partner                 | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|        Localização do Parceiro        |           Tabela Direta           |                                                                     | cbpartnerlocation\_cdunningrune |                                                                                                                                   C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@                                                                                                                                   |  Identifies the (ship to) address for this Business Partner   |                        The Partner address indicates the location of a Business Partner                         |
|            Usuário/Contato            |           Tabela Direta           |                                (-1)                                 |    aduser\_cdunningrunentry     |                                                                                                                                         AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@                                                                                                                                          | User within the system - Internal or Business Partner Contact |  The User identifies a unique user in the system. This could be an internal user or a business partner contact  |
|               Moeda De                |             Procurar              |                                                                     |   ccurrency\_cdunningrunentry   |                                                                                                                                                                                                                                                                                                                             |                 The Currency for this record                  |                  Indicates the Currency to be used when processing or reporting on this record                  |
|                 Valor                 |               Valor               |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                            Amount                             |                                                     Amount                                                      |
|          Agente de Cobrança           |              Tabela               |                         AD\_User - SalesRep                         |   salesrep\_cdunningrunentry    |                                                                                                                                                                                                                                                                                                                             |             Sales Representative or Company Agent             | The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.  |
|              Quantidade               |            Quantidade             |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                           Quantity                            |               The Quantity indicates the number of a specific product or item for this document.                |
|                 Nota                  | Texto Médio (até 2000 caracteres) |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |         Optional additional user defined information          |           The Note field allows for optional entry of user defined information regarding this record            |
|                Status                 |               Lista               | Acordo Agendamento Contato Divergência Não Encontrado Não Realizada |                                 |                                                                                                                                                                                                                                                                                                                             |                                                               |                                                                                                                 |
|             Data Agendada             |               Data                |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                                                               |                                                                                                                 |
|          Processar Registro           |               Botão               |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                                                               |                                                                                                                 |
|              Processado               |              Sim-Não              |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                The document has been processed                |                      The Processed checkbox indicates that a document has been processed.                       |
|        C\_DunningRunEntry\_UU         |       Texto Curto (String)        |                                                                     |                                 |                                                                                                                                                                                                                                                                                                                             |                                                               |                                                                                                                 |

</div>

</div>

  

<div id="d179844e572" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Linha - C\_DunningRunLine

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linha de Execução de Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento da
informaçãp da linha da carta de cobrança

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d179844e587" class="table">

<div class="table-title">

Table 1.3. Line
Fields

</div>

<div class="table-contents">

|             Nome do campo             |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                                    Regra de validação                                     |                      Descrição                       |                                                                        Comentário/Ajuda                                                                         |
| :-----------------------------------: | :------------------: | :----------------: | :-----------------------------: | :---------------------------------------------------------------------------------------: | :--------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Linha de Processamento de Cobrança   |          ID          |                    |                                 |                                                                                           |                   Dunning Run Line                   |                                                                                                                                                                 |
|                Empresa                |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |                             AD\_Client.AD\_Client\_ID \< \> 0                             |          (semelhante ao primeiro relatório)          |                                                                       (ver o mesmo acima)                                                                       |
|              Organização              |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 |                     (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                      |          (semelhante ao primeiro relatório)          |                                                                       (ver o mesmo acima)                                                                       |
| Registro de Processamento de Cobrança |    Tabela Direta     |                    |     cdunningrunentry\_line      |                                                                                           |                  Dunning Run Entry                   |                                                                                                                                                                 |
|                 Ativo                 |       Sim-Não        |        (Y)         |                                 |                                                                                           |          (semelhante ao primeiro relatório)          |                                                                       (ver o mesmo acima)                                                                       |
|                Fatura                 |       Procurar       |                    |    cinvoice\_cdunningrunline    | <span class="emphasis">*ReadOnly Logic*</span>: @C\_Invoice\_ID@\!0 | @C\_Payment\_ID@\!0 |                  Invoice Identifier                  |                                                                      The Invoice Document.                                                                      |
|               Pagamento               |       Procurar       |                    |    cpayment\_cdunningrunline    | <span class="emphasis">*ReadOnly Logic*</span>: @C\_Invoice\_ID@\!0 | @C\_Payment\_ID@\!0 |                  Payment identifier                  |                                                       The Payment is a unique identifier of this payment.                                                       |
|  Programação de Pagamento de Fatura   |    Tabela Direta     |                    | cinvoicepayschedule\_cdunningru |                                                                                           |               Invoice Payment Schedule               |                                             The Invoice Payment Schedule determines when partial payments are due.                                              |
|                 Valor                 |        Valor         |                    |                                 |                                                                                           |                        Amount                        |                                                                             Amount                                                                              |
|              Em Disputa               |       Sim-Não        |                    |                                 |                                                                                           |                Document is in dispute                |                                                   The document is in dispute. Use Requests to track details.                                                    |
|             Valor Aberto              |        Valor         |                    |                                 |                                                                                           |                   Open item amount                   |                                                                                                                                                                 |
|           Valor Convertido            |        Valor         |                    |                                 |                                                                                           |                   Converted Amount                   |                      The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate for this target currency.                       |
|          Dias do Vencimento           |       Inteiro        |                    |                                 |                                                                                           | Number of days due (negative: due in number of days) |                                                                                                                                                                 |
|             Vezes Cobrado             |       Inteiro        |                    |                                 |                                                                                           |          Number of times dunned previously           |                                                                                                                                                                 |
|       Valor de Encargo de Mora        |        Valor         |                    |                                 |                                                                                           |            Fee amount in invoice currency            | The Fee Amount indicates the charge amount on a dunning letter for overdue invoices. This field will only display if the charge fee checkbox has been selected. |
|            Valor dos Juros            |        Valor         |                    |                                 |                                                                                           |                   Interest Amount                    |                                       The Interest Amount indicates any interest charged or received on a Bank Statement.                                       |
|              Valor Total              |        Valor         |                    |                                 |                                                                                           |                     Total Amount                     |                                                      The Total Amount indicates the total document amount.                                                      |
|              Processado               |       Sim-Não        |                    |                                 |                                                                                           |           The document has been processed            |                                              The Processed checkbox indicates that a document has been processed.                                               |
|         C\_DunningRunLine\_UU         | Texto Curto (String) |                    |                                 |                                                                                           |                                                      |                                                                                                                                                                 |

</div>

</div>

  

</div>
