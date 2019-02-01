---
title: "Balancete de Verificação Analítico"
id: BalancetedeVerificacaoAnaliticoRpt
---
<div id="d15707e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Balancete de Verificação Analítico

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-10-08 01:03:54.0

<span class="emphasis">*Atualizado:*</span>2005-10-24 08:11:58.0

<span class="emphasis"> *Descrição:* </span>Balancete de Verificação
para um período ou intervalo de datas

<span class="emphasis"> *Comentário/Ajuda:* </span>Selecione um Período
(período atual se vazio) ou digite uma Faixas de Datas Contábeis. Se uma
conta for selecionada, o balanço será calculado baseado no tipo de conta
e no calendário primário da empresa (i.e. para contas de
receitas/despesas a partir do início do ano). Se nenhuma conta for
selecionada, o balanço será a soma de todas as transações antes da Faixa
de Datas Contábeis ou o primeiro dia do período selecionado. Você pode
selecionar uma Hierarquia de Relatórios alternativa.

<span class="emphasis"> *ReportView:* </span>T\_TrialBalance

![](/img/manual/BalancetedeVerificacaoAnalitico.png)

<div id="d15707e26" class="table">

<div class="table-title">

Table 1.1. BalancetedeVerificacaoAnalitico
Parâmetros

</div>

<div class="table-contents">

|           Nome           |   Nome da coluna   |      Referência      |                            Valores(Padrão)                            |                                                   Descrição                                                   |                                                                                                                   Comentário/Ajuda                                                                                                                   |
| :----------------------: | :----------------: | :------------------: | :-------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Atividade         |  C\_Activity\_ID   |    Tabela Direta     |                                                                       |                                             Atividade de Negócio                                              |                                                                        "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                                                         |
|         Campanha         |  C\_Campaign\_ID   |    Tabela Direta     |                                                                       |                                             Campanha de Marketing                                             |                      A "Campanha" define um programa exclusivo de marketing. Os projetos podem ser associados com uma Campanha de Marketing pré-definida. Você pode então fazer relatórios baseados em uma Campanha específica.                      |
|     Esquema Contábil     | C\_AcctSchema\_ID  |    Tabela Direta     |                                                                       |                                           Regras para contabilidade                                           |                                                               Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                |
|       Organização        |    AD\_Org\_ID     |    Tabela Direta     |                                                                       |                                   Entidade organizacional dentro da Empresa                                   |                                             Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                              |
| Hierarquia de Relatórios | PA\_Hierarchy\_ID  |    Tabela Direta     |                                                                       | Hierarquia de Relatórios Opcional - Se não for selecionado, as árvores de hierarquia padrão serão utilizadas. | A Hierarquia de Relatórios permite a você selecionar diferentes Hierarquias/Árvores para o relatório. Segmentos contábeis tais como Organização (Divisão), Conta, Produto podem ter diversas hierarquias para acomodar diferentes visões do negócio. |
|   Período (Ano Fiscal)   |   C\_Period\_ID    |        Tabela        |                            C\_Period (all)                            |                                             Período do Calendário                                             |                                                                                         O "Período" indica uma faixa exclusiva de datas para um calendário.                                                                                          |
|     Centro de Custo      |     User1\_ID      |        Tabela        |                          Account\_ID - User1                          |                                                Centro de Custo                                                |                                                                      O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                      |
|    Centro de Custo 2     |     User2\_ID      |        Tabela        |                          Account\_ID - User2                          |                                              Centro de Custo \#2                                              |                                                                      O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                      |
|          Conta           |    Account\_ID     |       Procurar       |                              Account\_ID                              |                                                Conta utilizada                                                |                                                                                                             A Conta (natural) utilizada                                                                                                              |
|   Parceiro de Negócios   |  C\_BPartner\_ID   |       Procurar       |                                                                       |                                      Identifica um Parceiro de Negócios.                                      |                                         Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                         |
|         Produto          |   M\_Product\_ID   |       Procurar       |                                                                       |                                            Produto, Serviço, Item                                             |                                                                                        Identifica um item que é ou comprado ou vendido por esta organização.                                                                                         |
|         Projeto          |   C\_Project\_ID   |       Procurar       |                                                                       |                                              Projeto Financeiro                                               |                                                                                  Um "Projeto" permite a você rastrear e controlar atividades internas ou externas.                                                                                   |
|     Região de Vendas     | C\_SalesRegion\_ID |       Procurar       |                                                                       |                                         Cobertura da Região de Vendas                                         |                                                                                       A "Região de Vendas" indica uma área específica de cobertura de vendas.                                                                                        |
|    Tipo de Lançamento    |    PostingType     |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A) |                                  É o tipo de valor lançado para a transação                                   |                                                           O campo "Tipo de Lançamento" indica o tipo do montante (Real, Orçamento, Reserva, Comprometimento, Estatística) desta transação.                                                           |
|  Chave de Contabilidade  |    AccountValue    | Texto Curto (String) |                                                                       |                                         Chave de um Elemento Contábil                                         |                                                                                                                         null                                                                                                                         |
|      Data da Conta       |      DateAcct      |         Data         |                                                                       |                                                 Data Contábil                                                 |                                         A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                         |

