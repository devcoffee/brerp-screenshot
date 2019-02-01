---
title: "Processador de Fluxo de Trabalho"
id: ProcessadordeFluxodeTrabalho
---
<div id="d178592e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Fluxo de Trabalho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador de Fluxo de Trabalho -
    AD\_WorkflowProcessor](#d178592e22)</span>
  - <span class="section">[2. Tabela: Registro -
    AD\_WorkflowProcessorLog](#d178592e313)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento do Processador
de Fluxo de Trabalho e Registros (logs)

<span class="emphasis">*Comentário/Ajuda:* </span>Parâmetros do Servidor
do Processador de Fluxo de Trabalho

<span class="emphasis"> *Criado em:* </span>2004-02-19 11:14:13.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d178592e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador de Fluxo de Trabalho - AD\_WorkflowProcessor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WorkflowProcessor_data)

<span class="emphasis">*Descrição:*</span> Servidor do Processador de
Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> Servidor do
Processador de Fluxo de Trabalho

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d178592e39" class="table">

<div class="table-title">

Table 1.1. Workflow Processor
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |   Valores (Padrão)    |        Chave restritiva         |                   Regra de validação                    |                                Descrição                                 |                                                                               Comentário/Ajuda                                                                               |
| :------------------------------: | :------------------: | :-------------------: | :-----------------------------: | :-----------------------------------------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Processador de Fluxo de Trabalho |          ID          |                       |                                 |                                                         |                        Workflow Processor Server                         |                                                                          Workflow Processor Server                                                                           |
|            Freqüência            |       Inteiro        |                       |                                 |                                                         |                           Frequency of events                            | The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks. |
|        Tipo de Freqüência        |        Lista         |    Dia Hora Minuto    |                                 |                                                         |                            Frequency of event                            |                                                    The frequency type is used for calculating the date of the next event.                                                    |
|         Processar Agora          |        Botão         |                       |                                 |                                                         |                                                                          |                                                                                                                                                                              |
|             Empresa              |    Tabela Direta     | (@\#AD\_Client\_ID@)  |                                 |            AD\_Client.AD\_Client\_ID \< \> 0            |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|           Organização            |    Tabela Direta     |   (@\#AD\_Org\_ID@)   |                                 |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)     |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|               Nome               | Texto Curto (String) |                       |                                 |                                                         |                  Alphanumeric identifier of the entity                   |                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                 |
|            Descrição             | Texto Curto (String) |                       |                                 |                                                         |                 Optional short description of the record                 |                                                                 A description is limited to 255 characters.                                                                  |
|              Ativo               |       Sim-Não        |          (Y)          |                                 |                                                         |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|            Programar             |    Tabela Direta     |                       | adschedule\_adworkflowprocessor | AD\_Schedule.IsSystemSchedule='N' OR @AD\_Client\_ID@=0 |                                                                          |                                                                                                                                                                              |
|  Dias de Alerta de Inatividade   |       Inteiro        |          (0)          |                                 |                                                         |      Send Alert when there is no activity after days (0= no alert)       |                                          An email alert is sent when the request shows no activity for the number of days defined.                                           |
|         Dias de Lembrete         |       Inteiro        |          (7)          |                                 |                                                         |   Days between sending Reminder Emails for a due or inactive Document    |      When a document is due for too long without activity, a reminder is sent. 0 means no reminders. The Remind Days are the days when the next email reminder is sent.      |
|            Supervisor            |        Tabela        | AD\_User - Supervisor |   aduser\_adworkflowprocessor   |                                                         | Supervisor for this user/organization - used for escalation and approval |                               The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                               |
| Dias para manter registro (log)  |       Inteiro        |          (7)          |                                 |                                                         |                  Number of days to keep the log entries                  |                                                                       Older Log entries may be deleted                                                                       |
|     Alerta sobre Prioridade      |       Inteiro        |                       |                                 |                                                         |                   Send alert email when over priority                    |                                                   Send alert email when a suspended activity is over the priority defined                                                    |
|   Data do último processamento   |      Data+Hora       |                       |                                 |                                                         |                      Date the process was last run.                      |                                                      The Date Last Run indicates the last time that a process was run.                                                       |
|     Data da Próxima Execução     |      Data+Hora       |                       |                                 |                                                         |                      Date the process will run next                      |                                                       The Date Next Run indicates the next time this process will run.                                                       |

</div>

</div>

  

<div id="d178592e313" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Registro - AD\_WorkflowProcessorLog

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WorkflowProcessorLog_data)

<span class="emphasis">*Descrição:*</span> Registro (log) do Processador
de Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> Resultado da execução
do Processador de Fluxo de Trabalho

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d178592e330" class="table">

<div class="table-title">

Table 1.2. Log
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |            Referência             |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                     Descrição                     |                          Comentário/Ajuda                           |
| :------------------------------------------------: | :-------------------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :-----------------------------------------------: | :-----------------------------------------------------------------: |
|                       Ativo                        |              Sim-Não              |        (Y)         |                          |                                                  |        (semelhante ao primeiro relatório)         |                         (ver o mesmo acima)                         |
| Registro (log) do Processador de Fluxo de Trabalho |                ID                 |                    |                          |                                                  | Result of the execution of the Workflow Processor |          Result of the execution of the Workflow Processor          |
|                   Dados Binários                   |              Binário              |                    |                          |                                                  |                    Binary Data                    |                The Binary field stores binary data.                 |
|                      Empresa                       |           Tabela Direta           | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)         |                         (ver o mesmo acima)                         |
|                    Organização                     |           Tabela Direta           |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)         |                         (ver o mesmo acima)                         |
|          Processador de Fluxo de Trabalho          |           Tabela Direta           |                    | adworkflowprocessor\_log |                                                  |             Workflow Processor Server             |                      Workflow Processor Server                      |
|                       Criado                       |             Data+Hora             |     (SYSDATE)      |                          |                                                  |           Date this record was created            | The Created field indicates the date that this record was created.  |
|                       Resumo                       | Texto Médio (até 2000 caracteres) |                    |                          |                                                  |          Textual summary of this request          | The Summary allows free form text entry of a recap of this request. |
|                        Erro                        |              Sim-Não              |                    |                          |                                                  |        An Error occurred in the execution         |                                                                     |
|                     Referência                     |       Texto Curto (String)        |                    |                          |                                                  |             Reference for this record             |         The Reference displays the source document number.          |
|                 Texto de Mensagem                  | Texto Médio (até 2000 caracteres) |                    |                          |                                                  |                   Text Message                    |                                                                     |
|                     Descrição                      |       Texto Curto (String)        |                    |                          |                                                  |     Optional short description of the record      |             A description is limited to 255 characters.             |
|            AD\_WorkflowProcessorLog\_UU            |       Texto Curto (String)        |                    |                          |                                                  |                                                   |                                                                     |

</div>

</div>

  

</div>
