---
title: "Faturas Confrontadas"
id: FaturasConfrontadas
---
<div id="d102412e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Faturas Confrontadas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Confrontar Fatura -
    M\_MatchInv](#d102412e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Ver Faturas Confrontadas

<span class="emphasis">*Comentário/Ajuda:* </span>View detals of matched
invoice lines to material receipt lines

<span class="emphasis"> *Criado em:* </span>1999-05-21 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2005-11-25 15:02:24.0

![](/img/manual/FaturasConfrontadas.png)

<div id="d102412e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Confrontar Fatura - M\_MatchInv

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_MatchInv_data)

<span class="emphasis">*Descrição:*</span> Visualizar Faturas
Confrontadas

<span class="emphasis">*Comentário/Ajuda:* </span> View detals of
matched invoice lines to material receipt lines

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d102412e40" class="table">

<div class="table-title">

Table 1.1. Match Invoice
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                                          Regra de validação                                                                          |                Descrição                 |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :--------------------------------: | :------------------: | :------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|               Ativo                |       Sim-Não        |         (Y)          |                                 |                                                                                                                                                                      |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|         Confrontar Fatura          |          ID          |                      |                                 |                                                                                                                                                                      |    Match Shipment/Receipt to Invoice     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|            Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|        Número do Documento         | Texto Curto (String) |                      |                                 |                                                                                                                                                                      | Document sequence number of the document | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|         Data da Transação          |         Data         |                      |                                 |                                                                                                                                                                      |             Transaction Date             |                                                                                                                                                                                                                                                                                                                                   The Transaction Date indicates the date of the transaction.                                                                                                                                                                                                                                                                                                                                   |
|             Descrição              | Texto Curto (String) |                      |                                 |                                                                                                                                                                      | Optional short description of the record |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|          Linha de Fatura           |       Procurar       |                      |     convoiceline\_mmatchinv     |                                                                                                                                                                      |           Invoice Detail Line            |                                                                                                                                                                                                                                                                                                                                The Invoice Line uniquely identifies a single line of an Invoice.                                                                                                                                                                                                                                                                                                                                |
|        Linha de Recebimento        |       Procurar       |                      |      minoutline\_mmatchinv      |                                                                                                                                                                      |   Line on Shipment or Receipt document   |                                                                                                                                                                                                                                                                                                                        The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                                                                                                                                                                                                                                                                                         |
|              Produto               |       Procurar       |                      |       mproduct\_mmatchinv       | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |          Product, Service, Item          |                                                                                                                                                                                                                                                                                                                           Identifies an item which is either purchased or sold in this organization.                                                                                                                                                                                                                                                                                                                            |
| Instância do Conjunto de Atributos | Atributo de Produto  |                      | mattributesetinstance\_mmatchin |                                                                                                                                                                      |      Product Attribute Set Instance      |                                                                                                                                                                                                                                                                                                        The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                                                                                                                                                                                                                                                                                         |
|             Quantidade             |      Quantidade      |                      |                                 |                                                                                                                                                                      |                 Quantity                 |                                                                                                                                                                                                                                                                                                                       The Quantity indicates the number of a specific product or item for this document.                                                                                                                                                                                                                                                                                                                        |
|           Data da Conta            |         Data         |                      |                                 |                                                                                                                                                                      |             Accounting Date              |                                                                                                                                                                                                                                                                               The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                                                                                                                                                                                                                                                |
|             Processado             |       Sim-Não        |                      |                                 |                                                                                                                                                                      |     The document has been processed      |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|              Lançado               |        Botão         |   \_Posted Status    |                                 |                                                                                                                                                                      |              Posting status              |                                                                                                                                                                                                                                                                                                                   The Posted field indicates the status of the Generation of General Ledger Accounting Lines                                                                                                                                                                                                                                                                                                                    |
|              Excluir               |        Botão         |                      |                                 |                                                                                                                                                                      |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          M\_MatchInv\_UU           | Texto Curto (String) |                      |                                 |                                                                                                                                                                      |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>
