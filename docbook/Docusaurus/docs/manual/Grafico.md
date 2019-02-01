---
title: "Gráfico"
id: Grafico
---
<div id="d110034e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Gráfico

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Gráfico -
    AD\_Chart](#d110034e22)</span>
  - <span class="section">[2. Tabela: Fonte de Dados -
    AD\_ChartDatasource](#d110034e294)</span>
  - <span class="section">[3. Tabela: Translation -
    AD\_Chart\_Trl](#d110034e595)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definição de Gráfico

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2010-08-23 14:44:43.0

<span class="emphasis">*Atualizado em:* </span>2010-08-23 14:44:43.0

<div id="d110034e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Gráfico - AD\_Chart

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Chart_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d110034e31" class="table">

<div class="table-title">

Table 1.1. Chart
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |                                                                            Valores (Padrão)                                                                            | Chave restritiva |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :--------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Gráfico      |          ID          |                                                                                                                                                                        |                  |                                                                |                                                                  |                                                                                                                                                                                                     |
|     Empresa      |    Tabela Direta     |                                                                          (@\#AD\_Client\_ID@)                                                                          |                  |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Organização    |    Tabela Direta     |                                                                           (@\#AD\_Org\_ID@)                                                                            |                  |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Nome       | Texto Curto (String) |                                                                                                                                                                        |                  |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|    Descrição     | Texto Curto (String) |                                                                                                                                                                        |                  |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
| Tipo de Gráfico  |        Lista         | Area Chart Stacked Area Chart 3D Bar Chart 3D Stacked Bar Chart Bar Chart Stacked Bar Chart 3D Line Chart Line Chart 3D Pie Chart Pie Chart Ring Chart Waterfall Chart |                  |                                                                |                     Type of chart to render                      |                                                                                                                                                                                                     |
| Altura da Janela |       Inteiro        |                                                                                                                                                                        |                  |                                                                |                                                                  |                                                                                                                                                                                                     |
|  Exibir Legenda  |       Sim-Não        |                                                                                 ('Y')                                                                                  |                  |                                                                |                       Display chart legend                       |                                                                               Toggles the display of the chart legend                                                                               |
|    Orientação    |        Lista         |                                                                        Horizontal Vertical (V)                                                                         |                  |                                                                |                  The orientation of the chart.                   |                                                                                                                                                                                                     |
|   Domain Label   | Texto Curto (String) |                                                                                                                                                                        |                  |                                                                |                    Label for the domain axis.                    |                                                                                                                                                                                                     |
|   Range Label    | Texto Curto (String) |                                                                                                                                                                        |                  |                                                                |                    Label for the range axis.                     |                                                                                                                                                                                                     |
|   Time Series    |       Sim-Não        |                                                                                  (N)                                                                                   |                  |                                                                |       The domain data for the chart is organised by time.        |                                              A time series chart will automatically group and restrict the data by the time unit and scope specified.                                               |
| Unidade de Tempo |        Lista         |                                                                      Day Month Quarter Week Year                                                                       |                  |                                                                |            The unit of time for grouping chart data.             |                                                                                                                                                                                                     |
|    Time Scope    |       Inteiro        |                                                                                                                                                                        |                  |                                                                |      The number of time units to include the chart result.       |                                                                                                                                                                                                     |
| Tipo de Entidade |        Tabela        |                                          \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)                                          | entityt\_adchart | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|      Ativo       |       Sim-Não        |                                                                                                                                                                        |                  |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |

</div>

</div>

  

<div id="d110034e294" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Fonte de Dados - AD\_ChartDatasource

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ChartDatasource_data)

<span class="emphasis">*Coluna linkada:* </span> Chart

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d110034e307" class="table">

<div class="table-title">

Table 1.2. Datasource
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             |                                   Valores (Padrão)                                   |      Chave restritiva      |                       Regra de validação                       |                                 Descrição                                  |                                                                                          Comentário/Ajuda                                                                                           |
| :-----------------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :------------------------: | :------------------------------------------------------------: | :------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Fonte de Dados do Gráfico |                ID                 |                                                                                      |                            |                                                                |                                                                            |                                                                                                                                                                                                     |
|          Empresa          |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                 |                            |               AD\_Client.AD\_Client\_ID \< \> 0                |                     (semelhante ao primeiro relatório)                     |                                                                                         (ver o mesmo acima)                                                                                         |
|        Organização        |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                   |                            |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                     (semelhante ao primeiro relatório)                     |                                                                                         (ver o mesmo acima)                                                                                         |
|          Gráfico          |           Tabela Direta           |                                                                                      | adchart\_adchartdatasource |                                                                |                                                                            |                                                                                                                                                                                                     |
|           Nome            |       Texto Curto (String)        |                                                                                      |                            |                                                                |                   Alphanumeric identifier of the entity                    |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|         Descrição         |       Texto Curto (String)        |                                                                                      |                            |                                                                |                  Optional short description of the record                  |                                                                             A description is limited to 255 characters.                                                                             |
|     Tipo de Entidade      |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adchartdatasource | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D |      Dictionary Entity Type; Determines ownership and synchronization      | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|         Sql FROM          | Texto Médio (até 2000 caracteres) |                                                                                      |                            |                                                                |                              SQL FROM clause                               |                The Select Clause indicates the SQL FROM clause to use for selecting the record for a measure calculation. It can have JOIN clauses. Do not include the FROM itself.                 |
|         Sql WHERE         | Texto Médio (até 2000 caracteres) |                                     (WHERE ...)                                      |                            |                                                                |                      Fully qualified SQL WHERE clause                      |                 The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname".                  |
|       Coluna Série        |       Texto Curto (String)        |                                                                                      |                            |                                                                |                                                                            |                                                                                                                                                                                                     |
|    Coluna de Categoria    |       Texto Curto (String)        |                                                                                      |                            |                                                                |                    Fully qualified data category column                    |                                                                    The Category Column determines how the chart data is grouped                                                                     |
|      Coluna de Data       |       Texto Curto (String)        |                                                                                      |                            |                                                                |                        Fully qualified date column                         |                                                           The Date Column indicates the date to be used when calculating this measurement                                                           |
|        Time Offset        |              Inteiro              |                                                                                      |                            |                                                                | Number of time units to offset displayed chart data from the current date. |                                           For example an offset of -12 with a chart time unit of Month will result in previous year data being displayed.                                           |
|       Value Column        |       Texto Curto (String)        |                                                                                      |                            |                                                                |                     Fully qualified data value column                      |                                                                       The Value Column contains the value data for the chart                                                                        |
|          Tabela           |           Tabela Direta           |                                                                                      | adtable\_adchartdatasource |                                                                |                         Database Table information                         |                                                                 The Database Table provides the information of the table definition                                                                 |
|       Coluna Chave        |       Texto Curto (String)        |                                                                                      |                            |                                                                |                            Key Column for Table                            |                                                                                                                                                                                                     |
|           Ativo           |              Sim-Não              |                                         (Y)                                          |                            |                                                                |                     (semelhante ao primeiro relatório)                     |                                                                                         (ver o mesmo acima)                                                                                         |
|  AD\_ChartDatasource\_UU  |       Texto Curto (String)        |                                                                                      |                            |                                                                |                                                                            |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d110034e595" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Translation - AD\_Chart\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Chart_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Chart

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d110034e608" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |   Valores (Padrão)   |    Chave restritiva    |                                  Regra de validação                                   |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------: | :------------------: | :------------------: | :--------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa    |    Tabela Direta     | (@\#AD\_Client\_ID@) |  ADClient\_ADChartTrl  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização  |    Tabela Direta     |                      |   ADOrg\_ADChartTrl    |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Gráfico    |       Procurar       |                      |  ADChart\_ADChartTrl   |                                                                                       |                                          |                                                                                                                                              |
|    Idioma     |        Tabela        |     AD\_Language     | ADLanguage\_ADChartTrl |                                                                                       |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|     Ativo     |       Sim-Não        |         (Y)          |                        |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Traduzida   |       Sim-Não        |         (N)          |                        |                                                                                       |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|     Nome      | Texto Curto (String) |                      |                        |                                                                                       |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição   | Texto Curto (String) |                      |                        |                                                                                       | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Domain Label  | Texto Curto (String) |                      |                        |                                                                                       |        Label for the domain axis.        |                                                                                                                                              |
|  Range Label  | Texto Curto (String) |                      |                        |                                                                                       |        Label for the range axis.         |                                                                                                                                              |

</div>

</div>

  

</div>
