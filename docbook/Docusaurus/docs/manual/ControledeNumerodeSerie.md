---
title: "Controle de Número de Série"
id: ControledeNumerodeSerie
---
<div id="d37928e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Controle de Número de Série

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Controle de Número de Série -
    M\_SerNoCtl](#d37928e23)</span>
  - <span class="section">[2. Tabela: Excluir -
    M\_SerNoCtlExclude](#d37928e256)</span>

</div>

<span class="emphasis">*Descrição:* </span> Controle de Número de Série
de Produto

<span class="emphasis">*Comentário/Ajuda:* </span>Definição para criar
Números de Série para Produtos

<span class="emphasis"> *Criado em:* </span>2003-05-05 21:13:49.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ControledeNumerodeSerie.png)

<div id="d37928e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Controle de Número de Série - M\_SerNoCtl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_SerNoCtl_data)

<span class="emphasis">*Descrição:*</span> Controle de Número de Série
de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Definição para criar
Números de Série para Produtos

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d37928e40" class="table">

<div class="table-title">

Table 1.1. Serial No Control
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                      Descrição                      |                                                               Comentário/Ajuda                                                               |
| :-------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       M\_SerNoCtl\_UU       | Texto Curto (String) |                      |                  |                                                  |                                                     |                                                                                                                                              |
| Controle de Número de Série |          ID          |                      |                  |                                                  |            Product Serial Number Control            |                                               Definition to create Serial numbers for Products                                               |
|           Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |         (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|         Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |         (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|            Nome             | Texto Curto (String) |                      |                  |                                                  |        Alphanumeric identifier of the entity        | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição          | Texto Curto (String) |                      |                  |                                                  |      Optional short description of the record       |                                                 A description is limited to 255 characters.                                                  |
|            Ativo            |       Sim-Não        |         (Y)          |                  |                                                  |         (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|        Núm. Inicial         |       Inteiro        |        (100)         |                  |                                                  |              Starting number/position               |                           The Start Number indicates the starting position in the line or field number in the line                           |
|         Incremento          |       Inteiro        |         (1)          |                  |                                                  | The number to increment the last document number by |              The Increment indicates the number to increment the last document number by to arrive at the next sequence number               |
|       Próximo Número        |       Inteiro        |        (100)         |                  |                                                  |             The next number to be used              |                                     The Current Next indicates the next number to use for this document                                      |
|           Prefixo           | Texto Curto (String) |                      |                  |                                                  |          Prefix before the sequence number          |                                The Prefix indicates the characters to print in front of the document number.                                 |
|           Sufixo            | Texto Curto (String) |                      |                  |                                                  |               Suffix after the number               |                                    The Suffix indicates the characters to append to the document number.                                     |
|           Formato           | Texto Curto (String) |                      |                  |                                                  |                  Numero de casas.                   |                                                  Numero de casas. Ex: 0001 ou 01 ou 0000001                                                  |

</div>

</div>

  

<div id="d37928e256" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Excluir - M\_SerNoCtlExclude

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Exclui a capacidade de criar
Números de Série nos Conjuntos de Atributos

<span class="emphasis">*Comentário/Ajuda:* </span> Crie um registro, Se
você deseja excluir a capacidade de criar Números de Série nas
informações de Conjuntos de Atributos de Produto. Note que a
Informação é armazenada em memória cache. Para efetivar, você deve
fazer novo login ou resetar a memória cache.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d37928e271" class="table">

<div class="table-title">

Table 1.2. Exclude
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      | Valores (Padrão) |      Chave restritiva       |                                                                                Regra de validação                                                                                 |                           Descrição                            |                               Comentário/Ajuda                                |
| :-------------------------: | :------------------: | :--------------: | :-------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------: | :---------------------------------------------------------------------------: |
|        Exclude SerNo        |          ID          |                  |                             |                                                                                                                                                                                   | Exclude the ability to create Serial Numbers in Attribute Sets |                                                                               |
|           Empresa           |    Tabela Direta     |                  |                             |                                                                         AD\_Client.AD\_Client\_ID \< \> 0                                                                         |               (semelhante ao primeiro relatório)               |                              (ver o mesmo acima)                              |
|         Organização         |    Tabela Direta     |                  |                             |                                                                                                                                                                                   |               (semelhante ao primeiro relatório)               |                              (ver o mesmo acima)                              |
| Controle de Número de Série |    Tabela Direta     |                  | msernoctl\_msernoctlexclude |                                                                                                                                                                                   |                 Product Serial Number Control                  |               Definition to create Serial numbers for Products                |
|            Ativo            |       Sim-Não        |                  |                             |                                                                                                                                                                                   |               (semelhante ao primeiro relatório)               |                              (ver o mesmo acima)                              |
|           Tabela            |    Tabela Direta     |                  |  adtable\_msernoctlexclude  | EXISTS (SELECT \* FROM AD\_Column c WHERE AD\_Table.AD\_Table\_ID=c.AD\_Table\_ID AND c.ColumnName='M\_AttributeSetInstance\_ID' AND c.IsUpdateable='Y') AND AD\_Table.IsView='N' |                   Database Table information                   |      The Database Table provides the information of the table definition      |
|     Transação de Vendas     |       Sim-Não        |                  |                             |                                                                                                                                                                                   |                  This is a Sales Transaction                   | The Sales Transaction checkbox indicates if this item is a Sales Transaction. |
|   M\_SerNoCtlExclude\_UU    | Texto Curto (String) |                  |                             |                                                                                                                                                                                   |                                                                |                                                                               |

</div>

</div>

  

</div>
