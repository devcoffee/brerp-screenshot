---
title: "Tipos de Partes"
id: TiposdePartes
---
<div id="d244026e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipos de Partes

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo -
    M\_PartType](#d244026e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tipos de Partes para
Produção

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2011-07-27 15:18:08.0

<span class="emphasis">*Atualizado em:* </span>2011-07-27 15:18:08.0

<div id="d244026e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo - M\_PartType

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d244026e29" class="table">

<div class="table-title">

Table 1.1. Type
Fields

</div>

<div class="table-contents">

|  Nome do campo  |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Parte  |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|     Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Nome       | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição    | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|      Ativo      |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| M\_PartType\_UU | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
