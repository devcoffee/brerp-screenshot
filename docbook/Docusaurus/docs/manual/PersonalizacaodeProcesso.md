---
title: "Personalização de Processo"
id: PersonalizacaodeProcesso
---
<div id="d174696e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Personalização de Processo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Personalização de Processo -
    AD\_UserDef\_Proc](#d174696e23)</span>
  - <span class="section">[2. Tabela: Personalização de Parâmetro -
    AD\_UserDef\_Proc\_Parameter](#d174696e240)</span>

</div>

<span class="emphasis">*Descrição:* </span> Personalização de Processo

<span class="emphasis">*Comentário/Ajuda:* </span>Personalização de
Processo

<span class="emphasis"> *Criado em:* </span>2017-11-24 11:10:39.0

<span class="emphasis">*Atualizado em:* </span>2017-11-24 11:10:39.0

![](/img/manual/PersonalizacaodeProcesso.png)

<div id="d174696e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Personalização de Processo - AD\_UserDef\_Proc

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_UserDef_Proc_data)

<span class="emphasis">*Descrição:*</span> Personalização de Processo

<span class="emphasis">*Comentário/Ajuda:* </span> Personalização de
Processo

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d174696e40" class="table">

<div class="table-title">

Table 1.1. User defined Process
Fields

</div>

<div class="table-contents">

|        Nome do campo         |            Referência             |   Valores (Padrão)   |     Chave restritiva      |                Regra de validação                |                           Descrição                           |                                                               Comentário/Ajuda                                                               |
| :--------------------------: | :-------------------------------: | :------------------: | :-----------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    AD\_UserDef\_Proc\_UU     |       Texto Curto (String)        |                      |                           |                                                  |                                                               |                                                                                                                                              |
| Janela definida pelo Usuário |                ID                 |                      |                           |                                                  |              Primary Key : User defined Process               |                                                      Primary Key : User defined Process                                                      |
|           Empresa            |           Tabela Direta           | (@\#AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|         Organização          |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|            Perfil            |           Tabela Direta           |                      |   ADRole\_ADUserDefProc   |                                                  |                      Responsibility Role                      |                          The Role determines security and access a user who has this Role will have in the System.                           |
|       Usuário/Contato        |           Tabela Direta           |                      |   ADUser\_ADUserDefProc   |                                                  | User within the system - Internal or Business Partner Contact |                The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|           Processo           |           Tabela Direta           |                      | ADProcess\_ADUserDefProc  |                                                  |                       Process or Report                       |                                    The Process field identifies a unique Process or Report in the system.                                    |
|            Ativo             |              Sim-Não              |         (Y)          |                           |                                                  |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|             Nome             |       Texto Curto (String)        |                      |                           |                                                  |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição           |       Texto Curto (String)        |                      |                           |                                                  |           Optional short description of the record            |                                                 A description is limited to 255 characters.                                                  |
|       Comentário/Ajuda       | Texto Médio (até 2000 caracteres) |                      |                           |                                                  |                        Comment or Hint                        |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|            Idioma            |              Tabela               |     AD\_Language     | ADLanguage\_ADUserDefProc |                                                  |                   Language for this entity                    |                                    The Language identifies the language to use for display and formatting                                    |

</div>

</div>

  

<div id="d174696e240" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Personalização de Parâmetro - AD\_UserDef\_Proc\_Parameter

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_UserDef_Proc_Parameter_data)

<span class="emphasis">*Descrição:*</span> Personalização de Parâmetro

<span class="emphasis">*Comentário/Ajuda:* </span> Personalização de
Parâmetro

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d174696e257" class="table">

<div class="table-title">

Table 1.2. User defined Process Parameter
Fields

</div>

<div class="table-contents">

|          Nome do campo           |            Referência             |   Valores (Padrão)   |        Chave restritiva         |                                                                                     Regra de validação                                                                                      |                                      Descrição                                      |                                                                                                                                                                                                                                                                                                                                                                                                    Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                                                                    |
| :------------------------------: | :-------------------------------: | :------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| AD\_UserDef\_Proc\_Parameter\_UU |       Texto Curto (String)        |                      |                                 |                                                                                                                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| Parâmetro definido pelo Usuário  |                ID                 |                      |                                 |                                                                                                                                                                                             |                    Primary Key : User defined Process Parameter                     |                                                                                                                                                                                                                                                                                                                                                                                      Primary Key : User defined Process Parameter                                                                                                                                                                                                                                                                                                                                                                                      |
|             Empresa              |           Tabela Direta           | (@\#AD\_Client\_ID@) |                                 |                                                                              AD\_Client.AD\_Client\_ID \< \> 0                                                                              |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|           Organização            |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                                 |                                                                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                       |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|   Janela definida pelo Usuário   |           Tabela Direta           |                      | ADUserDefProc\_ADUserDefProcPar |                                                                                                                                                                                             |                         Primary Key : User defined Process                          |                                                                                                                                                                                                                                                                                                                                                                                           Primary Key : User defined Process                                                                                                                                                                                                                                                                                                                                                                                           |
|              Ativo               |              Sim-Não              |         (Y)          |                                 |                                                                                                                                                                                             |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|               Nome               |       Texto Curto (String)        |                      |                                 |                                                                                                                                                                                             |                        Alphanumeric identifier of the entity                        |                                                                                                                                                                                                                                                                                                                                      The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                                                                                                                                                      |
|      Parâmetro de Processo       |           Tabela Direta           |                      | ADProcessPara\_ADUserDefProcPar | AD\_Process\_Para.AD\_Process\_ID=@AD\_Process\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Window\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0 | @AD\_Workflow\_ID@\> 0 |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|            Descrição             |       Texto Curto (String)        |                      |                                 |                                                                                                                                                                                             |                      Optional short description of the record                       |                                                                                                                                                                                                                                                                                                                                                                                      A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                                                                       |
|         Comentário/Ajuda         | Texto Médio (até 2000 caracteres) |                      |                                 |                                                                                                                                                                                             |                                   Comment or Hint                                   |                                                                                                                                                                                                                                                                                                                                                                      The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                                                                                                                                                                                                                                       |
|    Lógica Somente de Leitura     | Texto Médio (até 2000 caracteres) |                      |                                 |                                                                                                                                                                                             |  Logic to determine if field is read only (applies only when field is read-write)   |                                                                                                                                       format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional)                                                                                                                                        |
|          Lógica Padrão           |       Texto Curto (String)        |                      |                                 |                                                                                                                                                                                             |                       Default value hierarchy, separated by ;                       | The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. \#Date, \#AD\_Org\_ID, \#AD\_Client\_ID - Accounting Schema: e.g. $C\_AcctSchema\_ID, $C\_Calendar\_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables. There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined. Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons. |
|      Lógica de Obrigatório       | Texto Médio (até 2000 caracteres) |                      |                                 |                                                                                                                                                                                             |                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|      Lógica de Visualização      | Texto Médio (até 2000 caracteres) |                      |                                 |                                                                                                                                                                                             | If the Field is displayed, the result determines if the field is actually displayed |                                                                                                                                       format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional)                                                                                                                                        |
|             Mostrado             |              Sim-Não              |         (Y)          |                                 |                                                                                                                                                                                             |                       Determines, if this field is displayed                        |                                                                                                                                                                                                                                                                                                                                                       If the field is displayed, the field Display Logic will determine at runtime, if it is actually displayed                                                                                                                                                                                                                                                                                                                                                        |

</div>

</div>

  

</div>
