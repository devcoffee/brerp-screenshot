---
title: "Relatório %26 Processo"
id: RelatorioProcesso
---
<div id="d196161e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Relatório %26 Processo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Relatório %26 Processo -
    AD\_Process](#d196161e22)</span>
  - <span class="section">[2. Tabela: Parâmetro -
    AD\_Process\_Para](#d196161e454)</span>
  - <span class="section">[3. Tabela: Tradução de Parâmetro -
    AD\_Process\_Para\_Trl](#d196161e960)</span>
  - <span class="section">[4. Tabela: Tradução de Relatório -
    AD\_Process\_Trl](#d196161e1173)</span>
  - <span class="section">[5. Tabela: Acesso a Relatórios -
    AD\_Process\_Access](#d196161e1358)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Relatórios
%26 Processos

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Relatório
%26 Processo" é usada para definir os parâmetros e as regras de acesso
para todos os Relatórios e Processos dentro do sistema. Esta Janela é
somente para uso do Administrador do Sistema.

<span class="emphasis"> *Criado em:* </span>1999-12-11 19:33:27.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d196161e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Relatório %26 Processo - AD\_Process

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_data)

<span class="emphasis">*Descrição:*</span> Definir Relatório %26
Processo

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Relatório e
Processo" define cada relatório e processo que roda no sistema. Por
favor note que o Formato de Impressão só é usado para Imprimir
Documentos quando você deseja compartilhar um formato comum definido no
nível de sistema. Para relatórios e formatos normais, você não deveria
definir um formato de impressão aqui, e sim, modificar o formato de
impressão gerado e selecioná-lo como padrão.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d196161e39" class="table">

<div class="table-title">

Table 1.1. Report %26 Process
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |                                        Valores (Padrão)                                         |     Chave restritiva     |                                             Regra de validação                                              |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :----------------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------: | :----------------------: | :---------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Chave do Fluxo de Trabalho   |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |                   Key of the Workflow to start                   |                                                                                                                                                                                                     |
|            Processo            |                ID                 |                                                                                                 |                          |                                                                                                             |                        Process or Report                         |                                                               The Process field identifies a unique Process or Report in the system.                                                                |
|            Empresa             |           Tabela Direta           |                                      (@\#AD\_Client\_ID@)                                       |                          |                                      AD\_Client.AD\_Client\_ID \< \> 0                                      |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|          Organização           |           Tabela Direta           |                                        (@\#AD\_Org\_ID@)                                        |                          |                              (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                               |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|         Chave de Busca         |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|              Nome              |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|           Descrição            |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|        Comentário/Ajuda        | Texto Médio (até 2000 caracteres) |                                                                                                 |                          |                                                                                                             |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|             Ativo              |              Sim-Não              |                                               (Y)                                               |                          |                                                                                                             |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|      Funcionalidade Beta       |              Sim-Não              |                                                                                                 |                          |                                                                                                             |              This functionality is considered Beta               |                                                                        Beta functionality is not fully tested or completed.                                                                         |
|        Tipo de Entidade        |              Tabela               |      \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)       |    entityt\_adprocess    |                       <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D                        | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|    Nível de Acesso de Dados    |               Lista               | Organização Somente Cliente Empresa+Organização Somente Sistema Sistema+Cliente (Empresa) Todos |                          |                                                                                                             |                      Access Level required                       |                                                                   Indicates the access level required for this record or process.                                                                   |
|           Relatório            |              Sim-Não              |                                                                                                 |                          |                                                                                                             |                    Indicates a Report record                     |                                                         The Report checkbox indicates that this record is a report as opposed to a process                                                          |
|     Processar no Servidor      |              Sim-Não              |                                                                                                 |                          |                                                                                                             |                 Run this Process on Server only                  |                                             Enabling this flag disables to run the process on the client. This potentially decreases the availability.                                              |
|           Classname            |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |                          Java Classname                          |                                                             The Classname identifies the Java classname used by this report or process.                                                             |
|          Procedimento          |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |                  Name of the Database Procedure                  |                                                    The Procedure indicates the name of the database procedure called by this report or process.                                                     |
|       Fluxo de Trabalho        |           Tabela Direta           |                                                                                                 |  adworkflow\_adprocess   |                                   AD\_Workflow.AD\_Table\_ID IS NOT NULL                                    |                 Workflow or combination of tasks                 |                                                                   The Workflow field identifies a unique Workflow in the system.                                                                    |
|      Formulário Especial       |           Tabela Direta           |                                                                                                 |    adform\_adprocess     |                                                                                                             |                           Special Form                           |                                                               The Special Form field identifies a unique Special Form in the system.                                                                |
|   Visualização de Relatório    |           Tabela Direta           |                                                                                                 | adreportview\_adprocess  |                                                                                                             |                View used to generate this report                 |                                                                  The Report View indicates the view used to generate this report.                                                                   |
|        Impressão Direta        |              Sim-Não              |                                                                                                 |                          |                                                                                                             |                       Print without dialog                       |                                             The Direct Print checkbox indicates that this report will print without a print dialog box being displayed.                                             |
|      Formato de Impressão      |           Tabela Direta           |                                                                                                 | adprintformat\_adprocess |                                                                                                             |                        Data Print Format                         |                                                                     The print format determines how data is rendered for print.                                                                     |
|        Mostrar a Ajuda         |               Lista               |      Ask user (for future use) Don't show help Run silently - Take Defaults Show Help (Y)       |                          |                                                                                                             |                                                                  |                                                                                                                                                                                                     |
|      Contagem Estatística      |              Inteiro              |                                                                                                 |                          |                                                                                                             |        Internal statistics how often the entity was used         |                                                                                          For internal use.                                                                                          |
|    Segundos de Estatística     |              Inteiro              |                                                                                                 |                          |                                                                                                             |       Internal statistics how many seconds a process took        |                                                                                          For internal use                                                                                           |
|         Jasper Report          |       Texto Curto (String)        |                                                                                                 |                          |                                                                                                             |                                                                  |                                                                                                                                                                                                     |
|       Ajuda de Contexto        |           Tabela Direta           |                                                                                                 |   adctxhelp\_adprocess   | AD\_CtxHelp\_ID IN (SELECT AD\_CtxHelp\_ID FROM AD\_CtxHelp WHERE CtxType IS NULL OR CtxType IN ('A', 'P')) |                                                                  |                                                                                                                                                                                                     |
| Copiar do Relatório e Processo |               Botão               |                                                                                                 |                          |                                                                                                             |      Copy settings from one report and process to another.       |                                   Copy the settings from the selected report and process to the current one. This overwrites existing settings and translations.                                    |

</div>

</div>

  

<div id="d196161e454" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parâmetro - AD\_Process\_Para

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_Para_data)

<span class="emphasis">*Descrição:*</span> Parâmetro de Relatório

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Parâmetro de
Relatório" defines quaisquer parâmetros necessários para executar um
relatório ou processo.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d196161e471" class="table">

<div class="table-title">

Table 1.2. Parameter
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             |                                                 Valores (Padrão)                                                  |       Chave restritiva       |                                     Regra de validação                                      |                                      Descrição                                      |                                                                                                                                                                                                                                                                                                                                                                                                    Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                                                                    |
| :-----------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------------------------: | :--------------------------: | :-----------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   AD\_Process\_Para\_UU   |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|   Parâmetro de Processo   |                ID                 |                                                                                                                   |                              |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|          Empresa          |           Tabela Direta           |                                                (@AD\_Client\_ID@)                                                 |                              |                              AD\_Client.AD\_Client\_ID \< \> 0                              |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|        Organização        |           Tabela Direta           |                                                  (@AD\_Org\_ID@)                                                  |                              |                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                       |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|         Processo          |           Tabela Direta           |                                                                                                                   |   adprocess\_adprocesspara   |                                                                                             |                                  Process or Report                                  |                                                                                                                                                                                                                                                                                                                                                                         The Process field identifies a unique Process or Report in the system.                                                                                                                                                                                                                                                                                                                                                                         |
|           Nome            |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                        Alphanumeric identifier of the entity                        |                                                                                                                                                                                                                                                                                                                                      The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                                                                                                                                                      |
|         Descrição         |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                      Optional short description of the record                       |                                                                                                                                                                                                                                                                                                                                                                                      A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                                                                       |
|     Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                                                                                                                   |                              |                                                                                             |                                   Comment or Hint                                   |                                                                                                                                                                                                                                                                                                                                                                      The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                                                                                                                                                                                                                                       |
|        Placeholder        |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|           Ativo           |              Sim-Não              |                                                        (Y)                                                        |                              |                                                                                             |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
| Mantido Centralizadamente |              Sim-Não              |                                                        (Y)                                                        |                              |                                                                                             |                   Information maintained in System Element table                    |                                                                                                                                                                                                                                                                                                                                         The Centrally Maintained checkbox indicates if the Name, Description and Help maintained in 'System Element' table or 'Window' table.                                                                                                                                                                                                                                                                                                                                          |
|         Seqüência         |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_Process\_Para WHERE AD\_Process\_ID=@AD\_Process\_ID@) |                              |                                                                                             |                Method of ordering records; lowest number comes first                |                                                                                                                                                                                                                                                                                                                                                                                      The Sequence indicates the order of records                                                                                                                                                                                                                                                                                                                                                                                       |
|     Tipo de Entidade      |              Tabela               |               \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)                |    entityt\_adprocesspara    |               <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D                |          Dictionary Entity Type; Determines ownership and synchronization           |                                                                                                                                                                                                                                                                                                          The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!                                                                                                                                                                                                                                                                                                           |
|     Nome da Coluna BD     |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                         Name of the column in the database                          |                                                                                                                                                                                                                                                                                                                                                                 The Column Name indicates the name of a column on a table as defined in the database.                                                                                                                                                                                                                                                                                                                                                                  |
|    Elemento do Sistema    |             Procurar              |                                                                                                                   |   adelement\_adprocesspara   |                                                                                             |   System Element enables the central maintenance of column description and help.    |                                                                                                                                                                                                                                                                                                                                                   The System Element allows for the central maintenance of help, descriptions and terminology for a database column.                                                                                                                                                                                                                                                                                                                                                   |
|        Referência         |              Tabela               |                                             AD\_Reference Data Types                                              |  adreference\_adprocesspara  |                                                                                             |                           System Reference and Validation                           |                                                                                                                                                                                                                                                                                                                                                                            The Reference could be a display type, list or table validation.                                                                                                                                                                                                                                                                                                                                                                            |
|    Chave de Referência    |              Tabela               |                                               AD\_Reference Values                                                | adreferencevalue\_adprocpara | AD\_Reference.ValidationType=CASE WHEN @AD\_Reference\_ID@ IN (17,28) THEN 'L' ELSE 'T' END |                 Required to specify, if data type is Table or List                  |                                                                                                                                                                                                                                                                                                                                              The Reference Value indicates where the reference values are stored. It must be specified if the data type is Table or List.                                                                                                                                                                                                                                                                                                                                              |
|     Formato do Valor      |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             | Format of the value; Can contain fixed format elements, Variables: "\_lLoOaAcCa09"  |                                                                                                                                               \< B\> Validation elements:\< /B\> (Space) any character \_ Space (fixed character) l any Letter a..Z NO space L any Letter a..Z NO space converted to upper case o any Letter a..Z or space O any Letter a..Z or space converted to upper case a any Letters %26 Digits NO space A any Letters %26 Digits NO space converted to upper case c any Letters %26 Digits or space C any Letters %26 Digits or space converted to upper case 0 Digits 0..9 NO space 9 Digits 0..9 or space Example of format "(000)\_000-0000"                                                                                                                                                |
|    Validação Dinâmica     |           Tabela Direta           |                                                                                                                   |  advalrule\_ad\_processpara  |                                                                                             |                               Dynamic Validation Rule                               |                                                                                                                                                                                                                                                                                                                                               These rules define how an entry is determined to valid. You can use variables for dynamic (context sensitive) validation.                                                                                                                                                                                                                                                                                                                                                |
|        Comprimento        |              Inteiro              |                                                                                                                   |                              |                                                                                             |                        Length of the column in the database                         |                                                                                                                                                                                                                                                                                                                                                                        The Length indicates the length of a column as defined in the database.                                                                                                                                                                                                                                                                                                                                                                         |
|       Criptografado       |              Sim-Não              |                                                        (N)                                                        |                              |                                                                                             |                           Display or Storage is encrypted                           |                                                                                                                                                                                                                      Display encryption (in Window/Tab/Field) - all characters are displayed as '\*' - in the database it is stored in clear text. You will not be able to report on these columns. Data storage encryption (in Table/Column) - data is stored encrypted in the database (dangerous\!) and you will not be able to report on those columns. Independent from Display encryption.                                                                                                                                                                                                                       |
|        Obrigatório        |              Sim-Não              |                                                                                                                   |                              |                                                                                             |                        Data entry is required in this column                        |                                                                                                                                                                                                                                                                                                                                                                        The field must have a value for the record to be saved to the database.                                                                                                                                                                                                                                                                                                                                                                         |
|           Faixa           |              Sim-Não              |                                                                                                                   |                              |                                                                                             |                         The parameter is a range of values                          |                                                                                                                                                                                                                                                                                                                                                                         The Range checkbox indicates that this parameter is a range of values.                                                                                                                                                                                                                                                                                                                                                                         |
|    É Múltipla Escolha     |              Sim-Não              |                                                        (Y)                                                        |                              |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|       Placeholder2        |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|       Lógica Padrão       |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                       Default value hierarchy, separated by ;                       | The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. \#Date, \#AD\_Org\_ID, \#AD\_Client\_ID - Accounting Schema: e.g. $C\_AcctSchema\_ID, $C\_Calendar\_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables. There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined. Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons. |
|      Lógica Padrão 2      |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                       Default value hierarchy, separated by ;                       | The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. \#Date, \#AD\_Org\_ID, \#AD\_Client\_ID - Accounting Schema: e.g. $C\_AcctSchema\_ID, $C\_Calendar\_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables. There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined. Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons. |
|        Mín. Valor         |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                              Minimum Value for a field                              |                                                                                                                                                                                                                                                                                                                                                                          The Minimum Value indicates the lowest allowable value for a field.                                                                                                                                                                                                                                                                                                                                                                           |
|        Máx. Valor         |       Texto Curto (String)        |                                                                                                                   |                              |                                                                                             |                              Maximum Value for a field                              |                                                                                                                                                                                                                                                                                                                                                                          The Maximum Value indicates the highest allowable value for a field                                                                                                                                                                                                                                                                                                                                                                           |
| Lógica Somente de Leitura | Texto Médio (até 2000 caracteres) |                                                                                                                   |                              |                                                                                             |  Logic to determine if field is read only (applies only when field is read-write)   |                                                                                                                                       format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional)                                                                                                                                        |
|  Lógica de Visualização   | Texto Médio (até 2000 caracteres) |                                                                                                                   |                              |                                                                                             | If the Field is displayed, the result determines if the field is actually displayed |                                                                                                                                       format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional)                                                                                                                                        |
|   Lógica de Obrigatório   | Texto Médio (até 2000 caracteres) |                                                                                                                   |                              |                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |

