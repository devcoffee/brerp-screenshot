---
title: "Menu"
id: Menu
---
<div id="d145293e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Menu

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Menu -
    AD\_Menu](#d145293e22)</span>
  - <span class="section">[2. Tabela: Tradução -
    AD\_Menu\_Trl](#d145293e358)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Menus

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela
"Gerenciamento de Menus" define o Menu que será mostrado. Ela é somente
para uso do Administrador do Sistema. Os itens de menu que cada usuário
irá ver depende da segurança definida.

<span class="emphasis"> *Criado em:* </span>1999-05-21 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d145293e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Menu - AD\_Menu

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Menu_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Menus

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Menu" define a
árvore de menu estruturado a qual será usada para a Organização
selecionada. Note que o nome e descrição serão automaticamente
sincronizados (sobrescritos), se não for um modo de resumo.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145293e39" class="table">

<div class="table-title">

Table 1.1. Menu
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |                                       Valores (Padrão)                                        |   Chave restritiva   |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :-----------------------: | :------------------: | :-------------------------------------------------------------------------------------------: | :------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Menu            |          ID          |                                                                                               |                      |                                                                |                        Identifies a Menu                         |                                           The Menu identifies a unique Menu. Menus are used to control the display of those screens a user has access to.                                           |
|          Empresa          |    Tabela Direta     |                                     (@\#AD\_Client\_ID@)                                      |   adclient\_admenu   |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|        Organização        |    Tabela Direta     |                                       (@\#AD\_Org\_ID@)                                       |    ad\_menu\_org     |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|           Nome            | Texto Curto (String) |                                                                                               |                      |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|         Descrição         | Texto Curto (String) |                                                                                               |                      |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|           Ativo           |       Sim-Não        |                                              (Y)                                              |                      |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|     Tipo de Entidade      |        Tabela        |     \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)      |   entityt\_admenu    | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
| Mantido Centralizadamente |       Sim-Não        |                                              (Y)                                              |                      |                                                                |          Information maintained in System Element table          |                                The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table or 'Window' table.                                |
|      Somente Leitura      |       Sim-Não        |                                              (N)                                              |                      |                                                                |                        Field is read only                        |                                                          The Read Only indicates that this field may only be Read. It may not be updated.                                                           |
|      Nível de Resumo      |       Sim-Não        |                                                                                               |                      |                                                                |                     This is a summary entity                     |                             A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                             |
|           Ação            |        Lista         | Bancada de Trabalho Detail Fluxo de Trabalho Info Processo Relatório Tarefa Janela Formulário |                      |                                                                |               Indicates the Action to be performed               |                                                 The Action field is a drop down list box which indicates the Action to be performed for this Item.                                                  |
|    Transação de Vendas    |       Sim-Não        |                                              (Y)                                              |                      |                                                                |                   This is a Sales Transaction                    |                                                            The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                            |
|          Janela           |    Tabela Direta     |                                                                                               |   adwindow\_admenu   |                                                                |                   Data entry or display window                   |                                                                     The Window field identifies a unique Window in the system.                                                                      |
|     Fluxo de Trabalho     |    Tabela Direta     |                                                                                               |  adworkflow\_admenu  |                                                                |                 Workflow or combination of tasks                 |                                                                   The Workflow field identifies a unique Workflow in the system.                                                                    |
|         Tarefa SO         |    Tabela Direta     |                                                                                               |    adtask\_admenu    |                                                                |                      Operation System Task                       |                                                                  The Task field identifies a Operation System Task in the system.                                                                   |
|         Processo          |    Tabela Direta     |                                                                                               |  adprocess\_admenu   |                                                                |                        Process or Report                         |                                                               The Process field identifies a unique Process or Report in the system.                                                                |
|    Formulário Especial    |    Tabela Direta     |                                                                                               |    adform\_admenu    |                                                                |                           Special Form                           |                                                               The Special Form field identifies a unique Special Form in the system.                                                                |
|         Workbench         |    Tabela Direta     |                                                                                               | admenu\_adworkbench  |                                                                |                  Collection of windows, reports                  |                                                                                                                                                                                                     |
|        Info Window        |    Tabela Direta     |                                                                                               | adinfowindow\_admenu |                                                                |                  Info and search/select Window                   |                                           The Info window is used to search and select records as well as display information relevant to the selection.                                            |
|       AD\_Menu\_UU        | Texto Curto (String) |                                                                                               |                      |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d145293e358" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução - AD\_Menu\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Menu_Trl_data)

<span class="emphasis">*Descrição:*</span> Tradução de Menu - Pode não
precisar ser traduzido

<span class="emphasis">*Comentário/Ajuda:* </span> Traduções de Menu são
derivadas a partir da Janela, Processo, etc. Você somente precisa
traduzir itens do nível de Resumo. Todos os outros itens serão
traduzidos automaticamente (sobrescritos)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d145293e379" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa      |    Tabela Direta     | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |    Tabela Direta     |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Menu        |    Tabela Direta     |                    |      ad\_menutrl      |                                                  |            Identifies a Menu             |               The Menu identifies a unique Menu. Menus are used to control the display of those screens a user has access to.                |
|      Idioma       |        Tabela        |    AD\_Language    | ad\_language\_menutrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo       |       Sim-Não        |        (Y)         |                       |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Traduzida     |       Sim-Não        |                    |                       |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome        | Texto Curto (String) |                    |                       |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Curto (String) |                    |                       |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| AD\_Menu\_Trl\_UU | Texto Curto (String) |                    |                       |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
