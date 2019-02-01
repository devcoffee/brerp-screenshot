---
title: "Ordem de Trabalho"
id: OrdemdeTrabalho
---
<div id="d153446e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ordem de Trabalho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ordem de Trabalho -
    MP\_OT](#d153446e22)</span>
  - <span class="section">[2. Tabela: Tarefas da OT -
    MP\_OT\_Task](#d153446e331)</span>
  - <span class="section">[3. Tabela: Recursos da OT -
    MP\_OT\_Resource](#d153446e540)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-22 17:09:20.0

<span class="emphasis">*Atualizado em:* </span>2017-06-22 17:09:20.0

<div id="d153446e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ordem de Trabalho - MP\_OT

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_OT_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d153446e31" class="table">

<div class="table-title">

Table 1.1. Order
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |                                                                    Valores (Padrão)                                                                    |  Chave restritiva   |      Regra de validação      |                           Descrição                           |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :---------------------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------: | :--------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Ordem de Trabalho          |          ID          |                                                                                                                                                        |                     |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|  Checklist de Processos (Padrões)   |        Tabela        |                                                                     MP\_JobStandar                                                                     | MPJobStandar\_MPOT  |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          Ordem de Processo          |        Botão         |                                                                 \_Document Action(CO)                                                                  |                     |                              |              The targeted status of the document              |                                                                                                                                                                                                                                                                                                                   You find the current status in the Document Status field. The options are listed in a popup                                                                                                                                                                                                                                                                                                                   |
|               Empresa               |    Tabela Direta     |                                                                                                                                                        |   ADClient\_MPOT    |                              |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|             Organização             |    Tabela Direta     |                                                                                                                                                        |     ADOrg\_MPOT     |                              |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|          Tipo de Documento          |    Tabela Direta     |                                                                                                                                                        |   CDocType\_MPOT    | C\_DocType.DocBaseType='MOF' |                    Document type or rules                     |                                                                                                                                                                                                                                                                                                                               The Document Type determines document sequence and processing rules                                                                                                                                                                                                                                                                                                                               |
|         Número do Documento         | Texto Curto (String) |                                                                                                                                                        |                     |                              |           Document sequence number of the document            | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|                Ativo                |    Tabela Direta     |                                                                                                                                                        |    AAsset\_MPOT     |                              |             Asset used internally or by customers             |                                                                                                                                                                                                                                                                                                  An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                                                                                                                                                                                                                                                   |
|          Data da Transação          |      Data+Hora       |                                                                       (@\#Date@)                                                                       |                     |                              |                       Transaction Date                        |                                                                                                                                                                                                                                                                                                                                   The Transaction Date indicates the date of the transaction.                                                                                                                                                                                                                                                                                                                                   |
|           Usuário/Contato           |    Tabela Direta     |                                                                                                                                                        |    ADUser\_MPOT     |                              | User within the system - Internal or Business Partner Contact |                                                                                                                                                                                                                                                                                                          The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                                                                                                                                                                                                          |
|            Equipamentos             |       Procurar       |                                                                                                                                                        | COFEquipments\_MPOT |                              |                   Primary Key : Equipments                    |                                                                                                                                                                                                                                                                                                                                                    Primary Key : Equipments                                                                                                                                                                                                                                                                                                                                                     |
|              Descrição              | Texto Curto (String) |                                                                                                                                                        |                     |                              |           Optional short description of the record            |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
| Cronograma de Manutenção Preventiva |        Tabela        |                                                                      MP\_Maintain                                                                      |  MPMaintain\_MPOT   |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|   Requisição de Ordem de Trabalho   |        Tabela        |                                                                    MP\_OT\_Request                                                                     |  MPOTRequest\_MPOT  |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|         Estado do Documento         |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                     |                              |              The current status of the document               |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|     Processar Ordem de Trabalho     |        Botão         |                                                                                                                                                        |                     |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|             Processado              |       Sim-Não        |                                                                                                                                                        |                     |                              |                The document has been processed                |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|    Criar Estoque de Uso Interno     |        Botão         |                                                                                                                                                        |                     |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|                Ativo                |       Sim-Não        |                                                                                                                                                        |                     |                              |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |

</div>

</div>

  

<div id="d153446e331" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tarefas da OT - MP\_OT\_Task

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_OT_Task_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d153446e340" class="table">

<div class="table-title">

Table 1.2. Tasks
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |                                            Valores (Padrão)                                             |   Chave restritiva   | Regra de validação |                       Descrição                       |                           Comentário/Ajuda                           |
| :---------------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------: | :------------------: | :----------------: | :---------------------------------------------------: | :------------------------------------------------------------------: |
|            Tarefa da OT             |          ID          |                                                                                                         |                      |                    |                                                       |                                                                      |
| Cronograma de Manutenção Preventiva |        Tabela        |                                              MP\_Maintain                                               | MPMaintain\_MPOTTask |                    |                                                       |                                                                      |
|               Empresa               |    Tabela Direta     |                                                                                                         |  ADClient\_MPOTTask  |                    |          (semelhante ao primeiro relatório)           |                         (ver o mesmo acima)                          |
|             Organização             |    Tabela Direta     |                                                                                                         |   ADOrg\_MPOTTask    |                    |          (semelhante ao primeiro relatório)           |                         (ver o mesmo acima)                          |
|          Ordem de Trabalho          |        Tabela        |                                                 MP\_OT                                                  |    MPOT\_MPOTTask    |                    |                                                       |                                                                      |
|                Ativo                |       Sim-Não        |                                                                                                         |                      |                    |          (semelhante ao primeiro relatório)           |                         (ver o mesmo acima)                          |
|              Seqüência              |       Inteiro        | (@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM MP\_OT\_Task WHERE MP\_OT\_ID=@MP\_OT\_ID@) |                      |                    | Method of ordering records; lowest number comes first |             The Sequence indicates the order of records              |
|              Descrição              | Texto Curto (String) |                                                                                                         |                      |                    |       Optional short description of the record        |             A description is limited to 255 characters.              |
|                 UDM                 |    Tabela Direta     |                                                                                                         |    CUOM\_MPOTTask    |                    |                    Unit of Measure                    |        The UOM defines a unique non monetary Unit of Measure         |
|               Duração               |        Número        |                                                                                                         |                      |                    |           Normal Duration in Duration Unit            |          Expected (normal) Length of time for the execution          |
|               Estado                |        Lista         |                              Completed In Progress Not Started Stop ('NS')                              |                      |                    |         Status of the currently running check         |                Status of the currently running check                 |
|             Processado              |       Sim-Não        |                                                                                                         |                      |                    |            The document has been processed            | The Processed checkbox indicates that a document has been processed. |

</div>

</div>

  

<div id="d153446e540" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Recursos da OT - MP\_OT\_Resource

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d153446e547" class="table">

<div class="table-title">

Table 1.3. Resources
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |                         Valores (Padrão)                         |       Chave restritiva       | Regra de validação |              Descrição               |                                            Comentário/Ajuda                                            |
| :---------------------: | :------------------: | :--------------------------------------------------------------: | :--------------------------: | :----------------: | :----------------------------------: | :----------------------------------------------------------------------------------------------------: |
|      Recurso da OT      |          ID          |                                                                  |                              |                    |                                      |                                                                                                        |
|         Empresa         |    Tabela Direta     |                                                                  |    ADClient\_MPOTResource    |                    |  (semelhante ao primeiro relatório)  |                                          (ver o mesmo acima)                                           |
|       Organização       |    Tabela Direta     |                                                                  |     ADOrg\_MPOTResource      |                    |  (semelhante ao primeiro relatório)  |                                          (ver o mesmo acima)                                           |
|      Tarefa da OT       |        Tabela        |                           MP\_OT\_Task                           |    MPOTTask\_MPOTResource    |                    |                                      |                                                                                                        |
|          Ativo          |       Sim-Não        |                                                                  |                              |                    |  (semelhante ao primeiro relatório)  |                                          (ver o mesmo acima)                                           |
|     Tipo do Recurso     |        Lista         | Peças de LdM Ferramentas de LdM Recursos Humanos Peça Ferramenta |                              |                    |                                      |                                                                                                        |
|           BOM           |    Tabela Direta     |                                                                  |      MBOM\_MPOTResource      |                    |           Bill of Material           |                                     The composition of the Product                                     |
|         Produto         |       Procurar       |                                                                  |    MProduct\_MPOTResource    |                    |        Product, Service, Item        |               Identifies an item which is either purchased or sold in this organization.               |
|         Recurso         |    Tabela Direta     |                                                                  |   SResource\_MPOTResource    |                    |               Resource               |                                                                                                        |
|  Quantidade do Recurso  |      Quantidade      |                                                                  |                              |                    |                                      |                                                                                                        |
|     Valor de Custo      |        Valor         |                                                                  |                              |                    |           Value with Cost            |                                                                                                        |
|       Processado        |       Sim-Não        |                                                                  |                              |                    |   The document has been processed    |                  The Processed checkbox indicates that a document has been processed.                  |
| Linha de Estoque Físico |       Procurar       |                                                                  | MInventoryLine\_MPOTResource |                    | Unique line in an Inventory document | The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction |
|  MP\_OT\_Resource\_UU   | Texto Curto (String) |                                                                  |                              |                    |                                      |                                                                                                        |

</div>

</div>

  

</div>
