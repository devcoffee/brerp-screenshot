---
title: "Grupo do Produto"
id: GrupodoProduto
---
<div id="d112930e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo do Produto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo do Produto -
    COF\_ProductGroup](#d112930e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-02 11:05:38.0

<span class="emphasis">*Atualizado em:* </span>2017-01-02 11:05:38.0

![](/img/manual/GrupodoProduto.png)

<div id="d112930e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo do Produto - COF\_ProductGroup

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ProductGroup_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112930e32" class="table">

<div class="table-title">

Table 1.1. Product Group
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |   Valores (Padrão)    |        Chave restritiva         |                                                          Regra de validação                                                           |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :------------------: | :-------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo do Produto  |          ID          |                       |                                 |                                                                                                                                       |       Primary Key : Product Group        |                                                         Primary Key : Product Group                                                          |
|      Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@)  |                                 |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |    Tabela Direta     |   (@\#AD\_Org\_ID@)   |                                 |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca   | Texto Curto (String) |                       |                                 |                                                                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome        | Texto Curto (String) |                       |                                 |                                                                                                                                       |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Curto (String) |                       |                                 |                                                                                                                                       | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Tipo do Produto  |       Procurar       | COF\_ProductType\_ID  | COFProductType\_COFProductGroup |                            COF\_ProductType.AD\_Org\_ID = @AD\_Org\_ID@ OR COF\_ProductType.AD\_Org\_ID= 0                            |        Primary Key : Product Type        |                                                          Primary Key : Product Type                                                          |
| Classe do Produto |       Procurar       | COF\_ProductClass\_ID | COFProductClass\_COFProductGrou | COF\_ProductType\_ID = @COF\_ProductType\_ID@ AND (COF\_ProductClass.AD\_Org\_ID = @AD\_Org\_ID@ OR COF\_ProductClass.AD\_Org\_ID= 0) |       Primary Key : Product Class        |                                                         Primary Key : Product Class                                                          |
|       Ativo       |       Sim-Não        |          (Y)          |                                 |                                                                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
