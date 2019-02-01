---
title: "Formulário"
id: Formulario
---
<div id="d108281e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Formulário

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Formulário -
    AD\_Form](#d108281e22)</span>
  - <span class="section">[2. Tabela: Acesso -
    AD\_Form\_Access](#d108281e257)</span>
  - <span class="section">[3. Tabela: Tradução -
    AD\_Form\_Trl](#d108281e393)</span>

</div>

<span class="emphasis">*Descrição:* </span> Formulários Especiais

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Formulário"
define quaisquer janelas que não forem geradas automaticamente. Somente
para uso do Administrador do Sistema.

<span class="emphasis"> *Criado em:* </span>2000-07-13 18:08:09.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d108281e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Formulário - AD\_Form

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Form_data)

<span class="emphasis">*Descrição:*</span> Formulário Especial

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Formulário"
define quaisquer janelas que não forem geradas automaticamente. Somente
para uso do Administrador do Sistema.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d108281e39" class="table">

<div class="table-title">

Table 1.1. Form
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |                                        Valores (Padrão)                                         | Chave restritiva  |                                             Regra de validação                                              |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :----------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------: | :---------------: | :---------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Formulário Especial    |                ID                 |                                                                                                 |                   |                                                                                                             |                           Special Form                           |                                                               The Special Form field identifies a unique Special Form in the system.                                                                |
|         jsp URL          |                URL                |                                                                                                 |                   |                                                                                                             |                   Web URL of the jsp function                    |                                         For the Web UI, define the URL to perform the function (usually a jsp). The URL also can be external to the system.                                         |
|         Empresa          |           Tabela Direta           |                                      (@\#AD\_Client\_ID@)                                       |                   |                                      AD\_Client.AD\_Client\_ID \< \> 0                                      |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Organização        |           Tabela Direta           |                                        (@\#AD\_Org\_ID@)                                        |                   |                              (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                               |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|           Nome           |       Texto Curto (String)        |                                                                                                 |                   |                                                                                                             |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|        Descrição         |       Texto Curto (String)        |                                                                                                 |                   |                                                                                                             |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                                                                                 |                   |                                                                                                             |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|          Ativo           |              Sim-Não              |                                               (Y)                                               |                   |                                                                                                             |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Funcionalidade Beta    |              Sim-Não              |                                                                                                 |                   |                                                                                                             |              This functionality is considered Beta               |                                                                        Beta functionality is not fully tested or completed.                                                                         |
|     Tipo de Entidade     |              Tabela               |      \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)       |  entityt\_adform  |                       <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D                        | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
| Nível de Acesso de Dados |               Lista               | Organização Somente Cliente Empresa+Organização Somente Sistema Sistema+Cliente (Empresa) Todos |                   |                                                                                                             |                      Access Level required                       |                                                                   Indicates the access level required for this record or process.                                                                   |
|        Classname         |       Texto Curto (String)        |                                                                                                 |                   |                                                                                                             |                          Java Classname                          |                                                             The Classname identifies the Java classname used by this report or process.                                                             |
|    Ajuda de Contexto     |           Tabela Direta           |                                                                                                 | adctxhelp\_adform | AD\_CtxHelp\_ID IN (SELECT AD\_CtxHelp\_ID FROM AD\_CtxHelp WHERE CtxType IS NULL OR CtxType IN ('A', 'F')) |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d108281e257" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Acesso - AD\_Form\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Form_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Formulários

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Formulários" define as regras de acesso para este formulário

<span class="emphasis">*Coluna linkada:* </span> Special Form

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d108281e278" class="table">

<div class="table-title">

Table 1.2. Access
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |  Valores (Padrão)  |   Chave restritiva   |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :-----------------: | :-----------: | :----------------: | :------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|       Empresa       | Tabela Direta | (@AD\_Client\_ID@) |                      |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|     Organização     | Tabela Direta |  (@AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Formulário Especial | Tabela Direta |                    | adform\_adformaccess |                                                  |            Special Form            |          The Special Form field identifies a unique Special Form in the system.           |
|       Perfil        | Tabela Direta |                    | adrole\_adformaccess |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|        Ativo        |    Sim-Não    |        (Y)         |                      |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|  Escrita e Leitura  |    Sim-Não    |                    |                      |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

<div id="d108281e393" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - AD\_Form\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Form_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d108281e406" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa       |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização     |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Formulário Especial |           Tabela Direta           |                    |   adform\_adformtrl   |                                                  |               Special Form               |                                    The Special Form field identifies a unique Special Form in the system.                                    |
|       Idioma        |              Tabela               |    AD\_Language    | adlanguage\_adformtrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo        |              Sim-Não              |        (Y)         |                       |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Traduzida      |              Sim-Não              |                    |                       |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|        Nome         |       Texto Curto (String)        |                    |                       |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |       Texto Curto (String)        |                    |                       |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|  AD\_Form\_Trl\_UU  |       Texto Curto (String)        |                    |                       |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
