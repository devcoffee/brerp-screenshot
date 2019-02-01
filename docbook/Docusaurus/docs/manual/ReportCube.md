---
title: "Report Cube"
id: ReportCube
---
<div id="d205023e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Report Cube

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Report Cube -
    PA\_ReportCube](#d205023e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Define reporting cube for
pre-calculation of summary accounting data.

<span class="emphasis">*Comentário/Ajuda:* </span>Summary data will be
generated for each period of the selected calendar, grouped by the
selected dimensions..

<span class="emphasis"> *Criado em:* </span>2009-05-14 11:43:12.0

<span class="emphasis">*Atualizado em:* </span>2009-05-14 11:43:12.0

<div id="d205023e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Report Cube - PA\_ReportCube

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d205023e29" class="table">

<div class="table-title">

Table 1.1. Report Cube
Fields

</div>

<div class="table-contents">

|         Nome do campo         |            Referência             | Valores (Padrão) |    Chave restritiva     |        Regra de validação         |                               Descrição                               |                                                                                                       Comentário/Ajuda                                                                                                       |
| :---------------------------: | :-------------------------------: | :--------------: | :---------------------: | :-------------------------------: | :-------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Report Cube          |                ID                 |                  |                         |                                   | Define reporting cube for pre-calculation of summary accounting data. |                                                        Summary data will be generated for each period of the selected calendar, grouped by the selected dimensions..                                                         |
|            Empresa            |           Tabela Direta           |                  |                         | AD\_Client.AD\_Client\_ID \< \> 0 |                  (semelhante ao primeiro relatório)                   |                                                                                                     (ver o mesmo acima)                                                                                                      |
|          Organização          |           Tabela Direta           |                  |                         |                                   |                  (semelhante ao primeiro relatório)                   |                                                                                                     (ver o mesmo acima)                                                                                                      |
|             Nome              |       Texto Curto (String)        |                  |                         |                                   |                 Alphanumeric identifier of the entity                 |                                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                         |
|           Descrição           | Texto Médio (até 2000 caracteres) |                  |                         |                                   |               Optional short description of the record                |                                                                                         A description is limited to 255 characters.                                                                                          |
|          Calendário           |           Tabela Direta           |                  | ccalendar\_pareportcube |                                   |                       Accounting Calendar Name                        | The Calendar uniquely identifies an accounting calendar. Multiple calendars can be used. For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30. |
|             Ativo             |              Sim-Não              |                  |                         |                                   |                  (semelhante ao primeiro relatório)                   |                                                                                                     (ver o mesmo acima)                                                                                                      |
|      Dimensão de Produto      |              Sim-Não              |                  |                         |                                   |                  Include Product as a cube dimension                  |                                                                                                                                                                                                                              |
| Dimensão Parceiro de Negocio  |              Sim-Não              |                  |                         |                                   |             Include Business Partner as a cube dimension              |                                                                                                                                                                                                                              |
|    Sales Region Dimension     |              Sim-Não              |                  |                         |                                   |               Include Sales Region as a cube dimension                |                                                                                                                                                                                                                              |
|       OrgTrx Dimension        |              Sim-Não              |                  |                         |                                   |                  Include OrgTrx as a cube dimension                   |                                                                                                                                                                                                                              |
|      Dimensão Atividade       |              Sim-Não              |                  |                         |                                   |                 Include Activity as a cube dimension                  |                                                                                                                                                                                                                              |
|     Dimensões de Campanha     |              Sim-Não              |                  |                         |                                   |                 Include Campaign as a cube dimension                  |                                                                                                                                                                                                                              |
|      Dimensão de Projeto      |              Sim-Não              |                  |                         |                                   |                  Include Project as a cube dimension                  |                                                                                                                                                                                                                              |
| Fase das dimensões do projeto |              Sim-Não              |                  |                         |                                   |               Include Project Phase as a cube dimension               |                                                                                                                                                                                                                              |
|    Project Task Dimension     |              Sim-Não              |                  |                         |                                   |               Include Project Task as a cube dimension                |                                                                                                                                                                                                                              |
|      GL Budget Dimension      |              Sim-Não              |                  |                         |                                   |                 Include GL Budget as a cube dimension                 |                                                                                                                                                                                                                              |
|    Location From Dimension    |              Sim-Não              |                  |                         |                                   |               Include Location From as a cube dimension               |                                                                                                                                                                                                                              |
|     Location To Dimension     |              Sim-Não              |                  |                         |                                   |                Include Location To as a cube dimension                |                                                                                                                                                                                                                              |
|      Sub Acct Dimension       |              Sim-Não              |                  |                         |                                   |                 Include Sub Acct as a cube dimension                  |                                                                                                                                                                                                                              |
|       User 1 Dimension        |              Sim-Não              |                  |                         |                                   |            Include User Element List 1 as a cube dimension            |                                                                                                                                                                                                                              |
|       User 2 Dimension        |              Sim-Não              |                  |                         |                                   |            Include User Element List 2 as a cube dimension            |                                                                                                                                                                                                                              |
|   User Element 1 Dimension    |              Sim-Não              |                  |                         |                                   |              Include User Element 1 as a cube dimension               |                                                                                                                                                                                                                              |
|   User Element 2 Dimension    |              Sim-Não              |                  |                         |                                   |              Include User Element 2 as a cube dimension               |                                                                                                                                                                                                                              |
|       Último Recalculo        |             Data+Hora             |                  |                         |                                   |                      The time last recalculated.                      |                                                                                                                                                                                                                              |
|        Processar Agora        |              Sim-Não              |       (N)        |                         |                                   |                                                                       |                                                                                                                                                                                                                              |
|      PA\_ReportCube\_UU       |       Texto Curto (String)        |                  |                         |                                   |                                                                       |                                                                                                                                                                                                                              |

</div>

</div>

  

</div>
