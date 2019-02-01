---
title: "View Chat"
id: ViewChat
---
<div id="d254079e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: View Chat

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Bate-Papo (Chat) -
    CM\_Chat](#d254079e23)</span>
  - <span class="section">[2. Tabela: Chat Entry -
    CM\_ChatEntry](#d254079e222)</span>
  - <span class="section">[3. Tabela: Atualizações -
    CM\_ChatUpdate](#d254079e466)</span>

</div>

<span class="emphasis">*Descrição:* </span> View discussions / chats

<span class="emphasis">*Comentário/Ajuda:* </span>View chat / discussion
threads

<span class="emphasis"> *Criado em:* </span>2006-04-05 12:05:02.0

<span class="emphasis">*Atualizado em:* </span>2006-04-18 13:35:13.0

![](/img/manual/ViewChat.png)

<div id="d254079e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Bate-Papo (Chat) - CM\_Chat

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> View Chat or discussion
thread

<span class="emphasis">*Comentário/Ajuda:* </span> Thread of discussion

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d254079e38" class="table">

<div class="table-title">

Table 1.1. Chat
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |                      Valores (Padrão)                      |  Chave restritiva  |        Regra de validação         |                Descrição                 |                                                                                                   Comentário/Ajuda                                                                                                   |
| :---------------: | :------------------: | :--------------------------------------------------------: | :----------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Bate-Papo (Chat)  |          ID          |                                                            |                    |                                   |        Chat or discussion thread         |                                                                                                 Thread of discussion                                                                                                 |
|      Empresa      |    Tabela Direta     |                                                            |                    | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                  |
|    Organização    |    Tabela Direta     |                                                            |                    |                                   |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Descrição     | Texto Curto (String) |                                                            |                    |                                   | Optional short description of the record |                                                                                     A description is limited to 255 characters.                                                                                      |
|       Ativo       |       Sim-Não        |                                                            |                    |                                   |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Chat Type     |    Tabela Direta     |                                                            | cmchattype\_cmchat |                                   |        Type of discussion / chat         |                                                    Chat Type allows you to receive subscriptions for particular content of discussions. It is linked to a table.                                                     |
| Confidencialidade |        Lista         | Informação Pública Confidencial Interno Informação Privada |                    |                                   |         Type of Confidentiality          |                                                                                                                                                                                                                      |
|      Tabela       |    Tabela Direta     |                                                            |  adtable\_cmchat   |                                   |        Database Table information        |                                                                         The Database Table provides the information of the table definition                                                                          |
|  ID do Registro   |        Botão         |                                                            |                    |                                   |        Direct internal record ID         | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|  Moderation Type  |        Lista         |      After Publishing Before Publishing Not moderated      |                    |                                   |            Type of moderation            |                                                                                                                                                                                                                      |
|   CM\_Chat\_UU    | Texto Curto (String) |                                                            |                    |                                   |                                          |                                                                                                                                                                                                                      |

</div>

</div>

  

<div id="d254079e222" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Chat Entry - CM\_ChatEntry

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Individual Chat / Discussion
Entry

<span class="emphasis">*Comentário/Ajuda:* </span> The entry can not be
changed - just the confidentiality

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d254079e237" class="table">

<div class="table-title">

Table 1.2. Chat Entry
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência            |                      Valores (Padrão)                      |     Chave restritiva     |        Regra de validação         |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :--------------------: | :------------------------------: | :--------------------------------------------------------: | :----------------------: | :-------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|       Bate-papo        |                ID                |                                                            |                          |                                   |              Individual Chat / Discussion Entry               |                            The entry can not be changed - just the confidentiality                            |
|        Empresa         |          Tabela Direta           |                                                            |                          | AD\_Client.AD\_Client\_ID \< \> 0 |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|      Organização       |          Tabela Direta           |                                                            |                          |                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|    Bate-Papo (Chat)    |          Tabela Direta           |                                                            |   cmchat\_chchatentry    |                                   |                   Chat or discussion thread                   |                                             Thread of discussion                                              |
|         Ativo          |             Sim-Não              |                                                            |                          |                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|   Moderation Status    |              Lista               |   Not Displayed Publicado To be reviewed Suspicious (P)    |                          |                                   |                     Status of Moderation                      |                                                                                                               |
|   Confidencialidade    |              Lista               | Informação Pública Confidencial Interno Informação Privada |                          |                                   |                    Type of Confidentiality                    |                                                                                                               |
|    Chat Entry Type     |              Lista               |           Forum (threaded) Note (flat) Wiki (N)            |                          |                                   |                   Type of Chat/Forum Entry                    |                                                                                                               |
|        Assunto         |       Texto Curto (String)       |                                                            |                          |                                   |                     Email Message Subject                     |                                             Subject of the EMail                                              |
| Chat Entry Grandparent |              Tabela              |                       CM\_ChatEntry                        | cmchatentry\_grandparent |                                   |               Link to Grand Parent (root level)               |                                                                                                               |
|   Chat Entry Parent    |              Tabela              |                       CM\_ChatEntry                        | cmentrty\_cmentryparent  |                                   |                     Link to direct Parent                     |                                                                                                               |
|  Dados de Caracteres   | Texto Longo (\> 2000 caracteres) |                                                            |                          |                                   |                     Long Character Field                      |                                                                                                               |
|    Usuário/Contato     |          Tabela Direta           |                                                            |   aduser\_cmchatentry    |                                   | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|   CM\_ChatEntry\_UU    |       Texto Curto (String)       |                                                            |                          |                                   |                                                               |                                                                                                               |

</div>

</div>

  

<div id="d254079e466" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Atualizações - CM\_ChatUpdate

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Subscribers for this Chat

<span class="emphasis">*Comentário/Ajuda:* </span> Subscribers receive
updates per email or notice. In addition to the subscribers for this
specific cta, also the subscribers of the Chat Type receive updates.

<span class="emphasis">*Coluna linkada:* </span> Chat

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d254079e485" class="table">

<div class="table-title">

Table 1.3. Updates
Fields

</div>

<div class="table-contents">

|  Nome do campo   |  Referência   | Valores (Padrão) |   Chave restritiva   |        Regra de validação         |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :--------------: | :-----------: | :--------------: | :------------------: | :-------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa      | Tabela Direta |                  |                      | AD\_Client.AD\_Client\_ID \< \> 0 |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|   Organização    | Tabela Direta |                  |                      |                                   |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
| Bate-Papo (Chat) | Tabela Direta |                  | cmchat\_cmchatupdate |                                   |                         Chat or discussion thread                          |                                                                                             Thread of discussion                                                                                              |
| Usuário/Contato  | Tabela Direta |                  | aduser\_cmchatupdate |                                   |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|      Ativo       |    Sim-Não    |                  |                      |                                   |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|   Auto-Serviço   |    Sim-Não    |                  |                      |                                   | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |

</div>

</div>

  

</div>
