---
title: "Relatório de Fluxo de Caixa"
id: RelatoriodeFluxodeCaixaRpt
---
<div id="d200193e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Fluxo de Caixa

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2010-12-08 21:24:40.0

<span class="emphasis">*Atualizado:*</span>2010-12-08 21:24:40.0

<span class="emphasis"> *ReportView:* </span>T\_CashFlow

![](/img/manual/RelatoriodeFluxodeCaixa.png)

<div id="d200193e18" class="table">

<div class="table-title">

Table 1.1. RelatoriodeFluxodeCaixa
Parâmetros

</div>

<div class="table-contents">

|        Nome        |   Nome da coluna    |  Referência   |          Valores(Padrão)           |                 Descrição                 |                                                                      Comentário/Ajuda                                                                       |
| :----------------: | :-----------------: | :-----------: | :--------------------------------: | :---------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Ao dia       |       DateTo        |     Data      | (@SQL=SELECT SYSDATE+90 FROM DUAL) |      Dia final de uma faixa de datas      |                                           O campo "Ao dia" indica a data final de uma faixa de datas (inclusive)                                            |
|  Esquema Contábil  |  C\_AcctSchema\_ID  | Tabela Direta |                                    |         Regras para contabilidade         |                   Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                   |
| Elemento de Contas | C\_ElementValue\_ID |   Procurar    |                                    |            Elemento de Contas             |                                    Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                    |
|    Organização     |     AD\_Org\_ID     | Tabela Direta |                                    | Entidade organizacional dentro da Empresa | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |

</div>

</div>

  

<div id="d200193e95" class="table">

<div class="table-title">

Table 1.2. T\_CashFlow -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna      |            Referência             |                                Valores padrão                                | Valor de restrição |                Regra de validação                |                Descrição                 |                                                                                               Comentário/Ajuda                                                                                                |
| :---------------------: | :-------------------------------: | :--------------------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |           Tabela Direta           |                                                                              |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |               (ver acima)                |                                                                                                  (ver acima)                                                                                                  |
|       Organização       |           Tabela Direta           |                                                                              |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |               (ver acima)                |                                                                                                  (ver acima)                                                                                                  |
|  Instância de Processo  |           Tabela Direta           |                                                                              |                    |                                                  |         Instance of the process          |                                                                                                                                                                                                               |
|    Esquema Contábil     |           Tabela Direta           |                                                                              |                    |                                                  |           Rules for accounting           |                                                    An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                    |
|        Atividade        |           Tabela Direta           |                                                                              |                    |                                                  |            Business Activity             |                                                            Activities indicate tasks that are performed and used to utilize Activity based Costing                                                            |
| Fluxo de Caixa Recursos |               Lista               | 1\_Initial Balance 2\_Plan 3\_Commitments (Orders) 4\_Actual Debt (Invoices) |                    |                                                  |                                          |                                                                                                                                                                                                               |
| Tipo de Fluxo de Caixa  |               Lista               |                     Financeiro Investimento Operacional                      |                    |                                                  |                                          |                                                                                                                                                                                                               |
|  Parceiro de Negócios   |             Procurar              |                                                                              |                    |                                                  |      Identifies a Business Partner       |                                                A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                |
|        Campanha         |           Tabela Direta           |                                                                              |                    |                                                  |            Marketing Campaign            |                     The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                      |
|  Linha Plano de Caixa   |             Procurar              |                                                                              |                    |                                                  |                                          |                                                                                                                                                                                                               |
|       Finalidade        |             Procurar              |                                                                              |                    |                                                  |       Additional document charges        |                                                                    The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                                                     |
|   Elemento de Contas    |             Procurar              |                                                                              |                    |                                                  |             Account Element              |                                                                       Account Elements can be natural accounts or user defined values.                                                                        |
|         Fatura          |             Procurar              |                                                                              |                    |                                                  |            Invoice Identifier            |                                                                                             The Invoice Document.                                                                                             |
|         Pedido          |             Procurar              |                                                                              |                    |                                                  |                  Order                   | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
|         Projeto         |           Tabela Direta           |                                                                              |                    |                                                  |            Financial Project             |                                                                  A Project allows you to track and control internal or external activities.                                                                   |
|         Criado          |             Data+Hora             |                                  (SYSDATE)                                   |                    |                                                  |       Date this record was created       |                                                                      The Created field indicates the date that this record was created.                                                                       |
|       Criado por        |              Tabela               |                                   AD\_User                                   |                    |                                                  |      User who created this records       |                                                                       The Created By field indicates the user who created this record.                                                                        |
|         Ao dia          |               Data                |                                                                              |                    |                                                  |         End date of a date range         |                                                                           The Date To indicates the end date of a range (inclusive)                                                                           |
|    Data da Transação    |               Data                |                                                                              |                    |                                                  |             Transaction Date             |                                                                          The Transaction Date indicates the date of the transaction.                                                                          |
|        Descrição        | Texto Médio (até 2000 caracteres) |                                                                              |                    |                                                  | Optional short description of the record |                                                                                  A description is limited to 255 characters.                                                                                  |
|          Ativo          |              Sim-Não              |                                     (Y)                                      |                    |                                                  |               (ver acima)                |                                                                                                  (ver acima)                                                                                                  |
|   Transação de Vendas   |              Sim-Não              |                                                                              |                    |                                                  |       This is a Sales Transaction        |                                                                 The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                 |
|     Total da Linha      |               Valor               |                                                                              |                    |                                                  |       Total line amount incl. Tax        |                                                                                               Total line amount                                                                                               |
|         Produto         |             Procurar              |                                                                              |                    |                                                  |          Product, Service, Item          |                                                                  Identifies an item which is either purchased or sold in this organization.                                                                   |
|          Nome           |       Texto Curto (String)        |                                                                              |                    |                                                  |  Alphanumeric identifier of the entity   |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|      Probabilidade      |              Número               |                                                                              |                    |                                                  |                                          |                                                                                                                                                                                                               |
|     Fluxo de Caixa      |                ID                 |                                                                              |                    |                                                  |                                          |                                                                                                                                                                                                               |
|     T\_CashFlow\_UU     |       Texto Curto (String)        |                                                                              |                    |                                                  |                                          |                                                                                                                                                                                                               |
|       Atualizado        |             Data+Hora             |                                  (SYSDATE)                                   |                    |                                                  |       Date this record was updated       |                                                                      The Updated field indicates the date that this record was updated.                                                                       |
|     Atualizado por      |              Tabela               |                                   AD\_User                                   |                    |                                                  |      User who updated this records       |                                                                       The Updated By field indicates the user who updated this record.                                                                        |

</div>

</div>

  

</div>
