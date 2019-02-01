---
title: "Esquema de Descontos"
id: EsquemadeDescontos
---
<div id="d87094e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Esquema de Descontos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Esquema de Descontos -
    M\_DiscountSchema](#d87094e23)</span>
  - <span class="section">[2. Tabela: Incremento de Desconto -
    M\_DiscountSchemaBreak](#d87094e288)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Esquemas de
Descontos Comerciais

<span class="emphasis">*Comentário/Ajuda:* </span>O Esquema de Desconto
Comercial calcula a percentagem de desconto comercial

<span class="emphasis"> *Criado em:* </span>2001-12-28 21:01:25.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/EsquemadeDescontos.png)

<div id="d87094e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Esquema de Descontos - M\_DiscountSchema

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_DiscountSchema_data)

<span class="emphasis">*Descrição:*</span> Esquema de Desconto Comercial

<span class="emphasis">*Comentário/Ajuda:* </span> O Esquema de Desconto
Comercial calcula a percentagem de desconto comercial

<span class="emphasis">*Claúsula Where:*</span>
M\_DiscountSchema.DiscountType\< \> 'P'

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d87094e44" class="table">

<div class="table-title">

Table 1.1. Discount Schema
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |                Valores (Padrão)                 | Chave restritiva |                            Regra de validação                             |                        Descrição                         |                                                               Comentário/Ajuda                                                               |
| :-------------------------: | :-------------------------------: | :---------------------------------------------: | :--------------: | :-----------------------------------------------------------------------: | :------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        Válido desde         |               Data                |                                                 |                  |                                                                           |        Valid from including this date (first day)        |                                         The Valid From date indicates the first day of a date range                                          |
|    Esquema de Descontos     |                ID                 |                                                 |                  |                                                                           |    Schema to calculate the trade discount percentage     |       After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price.       |
|           Empresa           |           Tabela Direta           |              (@\#AD\_Client\_ID@)               |                  |                     AD\_Client.AD\_Client\_ID \< \> 0                     |            (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|         Organização         |           Tabela Direta           |                (@\#AD\_Org\_ID@)                |                  |             (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)              |            (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|            Nome             |       Texto Curto (String)        |                                                 |                  |                                                                           |          Alphanumeric identifier of the entity           | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição          |       Texto Curto (String)        |                                                 |                  |                                                                           |         Optional short description of the record         |                                                 A description is limited to 255 characters.                                                  |
|            Ativo            |              Sim-Não              |                       (Y)                       |                  |                                                                           |            (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|      Tipo de Desconto       |               Lista               | Quebras Percentagem Fixa Lista de Preço Fórmula |                  | (('@IsSOTrx@'='N' AND Value='P') OR ('@IsSOTrx@'='Y' AND Value\< \> 'P')) |            Type of trade discount calculation            |                                      Type of procedure used to calculate the trade discount percentage                                       |
|      Roteiro (Script)       | Texto Médio (até 2000 caracteres) |                                                 |                  |                                                                           |     Dynamic Java Language Script to calculate result     |                                     Use Java language constructs to define the result of the calculation                                     |
| Desconto Raso do P.Negócios |              Sim-Não              |                                                 |                  |                                                                           |   Use flat discount defined on Business Partner Level    |                             For calculation of the discount, use the discount defined on Business Partner Level                              |
|       Desconto Fixo %       |              Número               |                                                 |                  |                                                                           |                 Flat discount percentage                 |                                                                                                                                              |
|    Baseado em Quantidade    |              Sim-Não              |                       (Y)                       |                  |                                                                           | Trade discount break level based on Quantity (not value) |           The calculation of the trade discount level is based on the quantity of the order and not the value amount of the order            |
|     Nível de Acumulação     |               Lista               |                    Linha (L)                    |                  |                                                                           |           Level for accumulative calculations            |                                                                                                                                              |
|          Renumerar          |               Botão               |                                                 |                  |                                                                           |                                                          |                                                                                                                                              |
|    M\_DiscountSchema\_UU    |       Texto Curto (String)        |                                                 |                  |                                                                           |                                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d87094e288" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Incremento de Desconto - M\_DiscountSchemaBreak

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_DiscountSchemaBreak_data)

<span class="emphasis">*Descrição:*</span> Desconto comercial baseado em
incrementos (passos)

<span class="emphasis">*Lógica de visualização:*</span> @DiscountType@=B

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87094e305" class="table">

<div class="table-title">

Table 1.2. Discount Break
Fields

</div>

<div class="table-contents">

|           Nome do campo           |      Referência      |                                                          Valores (Padrão)                                                          |        Chave restritiva        |                                                                                                                 Regra de validação                                                                                                                 |                       Descrição                       |                                                         Comentário/Ajuda                                                         |
| :-------------------------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------------: | :----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------: |
| Esquema de Descontos Incrementais |          ID          |                                                                                                                                    |                                |                                                                                                                                                                                                                                                    |                 Trade Discount Break                  |                                              Trade discount based on breaks (steps)                                              |
|              Empresa              |    Tabela Direta     |                                                         (@AD\_Client\_ID@)                                                         |                                |                                                                                                         AD\_Client.AD\_Client\_ID \< \> 0                                                                                                          |          (semelhante ao primeiro relatório)           |                                                       (ver o mesmo acima)                                                        |
|            Organização            |    Tabela Direta     |                                                          (@AD\_Org\_ID@)                                                           |                                |                                                                                                  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                                  |          (semelhante ao primeiro relatório)           |                                                       (ver o mesmo acima)                                                        |
|       Esquema de Descontos        |    Tabela Direta     |                                                                                                                                    |      mdiscounts\_mdsbreak      |                                                                                                                                                                                                                                                    |   Schema to calculate the trade discount percentage   | After calculation of the (standard) price, the trade discount percentage is calculated and applied resulting in the final price. |
|               Ativo               |       Sim-Não        |                                                                (Y)                                                                 |                                |                                                                                                                                                                                                                                                    |          (semelhante ao primeiro relatório)           |                                                       (ver o mesmo acima)                                                        |
|             Seqüência             |       Inteiro        | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM M\_DiscountSchemaBreak WHERE M\_DiscountSchema\_ID=@M\_DiscountSchema\_ID@) |                                |                                                                                                                                                                                                                                                    | Method of ordering records; lowest number comes first |                                           The Sequence indicates the order of records                                            |
|       Categoria de Produto        |    Tabela Direta     |                                                                                                                                    | mprodcategory\_mdiscountsbreak |                                                                                        <span class="emphasis">*ReadOnly Logic*</span>: @M\_Product\_ID@\!0                                                                                         |                 Category of a Product                 |          Identifies the category which this product belongs to. Product categories are used for pricing and selection.           |
|              Produto              |       Procurar       |                                                                                                                                    |   mproduct\_mdiscountsbreak    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) <span class="emphasis">*ReadOnly Logic*</span>: @M\_Product\_Category\_ID@\!0 |                Product, Service, Item                 |                            Identifies an item which is either purchased or sold in this organization.                            |
|         Ponto de Inflexão         |        Número        |                                                                                                                                    |                                |                                                                                                                                                                                                                                                    |        Low Value of trade discount break level        |                                        Starting Quantity or Amount Value for break level                                         |
|    Desconto Raso do P.Negócios    |       Sim-Não        |                                                                (N)                                                                 |                                |                                                                                                                                                                                                                                                    |  Use flat discount defined on Business Partner Level  |                       For calculation of the discount, use the discount defined on Business Partner Level                        |
|      Desconto Incremental %       |        Número        |                                                                                                                                    |                                |                                                                                                                                                                                                                                                    |     Trade Discount in Percent for the break level     |                                          Trade Discount in Percent for the break level                                           |
|    M\_DiscountSchemaBreak\_UU     | Texto Curto (String) |                                                                                                                                    |                                |                                                                                                                                                                                                                                                    |                                                       |                                                                                                                                  |

</div>

</div>

  

</div>
