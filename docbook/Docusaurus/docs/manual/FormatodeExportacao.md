---
title: "Formato de Exportação"
id: FormatodeExportacao
---
<div id="d106500e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Formato de Exportação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Formato de Exportação -
    EXP\_Format](#d106500e23)</span>
  - <span class="section">[2. Tabela: Linha do Formato de Exportação -
    EXP\_FormatLine](#d106500e273)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-03-05 00:52:09.0

<span class="emphasis">*Atualizado em:* </span>2009-12-01 22:44:58.0

![](/img/manual/FormatodeExportacao.png)

<div id="d106500e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Formato de Exportação - EXP\_Format

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/EXP_Format_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d106500e32" class="table">

<div class="table-title">

Table 1.1. Export Format
Fields

</div>

<div class="table-contents">

|         Nome do campo         |            Referência             |   Valores (Padrão)   |  Chave restritiva  |                Regra de validação                |                Descrição                 |                                                                          Comentário/Ajuda                                                                          |
| :---------------------------: | :-------------------------------: | :------------------: | :----------------: | :----------------------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Create from a Window      |               Botão               |                      |                    |                                                  |                                          |                                                                                                                                                                    |
|            Empresa            |           Tabela Direta           | (@\#AD\_Client\_ID@) |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|          Organização          |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|        Chave de Busca         |       Texto Curto (String)        |                      |                    |                                                  |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|            Versão             |       Texto Curto (String)        |                      |                    |                                                  |     Version of the table definition      |                                                    The Version indicates the version of this table definition.                                                     |
|             Nome              |       Texto Curto (String)        |                      |                    |                                                  |  Alphanumeric identifier of the entity   |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.            |
|           Descrição           |       Texto Curto (String)        |                      |                    |                                                  | Optional short description of the record |                                                            A description is limited to 255 characters.                                                             |
|             Ativo             |              Sim-Não              |        ('Y')         |                    |                                                  |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|       Comentário/Ajuda        | Texto Médio (até 2000 caracteres) |                      |                    |                                                  |             Comment or Hint              |                                            The Help field contains a hint, comment or help about the use of this item.                                             |
|            Tabela             |             Procurar              |                      | adtable\_expformat |                                                  |        Database Table information        |                                                The Database Table provides the information of the table definition                                                 |
|           Sql WHERE           | Texto Médio (até 2000 caracteres) |                      |                    |                                                  |     Fully qualified SQL WHERE clause     | The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname". |
| Teste de Modelo de Importação |               Botão               |                      |                    |                                                  |                                          |                                                                                                                                                                    |
| Teste de Modelo de Exportação |               Botão               |                      |                    |                                                  |                                          |                                                                                                                                                                    |
|     Formato de Exportação     |                ID                 |                      |                    |                                                  |                                          |                                                                                                                                                                    |
|        EXP\_Format\_UU        |       Texto Curto (String)        |                      |                    |                                                  |                                          |                                                                                                                                                                    |

</div>

</div>

  

<div id="d106500e273" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha do Formato de Exportação - EXP\_FormatLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/EXP_FormatLine_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d106500e282" class="table">

<div class="table-title">

Table 1.2. Export Format Line
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |                                                    Valores (Padrão)                                                     |        Chave restritiva         |                                         Regra de validação                                          |                      Descrição                       |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :-------------------------------------------------------------------------------------------------: | :--------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Formato da Linha     |                ID                 |                                                                                                                         |                                 |                                                                                                     |                                                      |                                                                                                                                              |
|         Empresa         |           Tabela Direta           |                                                  (@\#AD\_Client\_ID@)                                                   |                                 |                                  AD\_Client.AD\_Client\_ID \< \> 0                                  |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|       Organização       |           Tabela Direta           |                                                    (@\#AD\_Org\_ID@)                                                    |                                 |                          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                           |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|  Formato de Exportação  |           Tabela Direta           |                                                                                                                         |    expformat\_expformatline     |                                                                                                     |                                                      |                                                                                                                                              |
|     Chave de Busca      |       Texto Curto (String)        |                                                                                                                         |                                 |                                                                                                     |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|          Nome           |       Texto Curto (String)        |                                                                                                                         |                                 |                                                                                                     |        Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        |       Texto Curto (String)        |                                                                                                                         |                                 |                                                                                                     |       Optional short description of the record       |                                                 A description is limited to 255 characters.                                                  |
|          Ativo          |              Sim-Não              |                                                          ('Y')                                                          |                                 |                                                                                                     |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|    Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                                                                                                         |                                 |                                                                                                     |                   Comment or Hint                    |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|        Position         |              Inteiro              | (@SQL=SELECT COALESCE(MAX(Position),0)+10 AS DefaultValue FROM EXP\_FormatLine WHERE EXP\_Format\_ID=@EXP\_Format\_ID@) |                                 |                                                                                                     |                                                      |                                                                                                                                              |
|       Obrigatório       |              Sim-Não              |                                                                                                                         |                                 |                                                                                                     |        Data entry is required in this column         |                                   The field must have a value for the record to be saved to the database.                                    |
|          Tipo           |               Lista               |                         XML Attribute XML Element Embedded EXP Format Referenced EXP Format (E)                         |                                 |                                                                                                     | Type of Validation (SQL, Java Script, Java Language) |                  The Type indicates the type of validation that will occur. This can be SQL, Java Script or Java Language.                   |
|         Coluna          |             Procurar              |                                                                                                                         |     adcolumn\_expformatline     |                              AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@                               |                 Column in the table                  |                                                   Link to the database column of the table                                                   |
| É parte do Índice Único |              Sim-Não              |                                                           (N)                                                           |                                 |                                                                                                     |                                                      |                                                                                                                                              |
|   Formato Incorporado   |              Tabela               |                                                       EXP\_Format                                                       | expembeddedformat\_expformatlin |                                                                                                     |                                                      |                                                                                                                                              |
|       Referência        |              Tabela               |                                                AD\_Reference Data Types                                                 |                                 |                                                                                                     |           System Reference and Validation            |                                       The Reference could be a display type, list or table validation.                                       |
|     Formato de Data     |       Texto Curto (String)        |                                                                                                                         |                                 | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Reference\_ID@\!15 %26 @AD\_Reference\_ID@\!16 |         Date format used in the input format         |                                    The date format is usually detected, but sometimes need to be defined.                                    |
|   EXP\_FormatLine\_UU   |       Texto Curto (String)        |                                                                                                                         |                                 |                                                                                                     |                                                      |                                                                                                                                              |

</div>

</div>

  

</div>
