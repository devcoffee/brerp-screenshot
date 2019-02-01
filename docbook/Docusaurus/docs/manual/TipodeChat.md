---
title: "Tipo de Chat"
id: TipodeChat
---
<div id="d240618e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Chat

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Chat Type -
    CM\_ChatType](#d240618e22)</span>
  - <span class="section">[2. Tabela: Atualizações -
    CM\_ChatTypeUpdate](#d240618e192)</span>

</div>

<span class="emphasis">*Descrição:* </span> Manutenção de tipos de Chat

<span class="emphasis">*Comentário/Ajuda:* </span>Tipo de Chat

<span class="emphasis"> *Criado em:* </span>2006-04-16 15:36:19.0

<span class="emphasis">*Atualizado em:* </span>2006-04-18 12:28:35.0

<div id="d240618e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Chat Type - CM\_ChatType

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Maintain Type of discussion /
chat

<span class="emphasis">*Comentário/Ajuda:* </span> Chat Type allows you
to receive subscriptions for particular content of discussions. It is
linked to a table.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240618e37" class="table">

<div class="table-title">

Table 1.1. Chat Type
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |                   Valores (Padrão)                   |  Chave restritiva   |        Regra de validação         |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :--------------------------------------------------: | :-----------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Chat Type     |          ID          |                                                      |                     |                                   |        Type of discussion / chat         |                Chat Type allows you to receive subscriptions for particular content of discussions. It is linked to a table.                 |
|     Empresa      |    Tabela Direta     |                                                      |                     | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |                                                      |                     |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       | Texto Curto (String) |                                                      |                     |                                   |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     | Texto Curto (String) |                                                      |                     |                                   | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|      Ativo       |       Sim-Não        |                                                      |                     |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Tabela      |    Tabela Direta     |                                                      | adtable\_cmchattype |                                   |        Database Table information        |                                     The Database Table provides the information of the table definition                                      |
| Moderation Type  |        Lista         | After Publishing Before Publishing Not moderated (N) |                     |                                   |            Type of moderation            |                                                                                                                                              |
| CM\_ChatType\_UU | Texto Curto (String) |                                                      |                     |                                   |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d240618e192" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Atualizações - CM\_ChatTypeUpdate

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Subscribers for the Chat Type

<span class="emphasis">*Comentário/Ajuda:* </span> Subscribers receive
updates per email or notice

<span class="emphasis">*Coluna linkada:* </span> Chat Type

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d240618e211" class="table">

<div class="table-title">

Table 1.2. Updates
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   | Valores (Padrão) |       Chave restritiva       |        Regra de validação         |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :-------------: | :-----------: | :--------------: | :--------------------------: | :-------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta |                  |                              | AD\_Client.AD\_Client\_ID \< \> 0 |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|   Organização   | Tabela Direta |                  |                              |                                   |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|    Chat Type    | Tabela Direta |                  | cmchattype\_cmchattypeupdate |                                   |                         Type of discussion / chat                          |                                                 Chat Type allows you to receive subscriptions for particular content of discussions. It is linked to a table.                                                 |
| Usuário/Contato | Tabela Direta |                  |   aduser\_cmchattypeupdate   |                                   |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|      Ativo      |    Sim-Não    |                  |                              |                                   |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|  Auto-Serviço   |    Sim-Não    |                  |                              |                                   | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |

</div>

</div>

  

</div>
