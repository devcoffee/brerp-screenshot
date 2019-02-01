---
title: "Relatório Financeiro"
id: RelatorioFinanceiro
---
<div id="d195948e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Relatório Financeiro

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Relatório Financeiro -
    PA\_Report](#d195948e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Relatórios
Financeiros

<span class="emphasis">*Comentário/Ajuda:* </span>Relatórios Financeiros
são a combinação de um Conjunto de Colunas e um Conjunto de Linhas de
Relatório.

<span class="emphasis"> *Criado em:* </span>2001-05-13 09:38:47.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d195948e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Relatório Financeiro - PA\_Report

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_Report_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d195948e31" class="table">

<div class="table-title">

Table 1.1. Financial Report
Fields

</div>

<div class="table-contents">

|                 Nome do campo                  |      Referência      |      Valores (Padrão)      |    Chave restritiva     |                          Regra de validação                          |                                Descrição                                 |                                                                                                       Comentário/Ajuda                                                                                                       |
| :--------------------------------------------: | :------------------: | :------------------------: | :---------------------: | :------------------------------------------------------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Relatório Financeiro              |          ID          |                            |                         |                                                                      |                             Financial Report                             |                                                                                                                                                                                                                              |
|                    Empresa                     |    Tabela Direta     |    (@\#AD\_Client\_ID@)    |                         |                  AD\_Client.AD\_Client\_ID \< \> 0                   |                    (semelhante ao primeiro relatório)                    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|                  Organização                   |    Tabela Direta     |     (@\#AD\_Org\_ID@)      |     adorg\_pareport     |           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)           |                    (semelhante ao primeiro relatório)                    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|                Esquema Contábil                |    Tabela Direta     |                            |  cacctschema\_pareport  |                                                                      |                           Rules for accounting                           |                                                           An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                            |
|                   Calendário                   |    Tabela Direta     |                            |   ccalendar\_pareport   |                                                                      |                         Accounting Calendar Name                         | The Calendar uniquely identifies an accounting calendar. Multiple calendars can be used. For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30. |
|                      Nome                      | Texto Curto (String) |                            |                         |                                                                      |                  Alphanumeric identifier of the entity                   |                                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                         |
|                   Descrição                    | Texto Curto (String) |                            |                         |                                                                      |                 Optional short description of the record                 |                                                                                         A description is limited to 255 characters.                                                                                          |
|                     Ativo                      |       Sim-Não        |            (Y)             |                         |                                                                      |                    (semelhante ao primeiro relatório)                    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|        Conjunto de Linhas de Relatório         |    Tabela Direta     |                            |    pareport\_lineset    |                                                                      |                                                                          |                                                                                                                                                                                                                              |
|       Conjunto de Colunas de Relatórios        |    Tabela Direta     |                            |   pareport\_columnset   |                                                                      |                     Collection of Columns for Report                     |                                                                                The Report Column Set identifies the columns used in a Report.                                                                                |
|                  Report Cube                   |        Tabela        |       PA\_ReportCube       | pareportcube\_pareport  |           PA\_ReportCube.C\_Calendar\_ID=@C\_Calendar\_ID@           |  Define reporting cube for pre-calculation of summary accounting data.   |                                                        Summary data will be generated for each period of the selected calendar, grouped by the selected dimensions..                                                         |
|                 Jasper Process                 |        Tabela        | AD\_Process\_JasperReports | jasperprocess\_pareport | <span class="emphasis">*ReadOnly Logic*</span>: @\#ShowAdvanced@ = N |    The Jasper Process used by the printengine if any process defined     |                                                                                                                                                                                                                              |
|                 Listar Origens                 |       Sim-Não        |                            |                         |                                                                      |                         List Report Line Sources                         |                                                                                    List the Source Accounts for Summary Accounts selected                                                                                    |
|               Listar Transações                |       Sim-Não        |                            |                         |                                                                      |                       List the report transactions                       |                                                                                       List the transactions of the report source lines                                                                                       |
| Incluir contas de origem sem nenhuma transação |       Sim-Não        |            (N)             |                         |                                                                      | Include source accounts with no transaction for list report line sources |                                                                     List the Source Accounts with or without transactions for Summary Accounts selected                                                                      |
|                Criar Relatório                 |        Botão         |                            |                         |                                                                      |                                                                          |                                                                                                                                                                                                                              |
|              Formato de Impressão              |    Tabela Direta     |            (0)             | adprintformat\_pareport |                                                                      |                            Data Print Format                             |                                                                                 The print format determines how data is rendered for print.                                                                                  |
|             Create Report (Jasper)             |        Botão         |                            |                         |                                                                      |                                                                          |                                                                                                                                                                                                                              |
|                 PA\_Report\_UU                 | Texto Curto (String) |                            |                         |                                                                      |                                                                          |                                                                                                                                                                                                                              |

</div>

</div>

  

</div>
