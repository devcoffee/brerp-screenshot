---
title: "Tipo de Atividade"
id: TipodeAtividade
---
<div id="d240470e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Atividade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Atividade -
    COF\_Activity\_Type](#d240470e22)</span>
  - <span class="section">[2. Tabela: Estado de Atividade -
    COF\_Activity\_Status](#d240470e158)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-10-04 22:01:57.0

<span class="emphasis">*Atualizado em:* </span>2016-10-04 22:01:57.0

<div id="d240470e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Atividade - COF\_Activity\_Type

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240470e29" class="table">

<div class="table-title">

Table 1.1. Activity Type
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Tipo de Atividade |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|      Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca   | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome        | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|       Ativo       |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d240470e158" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Estado de Atividade - COF\_Activity\_Status

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d240470e165" class="table">

<div class="table-title">

Table 1.2. Activity Status
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Estado da Atividade  |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Tipo de Atividade   |    Tabela Direta     |                      |                  |                                                  |                                          |                                                                                                                                              |
|    Chave de Busca    | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Ativo         |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Estado de Abertura  |       Sim-Não        |        ('N')         |                  |                                                  |                                          |                                                                                                                                              |
| Estado de Fechamento |       Sim-Não        |         (N)          |                  |                                                  |           The status is closed           |                                                  This allows to have multiple closed status                                                  |
|         Nome         | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
