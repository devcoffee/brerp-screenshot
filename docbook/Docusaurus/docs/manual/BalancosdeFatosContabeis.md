---
title: "Balanços de Fatos Contábeis"
id: BalancosdeFatosContabeis
---
<div id="d16222e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Balanços de Fatos Contábeis

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Balanços Diários -
    Fact\_Acct\_Balance](#d16222e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Questionar Balanços
Contábeis Diários

<span class="emphasis">*Comentário/Ajuda:* </span>Questionar balanços de
contas diários

<span class="emphasis"> *Criado em:* </span>2003-04-18 15:39:50.0

<span class="emphasis">*Atualizado em:* </span>2005-02-09 22:07:42.0

![](/img/manual/BalancosdeFatosContabeis.png)

<div id="d16222e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Balanços Diários - Fact\_Acct\_Balance

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Visualização dos balanços
contábeis diários

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d16222e34" class="table">

<div class="table-title">

Table 1.1. Daily Balances
Fields

</div>

<div class="table-contents">

|         Nome do campo          |  Referência   |                         Valores (Padrão)                          | Chave restritiva |                Regra de validação                |                   Descrição                   |                                                                                                                           Comentário/Ajuda                                                                                                                            |
| :----------------------------: | :-----------: | :---------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Ativo              |    Sim-Não    |                                (Y)                                |                  |                                                  |      (semelhante ao primeiro relatório)       |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|            Empresa             | Tabela Direta |                       (@\#AD\_Client\_ID@)                        |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)       |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|          Organização           | Tabela Direta |                         (@\#AD\_Org\_ID@)                         |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)       |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|        Esquema Contábil        | Tabela Direta |                                                                   |                  |                                                  |             Rules for accounting              |                                                                                An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                                                |
|         Data da Conta          |     Data      |                                                                   |                  |                                                  |                Accounting Date                |                                                  The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                   |
|       Tipo de Lançamento       |     Lista     | Real Orçamento Encerramento Comprometimento Reservas Estatísticas |                  |                                                  | The type of posted amount for the transaction |                                                                         The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                                                                         |
|             Conta              |    Tabela     |                       C\_ElementValue (all)                       |                  |                                                  |                 Account used                  |                                                                                                                      The (natural) account used                                                                                                                       |
|           Sub Conta            | Tabela Direta |                                                                   |                  |                                                  |         Sub account for Element Value         | The Element Value (e.g. Account) may have optional sub accounts for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension. |
|      Parceiro de Negócios      |   Procurar    |                                                                   |                  |                                                  |         Identifies a Business Partner         |                                                                            A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                            |
|            Produto             |   Procurar    |                                                                   |                  |                                                  |            Product, Service, Item             |                                                                                              Identifies an item which is either purchased or sold in this organization.                                                                                               |
|            Projeto             | Tabela Direta |                                                                   |                  |                                                  |               Financial Project               |                                                                                              A Project allows you to track and control internal or external activities.                                                                                               |
|        Região de Vendas        | Tabela Direta |                                                                   |                  |                                                  |             Sales coverage region             |                                                                                                     The Sales Region indicates a specific area of sales coverage.                                                                                                     |
|            Campanha            | Tabela Direta |                                                                   |                  |                                                  |              Marketing Campaign               |                                                 The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                                                  |
| Organização de Transação (Trx) |    Tabela     |                           AD\_Org (all)                           |                  |                                                  |     Performing or initiating organization     |      The organization which performs or initiates this transaction (for another organization). The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.       |
|     Localização de Origem      |    Tabela     |                            C\_Location                            |                  |                                                  |    Location that inventory was moved from     |                                                                                                The Location From indicates the location that a product was moved from.                                                                                                |
|     Localização de Destino     |    Tabela     |                            C\_Location                            |                  |                                                  |     Location that inventory was moved to      |                                                                                                  The Location To indicates the location that a product was moved to.                                                                                                  |
|           Atividade            | Tabela Direta |                                                                   |                  |                                                  |               Business Activity               |                                                                                        Activities indicate tasks that are performed and used to utilize Activity based Costing                                                                                        |
|        Centro de Custo         |    Tabela     |                        Account\_ID - User1                        |                  |                                                  |         User defined list element \#1         |                                                                             The user defined element displays the optional elements that have been defined for this account combination.                                                                              |
|       Centro de Custo 2        |    Tabela     |                        Account\_ID - User2                        |                  |                                                  |         User defined list element \#2         |                                                                             The user defined element displays the optional elements that have been defined for this account combination.                                                                              |
|     Elemento do Usuário 1      |      ID       |                                                                   |                  |                                                  |        User defined accounting Element        |  A user defined accounting element referres to a iDempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task). Note that User Elements are optional and are populated from the context of the document (i.e. not requested)   |
|     Elemento do Usuário 2      |      ID       |                                                                   |                  |                                                  |        User defined accounting Element        |  A user defined accounting element referres to a iDempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task). Note that User Elements are optional and are populated from the context of the document (i.e. not requested)   |
|           Orçamento            | Tabela Direta |                                                                   |                  |                                                  |             General Ledger Budget             |                                                                The General Ledger Budget identifies a user defined budget. These can be used in reporting as a comparison against your actual amounts.                                                                |
|      Débito Contabilizado      |     Valor     |                                                                   |                  |                                                  |            Accounted Debit Amount             |                                                                            The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency                                                                             |
|     Crédito Contabilizado      |     Valor     |                                                                   |                  |                                                  |            Accounted Credit Amount            |                                                                            The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency                                                                            |
|           Quantidade           |  Quantidade   |                                                                   |                  |                                                  |                   Quantity                    |                                                                                          The Quantity indicates the number of a specific product or item for this document.                                                                                           |

</div>

</div>

  

</div>
