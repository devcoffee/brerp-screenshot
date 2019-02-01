---
title: "Agendador"
id: Agendador
---
<div id="d2364e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Agendador

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Agendar Processo -
    AD\_Scheduler](#d2364e23)</span>
  - <span class="section">[2. Tabela: Parâmetro -
    AD\_Scheduler\_Para](#d2364e443)</span>
  - <span class="section">[3. Tabela: Destinatário do Agendador -
    AD\_SchedulerRecipient](#d2364e607)</span>
  - <span class="section">[4. Tabela: Registro -
    AD\_SchedulerLog](#d2364e769)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Processos
de Agendamento e Registros (logs)

<span class="emphasis">*Comentário/Ajuda:* </span>Agendar Processos a
serem executados asincronamente

<span class="emphasis"> *Criado em:* </span>2004-02-19 10:53:31.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Agendador.png)

<div id="d2364e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Agendar Processo - AD\_Scheduler

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Scheduler_data)

<span class="emphasis">*Descrição:*</span> Agendar Processos

<span class="emphasis">*Comentário/Ajuda:* </span> Agendar Processos a
serem executados asincronamente

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d2364e40" class="table">

<div class="table-title">

Table 1.1. Schedule Process
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |                                Valores (Padrão)                                |        Chave restritiva         |                                                                                                                                                                                                       Regra de validação                                                                                                                                                                                                        |                                Descrição                                 |                                                                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                                                                      |
| :-----------------------------: | :------------------: | :----------------------------------------------------------------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Padrão de Agendamento do Cron  | Texto Curto (String) |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |        Cron pattern to define when the process should be invoked.        |                                                                                                                                                                                              Cron pattern to define when the process should be invoked. See http://www.sauronsoftware.it/projects/cron4j/api/it/sauronsoftware/cron4j/SchedulingPattern.html                                                                                                                                                                                               |
|         Processar Agora         |        Botão         |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|            Agendador            |          ID          |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                            Schedule Processes                            |                                                                                                                                                                                                                                                      Schedule processes to be executed asynchronously                                                                                                                                                                                                                                                      |
|       Tipo de Freqüência        |        Lista         |                                Dia Hora Minuto                                 |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                            Frequency of event                            |                                                                                                                                                                                                                                           The frequency type is used for calculating the date of the next event.                                                                                                                                                                                                                                           |
|        Day of the Month         |       Inteiro        |                                      (1)                                       |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                    Day of the month 1 to 28/29/30/31                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|         Day of the Week         |        Lista         | Segunda-feira Terça-feira Quarta-feira Quinta-feira Sexta-feira Sábado Domingo |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                             Day of the Week                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|        Tipo Programação         |        Lista         |        Cron Scheduling Pattern Freqüência Dia do Mês Dia da Semana (F)         |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                             Type of schedule                             |                                                                                                                                                                                                                                                  Define the method how the next occurrence is calculated                                                                                                                                                                                                                                                   |
|           Freqüência            |       Inteiro        |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                           Frequency of events                            |                                                                                                                                                                                        The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks.                                                                                                                                                                                        |
|             Empresa             |    Tabela Direta     |                              (@\#AD\_Client\_ID@)                              |                                 |                                                                                                                                                                                                AD\_Client.AD\_Client\_ID \< \> 0                                                                                                                                                                                                |                    (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|           Organização           |    Tabela Direta     |                               (@\#AD\_Org\_ID@)                                |                                 |                                                                                                                                                                                        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                                                                                                                         |                    (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|              Nome               | Texto Curto (String) |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                  Alphanumeric identifier of the entity                   |                                                                                                                                                                                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                        |
|            Descrição            | Texto Curto (String) |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                 Optional short description of the record                 |                                                                                                                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                                                                                                                         |
|              Ativo              |       Sim-Não        |                                      (Y)                                       |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                    (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|            Processo             |    Tabela Direta     |                                                                                |     adprocess\_adscheduler      |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                            Process or Report                             |                                                                                                                                                                                                                                           The Process field identifies a unique Process or Report in the system.                                                                                                                                                                                                                                           |
|    Modelo de Correspondência    |    Tabela Direta     |                                                                                |     RMailText\_ADScheduler      |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                       Text templates for mailings                        | The Mail Template indicates the mail template for return messages. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |
|            Programar            |    Tabela Direta     |                                                                                |     adschedule\_adscheduler     |                                                                                                                                                                                     AD\_Schedule.IsSystemSchedule='N' OR @AD\_Client\_ID@=0                                                                                                                                                                                     |                                                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|     Ignore Processing Time      |       Sim-Não        |                                      (N)                                       |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |      Do not include processing time for the DateNextRun calculation      |                                                                                                                                                                                                                     When this is selected, the previous DateNextRun is always use as the source for the next DateNextRun calculation.                                                                                                                                                                                                                      |
|     Armazenamento em Nuvem      |    Tabela Direta     |                                                                                | COFArmazenamentoNuvem\_ADSchedu |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                          Armazenamento em Nuvem                          |                                                                                                                                                                                                                                                                  Armazenamento em Nuvem.                                                                                                                                                                                                                                                                   |
|           Supervisor            |        Tabela        |                             AD\_User - Supervisor                              |       aduser\_adscheduler       |                                                                                                                                                                                                                                                                                                                                                                                                                                 | Supervisor for this user/organization - used for escalation and approval |                                                                                                                                                                                                                      The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                                                                                                                                                                                                                      |
| Dias para manter registro (log) |       Inteiro        |                                      (7)                                       |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                  Number of days to keep the log entries                  |                                                                                                                                                                                                                                                              Older Log entries may be deleted                                                                                                                                                                                                                                                              |
|  Data do último processamento   |      Data+Hora       |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                      Date the process was last run.                      |                                                                                                                                                                                                                                             The Date Last Run indicates the last time that a process was run.                                                                                                                                                                                                                                              |
|    Data da Próxima Execução     |      Data+Hora       |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                      Date the process will run next                      |                                                                                                                                                                                                                                              The Date Next Run indicates the next time this process will run.                                                                                                                                                                                                                                              |
|             Tabela              |    Tabela Direta     |                                                                                |      adtable\_adscheduler       |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                        Database Table information                        |                                                                                                                                                                                                                                            The Database Table provides the information of the table definition                                                                                                                                                                                                                                             |
|         ID do Registro          |       Inteiro        |                                                                                |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                        Direct internal record ID                         |                                                                                                                                                                    The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.                                                                                                                                                                    |
|        Tipo de Relatório        |        Lista         |                           CSV HTML PDF XLS XLSX XML                            |                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|      Formato de Impressão       |    Tabela Direta     |                                                                                |   ADPrintFormat\_ADScheduler    | (AD\_PrintFormat.JasperProcess\_ID=@AD\_Process\_ID@) OR (AD\_PrintFormat.AD\_ReportView\_ID = (select AD\_ReportView\_ID from AD\_Process where AD\_Process.AD\_Process\_ID = @AD\_Process\_ID@)) OR (AD\_PrintFormat.AD\_Table\_ID = (select AD\_Table\_ID from AD\_ReportView where AD\_ReportView.AD\_ReportView\_ID = (select AD\_ReportView\_ID from AD\_Process where AD\_Process.AD\_Process\_ID = @AD\_Process\_ID@))) |                            Data Print Format                             |                                                                                                                                                                                                                                                The print format determines how data is rendered for print.                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d2364e443" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parâmetro - AD\_Scheduler\_Para

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Scheduler_Para_data)

<span class="emphasis">*Descrição:*</span> Agendar Parâmetro

<span class="emphasis">*Comentário/Ajuda:* </span> Fornece parâmetros
para processos agendados

<span class="emphasis">*Coluna linkada:* </span> Scheduler

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d2364e464" class="table">

<div class="table-title">

Table 1.2. Parameter
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  |        Chave restritiva        |                 Regra de validação                  |                Descrição                 |                 Comentário/Ajuda                  |
| :-------------------: | :------------------: | :----------------: | :----------------------------: | :-------------------------------------------------: | :--------------------------------------: | :-----------------------------------------------: |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                                |          AD\_Client.AD\_Client\_ID \< \> 0          |    (semelhante ao primeiro relatório)    |                (ver o mesmo acima)                |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                |  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)   |    (semelhante ao primeiro relatório)    |                (ver o mesmo acima)                |
|       Agendador       |    Tabela Direta     |                    |  adscheduler\_adschedulerpara  |                                                     |            Schedule Processes            | Schedule processes to be executed asynchronously  |
| Parâmetro de Processo |    Tabela Direta     |                    | adprocesspara\_adschedulerpara | AD\_Process\_Para.AD\_Process\_ID=@AD\_Process\_ID@ |                                          |                                                   |
|         Ativo         |       Sim-Não        |        (Y)         |                                |                                                     |    (semelhante ao primeiro relatório)    |                (ver o mesmo acima)                |
|   Parâmetro Padrão    | Texto Curto (String) |                    |                                |                                                     |      Default value of the parameter      | The default value can be a variable like @\#Date@ |
| Default To Parameter  | Texto Curto (String) |                    |                                |                                                     |    Default value of the to parameter     | The default value can be a variable like @\#Date@ |
|       Descrição       | Texto Curto (String) |                    |                                |                                                     | Optional short description of the record |    A description is limited to 255 characters.    |

</div>

</div>

  

<div id="d2364e607" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Destinatário do Agendador - AD\_SchedulerRecipient

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_SchedulerRecipient_data)

<span class="emphasis">*Descrição:*</span> Destinatário da Notificação
de Agendamento

<span class="emphasis">*Comentário/Ajuda:* </span> Você pode enviar
notificações para usuários ou papéis

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d2364e624" class="table">

<div class="table-title">

Table 1.3. Scheduler Recipient
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      |  Valores (Padrão)  |       Chave restritiva       |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :------------------------: | :------------------: | :----------------: | :--------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
| Destinatário do Agendador  |          ID          |                    |                              |                                                  |            Recipient of the Scheduler Notification            |                               You can send the notifications to users or roles                                |
|          Empresa           |    Tabela Direta     | (@AD\_Client\_ID@) |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Organização         |    Tabela Direta     |  (@AD\_Org\_ID@)   |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|         Agendador          |    Tabela Direta     |                    |    adscheduler\_recipient    |                                                  |                      Schedule Processes                       |                               Schedule processes to be executed asynchronously                                |
|           Ativo            |       Sim-Não        |        (Y)         |                              |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|      Usuário/Contato       |       Procurar       |        (-1)        | aduser\_adschedulerrecipient |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|           Perfil           |    Tabela Direta     |        (-1)        | adrole\_adschedulerrecipient |            AD\_Role.IsMasterRole='N'             |                      Responsibility Role                      |           The Role determines security and access a user who has this Role will have in the System.           |
| AD\_SchedulerRecipient\_UU | Texto Curto (String) |                    |                              |                                                  |                                                               |                                                                                                               |

</div>

</div>

  

<div id="d2364e769" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Registro - AD\_SchedulerLog

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_SchedulerLog_data)

