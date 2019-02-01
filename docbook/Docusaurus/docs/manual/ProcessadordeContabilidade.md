---
title: "Processador de Contabilidade"
id: ProcessadordeContabilidade
---
<div id="d178069e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Contabilidade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador de Contabilidade -
    C\_AcctProcessor](#d178069e22)</span>
  - <span class="section">[2. Tabela: Registro -
    C\_AcctProcessorLog](#d178069e297)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento do Processador
de Contabilidade e Registros (logs)

<span class="emphasis">*Comentário/Ajuda:* </span>Parâmetros e Registros
(logs) do Processador/Servidor de Contabilidade

<span class="emphasis"> *Criado em:* </span>2004-02-19 13:00:41.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d178069e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador de Contabilidade - C\_AcctProcessor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_AcctProcessor_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento dos Parâmetros
do Processador/Servidor de Contabilidade

<span class="emphasis">*Comentário/Ajuda:* </span> Parâmetros do
Processador/Servidor de Contabilidade. Se não for selecionado um esquema
de contabilidade , todos os esquemas contábeis serão processados. Se não
for selecionada uma tabela de transação, serão criadas contabilidades
para todas as transações.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d178069e39" class="table">

<div class="table-title">

Table 1.1. Accounting Processor
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |   Valores (Padrão)   |      Chave restritiva       |                                                                    Regra de validação                                                                    |                                Descrição                                 |                                                                               Comentário/Ajuda                                                                               |
| :-----------------------------: | :------------------: | :------------------: | :-------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Processar Agora         |        Botão         |                      |                             |                                                                                                                                                          |                                                                          |                                                                                                                                                                              |
|           Freqüência            |       Inteiro        |                      |                             |                                                                                                                                                          |                           Frequency of events                            | The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks. |
|       Tipo de Freqüência        |        Lista         |   Dia Hora Minuto    |                             |                                                                                                                                                          |                            Frequency of event                            |                                                    The frequency type is used for calculating the date of the next event.                                                    |
|  Processador de Contabilidade   |          ID          |                      |                             |                                                                                                                                                          |                  Accounting Processor/Server Parameters                  |                                                                    Accounting Processor/Server Parameters                                                                    |
|             Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                             |                                                            AD\_Client.AD\_Client\_ID \< \> 0                                                             |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|           Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                             |                                                     (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                     |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|              Nome               | Texto Curto (String) |                      |                             |                                                                                                                                                          |                  Alphanumeric identifier of the entity                   |                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                 |
|            Descrição            | Texto Curto (String) |                      |                             |                                                                                                                                                          |                 Optional short description of the record                 |                                                                 A description is limited to 255 characters.                                                                  |
|              Ativo              |       Sim-Não        |         (Y)          |                             |                                                                                                                                                          |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|        Esquema Contábil         |    Tabela Direta     |                      | cacctschema\_cacctprocessor |                                                                                                                                                          |                           Rules for accounting                           |                                   An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                    |
|             Tabela              |    Tabela Direta     |                      |   adtable\_cacctprocessor   | EXISTS (SELECT \* FROM AD\_Column c WHERE AD\_Table.AD\_Table\_ID=c.AD\_Table\_ID AND c.IsActive='Y' AND c.ColumnName='Posted') AND AD\_Table.IsView='N' |                        Database Table information                        |                                                     The Database Table provides the information of the table definition                                                      |
|            Programar            |    Tabela Direta     |                      | adschedule\_cacctprocessor  |                                                 AD\_Schedule.IsSystemSchedule='N' OR @AD\_Client\_ID@=0                                                  |                                                                          |                                                                                                                                                                              |
|           Supervisor            |        Tabela        | AD\_User - Internal  |   aduser\_cacctprocessor    |                                                                                                                                                          | Supervisor for this user/organization - used for escalation and approval |                               The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                               |
| Dias para manter registro (log) |       Inteiro        |         (7)          |                             |                                                                                                                                                          |                  Number of days to keep the log entries                  |                                                                       Older Log entries may be deleted                                                                       |
|  Data do último processamento   |      Data+Hora       |                      |                             |                                                                                                                                                          |                      Date the process was last run.                      |                                                      The Date Last Run indicates the last time that a process was run.                                                       |
|    Data da Próxima Execução     |      Data+Hora       |                      |                             |                                                                                                                                                          |                      Date the process will run next                      |                                                       The Date Next Run indicates the next time this process will run.                                                       |

</div>

</div>

  

<div id="d178069e297" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Registro - C\_AcctProcessorLog

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_AcctProcessorLog_data)

<span class="emphasis">*Descrição:*</span> Resultado da execução do
Processador de Contabilidade

<span class="emphasis">*Comentário/Ajuda:* </span> Resultado da execução
do Processador de Contabilidade

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d178069e314" class="table">

<div class="table-title">

Table 1.2. Log
Fields

</div>

<div class="table-contents">

|                     Nome do campo                     |            Referência             |  Valores (Padrão)  |  Chave restritiva   |                Regra de validação                |                      Descrição                      |                          Comentário/Ajuda                           |
| :---------------------------------------------------: | :-------------------------------: | :----------------: | :-----------------: | :----------------------------------------------: | :-------------------------------------------------: | :-----------------------------------------------------------------: |
|                         Ativo                         |              Sim-Não              |        (Y)         |                     |                                                  |         (semelhante ao primeiro relatório)          |                         (ver o mesmo acima)                         |
| Registro diário (log) do Processador de Contabilidade |                ID                 |                    |                     |                                                  | Result of the execution of the Accounting Processor |         Result of the execution of the Accounting Processor         |
|                    Dados Binários                     |              Binário              |                    |                     |                                                  |                     Binary Data                     |                The Binary field stores binary data.                 |
|                        Empresa                        |           Tabela Direta           | (@AD\_Client\_ID@) |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |         (semelhante ao primeiro relatório)          |                         (ver o mesmo acima)                         |
|                      Organização                      |           Tabela Direta           |  (@AD\_Org\_ID@)   |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |         (semelhante ao primeiro relatório)          |                         (ver o mesmo acima)                         |
|             Processador de Contabilidade              |           Tabela Direta           |                    | cacctprocessor\_log |                                                  |       Accounting Processor/Server Parameters        |               Accounting Processor/Server Parameters                |
|                        Criado                         |             Data+Hora             |     (SYSDATE)      |                     |                                                  |            Date this record was created             | The Created field indicates the date that this record was created.  |
|                        Resumo                         | Texto Médio (até 2000 caracteres) |                    |                     |                                                  |           Textual summary of this request           | The Summary allows free form text entry of a recap of this request. |
|                         Erro                          |              Sim-Não              |                    |                     |                                                  |         An Error occurred in the execution          |                                                                     |
|                      Referência                       |       Texto Curto (String)        |                    |                     |                                                  |              Reference for this record              |         The Reference displays the source document number.          |
|                   Texto de Mensagem                   | Texto Médio (até 2000 caracteres) |                    |                     |                                                  |                    Text Message                     |                                                                     |
|                       Descrição                       |       Texto Curto (String)        |                    |                     |                                                  |      Optional short description of the record       |             A description is limited to 255 characters.             |
|                C\_AcctProcessorLog\_UU                |       Texto Curto (String)        |                    |                     |                                                  |                                                     |                                                                     |

</div>

</div>

  

</div>
