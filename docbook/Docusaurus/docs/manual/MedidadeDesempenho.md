---
title: "Medida de Desempenho"
id: MedidadeDesempenho
---
<div id="d144735e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Medida de Desempenho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Medida -
    PA\_Measure](#d144735e23)</span>
  - <span class="section">[2. Tabela: Realização -
    PA\_Achievement](#d144735e325)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir suas Medidas de
Desempenho

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Medidas de
Desempenho" permite a você definir as regras e restrições para medir o
desempenho. Você pode, por exemplo, restringir a medição de desempenho a
vendas por uma certa categoria de produtos por um período de tempo
definido.

<span class="emphasis"> *Criado em:* </span>2001-04-24 18:53:57.0

<span class="emphasis">*Atualizado em:* </span>2005-12-26 14:51:59.0

![](/img/manual/MedidadeDesempenho.png)

<div id="d144735e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Medida - PA\_Measure

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_Measure_data)

<span class="emphasis">*Descrição:*</span> Medida de Desempenho

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Medida de
Desempenho" define a faixa de datas e o método a ser usado para medir o
desempenho.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d144735e40" class="table">

<div class="table-title">

Table 1.1. Measure
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |                                 Valores (Padrão)                                  |     Chave restritiva     |                Regra de validação                |                                      Descrição                                       |                                                                                                     Comentário/Ajuda                                                                                                     |
| :----------------------: | :-------------------------------: | :-------------------------------------------------------------------------------: | :----------------------: | :----------------------------------------------: | :----------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Medida          |                ID                 |                                                                                   |                          |                                                  |                           Concrete Performance Measurement                           |                                                 The Measure identifies a concrete, measurable indicator of performance. For example, sales dollars, prospects contacted.                                                 |
|         Empresa          |           Tabela Direta           |                               (@\#AD\_Client\_ID@)                                |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |                          (semelhante ao primeiro relatório)                          |                                                                                                   (ver o mesmo acima)                                                                                                    |
|       Organização        |           Tabela Direta           |                                 (@\#AD\_Org\_ID@)                                 |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                          (semelhante ao primeiro relatório)                          |                                                                                                   (ver o mesmo acima)                                                                                                    |
|           Nome           |       Texto Curto (String)        |                                                                                   |                          |                                                  |                        Alphanumeric identifier of the entity                         |                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                       |
|        Descrição         |       Texto Curto (String)        |                                                                                   |                          |                                                  |                       Optional short description of the record                       |                                                                                       A description is limited to 255 characters.                                                                                        |
|          Ativo           |              Sim-Não              |                                        (Y)                                        |                          |                                                  |                          (semelhante ao primeiro relatório)                          |                                                                                                   (ver o mesmo acima)                                                                                                    |
|    Measure Data Type     |               Lista               |                     Status Qty/Amount Qty/Amount in Time (T)                      |                          |                                                  |                           Type of data - Status or in Time                           |             Status represents values valid at a certain time (e.g. Open Invoices) - No history is maintained. Time represents a values at a given time (e.g. Invoice Amount on 1/1) - History is maintained              |
|      Tipo de Medida      |               Lista               | Achievements Calculado Manual Projeto Solicitação Razão Definido pelo usuário (M) |                          |                                                  |                   Determines how the actual performance is derived                   |                                           The Measure Type indicates how the actual measure is determined. For example, one measure may be manual while another is calculated.                                           |
|       Real Manual        |              Número               |                                                                                   |                          |                                                  |                            Manually entered actual value                             |                                                                        The Manual Active identifies a manually entered actual measurement value.                                                                         |
|           Nota           | Texto Médio (até 2000 caracteres) |                                                                                   |                          |                                                  |                                Note for manual entry                                 |                                                                      The Note allows for entry for additional information regarding a manual entry.                                                                      |
|    Cálculo de Medição    |           Tabela Direta           |                                                                                   | pameasurecalc\_pameasure |                                                  |                     Calculation method for measuring performance                     |                                                                          The Measure Calculation indicates the method of measuring performance.                                                                          |
|    Calculation Class     |       Texto Curto (String)        |                                                                                   |                          |                                                  |              Java Class for calculation, implementing Interface Measure              |                                                                      The Calculation Class indicates the Java Class used for calculating measures.                                                                       |
|          Razão           |           Tabela Direta           |                                                                                   |    paratio\_pameasure    |                                                  |                                  Performance Ratio                                   |                                                                                   Calculation instruction set for a performance ratio                                                                                    |
|   Tipo de Solicitação    |           Tabela Direta           |                                                                                   | rrequesttype\_pameasure  |                                                  |                    Type of request (e.g. Inquiry, Complaint, ..)                     |                                                    Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.                                                    |
|     Tipo de Projeto      |           Tabela Direta           |                                                                                   | cprojecttype\_pameasure  |                                                  |                                 Type of the project                                  |                                                              Type of the project with optional phases of the project with standard performance information                                                               |
|        Benchmark         |           Tabela Direta           |                                                                                   |  pabenchmark\_pameasure  |                                                  |                                Performance Benchmark                                 |                                                                         Data Series to compare internal performance with (e.g. stock price, ...)                                                                         |
| Hierarquia de Relatórios |           Tabela Direta           |                                                                                   |  pahierarchy\_pameasure  |                                                  | Optional Reporting Hierarchy - If not selected the default hierarchy trees are used. | Reporting Hierarchy allows you to select different Hierarchies/Trees for the report. Accounting Segments like Organization, Account, Product may have several hierarchies to accomodate different views on the business. |
|     PA\_Measure\_UU      |       Texto Curto (String)        |                                                                                   |                          |                                                  |                                                                                      |                                                                                                                                                                                                                          |

</div>

</div>

  

<div id="d144735e325" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Realização - PA\_Achievement

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Objetivo de Desempenho

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Objetivo de
Desempenho" define as Tarefas a serem cumpridas. O desempenho é medido
pela percentagem de objetivos alcançados.

<span class="emphasis">*Lógica de visualização:*</span> @MeasureType@=A

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d144735e344" class="table">

<div class="table-title">

Table 1.2. Achievement
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência             |   Valores (Padrão)   |     Chave restritiva     |                Regra de validação                |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :-------------------------------: | :------------------: | :----------------------: | :----------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Realização      |                ID                 |                      |                          |                                                  |                Performance Achievement                |                            The Achievement identifies a unique task that is part of an overall performance goal.                             |
|       Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Medida        |           Tabela Direta           |                      | pameasure\_paachievement |                                                  |           Concrete Performance Measurement            |           The Measure identifies a concrete, measurable indicator of performance. For example, sales dollars, prospects contacted.           |
|        Nome         |       Texto Curto (String)        |                      |                          |                                                  |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |       Texto Curto (String)        |                      |                          |                                                  |       Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |              Sim-Não              |         (Y)          |                          |                                                  |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Seqüência      |              Inteiro              |                      |                          |                                                  | Method of ordering records; lowest number comes first |                                                 The Sequence indicates the order of records                                                  |
|  Data do Documento  |               Data                |                      |                          |                                                  |                 Date of the Document                  |            The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.            |
|        Nota         | Texto Médio (até 2000 caracteres) |                      |                          |                                                  |     Optional additional user defined information      |                          The Note field allows for optional entry of user defined information regarding this record                          |
|      Alcançado      |              Sim-Não              |                      |                          |                                                  |                 The goal is achieved                  |                                       The Achieved checkbox indicates if this goal has been achieved.                                        |
|     Real Manual     |              Número               |                      |                          |                                                  |             Manually entered actual value             |                                  The Manual Active identifies a manually entered actual measurement value.                                   |
| PA\_Achievement\_UU |       Texto Curto (String)        |                      |                          |                                                  |                                                       |                                                                                                                                              |

</div>

</div>

  

</div>