<span class="emphasis">*Descrição:*</span> Registro diário (log) do
Agendador

<span class="emphasis">*Comentário/Ajuda:* </span> Resultado da execução
do Agendador

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d2364e786" class="table">

<div class="table-title">

Table 1.4. Log
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |  Valores (Padrão)  | Chave restritiva |                Regra de validação                |                Descrição                 |                          Comentário/Ajuda                           |
| :--------------------------------: | :-------------------------------: | :----------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------: |
|               Ativo                |              Sim-Não              |        (Y)         |                  |                                                  |    (semelhante ao primeiro relatório)    |                         (ver o mesmo acima)                         |
|           Dados Binários           |              Binário              |                    |                  |                                                  |               Binary Data                |                The Binary field stores binary data.                 |
| Registro diário (log) do Agendador |                ID                 |                    |                  |                                                  | Result of the execution of the Scheduler |              Result of the execution of the Scheduler               |
|              Empresa               |           Tabela Direta           | (@AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                         (ver o mesmo acima)                         |
|            Organização             |           Tabela Direta           |  (@AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                         (ver o mesmo acima)                         |
|             Agendador              |           Tabela Direta           |                    | adscheduler\_log |                                                  |            Schedule Processes            |          Schedule processes to be executed asynchronously           |
|               Criado               |             Data+Hora             |     (SYSDATE)      |                  |                                                  |       Date this record was created       | The Created field indicates the date that this record was created.  |
|               Resumo               | Texto Médio (até 2000 caracteres) |                    |                  |                                                  |     Textual summary of this request      | The Summary allows free form text entry of a recap of this request. |
|                Erro                |              Sim-Não              |                    |                  |                                                  |    An Error occurred in the execution    |                                                                     |
|             Referência             |       Texto Curto (String)        |                    |                  |                                                  |        Reference for this record         |         The Reference displays the source document number.          |
|         Texto de Mensagem          | Texto Médio (até 2000 caracteres) |                    |                  |                                                  |               Text Message               |                                                                     |
|             Descrição              |       Texto Curto (String)        |                    |                  |                                                  | Optional short description of the record |             A description is limited to 255 characters.             |
|        AD\_SchedulerLog\_UU        |       Texto Curto (String)        |                    |                  |                                                  |                                          |                                                                     |

</div>

</div>

  

</div>
