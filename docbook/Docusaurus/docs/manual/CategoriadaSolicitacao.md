---
title: "Categoria da Solicitação"
id: CategoriadaSolicitacao
---
<div id="d19173e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Categoria da Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Categoria da Solicitação -
    R\_Category](#d19173e22)</span>
  - <span class="section">[2. Tabela: Notificação de Atualização -
    R\_CategoryUpdates](#d19173e196)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento da Categoria
da Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span>Categoria ou Tópico da
Solicitação

<span class="emphasis"> *Criado em:* </span>2005-04-26 20:29:25.0

<span class="emphasis">*Atualizado em:* </span>2005-04-26 21:30:22.0

<div id="d19173e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Categoria da Solicitação - R\_Category

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_Category_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento da Categoria da
Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span> Categoria ou Tópico
da Solicitação

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d19173e39" class="table">

<div class="table-title">

Table 1.1. Request Category
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   |  Chave restritiva   |                                                                          Regra de validação                                                                          |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :-----------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Categoria     |                ID                 |                      |                     |                                                                                                                                                                      |             Request Category             |                                                       Category or Topic of the Request                                                       |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                     |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                     |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                     |                                                                                                                                                                      |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                     |                                                                                                                                                                      | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                     |                                                                                                                                                                      |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                     |                                                                                                                                                                      |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Produto      |             Procurar              |                      | mproduct\_rcategory | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |          Product, Service, Item          |                                  Identifies an item which is either purchased or sold in this organization.                                  |
| R\_Category\_UU  |       Texto Curto (String)        |                      |                     |                                                                                                                                                                      |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d19173e196" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Notificação de Atualização - R\_CategoryUpdates

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_CategoryUpdates_data)

<span class="emphasis">*Descrição:*</span> Lista os Recipientes que
devem receber Atualizações de Solicitações

<span class="emphasis">*Coluna linkada:* </span> Category

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d19173e213" class="table">

<div class="table-title">

Table 1.2. Update Notification
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :-------------: | :-----------: | :----------------: | :-------------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|   Organização   | Tabela Direta |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|    Categoria    | Tabela Direta |                    | rcategory\_rcategoryupdates |                                                  |                              Request Category                              |                                                                                       Category or Topic of the Request                                                                                        |
| Usuário/Contato |   Procurar    |                    |  aduser\_rcategoryupdates   |                                                  |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|      Ativo      |    Sim-Não    |        (Y)         |                             |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|  Auto-Serviço   |    Sim-Não    |                    |                             |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |

</div>

</div>

  

</div>
