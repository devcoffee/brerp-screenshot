---
title: "Grupo de Campo"
id: GrupodeCampo
---
<div id="d111062e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Campo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Campo -
    AD\_FieldGroup](#d111062e22)</span>
  - <span class="section">[2. Tabela: Tradução -
    AD\_FieldGroup\_Trl](#d111062e198)</span>
  - <span class="section">[3. Tabela: Usado em Campo -
    AD\_Field](#d111062e355)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir Grupo de Campo

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Grupo de
Campo" permite a você definir subseções em uma Aba. Somente para uso do
Administrador do Sistema.

<span class="emphasis"> *Criado em:* </span>2001-01-11 17:28:09.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d111062e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Campo - AD\_FieldGroup

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_FieldGroup_data)

<span class="emphasis">*Descrição:*</span> Somente para uso do
Administrador do Sistema. Grupos de Campo permitem o agrupamento de
campos em uma janela

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d111062e35" class="table">

<div class="table-title">

Table 1.1. Field group
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |                                   Valores (Padrão)                                   |   Chave restritiva    |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :------------------: | :------------------: | :----------------------------------------------------------------------------------: | :-------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Grupo de Campo    |          ID          |                                                                                      |                       |                                                                |                    Logical grouping of fields                    |                                                The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)                                                |
|       Empresa        |    Tabela Direta     |                                 (@\#AD\_Client\_ID@)                                 |                       |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|     Organização      |    Tabela Direta     |                                  (@\#AD\_Org\_ID@)                                   |                       |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|         Nome         | Texto Curto (String) |                                                                                      |                       |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|        Ativo         |       Sim-Não        |                                         (Y)                                          |                       |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Tipo de Entidade   |        Tabela        | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adfieldgroup | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|   Field Group Type   |        Lista         |                                  Collapse Label Tab                                  |                       |                                                                |                                                                  |                                                                                                                                                                                                     |
| Recolhida por Padrão |       Sim-Não        |                                         (N)                                          |                       |                                                                |    Flag to set the initial state of collapsible field group.     |                                                                                                                                                                                                     |
|  AD\_FieldGroup\_UU  | Texto Curto (String) |                                                                                      |                       |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d111062e198" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução - AD\_FieldGroup\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_FieldGroup_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d111062e211" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Grupo de Campo      |    Tabela Direta     |                    |      adfieldgroup\_trl      |                                                  |      Logical grouping of fields       |                    The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)                     |
|         Idioma          |        Tabela        |    AD\_Language    | adlanguage\_adfieldgrouptrl |                                                  |       Language for this entity        |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo          |       Sim-Não        |        (Y)         |                             |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|        Traduzida        |       Sim-Não        |                    |                             |                                                  |       This column is translated       |                                       The Translated checkbox indicates if this column is translated.                                        |
|          Nome           | Texto Curto (String) |                    |                             |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| AD\_FieldGroup\_Trl\_UU | Texto Curto (String) |                    |                             |                                                  |                                       |                                                                                                                                              |

</div>

</div>

  

<div id="d111062e355" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Usado em Campo - AD\_Field

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Field_data)

<span class="emphasis">*Coluna linkada:* </span> Field Group

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d111062e368" class="table">

<div class="table-title">

Table 1.3. Used in Field
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      | Valores (Padrão) | Chave restritiva | Regra de validação |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------: | :------------------: | :--------------: | :--------------: | :----------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Aba      |    Tabela Direta     |                  |  ad\_tab\_field  |                    |          Tab within a Window          |                                            The Tab indicates a tab that displays within a window.                                            |
|     Campo     |          ID          |                  |                  |                    |       Field on a database table       |                                              The Field identifies a field on a database table.                                               |
|     Nome      | Texto Curto (String) |                  |                  |                    | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| AD\_Field\_UU | Texto Curto (String) |                  |                  |                    |                                       |                                                                                                                                              |

</div>

</div>

  

</div>
