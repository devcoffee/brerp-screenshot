---
title: "Imprimir Etiqueta"
id: ImprimirEtiqueta
---
<div id="d120761e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Imprimir Etiqueta

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Etiqueta -
    AD\_PrintLabel](#d120761e23)</span>
  - <span class="section">[2. Tabela: Linha -
    AD\_PrintLabelLine](#d120761e251)</span>
  - <span class="section">[3. Tabela: Tradução -
    AD\_PrintLabelLine\_Trl](#d120761e494)</span>

</div>

<span class="emphasis">*Descrição:* </span> Formato de Impressão de
Etiqueta

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento de
Formatos para Imprimir Etiquetas

<span class="emphasis"> *Criado em:* </span>2003-05-28 21:46:04.0

<span class="emphasis">*Atualizado em:* </span>2005-07-25 12:34:40.0

![](/img/manual/ImprimirEtiqueta.png)

<div id="d120761e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Etiqueta - AD\_PrintLabel

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Imprimir Etiqueta

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
Formatos para imprimir Etiquetas

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d120761e38" class="table">

<div class="table-title">

Table 1.1. Label
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                Descrição                 |                                                                                                                                                                              Comentário/Ajuda                                                                                                                                                                              |
| :---------------------: | :------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Imprimir Etiqueta    |          ID          |                      |                            |                                                  |          Label Format to print           |                                                                                                                                                                         Format for printing Labels                                                                                                                                                                         |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                             |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                             |
|          Nome           | Texto Curto (String) |                      |                            |                                                  |  Alphanumeric identifier of the entity   |                                                                                                                The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                |
|        Descrição        | Texto Curto (String) |                      |                            |                                                  | Optional short description of the record |                                                                                                                                                                A description is limited to 255 characters.                                                                                                                                                                 |
|          Ativo          |       Sim-Não        |         (Y)          |                            |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                             |
|         Tabela          |    Tabela Direta     |                      |   adtable\_adprintlabel    |                                                  |        Database Table information        |                                                                                                                                                    The Database Table provides the information of the table definition                                                                                                                                                     |
| Impressora de Etiquetas |    Tabela Direta     |                      | adlabelprinter\_printlabel |                                                  |         Label Printer Definition         |                                                                                                                                                                                                                                                                                                                                                                            |
|   Nome da Impressora    | Texto Curto (String) |                      |                            |                                                  |           Name of the Printer            | Internal (Operating System) Name of the Printer; Please mote that the printer name may be different on different clients. Enter a printer name, which applies to ALL clients (e.g. printer on a server). \< p\> If none is entered, the default printer is used. You specify your default printer when you log in. You can also change the default printer in Preferences. |
|        Paisagem         |       Sim-Não        |                      |                            |                                                  |          Landscape orientation           |                                                                                                                                                                                                                                                                                                                                                                            |
|   Altura da Etiqueta    |       Inteiro        |                      |                            |                                                  |           Height of the label            |                                                                                                                                                                        Physical height of the label                                                                                                                                                                        |
|   Largura da Etiqueta   |       Inteiro        |                      |                            |                                                  |            Width of the Label            |                                                                                                                                                                        Physical Width of the Label                                                                                                                                                                         |
|   AD\_PrintLabel\_UU    | Texto Curto (String) |                      |                            |                                                  |                                          |                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d120761e251" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha - AD\_PrintLabelLine

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linha de Etiqueta de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
Formato de linha em uma Etiqueta

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d120761e266" class="table">

<div class="table-title">

Table 1.2. Line
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |  Valores (Padrão)  |        Chave restritiva        |                          Regra de validação                          |                           Descrição                           |                                                               Comentário/Ajuda                                                               |
| :------------------------------: | :------------------: | :----------------: | :----------------------------: | :------------------------------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Linha de Etiqueta de Impressão  |          ID          |                    |                                |                                                                      |                    Print Label Line Format                    |                                                        Format of the line on a Label                                                         |
|             Empresa              |    Tabela Direta     | (@AD\_Client\_ID@) |                                |                  AD\_Client.AD\_Client\_ID \< \> 0                   |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|           Organização            |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                |           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)           |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|        Imprimir Etiqueta         |    Tabela Direta     |                    | adprintlabel\_adprintlabelline |                                                                      |                     Label Format to print                     |                                                          Format for printing Labels                                                          |
|            Seqüência             |       Inteiro        |                    |                                |                                                                      |     Method of ordering records; lowest number comes first     |                                                 The Sequence indicates the order of records                                                  |
|               Nome               | Texto Curto (String) |                    |                                |                                                                      |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Ativo               |       Sim-Não        |        (Y)         |                                |                                                                      |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|   Tipo do Formato da Etiqueta    |        Lista         |  Campo Texto (F)   |                                |                                                                      |                       Label Format Type                       |                                                                                                                                              |
|        Texto de Impressão        | Texto Curto (String) |                    |                                |                                                                      | The label text to be printed on a document or correspondence. |     The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.      |
|              Coluna              |    Tabela Direta     |                    |   adcolumn\_adprintlabelline   |               AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@               |                      Column in the table                      |                                                   Link to the database column of the table                                                   |
|            Posição X             |       Inteiro        |                    |                                |                                                                      |      Absolute X (horizontal) position in 1/72 of an inch      |                                             Absolute X (horizontal) position in 1/72 of an inch                                              |
|            Posição Y             |       Inteiro        |                    |                                |                                                                      |       Absolute Y (vertical) position in 1/72 of an inch       |                                              Absolute Y (vertical) position in 1/72 of an inch                                               |
| Função da Impressora de Etiqueta |    Tabela Direta     |                    |  adlabelprintfunc\_labelline   | AD\_LabelPrinterFunction.AD\_LabelPrinter\_ID=@AD\_LabelPrinter\_ID@ |                   Function of Label Printer                   |                                                                                                                                              |
|      AD\_PrintLabelLine\_UU      | Texto Curto (String) |                    |                                |                                                                      |                                                               |                                                                                                                                              |

</div>

</div>

  

<div id="d120761e494" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - AD\_PrintLabelLine\_Trl

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Tradução de Linha de Etiqueta
de Impressão

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
tradução para Formatos de Linha de Etiqueta

<span class="emphasis">*Coluna linkada:* </span> Print Label Line

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>3

</div>

<div id="d120761e517" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                           Descrição                           |                                                          Comentário/Ajuda                                                           |
| :----------------------------: | :------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------: |
|            Empresa             |    Tabela Direta     | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                         (ver o mesmo acima)                                                         |
|          Organização           |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                         (ver o mesmo acima)                                                         |
| Linha de Etiqueta de Impressão |    Tabela Direta     |                    |    adprintlabelline\_trl    |                                                  |                    Print Label Line Format                    |                                                    Format of the line on a Label                                                    |
|             Idioma             |        Tabela        |    AD\_Language    | adlanguage\_adplabellinetrl |                                                  |                   Language for this entity                    |                               The Language identifies the language to use for display and formatting                                |
|             Ativo              |       Sim-Não        |        (Y)         |                             |                                                  |              (semelhante ao primeiro relatório)               |                                                         (ver o mesmo acima)                                                         |
|           Traduzida            |       Sim-Não        |                    |                             |                                                  |                   This column is translated                   |                                   The Translated checkbox indicates if this column is translated.                                   |
|       Texto de Impressão       | Texto Curto (String) |                    |                             |                                                  | The label text to be printed on a document or correspondence. | The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters. |
|  AD\_PrintLabelLine\_Trl\_UU   | Texto Curto (String) |                    |                             |                                                  |                                                               |                                                                                                                                     |

</div>

</div>

  

</div>
