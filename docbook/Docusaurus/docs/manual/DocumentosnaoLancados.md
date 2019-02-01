---
title: "Documentos não Lançados"
id: DocumentosnaoLancados
---
<div id="d81660e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Documentos não Lançados

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Documentos não Lançados -
    RV\_UnPosted](#d81660e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Documentos não Lançados

<span class="emphasis">*Comentário/Ajuda:* </span>Visualizar os
documentos não lançados

<span class="emphasis"> *Criado em:* </span>2003-12-14 01:36:03.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/DocumentosnaoLancados.png)

<div id="d81660e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Documentos não Lançados - RV\_UnPosted

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Visualizar os documentos não
lançados

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d81660e34" class="table">

<div class="table-title">

Table 1.1. Unposted Documents
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |                                                                 Valores (Padrão)                                                                  | Chave restritiva |                Regra de validação                |                                    Descrição                                     |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-----------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Ativo        |       Sim-Não        |                                                                        (Y)                                                                        |                  |                                                  |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|   Processar Agora   |       Sim-Não        |                                                                                                                                                   |                  |                                                  |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Empresa       |    Tabela Direta     |                                                               (@\#AD\_Client\_ID@)                                                                |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Organização     |    Tabela Direta     |                                                                 (@\#AD\_Org\_ID@)                                                                 |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
| Número do Documento | Texto Curto (String) |                                                                                                                                                   |                  |                                                  |                     Document sequence number of the document                     | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
| Transação de Vendas |       Sim-Não        |                                                                                                                                                   |                  |                                                  |                           This is a Sales Transaction                            |                                                                                                                                                                                                                                                                                                                          The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                                                                                                                                                                                                                                                                          |
|  Data do Documento  |         Data         |                                                                                                                                                   |                  |                                                  |                               Date of the Document                               |                                                                                                                                                                                                                                                                                                     The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                                                                                                                                                                                                                                                                                      |
|    Data da Conta    |         Data         |                                                                                                                                                   |                  |                                                  |                                 Accounting Date                                  |                                                                                                                                                                                                                                                                               The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                                                                                                                                                                                                                                                |
|       Tabela        |    Tabela Direta     |                                                                                                                                                   |                  |                                                  |                            Database Table information                            |                                                                                                                                                                                                                                                                                                                               The Database Table provides the information of the table definition                                                                                                                                                                                                                                                                                                                               |
|   ID do Registro    |        Botão         |                                                                                                                                                   |                  |                                                  |                            Direct internal record ID                             |                                                                                                                                                                                                                                                      The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.                                                                                                                                                                                                                                                       |
| Estado do Documento |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |                  |                                                  |                        The current status of the document                        |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|     Processado      |       Sim-Não        |                                                                                                                                                   |                  |                                                  |                         The document has been processed                          |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|       Lançado       |        Botão         |                                                                  \_Posted Status                                                                  |                  |                                                  |                                  Posting status                                  |                                                                                                                                                                                                                                                                                                                   The Posted field indicates the status of the Generation of General Ledger Accounting Lines                                                                                                                                                                                                                                                                                                                    |
|    Processado Em    |        Número        |                                                                                                                                                   |                  |                                                  | The date+time (expressed in decimal format) when the document has been processed |                                                                                                                                                                                                                                                                                                The ProcessedOn Date+Time save the exact moment (nanoseconds precision if allowed by the DB) when a document has been processed.                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>
