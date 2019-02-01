---
title: "Aviso"
id: Aviso
---
<div id="d15243e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Aviso

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Aviso -
    AD\_Note](#d15243e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Ver Avisos de Sistema

<span class="emphasis">*Comentário/Ajuda:* </span>O sistema cria
mensagens ao executar processos. Nesta janela você pode visualizá-las.

<span class="emphasis"> *Criado em:* </span>2000-12-18 22:09:08.0

<span class="emphasis">*Atualizado em:* </span>2005-02-09 22:27:25.0

![](/img/manual/Aviso.png)

<div id="d15243e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Aviso - AD\_Note

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Note_data)

<span class="emphasis">*Descrição:*</span> Aviso do Sistema

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Aviso" fornece
um método de visualização das mensagens que são geradas por este sistema
ao executar processos.

<span class="emphasis">*Claúsula Where:*</span> ((AD\_Note.AD\_User\_ID
IN (0,@\#AD\_User\_ID@) OR AD\_Note.AD\_User\_ID IS NULL) AND
AD\_Note.AD\_BroadcastMessage\_ID IS NULL)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d15243e44" class="table">

<div class="table-title">

Table 1.1. Notice
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                           Descrição                           |                                                                                                   Comentário/Ajuda                                                                                                   |
| :----------------------------: | :-------------------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Aviso              |                ID                 |                      |                            |                                                  |                         System Notice                         |                                                                                                                                                                                                                      |
|             Ativo              |              Sim-Não              |         (Y)          |                            |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Mensagem de Broadcast      |           Tabela Direta           |                      | adbroadcastmessage\_adnote |                                                  |                       Broadcast Message                       |                                                                                                                                                                                                                      |
|            Empresa             |           Tabela Direta           | (@\#AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|          Organização           |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|            Mensagem            |              Tabela               |     AD\_Message      |     admessage\_adnote      |                                                  |                        System Message                         |                                                                                            Information and Error messages                                                                                            |
|             Criado             |             Data+Hora             |      (SYSDATE)       |                            |                                                  |                 Date this record was created                  |                                                                          The Created field indicates the date that this record was created.                                                                          |
|        Usuário/Contato         |           Tabela Direta           |                      |       aduser\_adnote       |                                                  | User within the system - Internal or Business Partner Contact |                                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                     |
| Atividade de Fluxo de Trabalho |           Tabela Direta           |                      |    adwfactivity\_adnote    |                                                  |                       Workflow Activity                       |                                                                   The Workflow Activity is the actual Workflow Node in a Workflow Process instance                                                                   |
|             Tabela             |           Tabela Direta           |                      |      adtable\_adnote       |                                                  |                  Database Table information                   |                                                                         The Database Table provides the information of the table definition                                                                          |
|         ID do Registro         |               Botão               |                      |                            |                                                  |                   Direct internal record ID                   | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|           Referência           |       Texto Curto (String)        |                      |                            |                                                  |                   Reference for this record                   |                                                                                  The Reference displays the source document number.                                                                                  |
|       Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                      |                            |                                                  |                         Text Message                          |                                                                                                                                                                                                                      |
|           Descrição            |       Texto Curto (String)        |                      |                            |                                                  |           Optional short description of the record            |                                                                                     A description is limited to 255 characters.                                                                                      |
|          Reconhecido           |              Sim-Não              |                      |                            |                                                  |                The document has been processed                |                                                                         The Processed checkbox indicates that a document has been processed.                                                                         |
|         Apagar Avisos          |               Botão               |                      |                            |                                                  |                                                               |                                                                                                                                                                                                                      |

</div>

</div>

  

</div>
