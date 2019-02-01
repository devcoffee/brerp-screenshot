---
title: "Importar Lista de Preços"
id: ImportarListadePrecos
---
<div id="d116552e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Lista de Preços

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Importar Lista de Preços -
    I\_PriceList](#d116552e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importar Lista de Preços

<span class="emphasis">*Comentário/Ajuda:* </span>The Import Price List
Window is an interim table which is used when importing external data
into the system. Selecting the 'Process' button will either add or
modify the appropriate records.

<span class="emphasis"> *Criado em:* </span>2009-03-17 23:16:39.0

<span class="emphasis">*Atualizado em:* </span>2009-03-17 23:16:39.0

![](/img/manual/ImportarListadePrecos.png)

<div id="d116552e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Importar Lista de Preços - I\_PriceList

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Importar Lista de Preços

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d116552e34" class="table">

<div class="table-title">

Table 1.1. Import Price List
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |   Valores (Padrão)   |       Chave restritiva        |                Regra de validação                |                  Descrição                   |                                                                                       Comentário/Ajuda                                                                                        |
| :----------------------------: | :------------------: | :------------------: | :---------------------------: | :----------------------------------------------: | :------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Ativo              |       Sim-Não        |         (Y)          |                               |                                                  |      (semelhante ao primeiro relatório)      |                                                                                      (ver o mesmo acima)                                                                                      |
|    Importar Lista de Preços    |          ID          |                      |                               |                                                  |                                              |                                                                                                                                                                                               |
|           Importado            |       Sim-Não        |         (N)          |                               |                                                  |        Has this import been processed        |                                                              The Imported check box indicates if this import has been processed.                                                              |
|         Lista de Preço         |    Tabela Direta     |                      |    mpricelist\_ipricelist     |                                                  |      Unique identifier of a Price List       |                                                  Price Lists are used to determine the pricing, margin and cost of items purchased or sold.                                                   |
| Mensagem de Erro de Importação | Texto Curto (String) |                      |                               |                                                  |    Messages generated from import process    |                                                   The Import Error Message displays any error messages generated during the import process.                                                   |
|            Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                                                                                      (ver o mesmo acima)                                                                                      |
|          Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                                                                                      (ver o mesmo acima)                                                                                      |
|              Nome              | Texto Curto (String) |                      |                               |                                                  |    Alphanumeric identifier of the entity     |                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                          |
|           Descrição            | Texto Curto (String) |                      |                               |                                                  |   Optional short description of the record   |                                                                          A description is limited to 255 characters.                                                                          |
|      Código de Moeda ISO       | Texto Curto (String) |                      |                               |                                                  |  Three letter ISO 4217 Code of the Currency  |                                                                   For details - http://www.unece.org/trade/rec/rec09en.htm                                                                    |
|            Moeda De            |    Tabela Direta     |                      |     ccurrency\_ipricelist     |                                                  |         The Currency for this record         |                                                         Indicates the Currency to be used when processing or reporting on this record                                                         |
|       Precisão de Preço        |       Inteiro        |                      |                               |                                                  | Precision (number of decimals) for the Price | The prices of the price list are rounded to the precision entered. This allows to have prices with below currency precision, e.g. $0.005. Enter the number of decimals or -1 for no rounding. |
|    Lista de Preço de Vendas    |       Sim-Não        |                      |                               |                                                  |          This is a Sales Price List          |                                                  The Sales Price List check box indicates if this price list is used for sales transactions.                                                  |
|      Preço Inclui Imposto      |       Sim-Não        |                      |                               |                                                  |         Tax is included in the price         |                                             The Tax Included checkbox indicates if the prices include tax. This is also known as the gross price.                                             |
|     Impor Limite de Preço      |       Sim-Não        |                      |                               |                                                  |  Do not allow prices below the limit price   |               The Enforce Price Limit check box indicates that prices cannot be below the limit price in Orders and Invoices. This can be overwritten, if the role allows this.               |
|    Versão da Lista de Preço    |    Tabela Direta     |                      | mpricelistversion\_ipricelist |                                                  | Identifies a unique instance of a Price List |                                   Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for.                                    |
|          Válido desde          |         Data         |                      |                               |                                                  |  Valid from including this date (first day)  |                                                                  The Valid From date indicates the first day of a date range                                                                  |
|        Chave de Produto        | Texto Curto (String) |                      |                               |                                                  |              Key of the Product              |                                                                                                                                                                                               |
|            Produto             |    Tabela Direta     |                      |     mproduct\_ipricelist      |                                                  |            Product, Service, Item            |                                                          Identifies an item which is either purchased or sold in this organization.                                                           |
|         Preço de Lista         |    Custos+Preços     |                      |                               |                                                  |                  List Price                  |                                                              The List Price is the official List Price in the document currency.                                                              |
|          Preço Padrão          |    Custos+Preços     |                      |                               |                                                  |                Standard Price                |                                                  The Standard Price indicates the standard or normal price for a product on this price list                                                   |
|          Preço Limite          |    Custos+Preços     |                      |                               |                                                  |          Lowest price for a product          |                                                  The Price Limit indicates the lowest price for a product stated in the Price List Currency.                                                  |
| Chave de Parceiro de Negócios  | Texto Curto (String) |                      |                               |                                                  |       The Key of the Business Partner        |                                                                                                                                                                                               |
|      Parceiro de Negócios      |       Procurar       |                      |     cbpartner\_ipricelist     |                                                  |        Identifies a Business Partner         |                                        A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                        |
|       Ponto de Inflexão        |        Número        |                      |                               |                                                  |   Low Value of trade discount break level    |                                                                       Starting Quantity or Amount Value for break level                                                                       |
|           Código UDM           | Texto Curto (String) |                      |                               |                                                  |               UOM EDI X12 Code               |                                             The Unit of Measure Code indicates the EDI X12 Code Data Element 355 (Unit or Basis for Measurement)                                              |
|              UDM               |    Tabela Direta     |                      |       cuom\_ipricelist        |                                                  |               Unit of Measure                |                                                                     The UOM defines a unique non monetary Unit of Measure                                                                     |
|    Importar Lista de Preços    |        Botão         |                      |                               |                                                  |                                              |                                                                                                                                                                                               |
|           Processado           |       Sim-Não        |         (N)          |                               |                                                  |       The document has been processed        |                                                             The Processed checkbox indicates that a document has been processed.                                                              |
|        I\_PriceList\_UU        | Texto Curto (String) |                      |                               |                                                  |                                              |                                                                                                                                                                                               |

</div>

</div>

  

</div>
