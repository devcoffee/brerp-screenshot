---
title: "Sugestão de Campo"
id: SugestaodeCampo
---
<div id="d237589e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Sugestão de Campo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Sugestões -
    AD\_FieldSuggestion](#d237589e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Sugestões para o nome,
descrição e ajuda do campo.

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-06-29 20:42:38.0

<span class="emphasis">*Atualizado em:* </span>2016-06-29 20:42:38.0

<div id="d237589e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Sugestões - AD\_FieldSuggestion

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_FieldSuggestion_data)

<span class="emphasis">*Claúsula Where:*</span>
AD\_FieldSuggestion.Processed='N'

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d237589e35" class="table">

<div class="table-title">

Table 1.1. Suggestions
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |        Valores (Padrão)         |       Chave restritiva        |                Regra de validação                |                           Descrição                           |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :-------------------------------: | :-----------------------------: | :---------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Aplicar Sugestão     |               Lista               |        Element Field (E)        |                               |                                                  |                                                               |                                                                                                                                              |
|    Sugestão de Campo     |                ID                 |                                 |                               |                                                  |                                                               |                                                                                                                                              |
|  Field Suggestions UUID  |       Texto Curto (String)        |                                 |                               |                                                  |                                                               |                                                                                                                                              |
|   Update Base Language   |              Sim-Não              |               (Y)               |                               |                                                  |                                                               |                                                                                                                                              |
|         Empresa          |           Tabela Direta           |      (@\#AD\_Client\_ID@)       |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|       Organização        |           Tabela Direta           |        (@\#AD\_Org\_ID@)        |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|      Tenant of User      |              Tabela               |     AD\_Client All Clients      |                               |                                                  |                                                               |                                                                                                                                              |
|     Usuário/Contato      |              Tabela               | AD\_User Users from all Clients |                               |                                                  | User within the system - Internal or Business Partner Contact |                The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|          Janela          |           Tabela Direta           |                                 |                               |                                                  |                 Data entry or display window                  |                                          The Window field identifies a unique Window in the system.                                          |
|           Aba            |           Tabela Direta           |                                 |                               |     AD\_Tab.AD\_Window\_ID=@AD\_Window\_ID@      |                      Tab within a Window                      |                                            The Tab indicates a tab that displays within a window.                                            |
|          Campo           |           Tabela Direta           |                                 |  ADField\_ADFieldSuggestion   |       AD\_Field.AD\_Tab\_ID=@AD\_Tab\_ID@        |                   Field on a database table                   |                                              The Field identifies a field on a database table.                                               |
|          Idioma          |              Tabela               |          AD\_Language           | ADLanguage\_ADFieldSuggestion |                                                  |                   Language for this entity                    |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo           |              Sim-Não              |               (Y)               |                               |                                                  |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|           Nome           |       Texto Curto (String)        |                                 |                               |                                                  |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         |       Texto Curto (String)        |                                 |                               |                                                  |           Optional short description of the record            |                                                 A description is limited to 255 characters.                                                  |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                 |                               |                                                  |                        Comment or Hint                        |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|         Aprovado         |              Sim-Não              |               (N)               |                               |                                                  |         Indicates if this document requires approval          |                        The Approved checkbox indicates if this document requires approval before it can be processed.                        |
|        Processado        |              Sim-Não              |               (N)               |                               |                                                  |                The document has been processed                |                                     The Processed checkbox indicates that a document has been processed.                                     |
| Compare Field Suggestion |               Botão               |                                 |                               |                                                  |           Compare suggested text with original text           |                                                                                                                                              |
| Reject Field Suggestion  |               Botão               |                                 |                               |                                                  |                   Reject suggested changes                    |                                                                                                                                              |
| Accept Field Suggestion  |               Botão               |                                 |                               |                                                  |                   Accept suggested changes                    |                                                                                                                                              |

</div>

</div>

  

</div>
