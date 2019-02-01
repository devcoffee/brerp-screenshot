---
title: "Faturamento Trimestral por produto"
id: FaturamentoTrimestralporprodutoRpt
---
<div id="d101103e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Faturamento Trimestral por produto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2005-12-15 14:51:18.0

<span class="emphasis">*Atualizado:*</span>2008-12-02 12:03:00.0

<span class="emphasis"> *Descrição:* </span>Relatório de faturas
trimestrais por produto

<span class="emphasis"> *Comentário/Ajuda:* </span>Total faturado por
produtos no trimestre

<span class="emphasis"> *ReportView:* </span>RV\_C\_Invoice\_ProductQtr

![](/img/manual/FaturamentoTrimestralporproduto.png)

<div id="d101103e26" class="table">

<div class="table-title">

Table 1.1. FaturamentoTrimestralporproduto
Parâmetros

</div>

<div class="table-contents">

|        Nome         | Nome da coluna | Referência | Valores(Padrão) |               Descrição               |                                      Comentário/Ajuda                                       |
| :-----------------: | :------------: | :--------: | :-------------: | :-----------------------------------: | :-----------------------------------------------------------------------------------------: |
|       Produto       | M\_Product\_ID |  Procurar  |                 |        Produto, Serviço, Item         |            Identifica um item que é ou comprado ou vendido por esta organização.            |
| Transação de Vendas |    IsSOTrx     |   Lista    |     Não Sim     |    Esta é uma Transação de Vendas     | A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas. |
|    Data Faturada    |  DateInvoiced  |    Data    |                 | Data impressa na Fatura (Nota Fiscal) |               A "Data Faturada" indica a data impressa na nota-fiscal/fatura.               |

</div>

</div>

  

<div id="d101103e90" class="table">

<div class="table-title">

Table 1.2. RV\_C\_Invoice\_ProductQtr -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna      |  Referência   | Valores padrão | Valor de restrição |        Regra de validação         |                                  Descrição                                  |                                                                                                                       Comentário/Ajuda                                                                                                                       |
| :---------------------: | :-----------: | :------------: | :----------------: | :-------------------------------: | :-------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         | Tabela Direta |                |                    | AD\_Client.AD\_Client\_ID \< \> 0 |                                 (ver acima)                                 |                                                                                                                         (ver acima)                                                                                                                          |
|       Organização       | Tabela Direta |                |                    |                                   |                                 (ver acima)                                 |                                                                                                                         (ver acima)                                                                                                                          |
|      Data Faturada      |     Data      |                |                    |                                   |                           Date printed on Invoice                           |                                                                                                 The Date Invoice indicates the date printed on the invoice.                                                                                                  |
|   Transação de Vendas   |    Sim-Não    |                |                    |                                   |                         This is a Sales Transaction                         |                                                                                        The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                                         |
|   Desconto da Linha %   |    Número     |                |                    |                                   |                        Line Discount as a percentage                        |                                                                                       The Line Discount Percent indicates the discount for this line as a percentage.                                                                                        |
|    Desconto da Linha    |     Valor     |                |                    |                                   |                            Line Discount Amount                             |                                                                                                      Indicates the discount for this line as an amount.                                                                                                      |
|  Valor Limite da Linha  |     Valor     |                |                    |                                   |                                                                             |                                                                                                                                                                                                                                                              |
| Valor da Lista de Linha |     Valor     |                |                    |                                   |                                                                             |                                                                                                                                                                                                                                                              |
|     Valor da Linha      |     Valor     |                |                    |                                   | Line Extended Amount (Quantity \* Actual Price) without Freight and Charges | Indicates the extended line amount based on the quantity and the actual price. Any additional charges or freight are not included. The Amount may or may not include tax. If the price list is inclusive tax, the line amount is the same as the line total. |
|     Margem Bruta %      |    Número     |                |                    |                                   |                                                                             |                                                                                                                                                                                                                                                              |
|      Margem Bruta       |     Valor     |                |                    |                                   |                                                                             |                                                                                                                                                                                                                                                              |
|         Produto         | Tabela Direta |                |                    |                                   |                           Product, Service, Item                            |                                                                                          Identifies an item which is either purchased or sold in this organization.                                                                                          |
|   Quantidade Faturada   |  Quantidade   |                |                    |                                   |                              Invoiced Quantity                              |                                                                                      The Invoiced Quantity indicates the quantity of a product that have been invoiced.                                                                                      |

</div>

</div>

  

</div>
