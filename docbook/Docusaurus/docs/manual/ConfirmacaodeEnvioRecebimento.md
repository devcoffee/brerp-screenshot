---
title: "Confirmação de Envio/Recebimento"
id: ConfirmacaodeEnvioRecebimento
---
<div id="d33730e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Confirmação de Envio/Recebimento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Confirmação -
    M\_InOutConfirm](#d33730e23)</span>
  - <span class="section">[2. Tabela: Linha -
    M\_InOutLineConfirm](#d33730e373)</span>

</div>

<span class="emphasis">*Descrição:* </span> Confirmação de Embarque ou
Recebimento de Material

<span class="emphasis">*Comentário/Ajuda:* </span>Confirmação de Entrega
ou Recebimento - criado a partir de Entrega/Recebimento

<span class="emphasis"> *Criado em:* </span>2004-05-10 17:36:55.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ConfirmacaodeEnvio/Recebimento.png)

<div id="d33730e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Confirmação - M\_InOutConfirm

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_InOutConfirm_data)

<span class="emphasis">*Descrição:*</span> Confirmação de Embarque ou
Recebimento de Material

<span class="emphasis">*Comentário/Ajuda:* </span> Confirmação de
Entrega ou Recebimento - criado a partir de Entrega/Recebimento

<span class="emphasis"> *Relatório:* </span>Shipment Confirmation - Rpt
M\_InOutConfirm

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d33730e44" class="table">

<div class="table-title">

Table 1.1. Confirmation
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |                                                                    Valores (Padrão)                                                                    |     Chave restritiva      |                  Regra de validação                   |                  Descrição                   |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :------------------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------: | :---------------------------------------------------: | :------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Processar Agora          |       Sim-Não        |                                                                                                                                                        |                           |                                                       |                                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Confirmação de Envio/Recebimento |          ID          |                                                                                                                                                        |                           |                                                       |  Material Shipment or Receipt Confirmation   |                                                                                                                                                                                                                                                                                                                             Confirmation of Shipment or Receipt - Created from the Shipment/Receipt                                                                                                                                                                                                                                                                                                                             |
|            Processado            |       Sim-Não        |                                                                                                                                                        |                           |                                                       |       The document has been processed        |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|              Ativo               |       Sim-Não        |                                                                          (Y)                                                                           |                           |                                                       |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|             Empresa              |    Tabela Direta     |                                                                  (@\#AD\_Client\_ID@)                                                                  |                           |           AD\_Client.AD\_Client\_ID \< \> 0           |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|           Organização            |    Tabela Direta     |                                                                   (@\#AD\_Org\_ID@)                                                                    |                           | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Número do Documento        | Texto Curto (String) |                                                                                                                                                        |                           |                                                       |   Document sequence number of the document   | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|         Núm. Confirmação         | Texto Curto (String) |                                                                                                                                                        |                           |                                                       |             Confirmation Number              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Remessa/Recebimento        |       Procurar       |                                                                                                                                                        |   minout\_minoutconfirm   |                                                       |          Material Shipment Document          |                                                                                                                                                                                                                                                                                                                                                 The Material Shipment / Receipt                                                                                                                                                                                                                                                                                                                                                 |
|       Tipo de Confirmação        |        Lista         |           Confirmação de Embarque Confirmação de Coleta/QA Confirmação de Envio/Recebimento Confirmação do Cliente Confirmação do Fornecedor           |                           |                                                       |             Type of confirmation             |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Descrição             | Texto Curto (String) |                                                                                                                                                        |                           |                                                       |   Optional short description of the record   |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|             Aprovado             |       Sim-Não        |                                                                                                                                                        |                           |                                                       | Indicates if this document requires approval |                                                                                                                                                                                                                                                                                                                 The Approved checkbox indicates if this document requires approval before it can be processed.                                                                                                                                                                                                                                                                                                                  |
|        Valor da Aprovação        |        Valor         |                                                                                                                                                        |                           |                                                       |           Document Approval Amount           |                                                                                                                                                                                                                                                                                                                                                  Approval Amount for Workflow                                                                                                                                                                                                                                                                                                                                                   |
|       Estado do Documento        |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                           |                                                       |      The current status of the document      |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|      Processar Confirmação       |        Botão         |                                                                 \_Document Action(CO)                                                                  |                           |                                                       |     The targeted status of the document      |                                                                                                                                                                                                                                                                                                                   You find the current status in the Document Status field. The options are listed in a popup                                                                                                                                                                                                                                                                                                                   |
|            Em Disputa            |       Sim-Não        |                                                                          (N)                                                                           |                           |                                                       |            Document is in dispute            |                                                                                                                                                                                                                                                                                                                                   The document is in dispute. Use Requests to track details.                                                                                                                                                                                                                                                                                                                                    |
|            Cancelado             |       Sim-Não        |                                                                                                                                                        |                           |                                                       |        The transaction was cancelled         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          Estoque Físico          |       Procurar       |                                                                                                                                                        | minventory\_minoutconfirm |                                                       |     Parameters for a Physical Inventory      |                                                                                                                                                                                                                                                                                                                         The Physical Inventory indicates a unique parameters for a physical inventory.                                                                                                                                                                                                                                                                                                                          |
|              Fatura              |       Procurar       |                                                                                                                                                        |  cinvoice\_minoutconfirm  |                                                       |              Invoice Identifier              |                                                                                                                                                                                                                                                                                                                                                      The Invoice Document.                                                                                                                                                                                                                                                                                                                                                      |
|         Criar Embalagem          |        Botão         |                                                                                                                                                        |                           |                                                       |                                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       M\_InOutConfirm\_UU        | Texto Curto (String) |                                                                                                                                                        |                           |                                                       |                                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d33730e373" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha - M\_InOutLineConfirm

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_InOutLineConfirm_data)

