---
title: "Esquema de Lista de Preço"
id: EsquemadeListadePreco
---
<div id="d87317e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Esquema de Lista de Preço

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Esquema de Lista de Preço -
    M\_DiscountSchema](#d87317e22)</span>
  - <span class="section">[2. Tabela: Linha de Esquema -
    M\_DiscountSchemaLine](#d87317e287)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Esquemas
de Lista de Preço

<span class="emphasis">*Comentário/Ajuda:* </span>O esquema de Lista de
Preços define as regras de cálculo para listas de preços

<span class="emphasis"> *Criado em:* </span>2001-12-28 21:01:25.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d87317e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Esquema de Lista de Preço - M\_DiscountSchema

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_DiscountSchema_data)

<span class="emphasis">*Descrição:*</span> Esquema de Lista de Preço

<span class="emphasis">*Comentário/Ajuda:* </span> O esquema de Lista de
Preços define as regras de cálculo para listas de preços

<span class="emphasis">*Claúsula Where:*</span>
M\_DiscountSchema.DiscountType='P'

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d87317e43" class="table">

<div class="table-title">

Table 1.1. Price List Schema
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |                Valores (Padrão)                 | Chave restritiva |                            Regra de validação                             |                        Descrição                         |                                                               Comentário/Ajuda                                                               |
| :-------------------------: | :-------------------------------: | :---------------------------------------------: | :--------------: | :-----------------------------------------------------------------------: | :------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Desconto Raso do P.Negócios |              Sim-Não              |                                                 |                  |                                                                           |   Use flat discount defined on Business Partner Level    |                             For calculation of the discount, use the discount defined on Business Partner Level                              |
|  Esquema de Lista de Preço  |                ID                 |                                                 |                  |                                                                           |    Schema to calculate the trade discount percentage     |       After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.       |
|      Roteiro (Script)       | Texto Médio (até 2000 caracteres) |                                                 |                  |                                                                           |     Dynamic Java Language Script to calculate result     |                                     Use Java language constructs to define the result of the calculation                                     |
|       Desconto Fixo %       |              Número               |                                                 |                  |                                                                           |                 Flat discount percentage                 |                                                                                                                                              |
|    Baseado em Quantidade    |              Sim-Não              |                       (Y)                       |                  |                                                                           | Trade discount break level based on Quantity (not value) |           The calculation of the trade discount level is based on the quantity of the order and not the value amount of the order            |
|     Nível de Acumulação     |               Lista               |                    Linha (L)                    |                  |                                                                           |           Level for accumulative calculations            |                                                                                                                                              |
|           Empresa           |           Tabela Direta           |              (@\#AD\_Client\_ID@)               |                  |                     AD\_Client.AD\_Client\_ID \< \> 0                     |            (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|         Organização         |           Tabela Direta           |                (@\#AD\_Org\_ID@)                |                  |             (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)              |            (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|            Nome             |       Texto Curto (String)        |                                                 |                  |                                                                           |          Alphanumeric identifier of the entity           | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição          |       Texto Curto (String)        |                                                 |                  |                                                                           |         Optional short description of the record         |                                                 A description is limited to 255 characters.                                                  |
|            Ativo            |              Sim-Não              |                       (Y)                       |                  |                                                                           |            (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|        Válido desde         |               Data                |                                                 |                  |                                                                           |        Valid from including this date (first day)        |                                         The Valid From date indicates the first day of a date range                                          |
|      Tipo de Desconto       |               Lista               | Quebras Percentagem Fixa Lista de Preço Fórmula |                  | (('@IsSOTrx@'='N' AND Value='P') OR ('@IsSOTrx@'='Y' AND Value\< \> 'P')) |            Type of trade discount calculation            |                                      Type of procedure used to calculate the trade discount percentage                                       |
|          Renumerar          |               Botão               |                                                 |                  |                                                                           |                                                          |                                                                                                                                              |
|    M\_DiscountSchema\_UU    |       Texto Curto (String)        |                                                 |                  |                                                                           |                                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d87317e287" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha de Esquema - M\_DiscountSchemaLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_DiscountSchemaLine_data)

<span class="emphasis">*Descrição:*</span> Linhas de desconto comercial
de Preço de Lista

<span class="emphasis">*Comentário/Ajuda:* </span> Listas de Preços são
criadas baseadas nas Compras de Produtos e Descontos de Categoria. Os
parâmetros listados aqui permitem copiar e calcular listas de preços.\<
BR\> O cálculo: \< UL\> \< LI\> Copia e converte preços da lista de
preços referenciada \< LI\> resultado mais Valor de Sobretaxa \< LI\>
resultado menos Desconto \< LI\> se o preço resultante for menor que o
preço limite original mais a Margem Mínima, use este preço (somente se a
Margem for não zero) \< LI\> se o preço resultante for mais que o preço
limite original mais a Margem Máxima, use este preço (somente se a
Margem for não zero) \< LI\> Arredonda o preço resultante \< /UL\> \<
B\> A Fórmula\< /B\> é \< BR\> NewPrice = (Convert(BasePrice) +
Surcharge) \* (100-Discount) / 100; \< BR\> if MinMargin \< \> 0 then
NewPrice = Max (NewPrice, Convert(OrigLimitPrice) + MinMargin); \< BR\>
if MaxMargin \< \> 0 then NewPrice = Min (NewPrice,
Convert(OrigLimitPrice) + MaxMargin); \< BR\> \< BR\> \< B\> Exemplo:\<
/B\> (assumindo a mesma moeda)\< BR\> Preços Originais: Lista=300,
Padrão=250, Limite=200; \< BR\> Novo Preço de Lista: Base=Lista,
Sobretaxa=0, Desconto=0, Arredondar

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87317e304" class="table">

<div class="table-title">

Table 1.2. Schema Line
Fields

</div>

<div class="table-contents">

|            Nome do campo             |      Referência      |                                                                             Valores (Padrão)                                                                             |        Chave restritiva         |                                                                          Regra de validação                                                                          |                                         Descrição                                          |                                                                                                        Comentário/Ajuda                                                                                                        |
| :----------------------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Desconto da Lista de Preços      |          ID          |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                        Line of the pricelist trade discount schema                         |                                                                For the Pricelist Discount Type, you enter how the list, standard and limit price is calculated.                                                                |
|      M\_DiscountSchemaLine\_UU       | Texto Curto (String) |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                                                                            |                                                                                                                                                                                                                                |
|               Empresa                |    Tabela Direta     |                                                                            (@AD\_Client\_ID@)                                                                            |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                             (semelhante ao primeiro relatório)                             |                                                                                                      (ver o mesmo acima)                                                                                                       |
|             Organização              |    Tabela Direta     |                                                                             (@AD\_Org\_ID@)                                                                              |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                             (semelhante ao primeiro relatório)                             |                                                                                                      (ver o mesmo acima)                                                                                                       |
|      Esquema de Lista de Preço       |        Tabela        |                                                                           M\_DiscountSchema PL                                                                           |    mdiscountschema\_mdsline     |                                                                                                                                                                      |                     Schema to calculate the trade discount percentage                      |                                                After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.                                                |
|                Ativo                 |       Sim-Não        |                                                                                   (Y)                                                                                    |                                 |                                                                                                                                                                      |                             (semelhante ao primeiro relatório)                             |                                                                                                      (ver o mesmo acima)                                                                                                       |
|              Seqüência               |       Inteiro        |                    (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM M\_DiscountSchemaLine WHERE M\_DiscountSchema\_ID=@M\_DiscountSchema\_ID@)                     |                                 |                                                                                                                                                                      |                   Method of ordering records; lowest number comes first                    |                                                                                          The Sequence indicates the order of records                                                                                           |
|          Tipo de Conversão           |    Tabela Direta     |                                                                                                                                                                          |  cconversiontype\_mdiscschline  |                                                                                                                                                                      |                               Currency Conversion Rate Type                                |                                                     The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.                                                     |
|          Data de Conversão           |         Data         |                                                                                (@\#Date@)                                                                                |                                 |                                                                                                                                                                      |                             Date for selecting conversion rate                             |                                           The Conversion Date identifies the date used for currency conversion. The conversion rate chosen must include this date in it's date range                                           |
|         Parceiro de Negócios         |       Procurar       |                                                                                                                                                                          |    cbpartner\_mdiscountsline    |                                                        C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                        |                               Identifies a Business Partner                                |                                                        A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                         |
|        Grupo de Fornecedores         |       Procurar       |                                                                                                                                                                          | COFGrupoFornecedor\_MDiscountSc |                                                                                                                                                                      |                                   Grupo de Fornecedores                                    |                                                                                                     Grupo de Fornecedores                                                                                                      |
|               Produto                |       Procurar       |                                                                                                                                                                          |    mproduct\_mdiscountsline     | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                                   Product, Service, Item                                   |                                                                           Identifies an item which is either purchased or sold in this organization.                                                                           |
|         Categoria de Produto         |    Tabela Direta     |                                                                                                                                                                          |  mprodcategory\_mdiscountsline  |                                                                                                                                                                      |                                   Category of a Product                                    |                                                         Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                          |
|            Classificação             | Texto Curto (String) |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                Classification for grouping                                 |                                                                                  The Classification can be used to optionally group products.                                                                                  |
|               Grupo 1                | Texto Curto (String) |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                                                                            |                                                                                                                                                                                                                                |
|               Grupo 2                | Texto Curto (String) |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                                                                            |                                                                                                                                                                                                                                |
|           Tipo do Produto            |       Procurar       |                                                                                                                                                                          | COFProductType\_MDiscountSchema |                                                                                                                                                                      |                                 Primary Key : Product Type                                 |                                                                                                   Primary Key : Product Type                                                                                                   |
|          Classe do Produto           |       Procurar       |                                                                                                                                                                          | COFProductClass\_MDiscountSchem |                COF\_ProductType\_ID = @COF\_ProductType\_ID@ AND (COF\_ProductClass.AD\_Org\_ID = @AD\_Org\_ID@ OR COF\_ProductClass.AD\_Org\_ID= 0)                 |                                Primary Key : Product Class                                 |                                                                                                  Primary Key : Product Class                                                                                                   |
|           Grupo do Produto           |       Procurar       |                                                                                                                                                                          | COFProductGroup\_MDiscountSchem |               COF\_ProductClass\_ID = @COF\_ProductClass\_ID@ AND (COF\_ProductGroup.AD\_Org\_ID = @AD\_Org\_ID@ OR COF\_ProductGroup.AD\_Org\_ID= 0)                |                                Primary Key : Product Group                                 |                                                                                                  Primary Key : Product Group                                                                                                   |
|        Base de Preço de Lista        |        Lista         |                                                Preço Fixo Preço de Lista Product Cost Preço Padrão Preço Limite (PC) (L)                                                 |                                 |                                                                                                                                                                      |                    Price used as the basis for price list calculations                     |                                                              The List Price Base indicates the price to use as the basis for the calculation of a new price list.                                                              |
|  Margem Mínima de Preço de Lista %   |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                Minimum margin for a product                                |     The List Price Min Margin indicates the minimum margin for a product. The margin is calculated by subtracting the original list price from the newly calculated price. If this field contains 0.00 then it is ignored.     |
| Valor da Sobretaxa de Preço de Lista |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                List Price Surcharge Amount                                 |                                                             The List Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.                                                             |
|  Margem Máxima do Preço de Lista %   |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                Maximum margin for a product                                |     The List Price Max Margin indicates the maximum margin for a product. The margin is calculated by subtracting the original list price from the newly calculated price. If this field contains 0.00 then it is ignored.     |
|     Desconto de Preço de Lista %     |        Número        |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                          Discount from list price as a percentage                          |              The List Price Discount Percentage indicates the percentage discount which will be subtracted from the base price. A negative amount indicates the percentage which will be added to the base price.              |
|   Arredondamento do Preço de Lista   |        Lista         | Número Inteiro ,00 Níquel ,05, ,10, ,15, ... Ending in 9/5 Precisão da Moeda Décimo .10, .20, .30, ... Sem arredondamento Quarto ,25 ,50 ,75 Dezena 10,00, 20,00, .. (C) |                                 |                                                                                                                                                                      |                             Rounding rule for final list price                             |                                                                          The List Price Rounding indicates how the final list price will be rounded.                                                                           |
|         Preço de Lista Fixo          |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                             Fixes List Price (not calculated)                              |                                                                                                                                                                                                                                |
|         Base de Preço Padrão         |        Lista         |                                                Preço Fixo Preço de Lista Product Cost Preço Padrão Preço Limite (PC) (S)                                                 |                                 |                                                                                                                                                                      |                       Base price for calculating new standard price                        |                                                          The Standard Price Base indicates the price to use as the basis for the calculation of a new price standard.                                                          |
|   Margem Mínima de Preço Padrão %    |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                            Minimum margin allowed for a product                            | The Standard Price Min Margin indicates the minimum margin for a product. The margin is calculated by subtracting the original Standard price from the newly calculated price. If this field contains 0.00 then it is ignored. |
|  Valor de Sobretaxa de Preço Padrão  |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                           Amount added to a price as a surcharge                           |                                                           The Standard Price Surcharge Amount indicates the amount to be added to the price prior to multiplication.                                                           |
|   Margem Máxima de Preço Padrão %    |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                            Maximum margin allowed for a product                            | The Standard Price Max Margin indicates the maximum margin for a product. The margin is calculated by subtracting the original Standard price from the newly calculated price. If this field contains 0.00 then it is ignored. |
|      Desconto de Preço Padrão %      |        Número        |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                      Discount percentage to subtract from base price                       |            The Standard Price Discount Percentage indicates the percentage discount which will be subtracted from the base price. A negative amount indicates the percentage which will be added to the base price.            |
|    Arredondamento do Preço Padrão    |        Lista         | Número Inteiro ,00 Níquel ,05, ,10, ,15, ... Ending in 9/5 Precisão da Moeda Décimo .10, .20, .30, ... Sem arredondamento Quarto ,25 ,50 ,75 Dezena 10,00, 20,00, .. (C) |                                 |                                                                                                                                                                      |                             Rounding rule for calculated price                             |                                                                      The Standard Price Rounding indicates how the final Standard price will be rounded.                                                                       |
|          Preço Padrão Fixo           |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                           Fixed Standard Price (not calculated)                            |                                                                                                                                                                                                                                |
|         Base p/ Preço Limite         |        Lista         |                                                Preço Fixo Preço de Lista Product Cost Preço Padrão Preço Limite (PC) (X)                                                 |                                 |                                                                                                                                                                      |                        Base price for calculation of the new price                         |                                                                         Identifies the price to be used as the base for calculating a new price list.                                                                          |
|   Margem Mínima de Preço Limite %    |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                Minimum difference to original limit price; ignored if zero                 |                 Indicates the minimum margin for a product. The margin is calculated by subtracting the original limit price from the newly calculated price. If this field contains 0.00 then it is ignored.                  |
|  Valor de Sobretaxa de Preço Limite  |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |               Amount added to the converted/copied price before multiplying                |                                                                          Indicates the amount to be added to the Limit price prior to multiplication.                                                                          |
|   Margem Máxima de Preço Limite %    |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                Maximum difference to original limit price; ignored if zero                 |                 Indicates the maximum margin for a product. The margin is calculated by subtracting the original limit price from the newly calculated price. If this field contains 0.00 then it is ignored.                  |
|      Desconto de Preço limite %      |        Número        |                                                                                                                                                                          |                                 |                                                                                                                                                                      | Discount in percent to be subtracted from base, if negative it will be added to base price |                                                            Indicates the discount in percent to be subtracted from base, if negative it will be added to base price                                                            |
|    Arredondamento do Preço Limite    |        Lista         | Número Inteiro ,00 Níquel ,05, ,10, ,15, ... Ending in 9/5 Precisão da Moeda Décimo .10, .20, .30, ... Sem arredondamento Quarto ,25 ,50 ,75 Dezena 10,00, 20,00, .. (C) |                                 |                                                                                                                                                                      |                                Rounding of the final result                                |                                                         A drop down list box which indicates the rounding (if any) will apply to the final prices in this price list.                                                          |
|          Preço Limite Fixo           |        Valor         |                                                                                                                                                                          |                                 |                                                                                                                                                                      |                             Fixed Limit Price (not calculated)                             |                                                                                                                                                                                                                                |

</div>

</div>

  

</div>
