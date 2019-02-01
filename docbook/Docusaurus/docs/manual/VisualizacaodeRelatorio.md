---
title: "Visualização de Relatório"
id: VisualizacaodeRelatorio
---
<div id="d254350e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Visualização de Relatório

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Visualização de Relatório -
    AD\_ReportView](#d254350e22)</span>
  - <span class="section">[2. Tabela: Coluna de Visualização de
    Relatório - AD\_ReportView\_Col](#d254350e228)</span>
  - <span class="section">[3. Tabela: Available Columns -
    AD\_ReportView\_Column](#d254350e402)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Vistas de
Relatórios

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Visualização
de Relatório" define as visualizações utilizadas ao gerar relatórios.
Esta Janela é somente para uso do Administrador do Sistema.

<span class="emphasis"> *Criado em:* </span>2000-05-15 21:52:14.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d254350e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Visualização de Relatório - AD\_ReportView

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ReportView_data)

<span class="emphasis">*Descrição:*</span> Definir Visualização de
Relatório

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Visualização
de Relatório" define as visualizações usadas na geração de relatórios

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d254350e39" class="table">

<div class="table-title">

Table 1.1. Report View
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |                                   Valores (Padrão)                                   |   Chave restritiva    |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :-----------------------: | :------------------: | :----------------------------------------------------------------------------------: | :-------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Visualização de Relatório |          ID          |                                                                                      |                       |                                                                |                View used to generate this report                 |                                                                  The Report View indicates the view used to generate this report.                                                                   |
|          Empresa          |    Tabela Direta     |                                 (@\#AD\_Client\_ID@)                                 |                       |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|        Organização        |    Tabela Direta     |                                  (@\#AD\_Org\_ID@)                                   |                       |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|           Nome            | Texto Curto (String) |                                                                                      |                       |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|         Descrição         | Texto Curto (String) |                                                                                      |                       |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|           Ativo           |       Sim-Não        |                                         (Y)                                          |                       |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|     Tipo de Entidade      |        Tabela        | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adreportview | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|          Tabela           |    Tabela Direta     |                                                                                      | adtable\_adreportview |                                                                |                    Database Table information                    |                                                                 The Database Table provides the information of the table definition                                                                 |
|         Sql WHERE         | Texto Curto (String) |                                                                                      |                       |                                                                |                 Fully qualified SQL WHERE clause                 |                 The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname".                  |
|       Sql ORDER BY        | Texto Curto (String) |                                                                                      |                       |                                                                |                 Fully qualified ORDER BY clause                  |                                                          The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection                                                          |
|    AD\_ReportView\_UU     | Texto Curto (String) |                                                                                      |                       |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d254350e228" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Coluna de Visualização de Relatório - AD\_ReportView\_Col

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ReportView_Col_data)

<span class="emphasis">*Descrição:*</span> Coluna de Visualização de
Relatório

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Coluna de
Visualização de Relatório" define quaisquer colunas que serão ignoradas
(overridden) na geração da SQL selecionada.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d254350e245" class="table">

<div class="table-title">

Table 1.2. Report View Column
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |  Valores (Padrão)  |     Chave restritiva      |                Regra de validação                |                   Descrição                   |                                                  Comentário/Ajuda                                                  |
| :---------------------------------: | :------------------: | :----------------: | :-----------------------: | :----------------------------------------------: | :-------------------------------------------: | :----------------------------------------------------------------------------------------------------------------: |
| Coluna de Visualização de Relatório |          ID          |                    |                           |                                                  |                                               |                                                                                                                    |
|               Empresa               |    Tabela Direta     | (@AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)       |                                                (ver o mesmo acima)                                                 |
|             Organização             |    Tabela Direta     |  (@AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)       |                                                (ver o mesmo acima)                                                 |
|      Visualização de Relatório      |    Tabela Direta     |                    |     adreportview\_col     |                                                  |       View used to generate this report       |                          The Report View indicates the view used to generate this report.                          |
|               Coluna                |    Tabela Direta     |                    | adcolumn\_adreportviewcol |     AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@     |              Column in the table              |                                      Link to the database column of the table                                      |
|                Ativo                |       Sim-Não        |        (Y)         |                           |                                                  |      (semelhante ao primeiro relatório)       |                                                (ver o mesmo acima)                                                 |
|          Função de Coluna           | Texto Curto (String) |                    |                           |                                                  |        Overwrite Column with Function         |                  The Function Column indicates that the column will be overridden with a function                  |
|         Função de Grupo SQL         |       Sim-Não        |                    |                           |                                                  | This function will generate a Group By Clause | The SQL Group Function checkbox indicates that this function will generate a Group by Clause in the resulting SQL. |
|       AD\_ReportView\_Col\_UU       | Texto Curto (String) |                    |                           |                                                  |                                               |                                                                                                                    |

</div>

</div>

  

<div id="d254350e402" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Available Columns - AD\_ReportView\_Column

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> You can define on this tab
which columns will be available as the print format items

<span class="emphasis">*Coluna linkada:* </span> Report View

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d254350e417" class="table">

<div class="table-title">

Table 1.3. Available Columns
Fields

</div>

<div class="table-contents">

|       Nome do campo       |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                                                                               Regra de validação                                                                                |             Descrição              |                         Comentário/Ajuda                         |
| :-----------------------: | :-----------: | :------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------: |
|          Empresa          | Tabela Direta | (@\#AD\_Client\_ID@) |  ADClient\_ADReportViewColumn   |                                        AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: 1=1                                         | (semelhante ao primeiro relatório) |                       (ver o mesmo acima)                        |
|        Organização        | Tabela Direta |  (@\#AD\_Org\_ID@)   |    ADOrg\_ADReportViewColumn    |                                                       (AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ OR AD\_Org.AD\_Org\_ID=0)                                                        | (semelhante ao primeiro relatório) |                       (ver o mesmo acima)                        |
| Visualização de Relatório |   Procurar    |                      | ADReportView\_ADReportViewColum |                                                                                                                                                                                 | View used to generate this report  | The Report View indicates the view used to generate this report. |
|          Coluna           | Tabela Direta |                      |  ADColumn\_ADReportViewColumn   | AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@ AND AD\_Column.AD\_Column\_ID NOT IN (SELECT AD\_Column\_ID FROM AD\_ReportView\_Column WHERE AD\_ReportView\_ID=@AD\_ReportView\_ID@) |        Column in the table         |             Link to the database column of the table             |
|           Ativo           |    Sim-Não    |         (Y)          |                                 |                                                                                                                                                                                 | (semelhante ao primeiro relatório) |                       (ver o mesmo acima)                        |

</div>

</div>

  

</div>
