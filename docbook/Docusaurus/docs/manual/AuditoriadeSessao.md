---
title: "Auditoria de Sessão"
id: AuditoriadeSessao
---
<div id="d14876e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Auditoria de Sessão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Auditoria de Sessão -
    AD\_Session](#d14876e23)</span>
  - <span class="section">[2. Tabela: Auditoria de Alterações -
    AD\_ChangeLog](#d14876e284)</span>

</div>

<span class="emphasis">*Descrição:* </span> Auditoria de Sessões de
Usuários

<span class="emphasis">*Comentário/Ajuda:* </span>Histórico de Sessões
Online ou Web

<span class="emphasis"> *Criado em:* </span>2003-05-28 21:55:18.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/AuditoriadeSessao.png)

<div id="d14876e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Auditoria de Sessão - AD\_Session

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Session_data)

<span class="emphasis">*Descrição:*</span> Lista de Sessões de Usuários

<span class="emphasis">*Comentário/Ajuda:* </span> Histórico de Sessões
Online ou Web

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d14876e40" class="table">

<div class="table-title">

Table 1.1. Session Audit
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva  |                Regra de validação                |                Descrição                 |                                     Comentário/Ajuda                                      |
| :---------------: | :-------------------------------: | :------------------: | :---------------: | :----------------------------------------------: | :--------------------------------------: | :---------------------------------------------------------------------------------------: |
|       Ativo       |              Sim-Não              |         (Y)          |                   |                                                  |    (semelhante ao primeiro relatório)    |                                    (ver o mesmo acima)                                    |
|      Sessão       |                ID                 |                      |                   |                                                  |        User Session Online or Web        |                             Online or Web Session Information                             |
|      Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                   |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                    (ver o mesmo acima)                                    |
|    Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                    (ver o mesmo acima)                                    |
|      Criado       |             Data+Hora             |      (SYSDATE)       |                   |                                                  |       Date this record was created       |            The Created field indicates the date that this record was created.             |
|    Criado por     |              Tabela               |       AD\_User       |                   |                                                  |      User who created this records       |             The Created By field indicates the user who created this record.              |
|    Atualizado     |             Data+Hora             |      (SYSDATE)       |                   |                                                  |       Date this record was updated       |            The Updated field indicates the date that this record was updated.             |
|    End.Remoto     |       Texto Curto (String)        |                      |                   |                                                  |              Remote Address              |             The Remote Address indicates an alternative or external address.              |
| Hospedeiro Remoto |       Texto Curto (String)        |                      |                   |                                                  |             Remote host Info             |                                                                                           |
| Nome do Servidor  | Texto Médio (até 2000 caracteres) |                      |                   |                                                  |                                          |                                    Node instance name                                     |
|    Sessão Web     |       Texto Curto (String)        |                      |                   |                                                  |              Web Session ID              |                                                                                           |
|      Perfil       |           Tabela Direta           |                      | adrole\_adsession |                                                  |           Responsibility Role            | The Role determines security and access a user who has this Role will have in the System. |
|   Data de Login   |               Data                |                      |                   |                                                  |                                          |                                                                                           |
|     Descrição     | Texto Médio (até 2000 caracteres) |                      |                   |                                                  | Optional short description of the record |                        A description is limited to 255 characters.                        |
|    Processado     |              Sim-Não              |                      |                   |                                                  |     The document has been processed      |           The Processed checkbox indicates that a document has been processed.            |

</div>

</div>

  

<div id="d14876e284" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Auditoria de Alterações - AD\_ChangeLog

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ChangeLog_data)

<span class="emphasis">*Descrição:*</span> Alterações de Dados

<span class="emphasis">*Comentário/Ajuda:* </span> Registro de
alterações de dados

<span class="emphasis">*Coluna linkada:* </span> Session

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d14876e305" class="table">

<div class="table-title">

Table 1.2. Change Audit
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |   Valores (Padrão)   |    Chave restritiva    |                Regra de validação                |                                        Descrição                                        |                                                                                                             Comentário/Ajuda                                                                                                             |
| :-------------------------: | :------------------: | :------------------: | :--------------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |                           (semelhante ao primeiro relatório)                            |                                                                                                           (ver o mesmo acima)                                                                                                            |
|         Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                           (semelhante ao primeiro relatório)                            |                                                                                                           (ver o mesmo acima)                                                                                                            |
|           Sessão            |    Tabela Direta     |                      | adsession\_adchangelog |                                                  |                               User Session Online or Web                                |                                                                                                    Online or Web Session Information                                                                                                     |
|          Transação          | Texto Curto (String) |                      |                        |                                                  |                                 Name of the transaction                                 |                                                                                                     Internal name of the transaction                                                                                                     |
|    Registro de Alteração    |          ID          |                      |                        |                                                  |                                   Log of data changes                                   |                                                                                                           Log of data changes                                                                                                            |
|         Atualizado          |      Data+Hora       |      (SYSDATE)       |                        |                                                  |                              Date this record was updated                               |                                                                                    The Updated field indicates the date that this record was updated.                                                                                    |
|       Atualizado por        |        Tabela        |       AD\_User       |                        |                                                  |                              User who updated this records                              |                                                                                     The Updated By field indicates the user who updated this record.                                                                                     |
|           Tabela            |    Tabela Direta     |                      |  adtable\_adchangelog  |                                                  |                               Database Table information                                |                                                                                   The Database Table provides the information of the table definition                                                                                    |
|       ID do Registro        |        Botão         |                      |                        |                                                  |                                Direct internal record ID                                |           The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.           |
|           Coluna            |       Procurar       |                      | adcolumn\_adchangelog  |                                                  |                                   Column in the table                                   |                                                                                                 Link to the database column of the table                                                                                                 |
|            Ativo            |       Sim-Não        |         (Y)          |                        |                                                  |                           (semelhante ao primeiro relatório)                            |                                                                                                           (ver o mesmo acima)                                                                                                            |
|       Personalização        |       Sim-Não        |                      |                        |                                                  | The change is a customization of the data dictionary and can be applied after Migration | The migration "resets" the system to the current/original setting. If selected you can save the customization and re-apply it. Please note that you need to check, if your customization has no negative side effect in the new release. |
| Evento no Log de Alteraçoes |        Lista         | Delete Insert Update |                        |                                                  |                               Type of Event in Change Log                               |                                                                                                                                                                                                                                          |
|        Valor Antigo         | Texto Curto (String) |                      |                        |                                                  |                                    The old file data                                    |                                                                                                    Old data overwritten in the field                                                                                                     |
|         Novo Valor          | Texto Curto (String) |                      |                        |                                                  |                                     New field value                                     |                                                                                                      New data entered in the field                                                                                                       |
|          Descrição          | Texto Curto (String) |                      |                        |                                                  |                        Optional short description of the record                         |                                                                                               A description is limited to 255 characters.                                                                                                |
|     Desfazer Alterações     |        Botão         |                      |                        |                                                  |                                                                                         |                                                                                                                                                                                                                                          |
|     Refazer Alterações      |        Botão         |                      |                        |                                                  |                                                                                         |                                                                                                                                                                                                                                          |
|      AD\_ChangeLog\_UU      | Texto Curto (String) |                      |                        |                                                  |                                                                                         |                                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
