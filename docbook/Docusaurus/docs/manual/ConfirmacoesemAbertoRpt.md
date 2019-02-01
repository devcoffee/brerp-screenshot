---
title: "Confirmações em Aberto"
id: ConfirmacoesemAbertoRpt
---
<div id="d34259e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Confirmações em Aberto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-05-18 21:10:12.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Confirmações de Embarque ou
Recebimento em Aberto

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório lista as
confirmações em aberto

<span class="emphasis"> *ReportView:* </span>RV\_InOutConfirm Open

![](/img/manual/ConfirmacoesemAberto.png)

<div id="d34259e26" class="table">

<div class="table-title">

Table 1.1. ConfirmacoesemAberto
Parâmetros

</div>

<div class="table-contents">

|         Nome         |  Nome da coluna  |  Referência   |                                                          Valores(Padrão)                                                           |                 Descrição                 |                                                                                                         Comentário/Ajuda                                                                                                          |
| :------------------: | :--------------: | :-----------: | :--------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Parceiro de Negócios | C\_BPartner\_ID  |   Procurar    |                                                                                                                                    |    Identifica um Parceiro de Negócios.    |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|        Pedido        |   C\_Order\_ID   |   Procurar    |                                                                                                                                    |                  Pedido                   | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|       Armazém        | M\_Warehouse\_ID | Tabela Direta |                                                                                                                                    |  Armazém de estocagem e Ponto de Serviço  |                                                       O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                                                        |
|     Organização      |   AD\_Org\_ID    | Tabela Direta |                                                         (@\#AD\_Org\_ID@)                                                          | Entidade organizacional dentro da Empresa |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Tipo de Confirmação  |   ConfirmType    |     Lista     | Confirmação de Embarque Confirmação de Coleta/QA Confirmação de Envio/Recebimento Confirmação do Cliente Confirmação do Fornecedor |            Tipo da confirmação            |                                                                                                               null                                                                                                                |

</div>

</div>

  

<div id="d34259e116" class="table">

<div class="table-title">

Table 1.2. RV\_InOutConfirm Open -
Colunas

</div>

<div class="table-contents">

|          Nome da coluna          |      Referência      |                                                           Valores padrão                                                           | Valor de restrição |                Regra de validação                |                         Descrição                          |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :------------------------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :--------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Empresa              |    Tabela Direta     |                                                                                                                                    |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                        (ver acima)                         |                                                                                                                                                                                                                                                                                                                                                           (ver acima)                                                                                                                                                                                                                                                                                                                                                           |
|           Organização            |    Tabela Direta     |                                                                                                                                    |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                        (ver acima)                         |                                                                                                                                                                                                                                                                                                                                                           (ver acima)                                                                                                                                                                                                                                                                                                                                                           |
|       Parceiro de Negócios       |       Procurar       |                                                                                                                                    |                    |                                                  |               Identifies a Business Partner                |                                                                                                                                                                                                                                                                                                         A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                                                                                                                                                                                                         |
|     Localização do Parceiro      |    Tabela Direta     |                                                                                                                                    |                    |                                                  | Identifies the (ship to) address for this Business Partner |                                                                                                                                                                                                                                                                                                                                The Partner address indicates the location of a Business Partner                                                                                                                                                                                                                                                                                                                                 |
|       Tipo de Confirmação        |        Lista         | Confirmação de Embarque Confirmação de Coleta/QA Confirmação de Envio/Recebimento Confirmação do Cliente Confirmação do Fornecedor |                    |                                                  |                    Type of confirmation                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Pedido              |       Procurar       |                                                                                                                                    |                    |                                                  |                           Order                            |                                                                                                                                                                                                                                                          The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled.                                                                                                                                                                                                                                                          |
|              Criado              |      Data+Hora       |                                                             (SYSDATE)                                                              |                    |                                                  |                Date this record was created                |                                                                                                                                                                                                                                                                                                                               The Created field indicates the date that this record was created.                                                                                                                                                                                                                                                                                                                                |
|            Criado por            |        Tabela        |                                                              AD\_User                                                              |                    |                                                  |               User who created this records                |                                                                                                                                                                                                                                                                                                                                The Created By field indicates the user who created this record.                                                                                                                                                                                                                                                                                                                                 |
|            Descrição             | Texto Curto (String) |                                                                                                                                    |                    |                                                  |          Optional short description of the record          |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|       Número do Documento        | Texto Curto (String) |                                                                                                                                    |                    |                                                  |          Document sequence number of the document          | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|              Ativo               |       Sim-Não        |                                                                (Y)                                                                 |                    |                                                  |                        (ver acima)                         |                                                                                                                                                                                                                                                                                                                                                           (ver acima)                                                                                                                                                                                                                                                                                                                                                           |
|             Aprovado             |       Sim-Não        |                                                                                                                                    |                    |                                                  |        Indicates if this document requires approval        |                                                                                                                                                                                                                                                                                                                 The Approved checkbox indicates if this document requires approval before it can be processed.                                                                                                                                                                                                                                                                                                                  |
|            Cancelado             |       Sim-Não        |                                                                                                                                    |                    |                                                  |               The transaction was cancelled                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Transação de Vendas        |       Sim-Não        |                                                                                                                                    |                    |                                                  |                This is a Sales Transaction                 |                                                                                                                                                                                                                                                                                                                          The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                                                                                                                                                                                                                                                                          |
| Confirmação de Envio/Recebimento |          ID          |                                                                                                                                    |                    |                                                  |         Material Shipment or Receipt Confirmation          |                                                                                                                                                                                                                                                                                                                             Confirmation of Shipment or Receipt - Created from the Shipment/Receipt                                                                                                                                                                                                                                                                                                                             |
|       Remessa/Recebimento        |       Procurar       |                                                                                                                                    |                    |                                                  |                 Material Shipment Document                 |                                                                                                                                                                                                                                                                                                                                                 The Material Shipment / Receipt                                                                                                                                                                                                                                                                                                                                                 |
|             Armazém              |    Tabela Direta     |                                                                                                                                    |                    |                                                  |            Storage Warehouse and Service Point             |                                                                                                                                                                                                                                                                                                                 The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                                                                                                                                                                                                                                                 |
|            Processado            |       Sim-Não        |                                                                                                                                    |                    |                                                  |              The document has been processed               |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|         Processar Agora          |       Sim-Não        |                                                                                                                                    |                    |                                                  |                                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Atualizado            |      Data+Hora       |                                                             (SYSDATE)                                                              |                    |                                                  |                Date this record was updated                |                                                                                                                                                                                                                                                                                                                               The Updated field indicates the date that this record was updated.                                                                                                                                                                                                                                                                                                                                |
|          Atualizado por          |        Tabela        |                                                              AD\_User                                                              |                    |                                                  |               User who updated this records                |                                                                                                                                                                                                                                                                                                                                The Updated By field indicates the user who updated this record.                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>