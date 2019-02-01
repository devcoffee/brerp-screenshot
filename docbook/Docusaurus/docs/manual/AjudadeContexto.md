---
title: "Ajuda de Contexto"
id: AjudadeContexto
---
<div id="d2809e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ajuda de Contexto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ajuda de Contexto -
    AD\_CtxHelp](#d2809e23)</span>
  - <span class="section">[2. Tabela: Mensagem -
    AD\_CtxHelpMsg](#d2809e170)</span>
  - <span class="section">[3. Tabela: Tradução -
    AD\_CtxHelpMsg\_Trl](#d2809e310)</span>

</div>

<span class="emphasis">*Descrição:* </span> Manter Ajudas de Contexto

<span class="emphasis">*Comentário/Ajuda:* </span>A janela de Ajuda de
Contexto define mensagens de ajuda de contexto que são exibidas no
painel de ajuda. Funciona somente na interface WEB.

<span class="emphasis"> *Criado em:* </span>2013-02-05 14:52:07.0

<span class="emphasis">*Atualizado em:* </span>2013-02-08 14:20:41.0

![](/img/manual/AjudadeContexto.png)

<div id="d2809e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ajuda de Contexto - AD\_CtxHelp

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_CtxHelp_data)

<span class="emphasis">*Descrição:*</span> Ajudas de Contexto

<span class="emphasis">*Comentário/Ajuda:* </span> A aba de Ajuda de
Contexto define o tipo de ajuda de contexto

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d2809e40" class="table">

<div class="table-title">

Table 1.1. Context Help
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |                 Valores (Padrão)                  | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :-----------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Ajuda de Contexto |                ID                 |                                                   |                  |                                                  |                                          |                                                                                                                                              |
|      Empresa      |           Tabela Direta           |               (@\#AD\_Client\_ID@)                |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |                 (@\#AD\_Org\_ID@)                 |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome        |       Texto Curto (String)        |                                                   |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Médio (até 2000 caracteres) |                                                   |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|       Ativo       |              Sim-Não              |                        (Y)                        |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Tipo de Contexto  |               Lista               | All Form Home Info Task Node Process Tab Workflow |                  |                                                  |           Type of Context Help           |              The Context Type field indicates the type of context help (tab, process, form etc) this context help is defined as              |

</div>

</div>

  

<div id="d2809e170" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Mensagem - AD\_CtxHelpMsg

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_CtxHelpMsg_data)

<span class="emphasis">*Descrição:*</span> Mensagens de Ajuda de
Contexto

<span class="emphasis">*Comentário/Ajuda:* </span> A aba de Mensagem
exibe o texto da mensagem

<span class="emphasis">*Coluna linkada:* </span> Context Help

<span class="emphasis">*Coluna mãe:* </span> Context Help

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d2809e195" class="table">

<div class="table-title">

Table 1.2. Message
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                  Descrição                   |                     Comentário/Ajuda                     |
| :----------------------------: | :-------------------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :------------------------------------------: | :------------------------------------------------------: |
| Menssagem de ajuda de contexto |                ID                 |                      |                         |                                                  |                                              |                                                          |
|            Empresa             |           Tabela Direta           | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                   (ver o mesmo acima)                    |
|          Organização           |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                   (ver o mesmo acima)                    |
|       Ajuda de Contexto        |           Tabela Direta           |                      | adctxhelp\_adctxhelpmsg |                                                  |                                              |                                                          |
|             Ativo              |              Sim-Não              |         (Y)          |                         |                                                  |      (semelhante ao primeiro relatório)      |                   (ver o mesmo acima)                    |
|       Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                      |                         |                                                  | Textual Informational, Menu or Error Message | The Message Text indicates the message that will display |

</div>

</div>

  

<div id="d2809e310" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - AD\_CtxHelpMsg\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_CtxHelpMsg_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Context Help Message

<span class="emphasis">*Coluna mãe:* </span> Context Help Message

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d2809e331" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |  Valores (Padrão)  |       Chave restritiva        |                Regra de validação                |                  Descrição                   |                            Comentário/Ajuda                            |
| :----------------------------: | :-------------------------------: | :----------------: | :---------------------------: | :----------------------------------------------: | :------------------------------------------: | :--------------------------------------------------------------------: |
|            Empresa             |           Tabela Direta           | (@AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                          (ver o mesmo acima)                           |
|          Organização           |           Tabela Direta           |  (@AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                          (ver o mesmo acima)                           |
| Menssagem de ajuda de contexto |           Tabela Direta           |                    | adctxhelpmsg\_adctxhelpmsgtrl |                                                  |                                              |                                                                        |
|             Idioma             |              Tabela               |    AD\_Language    |   adlangu\_adctxhelpmsgtrl    |                                                  |           Language for this entity           | The Language identifies the language to use for display and formatting |
|             Ativo              |              Sim-Não              |        (Y)         |                               |                                                  |      (semelhante ao primeiro relatório)      |                          (ver o mesmo acima)                           |
|           Traduzida            |              Sim-Não              |                    |                               |                                                  |          This column is translated           |    The Translated checkbox indicates if this column is translated.     |
|       Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                    |                               |                                                  | Textual Informational, Menu or Error Message |        The Message Text indicates the message that will display        |

</div>

</div>

  

</div>
