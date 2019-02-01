---
title: "Classificação por Vencimento"
id: ClassificacaoporVencimentoRpt
---
<div id="d21574e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Classificação por Vencimento

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-12-05 13:51:47.0

<span class="emphasis">*Atualizado:*</span>2016-09-19 17:04:54.0

<span class="emphasis"> *Descrição:* </span>Relatório de Classificação
por Vencimento

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
classificação por vencimento permite a você obter a posição de Itens em
Aberto(Faturas), em uma determinada data. Caso precise retroagir o
período, marcar o flag Data da conta e informar a Data base

<span class="emphasis"> *ReportView:* </span>T\_Aging

![](/img/manual/ClassificacaoporVencimento.png)

<div id="d21574e26" class="table">

<div class="table-title">

Table 1.1. ClassificacaoporVencimento
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna    |  Referência   |   Valores(Padrão)   |                 Descrição                 |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :-----------------: | :-----------: | :-----------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Custódia       | COF\_C\_Custody\_ID |    Tabela     |   COF\_C\_Custody   |   Custódia Vinculada a Este Documento.    |                                                                        Primary Key : Custody                                                                         |
| Parceiro de Negócios |   C\_BPartner\_ID   |   Procurar    |                     |    Identifica um Parceiro de Negócios.    | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|    Listar Faturas    |   IsListInvoices    |    Sim-Não    |         (N)         |          Inclui lista de faturas          |                                                                                 null                                                                                 |
|    Data da Conta     |      DateAcct       |    Sim-Não    |         (N)         |               Data Contábil               | A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda. |
| Transação de Vendas  |       IsSOTrx       |    Sim-Não    |         (Y)         |      Esta é uma Transação de Vendas       |                                     A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                      |
|  Grupo de Parceiros  |  C\_BP\_Group\_ID   | Tabela Direta |        (-1)         |      Grupo de Parceiros de Negócios       |                 O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                  |
|       Moeda De       |   C\_Currency\_ID   | Tabela Direta |        (-1)         |        A Moeda para este registro         |                                          Indica a moeda a ser utilizada ao fazer processos ou relatórios com este registro                                           |
|     Organização      |     AD\_Org\_ID     | Tabela Direta |        (-1)         | Entidade organizacional dentro da Empresa |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
|      Atividade       |   C\_Activity\_ID   | Tabela Direta |                     |           Atividade de Negócio            |                                "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                 |
|   Centro de Custo    |      User1\_ID      |    Tabela     | Account\_ID - User1 |              Centro de Custo              |                              O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                              |
|  Centro de Custo 2   |      User2\_ID      |    Tabela     | Account\_ID - User2 |            Centro de Custo \#2            |                              O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                              |
|      Data Base       |    StatementDate    |     Data      |                     |                 Data Base                 |                                                    O campo "Data Base" define a data desta declaração (extrato).                                                     |
|  Tipo de Documento   |   C\_DocType\_ID    | Tabela Direta |                     |        Tipo de Documento ou regras        |                                        O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                         |

</div>

</div>

  

<div id="d21574e220" class="table">

<div class="table-title">

Table 1.2. T\_Aging -
Colunas

</div>

<div class="table-contents">

