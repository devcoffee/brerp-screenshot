---
title: "Grupo de Fornecedores"
id: GrupodeFornecedores
---
<div id="d111252e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Fornecedores

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Fornecedores -
    COF\_GrupoFornecedor](#d111252e22)</span>
  - <span class="section">[2. Tabela: Parceiro de Negócios -
    C\_BPartner](#d111252e172)</span>
  - <span class="section">[3. Tabela: Produto -
    M\_Product](#d111252e271)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-04-25 14:26:59.0

<span class="emphasis">*Atualizado em:* </span>2018-04-25 14:26:59.0

<div id="d111252e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Fornecedores - COF\_GrupoFornecedor

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d111252e29" class="table">

<div class="table-title">

Table 1.1. Grupo de Fornecedores
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| COF\_GrupoFornecedor\_UU | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |
|  Grupo de Fornecedores   |          ID          |                      |                  |                                                  |          Grupo de Fornecedores           |                                                            Grupo de Fornecedores                                                             |
|         Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Chave de Busca      | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Ativo           |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Nome           | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

<div id="d111252e172" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parceiro de Negócios - C\_BPartner

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_BPartner_data)

<span class="emphasis">*Coluna linkada:* </span> Grupo de Fornecedores

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d111252e185" class="table">

<div class="table-title">

Table 1.2. Parceiro de Negócios
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   |  Chave restritiva   |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :------------: | :------------------: | :------------------: | :-----------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) | adclient\_cbpartner |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|  Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  adorg\_cbpartner   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
| Chave de Busca | Texto Curto (String) |                      |                     |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|      Nome      | Texto Curto (String) |                      |                     |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |

</div>

</div>

  

<div id="d111252e271" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Produto - M\_Product

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Product_data)

<span class="emphasis">*Coluna linkada:* </span> Grupo de Fornecedores

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d111252e284" class="table">

<div class="table-title">

Table 1.3. Produto
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   |  Chave restritiva  |                                         Regra de validação                                          |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :------------: | :------------------: | :------------------: | :----------------: | :-------------------------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) | adclient\_mproduct |                                  AD\_Client.AD\_Client\_ID \< \> 0                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|  Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   | ad\_org\_mproduct  |                          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                           |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|      Nome      | Texto Curto (String) |                      |                    | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| Chave de Busca | Texto Curto (String) |                      |                    | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
