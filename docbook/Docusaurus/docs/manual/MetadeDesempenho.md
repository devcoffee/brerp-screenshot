---
title: "Meta de Desempenho"
id: MetadeDesempenho
---
<div id="d145612e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Meta de Desempenho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Meta de Desempenho -
    PA\_Goal](#d145612e23)</span>
  - <span class="section">[2. Tabela: Restrição -
    PA\_GoalRestriction](#d145612e428)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir Metas de Desempenho

<span class="emphasis">*Comentário/Ajuda:* </span>The Performance Goal
Window allows you to define performance goals or all, a role or a user

<span class="emphasis"> *Criado em:* </span>2001-04-24 17:54:57.0

<span class="emphasis">*Atualizado em:* </span>2005-12-31 10:07:05.0

![](/img/manual/MetadeDesempenho.png)

<div id="d145612e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Meta de Desempenho - PA\_Goal

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_Goal_data)

<span class="emphasis">*Descrição:*</span> Meta de Desempenho

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Metas de
Desempenho" define metas específicas para desempenho.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145612e40" class="table">

<div class="table-title">

Table 1.1. Performance Goal
Fields

</div>

<div class="table-contents">

|        Nome do campo         |            Referência             |                             Valores (Padrão)                              |   Chave restritiva    |                Regra de validação                |                           Descrição                           |                                                                                                                                                                          Comentário/Ajuda                                                                                                                                                                           |
| :--------------------------: | :-------------------------------: | :-----------------------------------------------------------------------: | :-------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Objetivo           |                ID                 |                                                                           |                       |                                                  |                       Performance Goal                        |                                                                                                                                        The Performance Goal indicates what this users performance will be measured against.                                                                                                                                         |
|           Empresa            |           Tabela Direta           |                           (@\#AD\_Client\_ID@)                            |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                         |
|         Organização          |           Tabela Direta           |                             (@\#AD\_Org\_ID@)                             |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                         |
|             Nome             |       Texto Curto (String)        |                                                                           |                       |                                                  |             Alphanumeric identifier of the entity             |                                                                                                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                             |
|          Descrição           |       Texto Curto (String)        |                                                                           |                       |                                                  |           Optional short description of the record            |                                                                                                                                                             A description is limited to 255 characters.                                                                                                                                                             |
|             Nota             | Texto Médio (até 2000 caracteres) |                                                                           |                       |                                                  |         Optional additional user defined information          |                                                                                                                                     The Note field allows for optional entry of user defined information regarding this record                                                                                                                                      |
|            Ativo             |              Sim-Não              |                                    (Y)                                    |                       |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                         |
|            Perfil            |           Tabela Direta           |                                   (-1)                                    |    adrole\_pagoal     |            AD\_Role.IsMasterRole='N'             |                      Responsibility Role                      |                                                                                                                                      The Role determines security and access a user who has this Role will have in the System.                                                                                                                                      |
|       Usuário/Contato        |             Procurar              |                                   (-1)                                    |    aduser\_pagoal     |                                                  | User within the system - Internal or Business Partner Contact |                                                                                                                            The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                            |
|          Seqüência           |              Inteiro              |                                                                           |                       |                                                  |     Method of ordering records; lowest number comes first     |                                                                                                                                                             The Sequence indicates the order of records                                                                                                                                                             |
|       Nível de Resumo        |              Sim-Não              |                                                                           |                       |                                                  |                   This is a summary entity                    |                                                                                                             A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                                                             |
|       Esquema de Cores       |           Tabela Direta           |                                                                           | pacolorschema\_pagoal |                                                  |                   Performance Color Schema                    |                 Visual representation of performance by color. The Schema has often three levels (e.g. red-yellow-green). iDempiere support two levels (e.g. red-green) or four levels (e.g. gray-bronce-silver-gold). Note that Measures without a goal are represented white. The percentages could be beween 0 and unlimited (i.e. above 100%).                  |
|         Parent Goal          |              Tabela               |                              PA\_Goal Parent                              | pagoalparent\_pagoal  |                                                  |                          Parent Goal                          |                                                                                                                     You can create a hierarchy of goals by linking the sub-goals to the summary goal. The measures are automatically rolled up                                                                                                                      |
|        Alvo da Medida        |              Número               |                                                                           |                       |                                                  |                   Target value for measure                    |                                                                                                                      The Measure Target indicates the target or goal for this measure. It is used as in comparing against the actual measures                                                                                                                       |
|            Medida            |           Tabela Direta           |                                                                           |   pameasure\_pagoal   |                                                  |               Concrete Performance Measurement                |                                                                                                                      The Measure identifies a concrete, measurable indicator of performance. For example, sales dollars, prospects contacted.                                                                                                                       |
|            Do dia            |             Data+Hora             |                                                                           |                       |                                                  |                   Starting date for a range                   |                                                                                                                                                        The Date From indicates the starting date of a range.                                                                                                                                                        |
|            Ao dia            |             Data+Hora             |                                                                           |                       |                                                  |                   End date of a date range                    |                                                                                                                                                      The Date To indicates the end date of a range (inclusive)                                                                                                                                                      |
|        Measure Scope         |               Lista               |                    Total Ano Trimestre Mês Semana Dia                     |                       |                                                  |                   Performance Measure Scope                   |                                                                                         The scope of the goal can be broken down for initial display. Example: Scope is Year, Display is Month - the goal is entered as a yearly number, the display divides the goal by 12                                                                                         |
|       Measure Display        |               Lista               |                    Total Ano Trimestre Mês Semana Dia                     |                       |                                                  |               Measure Scope initially displayed               |                                                                                                                                                                                                                                                                                                                                                                     |
|       Tipo de Gráfico        |               Lista               | Area Chart Bar Chart Line Chart Pie Chart Ring Chart Waterfall Chart (BC) |                       |                                                  |                    Type of chart to render                    |                                                                                                                                                                                                                                                                                                                                                                     |
|         Medição Real         |              Número               |                                                                           |                       |                                                  |             Actual value that has been measured.              |                                                                                                               The Measure Actual indicates the actual measured value. The measured values are used in determining if a performance goal has been met                                                                                                                |
| Data do último processamento |             Data+Hora             |                                                                           |                       |                                                  |                Date the process was last run.                 |                                                                                                                                                  The Date Last Run indicates the last time that a process was run.                                                                                                                                                  |
|      Meta de Desempenho      |              Número               |                                                                           |                       |                                                  |                 Target achievement from 0..1                  |                                                                                                                                                 The Goal Performance indicates the target achievement from 0 to 1.                                                                                                                                                  |
|        Peso Relativo         |              Número               |                                    (1)                                    |                       |                                                  |          Relative weight of this step (0 = ignored)           | The relative weight allows you to adjust the project cycle report based on probabilities. For example, if you have a 1:10 chance in closing a contract when it is in the prospect stage and a 1:2 chance when it is in the contract stage, you may put a weight of 0.1 and 0.5 on those steps. This allows sales funnels or measures of completion of your project. |
|         PA\_Goal\_UU         |       Texto Curto (String)        |                                                                           |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d145612e428" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Restrição - PA\_GoalRestriction

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Performance Goal Restriction

<span class="emphasis">*Comentário/Ajuda:* </span> Restriction of the
performance measure to the Organization, Business Partner or Product
defined. Exemplo: The performance is only measured for HQ The measure
must support the data, otherwise it is ignored.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d145612e443" class="table">

<div class="table-title">

Table 1.2. Restriction
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |                                Valores (Padrão)                                 |        Chave restritiva        |        Regra de validação         |               Descrição               |                                                                                               Comentário/Ajuda                                                                                                |
| :---------------------: | :------------------: | :-----------------------------------------------------------------------------: | :----------------------------: | :-------------------------------: | :-----------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Goal Restriction     |          ID          |                                                                                 |                                |                                   |     Performance Goal Restriction      | Restriction of the performance measure to the Organization, Business Partner or Product defined. Example: The performance is only measured for HQ The measure must support the data, otherwise it is ignored. |
|         Empresa         |    Tabela Direta     |                                                                                 |                                | AD\_Client.AD\_Client\_ID \< \> 0 |  (semelhante ao primeiro relatório)   |                                                                                              (ver o mesmo acima)                                                                                              |
|       Organização       |    Tabela Direta     |                                                                                 |    adorg\_pagoalrestriction    |                                   |  (semelhante ao primeiro relatório)   |                                                                                              (ver o mesmo acima)                                                                                              |
|        Objetivo         |    Tabela Direta     |                                                                                 |   pagoal\_pagoalrestriction    |                                   |           Performance Goal            |                                                             The Performance Goal indicates what this users performance will be measured against.                                                              |
|          Nome           | Texto Curto (String) |                                                                                 |                                |                                   | Alphanumeric identifier of the entity |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|          Ativo          |       Sim-Não        |                                                                                 |                                |                                   |  (semelhante ao primeiro relatório)   |                                                                                              (ver o mesmo acima)                                                                                              |
|    Tipo de Restrição    |        Lista         | Parceiro de Negócios Categoria de Produto Bus.Partner Group Organização Produto |                                |                                   |         Goal Restriction Type         |                                                                     Enter one or more records per Goal Restriction Type (e.g. Org o1, o2)                                                                     |
|       Organização       |        Tabela        |                               AD\_Org (all but 0)                               |   adorg2\_pagoalrestriction    |                                   |  (semelhante ao primeiro relatório)   |                                                                                              (ver o mesmo acima)                                                                                              |
|  Parceiro de Negócios   |       Procurar       |                                                                                 |  cbpartner\_pagoalrestriction  |                                   |     Identifies a Business Partner     |                                                A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                |
|   Grupo de Parceiros    |    Tabela Direta     |                                                                                 |  cbpgroup\_pagoalrestriction   |                                   |        Business Partner Group         |                                                The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.                                                 |
|         Produto         |       Procurar       |                                                                                 |  mproduct\_pagoalrestriction   |                                   |        Product, Service, Item         |                                                                  Identifies an item which is either purchased or sold in this organization.                                                                   |
|  Categoria de Produto   |    Tabela Direta     |                                                                                 | mproductcat\_pagoalrestriction |                                   |         Category of a Product         |                                                 Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                 |
| PA\_GoalRestriction\_UU | Texto Curto (String) |                                                                                 |                                |                                   |                                       |                                                                                                                                                                                                               |

</div>

</div>

  

</div>
