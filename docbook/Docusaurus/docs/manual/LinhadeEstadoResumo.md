---
title: "Linha de Estado / Resumo"
id: LinhadeEstadoResumo
---
<div id="d136530e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Linha de Estado / Resumo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Status Line -
    AD\_StatusLine](#d136530e22)</span>
  - <span class="section">[2. Tabela: Used In -
    AD\_StatusLineUsedIn](#d136530e181)</span>

</div>

<span class="emphasis">*Descrição:* </span> Cria uma linha com
informações resumidas do documento.

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2014-01-12 15:22:52.0

<span class="emphasis">*Atualizado em:* </span>2014-01-12 15:22:52.0

<div id="d136530e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Status Line - AD\_StatusLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_StatusLine_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d136530e31" class="table">

<div class="table-title">

Table 1.1. Status Line
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |                                   Valores (Padrão)                                   |     Chave restritiva     |                                  Regra de validação                                   |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :--------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :----------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Linha de Estado  |                ID                 |                                                                                      |                          |                                                                                       |                                                                  |                                                                                                                                                                                                     |
|     Empresa      |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                 |  ADClient\_ADStatusLine  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Organização    |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                   |   ADOrg\_ADStatusLine    |                   (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                    |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Nome       |       Texto Curto (String)        |                                                                                      |                          |                                                                                       |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|     Mensagem     |           Tabela Direta           |                                                                                      | ADMessage\_ADStatusLine  |                                                                                       |                          System Message                          |                                                                                   Information and Error messages                                                                                    |
|   SQLStatement   | Texto Médio (até 2000 caracteres) |                                                                                      |                          |                                                                                       |                                                                  |                                                                                                                                                                                                     |
| Tipo de Entidade |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | EntityType\_ADStatusLine |            <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D             | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|      Ativo       |              Sim-Não              |                                         (Y)                                          |                          |                                                                                       |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |

</div>

</div>

  

<div id="d136530e181" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Used In - AD\_StatusLineUsedIn

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_StatusLineUsedIn_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d136530e190" class="table">

<div class="table-title">

Table 1.2. Used In
Fields

</div>

<div class="table-contents">

|    Nome do campo     |  Referência   |                                   Valores (Padrão)                                   |        Chave restritiva         |                                  Regra de validação                                   |                             Descrição                              |                                                                                          Comentário/Ajuda                                                                                           |
| :------------------: | :-----------: | :----------------------------------------------------------------------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------: | :----------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| AD\_StatusLineUsedIn |      ID       |                                                                                      |                                 |                                                                                       |                                                                    |                                                                                                                                                                                                     |
|       Empresa        | Tabela Direta |                                 (@\#AD\_Client\_ID@)                                 |  ADClient\_ADStatusLineUsedIn   | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |                 (semelhante ao primeiro relatório)                 |                                                                                         (ver o mesmo acima)                                                                                         |
|     Organização      | Tabela Direta |                                  (@\#AD\_Org\_ID@)                                   |    ADOrg\_ADStatusLineUsedIn    |                   (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                    |                 (semelhante ao primeiro relatório)                 |                                                                                         (ver o mesmo acima)                                                                                         |
|   Linha de Estado    |   Procurar    |                                                                                      | ADStatusLine\_ADStatusLineUsedI |                                                                                       |                                                                    |                                                                                                                                                                                                     |
|        Tabela        | Tabela Direta |                                                                                      |   ADTable\_ADStatusLineUsedIn   |                                                                                       |                     Database Table information                     |                                                                 The Database Table provides the information of the table definition                                                                 |
|   Tipo de Entidade   |    Tabela     | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | EntityType\_ADStatusLineUsedIn  |            <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D             |  Dictionary Entity Type; Determines ownership and synchronization  | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|        Janela        | Tabela Direta |                                                                                      |  ADWindow\_ADStatusLineUsedIn   |                                                                                       |                    Data entry or display window                    |                                                                     The Window field identifies a unique Window in the system.                                                                      |
|         Aba          | Tabela Direta |                                                                                      |    ADTab\_ADStatusLineUsedIn    |                        AD\_Tab.AD\_Window\_ID=@AD\_Window\_ID@                        |                        Tab within a Window                         |                                                                       The Tab indicates a tab that displays within a window.                                                                        |
|   Linha de Estado    |    Sim-Não    |                                         (Y)                                          |                                 |                                                                                       | Defines if this record refers to a status line or to a help widget |                                               If checked the definition corresponds to a status line, when unchecked it corresponds to a help widget                                                |
|      Seqüência       |    Inteiro    |                                                                                      |                                 |                                                                                       |       Method of ordering records; lowest number comes first        |                                                                             The Sequence indicates the order of records                                                                             |
|        Ativo         |    Sim-Não    |                                         (Y)                                          |                                 |                                                                                       |                 (semelhante ao primeiro relatório)                 |                                                                                         (ver o mesmo acima)                                                                                         |

</div>

</div>

  

</div>
