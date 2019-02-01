---
title: "Processo de Fluxo de Trabalho"
id: ProcessodeFluxodeTrabalho
---
<div id="d180374e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processo de Fluxo de Trabalho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processo -
    AD\_WF\_Process](#d180374e23)</span>
  - <span class="section">[2. Tabela: Atividade -
    AD\_WF\_Activity](#d180374e312)</span>
  - <span class="section">[3. Tabela: Approver -
    AD\_WF\_ActivityApprover](#d180374e689)</span>
  - <span class="section">[4. Tabela: Resultado -
    AD\_WF\_ActivityResult](#d180374e829)</span>
  - <span class="section">[5. Tabela: Evento -
    AD\_WF\_EventAudit](#d180374e1001)</span>
  - <span class="section">[6. Tabela: Dados -
    AD\_WF\_ProcessData](#d180374e1337)</span>

</div>

<span class="emphasis">*Descrição:* </span> Monitorar Processos de Fluxo
de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span>Visualizar e Gerenciar
Informações da Instância de Processo de Fluxo de Trabalho

<span class="emphasis"> *Criado em:* </span>2004-01-01 23:41:09.0

<span class="emphasis">*Atualizado em:* </span>2005-02-09 22:16:14.0

![](/img/manual/ProcessodeFluxodeTrabalho.png)

<div id="d180374e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processo - AD\_WF\_Process

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WF_Process_data)

<span class="emphasis">*Descrição:*</span> Instância de Processo de
Fluxo de Trabalho Real

<span class="emphasis">*Comentário/Ajuda:* </span> Instância de execução
de fluxo de trabalho

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d180374e40" class="table">

<div class="table-title">

Table 1.1. Process
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |                      Valores (Padrão)                       |       Chave restritiva       |                Regra de validação                |                            Descrição                            |                                                                                                   Comentário/Ajuda                                                                                                   |
| :--------------------------------: | :-------------------------------: | :---------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :-------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|               Ativo                |              Sim-Não              |                             (Y)                             |                              |                                                  |               (semelhante ao primeiro relatório)                |                                                                                                 (ver o mesmo acima)                                                                                                  |
|   Processo de Fluxo de Trabalho    |           Tabela Direta           |                                                             |   adwfprocess\_adwfprocess   |                                                  |                Actual Workflow Process Instance                 |                                                                                           Instance of a workflow execution                                                                                           |
|              Empresa               |           Tabela Direta           |                    (@\#AD\_Client\_ID@)                     |      wf\_instanceclient      |        AD\_Client.AD\_Client\_ID \< \> 0         |               (semelhante ao primeiro relatório)                |                                                                                                 (ver o mesmo acima)                                                                                                  |
|            Organização             |           Tabela Direta           |                      (@\#AD\_Org\_ID@)                      |       wf\_instanceorg        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |               (semelhante ao primeiro relatório)                |                                                                                                 (ver o mesmo acima)                                                                                                  |
|         Fluxo de Trabalho          |           Tabela Direta           |                                                             |   adworkflow\_adwfprocess    |                                                  |                Workflow or combination of tasks                 |                                                                            The Workflow field identifies a unique Workflow in the system.                                                                            |
|             Prioridade             |              Inteiro              |                                                             |                              |                                                  | Indicates if this request is of a high, medium or low priority. |                                                                                The Priority indicates the importance of this request.                                                                                |
|               Criado               |             Data+Hora             |                          (SYSDATE)                          |                              |                                                  |                  Date this record was created                   |                                                                          The Created field indicates the date that this record was created.                                                                          |
|    Estado do Fluxo de Trabalho     |               Lista               | Abortado Completado Terminado Não Iniciado Rodando Suspenso |                              |                                                  |             State of the execution of the workflow              |                                                                                                                                                                                                                      |
| Responsável pelo Fluxo de Trabalho |           Tabela Direta           |                                                             | adwfresponsible\_adwfprocess |                                                  |               Responsible for Workflow Execution                |                                     The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.                                      |
|          Usuário/Contato           |             Procurar              |                     AD\_User - Internal                     |     aduser\_adwfprocess      |                                                  |  User within the system - Internal or Business Partner Contact  |                                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                     |
|               Tabela               |             Procurar              |                                                             |     adtable\_adwfprocess     |                                                  |                   Database Table information                    |                                                                         The Database Table provides the information of the table definition                                                                          |
|           ID do Registro           |               Botão               |                                                             |                              |                                                  |                    Direct internal record ID                    | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|              Mensagem              |           Tabela Direta           |                                                             |    admessage\_adwfprocess    |                                                  |                         System Message                          |                                                                                            Information and Error messages                                                                                            |
|         Texto de Mensagem          | Texto Médio (até 2000 caracteres) |                                                             |                              |                                                  |                          Text Message                           |                                                                                                                                                                                                                      |
|        Gerenciar Processos         |               Botão               |                                                             |                              |                                                  |                                                                 |                                                                                                                                                                                                                      |
|             Processado             |              Sim-Não              |                                                             |                              |                                                  |                 The document has been processed                 |                                                                         The Processed checkbox indicates that a document has been processed.                                                                         |
|        AD\_WF\_Process\_UU         |       Texto Curto (String)        |                                                             |                              |                                                  |                                                                 |                                                                                                                                                                                                                      |

</div>

</div>

  

<div id="d180374e312" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Atividade - AD\_WF\_Activity

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WF_Activity_data)

<span class="emphasis">*Descrição:*</span> Atividade de Fluxo de
Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> A Atividade do Fluxo
de Trabalho é o Nó de Fluxo de Trabalho real em uma Instância de
Processo de Fluxo de Trabalho

<span class="emphasis">*Coluna linkada:* </span> Workflow Process

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d180374e333" class="table">

<div class="table-title">

Table 1.2. Activity
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |                      Valores (Padrão)                       |       Chave restritiva        |                Regra de validação                |                            Descrição                            |                                                                                                   Comentário/Ajuda                                                                                                   |
| :--------------------------------: | :-------------------------------: | :---------------------------------------------------------: | :---------------------------: | :----------------------------------------------: | :-------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|               Ativo                |              Sim-Não              |                             (Y)                             |                               |                                                  |               (semelhante ao primeiro relatório)                |                                                                                                 (ver o mesmo acima)                                                                                                  |
|        AD\_WF\_Activity\_UU        |       Texto Curto (String)        |                                                             |                               |                                                  |                                                                 |                                                                                                                                                                                                                      |
|      Início Prioridade Dinâm.      |              Inteiro              |                                                             |                               |                                                  |          Starting priority before changed dynamically           |                                                                                                                                                                                                                      |
|              Empresa               |           Tabela Direta           |                    (@\#AD\_Client\_ID@)                     |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |               (semelhante ao primeiro relatório)                |                                                                                                 (ver o mesmo acima)                                                                                                  |
|            Organização             |           Tabela Direta           |                      (@\#AD\_Org\_ID@)                      |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |               (semelhante ao primeiro relatório)                |                                                                                                 (ver o mesmo acima)                                                                                                  |
|   Processo de Fluxo de Trabalho    |           Tabela Direta           |                                                             |   adwfprocess\_adwfactivity   |                                                  |                Actual Workflow Process Instance                 |                                                                                           Instance of a workflow execution                                                                                           |
|                 Nó                 |           Tabela Direta           |                                                             |    adwfnode\_adwfactivity     |                                                  |            Workflow Node (activity), step or process            |                                                                         The Workflow Node indicates a unique step or process in a Workflow.                                                                          |
|             Prioridade             |              Inteiro              |                                                             |                               |                                                  | Indicates if this request is of a high, medium or low priority. |                                                                                The Priority indicates the importance of this request.                                                                                |
|               Criado               |             Data+Hora             |                          (SYSDATE)                          |                               |                                                  |                  Date this record was created                   |                                                                          The Created field indicates the date that this record was created.                                                                          |
|    Estado do Fluxo de Trabalho     |               Lista               | Abortado Completado Terminado Não Iniciado Rodando Suspenso |                               |                                                  |             State of the execution of the workflow              |                                                                                                                                                                                                                      |
|          Final de Espera           |             Data+Hora             |                                                             |                               |                                                  |                        End of sleep time                        |                                                                                              End of suspension (sleep)                                                                                               |
|         Fluxo de Trabalho          |           Tabela Direta           |                                                             |   adworkflow\_adwfactivity    |                                                  |                Workflow or combination of tasks                 |                                                                            The Workflow field identifies a unique Workflow in the system.                                                                            |
| Responsável pelo Fluxo de Trabalho |           Tabela Direta           |                                                             | adwfresponsible\_adwfactivity |                                                  |               Responsible for Workflow Execution                |                                     The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.                                      |
|          Usuário/Contato           |             Procurar              |                     AD\_User - Internal                     |     aduser\_adwfactivity      |                                                  |  User within the system - Internal or Business Partner Contact  |                                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                     |
|               Perfil               |           Tabela Direta           |                                                             |     ADRole\_ADWFActivity      |                                                  |                       Responsibility Role                       |                                                              The Role determines security and access a user who has this Role will have in the System.                                                               |
|               Tabela               |             Procurar              |                                                             |     adtable\_adwfactivity     |                                                  |                   Database Table information                    |                                                                         The Database Table provides the information of the table definition                                                                          |
|           ID do Registro           |               Botão               |                                                             |                               |                                                  |                    Direct internal record ID                    | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|              Mensagem              |           Tabela Direta           |                                                             |    admessage\_adwfactivity    |                                                  |                         System Message                          |                                                                                            Information and Error messages                                                                                            |
|           Último Alerta            |               Data                |                                                             |                               |                                                  |                 Date when last alert were sent                  |                                                                             The last alert date is updated when a reminder email is sent                                                                             |
|         Texto de Mensagem          | Texto Médio (até 2000 caracteres) |                                                             |                               |                                                  |                          Text Message                           |                                                                                                                                                                                                                      |
|        Gerenciar Atividade         |               Botão               |                                                             |                               |                                                  |                                                                 |                                                                                                                                                                                                                      |
|             Processado             |              Sim-Não              |                                                             |                               |                                                  |                 The document has been processed                 |                                                                         The Processed checkbox indicates that a document has been processed.                                                                         |
|   Atividade de Fluxo de Trabalho   |                ID                 |                                                             |                               |                                                  |                        Workflow Activity                        |                                                                   The Workflow Activity is the actual Workflow Node in a Workflow Process instance                                                                   |

</div>

</div>

  

<div id="d180374e689" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Approver - AD\_WF\_ActivityApprover

</div>

</div>

</div>

<span class="emphasis">*Lógica de visualização:*</span> 1=1

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d180374e700" class="table">

<div class="table-title">

Table 1.3. Approver
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                          Regra de validação                                                           |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :----------------------------: | :------------------: | :------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|  AD\_WF\_ActivityApprover\_UU  | Texto Curto (String) |                      |                                 |                                                                                                                                       |                                                               |                                                                                                               |
|   Workflow Activity Approver   |          ID          |                      |                                 |                                                                                                                                       |                                                               |                                                                                                               |
|            Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|          Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
| Atividade de Fluxo de Trabalho |    Tabela Direta     |                      | ADWFActivity\_ADWFActivityAppro |                                                                                                                                       |                       Workflow Activity                       |               The Workflow Activity is the actual Workflow Node in a Workflow Process instance                |
|        Usuário/Contato         |       Procurar       |                      |  ADUser\_ADWFActivityApprover   | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|             Ativo              |       Sim-Não        |         (Y)          |                                 |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |

</div>

</div>

  

<div id="d180374e829" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Resultado - AD\_WF\_ActivityResult

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Resultado da Atividade do
Processo de Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> Resultado da
Atividade da execução da Instância de Processo de Fluxo de Trabalho

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d180374e844" class="table">

<div class="table-title">

Table 1.4. Result
Fields

</div>

<div class="table-contents">

|                Nome do campo                |            Referência             |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                Descrição                 |                                                                         Comentário/Ajuda                                                                         |
| :-----------------------------------------: | :-------------------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                    Ativo                    |              Sim-Não              |        (Y)         |                             |                                                  |    (semelhante ao primeiro relatório)    |                                                                       (ver o mesmo acima)                                                                        |
| Resultado da Atividade de Fluxo de Trabalho |                ID                 |                    |                             |                                                  | Result of the Workflow Process Activity  |                                                Activity Result of the execution of the Workflow Process Instance                                                 |
|                   Empresa                   |           Tabela Direta           | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                       (ver o mesmo acima)                                                                        |
|                 Organização                 |           Tabela Direta           |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                       (ver o mesmo acima)                                                                        |
|       Atividade de Fluxo de Trabalho        |           Tabela Direta           |                    | adwfactivity\_adwfactresult |                                                  |            Workflow Activity             |                                         The Workflow Activity is the actual Workflow Node in a Workflow Process instance                                         |
|              Nome do Atributo               |       Texto Curto (String)        |                    |                             |                                                  |          Name of the Attribute           |                                                                   Identifier of the attribute                                                                    |
|              Valor de Atributo              |       Texto Curto (String)        |                    |                             |                                                  |          Value of the Attribute          | iDempiere converts the (string) field values to the attribute data type. Booleans (Yes-No) may have the values "true" and "false", the date format is YYYY-MM-DD |
|                  Descrição                  |       Texto Curto (String)        |                    |                             |                                                  | Optional short description of the record |                                                           A description is limited to 255 characters.                                                            |
|              Comentário/Ajuda               | Texto Médio (até 2000 caracteres) |                    |                             |                                                  |             Comment or Hint              |                                           The Help field contains a hint, comment or help about the use of this item.                                            |

</div>

</div>

  

<div id="d180374e1001" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Evento - AD\_WF\_EventAudit

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WF_EventAudit_data)

<span class="emphasis">*Descrição:*</span> Informação de Auditoria de
Eventos de Atividade do Processo de Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> Histórico de
alterações de Atividade do Processo de Fluxo de Trabalho

<span class="emphasis">*Coluna linkada:* </span> Workflow Process

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d180374e1022" class="table">

<div class="table-title">

Table 1.5. Event
Fields

</div>

<div class="table-contents">

|             Nome do campo              |            Referência             |                      Valores (Padrão)                       |       Chave restritiva        |                Regra de validação                |                           Descrição                           |                                                                                                   Comentário/Ajuda                                                                                                   |
| :------------------------------------: | :-------------------------------: | :---------------------------------------------------------: | :---------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                 Ativo                  |              Sim-Não              |                             (Y)                             |                               |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|                Empresa                 |           Tabela Direta           |                     (@AD\_Client\_ID@)                      |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|              Organização               |           Tabela Direta           |                       (@AD\_Org\_ID@)                       |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Processo de Fluxo de Trabalho      |           Tabela Direta           |                                                             |  adwfprocess\_adwfeventaudit  |                                                  |               Actual Workflow Process Instance                |                                                                                           Instance of a workflow execution                                                                                           |
|                   Nó                   |           Tabela Direta           |                                                             |   adwfnode\_adwfeventaudit    |                                                  |           Workflow Node (activity), step or process           |                                                                         The Workflow Node indicates a unique step or process in a Workflow.                                                                          |
|      Estado do Fluxo de Trabalho       |               Lista               | Abortado Completado Terminado Não Iniciado Rodando Suspenso |                               |                                                  |            State of the execution of the workflow             |                                                                                                                                                                                                                      |
|   Responsável pelo Fluxo de Trabalho   |           Tabela Direta           |                                                             | adwfresponsib\_adwfeventaudit |                                                  |              Responsible for Workflow Execution               |                                     The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.                                      |
|            Usuário/Contato             |             Procurar              |                          AD\_User                           |    aduser\_adwfeventaudit     |                                                  | User within the system - Internal or Business Partner Contact |                                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                     |
|                 Tabela                 |           Tabela Direta           |                                                             |    adtable\_adwfeventaudit    |                                                  |                  Database Table information                   |                                                                         The Database Table provides the information of the table definition                                                                          |
|             ID do Registro             |               Botão               |                                                             |                               |                                                  |                   Direct internal record ID                   | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|             Tipo de Evento             |               Lista               |     Processo Criado Processo Completado Estado Alterado     |                               |                                                  |                         Type of Event                         |                                                                                                                                                                                                                      |
|            Nome do Atributo            |       Texto Curto (String)        |                                                             |                               |                                                  |                     Name of the Attribute                     |                                                                                             Identifier of the attribute                                                                                              |
|               Novo Valor               |       Texto Curto (String)        |                                                             |                               |                                                  |                        New field value                        |                                                                                            New data entered in the field                                                                                             |
|              Valor Antigo              |       Texto Curto (String)        |                                                             |                               |                                                  |                       The old file data                       |                                                                                          Old data overwritten in the field                                                                                           |
|               Descrição                |       Texto Curto (String)        |                                                             |                               |                                                  |           Optional short description of the record            |                                                                                     A description is limited to 255 characters.                                                                                      |
|           Texto de Mensagem            | Texto Médio (até 2000 caracteres) |                                                             |                               |                                                  |                         Text Message                          |                                                                                                                                                                                                                      |
|         Tempo Decorrido \[ms\]         |              Número               |                                                             |                               |                                                  |                 Elapsed Time in milli seconds                 |                                                                                            Elapsed Time in milli seconds                                                                                             |
|                 Criado                 |             Data+Hora             |                          (SYSDATE)                          |                               |                                                  |                 Date this record was created                  |                                                                          The Created field indicates the date that this record was created.                                                                          |
| Auditor de Evento de Fluxo de Trabalho |                ID                 |                                                             |                               |                                                  |       Workflow Process Activity Event Audit Information       |                                                                                 History of changes of the Workflow Process Activity                                                                                  |
|         AD\_WF\_EventAudit\_UU         |       Texto Curto (String)        |                                                             |                               |                                                  |                                                               |                                                                                                                                                                                                                      |

</div>

</div>

  

<div id="d180374e1337" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Dados - AD\_WF\_ProcessData

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Contexto do Processo de Fluxo
de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> Informação de
Contexto do Processo de Fluxo de Trabalho e atividade

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d180374e1352" class="table">

<div class="table-title">

Table 1.6. Data
Fields

</div>

<div class="table-contents">

|             Nome do campo              |      Referência      |  Valores (Padrão)  |       Chave restritiva        |                Regra de validação                |             Descrição              |                                                                         Comentário/Ajuda                                                                         |
| :------------------------------------: | :------------------: | :----------------: | :---------------------------: | :----------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                 Ativo                  |       Sim-Não        |        (Y)         |                               |                                                  | (semelhante ao primeiro relatório) |                                                                       (ver o mesmo acima)                                                                        |
| Dados de Processo de Fluxo de Trabalho |          ID          |                    |                               |                                                  |      Workflow Process Context      |                                                     Context information of the workflow process and activity                                                     |
|                Empresa                 |    Tabela Direta     | (@AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                       (ver o mesmo acima)                                                                        |
|              Organização               |    Tabela Direta     |  (@AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                       (ver o mesmo acima)                                                                        |
|     Processo de Fluxo de Trabalho      |    Tabela Direta     |                    | adwfproccess\_adwfprocessdata |                                                  |  Actual Workflow Process Instance  |                                                                 Instance of a workflow execution                                                                 |
|            Nome do Atributo            | Texto Curto (String) |                    |                               |                                                  |       Name of the Attribute        |                                                                   Identifier of the attribute                                                                    |
|           Valor de Atributo            | Texto Curto (String) |                    |                               |                                                  |       Value of the Attribute       | iDempiere converts the (string) field values to the attribute data type. Booleans (Yes-No) may have the values "true" and "false", the date format is YYYY-MM-DD |

</div>

</div>

  

</div>
