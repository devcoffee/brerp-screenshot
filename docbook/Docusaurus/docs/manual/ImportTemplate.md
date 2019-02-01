---
title: "Import Template"
id: ImportTemplate
---
<div id="d113467e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Import Template

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Import Template -
    AD\_ImportTemplate](#d113467e22)</span>
  - <span class="section">[2. Tabela: Import Template Access -
    AD\_ImportTemplateAccess](#d113467e214)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2014-10-29 19:34:06.0

<span class="emphasis">*Atualizado em:* </span>2014-10-29 19:34:06.0

<div id="d113467e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Import Template - AD\_ImportTemplate

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d113467e29" class="table">

<div class="table-title">

Table 1.1. Import Template
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------------: | :------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Import Template     |          ID          |                      |                            |                                                  |                                          |                                                                                                                                              |
|        Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) | ADClient\_ADImportTemplate |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  ADOrg\_ADImportTemplate   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Nome          | Texto Curto (String) |                      |                            |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição        | Texto Curto (String) |                      |                            |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Janela         |    Tabela Direta     |                      | ADWindow\_ADImportTemplate |                                                  |       Data entry or display window       |                                          The Window field identifies a unique Window in the system.                                          |
|          Aba           |    Tabela Direta     |                      |  ADTab\_ADImportTemplate   |     AD\_Tab.AD\_Window\_ID=@AD\_Window\_ID@      |           Tab within a Window            |                                            The Tab indicates a tab that displays within a window.                                            |
| Conjunto de Caracteres | Texto Curto (String) |                      |                            |                                                  |                                          |                                                                                                                                              |
|       CSV Header       | Texto Curto (String) |                      |                            |                                                  |                                          |                                                                                                                                              |
|    CSV Alias Header    | Texto Curto (String) |                      |                            |                                                  |                                          |                                                                                                                                              |
|         Ativo          |       Sim-Não        |         (Y)          |                            |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d113467e214" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Import Template Access - AD\_ImportTemplateAccess

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Import Template

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d113467e225" class="table">

<div class="table-title">

Table 1.2. Import Template Access
Fields

</div>

<div class="table-contents">

|     Nome do campo      |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :--------------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
| Import Template Access |      ID       |                      |                                 |                                                  |                                    |                                                                                           |
|        Empresa         | Tabela Direta | (@\#AD\_Client\_ID@) | ADClient\_ADImportTemplateAcces |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|      Organização       | Tabela Direta |  (@\#AD\_Org\_ID@)   |  ADOrg\_ADImportTemplateAccess  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Import Template     | Tabela Direta |                      | ADImportTemplate\_ADImportTempl |                                                  |                                    |                                                                                           |
|         Perfil         | Tabela Direta |                      | ADRole\_ADImportTemplateAccess  |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|   Permitir Inserção    |    Sim-Não    |         (Y)          |                                 |                                                  |                                    |                                                                                           |
|    Permitir Mesclar    |    Sim-Não    |         (Y)          |                                 |                                                  |                                    |                                                                                           |
|   Permitir Atualizar   |    Sim-Não    |         (Y)          |                                 |                                                  |                                    |                                                                                           |
|         Ativo          |    Sim-Não    |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |

</div>

</div>

  

</div>
