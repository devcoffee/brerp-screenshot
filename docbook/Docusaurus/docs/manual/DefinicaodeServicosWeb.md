---
title: "Definição de Serviços Web"
id: DefinicaodeServicosWeb
---
<div id="d42073e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Definição de Serviços Web

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Serviço Web -
    WS\_WebService](#d42073e22)</span>
  - <span class="section">[2. Tabela: Método de Serviço Web -
    WS\_WebServiceMethod](#d42073e188)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2009-01-30 17:51:52.0

<span class="emphasis">*Atualizado em:* </span>2009-01-30 17:51:52.0

<div id="d42073e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Serviço Web - WS\_WebService

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebService_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d42073e31" class="table">

<div class="table-title">

Table 1.1. Web Service
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Serviço Web     |                ID                 |                      |                  |                                                  |                                          |                                                                                                                                              |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Chave de Busca   |       Texto Curto (String)        |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Nome        |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição      |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo        |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| WS\_WebService\_UU |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d42073e188" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Método de Serviço Web - WS\_WebServiceMethod

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebServiceMethod_data)

<span class="emphasis">*Coluna linkada:* </span> Web Service

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d42073e201" class="table">

<div class="table-title">

Table 1.2. Web Service Method
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :-------------------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Método de Serviço Web   |                ID                 |                      |                                 |                                                  |                                          |                                                                                                                                              |
|         Empresa          |           Tabela Direta           | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização        |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Serviço Web        |           Tabela Direta           |                      | wswebservice\_wswebservicemetho |                                                  |                                          |                                                                                                                                              |
|      Chave de Busca      |       Texto Curto (String)        |                      |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Nome           |       Texto Curto (String)        |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         |       Texto Curto (String)        |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                      |                                 |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|          Ativo           |              Sim-Não              |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| WS\_WebServiceMethod\_UU |       Texto Curto (String)        |                      |                                 |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