<span class="emphasis">*Descrição:*</span> Linha de Confirmação de
Embarque ou Recebimento de Material

<span class="emphasis">*Comentário/Ajuda:* </span> As quantidades estão
na Unidade de Medida de armazenagem\!

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d33730e390" class="table">

<div class="table-title">

Table 1.2. Line
Fields

</div>

<div class="table-contents">

|               Nome do campo               |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                  Regra de validação                   |                   Descrição                    |                                            Comentário/Ajuda                                            |
| :---------------------------------------: | :------------------: | :----------------: | :-----------------------------: | :---------------------------------------------------: | :--------------------------------------------: | :----------------------------------------------------------------------------------------------------: |
|                Processado                 |       Sim-Não        |                    |                                 |                                                       |        The document has been processed         |                  The Processed checkbox indicates that a document has been processed.                  |
|                   Ativo                   |       Sim-Não        |        (Y)         |                                 |                                                       |       (semelhante ao primeiro relatório)       |                                          (ver o mesmo acima)                                           |
| Linha de Confirmação de Envio/Recebimento |          ID          |                    |                                 |                                                       | Material Shipment or Receipt Confirmation Line |                                          Confirmation details                                          |
|                  Empresa                  |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |           AD\_Client.AD\_Client\_ID \< \> 0           |       (semelhante ao primeiro relatório)       |                                          (ver o mesmo acima)                                           |
|                Organização                |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |       (semelhante ao primeiro relatório)       |                                          (ver o mesmo acima)                                           |
|     Confirmação de Envio/Recebimento      |    Tabela Direta     |                    |  minoutconfirm\_minoutlineconf  |                                                       |   Material Shipment or Receipt Confirmation    |                Confirmation of Shipment or Receipt - Created from the Shipment/Receipt                 |
|       Linha de Remessa/Recebimento        |       Procurar       |                    |    minoutline\_minoutconfirm    |                                                       |      Line on Shipment or Receipt document      |            The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document            |
|              Quantidade Alvo              |      Quantidade      |                    |                                 |                                                       |            Target Movement Quantity            |                              The Quantity which should have been received                              |
|           Quantidade Confirmada           |      Quantidade      |                    |                                 |                                                       |      Confirmation of a received quantity       |                                  Confirmation of a received quantity                                   |
|                 Diferença                 |      Quantidade      |                    |                                 |                                                       |              Difference Quantity               |                                                                                                        |
|           Quantidade Sucateada            |      Quantidade      |                    |                                 |                                                       |     The Quantity scrapped due to QA issues     |                                                                                                        |
|                 Descrição                 | Texto Curto (String) |                    |                                 |                                                       |    Optional short description of the record    |                              A description is limited to 255 characters.                               |
|             Núm. Confirmação              | Texto Curto (String) |                    |                                 |                                                       |              Confirmation Number               |                                                                                                        |
|          Linha de Estoque Físico          |       Procurar       |                    | minventoryline\_minoutlineconfi |                                                       |      Unique line in an Inventory document      | The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction |
|              Linha de Fatura              |       Procurar       |                    | cinvoiceline\_minoutlineconfirm |                                                       |              Invoice Detail Line               |                   The Invoice Line uniquely identifies a single line of an Invoice.                    |
|          M\_InOutLineConfirm\_UU          | Texto Curto (String) |                    |                                 |                                                       |                                                |                                                                                                        |

</div>

</div>

  

</div>
