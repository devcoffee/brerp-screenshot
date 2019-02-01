---
title: "Motivo de Expiração de Lead"
id: MotivodeExpiracaodeLead
---
<div id="d148501e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Motivo de Expiração de Lead

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Lead Expiration Reason -
    COF\_C\_LeadExpirationReason](#d148501e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-10-31 22:36:32.0

<span class="emphasis">*Atualizado em:* </span>2016-10-31 22:36:32.0

![](/img/manual/MotivodeExpiracaodeLead.png)

<div id="d148501e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Lead Expiration Reason - COF\_C\_LeadExpirationReason

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d148501e30" class="table">

<div class="table-title">

Table 1.1. Lead Expiration Reason
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Motivo de Expiração de Lead |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|           Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Chave de Busca        | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Nome             | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição          | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|            Ativo            |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
