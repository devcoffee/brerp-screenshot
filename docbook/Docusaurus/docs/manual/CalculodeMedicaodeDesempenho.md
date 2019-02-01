---
title: "Cálculo de Medição de Desempenho"
id: CalculodeMedicaodeDesempenho
---
<div id="d18594e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Cálculo de Medição de Desempenho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Cálculo de Medição de Desempenho -
    PA\_MeasureCalc](#d18594e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir os cálculos das
medidas de desempenho

<span class="emphasis">*Comentário/Ajuda:* </span>A Aba "Cálculos de
Medidas de Desempenho" define como as medidas de desempenho serão
calculadas. The sql needs to return a single value. Please check
examples. The date trestriction is defined in the Goal. Any restrictions
for Organizations, Business Partners, Products, etc. are as Performance
Goal Restrictions.

<span class="emphasis"> *Criado em:* </span>2001-04-24 17:57:06.0

<span class="emphasis">*Atualizado em:* </span>2005-12-26 14:52:03.0

![](/img/manual/CalculodeMedicaodeDesempenho.png)

<div id="d18594e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Cálculo de Medição de Desempenho - PA\_MeasureCalc

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_MeasureCalc_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Cálculos de
Medidas de Desempenho

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Cálculos de
Medidas de Desempenho" define como as medidas de desempenho serão
calculadas. See examples. The SELECT definition must contain the SELECT
and FROM keywords in upper case, the WHERE definition must contain the
WHERE keyword in upper case. The main table must not have an alias\! The
WHERE clause can only contain values of the main table (e.g. when
selecting from Header and lines, only header variables can be used in
the where clause) and be fully qualified if there is more then one
table.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d18594e40" class="table">

<div class="table-title">

Table 1.1. Performance Measure Calculation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |                                   Valores (Padrão)                                   |    Chave restritiva    |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :------------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :--------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Cálculo de Medição  |                ID                 |                                                                                      |                        |                                                                |           Calculation method for measuring performance           |                                                               The Measure Calculation indicates the method of measuring performance.                                                                |
|       Empresa        |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                 |                        |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|     Organização      |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                   |                        |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|         Nome         |       Texto Curto (String)        |                                                                                      |                        |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|      Descrição       |       Texto Curto (String)        |                                                                                      |                        |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|        Ativo         |              Sim-Não              |                                         (Y)                                          |                        |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Tipo de Entidade   |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_pameasurecalc | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|      Sql SELECT      | Texto Médio (até 2000 caracteres) |                                (SELECT ... FROM ...)                                 |                        |                                                                |                        SQL SELECT clause                         |                           The Select Clause indicates the SQL SELECT clause to use for selecting the record for a measure calculation. Do not include the SELECT itself.                            |
|      Sql WHERE       | Texto Médio (até 2000 caracteres) |                                     (WHERE ...)                                      |                        |                                                                |                 Fully qualified SQL WHERE clause                 |                 The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname".                  |
|    Coluna de Data    |       Texto Curto (String)        |                                       (x.Date)                                       |                        |                                                                |                   Fully qualified date column                    |                                                           The Date Column indicates the date to be used when calculating this measurement                                                           |
|    Coluna da Org.    |       Texto Curto (String)        |                                   (x.AD\_Org\_ID)                                    |                        |                                                                |        Fully qualified Organization column (AD\_Org\_ID)         |                                                   The Organization Column indicates the organization to be used in calculating this measurement.                                                    |
| Coluna Parc.Negócios |       Texto Curto (String)        |                                 (x.C\_BPartner\_ID)                                  |                        |                                                                |  Fully qualified Business Partner key column (C\_BPartner\_ID)   |                                                 The Business Partner Column indicates the Business Partner to use when calculating this measurement                                                 |
|  Coluna de Produto   |       Texto Curto (String)        |                                  (x.M\_Product\_ID)                                  |                        |                                                                |         Fully qualified Product column (M\_Product\_ID)          |                                                      The Product Column indicates the product to use to use when calculating this measurement.                                                      |
|        Tabela        |           Tabela Direta           |                                                                                      | adtable\_pameasurecalc |                                                                |                    Database Table information                    |                                                                 The Database Table provides the information of the table definition                                                                 |
|     Coluna Chave     |       Texto Curto (String)        |                                                                                      |                        |                                                                |                       Key Column for Table                       |                                                                                                                                                                                                     |
| PA\_MeasureCalc\_UU  |       Texto Curto (String)        |                                                                                      |                        |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

</div>
