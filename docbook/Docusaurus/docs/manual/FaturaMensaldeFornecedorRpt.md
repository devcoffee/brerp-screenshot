---
title: "Fatura Mensal de Fornecedor"
id: FaturaMensaldeFornecedorRpt
---
<div id="d100318e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Fatura Mensal de Fornecedor

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-06-01 16:57:47.0

<span class="emphasis">*Atualizado:*</span>2008-12-02 12:03:00.0

<span class="emphasis"> *Descrição:* </span>Relatório Mensal de Fatura
de Fornecedor por Produto

<span class="emphasis"> *Comentário/Ajuda:* </span>Valor Faturado por
Fornecedor e Categoria de Produto

<span class="emphasis"> *ReportView:* </span>RV\_C\_Invoice\_VendorMonth

![](/img/manual/FaturaMensaldeFornecedor.png)

<div id="d100318e26" class="table">

<div class="table-title">

Table 1.1. FaturaMensaldeFornecedor
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna      |  Referência   |   Valores(Padrão)   |                 Descrição                 |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :----------------------: | :-----------: | :-----------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Parceiro de Negócios |     C\_BPartner\_ID      |   Procurar    | C\_BPartner Vendors |    Identifica um Parceiro de Negócios.    | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
| Categoria de Produto | M\_Product\_Category\_ID | Tabela Direta |         (0)         |          Categoria de um Produto          |                       Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                       |
|     Organização      |       AD\_Org\_ID        | Tabela Direta |                     | Entidade organizacional dentro da Empresa |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
|    Data Faturada     |       DateInvoiced       |     Data      |                     |   Data impressa na Fatura (Nota Fiscal)   |                                                   A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                    |

</div>

</div>

  

<div id="d100318e103" class="table">

<div class="table-title">

Table 1.2. RV\_C\_Invoice\_VendorMonth -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna      |  Referência   | Valores padrão | Valor de restrição |                Regra de validação                |                                  Descrição                                  |                                                                                                                       Comentário/Ajuda                                                                                                                       |
| :---------------------: | :-----------: | :------------: | :----------------: | :----------------------------------------------: | :-------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         | Tabela Direta |                |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                                 (ver acima)                                 |                                                                                                                         (ver acima)                                                                                                                          |
|       Organização       | Tabela Direta |                |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                 (ver acima)                                 |                                                                                                                         (ver acima)                                                                                                                          |
|  Parceiro de Negócios   |   Procurar    |                |                    |                                                  |                        Identifies a Business Partner                        |                                                                       A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                        |
|      Data Faturada      |     Data      |                |                    |                                                  |                           Date printed on Invoice                           |                                                                                                 The Date Invoice indicates the date printed on the invoice.                                                                                                  |
|   Desconto da Linha %   |    Número     |                |                    |                                                  |                        Line Discount as a percentage                        |                                                                                       The Line Discount Percent indicates the discount for this line as a percentage.                                                                                        |
|    Desconto da Linha    |     Valor     |                |                    |                                                  |                            Line Discount Amount                             |                                                                                                      Indicates the discount for this line as an amount.                                                                                                      |
|  Valor Limite da Linha  |     Valor     |                |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
| Valor da Lista de Linha |     Valor     |                |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|     Valor da Linha      |     Valor     |                |                    |                                                  | Line Extended Amount (Quantity \* Actual Price) without Freight and Charges | Indicates the extended line amount based on the quantity and the actual price. Any additional charges or freight are not included. The Amount may or may not include tax. If the price list is inclusive tax, the line amount is the same as the line total. |
|     Margem Bruta %      |    Número     |                |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|      Margem Bruta       |     Valor     |                |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|  Categoria de Produto   | Tabela Direta |                |                    |                                                  |                            Category of a Product                            |                                                                        Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                                         |
|   Quantidade Faturada   |  Quantidade   |                |                    |                                                  |                              Invoiced Quantity                              |                                                                                      The Invoiced Quantity indicates the quantity of a product that have been invoiced.                                                                                      |

</div>

</div>

  

</div>
