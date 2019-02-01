---
title: "Package Maintenance"
id: PackageMaintenance
---
<div id="d157774e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Package Maintenance

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Package Installation Log -
    AD\_Package\_Imp](#d157774e22)</span>
  - <span class="section">[2. Tabela: Objects Installed -
    AD\_Package\_Imp\_Detail](#d157774e360)</span>
  - <span class="section">[3. Tabela: Object Backups -
    AD\_Package\_Imp\_Backup](#d157774e607)</span>

</div>

<span class="emphasis">*Descrição:* </span> Package installation history
and maintenance

<span class="emphasis">*Comentário/Ajuda:* </span>Review package
installation. Also perform package rollback if required

<span class="emphasis"> *Criado em:* </span>2006-12-11 23:45:42.0

<span class="emphasis">*Atualizado em:* </span>2006-12-12 01:43:06.0

<div id="d157774e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Package Installation Log - AD\_Package\_Imp

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Package_Imp_data)

<span class="emphasis">*Descrição:*</span> Installation history of
packages

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d157774e35" class="table">

<div class="table-title">

Table 1.1. Package Installation Log
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      | Valores (Padrão) | Chave restritiva |        Regra de validação         |                Descrição                 |                                                                                                  Comentário/Ajuda                                                                                                  |
| :------------------: | :------------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Creator        | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|     CreatedDate      | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|    CreatorContact    | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|        Versão        | Texto Curto (String) |                  |                  |                                   |     Version of the table definition      |                                                                            The Version indicates the version of this table definition.                                                                             |
|      Uninstall       |       Sim-Não        |       (N)        |                  |                                   |                                          |                                                                                                                                                                                                                    |
|    Núm. Liberação    | Texto Curto (String) |                  |                  |                                   |         Internal Release Number          |                                                                                                                                                                                                                    |
|      Processado      |       Sim-Não        |                  |                  |                                   |     The document has been processed      |                                                                        The Processed checkbox indicates that a document has been processed.                                                                        |
|        Ativo         |       Sim-Não        |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
|       Empresa        |    Tabela Direta     |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
|     Organização      |    Tabela Direta     |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
| AD\_Package\_Imp\_ID |          ID          |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|         Nome         | Texto Curto (String) |                  |                  |                                   |  Alphanumeric identifier of the entity   |                                    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                    |
|     PK\_Version      | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|      Descrição       |      Memorando       |                  |                  |                                   | Optional short description of the record |                                                                                    A description is limited to 255 characters.                                                                                     |
|  Endereço de e-mail  | Texto Curto (String) |                  |                  |                                   |         Electronic Mail Address          | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|        Criado        |      Data+Hora       |    (SYSDATE)     |                  |                                   |       Date this record was created       |                                                                         The Created field indicates the date that this record was created.                                                                         |
|      Criado por      |        Tabela        |     AD\_User     |                  |                                   |      User who created this records       |                                                                          The Created By field indicates the user who created this record.                                                                          |
|      PK\_Status      | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|     UpdatedDate      | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|       PackRoll       |        Botão         |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
| AD\_Package\_Imp\_UU | Texto Curto (String) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |

</div>

</div>

  

<div id="d157774e360" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Objects Installed - AD\_Package\_Imp\_Detail

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Package_Imp_Detail_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d157774e369" class="table">

<div class="table-title">

Table 1.2. Objects Installed
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      | Valores (Padrão) | Chave restritiva |        Regra de validação         |                      Descrição                       |                                                                                                   Comentário/Ajuda                                                                                                   |
| :--------------------------: | :------------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Uninstall           |       Sim-Não        |                  |                  |                                   |                                                      |                                                                                                                                                                                                                      |
|            Ativo             |       Sim-Não        |                  |                  |                                   |          (semelhante ao primeiro relatório)          |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Nome da Tabela no BD     | Texto Curto (String) |                  |                  |                                   |          Name of the table in the database           |                                                                            The DB Table Name indicates the name of the table in database.                                                                            |
| AD\_Package\_Imp\_Detail\_ID |          ID          |                  |                  |                                   |                                                      |                                                                                                                                                                                                                      |
|           Empresa            |    Tabela Direta     |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |          (semelhante ao primeiro relatório)          |                                                                                                 (ver o mesmo acima)                                                                                                  |
|         Organização          |    Tabela Direta     |                  |                  |                                   |          (semelhante ao primeiro relatório)          |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     AD\_Package\_Imp\_ID     |       Procurar       |                  |                  |                                   |                                                      |                                                                                                                                                                                                                      |
|            Tabela            |    Tabela Direta     |                  |                  |                                   |              Database Table information              |                                                                         The Database Table provides the information of the table definition                                                                          |
|             Ação             | Texto Curto (String) |                  |                  |                                   |         Indicates the Action to be performed         |                                                          The Action field is a drop down list box which indicates the Action to be performed for this Item.                                                          |
|        ID do Registro        |        Botão         |                  |                  |                                   |              Direct internal record ID               | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|             Nome             | Texto Curto (String) |                  |                  |                                   |        Alphanumeric identifier of the entity         |                                     The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                     |
|             Tipo             | Texto Curto (String) |                  |                  |                                   | Type of Validation (SQL, Java Script, Java Language) |                                                      The Type indicates the type of validation that will occur. This can be SQL, Java Script or Java Language.                                                       |
|           Success            | Texto Curto (String) |                  |                  |                                   |                                                      |                                                                                                                                                                                                                      |
|        Ad\_Backup\_ID        |          ID          |                  |                  |                                   |                                                      |                                                                                                                                                                                                                      |
| AD\_Package\_Imp\_Detail\_UU | Texto Curto (String) |                  |                  |                                   |                                                      |                                                                                                                                                                                                                      |

</div>

</div>

  

<div id="d157774e607" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Object Backups - AD\_Package\_Imp\_Backup

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Package_Imp_Backup_data)

<span class="emphasis">*Descrição:*</span> Details by column original
values before the record was overwritten

<span class="emphasis">*Comentário/Ajuda:* </span> Displays values for
each column for each record that was updated by a package install. This
backup is used in the package reversal process.

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d157774e624" class="table">

<div class="table-title">

Table 1.3. Object Backups
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |     Valores (Padrão)     |        Chave restritiva         |        Regra de validação         |             Descrição              |                          Comentário/Ajuda                           |
| :--------------------------: | :------------------: | :----------------------: | :-----------------------------: | :-------------------------------: | :--------------------------------: | :-----------------------------------------------------------------: |
| AD\_Package\_Imp\_Backup\_ID |          ID          |                          |                                 |                                   |                                    |                                                                     |
|            Ativo             |       Sim-Não        |                          |                                 |                                   | (semelhante ao primeiro relatório) |                         (ver o mesmo acima)                         |
|          Uninstall           |       Sim-Não        |                          |                                 |                                   |                                    |                                                                     |
|     AD\_Package\_Imp\_ID     |          ID          |                          |                                 |                                   |                                    |                                                                     |
|           Empresa            |    Tabela Direta     |                          |                                 | AD\_Client.AD\_Client\_ID \< \> 0 | (semelhante ao primeiro relatório) |                         (ver o mesmo acima)                         |
|         Organização          |          ID          |                          |                                 |                                   | (semelhante ao primeiro relatório) |                         (ver o mesmo acima)                         |
| AD\_Package\_Imp\_Detail\_ID |          ID          |                          |                                 |                                   |                                    |                                                                     |
|            Tabela            |          ID          |                          |                                 |                                   |     Database Table information     | The Database Table provides the information of the table definition |
|            Coluna            |       Procurar       |     AD\_Column Name      |  adcolumn\_adpackageimpbackup   |                                   |        Column in the table         |              Link to the database column of the table               |
|          Referência          |        Tabela        | AD\_Reference Data Types | adreference\_adpackageimpbackup |                                   |  System Reference and Validation   |  The Reference could be a display type, list or table validation.   |
|           ColValue           | Texto Curto (String) |                          |                                 |                                   |                                    |                                                                     |
|  AD\_Package\_Imp\_Bck\_Dir  | Texto Curto (String) |                          |                                 |                                   |                                    |                                                                     |
|  AD\_Package\_Imp\_Org\_Dir  | Texto Curto (String) |                          |                                 |                                   |                                    |                                                                     |
| AD\_Package\_Imp\_Backup\_UU | Texto Curto (String) |                          |                                 |                                   |                                    |                                                                     |

</div>

</div>

  

</div>
