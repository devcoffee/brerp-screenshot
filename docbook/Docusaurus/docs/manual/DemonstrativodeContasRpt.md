---
title: "Demonstrativo de Contas"
id: DemonstrativodeContasRpt
---
<div id="d42256e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Demonstrativo de Contas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-02-14 15:26:17.0

<span class="emphasis">*Atualizado:*</span>2005-10-24 08:12:22.0

<span class="emphasis"> *Descrição:* </span>Relatório do Balanço Inicial
do Extrato de Contas e Transações

<span class="emphasis"> *Comentário/Ajuda:* </span>Selecione um Período
(período atual se vazio) ou digite uma Faixas de Datas Contábeis. Você
pode selecionar uma Hierarquia de Relatórios alternativa.

<span class="emphasis"> *ReportView:* </span>T\_ReportStatement

![](/img/manual/DemonstrativodeContas.png)

<div id="d42256e26" class="table">

<div class="table-title">

Table 1.1. DemonstrativodeContas
Parâmetros

</div>

<div class="table-contents">

|           Nome           |   Nome da coluna   |  Referência   |                            Valores(Padrão)                            |                                                   Descrição                                                   |                                                                                                                   Comentário/Ajuda                                                                                                                   |
| :----------------------: | :----------------: | :-----------: | :-------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Produto          |   M\_Product\_ID   | Tabela Direta |                                                                       |                                            Produto, Serviço, Item                                             |                                                                                        Identifica um item que é ou comprado ou vendido por esta organização.                                                                                         |
|     Região de Vendas     | C\_SalesRegion\_ID | Tabela Direta |                                                                       |                                         Cobertura da Região de Vendas                                         |                                                                                       A "Região de Vendas" indica uma área específica de cobertura de vendas.                                                                                        |
|   Período (Ano Fiscal)   |   C\_Period\_ID    |    Tabela     |                            C\_Period (all)                            |                                             Período do Calendário                                             |                                                                                         O "Período" indica uma faixa exclusiva de datas para um calendário.                                                                                          |
|     Esquema Contábil     | C\_AcctSchema\_ID  | Tabela Direta |                                                                       |                                           Regras para contabilidade                                           |                                                               Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                |
|     Update Balances      |   UpdateBalances   |    Sim-Não    |                                  (Y)                                  |                      Update Accounting Balances first (not required for subsequent runs)                      |                                                                                                                         null                                                                                                                         |
|        Atividade         |  C\_Activity\_ID   | Tabela Direta |                                                                       |                                             Atividade de Negócio                                              |                                                                        "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                                                         |
|    Centro de Custo 2     |     User2\_ID      |    Tabela     |                          Account\_ID - User2                          |                                              Centro de Custo \#2                                              |                                                                      O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                      |
|       Organização        |    AD\_Org\_ID     | Tabela Direta |                                 (-1)                                  |                                   Entidade organizacional dentro da Empresa                                   |                                             Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                              |
|         Projeto          |   C\_Project\_ID   | Tabela Direta |                                                                       |                                              Projeto Financeiro                                               |                                                                                  Um "Projeto" permite a você rastrear e controlar atividades internas ou externas.                                                                                   |
| Hierarquia de Relatórios | PA\_Hierarchy\_ID  | Tabela Direta |                                                                       | Hierarquia de Relatórios Opcional - Se não for selecionado, as árvores de hierarquia padrão serão utilizadas. | A Hierarquia de Relatórios permite a você selecionar diferentes Hierarquias/Árvores para o relatório. Segmentos contábeis tais como Organização (Divisão), Conta, Produto podem ter diversas hierarquias para acomodar diferentes visões do negócio. |
|     Centro de Custo      |     User1\_ID      |    Tabela     |                          Account\_ID - User1                          |                                                Centro de Custo                                                |                                                                      O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                      |
|          Conta           |    Account\_ID     |    Tabela     |                              Account\_ID                              |                                                Conta utilizada                                                |                                                                                                             A Conta (natural) utilizada                                                                                                              |
|   Parceiro de Negócios   |  C\_BPartner\_ID   | Tabela Direta |                                                                       |                                      Identifica um Parceiro de Negócios.                                      |                                         Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                         |
|         Campanha         |  C\_Campaign\_ID   | Tabela Direta |                                                                       |                                             Campanha de Marketing                                             |                      A "Campanha" define um programa exclusivo de marketing. Os projetos podem ser associados com uma Campanha de Marketing pré-definida. Você pode então fazer relatórios baseados em uma Campanha específica.                      |
|    Tipo de Lançamento    |    PostingType     |     Lista     | Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A) |                                  É o tipo de valor lançado para a transação                                   |                                                           O campo "Tipo de Lançamento" indica o tipo do montante (Real, Orçamento, Reserva, Comprometimento, Estatística) desta transação.                                                           |
|      Data da Conta       |      DateAcct      |     Data      |                                                                       |                                                 Data Contábil                                                 |                                         A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                         |

</div>

</div>

  

<div id="d42256e259" class="table">

<div class="table-title">

Table 1.2. T\_ReportStatement -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna     |      Referência      | Valores padrão |      Valor de restrição       | Regra de validação |                Descrição                 |                                                                          Comentário/Ajuda                                                                          |
| :--------------------: | :------------------: | :------------: | :---------------------------: | :----------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Instância de Processo  |    Tabela Direta     |                | adpinstance\_treportstatement |                    |         Instance of the process          |                                                                                                                                                                    |
| Crédito Contabilizado  |        Valor         |                |                               |                    |         Accounted Credit Amount          |                          The Account Credit Amount indicates the transaction amount converted to this organization's accounting currency                           |
|  Débito Contabilizado  |        Valor         |                |                               |                    |          Accounted Debit Amount          |                           The Account Debit Amount indicates the transaction amount converted to this organization's accounting currency                           |
|         Saldo          |        Valor         |                |                               |                    |                                          |                                                                                                                                                                    |
|     Data da Conta      |         Data         |                |                               |                    |             Accounting Date              | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|       Descrição        | Texto Curto (String) |                |                               |                    | Optional short description of the record |                                                            A description is limited to 255 characters.                                                             |
|     Fato Contábil      |       Procurar       |                |                               |                    |                                          |                                                                                                                                                                    |
|       Nível Núm        |       Inteiro        |                |                               |                    |                                          |                                                                                                                                                                    |
|          Nome          | Texto Curto (String) |                |                               |                    |  Alphanumeric identifier of the entity   |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.            |
|       Quantidade       |      Quantidade      |                |                               |                    |                 Quantity                 |                                         The Quantity indicates the number of a specific product or item for this document.                                         |
| T\_ReportStatement\_UU | Texto Curto (String) |                |                               |                    |                                          |                                                                                                                                                                    |

</div>

</div>

  

</div>