</div>

</div>

  

<div id="d15707e259" class="table">

<div class="table-title">

Table 1.2. T\_TrialBalance -
Colunas

</div>

<div class="table-contents">

|         Nome da coluna         |      Referência      |                          Valores padrão                           |       Valor de restrição       |                Regra de validação                |                   Descrição                   |                                                                                                                      Comentário/Ajuda                                                                                                                      |
| :----------------------------: | :------------------: | :---------------------------------------------------------------: | :----------------------------: | :----------------------------------------------: | :-------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Ativo              |    Tabela Direta     |                                                                   |                                |                                                  |     Asset used internally or by customers     |                                                                An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                |
|             Conta              |        Tabela        |                         Account\_ID (Trx)                         |                                |                                                  |                 Account used                  |                                                                                                                 The (natural) account used                                                                                                                 |
|     Chave de Contabilidade     | Texto Curto (String) |                                                                   |                                |                                                  |            Key of Account Element             |                                                                                                                                                                                                                                                            |
|            Empresa             |    Tabela Direta     |                                                                   |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |                  (ver acima)                  |                                                                                                                        (ver acima)                                                                                                                         |
|          Organização           |    Tabela Direta     |                                                                   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                  (ver acima)                  |                                                                                                                        (ver acima)                                                                                                                         |
| Organização de Transação (Trx) |        Tabela        |                           AD\_Org (Trx)                           |                                |                                                  |     Performing or initiating organization     | The organization which performs or initiates this transaction (for another organization). The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions. |
|     Instância de Processo      |    Tabela Direta     |                                                                   | ad\_pinstance\_t\_trialbalance |                                                  |            Instance of the process            |                                                                                                                                                                                                                                                            |
|             Tabela             |    Tabela Direta     |                                                                   |                                |                                                  |          Database Table information           |                                                                                            The Database Table provides the information of the table definition                                                                                             |
|      Saldo Contabilizado       |        Valor         |                                                                   |                                |                                                  |           Accounted Balance Amount            |                                                                      The Account Balance Amount indicates the transaction amount converted to this organization's accounting currency                                                                      |
|     Crédito Contabilizado      |        Valor         |                                                                   |                                |                                                  |            Accounted Credit Amount            |                                                                      The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency                                                                       |
|      Débito Contabilizado      |        Valor         |                                                                   |                                |                                                  |            Accounted Debit Amount             |                                                                       The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency                                                                       |
|        Saldo de Origem         |        Valor         |                                                                   |                                |                                                  |             Source Balance Amount             |                                                                                The Source Balance Amount indicates the balance amount for this line in the source currency.                                                                                |
|       Crédito de Origem        |        Valor         |                                                                   |                                |                                                  |             Source Credit Amount              |                                                                                 The Source Credit Amount indicates the credit amount for this line in the source currency.                                                                                 |
|        Débito de Origem        |        Valor         |                                                                   |                                |                                                  |              Source Debit Amount              |                                                                                 The Source Debit Amount indicates the credit amount for this line in the source currency.                                                                                  |
|        Esquema Contábil        |    Tabela Direta     |                                                                   |                                |                                                  |             Rules for accounting              |                                                                          An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                                           |
|           Atividade            |    Tabela Direta     |                                                                   |                                |                                                  |               Business Activity               |                                                                                  Activities indicate tasks that are performed and used to utilize Activity based Costing                                                                                   |
|      Parceiro de Negócios      |       Procurar       |                                                                   |                                |                                                  |         Identifies a Business Partner         |                                                                      A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                       |
|            Campanha            |       Procurar       |                                                                   |                                |                                                  |              Marketing Campaign               |                                            The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                                            |
|            Moeda De            |       Procurar       |                                                                   |                                |                                                  |         The Currency for this record          |                                                                                       Indicates the Currency to be used when processing or reporting on this record                                                                                        |
|     Localização de Origem      |        Tabela        |                            C\_Location                            |                                |                                                  |    Location that inventory was moved from     |                                                                                          The Location From indicates the location that a product was moved from.                                                                                           |
|     Localização de Destino     |        Tabela        |                            C\_Location                            |                                |                                                  |     Location that inventory was moved to      |                                                                                            The Location To indicates the location that a product was moved to.                                                                                             |
|       Descrição da Conta       | Texto Curto (String) |                                                                   |                                |                                                  |                                               |                                                                                                                                                                                                                                                            |
|      Período (Ano Fiscal)      |    Tabela Direta     |                                                                   |                                |                                                  |            Period of the Calendar             |                                                                                              The Period indicates an exclusive range of dates for a calendar.                                                                                              |
|            Projeto             |       Procurar       |                                                                   |                                |                                                  |               Financial Project               |                                                                                         A Project allows you to track and control internal or external activities.                                                                                         |
|             Criado             |      Data+Hora       |                             (SYSDATE)                             |                                |                                                  |         Date this record was created          |                                                                                             The Created field indicates the date that this record was created.                                                                                             |
|           Criado por           |        Tabela        |                             AD\_User                              |                                |                                                  |         User who created this records         |                                                                                              The Created By field indicates the user who created this record.                                                                                              |
|        Região de Vendas        |       Procurar       |                                                                   |                                |                                                  |             Sales coverage region             |                                                                                               The Sales Region indicates a specific area of sales coverage.                                                                                                |
|              Taxa              |       Procurar       |                                                                   |                                |                                                  |                Tax identifier                 |                                                                                                  The Tax indicates the type of tax used in document line.                                                                                                  |
|              UDM               |       Procurar       |                                                                   |                                |                                                  |                Unit of Measure                |                                                                                                   The UOM defines a unique non monetary Unit of Measure                                                                                                    |
|         Data da Conta          |         Data         |                                                                   |                                |                                                  |                Accounting Date                |                                             The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                             |
|       Data da Transação        |         Data         |                                                                   |                                |                                                  |               Transaction Date                |                                                                                                The Transaction Date indicates the date of the transaction.                                                                                                 |
|           Descrição            | Texto Curto (String) |                                                                   |                                |                                                  |   Optional short description of the record    |                                                                                                        A description is limited to 255 characters.                                                                                                         |
|         Fato Contábil          |          ID          |                                                                   |                                |                                                  |                                               |                                                                                                                                                                                                                                                            |
|           Orçamento            |       Procurar       |                                                                   |                                |                                                  |             General Ledger Budget             |                                                          The General Ledger Budget identifies a user defined budget. These can be used in reporting as a comparison against your actual amounts.                                                           |
|    Categoria de Razão Geral    |       Procurar       |                                                                   |                                |                                                  |            General Ledger Category            |                                                                                 The General Ledger Category is an optional, user defined method of grouping journal lines.                                                                                 |
|          ID de Linha           |          ID          |                                                                   |                                |                                                  |        Transaction line ID (internal)         |                                                                                                                       Internal link                                                                                                                        |
|          Localizador           |    Tabela Direta     |                                                                   |                                |                                                  |               Warehouse Locator               |                                                                                              The Locator indicates where in a Warehouse a product is located.                                                                                              |
|            Produto             |       Procurar       |                                                                   |                                |                                                  |            Product, Service, Item             |                                                                                         Identifies an item which is either purchased or sold in this organization.                                                                                         |
|       Tipo de Lançamento       |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas |                                |                                                  | The type of posted amount for the transaction |                                                                   The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                                                                    |
|           Quantidade           |      Quantidade      |                                                                   |                                |                                                  |                   Quantity                    |                                                                                     The Quantity indicates the number of a specific product or item for this document.                                                                                     |
|         ID do Registro         |        Botão         |                                                                   |                                |                                                  |           Direct internal record ID           |                    The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.                    |
|           Atualizado           |      Data+Hora       |                             (SYSDATE)                             |                                |                                                  |         Date this record was updated          |                                                                                             The Updated field indicates the date that this record was updated.                                                                                             |
|         Atualizado por         |        Tabela        |                             AD\_User                              |                                |                                                  |         User who updated this records         |                                                                                              The Updated By field indicates the user who updated this record.                                                                                              |
|        Centro de Custo         |        Tabela        |                        Account\_ID - User1                        |                                |                                                  |         User defined list element \#1         |                                                                        The user defined element displays the optional elements that have been defined for this account combination.                                                                        |
|       Centro de Custo 2        |        Tabela        |                        Account\_ID - User2                        |                                |                                                  |         User defined list element \#2         |                                                                        The user defined element displays the optional elements that have been defined for this account combination.                                                                        |

</div>

</div>

  

</div>