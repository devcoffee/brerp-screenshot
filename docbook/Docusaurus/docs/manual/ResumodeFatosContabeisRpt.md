---
title: "Resumo de Fatos Contábeis"
id: ResumodeFatosContabeisRpt
---
<div id="d208284e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Resumo de Fatos Contábeis

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2013-03-01 18:22:44.0

<span class="emphasis">*Atualizado:*</span>2013-03-01 18:22:44.0

<span class="emphasis"> *ReportView:* </span>RV\_Fact\_Simple

![](/img/manual/ResumodeFatosContabeis.png)

<div id="d208284e18" class="table">

<div class="table-title">

Table 1.1. ResumodeFatosContabeis
Parâmetros

</div>

<div class="table-contents">

|          Nome          |  Nome da coluna   |      Referência      |   Valores(Padrão)   |                 Descrição                 |                                                                           Comentário/Ajuda                                                                           |
| :--------------------: | :---------------: | :------------------: | :-----------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Esquema Contábil    | C\_AcctSchema\_ID |    Tabela Direta     |                     |         Regras para contabilidade         |                       Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                        |
|      Organização       |    AD\_Org\_ID    |        Tabela        |    AD\_Org (Trx)    | Entidade organizacional dentro da Empresa |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
|         Conta          |    Account\_ID    |        Tabela        |  Account\_ID (Trx)  |              Conta utilizada              |                                                                     A Conta (natural) utilizada                                                                      |
|       Atividade        |  C\_Activity\_ID  |    Tabela Direta     |                     |           Atividade de Negócio            |                                "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                 |
|    Centro de Custo     |     User1\_ID     |        Tabela        | Account\_ID - User1 |              Centro de Custo              |                              O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                              |
|   Centro de Custo 2    |     User2\_ID     |        Tabela        | Account\_ID - User2 |            Centro de Custo \#2            |                              O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                              |
|  Financial Year Month  |   FinYear\_Mth    | Texto Curto (String) |                     |  The only valid date format is: YYYY-MM   |                                                                The only valid date format is: YYYY-MM                                                                |
|     Data da Conta      |     DateAcct      |         Data         |                     |               Data Contábil               | A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda. |
| Chave de Contabilidade |   AccountValue    | Texto Curto (String) |                     |       Chave de um Elemento Contábil       |                                                                                 null                                                                                 |
|    Centro de Custo     |  cof\_user1value  | Texto Curto (String) |                     |                   null                    |                                                                                 null                                                                                 |
|       Usuário 2        |  cof\_user2value  | Texto Curto (String) |                     |                   null                    |                                                                                 null                                                                                 |

</div>

</div>

  

<div id="d208284e186" class="table">

<div class="table-title">

Table 1.2. RV\_Fact\_Simple -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna     |            Referência             |                            Valores padrão                            | Valor de restrição |        Regra de validação         |                    Descrição                    |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :--------------------: | :-------------------------------: | :------------------------------------------------------------------: | :----------------: | :-------------------------------: | :---------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Conta          |              Tabela               |                          Account\_ID (Trx)                           |                    |                                   |                  Account used                   |                                                                                                                                            The (natural) account used                                                                                                                                            |
|     Tipo de Conta      |               Lista               | Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita |                    |                                   |          Indicates the type of account          | Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo. The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners. Note: Memo account amounts are ignored when checking for balancing |
| Chave de Contabilidade |       Texto Curto (String)        |                                                                      |                    |                                   |             Key of Account Element              |                                                                                                                                                                                                                                                                                                                  |
|        Empresa         |           Tabela Direta           |                                                                      |                    | AD\_Client.AD\_Client\_ID \< \> 0 |                   (ver acima)                   |                                                                                                                                                   (ver acima)                                                                                                                                                    |
|      Organização       |           Tabela Direta           |                                                                      |                    |                                   |                   (ver acima)                   |                                                                                                                                                   (ver acima)                                                                                                                                                    |
|  Valor Contabilizado   |               Valor               |                                                                      |                    |                                   | Amount Balance in Currency of Accounting Schema |                                                                                                                                                                                                                                                                                                                  |
|    Esquema Contábil    |           Tabela Direta           |                                                                      |                    |                                   |              Rules for accounting               |                                                                                                     An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                                                                      |
|          Caso          | Texto Médio (até 2000 caracteres) |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|  cof\_parentacctname   |       Texto Curto (String)        |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|     Conta Superior     |       Texto Curto (String)        |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|     cof\_user1name     |       Texto Curto (String)        |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|    Centro de Custo     |       Texto Curto (String)        |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|     cof\_user2name     |       Texto Curto (String)        |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|       Usuário 2        |       Texto Curto (String)        |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|        Projeto         |           Tabela Direta           |                                                                      |                    |                                   |                Financial Project                |                                                                                                                    A Project allows you to track and control internal or external activities.                                                                                                                    |
|         Criado         |             Data+Hora             |                              (SYSDATE)                               |                    |                                   |          Date this record was created           |                                                                                                                        The Created field indicates the date that this record was created.                                                                                                                        |
|       Criado por       |              Tabela               |                               AD\_User                               |                    |                                   |          User who created this records          |                                                                                                                         The Created By field indicates the user who created this record.                                                                                                                         |
|     Data da Conta      |             Data+Hora             |                                                                      |                    |                                   |                 Accounting Date                 |                                                                        The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                                        |
|     Ano Financeiro     | Texto Médio (até 2000 caracteres) |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|     Mês Financeiro     | Texto Médio (até 2000 caracteres) |                                                                      |                    |                                   |                                                 |                                                                                                                                                                                                                                                                                                                  |
|         Ativo          |              Sim-Não              |                                                                      |                    |                                   |                   (ver acima)                   |                                                                                                                                                   (ver acima)                                                                                                                                                    |
|       Atualizado       |             Data+Hora             |                              (SYSDATE)                               |                    |                                   |          Date this record was updated           |                                                                                                                        The Updated field indicates the date that this record was updated.                                                                                                                        |
|     Atualizado por     |              Tabela               |                               AD\_User                               |                    |                                   |          User who updated this records          |                                                                                                                         The Updated By field indicates the user who updated this record.                                                                                                                         |

</div>

</div>

  

</div>
