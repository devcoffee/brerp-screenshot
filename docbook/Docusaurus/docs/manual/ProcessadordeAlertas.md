---
title: "Processador de Alertas"
id: ProcessadordeAlertas
---
<div id="d177849e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Alertas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador -
    AD\_AlertProcessor](#d177849e23)</span>
  - <span class="section">[2. Tabela: Registro -
    AD\_AlertProcessorLog](#d177849e266)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos parâmetros
do Servidor/Processador de Alertas e Registros (logs)

<span class="emphasis">*Comentário/Ajuda:* </span>Parâmetros do
Processador/Servidor de Alerta

<span class="emphasis"> *Criado em:* </span>2004-02-19 13:00:51.0

<span class="emphasis">*Atualizado em:* </span>2012-09-19 10:52:56.0

![](/img/manual/ProcessadordeAlertas.png)

<div id="d177849e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador - AD\_AlertProcessor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_AlertProcessor_data)

<span class="emphasis">*Descrição:*</span> Processador de Alertas

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d177849e36" class="table">

<div class="table-title">

Table 1.1. Processor
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |   Valores (Padrão)    |       Chave restritiva       |                   Regra de validação                    |                                Descrição                                 |                                                                               Comentário/Ajuda                                                                               |
| :-----------------------------: | :------------------: | :-------------------: | :--------------------------: | :-----------------------------------------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Tipo de Freqüência        |        Lista         |    Dia Hora Minuto    |                              |                                                         |                            Frequency of event                            |                                                    The frequency type is used for calculating the date of the next event.                                                    |
|     Processador de Alertas      |          ID          |                       |                              |                                                         |                     Alert Processor/Server Parameter                     |                                                                       Alert Processor/Server Parameter                                                                       |
|           Freqüência            |       Inteiro        |                       |                              |                                                         |                           Frequency of events                            | The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks. |
|         Processar Agora         |        Botão         |                       |                              |                                                         |                                                                          |                                                                                                                                                                              |
|             Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@)  |                              |            AD\_Client.AD\_Client\_ID \< \> 0            |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|           Organização           |    Tabela Direta     |   (@\#AD\_Org\_ID@)   |                              |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)     |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|              Nome               | Texto Curto (String) |                       |                              |                                                         |                  Alphanumeric identifier of the entity                   |                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                 |
|            Descrição            | Texto Curto (String) |                       |                              |                                                         |                 Optional short description of the record                 |                                                                 A description is limited to 255 characters.                                                                  |
|              Ativo              |       Sim-Não        |          (Y)          |                              |                                                         |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|            Programar            |    Tabela Direta     |                       | adschedule\_adalertprocessor | AD\_Schedule.IsSystemSchedule='N' OR @AD\_Client\_ID@=0 |                                                                          |                                                                                                                                                                              |
|           Supervisor            |        Tabela        | AD\_User - Supervisor |   aduser\_calertprocessor    |                                                         | Supervisor for this user/organization - used for escalation and approval |                               The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                               |
| Dias para manter registro (log) |       Inteiro        |          (7)          |                              |                                                         |                  Number of days to keep the log entries                  |                                                                       Older Log entries may be deleted                                                                       |
|  Data do último processamento   |      Data+Hora       |                       |                              |                                                         |                      Date the process was last run.                      |                                                      The Date Last Run indicates the last time that a process was run.                                                       |
|    Data da Próxima Execução     |      Data+Hora       |                       |                              |                                                         |                      Date the process will run next                      |                                                       The Date Next Run indicates the next time this process will run.                                                       |

</div>

</div>

  

<div id="d177849e266" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Registro - AD\_AlertProcessorLog

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_AlertProcessorLog_data)

<span class="emphasis">*Descrição:*</span> Registro (log) do Processador
de Alertas

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d177849e279" class="table">

<div class="table-title">

Table 1.2. Log
Fields

</div>

<div class="table-contents">

|              Nome do campo               |            Referência             |  Valores (Padrão)  |   Chave restritiva   |                Regra de validação                |                   Descrição                    |                          Comentário/Ajuda                           |
| :--------------------------------------: | :-------------------------------: | :----------------: | :------------------: | :----------------------------------------------: | :--------------------------------------------: | :-----------------------------------------------------------------: |
|              Dados Binários              |              Binário              |                    |                      |                                                  |                  Binary Data                   |                The Binary field stores binary data.                 |
|                  Ativo                   |              Sim-Não              |        (Y)         |                      |                                                  |       (semelhante ao primeiro relatório)       |                         (ver o mesmo acima)                         |
| Registro (log) do Processador de Alertas |                ID                 |                    |                      |                                                  | Result of the execution of the Alert Processor |           Result of the execution of the Alert Processor            |
|                 Empresa                  |           Tabela Direta           | (@AD\_Client\_ID@) |                      |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)       |                         (ver o mesmo acima)                         |
|               Organização                |           Tabela Direta           |  (@AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)       |                         (ver o mesmo acima)                         |
|          Processador de Alertas          |           Tabela Direta           |                    | calertprocessor\_log |                                                  |        Alert Processor/Server Parameter        |                  Alert Processor/Server Parameter                   |
|                  Criado                  |             Data+Hora             |     (SYSDATE)      |                      |                                                  |          Date this record was created          | The Created field indicates the date that this record was created.  |
|                  Resumo                  | Texto Médio (até 2000 caracteres) |                    |                      |                                                  |        Textual summary of this request         | The Summary allows free form text entry of a recap of this request. |
|                   Erro                   |              Sim-Não              |                    |                      |                                                  |       An Error occurred in the execution       |                                                                     |
|                Referência                |       Texto Curto (String)        |                    |                      |                                                  |           Reference for this record            |         The Reference displays the source document number.          |
|            Texto de Mensagem             | Texto Médio (até 2000 caracteres) |                    |                      |                                                  |                  Text Message                  |                                                                     |
|                Descrição                 |       Texto Curto (String)        |                    |                      |                                                  |    Optional short description of the record    |             A description is limited to 255 characters.             |
|        AD\_AlertProcessorLog\_UU         |       Texto Curto (String)        |                    |                      |                                                  |                                                |                                                                     |

</div>

</div>

  

</div>
