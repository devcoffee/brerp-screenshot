---
title: "Info Window"
id: InfoWindow
---
<div id="d123044e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Info Window

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Janela -
    AD\_InfoWindow](#d123044e22)</span>
  - <span class="section">[2. Tabela: Coluna -
    AD\_InfoColumn](#d123044e415)</span>
  - <span class="section">[3. Tabela: Tradução de Coluna -
    AD\_InfoColumn\_Trl](#d123044e909)</span>
  - <span class="section">[4. Tabela: Tradução de Janela -
    AD\_InfoWindow\_Trl](#d123044e1113)</span>
  - <span class="section">[5. Tabela: Related Info Window -
    AD\_InfoRelated](#d123044e1303)</span>
  - <span class="section">[6. Tabela: Process -
    AD\_InfoProcess](#d123044e1533)</span>
  - <span class="section">[7. Tabela: Role Access -
    AD\_InfoWindow\_Access](#d123044e1762)</span>

</div>

<span class="emphasis">*Descrição:* </span> Define Info and
search/select Window

<span class="emphasis">*Comentário/Ajuda:* </span>The Info window is
used to search and select records as well as display information
relevant to the selection.

<span class="emphasis"> *Criado em:* </span>2006-06-17 17:17:44.0

<span class="emphasis">*Atualizado em:* </span>2006-07-07 18:43:36.0

<div id="d123044e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Janela - AD\_InfoWindow

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoWindow_data)

<span class="emphasis">*Descrição:*</span> Info and search/select Window

<span class="emphasis">*Comentário/Ajuda:* </span> The Info window is
used to search and select records as well as display information
relevant to the selection.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d123044e39" class="table">

<div class="table-title">

Table 1.1. Window
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |                                                   Valores (Padrão)                                                   |      Chave restritiva      |                                             Regra de validação                                              |                                                      Descrição                                                      |                                                                                          Comentário/Ajuda                                                                                           |
| :---------------------: | :-------------------------------: | :------------------------------------------------------------------------------------------------------------------: | :------------------------: | :---------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Info Window       |                ID                 |                                                                                                                      |                            |                                                                                                             |                                            Info and search/select Window                                            |                                           The Info window is used to search and select records as well as display information relevant to the selection.                                            |
|         Empresa         |           Tabela Direta           |                                                                                                                      |                            |                                      AD\_Client.AD\_Client\_ID \< \> 0                                      |                                         (semelhante ao primeiro relatório)                                          |                                                                                         (ver o mesmo acima)                                                                                         |
|       Organização       |           Tabela Direta           |                                                                                                                      |                            |                                                                                                             |                                         (semelhante ao primeiro relatório)                                          |                                                                                         (ver o mesmo acima)                                                                                         |
|          Nome           |       Texto Curto (String)        |                                                                                                                      |                            |                                                                                                             |                                        Alphanumeric identifier of the entity                                        |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|        Descrição        |       Texto Curto (String)        |                                                                                                                      |                            |                                                                                                             |                                      Optional short description of the record                                       |                                                                             A description is limited to 255 characters.                                                                             |
|    Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                                                                                                      |                            |                                                                                                             |                                                   Comment or Hint                                                   |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|          Ativo          |              Sim-Não              |                                                                                                                      |                            |                                                                                                             |                                         (semelhante ao primeiro relatório)                                          |                                                                                         (ver o mesmo acima)                                                                                         |
|        Seqüência        |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_InfoWindow WHERE AD\_InfoWindow\_ID=@AD\_InfoWindow\_ID@) |                            |                                                                                                             |                                Method of ordering records; lowest number comes first                                |                                                                             The Sequence indicates the order of records                                                                             |
|    Tipo de Entidade     |              Tabela               |                 \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)                 |   entityt\_adinfowindow    |                       <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D                        |                          Dictionary Entity Type; Determines ownership and synchronization                           | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|         Tabela          |           Tabela Direta           |                                                                                                                      |   adtable\_adinfowindow    |                                                                                                             |                                             Database Table information                                              |                                                                 The Database Table provides the information of the table definition                                                                 |
|        Sql FROM         | Texto Médio (até 2000 caracteres) |                                                                                                                      |                            |                                                                                                             |                                                   SQL FROM clause                                                   |                The Select Clause indicates the SQL FROM clause to use for selecting the record for a measure calculation. It can have JOIN clauses. Do not include the FROM itself.                 |
|        Sql WHERE        | Texto Médio (até 2000 caracteres) |                                                                                                                      |                            |                                                                                                             |                                          Fully qualified SQL WHERE clause                                           |                 The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname".                  |
|   Outra Cláusula SQL    | Texto Médio (até 2000 caracteres) |                                                                                                                      |                            |                                                                                                             |                                                  Other SQL Clause                                                   |                                                         Any other complete clause like GROUP BY, HAVING, ORDER BY, etc. after WHERE clause.                                                         |
|      Sql ORDER BY       | Texto Médio (até 2000 caracteres) |                                                                                                                      |                            |                                                                                                             |                                           Fully qualified ORDER BY clause                                           |                                                          The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection                                                          |
|         Validar         |               Botão               |                                                                                                                      |                            |                                                                                                             |                                                                                                                     |                                                                                                                                                                                                     |
|        Diferente        |              Sim-Não              |                                                         (N)                                                          |                            |                                                                                                             |                                                   Select Distinct                                                   |                                                                                                                                                                                                     |
|         Padrão          |              Sim-Não              |                                                         (N)                                                          |                            |                                                                                                             |                                                    Default value                                                    |                                                           The Default Checkbox indicates if this record will be used as a default value.                                                            |
|      Load Page Num      |              Sim-Não              |                                                         (Y)                                                          |                            |                                                                                                             |                             When load data for info window, also load number of paging                              |                                                      Load number of paging maybe affect to performance when info window is join of many table                                                       |
| Max Registros Perguntas |              Inteiro              |                                                         (0)                                                          |                            |                                                                                                             | If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records |                                    Enter the number of records a user will be able to query to avoid unnecessary system load. If 0, no restrictions are imposed.                                    |
|         Válido          |              Sim-Não              |                                                         (N)                                                          |                            |                                                                                                             |                                                  Element is valid                                                   |                                                                               The element passed the validation check                                                                               |
|    Mostre no Painel     |              Sim-Não              |                                                         (Y)                                                          |                            |                                                                                                             |                                          Show the dashlet in the dashboard                                          |                                                                                                                                                                                                     |
|    Ajuda de Contexto    |           Tabela Direta           |                                                                                                                      |  adctxhelp\_adinfowindow   | AD\_CtxHelp\_ID IN (SELECT AD\_CtxHelp\_ID FROM AD\_CtxHelp WHERE CtxType IS NULL OR CtxType IN ('A', 'I')) |                                                                                                                     |                                                                                                                                                                                                     |
|      URL da Imagem      |       Texto Curto (String)        |                                                                                                                      |                            |                                                                                                             |                                                    URL of image                                                     |                                        URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.                                        |
|       Field Style       |              Tabela               |                                                      AD\_Style                                                       | ADFieldStyle\_ADInfoWindow |                                                                                                             |                                                   Field CSS Style                                                   |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d123044e415" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Coluna - AD\_InfoColumn

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoColumn_data)

<span class="emphasis">*Descrição:*</span> Info Window Column

<span class="emphasis">*Comentário/Ajuda:* </span> Column in the Info
Window for display and/or selection. If used for selection, the column
cannot be a SQL expression. The SQL clause must be fully qualified based
on the FROM clause in the Info Window definition

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d123044e432" class="table">

<div class="table-title">

Table 1.2. Column
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |                                                   Valores (Padrão)                                                   |        Chave restritiva        |                                     Regra de validação                                      |                                      Descrição                                      |                                                                                                                                                                                                                                                                                                                                                                                                    Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                                                                    |
| :----------------------------: | :-------------------------------: | :------------------------------------------------------------------------------------------------------------------: | :----------------------------: | :-----------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Info Column           |                ID                 |                                                                                                                      |                                |                                                                                             |                                 Info Window Column                                  |                                                                                                                                                                                                                                                                                                  Column in the Info Window for display and/or selection. If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition                                                                                                                                                                                                                                                                                                   |
|       AD\_InfoColumn\_UU       |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|          Info Window           |           Tabela Direta           |                                                                                                                      |   adinfowindow\_adinfocolumn   |                                                                                             |                            Info and search/select Window                            |                                                                                                                                                                                                                                                                                                                                                     The Info window is used to search and select records as well as display information relevant to the selection.                                                                                                                                                                                                                                                                                                                                                     |
|            Empresa             |           Tabela Direta           |                                                                                                                      |                                |                              AD\_Client.AD\_Client\_ID \< \> 0                              |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|          Organização           |           Tabela Direta           |                                                                                                                      |                                |                                                                                             |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|      Elemento do Sistema       |             Procurar              |                                                                                                                      |    adelement\_adinfocolumn     |                                                                                             |   System Element enables the central maintenance of column description and help.    |                                                                                                                                                                                                                                                                                                                                                   The System Element allows for the central maintenance of help, descriptions and terminology for a database column.                                                                                                                                                                                                                                                                                                                                                   |
|       Nome da Coluna BD        |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                         Name of the column in the database                          |                                                                                                                                                                                                                                                                                                                                                                 The Column Name indicates the name of a column on a table as defined in the database.                                                                                                                                                                                                                                                                                                                                                                  |
|           Seqüência            |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_InfoColumn WHERE AD\_InfoWindow\_ID=@AD\_InfoWindow\_ID@) |                                |                                                                                             |                Method of ordering records; lowest number comes first                |                                                                                                                                                                                                                                                                                                                                                                                      The Sequence indicates the order of records                                                                                                                                                                                                                                                                                                                                                                                       |
|           Sql SELECT           |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                                  SQL SELECT clause                                  |                                                                                                                                                                                                                                                                                                                                     The Select Clause indicates the SQL SELECT clause to use for selecting the record for a measure calculation. Do not include the SELECT itself.                                                                                                                                                                                                                                                                                                                                     |
|              Nome              |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                        Alphanumeric identifier of the entity                        |                                                                                                                                                                                                                                                                                                                                      The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                                                                                                                                                      |
|           Descrição            |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                      Optional short description of the record                       |                                                                                                                                                                                                                                                                                                                                                                                      A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                                                                       |
|        Comentário/Ajuda        | Texto Médio (até 2000 caracteres) |                                                                                                                      |                                |                                                                                             |                                   Comment or Hint                                   |                                                                                                                                                                                                                                                                                                                                                                      The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                                                                                                                                                                                                                                       |
|          Placeholder           |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|             Ativo              |              Sim-Não              |                                                         (Y)                                                          |                                |                                                                                             |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|            Mostrado            |              Sim-Não              |                                                         (Y)                                                          |                                |                                                                                             |                       Determines, if this field is displayed                        |                                                                                                                                                                                                                                                                                                                                                       If the field is displayed, the field Display Logic will determine at runtime, if it is actually displayed                                                                                                                                                                                                                                                                                                                                                        |
|     Critérios de Consulta      |              Sim-Não              |                                                                                                                      |                                |                                                                                             |                     The column is also used as a query criteria                     |                                                                                                                                                                                                                                                                                                                                                                         The column is used to enter queries - the SQL cannot be an expression                                                                                                                                                                                                                                                                                                                                                                          |
|   Mantido Centralizadamente    |              Sim-Não              |                                                         (Y)                                                          |                                |                                                                                             |                   Information maintained in System Element table                    |                                                                                                                                                                                                                                                                                                                                         The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table or 'Window' table.                                                                                                                                                                                                                                                                                                                                          |
|          Obrigatório           |              Sim-Não              |                                                         (N)                                                          |                                |                                                                                             |                        Data entry is required in this column                        |                                                                                                                                                                                                                                                                                                                                                                        The field must have a value for the record to be saved to the database.                                                                                                                                                                                                                                                                                                                                                                         |
|        Somente Leitura         |              Sim-Não              |                                                         (Y)                                                          |                                |                                                                                             |                                 Field is read only                                  |                                                                                                                                                                                                                                                                                                                                                                    The Read Only indicates that this field may only be Read. It may not be updated.                                                                                                                                                                                                                                                                                                                                                                    |
|         Identificador          |              Sim-Não              |                                                         (N)                                                          |                                |                                                                                             |                    This column is part of the record identifier                     |                                                                                                                                                                                                                                                                                                                                                          The Identifier checkbox indicates that this column is part of the identifier or key for this table.                                                                                                                                                                                                                                                                                                                                                           |
|          Coluna Chave          |              Sim-Não              |                                                                                                                      |                                |                                                                                             |                        This column is the key in this table                         |                                                                                                                                                                                                                                                                                                                                                               The key column must also be display sequence 0 in the field definition and may be hidden.                                                                                                                                                                                                                                                                                                                                                                |
| Seqüência de Seleção da Coluna |              Inteiro              |                                                         (0)                                                          |                                |                                                                                             |                              Selection Column Sequence                              |                                                                                                                                                                                                                                                                                                                                                                                       For ordering sequence of selection column                                                                                                                                                                                                                                                                                                                                                                                        |
|     Lógica de Visualização     | Texto Médio (até 2000 caracteres) |                                                                                                                      |                                |                                                                                             | If the Field is displayed, the result determines if the field is actually displayed |                                                                                                                                       format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional)                                                                                                                                        |
|         Lógica Padrão          |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                       Default value hierarchy, separated by ;                       | The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. \#Date, \#AD\_Org\_ID, \#AD\_Client\_ID - Accounting Schema: e.g. $C\_AcctSchema\_ID, $C\_Calendar\_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables. There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined. Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons. |
|     Operador para Consulta     |               Lista               |                                         \< \< = = \> \> = \!= Like Full Like                                         |                                |                                                                                             |                             Operator for database query                             |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|        Função Consulta         |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                             Database function for query                             |                                                                                                                                                                                                                                                                                                       Database function for user query. If the database function takes more than just the column name parameter, use ? to indicate where the column name should goes to. E.g: Upper, Trunc and To\_Char(?,'MM')                                                                                                                                                                                                                                                                                                        |
|           Referência           |              Tabela               |                                               AD\_Reference Data Types                                               |   adreference\_adinfocolumn    |                                                                                             |                           System Reference and Validation                           |                                                                                                                                                                                                                                                                                                                                                                            The Reference could be a display type, list or table validation.                                                                                                                                                                                                                                                                                                                                                                            |
|      Chave de Referência       |              Tabela               |                                                 AD\_Reference Values                                                 | adreferencevalue\_adinfocolumn | AD\_Reference.ValidationType=CASE WHEN @AD\_Reference\_ID@ IN (17,28) THEN 'L' ELSE 'T' END |                 Required to specify, if data type is Table or List                  |                                                                                                                                                                                                                                                                                                                                              The Reference Value indicates where the reference values are stored. It must be specified if the data type is Table or List.                                                                                                                                                                                                                                                                                                                                              |
|       Validação Dinâmica       |           Tabela Direta           |                                                                                                                      |    advalrule\_adinfocolumn     |                                                                                             |                               Dynamic Validation Rule                               |                                                                                                                                                                                                                                                                                                                                               These rules define how an entry is determined to valid. You can use variables for dynamic (context sensitive) validation.                                                                                                                                                                                                                                                                                                                                                |
|        Tipo de Entidade        |              Tabela               |                 \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)                 |     entityt\_adinfocolumn      |               <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D                |          Dictionary Entity Type; Determines ownership and synchronization           |                                                                                                                                                                                                                                                                                                          The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!                                                                                                                                                                                                                                                                                                           |
|     Pesquisa Multi Coluna      |       Texto Curto (String)        |                                                                                                                      |                                |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |

</div>

</div>

  

<div id="d123044e909" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução de Coluna - AD\_InfoColumn\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoColumn_Trl_data)

<span class="emphasis">*Descrição:*</span> Infow Window Column
Translation

<span class="emphasis">*Coluna linkada:* </span> Info Column

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d123044e930" class="table">

<div class="table-title">

Table 1.3. Column Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             | Valores (Padrão) |       Chave restritiva        |        Regra de validação         |                Descrição                 |                                                                                                  Comentário/Ajuda                                                                                                   |
| :---------------------: | :-------------------------------: | :--------------: | :---------------------------: | :-------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| AD\_InfoColumn\_Trl\_UU |       Texto Curto (String)        |                  |                               |                                   |                                          |                                                                                                                                                                                                                     |
|          Ativo          |              Sim-Não              |                  |                               |                                   |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                 |
|         Empresa         |           Tabela Direta           |                  |                               | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                 |
|       Organização       |           Tabela Direta           |                  |                               |                                   |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                 |
|       Info Column       |           Tabela Direta           |                  | adinfocolumn\_adinfocolumntrl |                                   |            Info Window Column            | Column in the Info Window for display and/or selection. If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition |
|         Idioma          |              Tabela               |   AD\_Language   |  adlanguage\_adinfocolumntrl  |                                   |         Language for this entity         |                                                                       The Language identifies the language to use for display and formatting                                                                        |
|          Nome           |       Texto Curto (String)        |                  |                               |                                   |  Alphanumeric identifier of the entity   |                                    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                     |
|        Descrição        |       Texto Curto (String)        |                  |                               |                                   | Optional short description of the record |                                                                                     A description is limited to 255 characters.                                                                                     |
|    Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                  |                               |                                   |             Comment or Hint              |                                                                     The Help field contains a hint, comment or help about the use of this item.                                                                     |
|       Placeholder       |       Texto Curto (String)        |                  |                               |                                   |                                          |                                                                                                                                                                                                                     |
|        Traduzida        |              Sim-Não              |                  |                               |                                   |        This column is translated         |                                                                           The Translated checkbox indicates if this column is translated.                                                                           |