</div>

</div>

  

<div id="d196161e960" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução de Parâmetro - AD\_Process\_Para\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_Para_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d196161e973" class="table">

<div class="table-title">

Table 1.3. Parameter Translation
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             |  Valores (Padrão)  |       Chave restritiva       |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------------: | :-------------------------------: | :----------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| AD\_Process\_Para\_Trl\_UU |       Texto Curto (String)        |                    |                              |                                                  |                                          |                                                                                                                                              |
|          Empresa           |           Tabela Direta           | (@AD\_Client\_ID@) |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Organização         |           Tabela Direta           |  (@AD\_Org\_ID@)   |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Parâmetro de Processo    |           Tabela Direta           |                    |  adprocpara\_adprocparatrl   |                                                  |                                          |                                                                                                                                              |
|           Idioma           |              Tabela               |    AD\_Language    | adlanguage\_adprocessparatrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|           Ativo            |              Sim-Não              |        (Y)         |                              |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Traduzida          |              Sim-Não              |                    |                              |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|            Nome            |       Texto Curto (String)        |                    |                              |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição          |       Texto Curto (String)        |                    |                              |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|      Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                    |                              |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|        Placeholder         |       Texto Curto (String)        |                    |                              |                                                  |                                          |                                                                                                                                              |
|        Placeholder2        |       Texto Curto (String)        |                    |                              |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d196161e1173" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tradução de Relatório - AD\_Process\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d196161e1186" class="table">

