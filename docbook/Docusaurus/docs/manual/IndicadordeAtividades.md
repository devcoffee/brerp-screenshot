---
title: "Indicador de Atividades"
id: IndicadordeAtividades
---
<div id="d121205e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Indicador de Atividades

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Indicador de Atividades -
    PA\_DocumentStatus](#d121205e23)</span>
  - <span class="section">[2. Tabela: Tradução do Indicador de
    Atividades - PA\_DocumentStatus\_Trl](#d121205e335)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-04-11 18:53:07.0

<span class="emphasis">*Atualizado em:* </span>2017-04-11 18:53:07.0

![](/img/manual/IndicadordeAtividades.png)

<div id="d121205e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Indicador de Atividades - PA\_DocumentStatus

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_DocumentStatus_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d121205e32" class="table">

<div class="table-title">

Table 1.1. Document Status Indicator
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                           Descrição                           |                                                                          Comentário/Ajuda                                                                          |
| :--------------------: | :-------------------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Document Status     |                ID                 |                      |                                 |                                                  |                                                               |                                                                                                                                                                    |
|        Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                        (ver o mesmo acima)                                                                         |
|      Organização       |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                        (ver o mesmo acima)                                                                         |
|          Nome          |       Texto Curto (String)        |                      |                                 |                                                  |             Alphanumeric identifier of the entity             |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.            |
|       Descrição        |       Texto Curto (String)        |                      |                                 |                                                  |           Optional short description of the record            |                                                            A description is limited to 255 characters.                                                             |
|         Ativo          |              Sim-Não              |         (Y)          |                                 |                                                  |              (semelhante ao primeiro relatório)               |                                                                        (ver o mesmo acima)                                                                         |
|         Perfil         |           Tabela Direta           |         (-1)         |    ADRole\_PADocumentStatus     |                                                  |                      Responsibility Role                      |                                     The Role determines security and access a user who has this Role will have in the System.                                      |
|    Usuário/Contato     |             Procurar              |         (-1)         |    ADUser\_PADocumentStatus     |                                                  | User within the system - Internal or Business Partner Contact |                           The User identifies a unique user in the system. This could be an internal user or a business partner contact                            |
|        Projeto         |           Tabela Direta           |                      |   CProject\_PADocumentStatus    |                                                  |                       Financial Project                       |                                             A Project allows you to track and control internal or external activities.                                             |
|       Seqüência        |              Inteiro              |                      |                                 |                                                  |     Method of ordering records; lowest number comes first     |                                                            The Sequence indicates the order of records                                                             |
|   Fonte Para Titulo    |              Tabela               |    AD\_PrintFont     | NamePrintFont\_PADocumentStatus |                                                  |                                                               |                                                                                                                                                                    |
|    Cor Para Titulo     |              Tabela               |    AD\_PrintColor    | NamePrintColor\_PADocumentStatu |                                                  |                                                               |                                                                                                                                                                    |
|    Fonte para Valor    |              Tabela               |    AD\_PrintFont     | NumberPrintFont\_PADocumentStat |                                                  |                                                               |                                                                                                                                                                    |
|     Cor para Valor     |              Tabela               |    AD\_PrintColor    | NumberPrintColor\_PADocumentSta |                                                  |                                                               |                                                                                                                                                                    |
|         Tabela         |           Tabela Direta           |                      |    ADTable\_PADocumentStatus    |                                                  |                  Database Table information                   |                                                The Database Table provides the information of the table definition                                                 |
|       Sql WHERE        | Texto Médio (até 2000 caracteres) |                      |                                 |                                                  |               Fully qualified SQL WHERE clause                | The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname". |
|         Janela         |           Tabela Direta           |                      |   ADWindow\_PADocumentStatus    |                                                  |                 Data entry or display window                  |                                                     The Window field identifies a unique Window in the system.                                                     |
|  Formulário Especial   |           Tabela Direta           |                      |    ADForm\_PADocumentStatus     |                                                  |                         Special Form                          |                                               The Special Form field identifies a unique Special Form in the system.                                               |
| PA\_DocumentStatus\_UU |       Texto Curto (String)        |                      |                                 |                                                  |                                                               |                                                                                                                                                                    |

</div>

</div>

  

<div id="d121205e335" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução do Indicador de Atividades - PA\_DocumentStatus\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_DocumentStatus_Trl_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d121205e344" class="table">

<div class="table-title">

Table 1.2. Document Status Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo  |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-------------: | :------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|   Organização   |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
| Document Status |    Tabela Direta     |                    | PADocumentStatus\_PADocumentSta |                                                  |                                       |                                                                                                                                              |
|     Idioma      |        Tabela        |    AD\_Language    | ADLanguage\_PADocumentStatusTrl |                                                  |       Language for this entity        |                                    The Language identifies the language to use for display and formatting                                    |
|      Nome       | Texto Curto (String) |                    |                                 |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Traduzida    |       Sim-Não        |                    |                                 |                                                  |       This column is translated       |                                       The Translated checkbox indicates if this column is translated.                                        |
|      Ativo      |       Sim-Não        |        (Y)         |                                 |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