</div>

</div>

  

<div id="d123044e1113" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tradução de Janela - AD\_InfoWindow\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoWindow_Trl_data)

<span class="emphasis">*Descrição:*</span> Info Window Translation

<span class="emphasis">*Coluna linkada:* </span> Info Window

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d123044e1134" class="table">

<div class="table-title">

Table 1.4. Window Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             | Valores (Padrão) |       Chave restritiva        |        Regra de validação         |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :-------------------------------: | :--------------: | :---------------------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|          Ativo          |              Sim-Não              |                  |                               |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Empresa         |           Tabela Direta           |                  |                               | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização       |           Tabela Direta           |                  |                               |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Info Window       |           Tabela Direta           |                  | adinfowindow\_adinfowindowtrl |                                   |      Info and search/select Window       |                The Info window is used to search and select records as well as display information relevant to the selection.                |
|         Idioma          |              Tabela               |   AD\_Language   |  adlanguage\_adinfowindowtrl  |                                   |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|          Nome           |       Texto Curto (String)        |                  |                               |                                   |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        |       Texto Curto (String)        |                  |                               |                                   | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                  |                               |                                   |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|        Traduzida        |              Sim-Não              |                  |                               |                                   |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
| AD\_InfoWindow\_Trl\_UU |       Texto Curto (String)        |                  |                               |                                   |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d123044e1303" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Related Info Window - AD\_InfoRelated

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoRelated_data)

