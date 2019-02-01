---
title: "Conjunto de Atributos"
id: ConjuntodeAtributos
---
<div id="d34574e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Conjunto de Atributos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Conjunto de Atributos -
    M\_AttributeSet](#d34574e23)</span>
  - <span class="section">[2. Tabela: Uso de Atributos -
    M\_AttributeUse](#d34574e411)</span>
  - <span class="section">[3. Tabela: Excluir -
    M\_AttributeSetExclude](#d34574e548)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Conjuntos
de Atributos de Produto

<span class="emphasis">*Comentário/Ajuda:* </span>Definir Conjuntos de
Atributos de Produto para acrescentar outros atributos e valores ao
produto. Você precisa definir um Conjunto de Atributos se você quiser
habilitar o rastreamento de Número de Série, Lote e Data de Garantia.

<span class="emphasis"> *Criado em:* </span>2003-05-05 20:45:41.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ConjuntodeAtributos.png)

<div id="d34574e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Conjunto de Atributos - M\_AttributeSet

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_AttributeSet_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Conjuntos de
Atributos de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Definir Conjuntos de
Atributos de Produto para acrescentar outros atributos e valores ao
produto. Você precisa definir um Conjunto de Atributos se você quiser
habilitar o rastreamento de Número de Série, Lote e Data de Garantia.
Note que os Dias de Validade aqui determinam a Vida de Prateleira de uma
instância de um produto após a fabricação (os Dias de Validade do
produto determinam a data de Serviço ao Cliente após a venda). Se o
Conjunto de Atributos for obrigatório, uma instância de produto precisa
ser selecionada/criada antes da entrega.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d34574e40" class="table">

<div class="table-title">

Table 1.1. Attribute Set
Fields

</div>

<div class="table-contents">

|                  Nome do campo                   |      Referência      |               Valores (Padrão)               |    Chave restritiva     |                Regra de validação                |                                                      Descrição                                                      |                                                                                                                 Comentário/Ajuda                                                                                                                  |
| :----------------------------------------------: | :------------------: | :------------------------------------------: | :---------------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Conjunto de Atributos               |          ID          |                                              |                         |                                                  |                                                Product Attribute Set                                                |                                  Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking.                                   |
|                     Empresa                      |    Tabela Direta     |             (@\#AD\_Client\_ID@)             |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |                                         (semelhante ao primeiro relatório)                                          |                                                                                                                (ver o mesmo acima)                                                                                                                |
|                   Organização                    |    Tabela Direta     |              (@\#AD\_Org\_ID@)               |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                         (semelhante ao primeiro relatório)                                          |                                                                                                                (ver o mesmo acima)                                                                                                                |
|                       Nome                       | Texto Curto (String) |                                              |                         |                                                  |                                        Alphanumeric identifier of the entity                                        |                                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                    |
|                    Descrição                     | Texto Curto (String) |                                              |                         |                                                  |                                      Optional short description of the record                                       |                                                                                                    A description is limited to 255 characters.                                                                                                    |
|                      Ativo                       |       Sim-Não        |                     (Y)                      |                         |                                                  |                                         (semelhante ao primeiro relatório)                                          |                                                                                                                (ver o mesmo acima)                                                                                                                |
|              Atributo de Instância               |       Sim-Não        |                                              |                         |                                                  |              The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date)              | If selected, the individual instance of the product has this attribute - like the individual Serial or Lot Numbers or Guarantee Date of a product instance. If not selected, all instances of the product share the attribute (e.g. color=green). |
|                       Lote                       |       Sim-Não        |                                              |                         |                                                  |                                       The product instances have a Lot Number                                       |                                                                                                For individual products, you can define Lot Numbers                                                                                                |
|                 Lote Obrigatório                 |       Sim-Não        |                                              |                         |                                                  |                         The entry of Lot info is mandatory when creating a Product Instance                         |                                                                                                                                                                                                                                                   |
|                 Controle de Lote                 |    Tabela Direta     |                                              | mlotctl\_mattributeset  |                                                  |                                                 Product Lot Control                                                 |                                                                                                   Definition to create Lot numbers for Products                                                                                                   |
|           Sobrescrever Carac.Inic.Lote           | Texto Curto (String) |                                              |                         |                                                  |                                   Lot/Batch Start Indicator overwrite - default «                                   |                                                                                                  If not defined, the default character « is used                                                                                                  |
|          Sobrescrever Carac.Final Lote           | Texto Curto (String) |                                              |                         |                                                  |                                    Lot/Batch End Indicator overwrite - default »                                    |                                                                                                  If not defined, the default character » is used                                                                                                  |
|                    Núm. Série                    |       Sim-Não        |                                              |                         |                                                  |                                      The product instances have Serial Numbers                                      |                                                                                              For individual products, you can define Serial Numbers                                                                                               |
|              Núm. Série Obrigatório              |       Sim-Não        |                                              |                         |                                                  |                       The entry of a Serial No is mandatory when creating a Product Instance                        |                                                                                                                                                                                                                                                   |
|           Controle de Número de Série            |    Tabela Direta     |                                              | msernoctl\_attributeset |                                                  |                                            Product Serial Number Control                                            |                                                                                                 Definition to create Serial numbers for Products                                                                                                  |
|          Sobrescrever Carac.Inic.N.Ser           | Texto Curto (String) |                                              |                         |                                                  |                                Serial Number Start Indicator overwrite - default \#                                 |                                                                                                 If not defined, the default character \# is used                                                                                                  |
|          Sobrescrever Carac.Final N.Ser          | Texto Curto (String) |                                              |                         |                                                  |                                Serial Number End Indicator overwrite - default empty                                |                                                                                                       If not defined, no character is used                                                                                                        |
|              Vencimento da Garantia              |       Sim-Não        |                                              |                         |                                                  |                                        Product has Guarantee or Expiry Date                                         |                                                                                        For individual products, you can define a guarantee or expiry date                                                                                         |
|           Obrigatório Data de Validade           |       Sim-Não        |                                              |                         |                                                  |                     The entry of a Guarantee Date is mandatory when creating a Product Instance                     |                                                                                                                                                                                                                                                   |
|                Prazo de Validade                 |       Inteiro        |                                              |                         |                                                  |                                Number of days the product is guaranteed or available                                |                                            If the value is 0, there is no limit to the availability or guarantee, otherwise the guarantee date is calculated by adding the days to the delivery date.                                             |
| Usar Data de Garantia para Política de Materiais |       Sim-Não        |                     (N)                      |                         |                                                  |                                                                                                                     |                                                                                                                                                                                                                                                   |
|                 Tipo Obrigatório                 |        Lista         | Não Obrigatório Ao Enviar Sempre Obrigatório |                         |                                                  |                           The specification of a Product Attribute Instance is mandatory                            |                                                                                                                                                                                                                                                   |
|                IsAutoGenerateLot                 |       Sim-Não        |                     (N)                      |                         |                                                  |                                                                                                                     |                                                                                                                                                                                                                                                   |
|              Rastreabilidade (NFe)               |       Sim-Não        |                    ('N')                     |                         |                                                  | Quando marcado indica que produtos que utilizam este conjunto de atributos terão suas informações destacadas na NFe |                                           Quando marcado indica que produtos que utilizam este conjunto de atributos terão suas informações destacadas na NFe no grupo I80 - Rastreabilidade de Produto                                           |

</div>

</div>

  

<div id="d34574e411" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Uso de Atributos - M\_AttributeUse

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_AttributeUse_data)

<span class="emphasis">*Descrição:*</span> Atributos Usados para o
Conjunto de Atributos de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Atributos e Valores
de Atributo usados para o Produto

<span class="emphasis">*Coluna linkada:* </span> Attribute Set

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d34574e432" class="table">

<div class="table-title">

Table 1.2. Attribute Use
Fields

</div>

<div class="table-contents">

|     Nome do campo     |  Referência   |                                                    Valores (Padrão)                                                     |       Chave restritiva       |                Regra de validação                |                       Descrição                       |                                                                                Comentário/Ajuda                                                                                |
| :-------------------: | :-----------: | :---------------------------------------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa        | Tabela Direta |                                                   (@AD\_Client\_ID@)                                                    |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                                              (ver o mesmo acima)                                                                               |
|      Organização      | Tabela Direta |                                                     (@AD\_Org\_ID@)                                                     |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                                              (ver o mesmo acima)                                                                               |
| Conjunto de Atributos | Tabela Direta |                                                                                                                         | mattributeset\_mattributeuse |                                                  |                 Product Attribute Set                 | Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking. |
|       Atributo        | Tabela Direta |                                                                                                                         |  mattribute\_mattributeuse   |                                                  |                   Product Attribute                   |                                                                       Product Attribute like Color, Size                                                                       |
|         Ativo         |    Sim-Não    |                                                           (Y)                                                           |                              |                                                  |          (semelhante ao primeiro relatório)           |                                                                              (ver o mesmo acima)                                                                               |
|       Seqüência       |    Inteiro    | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM M\_AttributeUse WHERE M\_AttributeSet\_ID=@M\_AttributeSet\_ID@) |                              |                                                  | Method of ordering records; lowest number comes first |                                                                  The Sequence indicates the order of records                                                                   |

</div>

</div>

  

<div id="d34574e548" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Excluir - M\_AttributeSetExclude

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Exclui a capacidade de
introduzir Conjuntos de Atributos

<span class="emphasis">*Comentário/Ajuda:* </span> Crie um registro, Se
você deseja excluir a capacidade de introduzir informações de Conjuntos
de Atributos de Produto. Note que a Informação é armazenada em memória
cache. Para efetivar, você deve fazer novo login ou resetar a memória
cache.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d34574e563" class="table">

<div class="table-title">

Table 1.3. Exclude
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      | Valores (Padrão) |       Chave restritiva        |                                                                                Regra de validação                                                                                 |                  Descrição                  |                                                                                Comentário/Ajuda                                                                                |
| :------------------------: | :------------------: | :--------------: | :---------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Exclude Attribute Set    |          ID          |                  |                               |                                                                                                                                                                                   | Exclude the ability to enter Attribute Sets |                                                                                                                                                                                |
|          Empresa           |    Tabela Direta     |                  |                               |                                                                         AD\_Client.AD\_Client\_ID \< \> 0                                                                         |     (semelhante ao primeiro relatório)      |                                                                              (ver o mesmo acima)                                                                               |
|        Organização         |    Tabela Direta     |                  |                               |                                                                                                                                                                                   |     (semelhante ao primeiro relatório)      |                                                                              (ver o mesmo acima)                                                                               |
|   Conjunto de Atributos    |    Tabela Direta     |                  |   mattributeset\_masexclude   |                                                                                                                                                                                   |            Product Attribute Set            | Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking. |
|           Ativo            |       Sim-Não        |                  |                               |                                                                                                                                                                                   |     (semelhante ao primeiro relatório)      |                                                                              (ver o mesmo acima)                                                                               |
|           Tabela           |    Tabela Direta     |                  | adtable\_mattributesetexclude | EXISTS (SELECT \* FROM AD\_Column c WHERE AD\_Table.AD\_Table\_ID=c.AD\_Table\_ID AND c.ColumnName='M\_AttributeSetInstance\_ID' AND c.IsUpdateable='Y') AND AD\_Table.IsView='N' |         Database Table information          |                                                      The Database Table provides the information of the table definition                                                       |
|    Transação de Vendas     |       Sim-Não        |                  |                               |                                                                                                                                                                                   |         This is a Sales Transaction         |                                                 The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                  |
| M\_AttributeSetExclude\_UU | Texto Curto (String) |                  |                               |                                                                                                                                                                                   |                                             |                                                                                                                                                                                |

</div>

</div>

  

</div>
