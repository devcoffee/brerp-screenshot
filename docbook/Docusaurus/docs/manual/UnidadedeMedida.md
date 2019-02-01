---
title: "Unidade de Medida"
id: UnidadedeMedida
---
<div id="d250359e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Unidade de Medida

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Unidade de Medida -
    C\_UOM](#d250359e23)</span>
  - <span class="section">[2. Tabela: Conversão -
    C\_UOM\_Conversion](#d250359e254)</span>
  - <span class="section">[3. Tabela: Tradução -
    C\_UOM\_Trl](#d250359e448)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Unidades de
Medida

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Unidades de
Medida" é usada para definir unidades de medida não monetárias. Ela
também define se são permitidas conversões entre unidades de medida e
como elas são calculadas. O sistema fornece algumas conversões
automáticas entre unidades de medida (ex. minuto, hora, dia, dia útil,
etc.) se eles não forem explicitamente definidos aqui. As Conversões tem
que ser diretas (i.e. se você tem somente a conversão entre A-B e B-C, o
sistema não pode converter A-C, você precisa definir esta conversão
explicitamente).

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/UnidadedeMedida.png)

<div id="d250359e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Unidade de Medida - C\_UOM

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_UOM_data)

<span class="emphasis">*Descrição:*</span> Definir Unidades de Medida

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Unidades de
Medida" define uma Unidade de Medida não monetária.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d250359e40" class="table">

<div class="table-title">

Table 1.1. Unit of Measure
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |                                                                                                     Valores (Padrão)                                                                                                      | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         UDM         |          ID          |                                                                                                                                                                                                                           |                  |                                                  |             Unit of Measure              |                                            The UOM defines a unique non monetary Unit of Measure                                             |
|       Empresa       |    Tabela Direta     |                                                                                                   (@\#AD\_Client\_ID@)                                                                                                    |   c\_uomclient   |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |                                                                                                     (@\#AD\_Org\_ID@)                                                                                                     |    c\_uomorg     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Código UDM      | Texto Curto (String) |                                                                                                                                                                                                                           |                  |                                                  |             UOM EDI X12 Code             |                     The Unit of Measure Code indicates the EDI X12 Code Data Element 355 (Unit or Basis for Measurement)                     |
|       Símbolo       | Texto Curto (String) |                                                                                                                                                                                                                           |                  |                                                  |       Symbol for a Unit of Measure       |                              The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure                              |
|        Nome         | Texto Curto (String) |                                                                                                                                                                                                                           |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      | Texto Curto (String) |                                                                                                                                                                                                                           |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|     Tipo de UdM     |        Lista         | Ângulo Area Moeda Densidade Armazenamento de Dados Velocidade de Dados Energia Força Frequência Medidas de Cozinha Comprimento Outros Energia Pressão Temperatura Tempo Torque Volume Seco Velocidade Volume Líquido Peso |                  |                                                  |                                          |                                                                                                                                              |
|        Ativo        |       Sim-Não        |                                                                                                            (Y)                                                                                                            |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Padrão        |       Sim-Não        |                                                                                                                                                                                                                           |                  |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|   Precisão Padrão   |       Inteiro        |                                                                                                                                                                                                                           |                  |                                                  |   Rule for rounding calculated amounts   |    The Standard Precision defines the number of decimal places that amounts will be rounded to for accounting transactions and documents.    |
| Precisão do Custeio |       Inteiro        |                                                                                                                                                                                                                           |                  |                                                  |    Rounding used costing calculations    |       The Costing Precision defines the number of decimal places that amounts will be rounded to when performing costing calculations.       |
|     C\_UOM\_UU      | Texto Curto (String) |                                                                                                                                                                                                                           |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d250359e254" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Conversão - C\_UOM\_Conversion

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_UOM_Conversion_data)

<span class="emphasis">*Descrição:*</span> Definir Conversão de Unidades
de Medida padrão

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Conversão"
define as taxas para converter uma Unidade de Medida. O sistema fornece
algumas conversões automáticas entre unidades de medida (ex. minuto,
hora, dia, dia útil, etc.) se eles não forem explicitamente definidos
aqui. As Conversões tem que ser diretas (i.e. se você tem somente a
conversão entre A-B e B-C, o sistema não pode converter A-C, você
precisa definir esta conversão explicitamente).

<span class="emphasis">*Coluna linkada:* </span> UOM

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250359e275" class="table">

<div class="table-title">

Table 1.2. Conversion
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |   Valores (Padrão)   |     Chave restritiva     |                                                                          Regra de validação                                                                          |                            Descrição                             |                                                                                 Comentário/Ajuda                                                                                  |
| :--------------------: | :------------------: | :------------------: | :----------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Conversão de UDM    |          ID          |                      |                          |                                                                                                                                                                      |                    Unit of Measure Conversion                    |                                  The UOM Conversion identifies a unique to and from Unit of Measure, conversion rate and conversion date range.                                   |
|        Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) | c\_uom\_conversionclient |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|      Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  c\_uom\_conversionorg   |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|          UDM           |    Tabela Direta     |        C\_UOM        |   cuom\_cuomconversion   |                                                                                                                                                                      |                         Unit of Measure                          |                                                               The UOM defines a unique non monetary Unit of Measure                                                               |
|        Para UDM        |        Tabela        |        C\_UOM        |    c\_uomconversionto    |                                                                                                                                                                      |              Target or destination Unit of Measure               |                                                        The UOM To indicates the destination UOM for a UOM Conversion pair.                                                        |
|        Produto         |       Procurar       |                      | mproduct\_cuomconversion | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                      Product, Service, Item                      |                                                    Identifies an item which is either purchased or sold in this organization.                                                     |
|         Ativo          |       Sim-Não        |         (Y)          |                          |                                                                                                                                                                      |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|  Taxa Multiplicadora   |        Número        |                      |                          |                                                                                                                                                                      |     Rate to multiple the source by to calculate the target.      | To convert Source number to Target number, the Source is multiplied by the multiply rate. If the Multiply Rate is entered, then the Divide Rate will be automatically calculated. |
|     Taxa Divisora      |        Número        |                      |                          |                                                                                                                                                                      | To convert Source number to Target number, the Source is divided |       To convert Source number to Target number, the Source is divided by the divide rate. If you enter a Divide Rate, the Multiply Rate will be automatically calculated.        |
| C\_UOM\_Conversion\_UU | Texto Curto (String) |                      |                          |                                                                                                                                                                      |                                                                  |                                                                                                                                                                                   |

</div>

</div>

  

<div id="d250359e448" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - C\_UOM\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_UOM_Trl_data)

<span class="emphasis">*Descrição:*</span> Tradução de Unidade de Medida

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250359e465" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo  |      Referência      |  Valores (Padrão)  |  Chave restritiva   |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------: | :------------------: | :----------------: | :-----------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     |    Tabela Direta     | (@AD\_Client\_ID@) |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização   |    Tabela Direta     |  (@AD\_Org\_ID@)   |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       UDM       |    Tabela Direta     |                    |    cuom\_cuomtrl    |                                                  |             Unit of Measure              |                                            The UOM defines a unique non monetary Unit of Measure                                             |
|     Idioma      |        Tabela        |    AD\_Language    | adlanguage\_cuomtrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|      Ativo      |       Sim-Não        |        (Y)         |                     |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Traduzida    |       Sim-Não        |                    |                     |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|     Símbolo     | Texto Curto (String) |                    |                     |                                                  |       Symbol for a Unit of Measure       |                              The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure                              |
|      Nome       | Texto Curto (String) |                    |                     |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição    | Texto Curto (String) |                    |                     |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| C\_UOM\_Trl\_UU | Texto Curto (String) |                    |                     |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
