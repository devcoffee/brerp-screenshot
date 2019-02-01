---
title: "Sugestão de Ajuda de Contexto"
id: SugestaodeAjudadeContexto
---
<div id="d237451e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Sugestão de Ajuda de Contexto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Sugestões -
    AD\_CtxHelpSuggestion](#d237451e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Revisar sugestões de ajuda
de contexto da empresa.

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-07-05 20:48:55.0

<span class="emphasis">*Atualizado em:* </span>2016-07-05 20:48:55.0

<div id="d237451e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Sugestões - AD\_CtxHelpSuggestion

</div>

</div>

</div>

<span class="emphasis">*Claúsula Where:*</span> Processed='N'

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d237451e33" class="table">

<div class="table-title">

Table 1.1. Suggestion
Fields

</div>

<div class="table-contents">

|          Nome do campo          |            Referência             |        Valores (Padrão)         |        Chave restritiva         |                                             Regra de validação                                              |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :-----------------------------: | :-------------------------------: | :-----------------------------: | :-----------------------------: | :---------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|  Sugestão da Ajuda de Contexto  |                ID                 |                                 |                                 |                                                                                                             |                                                               |                                                                                                               |
| Menssagem de ajuda de contexto  |           Tabela Direta           |                                 | ADCtxHelpMsg\_ADCtxHelpSuggesti |                                                                                                             |                                                               |                                                                                                               |
|  Context Help Suggestion UUID   |       Texto Curto (String)        |                                 |                                 |                                                                                                             |                                                               |                                                                                                               |
|             Empresa             |           Tabela Direta           |      (@\#AD\_Client\_ID@)       |                                 |                                      AD\_Client.AD\_Client\_ID \< \> 0                                      |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|           Organização           |           Tabela Direta           |        (@\#AD\_Org\_ID@)        |                                 |                              (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                               |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Ajuda de Contexto        |           Tabela Direta           |                                 | ADCtxHelp\_ADCtxHelpSuggestion  | AD\_CtxHelp\_ID IN (SELECT AD\_CtxHelp\_ID FROM AD\_CtxHelp WHERE CtxType IS NULL OR CtxType IN ('A', 'T')) |                                                               |                                                                                                               |
|             Idioma              |              Tabela               |          AD\_Language           | ADLanguage\_ADCtxHelpSuggestion |                                                                                                             |                   Language for this entity                    |                    The Language identifies the language to use for display and formatting                     |
|         Usuário/Contato         |              Tabela               | AD\_User Users from all Clients |                                 |                                                                                                             | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|         Tenant of User          |              Tabela               |     AD\_Client All Clients      |                                 |                                                                                                             |                                                               |                                                                                                               |
|              Ativo              |              Sim-Não              |               (Y)               |                                 |                                                                                                             |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                                 |                                 |                                                                                                             |         Textual Informational, Menu or Error Message          |                           The Message Text indicates the message that will display                            |
|            Aprovado             |              Sim-Não              |               (N)               |                                 |                                                                                                             |         Indicates if this document requires approval          |        The Approved checkbox indicates if this document requires approval before it can be processed.         |
|           Processado            |              Sim-Não              |               (N)               |                                 |                                                                                                             |                The document has been processed                |                     The Processed checkbox indicates that a document has been processed.                      |
|  Save As Tenant Customization   |              Sim-Não              |               (N)               |                                 |                                                                                                             |             Apply changes as tenant customization             |       Changes is keep as tenant specific customization and wouldn't effect other tenants in the system        |
| Compare Context Help Suggestion |               Botão               |                                 |                                 |                                                                                                             |           Compare suggested text with original text           |                                                                                                               |
| Reject Context Help Suggestion  |               Botão               |                                 |                                 |                                                                                                             |                   Reject suggested changes                    |                                                                                                               |
| Accept Context Help Suggestion  |               Botão               |                                 |                                 |                                                                                                             |                   Accept suggested changes                    |                                                                                                               |

</div>

</div>

  

</div>
