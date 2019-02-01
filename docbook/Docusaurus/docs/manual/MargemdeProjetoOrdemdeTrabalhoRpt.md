---
title: "Margem de Projeto (Ordem de Trabalho)"
id: MargemdeProjetoOrdemdeTrabalhoRpt
---
<div id="d144321e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Margem de Projeto (Ordem de Trabalho)

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-10-12 23:31:11.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Linhas de Projeto de Ordem
de Serviço (receita planejada) versus Desembolsos de Projeto (custos)

<span class="emphasis"> *Comentário/Ajuda:* </span>O Relatório de Margem
de Projeto para Ordens de Serviço compara as Linhas de Projeto (receita
planejada) contra os Desembolsos de Projeto (esforço real e custos). O
valor da margem é calculado subtraindo os custos (desembolso, issue) da
receita (linha). Os custos estão na moeda do Esquema Contábil - as
linhas estão na moeda da lista de preço do projeto.

<span class="emphasis"> *ReportView:* </span>RV\_ProjectLineIssue

<div id="d144321e25" class="table">

<div class="table-title">

Table 1.1. MargemdeProjetoOrdemdeTrabalho
Parâmetros

</div>

<div class="table-contents">

|       Nome       |  Nome da coluna   |  Referência   | Valores(Padrão) |         Descrição         |                                                    Comentário/Ajuda                                                     |
| :--------------: | :---------------: | :-----------: | :-------------: | :-----------------------: | :---------------------------------------------------------------------------------------------------------------------: |
|     Projeto      |  C\_Project\_ID   |   Procurar    |                 |    Projeto Financeiro     |                    Um "Projeto" permite a você rastrear e controlar atividades internas ou externas.                    |
| Esquema Contábil | C\_AcctSchema\_ID | Tabela Direta |                 | Regras para contabilidade | Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário. |

</div>

</div>

  

<div id="d144321e76" class="table">

<div class="table-title">

Table 1.2. RV\_ProjectLineIssue -
Colunas

</div>

<div class="table-contents">

|        Nome da coluna        |      Referência      | Valores padrão | Valor de restrição |                Regra de validação                |                    Descrição                    |                                                                                     Comentário/Ajuda                                                                                     |
| :--------------------------: | :------------------: | :------------: | :----------------: | :----------------------------------------------: | :---------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Conta             |        Conta         |                |                    |                                                  |                  Account used                   |                                                                                The (natural) account used                                                                                |
|           Empresa            |    Tabela Direta     |                |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                   (ver acima)                   |                                                                                       (ver acima)                                                                                        |
|         Organização          |    Tabela Direta     |                |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                   (ver acima)                   |                                                                                       (ver acima)                                                                                        |
|    Crédito Contabilizado     |        Valor         |                |                    |                                                  |             Accounted Credit Amount             |                                     The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency                                      |
|     Débito Contabilizado     |        Valor         |                |                    |                                                  |             Accounted Debit Amount              |                                      The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency                                      |
|      Crédito de Origem       |        Valor         |                |                    |                                                  |              Source Credit Amount               |                                                The Source Credit Amount indicates the credit amount for this line in the source currency.                                                |
|       Débito de Origem       |        Valor         |                |                    |                                                  |               Source Debit Amount               |                                                The Source Debit Amount indicates the credit amount for this line in the source currency.                                                 |
|       Esquema Contábil       |    Tabela Direta     |                |                    |                                                  |              Rules for accounting               |                                         An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                          |
|   Quantidade Comprometida    |      Quantidade      |                |                    |                                                  |         The (legal) commitment Quantity         | The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount. |
|           Projeto            |       Procurar       |                |                    |                                                  |                Financial Project                |                                                        A Project allows you to track and control internal or external activities.                                                        |
|      Emissão do Projeto      |    Tabela Direta     |                |                    |                                                  |        Project Issues (Material, Labor)         |                                 Issues to the project initiated by the "Issue to Project" process. You can issue Receipts, Time and Expenses, or Stock.                                  |
|       Linha de Projeto       |    Tabela Direta     |                |                    |                                                  |            Task or step in a project            |                                                                    The Project Line indicates a unique project line.                                                                     |
|            Criado            |      Data+Hora       |   (SYSDATE)    |                    |                                                  |          Date this record was created           |                                                            The Created field indicates the date that this record was created.                                                            |
|          Criado por          |        Tabela        |    AD\_User    |                    |                                                  |          User who created this records          |                                                             The Created By field indicates the user who created this record.                                                             |
|          Descrição           | Texto Curto (String) |                |                    |                                                  |    Optional short description of the record     |                                                                       A description is limited to 255 characters.                                                                        |
|            Ativo             |       Sim-Não        |      (Y)       |                    |                                                  |                   (ver acima)                   |                                                                                       (ver acima)                                                                                        |
|     Descrição de Emissão     | Texto Curto (String) |                |                    |                                                  |          Description of the Issue line          |                                                                                                                                                                                          |
|       Linha de Emissão       |       Inteiro        |                |                    |                                                  |            Line number of the issue             |                                                                                                                                                                                          |
|          Linha Núm.          |       Inteiro        |                |                    |                                                  |          Unique line for this document          |                                     Indicates the unique line for a document. It will also control the display order of the lines within a document.                                     |
|       Margem da Linha        |        Valor         |                |                    |                                                  | Margin of the line - Planned Amount minus Costs |                                                                                                                                                                                          |
| Linha de Remessa/Recebimento |    Tabela Direta     |                |                    |                                                  |      Line on Shipment or Receipt document       |                                                     The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                     |
|         Localizador          |  Locator (Armazém)   |                |                    |                                                  |                Warehouse Locator                |                                                             The Locator indicates where in a Warehouse a product is located.                                                             |
|     Data da Movimentação     |         Data         |                |                    |                                                  | Date a product was moved in or out of inventory |                    The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement.                    |
|    Quantidade Movimentada    |      Quantidade      |                |                    |                                                  |          Quantity of a product moved.           |                                                      The Movement Quantity indicates the quantity of a product that has been moved.                                                      |
|           Produto            |       Procurar       |                |                    |                                                  |             Product, Service, Item              |                                                        Identifies an item which is either purchased or sold in this organization.                                                        |
|       Valor Planejado        |        Valor         |                |                    |                                                  |         Planned amount for this project         |                                                  The Planned Amount indicates the anticipated amount for this project or project line.                                                   |
|       Margem Planejada       |        Valor         |                |                    |                                                  |         Project's planned margin amount         |                                           The Planned Margin Amount indicates the anticipated margin amount for this project or project line.                                            |
|       Preço Planejado        |    Custos+Preços     |                |                    |                                                  |       Planned price for this project line       |                                                         The Planned Price indicates the anticipated price for this project line.                                                         |
|     Quantidade Planejada     |      Quantidade      |                |                    |                                                  |        Planned quantity for this project        |                                                 The Planned Quantity indicates the anticipated quantity for this project or project line                                                 |
|       Linha de Despesa       |    Tabela Direta     |                |                    |                                                  |          Time and Expense Report Line           |                                                                                                                                                                                          |
|          Atualizado          |      Data+Hora       |   (SYSDATE)    |                    |                                                  |          Date this record was updated           |                                                            The Updated field indicates the date that this record was updated.                                                            |
|        Atualizado por        |        Tabela        |    AD\_User    |                    |                                                  |          User who updated this records          |                                                             The Updated By field indicates the user who updated this record.                                                             |

</div>

</div>

  

</div>
