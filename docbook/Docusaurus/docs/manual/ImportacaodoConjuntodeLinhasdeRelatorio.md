---
title: "Importação do Conjunto de Linhas de Relatório"
id: ImportacaodoConjuntodeLinhasdeRelatorio
---
<div id="d114138e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importação do Conjunto de Linhas de Relatório

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Importação do Conjunto de Linhas
    de Relatório - I\_ReportLine](#d114138e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importação de Conjuntos de
Linhas de Relatório

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Importação
do Conjunto de Linhas de Relatório" é uma tabela interina que é
utilizada ao importar dados externos para dentro do sistema. Selecionar
o botão 'Processar' vai acrescentar ou modificar os registros
apropriados.

<span class="emphasis"> *Criado em:* </span>2003-01-11 16:30:16.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02
00:00:00.0

<div id="d114138e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Importação do Conjunto de Linhas de Relatório - I\_ReportLine

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d114138e29" class="table">

<div class="table-title">

Table 1.1. Import Report Line Set
Fields

</div>

<div class="table-contents">

|                 Nome do campo                 |      Referência      |                                                                                                                      Valores (Padrão)                                                                                                                       |       Chave restritiva       |                Regra de validação                |                       Descrição                       |                                                                                                                                     Comentário/Ajuda                                                                                                                                     |
| :-------------------------------------------: | :------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                     Ativo                     |       Sim-Não        |                                                                                                                             (Y)                                                                                                                             |                              |                                                  |          (semelhante ao primeiro relatório)           |                                                                                                                                   (ver o mesmo acima)                                                                                                                                    |
| Importação do Conjunto de Linhas de Relatório |          ID          |                                                                                                                                                                                                                                                             |                              |                                                  |             Import Report Line Set values             |                                                                                                                                                                                                                                                                                          |
|                   Importado                   |       Sim-Não        |                                                                                                                                                                                                                                                             |                              |                                                  |            Has this import been processed             |                                                                                                           The Imported check box indicates if this import has been processed.                                                                                                            |
|        Mensagem de Erro de Importação         | Texto Curto (String) |                                                                                                                                                                                                                                                             |                              |                                                  |        Messages generated from import process         |                                                                                                The Import Error Message displays any error messages generated during the import process.                                                                                                 |
|                    Empresa                    |    Tabela Direta     |                                                                                                                    (@\#AD\_Client\_ID@)                                                                                                                     |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                                                                                                   (ver o mesmo acima)                                                                                                                                    |
|                  Organização                  |    Tabela Direta     |                                                                                                                      (@\#AD\_Org\_ID@)                                                                                                                      |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                                                                                                   (ver o mesmo acima)                                                                                                                                    |
|    Nome do Conjunto de Linhas de Relatório    | Texto Curto (String) |                                                                                                                                                                                                                                                             |                              |                                                  |              Name of the Report Line Set              |                                                                                                                                                                                                                                                                                          |
|        Conjunto de Linhas de Relatório        |    Tabela Direta     |                                                                                                                                                                                                                                                             | pareportlineset\_ireportline |                                                  |                                                       |                                                                                                                                                                                                                                                                                          |
|              Linha de Relatório               |    Tabela Direta     |                                                                                                                                                                                                                                                             |  pareportline\_ireportline   |                                                  |                                                       |                                                                                                                                                                                                                                                                                          |
|                     Nome                      | Texto Curto (String) |                                                                                                                                                                                                                                                             |                              |                                                  |         Alphanumeric identifier of the entity         |                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                       |
|                   Descrição                   | Texto Curto (String) |                                                                                                                                                                                                                                                             |                              |                                                  |       Optional short description of the record        |                                                                                                                       A description is limited to 255 characters.                                                                                                                        |
|                   Seqüência                   |       Inteiro        |                                                                                                                                                                                                                                                             |                              |                                                  | Method of ordering records; lowest number comes first |                                                                                                                       The Sequence indicates the order of records                                                                                                                        |
|                Nível de Resumo                |       Sim-Não        |                                                                                                                                                                                                                                                             |                              |                                                  |               This is a summary entity                |                                                                       A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                        |
|                   Impresso                    |       Sim-Não        |                                                                                                                                                                                                                                                             |                              |                                                  |     Indicates if this document / line is printed      |                                                                                                   The Printed checkbox indicates if this document or line will included when printing.                                                                                                   |
|              Tipo de Lançamento               |        Lista         |                                                                                              Real Orçamento Encerramento Comprometimento Reservas Estatísticas                                                                                              |                              |                                                  |     The type of posted amount for the transaction     |                                                                                  The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                                                                                   |
|                 Tipo de Valor                 |        Lista         |                                                                 Balance (expected sign) Credit Only Debit Only Quantity (expected sign) Quantity (accounted sign) Balance (accounted sign)                                                                  |                              |                                                  |             PA Amount Type for reporting              | The amount type to report on: Quantity, Credit Only, Debit Only, Balance (expected sign) or Balance (accounted sign). "Expected sign" adjusts the sign of the result based on the Account Type and Expected Sign of each Account Element, whereas "accounted sign" always returns DR-CR. |
|                  Amount Type                  |        Lista         | Natural Balance Saldo do Período Saldo Total Saldo Anual Somente Crédito do Período Somente Crédito Total Somente Crédito Anual Somente Débito do Período Somente Débito Total Somente Débito Anual Quantidade do Período Quantidade Total Quantidade Anual |                              |                                                  |               Type of amount to report                |                                                                                       You can choose between the total and period amounts as well as the balance or just the debit/credit amounts.                                                                                       |
|                 Período Tipo                  |        Lista         |                                                                                                                  Natural Period Total Year                                                                                                                  |                              |                                                  |                    PA Period Type                     |                                                                           The Period Type to report on: Period, Year, Total or Natural. Natural = Year for P %26 L accounts, Total for Balance Sheet accounts.                                                                           |
|                 Tipo de Linha                 |        Lista         |                                                                                                                  Cálculo Valor do Segmento                                                                                                                  |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                          |
|                    Cálculo                    |        Lista         |                                                                                     Soma (Op1+Op2) Percentagem (Op1 de Op2) Faixa de Soma (Op1 a Op2) Subtrai (Op1-Op2)                                                                                     |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                          |
|              Origem de Relatório              |    Tabela Direta     |                                                                                                                                                                                                                                                             | pareportsource\_ireportline  |                                                  |   Restriction of what will be shown in Report Line    |                                                                                                                                                                                                                                                                                          |
|               Chave do Elemento               | Texto Curto (String) |                                                                                                                                                                                                                                                             |                              |                                                  |                  Key of the element                   |                                                                                                                                                                                                                                                                                          |
|              Elemento de Contas               |    Tabela Direta     |                                                                                                                                                                                                                                                             |  celementvalue\_ireportline  |                                                  |                    Account Element                    |                                                                                                             Account Elements can be natural accounts or user defined values.                                                                                                             |
| Importação do Conjunto de Linhas de Relatório |        Botão         |                                                                                                                                                                                                                                                             |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                          |
|                  Processado                   |       Sim-Não        |                                                                                                                                                                                                                                                             |                              |                                                  |            The document has been processed            |                                                                                                           The Processed checkbox indicates that a document has been processed.                                                                                                           |
|               I\_ReportLine\_UU               | Texto Curto (String) |                                                                                                                                                                                                                                                             |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
