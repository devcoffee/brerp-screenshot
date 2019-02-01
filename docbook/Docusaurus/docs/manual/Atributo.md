---
title: "Atributo"
id: Atributo
---
<div id="d13949e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Atributo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Atributo -
    M\_Attribute](#d13949e23)</span>
  - <span class="section">[2. Tabela: Valor de Atributo -
    M\_AttributeValue](#d13949e226)</span>

</div>

<span class="emphasis">*Descrição:* </span> Atributo de Produto

<span class="emphasis">*Comentário/Ajuda:* </span>Atributo de Produto
como Cor, Tamanho, etc.

<span class="emphasis"> *Criado em:* </span>2003-05-06 15:07:15.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Atributo.png)

<div id="d13949e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Atributo - M\_Attribute

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Attribute_data)

<span class="emphasis">*Descrição:*</span> Atributo de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Cor, Tamanho, etc. de
Atributo de Produto. Se ele for um atributo de Instância, todos os
produtos tem o mesmo valor.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d13949e40" class="table">

<div class="table-title">

Table 1.1. Attribute
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |         Valores (Padrão)         |       Chave restritiva       |                Regra de validação                |                                         Descrição                                         |                                                                                                                                                                                                                          Comentário/Ajuda                                                                                                                                                                                                                           |
| :-----------------------: | :------------------: | :------------------------------: | :--------------------------: | :----------------------------------------------: | :---------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Atributo          |          ID          |                                  |                              |                                                  |                                     Product Attribute                                     |                                                                                                                                                                                                                 Product Attribute like Color, Size                                                                                                                                                                                                                  |
|          Empresa          |    Tabela Direta     |       (@\#AD\_Client\_ID@)       |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |                            (semelhante ao primeiro relatório)                             |                                                                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                                                                         |
|        Organização        |    Tabela Direta     |        (@\#AD\_Org\_ID@)         |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                            (semelhante ao primeiro relatório)                             |                                                                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                                                                         |
|           Nome            | Texto Curto (String) |                                  |                              |                                                  |                           Alphanumeric identifier of the entity                           |                                                                                                                                                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                             |
|         Descrição         | Texto Curto (String) |                                  |                              |                                                  |                         Optional short description of the record                          |                                                                                                                                                                                                             A description is limited to 255 characters.                                                                                                                                                                                                             |
|           Ativo           |       Sim-Não        |               (Y)                |                              |                                                  |                            (semelhante ao primeiro relatório)                             |                                                                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                                                                         |
|        Obrigatório        |       Sim-Não        |                                  |                              |                                                  |                           Data entry is required in this column                           |                                                                                                                                                                                               The field must have a value for the record to be saved to the database.                                                                                                                                                                                               |
| Tipo de Valor de Atributo |        Lista         | Lista Número Texto (máx. 40) (S) |                              |                                                  |                                  Type of Attribute Value                                  |                                                                                                                                                                                                    The Attribute Value type determines the data/validation type                                                                                                                                                                                                     |
|   Atributo de Instância   |       Sim-Não        |                                  |                              |                                                  | The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date) |                                                                                                          If selected, the individual instance of the product has this attribute - like the individual Serial or Lot Numbers or Guarantee Date of a product instance. If not selected, all instances of the product share the attribute (e.g. color=green).                                                                                                          |
|    Procura de Atributo    |    Tabela Direta     |                                  | mattributesearch\_mattribute |                                                  |                                  Common Search Attribute                                  | Attributes are specific to a Product Attribute Set (e.g. Size for T-Shirts: S,M,L). If you have multiple attributes and want to search under a common attribute, you define a search attribute. Example: have one Size search attribute combining the values of all different sizes (Size for Dress Shirt XL,L,M,S,XS). The Attribute Search allows you to have all values available for selection. This eases the maintenance of the individual product attribute. |
|     M\_Attribute\_UU      | Texto Curto (String) |                                  |                              |                                                  |                                                                                           |                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d13949e226" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Valor de Atributo - M\_AttributeValue

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_AttributeValue_data)

<span class="emphasis">*Descrição:*</span> Valor de Atributo de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Valor individual de
um Atributo de Produto (ex. verde, grande, ..)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d13949e243" class="table">

<div class="table-title">

Table 1.2. Attribute Value
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Valor de Atributo   |          ID          |                    |                             |                                                  |         Product Attribute Value          |                                       Individual value of a product attribute (e.g. green, large, ..)                                        |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Atributo        |    Tabela Direta     |                    | mattribute\_mattributevalue |                                                  |            Product Attribute             |                                                      Product Attribute like Color, Size                                                      |
|    Chave de Busca     | Texto Curto (String) |                    |                             |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome          | Texto Curto (String) |                    |                             |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       | Texto Curto (String) |                    |                             |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Ativo         |       Sim-Não        |        (Y)         |                             |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| M\_AttributeValue\_UU | Texto Curto (String) |                    |                             |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