<span class="emphasis">*Coluna linkada:* </span> Info Window

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d123044e1316" class="table">

<div class="table-title">

Table 1.5. Related Info Window
Fields

</div>

<div class="table-contents">

|           Nome do campo           |            Referência             |                                   Valores (Padrão)                                   |        Chave restritiva         |                       Regra de validação                       |                             Descrição                              |                                                                                          Comentário/Ajuda                                                                                           |
| :-------------------------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------: | :----------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            InfoRelated            |                ID                 |                                                                                      |                                 |                                                                |                                                                    |                                                                                                                                                                                                     |
|              Empresa              |           Tabela Direta           |                                                                                      |     ADClient\_ADInfoRelated     |               AD\_Client.AD\_Client\_ID \< \> 0                |                 (semelhante ao primeiro relatório)                 |                                                                                         (ver o mesmo acima)                                                                                         |
|            Organização            |           Tabela Direta           |                                                                                      |      ADOrg\_ADInfoRelated       |                                                                |                 (semelhante ao primeiro relatório)                 |                                                                                         (ver o mesmo acima)                                                                                         |
|               Ativo               |              Sim-Não              |                                                                                      |                                 |                                                                |                 (semelhante ao primeiro relatório)                 |                                                                                         (ver o mesmo acima)                                                                                         |
|            Info Window            |           Tabela Direta           |                                                                                      |   ADInfoWindow\_ADInfoRelated   |                                                                |                   Info and search/select Window                    |                                           The Info window is used to search and select records as well as display information relevant to the selection.                                            |
|         Tipo de Entidade          |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) |    EntityType\_ADInfoRelated    | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D |  Dictionary Entity Type; Determines ownership and synchronization  | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|               Nome                |       Texto Curto (String)        |                                                                                      |                                 |                                                                |               Alphanumeric identifier of the entity                |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|             Descrição             |       Texto Curto (String)        |                                                                                      |                                 |                                                                |              Optional short description of the record              |                                                                             A description is limited to 255 characters.                                                                             |
|         Comentário/Ajuda          | Texto Médio (até 2000 caracteres) |                                                                                      |                                 |                                                                |                          Comment or Hint                           |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
| Janela de Informações Relacionada |              Tabela               |                               AD\_RelatedInfoWindow(0)                               |   RelatedInfo\_ADInfoRelated    |                                                                |                                                                    |                                                                                                                                                                                                     |
| Coluna de Informações Relacionada |              Tabela               |                                AD\_LinkInfowindow(0)                                 |  RelatedColumn\_ADInfoRelated   |      AD\_InfoColumn.AD\_InfoWindow\_ID=@RelatedInfo\_ID@       |                                                                    |                                                                                                                                                                                                     |
|       Parent Related Column       |              Tabela               |                                  AD\_LinkInfowindow                                  | ParentRelatedColumn\_ADInfoRela |     AD\_InfoColumn.AD\_InfoWindow\_ID=@AD\_InfoWindow\_ID@     | column in parent info window, link with column in this relate info |                    default column RelatedColumn in Relate Info window will link with key column of main info window column define in ParentRelatedColumn will replace key column                    |
|             Seqüência             |              Inteiro              |                                                                                      |                                 |                                                                |       Method of ordering records; lowest number comes first        |                                                                             The Sequence indicates the order of records                                                                             |

