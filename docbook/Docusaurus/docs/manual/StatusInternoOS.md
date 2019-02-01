---
title: "Status Interno OS"
id: StatusInternoOS
---
<div id="d237352e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Status Interno OS

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Status Interno OS -
    COF\_StatusInternoOS](#d237352e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-06-04 14:20:28.0

<span class="emphasis">*Atualizado em:* </span>2018-06-04 14:20:28.0

![](/img/manual/StatusInternoOS.png)

<div id="d237352e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Status Interno OS - COF\_StatusInternoOS

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d237352e30" class="table">

<div class="table-title">

Table 1.1. Status Interno OS
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| COF\_StatusInternoOS\_UU | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |
| COF\_StatusInternoOS\_ID |          ID          |                      |                  |                                                  |     Primary Key : Status Interno OS      |                                                       Primary Key : Status Interno OS                                                        |
|         Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Chave de Busca      | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Ativo           |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Nome           | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>