|           Nome da coluna           |      Referência      | Valores padrão | Valor de restrição  |                Regra de validação                |                      Descrição                       |                                                                           Comentário/Ajuda                                                                           |
| :--------------------------------: | :------------------: | :------------: | :-----------------: | :----------------------------------------------: | :--------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Empresa               |    Tabela Direta     |                |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (ver acima)                      |                                                                             (ver acima)                                                                              |
|            Organização             |    Tabela Direta     |                |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (ver acima)                      |                                                                             (ver acima)                                                                              |
|       Instância de Processo        |    Tabela Direta     |                | adpinstance\_taging |                                                  |               Instance of the process                |                                                                                                                                                                      |
|             Atividade              |    Tabela Direta     |                |  cactivity\_taging  |                                                  |                  Business Activity                   |                                       Activities indicate tasks that are performed and used to utilize Activity based Costing                                        |
|        Parceiro de Negócios        |       Procurar       |                |  cbpartner\_taging  |                                                  |            Identifies a Business Partner             |                           A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                            |
|         Grupo de Parceiros         |    Tabela Direta     |                |  cbpgroup\_taging   |                                                  |                Business Partner Group                |                            The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.                            |
|              Campanha              |    Tabela Direta     |                |  ccampaign\_taging  |                                                  |                  Marketing Campaign                  | The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign. |
|              Moeda De              |    Tabela Direta     |                |  ccurrency\_taging  |                                                  |             The Currency for this record             |                                            Indicates the Currency to be used when processing or reporting on this record                                             |
|               Fatura               |       Procurar       |      (0)       |                     |                                                  |                  Invoice Identifier                  |                                                                        The Invoice Document.                                                                         |
| Programação de Pagamento de Fatura |    Tabela Direta     |      (0)       |                     |                                                  |               Invoice Payment Schedule               |                                                The Invoice Payment Schedule determines when partial payments are due.                                                |
|              Projeto               |    Tabela Direta     |                |  cproject\_taging   |                                                  |                  Financial Project                   |                                              A Project allows you to track and control internal or external activities.                                              |
|               Criado               |      Data+Hora       |   (SYSDATE)    |                     |                                                  |             Date this record was created             |                                                  The Created field indicates the date that this record was created.                                                  |
|             Criado por             |        Tabela        |    AD\_User    |                     |                                                  |            User who created this records             |                                                   The Created By field indicates the user who created this record.                                                   |
|           Data da Conta            |       Sim-Não        |      (N)       |                     |                                                  |                   Accounting Date                    |  The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.  |
|         Dias do Vencimento         |       Inteiro        |                |                     |                                                  | Number of days due (negative: due in number of days) |                                                                                                                                                                      |
|             Vence Hoje             |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|         Vence de Hoje a 30         |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|         Vence de Hoje a 7          |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|           Vence de 1 a 7           |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|          Vence de 31 a 60          |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|            Vence \> 31             |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|          Vence de 61 a 90          |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|            Vence \> 61             |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|          Vence de 8 a 30           |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|            Vence \> 91             |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|            Valor devido            |        Valor         |                |                     |                                                  |              Amount of the payment due               |                                                                    Full amount of the payment due                                                                    |
|         Data do Vencimento         |         Data         |                |                     |                                                  |             Date when the payment is due             |                                                     Date when the payment is due without deductions or discount                                                      |
|           Valor Faturado           |        Valor         |                |                     |                                                  |                 The amount invoiced                  |                                                                         The amount invoiced                                                                          |
|               Ativo                |       Sim-Não        |      (Y)       |                     |                                                  |                     (ver acima)                      |                                                                             (ver acima)                                                                              |
|           Listar Faturas           |       Sim-Não        |                |                     |                                                  |               Include List of Invoices               |                                                                                                                                                                      |
|        Transação de Vendas         |       Sim-Não        |                |                     |                                                  |             This is a Sales Transaction              |                                            The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                             |
|            Valor Aberto            |        Valor         |                |                     |                                                  |                   Open item amount                   |                                                                                                                                                                      |
|         Vencido de 1 a 30          |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|          Vencido de 1 a 7          |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|         Vencido de 31 a 60         |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|           Vencido \> 31            |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|         Vencido de 61 a 90         |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|           Vencido \> 61            |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|         Vencido de 8 a 30          |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|           Vencido \> 91            |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|              Vencido               |        Valor         |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|          Data do Extrato           |         Data         |                |                     |                                                  |                Date of the statement                 |                                                     The Statement Date field defines the date of the statement.                                                      |
|            T\_Aging\_UU            | Texto Curto (String) |                |                     |                                                  |                                                      |                                                                                                                                                                      |
|             Atualizado             |      Data+Hora       |   (SYSDATE)    |                     |                                                  |             Date this record was updated             |                                                  The Updated field indicates the date that this record was updated.                                                  |
|           Atualizado por           |        Tabela        |    AD\_User    |                     |                                                  |            User who updated this records             |                                                   The Updated By field indicates the user who updated this record.                                                   |

</div>

</div>

  

</div>
