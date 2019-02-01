---
title: "Processador de Solicitação"
id: ProcessadordeSolicitacao
---
<div id="d179410e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador de Solicitação -
    R\_RequestProcessor](#d179410e23)</span>
  - <span class="section">[2. Tabela: Roteamento -
    R\_RequestProcessor\_Route](#d179410e345)</span>
  - <span class="section">[3. Tabela: Registro -
    R\_RequestProcessorLog](#d179410e533)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir Processadores de
Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span>A janela "Processador
de Solicitação" permite a você definir os diferentes processos que você
quer que ocorram e a freqüência e horário desses processos. Um
Processador de Solicitação pode ser apenas para um tipo de solicitação
específico ou para todos.

<span class="emphasis"> *Criado em:* </span>2001-01-11 17:35:36.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ProcessadordeSolicitacao.png)

<div id="d179410e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador de Solicitação - R\_RequestProcessor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_RequestProcessor_data)

<span class="emphasis">*Descrição:*</span> Processador de Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Processador de
Solicitação" permite a você definir os processos que você deseja que
ocorram, assim como a freqüência e horário destes processos. Se não for
encontrado nenhum outro usuário, os itens são designados ao supervisor.
Um Processador de Solicitação pode ser apenas para um tipo específico de
solicitação ou para todos.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d179410e40" class="table">

<div class="table-title">

Table 1.1. Request Processor
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                   Regra de validação                    |                                Descrição                                 |                                                                               Comentário/Ajuda                                                                               |
| :-----------------------------: | :------------------: | :------------------: | :-----------------------------: | :-----------------------------------------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Processador de Solicitação    |          ID          |                      |                                 |                                                         |                          Processor for Requests                          |                                                                            Processor for Requests                                                                            |
|       Tipo de Freqüência        |        Lista         |   Dia Hora Minuto    |                                 |                                                         |                            Frequency of event                            |                                                    The frequency type is used for calculating the date of the next event.                                                    |
|         Processar Agora         |        Botão         |                      |                                 |                                                         |                                                                          |                                                                                                                                                                              |
|           Freqüência            |       Inteiro        |         (1)          |                                 |                                                         |                           Frequency of events                            | The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks. |
|             Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |            AD\_Client.AD\_Client\_ID \< \> 0            |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|           Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)     |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|              Nome               | Texto Curto (String) |                      |                                 |                                                         |                  Alphanumeric identifier of the entity                   |                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                 |
|            Descrição            | Texto Curto (String) |                      |                                 |                                                         |                 Optional short description of the record                 |                                                                 A description is limited to 255 characters.                                                                  |
|              Ativo              |       Sim-Não        |         (Y)          |                                 |                                                         |                    (semelhante ao primeiro relatório)                    |                                                                             (ver o mesmo acima)                                                                              |
|       Tipo de Solicitação       |    Tabela Direta     |                      | rrequesttype\_rrequestprocessor |                                                         |              Type of request (e.g. Inquiry, Complaint, ..)               |                              Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.                              |
|            Programar            |    Tabela Direta     |                      |  adschedule\_rrequestprocessor  | AD\_Schedule.IsSystemSchedule='N' OR @AD\_Client\_ID@=0 |                                                                          |                                                                                                                                                                              |
|   Alertar após Dias em Atraso   |       Inteiro        |         (0)          |                                 |                                                         |         Send email alert after number of days due (0=no alerts)          |                                    Send an email alert after the item is Due (after Date Next Action). If set to zero, no alert is sent.                                     |
|        Dias de Lembrete         |       Inteiro        |         (0)          |                                 |                                                         |   Days between sending Reminder Emails for a due or inactive Document    |      When a document is due for too long without activity, a reminder is sent. 0 means no reminders. The Remind Days are the days when the next email reminder is sent.      |
|   Escalar após Dias de Atraso   |       Inteiro        |         (0)          |                                 |                                                         |         Escalation to superior after number of due days (0 = no)         |                          The item will be escalated and assigned to the supervisor after the number of days over due. If 0, there is no escalation.                          |
|           Supervisor            |        Tabela        | AD\_User - Internal  |    aduser\_rrequestprocessor    |                                                         | Supervisor for this user/organization - used for escalation and approval |                               The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                               |
|  Dias de Alerta de Inatividade  |       Inteiro        |         (0)          |                                 |                                                         |      Send Alert when there is no activity after days (0= no alert)       |                                          An email alert is sent when the request shows no activity for the number of days defined.                                           |
| Dias para manter registro (log) |       Inteiro        |         (7)          |                                 |                                                         |                  Number of days to keep the log entries                  |                                                                       Older Log entries may be deleted                                                                       |
|  Data do último processamento   |      Data+Hora       |                      |                                 |                                                         |                      Date the process was last run.                      |                                                      The Date Last Run indicates the last time that a process was run.                                                       |
|    Data da Próxima Execução     |      Data+Hora       |                      |                                 |                                                         |                      Date the process will run next                      |                                                       The Date Next Run indicates the next time this process will run.                                                       |

</div>

</div>

  

<div id="d179410e345" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Roteamento - R\_RequestProcessor\_Route

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_RequestProcessor_Route_data)

