---
title: "Etiqueta"
id: Etiqueta
---
<div id="d90664e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Etiqueta

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Etiqueta -
    COF\_Label](#d90664e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Essa é a janela para as abas
de etiqueta, campo e janela

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-02 14:08:37.0

<span class="emphasis">*Atualizado em:* </span>2017-01-02 14:10:46.0

<div id="d90664e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Etiqueta - COF\_Label

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_Label_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d90664e31" class="table">

<div class="table-title">

Table 1.1. Label
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |                                 Valores (Padrão)                                  |        Chave restritiva         |                                                                          Regra de validação                                                                          |                                 Descrição                                 |                                                 Comentário/Ajuda                                                 |
| :--------------------------------: | :------------------: | :-------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
|              Etiqueta              |          ID          |                                                                                   |                                 |                                                                                                                                                                      |                            Primary Key : Label                            |                                               Primary Key : Label                                                |
|              Empresa               |    Tabela Direta     |                               (@\#AD\_Client\_ID@)                                |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                    (semelhante ao primeiro relatório)                     |                                               (ver o mesmo acima)                                                |
|            Organização             |    Tabela Direta     |                                 (@\#AD\_Org\_ID@)                                 |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                    (semelhante ao primeiro relatório)                     |                                               (ver o mesmo acima)                                                |
|           Chave de Busca           | Texto Curto (String) |                                                                                   |                                 |                                                                                                                                                                      |                    (semelhante ao primeiro relatório)                     |                                               (ver o mesmo acima)                                                |
|              Produto               |       Procurar       |                                                                                   |       MProduct\_COFLabel        | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                          Product, Service, Item                           |                    Identifies an item which is either purchased or sold in this organization.                    |
| Instância do Conjunto de Atributos | Atributo de Produto  |                                                                                   | MAttributeSetInstance\_COFLabel |                                                                                                                                                                      |                      Product Attribute Set Instance                       | The values of the actual Product Attribute Instances. The product level attributes are defined on Product level. |
|                Lote                |       Procurar       |                                                                                   |         MLot\_COFLabel          |                                                                                                                                                                      |                          Product Lot Definition                           |                                         The individual Lot of a Product                                          |
|             Lote Núm.              | Texto Curto (String) |                                                                                   |                                 |                                                                                                                                                                      |                         Lot number (alphanumeric)                         |                      The Lot Number indicates the specific lot that a product was part of.                       |
|             Núm. Série             | Texto Curto (String) |                                                                                   |                                 |                                                                                                                                                                      |                           Product Serial Number                           |      The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.      |
|            Localizador             |  Locator (Armazém)   |                                                                                   |       MLocator\_COFLabel        |                                                                                                                                                                      |                             Warehouse Locator                             |                         The Locator indicates where in a Warehouse a product is located.                         |
|             Quantidade             |        Número        |                                                                                   |                                 |                                                                                                                                                                      |                                 Quantity                                  |                The Quantity indicates the number of a specific product or item for this document.                |
|       Vencimento da Garantia       |         Data         |                                                                                   |                                 |                                                                                                                                                                      |                        Date when guarantee expires                        |                              Date when the normal guarantee or availability expires                              |
|               Estado               |        Lista         | Apontamento de Entrada Apontamento de Saída Gerada Entrada Anulada Saída Impressa |                                 |                                                                                                                                                                      |                   Status of the currently running check                   |                                      Status of the currently running check                                       |
|              Emissão               |        Lista         |                               Balança Outros Avulsa                               |                                 |                                                                                                                                                                      |             Hold the information about the emission type used             |                                                                                                                  |
|       Número do Equipamento        | Texto Curto (String) |                                                                                   |                                 |                                                                                                                                                                      | Equipment No. is the identifier of an equipment used to generate a label. |                    Equipment No. is the identifier of an equipment used to generate a label.                     |
|           Is Replacement           |       Sim-Não        |                                                                                   |                                 |                                                                                                                                                                      |               indicates that the object are being replaced                |                                   indicates that the object are being replaced                                   |
|               Ativo                |       Sim-Não        |                                        (Y)                                        |                                 |                                                                                                                                                                      |                    (semelhante ao primeiro relatório)                     |                                               (ver o mesmo acima)                                                |
|         Invalidar Etiqueta         |        Botão         |                                                                                   |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                  |
|        Reimprimir Etiqueta         |        Botão         |                                                                                   |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                  |
|           É Reimpressão            |       Sim-Não        |                                                                                   |                                 |                                                                                                                                                                      |            Indicates that label was reprinted at least 1 time             |                                Indicates that label was reprinted at least 1 time                                |

</div>

</div>

  

</div>
