---
title: "Formato do Carregador de Importação"
id: FormatodoCarregadordeImportacao
---
<div id="d107973e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Formato do Carregador de Importação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Formato de Importação -
    AD\_ImpFormat](#d107973e23)</span>
  - <span class="section">[2. Tabela: Campo de Formato -
    AD\_ImpFormat\_Row](#d107973e218)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Formatos
do Carregador de Importação

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Formato do
Carregador de Importação" é usada para definir o layout do arquivo de
informação de produto que será importado.

<span class="emphasis"> *Criado em:* </span>2000-09-15 14:54:13.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/FormatodoCarregadordeImportacao.png)

<div id="d107973e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Formato de Importação - AD\_ImpFormat

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ImpFormat_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d107973e32" class="table">

<div class="table-title">

Table 1.1. Import Format
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |                                  Valores (Padrão)                                   |   Chave restritiva   |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :---------------------------------------------------------------------------------: | :------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Formato de Importação |          ID          |                                                                                     |                      |                                                  |                                          |                                                                                                                                              |
|        Empresa        |    Tabela Direta     |                                (@\#AD\_Client\_ID@)                                 |                      |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |                                  (@\#AD\_Org\_ID@)                                  |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome          | Texto Curto (String) |                                                                                     |                      |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       | Texto Curto (String) |                                                                                     |                      |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Ativo         |       Sim-Não        |                                         (Y)                                         |                      |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Tabela         |    Tabela Direta     |                                                                                     | adtable\_adimpformat |  AD\_Table.TableName LIKE 'I\#\_%' ESCAPE '\#'   |        Database Table information        |                                     The Database Table provides the information of the table definition                                      |
|        Formato        |        Lista         | Separado por vírgula Posição Fixa Separado por Tabulações Custom Separator Char XML |                      |                                                  |            Format of the data            |         The Format is a drop down list box for selecting the format type (text, tab delimited, XML, etc) of the file to be imported          |
|  Caracter Separador   | Texto Curto (String) |                                                                                     |                      |                                                  |                                          |                                                                                                                                              |
|     Copiar Linhas     |        Botão         |                                                                                     |                      |                                                  |                                          |                                                                                                                                              |
|   AD\_ImpFormat\_UU   | Texto Curto (String) |                                                                                     |                      |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d107973e218" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Campo de Formato - AD\_ImpFormat\_Row

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ImpFormat_Row_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Campos de
Formato

<span class="emphasis">*Comentário/Ajuda:* </span> Define o campo
individual baseado na definição de tabela. Por favor, note que você tem
que garantir que uma Constante tenha o tipo de dados SQL correto (i.e.
se for uma 'seqüência de caracteres', você precisa colocar entre aspas
como 'estas'). \< p\> Mapeamento de Produto (para detalhes veja a
documentação): \< pre\> H\_Item =\> Valor H\_ItemDesc =\> Nome /
Descrição H\_ItemDefn =\> Ajuda H\_ItemType =\> ProductCategory
H\_PartnrID =\> Valor do Parceiro de Negócios H\_Commodity1 =\> Núm.
Produto do Fornecedor H\_Commodity2 =\> SKU H\_ItemClass =\>
Classificação (A,B,C..) V\_OperAmt\_T\_Cur =\> Moeda V\_OperAmt\_T =\>
Preço \< /pre\>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d107973e235" class="table">

<div class="table-title">

Table 1.2. Format Field
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |                                                    Valores (Padrão)                                                    |      Chave restritiva       |                                                         Regra de validação                                                          |                            Descrição                             |                                                                                                                                                                                                                                           Comentário/Ajuda                                                                                                                                                                                                                                            |
| :--------------------: | :-------------------------------: | :--------------------------------------------------------------------------------------------------------------------: | :-------------------------: | :---------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Formato do Campo    |                ID                 |                                                                                                                        |                             |                                                                                                                                     |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|        Empresa         |           Tabela Direta           |                                                   (@AD\_Client\_ID@)                                                   |                             |                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                  |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                                                                                          |
|      Organização       |           Tabela Direta           |                                                    (@AD\_Org\_ID@)                                                     |                             |                                          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                           |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                                                                                          |
| Formato de Importação  |           Tabela Direta           |                                                                                                                        | adimpformat\_adimpformatrow |                                                                                                                                     |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|       Seqüência        |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_ImpFormat\_Row WHERE AD\_ImpFormat\_ID=@AD\_ImpFormat\_ID@) |                             |                                                                                                                                     |      Method of ordering records; lowest number comes first       |                                                                                                                                                                                                                              The Sequence indicates the order of records                                                                                                                                                                                                                              |
|          Nome          |       Texto Curto (String)        |                                                                                                                        |                             |                                                                                                                                     |              Alphanumeric identifier of the entity               |                                                                                                                                                                             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                              |
|         Ativo          |              Sim-Não              |                                                          (Y)                                                           |                             |                                                                                                                                     |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                                                                                          |
|         Coluna         |           Tabela Direta           |                                                                                                                        |  adcolumn\_adimpformatrow   | AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@ AND AD\_Column.IsKey='N' AND AD\_Column.ColumnName NOT IN ('I\_IsImported', 'I\_ErrorMsg') |                       Column in the table                        |                                                                                                                                                                                                                               Link to the database column of the table                                                                                                                                                                                                                                |
|     Tipo de Dados      |               Lista               |                                              Constante Data Número Texto                                               |                             |                                                                                                                                     |                           Type of data                           |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|    Formato de Dados    |       Texto Curto (String)        |                                                                                                                        |                             |                                                                                                                                     |           Format String in Java Notation, e.g. ddMMyy            |                                                                                                                                                                                               The Date Format indicates how dates are defined on the record to be imported. It must be in Java Notation                                                                                                                                                                                               |
|      Núm. Inicial      |              Inteiro              |                                                                                                                        |                             |                                                                                                                                     |                     Starting number/position                     |                                                                                                                                                                                                       The Start Number indicates the starting position in the line or field number in the line                                                                                                                                                                                                        |
|       Núm.Final        |              Inteiro              |                                                                                                                        |                             |                                                                                                                                     |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|     Ponto Decimal      |       Texto Curto (String)        |                                                          (.)                                                           |                             |                                                                                                                                     |             Decimal Point in the data file - if any              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|    Dividir por 100     |              Sim-Não              |                                                                                                                        |                             |                                                                                                                                     |            Divide number by 100 to get correct amount            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|    Valor Constante     |       Texto Curto (String)        |                                                                                                                        |                             |                                                                                                                                     |                          Constant value                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|        Callout         |       Texto Curto (String)        |                                                                                                                        |                             |                                                                                                                                     | Fully qualified class names and method - separated by semicolons | A Callout allow you to create Java extensions to perform certain tasks always after a value changed. Callouts should not be used for validation but consequences of a user selecting a certain value. The callout is a Java class implementing org.compiere.model.Callout and a method name to call. Example: "org.compiere.model.CalloutRequest.copyText" instantiates the class "CalloutRequest" and calls the method "copyText". You can have multiple callouts by separating them via a semicolon |
|    Roteiro (Script)    | Texto Médio (até 2000 caracteres) |                                                                                                                        |                             |                                                                                                                                     |         Dynamic Java Language Script to calculate result         |                                                                                                                                                                                                                 Use Java language constructs to define the result of the calculation                                                                                                                                                                                                                  |
| AD\_ImpFormat\_Row\_UU |       Texto Curto (String)        |                                                                                                                        |                             |                                                                                                                                     |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |

</div>

</div>

  

</div>
