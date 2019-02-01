---
title: "Meus Documentos Não Processados"
id: MeusDocumentosNaoProcessados
---
<div id="d146458e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Meus Documentos Não Processados

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Documentos Não Processados -
    RV\_Unprocessed](#d146458e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Meus Documentos Não
Processados

<span class="emphasis">*Comentário/Ajuda:* </span>Visualizar meus
documentos não processados

<span class="emphasis"> *Criado em:* </span>2009-07-24 12:44:53.0

<span class="emphasis">*Atualizado em:* </span>2009-07-24 13:07:49.0

![](/img/manual/MeusDocumentosNaoProcessados.png)

<div id="d146458e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Documentos Não Processados - RV\_Unprocessed

</div>

</div>

</div>

<span class="emphasis">*Claúsula Where:*</span>
RV\_Unprocessed.CreatedBy=@\#AD\_User\_ID@

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d146458e34" class="table">

<div class="table-title">

Table 1.1. Unprocessed Documents
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |                                                                 Valores (Padrão)                                                                  | Chave restritiva |        Regra de validação         |                Descrição                 |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-----------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :-------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Lançado       |        Botão         |                                                                  \_Posted Status                                                                  |                  |                                   |              Posting status              |                                                                                                                                                                                                                                                                                                                   The Posted field indicates the status of the Generation of General Ledger Accounting Lines                                                                                                                                                                                                                                                                                                                    |
|       Empresa       |    Tabela Direta     |                                                                                                                                                   |                  | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Organização     |    Tabela Direta     |                                                                                                                                                   |                  |                                   |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Tabela        |    Tabela Direta     |                                                                                                                                                   |                  |                                   |        Database Table information        |                                                                                                                                                                                                                                                                                                                               The Database Table provides the information of the table definition                                                                                                                                                                                                                                                                                                                               |
|   ID do Registro    |        Botão         |                                                                                                                                                   |                  |                                   |        Direct internal record ID         |                                                                                                                                                                                                                                                      The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.                                                                                                                                                                                                                                                       |
| Número do Documento | Texto Curto (String) |                                                                                                                                                   |                  |                                   | Document sequence number of the document | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|  Data do Documento  |      Data+Hora       |                                                                                                                                                   |                  |                                   |           Date of the Document           |                                                                                                                                                                                                                                                                                                     The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                                                                                                                                                                                                                                                                                      |
|    Data da Conta    |      Data+Hora       |                                                                                                                                                   |                  |                                   |             Accounting Date              |                                                                                                                                                                                                                                                                               The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                                                                                                                                                                                                                                                |
| Estado do Documento |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |                  |                                   |    The current status of the document    |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|     Processado      |       Sim-Não        |                                                                                                                                                   |                  |                                   |     The document has been processed      |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|   Processar Agora   |       Sim-Não        |                                                                                                                                                   |                  |                                   |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Transação de Vendas |       Sim-Não        |                                                                                                                                                   |                  |                                   |       This is a Sales Transaction        |                                                                                                                                                                                                                                                                                                                          The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                                                                                                                                                                                                                                                                          |
|        Ativo        |       Sim-Não        |                                                                                                                                                   |                  |                                   |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |

</div>

</div>

  

</div>
