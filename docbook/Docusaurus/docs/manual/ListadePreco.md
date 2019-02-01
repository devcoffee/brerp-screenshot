---
title: "Lista de Preço"
id: ListadePreco
---
<div id="d137386e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Lista de Preço

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Lista de Preço -
    M\_PriceList](#d137386e23)</span>
  - <span class="section">[2. Tabela: Versão -
    M\_PriceList\_Version](#d137386e299)</span>
  - <span class="section">[3. Tabela: Preço de Produto -
    M\_ProductPrice](#d137386e519)</span>
  - <span class="section">[4. Tabela: Alteração de Preço - Markup -
    COF\_C\_PriceChange](#d137386e726)</span>
  - <span class="section">[5. Tabela: Romper Preço do Produto -
    M\_ProductPriceVendorBreak](#d137386e896)</span>
  - <span class="section">[6. Tabela: Translation -
    M\_PriceList\_Version\_Trl](#d137386e1111)</span>
  - <span class="section">[7. Tabela: Translation -
    M\_PriceList\_Trl](#d137386e1258)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Listas de
Preço

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Lista de
Preço" permite a você gerar Listas de Preços de Produto para seus
Parceiros de Negócios. Listas de Preço determinam a moeda e o tratamento
de impostos. Versões de Listas de Preço permitem manter listas em
paralelo para diferentes faixas de datas (épocas). A versão de lista de
preços mais atual é usada baseada na data do documento. \< BR\> Todas as
listas de preços tem três preços: Lista, Padrão (Normal) e Limite \<
BR\> O primeiro passo é criar uma lista de preços base. Você pode
acrescentar produtos manualmente e digitar os preços ou criá-los
automaticamente. A lista de preços base é freqüentemente a lista de
preços de compra com o "Preço de Lista" (Preço ao consumidor
'oficial'), e o preço padrão (seu preço de compra). O Preço Limite pode
ser usado para conferir seus custos de compras finais após descontos,
bonificações, etc. \< BR\> Listas de Preço podem ser calculadas e
copiadas. Para acelerar os cálculos, os parâmetros são armazenados e
usados ao se criar uma nova versão da lista de preços.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ListadePreco.png)

<div id="d137386e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Lista de Preço - M\_PriceList

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_PriceList_data)

<span class="emphasis">*Descrição:*</span> Definir Listas de Preços

<span class="emphasis">*Comentário/Ajuda:* </span> Listas de Preços
determinam a moeda do documento assim como o tratamento de impostos.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d137386e40" class="table">

<div class="table-title">

Table 1.1. Price List
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |   Valores (Padrão)   |   Chave restritiva    |                Regra de validação                |                          Descrição                           |                                                                                       Comentário/Ajuda                                                                                        |
| :-----------------------: | :------------------: | :------------------: | :-------------------: | :----------------------------------------------: | :----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Lista de Preço       |          ID          |                      |                       |                                                  |              Unique identifier of a Price List               |                                                  Price Lists are used to determine the pricing, margin and cost of items purchased or sold.                                                   |
|    Lista de Preço Base    |        Tabela        |     M\_PriceList     |     basepricelist     |  M\_PriceList.C\_Currency\_ID=@C\_Currency\_ID@  | Pricelist to be used, if product not found on this pricelist |                                     The Base Price List identifies the default price list to be used if a product is not found on the selected price list                                     |
|          Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)              |                                                                                      (ver o mesmo acima)                                                                                      |
|        Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)              |                                                                                      (ver o mesmo acima)                                                                                      |
|           Nome            | Texto Curto (String) |                      |                       |                                                  |            Alphanumeric identifier of the entity             |                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                          |
|         Descrição         | Texto Curto (String) |                      |                       |                                                  |           Optional short description of the record           |                                                                          A description is limited to 255 characters.                                                                          |
|           Ativo           |       Sim-Não        |         (Y)          |                       |                                                  |              (semelhante ao primeiro relatório)              |                                                                                      (ver o mesmo acima)                                                                                      |
|          Padrão           |       Sim-Não        |                      |                       |                                                  |                        Default value                         |                                                        The Default Checkbox indicates if this record will be used as a default value.                                                         |
|         Moeda De          |    Tabela Direta     |                      | ccurrency\_mpricelist |                                                  |                 The Currency for this record                 |                                                         Indicates the Currency to be used when processing or reporting on this record                                                         |
|     Precisão de Preço     |       Inteiro        |         (2)          |                       |                                                  |         Precision (number of decimals) for the Price         | The prices of the price list are rounded to the precision entered. This allows to have prices with below currency precision, e.g. $0.005. Enter the number of decimals or -1 for no rounding. |
| Lista de Preço de Vendas  |       Sim-Não        |                      |                       |                                                  |                  This is a Sales Price List                  |                                                  The Sales Price List check box indicates if this price list is used for sales transactions.                                                  |
|   Preço Inclui Imposto    |       Sim-Não        |                      |                       |                                                  |                 Tax is included in the price                 |                                             The Tax Included checkbox indicates if the prices include tax. This is also known as the gross price.                                             |
|   Impor Limite de Preço   |       Sim-Não        |                      |                       |                                                  |          Do not allow prices below the limit price           |               The Enforce Price Limit check box indicates that prices cannot be below the limit price in Orders and Invoices. This can be overwritten, if the role allows this.               |
| Preço por Margem (Markup) |       Sim-Não        |        ('N')         |                       |                                                  |           Pricing indicator. Traditional or Markup           |                                                      Index applied to the cost of product or service to the formation of the sale price                                                       |
|       Liberado Web        |       Sim-Não        |        ('N')         |                       |                                                  |                                                              |                                                                                                                                                                                               |
|     M\_PriceList\_UU      | Texto Curto (String) |                      |                       |                                                  |                                                              |                                                                                                                                                                                               |

</div>

</div>

  

<div id="d137386e299" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Versão - M\_PriceList\_Version

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_PriceList_Version_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Versões de
Listas de Preços

<span class="emphasis">*Comentário/Ajuda:* </span> Listas de Preço são
automaticamente criadas com base nas Informações de Compras de Produtos
e na Categoria de Descontos do Fornecedor. A outra alternativa é
copiá-las de listas de preços existentes e então recalculá-las. Você
também pode re-calcular a lista de preços referenciando a mesma lista de
preços ou nenhuma lista de preços. Se nenhuma base de lista de preços
for selecionada, os registros de Compra de Produtos serão usados como
referência.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d137386e316" class="table">

<div class="table-title">

Table 1.2. Version
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                     Descrição                     |                                                               Comentário/Ajuda                                                               |
| :-----------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Versão da Lista de Preço  |          ID          |                      |                                 |                                                  |   Identifies a unique instance of a Price List    |           Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for.           |
|          Empresa          |    Tabela Direta     |  (@AD\_Client\_ID@)  |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
|        Organização        |    Tabela Direta     |   (@AD\_Org\_ID@)    |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
|      Lista de Preço       |    Tabela Direta     |                      |  mpricelist\_mpricelistversion  |                                                  |         Unique identifier of a Price List         |                          Price Lists are used to determine the pricing, margin and cost of items purchased or sold.                          |
|           Nome            | Texto Curto (String) |      (@\#Date@)      |                                 |                                                  |       Alphanumeric identifier of the entity       | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição         | Texto Curto (String) |                      |                                 |                                                  |     Optional short description of the record      |                                                 A description is limited to 255 characters.                                                  |
|           Ativo           |       Sim-Não        |         (Y)          |                                 |                                                  |        (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
| Esquema de Lista de Preço |        Tabela        | M\_DiscountSchema PL |     mdiscounts\_mplversion      |                                                  | Schema to calculate the trade discount percentage |       After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.       |
|   Lista de Preços Base    |        Tabela        | M\_PriceList Version | mpricelistversionbase\_mpriceli |                                                  |        Source for Price list calculations         |                          The Base Price List identifies the Base Pricelist used for calculating prices (the source)                          |
|       Válido desde        |         Data         |      (@\#Date@)      |                                 |                                                  |    Valid from including this date (first day)     |                                         The Valid From date indicates the first day of a date range                                          |
|   Criar Lista de Preço    |        Botão         |                      |                                 |                                                  |                                                   |                                                                                                                                              |
| M\_PriceList\_Version\_UU | Texto Curto (String) |                      |                                 |                                                  |                                                   |                                                                                                                                              |

</div>

</div>

  

<div id="d137386e519" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Preço de Produto - M\_ProductPrice

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_ProductPrice_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Preços de
Produto

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Lista de
Preço" mostra os preços para um produto baseada na lista de preços
selecionada.

<span class="emphasis">*Coluna linkada:* </span> Price List Version

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d137386e540" class="table">

<div class="table-title">

Table 1.3. Product Price
Fields

</div>

<div class="table-contents">

|      Nome do campo       |  Referência   |  Valores (Padrão)  |       Chave restritiva       |                                                                          Regra de validação                                                                          |                        Descrição                        |                                                     Comentário/Ajuda                                                     |
| :----------------------: | :-----------: | :----------------: | :--------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
|         Empresa          | Tabela Direta | (@AD\_Client\_ID@) |                              |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |           (semelhante ao primeiro relatório)            |                                                   (ver o mesmo acima)                                                    |
|       Organização        | Tabela Direta |  (@AD\_Org\_ID@)   |                              |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |           (semelhante ao primeiro relatório)            |                                                   (ver o mesmo acima)                                                    |
| Versão da Lista de Preço | Tabela Direta |                    | mpricelistver\_mproductprice |                                                                                                                                                                      |      Identifies a unique instance of a Price List       | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|         Produto          |   Procurar    |                    |   mproduct\_mproductprice    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                 Product, Service, Item                  |                        Identifies an item which is either purchased or sold in this organization.                        |
|          Ativo           |    Sim-Não    |        (Y)         |                              |                                                                                                                                                                      |           (semelhante ao primeiro relatório)            |                                                   (ver o mesmo acima)                                                    |
|      Preço de Lista      | Custos+Preços |                    |                              |                                                                                                                                                                      |                       List Price                        |                           The List Price is the official List Price in the document currency.                            |
|       Preço Padrão       | Custos+Preços |                    |                              |                                                                                                                                                                      |                     Standard Price                      |                The Standard Price indicates the standard or normal price for a product on this price list                |
|       Preço Limite       | Custos+Preços |                    |                              |                                                                                                                                                                      |               Lowest price for a product                |               The Price Limit indicates the lowest price for a product stated in the Price List Currency.                |
|     Fator de Markup      |    Número     |        (1)         |                              |                                                                                                                                                                      |                  Factor Markup Applied                  |                                                                                                                          |
|   Replicar Alterações    |     Botão     |                    |                              |                                                                                                                                                                      |              Process to replicate changes               |                                                                                                                          |
|      Product Price       |      ID       |                    |                              |                                                                                                                                                                      | Intersection between a Product and a Price List Version |                                                                                                                          |

</div>

</div>

  

<div id="d137386e726" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Alteração de Preço - Markup - COF\_C\_PriceChange

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Aba Destinada a Aplicar
Mudança no Preço Padrão do Produto. Acréscimo ou Decrescimo de Valor.

<span class="emphasis">*Coluna linkada:* </span> Price List Version

<span class="emphasis">*Lógica de visualização:*</span>
@cof\_isMarkup@='Y'

<span class="emphasis">*Claúsula Where:*</span>
COF\_C\_PriceChange.M\_Product\_ID=@M\_Product\_ID@

<span class="emphasis">*Nível da tabela:* </span>3

</div>

<div id="d137386e749" class="table">

<div class="table-title">

Table 1.4. Price Change
Fields

</div>

<div class="table-contents">

|      Nome do campo       |  Referência   |                                                            Valores (Padrão)                                                            |        Chave restritiva         |                                                                          Regra de validação                                                                          |                  Descrição                   |                                                     Comentário/Ajuda                                                     |
| :----------------------: | :-----------: | :------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
|         Empresa          | Tabela Direta |                                                          (@\#AD\_Client\_ID@)                                                          |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |      (semelhante ao primeiro relatório)      |                                                   (ver o mesmo acima)                                                    |
|       Organização        | Tabela Direta |                                                            (@AD\_Org\_ID@)                                                             |                                 |                                                  (AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ OR AD\_Org.AD\_Org\_ID=0)                                                  |      (semelhante ao primeiro relatório)      |                                                   (ver o mesmo acima)                                                    |
| Versão da Lista de Preço | Tabela Direta |                                                     (@M\_PriceList\_Version\_ID@)                                                      | MPriceListVersion\_COFCPriceCha |                                                                                                                                                                      | Identifies a unique instance of a Price List | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|         Produto          |   Procurar    |                                                           (@M\_Product\_ID@)                                                           |    MProduct\_COFCPriceChange    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |            Product, Service, Item            |                        Identifies an item which is either purchased or sold in this organization.                        |
|          Ativo           |    Sim-Não    |                                                                  (Y)                                                                   |                                 |                                                                                                                                                                      |      (semelhante ao primeiro relatório)      |                                                   (ver o mesmo acima)                                                    |
|      Altera o Tipo       |     Lista     | Acréscimo Frete Acréscimo Genérico Acréscimo IPI Acréscimo ST Desconto Comercial Desconto Financeiro Desconto Genérico Desconto Volume |                                 |                                                                                                                                                                      |                                              |                                                                                                                          |
|       Porcentagem        | Custos+Preços |                                                                  (0)                                                                   |                                 |                                                                                                                                                                      |         Percent of the entire amount         |                                           Percentage of an amount (up to 100)                                            |
| COF\_C\_PriceChange\_ID  |      ID       |                                                                                                                                        |                                 |                                                                                                                                                                      |          Primary Key : Price Change          |                                                Primary Key : Price Change                                                |

</div>

</div>

  

<div id="d137386e896" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Romper Preço do Produto - M\_ProductPriceVendorBreak

</div>

</div>

</div>

<span class="emphasis">*Comentário/Ajuda:* </span> Indica um Pausa para
Atualização do Preço padrão do produto.

<span class="emphasis">*Coluna linkada:* </span> Price List Version

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d137386e911" class="table">

<div class="table-title">

Table 1.5. Product Price Break
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                                                                          Regra de validação                                                                          |                  Descrição                   |                                                     Comentário/Ajuda                                                     |
| :----------------------------: | :------------------: | :----------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
|      Produto Preço Parada      |          ID          |                    |                                 |                                                                                                                                                                      |                                              |                                                                                                                          |
|            Empresa             |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |      (semelhante ao primeiro relatório)      |                                                   (ver o mesmo acima)                                                    |
|          Organização           |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |      (semelhante ao primeiro relatório)      |                                                   (ver o mesmo acima)                                                    |
|    Versão da Lista de Preço    |    Tabela Direta     |                    | mpricelistversion\_mproductpric |                                                                                                                                                                      | Identifies a unique instance of a Price List | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|            Produto             |       Procurar       |                    | mproduct\_mproductpricevendorbr | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |            Product, Service, Item            |                        Identifies an item which is either purchased or sold in this organization.                        |
|      Parceiro de Negócios      |       Procurar       | C\_BPartner (Trx)  | cbpartner\_mproductpricevendorb |                                                                                                                                                                      |        Identifies a Business Partner         |     A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson      |
|       Ponto de Inflexão        |        Número        |                    |                                 |                                                                                                                                                                      |   Low Value of trade discount break level    |                                    Starting Quantity or Amount Value for break level                                     |
|             Ativo              |       Sim-Não        |        (Y)         |                                 |                                                                                                                                                                      |      (semelhante ao primeiro relatório)      |                                                   (ver o mesmo acima)                                                    |
|         Preço de Lista         |    Custos+Preços     |                    |                                 |                                                                                                                                                                      |                  List Price                  |                           The List Price is the official List Price in the document currency.                            |
|          Preço Padrão          |    Custos+Preços     |                    |                                 |                                                                                                                                                                      |                Standard Price                |                The Standard Price indicates the standard or normal price for a product on this price list                |
|          Preço Limite          |    Custos+Preços     |                    |                                 |                                                                                                                                                                      |          Lowest price for a product          |               The Price Limit indicates the lowest price for a product stated in the Price List Currency.                |
| M\_ProductPriceVendorBreak\_UU | Texto Curto (String) |                    |                                 |                                                                                                                                                                      |                                              |                                                                                                                          |

</div>

</div>

  

<div id="d137386e1111" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Translation - M\_PriceList\_Version\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_PriceList_Version_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Price List Version

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d137386e1124" class="table">

<div class="table-title">

Table 1.6. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                  Regra de validação                                   |                  Descrição                   |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------: | :------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) | ADClient\_MPriceListVersionTrl  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |      (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |                      |   ADOrg\_MPriceListVersionTrl   |                                                                                       |      (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
| Versão da Lista de Preço |       Procurar       |                      | MPriceListVersion\_MPriceListVe |                                                                                       | Identifies a unique instance of a Price List |           Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for.           |
|          Idioma          |        Tabela        |     AD\_Language     | ADLanguage\_MPriceListVersionTr |                                                                                       |           Language for this entity           |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo           |       Sim-Não        |         (Y)          |                                 |                                                                                       |      (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|        Traduzida         |       Sim-Não        |         (N)          |                                 |                                                                                       |          This column is translated           |                                       The Translated checkbox indicates if this column is translated.                                        |
|           Nome           | Texto Curto (String) |      (@\#Date@)      |                                 |                                                                                       |    Alphanumeric identifier of the entity     | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |

</div>

</div>

  

<div id="d137386e1258" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Translation - M\_PriceList\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_PriceList_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Price List

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d137386e1271" class="table">

<div class="table-title">

Table 1.7. Translation
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   |     Chave restritiva      |                                  Regra de validação                                   |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------: | :------------------: | :------------------: | :-----------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) |  ADClient\_MPriceListTrl  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização   |    Tabela Direta     |                      |   ADOrg\_MPriceListTrl    |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Lista de Preço |       Procurar       |                      | MPriceList\_MPriceListTrl |                                                                                       |    Unique identifier of a Price List     |                          Price Lists are used to determine the pricing, margin and cost of items purchased or sold.                          |
|     Idioma     |        Tabela        |     AD\_Language     | ADLanguage\_MPriceListTrl |                                                                                       |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|     Ativo      |       Sim-Não        |         (Y)          |                           |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Traduzida    |       Sim-Não        |         (N)          |                           |                                                                                       |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|      Nome      | Texto Curto (String) |                      |                           |                                                                                       |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição    | Texto Curto (String) |                      |                           |                                                                                       | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
