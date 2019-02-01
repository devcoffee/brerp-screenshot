---
title: "Grupo de Solicitação"
id: GrupodeSolicitacao
---
<div id="d112584e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Solicitação -
    R\_Group](#d112584e22)</span>
  - <span class="section">[2. Tabela: Atualizações de Solicitações -
    R\_GroupUpdates](#d112584e210)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Grupo de
Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span>Grupo de solicitações
(por ex. números de versões, responsabilidade, ...)

<span class="emphasis"> *Criado em:* </span>2005-04-26 20:46:32.0

<span class="emphasis">*Atualizado em:* </span>2005-04-26 21:21:32.0

<div id="d112584e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Solicitação - R\_Group

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_Group_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Grupos de
Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span> Grupo de solicitações
(por ex. números de versões, responsabilidade, ... ). Uma Solicitação de
Alteração de LDM será criada automaticamente se uma LDM for referenciada
e habilitada no Tipo de Solicitação.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112584e39" class="table">

<div class="table-title">

Table 1.1. Request Group
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   |   Chave restritiva    |                Regra de validação                |                        Descrição                        |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :------------------: | :-------------------: | :----------------------------------------------: | :-----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Grupo        |                ID                 |                      |                       |                                                  |                      Request Group                      |                                        Group of requests (e.g. version numbers, responsibility, ...)                                         |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
|        Nome        |       Texto Curto (String)        |                      |                       |                                                  |          Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição      |       Texto Curto (String)        |                      |                       |                                                  |        Optional short description of the record         |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                      |                       |                                                  |                     Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo        |              Sim-Não              |         (Y)          |                       |                                                  |           (semelhante ao primeiro relatório)            |                                                             (ver o mesmo acima)                                                              |
| Aviso de Alteração |           Tabela Direta           |                      | mchangenotice\_rgroup |                                                  | Bill of Materials (Engineering) Change Notice (Version) |                                                                                                                                              |
|   LM %26 Fórmula   |             Procurar              |                      | ppproductbom\_rgroup  |                                                  |                     BOM %26 Formula                     |                                                                                                                                              |
|    R\_Group\_UU    |       Texto Curto (String)        |                      |                       |                                                  |                                                         |                                                                                                                                              |

</div>

</div>

  

<div id="d112584e210" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Atualizações de Solicitações - R\_GroupUpdates

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_GroupUpdates_data)

<span class="emphasis">*Descrição:*</span> Lista os Recipientes que
devem receber Atualizações de Solicitações

<span class="emphasis">*Coluna linkada:* </span> Group

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d112584e227" class="table">

<div class="table-title">

Table 1.2. Request Updates
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :-------------: | :-----------: | :----------------: | :-------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|   Organização   | Tabela Direta |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|      Grupo      | Tabela Direta |                    | rgroup\_rgroupupdates |                                                  |                               Request Group                                |                                                                         Group of requests (e.g. version numbers, responsibility, ...)                                                                         |
| Usuário/Contato |   Procurar    |                    | aduser\_ruserupdates  |                                                  |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|      Ativo      |    Sim-Não    |        (Y)         |                       |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|  Auto-Serviço   |    Sim-Não    |                    |                       |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |

</div>

</div>

  

</div>
