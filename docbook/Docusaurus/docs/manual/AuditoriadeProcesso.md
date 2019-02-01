---
title: "Auditoria de Processo"
id: AuditoriadeProcesso
---
<div id="d14567e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Auditoria de Processo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Auditoria de Processo -
    AD\_PInstance](#d14567e23)</span>
  - <span class="section">[2. Tabela: Parâmetros de Auditoria -
    AD\_PInstance\_Para](#d14567e267)</span>
  - <span class="section">[3. Tabela: Registro -
    AD\_PInstance\_Log](#d14567e521)</span>

</div>

<span class="emphasis">*Descrição:* </span> Usar auditoria de processo

<span class="emphasis">*Comentário/Ajuda:* </span>Informação de
Instância de Processo

<span class="emphasis"> *Criado em:* </span>2004-06-15 09:33:18.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/AuditoriadeProcesso.png)

<div id="d14567e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Auditoria de Processo - AD\_PInstance

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PInstance_data)

<span class="emphasis">*Descrição:*</span> Usar Auditoria de Processo

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d14567e36" class="table">

<div class="table-title">

Table 1.1. Process Audit
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |        Valores (Padrão)        |    Chave restritiva    |                Regra de validação                |                           Descrição                           |                                                                                                   Comentário/Ajuda                                                                                                   |
| :-------------------: | :------------------: | :----------------------------: | :--------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Instância de Processo |          ID          |                                |                        |                                                  |                    Instance of the process                    |                                                                                                                                                                                                                      |
|         Ativo         |       Sim-Não        |              (Y)               |                        |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|        Empresa        |    Tabela Direta     |      (@\#AD\_Client\_ID@)      |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|      Organização      |    Tabela Direta     |       (@\#AD\_Org\_ID@)        |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|        Criado         |      Data+Hora       |           (SYSDATE)            |                        |                                                  |                 Date this record was created                  |                                                                          The Created field indicates the date that this record was created.                                                                          |
|      Atualizado       |      Data+Hora       |           (SYSDATE)            |                        |                                                  |                 Date this record was updated                  |                                                                          The Updated field indicates the date that this record was updated.                                                                          |
|       Processo        |    Tabela Direta     |                                | adprocess\_adpinstance |                                                  |                       Process or Report                       |                                                                        The Process field identifies a unique Process or Report in the system.                                                                        |
|    ID do Registro     |       Inteiro        |                                |                        |                                                  |                   Direct internal record ID                   | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|    Usuário/Contato    |    Tabela Direta     |                                |   aduser\_pinstance    |                                                  | User within the system - Internal or Business Partner Contact |                                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                     |
|      Msg de Erro      | Texto Curto (String) |                                |                        |                                                  |                                                               |                                                                                                                                                                                                                      |
|       Resultado       |       Inteiro        |                                |                        |                                                  |                  Result of the action taken                   |                                                                         The Result indicates the result of any action taken on this request.                                                                         |
|      Processando      |       Sim-Não        |                                |                        |                                                  |                                                               |                                                                                                                                                                                                                      |
| Executar como Serviço |       Sim-Não        |              (N)               |                        |                                                  |                                                               |                                                                                                                                                                                                                      |
|  Tipo de Notificação  |        Lista         | EMail+Aviso Email Aviso Nenhum |                        |                                                  |                     Type of Notifications                     |                                                                              Emails or Notification sent out for Request Updates, etc.                                                                               |

</div>

</div>

  

<div id="d14567e267" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parâmetros de Auditoria - AD\_PInstance\_Para

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PInstance_Para_data)

<span class="emphasis">*Descrição:*</span> Auditar Valores de Parâmetros
de Processo

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d14567e280" class="table">

<div class="table-title">

Table 1.2. Parameter Audit
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência            |  Valores (Padrão)  |       Chave restritiva       |                Regra de validação                |                       Descrição                       |                       Comentário/Ajuda                       |
| :---------------------: | :------------------------------: | :----------------: | :--------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :----------------------------------------------------------: |
|          Ativo          |             Sim-Não              |        (Y)         |                              |                                                  |          (semelhante ao primeiro relatório)           |                     (ver o mesmo acima)                      |
|         Empresa         |          Tabela Direta           | (@AD\_Client\_ID@) |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                     (ver o mesmo acima)                      |
|       Organização       |          Tabela Direta           |  (@AD\_Org\_ID@)   |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                     (ver o mesmo acima)                      |
|  Instância de Processo  |          Tabela Direta           |                    | adpinstance\_adpinstancepara |                                                  |                Instance of the process                |                                                              |
|        Seqüência        |                ID                |                    |                              |                                                  | Method of ordering records; lowest number comes first |         The Sequence indicates the order of records          |
|    Nome do Parâmetro    |       Texto Curto (String)       |                    |                              |                                                  |                                                       |                                                              |
|       Informação        | Texto Longo (\> 2000 caracteres) |                    |                              |                                                  |                      Information                      | The Information displays data from the source document line. |
|     Informação Para     |       Texto Curto (String)       |                    |                              |                                                  |                                                       |                                                              |
|     Processar Texto     | Texto Longo (\> 2000 caracteres) |                    |                              |                                                  |                   Process Parameter                   |                                                              |
|  Processar Texto Para   |       Texto Curto (String)       |                    |                              |                                                  |                   Process Parameter                   |                                                              |
|    Data de Processo     |            Data+Hora             |                    |                              |                                                  |                   Process Parameter                   |                                                              |
|  Data de Processo Para  |            Data+Hora             |                    |                              |                                                  |                   Process Parameter                   |                                                              |
|   Número do Processo    |              Número              |                    |                              |                                                  |                   Process Parameter                   |                                                              |
| Número do Processo Para |              Número              |                    |                              |                                                  |                   Process Parameter                   |                                                              |
| AD\_PInstance\_Para\_UU |       Texto Curto (String)       |                    |                              |                                                  |                                                       |                                                              |

</div>

</div>

  

<div id="d14567e521" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Registro - AD\_PInstance\_Log

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PInstance_Log_data)

<span class="emphasis">*Descrição:*</span> Registro (log) de Processo

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d14567e534" class="table">

<div class="table-title">

Table 1.3. Log
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      | Valores (Padrão) |    Chave restritiva     | Regra de validação |         Descrição          |                                                                                                   Comentário/Ajuda                                                                                                   |
| :--------------------: | :------------------: | :--------------: | :---------------------: | :----------------: | :------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Instância de Processo  |    Tabela Direta     |                  |   adpinstance\_pilog    |                    |  Instance of the process   |                                                                                                                                                                                                                      |
|        Registro        |          ID          |                  |                         |                    |                            |                                                                                                                                                                                                                      |
|     ID de Processo     |          ID          |                  |                         |                    |                            |                                                                                                                                                                                                                      |
|    Data de Processo    |         Data         |                  |                         |                    |     Process Parameter      |                                                                                                                                                                                                                      |
|   Número do Processo   |        Número        |                  |                         |                    |     Process Parameter      |                                                                                                                                                                                                                      |
|  Mensagem de Processo  | Texto Curto (String) |                  |                         |                    |                            |                                                                                                                                                                                                                      |
|         Tabela         |    Tabela Direta     |                  | adtable\_adpinstancelog |                    | Database Table information |                                                                         The Database Table provides the information of the table definition                                                                          |
|     ID do Registro     |        Botão         |                  |                         |                    | Direct internal record ID  | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
| AD\_PInstance\_Log\_UU | Texto Curto (String) |                  |                         |                    |                            |                                                                                                                                                                                                                      |

</div>

</div>

  

</div>
