---
title: "Estado da Solicitação"
id: EstadodaSolicitacao
---
<div id="d87736e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Estado da Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Status Category -
    R\_StatusCategory](#d87736e22)</span>
  - <span class="section">[2. Tabela: Estado da Solicitação -
    R\_Status](#d87736e193)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Estado das
Solicitações

<span class="emphasis">*Comentário/Ajuda:* </span>Condição atual da
Solicitação (aberta, fechada, investigando, ... )

<span class="emphasis"> *Criado em:* </span>2005-04-26 20:49:56.0

<span class="emphasis">*Atualizado em:* </span>2005-04-26 21:04:16.0

<div id="d87736e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Status Category - R\_StatusCategory

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_StatusCategory_data)

<span class="emphasis">*Descrição:*</span> Request Status Category

<span class="emphasis">*Comentário/Ajuda:* </span> Category of Request
Status enables to maintain different set of Status for different Request
Categories

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d87736e39" class="table">

<div class="table-title">

Table 1.1. Status Category
Fields

</div>

<div class="table-contents">

|     Nome do campo     |            Referência             | Valores (Padrão) | Chave restritiva |        Regra de validação         |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :-------------------------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Status Category    |                ID                 |                  |                  |                                   |         Request Status Category          |                   Category of Request Status enables to maintain different set of Status for different Request Categories                    |
|        Empresa        |           Tabela Direta           |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização      |           Tabela Direta           |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome          |       Texto Curto (String)        |                  |                  |                                   |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       |       Texto Curto (String)        |                  |                  |                                   | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda    | Texto Médio (até 2000 caracteres) |                  |                  |                                   |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|         Ativo         |              Sim-Não              |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Padrão         |              Sim-Não              |                  |                  |                                   |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| R\_StatusCategory\_UU |       Texto Curto (String)        |                  |                  |                                   |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d87736e193" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Estado da Solicitação - R\_Status

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_Status_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Estado das
Solicitações

<span class="emphasis">*Comentário/Ajuda:* </span> Condição atual da
Solicitação (aberta, fechada, investigando, ... )

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87736e210" class="table">

<div class="table-title">

Table 1.2. Request Status
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   |     Chave restritiva     |                Regra de validação                |                       Descrição                       |                                                                     Comentário/Ajuda                                                                     |
| :------------------: | :-------------------------------: | :------------------: | :----------------------: | :----------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Estado        |                ID                 |                      |                          |                                                  |                    Request Status                     |                                                 Status if the request (open, closed, investigating, ..)                                                  |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|     Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|   Status Category    |           Tabela Direta           |                      | rstatuscategory\_rstatus |                                                  |                Request Status Category                |                         Category of Request Status enables to maintain different set of Status for different Request Categories                          |
|      Seqüência       |              Inteiro              |                      |                          |                                                  | Method of ordering records; lowest number comes first |                                                       The Sequence indicates the order of records                                                        |
|    Chave de Busca    |       Texto Curto (String)        |                      |                          |                                                  |          (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|         Nome         |       Texto Curto (String)        |                      |                          |                                                  |         Alphanumeric identifier of the entity         |       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.       |
|      Descrição       |       Texto Curto (String)        |                      |                          |                                                  |       Optional short description of the record        |                                                       A description is limited to 255 characters.                                                        |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                      |                          |                                                  |                    Comment or Hint                    |                                       The Help field contains a hint, comment or help about the use of this item.                                        |
|        Ativo         |              Sim-Não              |         (Y)          |                          |                                                  |          (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|        Padrão        |              Sim-Não              |                      |                          |                                                  |                     Default value                     |                                      The Default Checkbox indicates if this record will be used as a default value.                                      |
|  Web Pode Atualizar  |              Sim-Não              |                      |                          |                                                  |           Entry can be updated from the Web           |                                                                                                                                                          |
|   Atualizar Estado   |              Tabela               |      R\_Status       |  updatestatus\_rstatus   |  R\_StatusCategory\_ID=@R\_StatusCategory\_ID@   | Automatically change the status after entry from web  |                                         Change the status automatically after the entry was changed via the Web                                          |
| Tempo Limite em Dias |              Inteiro              |         (0)          |                          |                                                  |    Timeout in Days to change Status automatically     | After the number of days of inactivity, the status is changed automatically to the Next Status. If no Next Status is defined, the status is not changed. |
|    Próximo Estado    |              Tabela               |      R\_Status       |   nextstatus\_rstatus    |  R\_StatusCategory\_ID=@R\_StatusCategory\_ID@   |    Move to next status automatically after timeout    |                                                    After the timeout, change the status automatically                                                    |
|  Estado de Abertura  |              Sim-Não              |                      |                          |                                                  |                 The status is closed                  |                                    This allows to have the three generat situations of "not open" - "open" - "closed"                                    |
| Estado de Fechamento |              Sim-Não              |         (N)          |                          |                                                  |                 The status is closed                  |                                                        This allows to have multiple closed status                                                        |
|   Fechamento Final   |              Sim-Não              |         (N)          |                          |                                                  |     Entries with Final Close cannot be re-opened      |                                                                                                                                                          |
|    R\_Status\_UU     |       Texto Curto (String)        |                      |                          |                                                  |                                                       |                                                                                                                                                          |

</div>

</div>

  

</div>