<div class="table-title">

Table 1.4. Report Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |  Valores (Padrão)  |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :-------------------------------: | :----------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |           Tabela Direta           | (@AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |           Tabela Direta           |  (@AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Processo       |           Tabela Direta           |                    | ad\_process\_ad\_process\_trl  |                                                  |            Process or Report             |                                    The Process field identifies a unique Process or Report in the system.                                    |
|        Idioma        |              Tabela               |    AD\_Language    | ad\_language\_ad\_process\_trl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo         |              Sim-Não              |        (Y)         |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Traduzida       |              Sim-Não              |                    |                                |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|         Nome         |       Texto Curto (String)        |                    |                                |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       |       Texto Curto (String)        |                    |                                |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                    |                                |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| AD\_Process\_Trl\_UU |       Texto Curto (String)        |                    |                                |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d196161e1358" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Acesso a Relatórios - AD\_Process\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Relatórios

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Relatórios" determina quem pode acessar um relatório ou processo

<span class="emphasis">*Coluna linkada:* </span> Process

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d196161e1379" class="table">

<div class="table-title">

Table 1.5. Report Access
Fields

</div>

<div class="table-contents">

|   Nome do campo   |  Referência   |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :---------------: | :-----------: | :----------------: | :------------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|      Empresa      | Tabela Direta | (@AD\_Client\_ID@) | ad\_processaccess\_client  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Organização    | Tabela Direta |  (@AD\_Org\_ID@)   |  ad\_processtaccess\_org   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|     Processo      | Tabela Direta |                    | adprocess\_adprocessaccess |                                                  |         Process or Report          |          The Process field identifies a unique Process or Report in the system.           |
|      Perfil       | Tabela Direta |                    |  adrole\_adprocessaccess   |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|       Ativo       |    Sim-Não    |        (Y)         |                            |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Escrita e Leitura |    Sim-Não    |                    |                            |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

</div>
