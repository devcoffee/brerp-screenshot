---
title: "Classe do Produto"
id: ClassedoProduto
---
<div id="d21227e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Classe do Produto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Classe do Produto -
    COF\_ProductClass](#d21227e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-02 10:53:17.0

<span class="emphasis">*Atualizado em:* </span>2017-01-02 10:53:17.0

![](/img/manual/ClassedoProduto.png)

<div id="d21227e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Classe do Produto - COF\_ProductClass

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ProductClass_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d21227e32" class="table">

<div class="table-title">

Table 1.1. Product Class
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                               Regra de validação                                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :------------------: | :------------------: | :-----------------------------: | :-----------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Classe do Produto |          ID          |                      |                                 |                                                                                 |       Primary Key : Product Class        |                                                         Primary Key : Product Class                                                          |
|      Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                        AD\_Client.AD\_Client\_ID \< \> 0                        |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca   | Texto Curto (String) |                      |                                 |                                                                                 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome        | Texto Curto (String) |                      |                                 |                                                                                 |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Curto (String) |                      |                                 |                                                                                 | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Tipo do Produto  |       Procurar       | COF\_ProductType\_ID | COFProductType\_COFProductClass | COF\_ProductType.AD\_Org\_ID = @AD\_Org\_ID@ OR COF\_ProductType.AD\_Org\_ID= 0 |        Primary Key : Product Type        |                                                          Primary Key : Product Type                                                          |
|       Ativo       |       Sim-Não        |         (Y)          |                                 |                                                                                 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
