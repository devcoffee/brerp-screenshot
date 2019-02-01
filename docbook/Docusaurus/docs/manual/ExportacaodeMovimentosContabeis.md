---
title: "Exportação de Movimentos Contábeis"
id: ExportacaodeMovimentosContabeis
---
<div id="d93424e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Exportação de Movimentos Contábeis

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Configuração de Exportação de
    Movimentos Contábeis - COF\_ConfigExportContab](#d93424e22)</span>
  - <span class="section">[2. Tabela: Contas para Exportar -
    COF\_ConfigExportContabContas](#d93424e247)</span>
  - <span class="section">[3. Tabela: Centros de Custo para Exportar -
    COF\_ConfigExportContabCustos](#d93424e385)</span>
  - <span class="section">[4. Tabela: Exceções para Exportação Contábil
    - COF\_ConfigExportContabExcecoes](#d93424e521)</span>
  - <span class="section">[5. Tabela: Formatação -
    COF\_ConfigExportContabFormato](#d93424e657)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-05-26 13:31:48.0

<span class="emphasis">*Atualizado em:* </span>2017-05-26
13:31:48.0

<div id="d93424e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Configuração de Exportação de Movimentos Contábeis - COF\_ConfigExportContab

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ConfigExportContab_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d93424e31" class="table">

<div class="table-title">

Table 1.1. Configuração de Exportação de Movimentos Contábeis
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |      Referência      |        Valores (Padrão)        |        Chave restritiva         |                Regra de validação                |                            Descrição                             |                                             Comentário/Ajuda                                              |
| :------------------------------------------------: | :------------------: | :----------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
| Configuração de Exportação de Movimentos Contábeis |          ID          |                                |                                 |                                                  | Primary Key : Configuração de Exportação de Movimentos Contabeis |                     Primary Key : Configuração de Exportação de Movimentos Contabeis                      |
|            COF\_ConfigExportContab\_UU             | Texto Curto (String) |                                |                                 |                                                  |                                                                  |                                                                                                           |
|                      Empresa                       |    Tabela Direta     |      (@\#AD\_Client\_ID@)      |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |
|                    Organização                     |    Tabela Direta     |       (@\#AD\_Org\_ID@)        |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |
|                   Chave de Busca                   | Texto Curto (String) |                                |                                 |                                                  |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |
|                       Ativo                        |       Sim-Não        |              (Y)               |                                 |                                                  |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |
|                     Descrição                      | Texto Curto (String) |                                |                                 |                                                  |             Optional short description of the record             |                                A description is limited to 255 characters.                                |
|             Elemento de Conta Contábil             |    Tabela Direta     |                                | CElement\_COFConfigExportContab |                                                  |                        Accounting Element                        | The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts. |
|            Elemento de Centro de Custo             |        Tabela        |           C\_Element           | COFElementRef\_COFConfigExportC |                                                  |                                                                  |                                                                                                           |
|                 Formato do Arquivo                 |        Lista         |    ISO 8859-1 UTF-8 (UTF-8)    |                                 |                                                  |                                                                  |                                                                                                           |
|           Exportar Movimentos Contábeis            |        Botão         |                                |                                 |                                                  |                                                                  |                                                                                                           |
|                  Tipo do Arquivo                   |        Lista         | Posicções Fixas Separador (PF) |                                 |                                                  |                                                                  |                                                                                                           |
|                 Caracter Separador                 | Texto Curto (String) |                                |                                 |                                                  |                                                                  |                                                                                                           |

</div>

</div>

  

<div id="d93424e247" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Contas para Exportar - COF\_ConfigExportContabContas

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ConfigExportContabContas_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d93424e256" class="table">

<div class="table-title">

Table 1.2. Contas para Exportar
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                 |                            Descrição                             |                         Comentário/Ajuda                         |
| :------------------------------------------------: | :------------------: | :------------------: | :-----------------------------: | :-----------------------------------------------: | :--------------------------------------------------------------: | :--------------------------------------------------------------: |
|         COF\_ConfigExportContabContas\_ID          |          ID          |                      |                                 |                                                   |   Primary Key : Contas da Configuração de Exportação Contábil    |   Primary Key : Contas da Configuração de Exportação Contábil    |
|                      Empresa                       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |         AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |
|                    Organização                     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)  |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |
| Configuração de Exportação de Movimentos Contábeis |    Tabela Direta     |                      | COFConfigExportContab\_COFConfi |                                                   | Primary Key : Configuração de Exportação de Movimentos Contabeis | Primary Key : Configuração de Exportação de Movimentos Contabeis |
|                 Elemento de Contas                 |    Tabela Direta     |                      | CElementValue\_COFConfigExportC | C\_ElementValue.C\_Element\_ID=@0|C\_Element\_ID@ |                         Account Element                          | Account Elements can be natural accounts or user defined values. |
|                   Chave de Busca                   | Texto Curto (String) |                      |                                 |                                                   |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |
|                       Ativo                        |       Sim-Não        |         (Y)          |                                 |                                                   |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |

</div>

</div>

  

<div id="d93424e385" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Centros de Custo para Exportar - COF\_ConfigExportContabCustos

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d93424e392" class="table">

<div class="table-title">

Table 1.3. Centros de Custo para Exportar
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                   Regra de validação                   |                            Descrição                             |                         Comentário/Ajuda                         |
| :------------------------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------------: | :--------------------------------------------------------------: | :--------------------------------------------------------------: |
|    Conta de Configuração de Exportação Contábil    |          ID          |                      |                                 |                                                        |   Primary Key : Custos da Configuração de Exportação Contábil    |   Primary Key : Custos da Configuração de Exportação Contábil    |
|                      Empresa                       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |           AD\_Client.AD\_Client\_ID \< \> 0            |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |
|                    Organização                     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)    |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |
| Configuração de Exportação de Movimentos Contábeis |    Tabela Direta     |                      | COFConfigExportContab\_COFConfi |                                                        | Primary Key : Configuração de Exportação de Movimentos Contabeis | Primary Key : Configuração de Exportação de Movimentos Contabeis |
|                 Elemento de Contas                 |    Tabela Direta     |                      | CElementValue\_COFConfigExportC | C\_ElementValue.C\_Element\_ID=@0|COF\_ElementRef\_ID@ |                         Account Element                          | Account Elements can be natural accounts or user defined values. |
|                   Chave de Busca                   | Texto Curto (String) |                      |                                 |                                                        |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |
|                       Ativo                        |       Sim-Não        |         (Y)          |                                 |                                                        |                (semelhante ao primeiro relatório)                |                       (ver o mesmo acima)                        |

</div>

</div>

  

<div id="d93424e521" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Exceções para Exportação Contábil - COF\_ConfigExportContabExcecoes

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d93424e528" class="table">

<div class="table-title">

Table 1.4. Exceções para Exportação Contábil
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                            Descrição                             |                                             Comentário/Ajuda                                              |
| :------------------------------------------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
|   Exceção de Configuração de Exportação Contábil   |      ID       |                      |                                 |                                                  |  Primary Key : Excecões da Configuração de Exportação Contábil   |                       Primary Key : Excecões da Configuração de Exportação Contábil                       |
|                      Empresa                       | Tabela Direta | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |
|                    Organização                     | Tabela Direta |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |
| Configuração de Exportação de Movimentos Contábeis | Tabela Direta |                      | COFConfigExportContab\_COFConfi |                                                  | Primary Key : Configuração de Exportação de Movimentos Contabeis |                     Primary Key : Configuração de Exportação de Movimentos Contabeis                      |
|                      Elemento                      | Tabela Direta |                      | CElement\_COFConfigExportContab |                                                  |                        Accounting Element                        | The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts. |
|                 Elemento de Contas                 | Tabela Direta |                      | CElementValue\_COFConfigExportC | C\_ElementValue.C\_Element\_ID=@C\_Element\_ID@  |                         Account Element                          |                     Account Elements can be natural accounts or user defined values.                      |
|                       Ativo                        |    Sim-Não    |         (Y)          |                                 |                                                  |                (semelhante ao primeiro relatório)                |                                            (ver o mesmo acima)                                            |

</div>

</div>

  

<div id="d93424e657" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Formatação - COF\_ConfigExportContabFormato

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ConfigExportContabFormato_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d93424e666" class="table">

<div class="table-title">

Table 1.5. Formatação
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |      Referência      |                                                                       Valores (Padrão)                                                                       |        Chave restritiva         |                Regra de validação                |                            Descrição                             |                                                                                                                                                                                                                                                                                                                                                                                                    Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                                                                    |
| :------------------------------------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          COF\_ConfigExportContabForma\_UU          | Texto Curto (String) |                                                                                                                                                              |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|         COF\_ConfigExportContabFormato\_ID         |          ID          |                                                                                                                                                              |                                 |                                                  |    Primary Key : Formatação das Linhas da Exportação Contábil    |                                                                                                                                                                                                                                                                                                                                                                               Primary Key : Formatação das Linhas da Exportação Contábil                                                                                                                                                                                                                                                                                                                                                                               |
|                      Empresa                       |    Tabela Direta     |                                                                     (@\#AD\_Client\_ID@)                                                                     |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|                    Organização                     |    Tabela Direta     |                                                                      (@0|AD\_Org\_ID@)                                                                       |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
| Configuração de Exportação de Movimentos Contábeis |    Tabela Direta     |                                                                                                                                                              | COFConfigExportContab\_COFConfi |                                                  | Primary Key : Configuração de Exportação de Movimentos Contabeis |                                                                                                                                                                                                                                                                                                                                                                            Primary Key : Configuração de Exportação de Movimentos Contabeis                                                                                                                                                                                                                                                                                                                                                                            |
|                       Linha                        |       Inteiro        | (@SQL=SELECT COALESCE(MAX(LineNo),0)+10 AS DefaultValue FROM COF\_ConfigExportContabFormato WHERE COF\_ConfigExportContab\_ID=@COF\_ConfigExportContab\_ID@) |                                 |                                                  |                             Line No                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                       Ativo                        |       Sim-Não        |                                                                             (Y)                                                                              |                                 |                                                  |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                                                                                                                                                                                                                                  (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                                                                   |
|                    Núm. Inicial                    |       Inteiro        |                                                                             (0)                                                                              |                                 |                                                  |                     Starting number/position                     |                                                                                                                                                                                                                                                                                                                                                                The Start Number indicates the starting position in the line or field number in the line                                                                                                                                                                                                                                                                                                                                                                |
|                     Núm.Final                      |       Inteiro        |                                                                             (0)                                                                              |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                  Preencher Quando                  |        Lista         |                                                                  Ambos Crédito Débito (AM)                                                                   |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                       Campo                        |    Tabela Direta     |                                                                                                                                                              | ADField\_COFConfigExportContabF |            AD\_Field.AD\_Tab\_ID=242             |                    Field on a database table                     |                                                                                                                                                                                                                                                                                                                                                                                   The Field identifies a field on a database table.                                                                                                                                                                                                                                                                                                                                                                                    |
|                    COF\_Campos                     |        Lista         |                                                                Chave de Busca + Nome ID Nome                                                                 |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                   Tipo de Dados                    |        Lista         |                                                   Constante Data Número Somente Números Fim de Linha Texto                                                   |                                 |                                                  |                           Type of data                           |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                Caractere Separador                 | Texto Curto (String) |                                                                                                                                                              |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|              Tipo de Quebra de Linha               |        Lista         |                                                                        DOS UNIX (DO)                                                                         |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                 Alinhar à Esquerda                 |       Sim-Não        |                                                                            ('N')                                                                             |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                   Remove Special                   |       Sim-Não        |                                                                             (N)                                                                              |                                 |                                                  |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                  Formato de Data                   | Texto Curto (String) |                                                                                                                                                              |                                 |                                                  |               Date format used in the input format               |                                                                                                                                                                                                                                                                                                                                                                         The date format is usually detected, but sometimes need to be defined.                                                                                                                                                                                                                                                                                                                                                                         |
|                   Padrão Decimal                   | Texto Curto (String) |                                                                                                                                                              |                                 |                                                  |                       Java Decimal Pattern                       |                                                                                                                                                                                                                                                                                                                                                                     Option Decimal pattern in Java notation. Examples: 0000 will format 23 to 0023                                                                                                                                                                                                                                                                                                                                                                     |
|                   Lógica Padrão                    | Texto Curto (String) |                                                                                                                                                              |                                 |                                                  |             Default value hierarchy, separated by ;              | The defaults are evaluated in the order of definition, the first not null value becomes the default value of the column. The values are separated by comma or semicolon. a) Literals:. 'Text' or 123 b) Variables - in format @Variable@ - Login e.g. \#Date, \#AD\_Org\_ID, \#AD\_Client\_ID - Accounting Schema: e.g. $C\_AcctSchema\_ID, $C\_Calendar\_ID - Global defaults: e.g. DateFormat - Window values (all Picks, CheckBoxes, RadioButtons, and DateDoc/DateAcct) c) SQL code with the tag: @SQL=SELECT something AS DefaultValue FROM ... The SQL statement can contain variables. There can be no other value other than the SQL statement. The default is only evaluated, if no user preference is defined. Default definitions are ignored for record columns as Key, Parent, Client as well as Buttons. |

</div>

</div>

  

</div>
