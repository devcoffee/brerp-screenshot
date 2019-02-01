---
title: "Atividades de Fluxo de Trabalho (todas)"
id: AtividadesdeFluxodeTrabalhotodas
---
<div id="d9477e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Atividades de Fluxo de Trabalho (todas)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Atividade -
    AD\_WF\_Activity](#d9477e23)</span>
  - <span class="section">[2. Tabela: Approver -
    AD\_WF\_ActivityApprover](#d9477e396)</span>

</div>

<span class="emphasis">*Descrição:* </span> Monitorar todas as
atividades de Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciar todas as
atividades de Fluxo de Trabalho

<span class="emphasis"> *Criado em:* </span>2004-01-01 23:43:08.0

<span class="emphasis">*Atualizado em:* </span>2005-02-09 22:16:09.0

![](/img/manual/AtividadesdeFluxodeTrabalhotodas.png)

<div id="d9477e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Atividade - AD\_WF\_Activity

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WF_Activity_data)

<span class="emphasis">*Descrição:*</span> Atividades de Fluxo de
Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> A Atividade do Fluxo
de Trabalho é o Nó de Fluxo de Trabalho real em uma Instância de
Processo de Fluxo de Trabalho

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d9477e40" class="table">

<div class="table-title">

Table 1.1. Activity
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

  

<div id="d9477e396" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Approver - AD\_WF\_ActivityApprover

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9477e403" class="table">

<div class="table-title">

Table 1.2. Approver
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

  

</div>