</div>

</div>

  

<div id="d123044e1533" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Process - AD\_InfoProcess

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoProcess_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d123044e1542" class="table">

<div class="table-title">

Table 1.6. Process
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |                                                   Valores (Padrão)                                                    |      Chave restritiva       |                       Regra de validação                       |                                      Descrição                                      |                                                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                                                              |
| :---------------------: | :-------------------------------: | :-------------------------------------------------------------------------------------------------------------------: | :-------------------------: | :------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Info Process       |                ID                 |                                                                                                                       |                             |                                                                |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|         Empresa         |           Tabela Direta           |                                                 (@\#AD\_Client\_ID@)                                                  |   ADClient\_ADInfoProcess   |               AD\_Client.AD\_Client\_ID \< \> 0                |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                                                                                                            |
|       Organização       |           Tabela Direta           |                                                   (@\#AD\_Org\_ID@)                                                   |    ADOrg\_ADInfoProcess     |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                                                                                                            |
|       Info Window       |           Tabela Direta           |                                                                                                                       | ADInfoWindow\_ADInfoProcess |                                                                |                            Info and search/select Window                            |                                                                                                                                                                                                              The Info window is used to search and select records as well as display information relevant to the selection.                                                                                                                                                                                                               |
|      URL da Imagem      |       Texto Curto (String)        |                                                                                                                       |                             |                                                                |                                    URL of image                                     |                                                                                                                                                                                                           URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.                                                                                                                                                                                                           |
|    Tipo de Entidade     |              Tabela               |                 \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)                  |  EntityType\_ADInfoProcess  | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D |          Dictionary Entity Type; Determines ownership and synchronization           |                                                                                                                                                                    The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!                                                                                                                                                                    |
| Habilitado sem registro |              Sim-Não              |                                                          (N)                                                          |                             |                                                                |                             Enabled even without record                             |                                                                                                                                                                                                                                                        Enabled even without record                                                                                                                                                                                                                                                        |
|        Processo         |           Tabela Direta           |                                                                                                                       |  ADProcess\_ADInfoProcess   |                                                                |                                  Process or Report                                  |                                                                                                                                                                                                                                  The Process field identifies a unique Process or Report in the system.                                                                                                                                                                                                                                   |
|        Seqüência        |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_InfoProcess WHERE AD\_InfoWindow\_ID=@AD\_InfoWindow\_ID@) |                             |                                                                |                Method of ordering records; lowest number comes first                |                                                                                                                                                                                                                                                The Sequence indicates the order of records                                                                                                                                                                                                                                                |
|     Tipo do Leiaute     |               Lista               |                                                 Button List Menu (B)                                                  |                             |                                                                |                             Layout type of info process                             |                                                                                                                                                                                                                                              Process info can display as button, list, menu                                                                                                                                                                                                                                               |
|      ViewID Column      |           Tabela Direta           |                                                                                                                       | ADInfoColumn\_ADInfoProcess |     AD\_InfoColumn.AD\_InfoWindow\_ID=@AD\_InfoWindow\_ID@     |                                 Info Window Column                                  |                                                                                                                                                            Column in the Info Window for display and/or selection. If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition                                                                                                                                                            |
| Lógica de Visualização  | Texto Médio (até 2000 caracteres) |                                                                                                                       |                             |                                                                | If the Field is displayed, the result determines if the field is actually displayed | format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional) |
|          Ativo          |              Sim-Não              |                                                          (Y)                                                          |                             |                                                                |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d123044e1762" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Role Access - AD\_InfoWindow\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoWindow_Access_data)

<span class="emphasis">*Coluna linkada:* </span> Info Window

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d123044e1775" class="table">

<div class="table-title">

Table 1.7. Role Access
Fields

</div>

<div class="table-contents">

| Nome do campo |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                                Comentário/Ajuda                                                |
| :-----------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------------------: |
|    Empresa    | Tabela Direta | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                               |
|  Organização  | Tabela Direta |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                               |
|    Perfil     | Tabela Direta |                      |   adrole\_adinfowindowaccess    |                                                  |        Responsibility Role         |           The Role determines security and access a user who has this Role will have in the System.            |
|  Info Window  | Tabela Direta |                      | adinfowindow\_adinfowindowacces |                                                  |   Info and search/select Window    | The Info window is used to search and select records as well as display information relevant to the selection. |
|     Ativo     |    Sim-Não    |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                               |

</div>

</div>

  

</div>