<span class="emphasis">*Descrição:*</span> Encaminhamento de Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span> Define a seqüência de
tipos de solicitação e palavras chave e para quem as solicitações da web
e e-mail devem ser encaminhadas. As palavras-chave são separadas por um
espaço, vírgula, ponto e vírgula, tabulação ou nova linha. A primeira
coincidência vence (primeiramente o tipo de solicitação e então a
palavra chave).

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d179410e362" class="table">

<div class="table-title">

Table 1.2. Routing
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |  Valores (Padrão)  |        Chave restritiva        |                                                          Regra de validação                                                           |                           Descrição                           |                                                                                                               Comentário/Ajuda                                                                                                               |
| :----------------------------: | :------------------: | :----------------: | :----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Encaminhamento de Solicitação  |          ID          |                    |                                |                                                                                                                                       |                 Automatic routing of requests                 |                                                                                                                                                                                                                                              |
|            Empresa             |    Tabela Direta     | (@AD\_Client\_ID@) |                                |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                                                                                             (ver o mesmo acima)                                                                                                              |
|          Organização           |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                                                                                             (ver o mesmo acima)                                                                                                              |
|   Processador de Solicitação   |    Tabela Direta     |                    |    rrequestprocessor\_route    |                                                                                                                                       |                    Processor for Requests                     |                                                                                                            Processor for Requests                                                                                                            |
|             Ativo              |       Sim-Não        |        (Y)         |                                |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                                                                                             (ver o mesmo acima)                                                                                                              |
|           Seqüência            |       Inteiro        |                    |                                |                                                                                                                                       |     Method of ordering records; lowest number comes first     |                                                                                                 The Sequence indicates the order of records                                                                                                  |
|      Tipo de Solicitação       |    Tabela Direta     |                    |  rrequesttype\_rprocessorrule  |                                                                                                                                       |         Type of request (e.g. Inquiry, Complaint, ..)         |                                                              Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.                                                              |
|         Palavra-Chave          | Texto Curto (String) |                    |                                |                                                                                                                                       |                   Case insensitive keyword                    | Case insensitive keyword for matching. The individual keywords can be separated by space, comma, semicolon, tab or new line. Do not use filler words like "a", "the". At this point, there are NO text search operators like "or" and "and". |
|        Usuário/Contato         |    Tabela Direta     |                    | aduser\_rrequestprocessorroute | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) | User within the system - Internal or Business Partner Contact |                                                                The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                 |
| R\_RequestProcessor\_Route\_UU | Texto Curto (String) |                    |                                |                                                                                                                                       |                                                               |                                                                                                                                                                                                                                              |

</div>

</div>

  

<div id="d179410e533" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Registro - R\_RequestProcessorLog

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_RequestProcessorLog_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d179410e542" class="table">

<div class="table-title">

Table 1.3. Log
Fields

</div>

<div class="table-contents">

|                Nome do campo                 |            Referência             |  Valores (Padrão)  |    Chave restritiva    |                Regra de validação                |                    Descrição                     |                          Comentário/Ajuda                           |
| :------------------------------------------: | :-------------------------------: | :----------------: | :--------------------: | :----------------------------------------------: | :----------------------------------------------: | :-----------------------------------------------------------------: |
| Registro (log) do Processador de Solicitação |                ID                 |                    |                        |                                                  | Result of the execution of the Request Processor |          Result of the execution of the Request Processor           |
|                Dados Binários                |              Binário              |                    |                        |                                                  |                   Binary Data                    |                The Binary field stores binary data.                 |
|                    Ativo                     |              Sim-Não              |        (Y)         |                        |                                                  |        (semelhante ao primeiro relatório)        |                         (ver o mesmo acima)                         |
|                   Empresa                    |           Tabela Direta           | (@AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)        |                         (ver o mesmo acima)                         |
|                 Organização                  |           Tabela Direta           |  (@AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)        |                         (ver o mesmo acima)                         |
|          Processador de Solicitação          |           Tabela Direta           |                    | rrequestprocessor\_log |                                                  |              Processor for Requests              |                       Processor for Requests                        |
|                    Criado                    |             Data+Hora             |     (SYSDATE)      |                        |                                                  |           Date this record was created           | The Created field indicates the date that this record was created.  |
|                    Resumo                    | Texto Médio (até 2000 caracteres) |                    |                        |                                                  |         Textual summary of this request          | The Summary allows free form text entry of a recap of this request. |
|                     Erro                     |              Sim-Não              |                    |                        |                                                  |        An Error occurred in the execution        |                                                                     |
|                  Referência                  |       Texto Curto (String)        |                    |                        |                                                  |            Reference for this record             |         The Reference displays the source document number.          |
|              Texto de Mensagem               | Texto Médio (até 2000 caracteres) |                    |                        |                                                  |                   Text Message                   |                                                                     |
|                  Descrição                   |       Texto Curto (String)        |                    |                        |                                                  |     Optional short description of the record     |             A description is limited to 255 characters.             |
|          R\_RequestProcessorLog\_UU          |       Texto Curto (String)        |                    |                        |                                                  |                                                  |                                                                     |

</div>

</div>

  

</div>
