---
title: "Recebimentos em Lote"
id: RecebimentosemLote
---
<div id="d191635e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Recebimentos em Lote

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Lote -
    C\_DepositBatch](#d191635e22)</span>
  - <span class="section">[2. Tabela: Linhas -
    C\_DepositBatchLine](#d191635e276)</span>

</div>

<span class="emphasis">*Descrição:* </span> Processar Recebimentos

<span class="emphasis">*Comentário/Ajuda:* </span>A janela de
recebimento em Lote perme o lançamento de recebimentos para faturas. Se
o pagamento é para uma única fatura ele pode ser processado aqui.

<span class="emphasis"> *Criado em:* </span>2013-01-23 18:12:25.0

<span class="emphasis">*Atualizado em:* </span>2013-04-11 15:00:38.0

<div id="d191635e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Lote - C\_DepositBatch

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d191635e29" class="table">

<div class="table-title">

Table 1.1. Batch
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |                                                                    Valores (Padrão)                                                                    |      Chave restritiva       |                                    Regra de validação                                     |                                   Descrição                                    |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :----------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------: | :---------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Depósito em Lote     |          ID          |                                                                                                                                                        |                             |                                                                                           |                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|   Estado do Documento    |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                             |                                                                                           |                       The current status of the document                       |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|         Empresa          |    Tabela Direta     |                                                                  (@\#AD\_Client\_ID@)                                                                  |                             |                             AD\_Client.AD\_Client\_ID \< \> 0                             |                       (semelhante ao primeiro relatório)                       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Organização        |    Tabela Direta     |                                                                   (@\#AD\_Org\_ID@)                                                                    |                             |                     (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                      |                       (semelhante ao primeiro relatório)                       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|      Conta Bancária      |    Tabela Direta     |                                                                                                                                                        | cbankaccount\_cdepositbatch |                                                                                           |                              Account at the Bank                               |                                                                                                                                                                                                                                                                                                                                      The Bank Account identifies an account at this Bank.                                                                                                                                                                                                                                                                                                                                       |
|     Data do Depósito     |         Data         |                                                                       (@\#Date@)                                                                       |                             |                                                                                           |                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|    Tipo de Documento     |    Tabela Direta     |                                                                                                                                                        |   cdoctype\_cdepositbatch   | C\_DocType.DocBaseType IN ('ARR', 'APP') AND C\_DocType.AD\_Client\_ID=@\#AD\_Client\_ID@ |                             Document type or rules                             |                                                                                                                                                                                                                                                                                                                               The Document Type determines document sequence and processing rules                                                                                                                                                                                                                                                                                                                               |
|   Número do Documento    | Texto Curto (String) |                                                                                                                                                        |                             |                                                                                           |                    Document sequence number of the document                    | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|    Data do Documento     |         Data         |                                                                       (@\#Date@)                                                                       |                             |                                                                                           |                              Date of the Document                              |                                                                                                                                                                                                                                                                                                     The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                                                                                                                                                                                                                                                                                      |
|        Descrição         | Texto Curto (String) |                                                                                                                                                        |                             |                                                                                           |                    Optional short description of the record                    |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|    Valor do Depósito     |        Valor         |                                                                                                                                                        |                             |                                                                                           |                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Criar linhas a partir de |        Botão         |                                                                                                                                                        |                             |                                                                                           | Process which will generate a new document lines based on an existing document |                                                                                                                                                                                                                                                                                                      The Create From process will create a new document based on information in an existing document selected by the user.                                                                                                                                                                                                                                                                                                      |
|          Ativo           |       Sim-Não        |                                                                          (Y)                                                                           |                             |                                                                                           |                       (semelhante ao primeiro relatório)                       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
| Fechar Lote de Deposito  |        Botão         |                                                                                                                                                        |                             |              <span class="emphasis">*ReadOnly Logic*</span>: @Processed@='Y'              |                                                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|        Processado        |       Sim-Não        |                                                                                                                                                        |                             |                                                                                           |                        The document has been processed                         |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d191635e276" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linhas - C\_DepositBatchLine

</div>

</div>

</div>

<span class="emphasis">*Lógica de somente leitura:*</span>
@Processed@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d191635e287" class="table">

<div class="table-title">

Table 1.2. Lines
Fields

</div>

<div class="table-contents">

|       Nome do campo       |  Referência   |                                                      Valores (Padrão)                                                      |        Chave restritiva         |                                                                                       Regra de validação                                                                                       |             Descrição              |                                                             Comentário/Ajuda                                                             |
| :-----------------------: | :-----------: | :------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------: |
|      Processar Agora      |    Sim-Não    |                                                                                                                            |                                 |                                                                                                                                                                                                |                                    |                                                                                                                                          |
| Linha de Depósito em Lote |      ID       |                                                                                                                            |                                 |                                                                                                                                                                                                |                                    |                                                                                                                                          |
|          Empresa          | Tabela Direta |                                                    (@\#AD\_Client\_ID@)                                                    |                                 |                                                                               AD\_Client.AD\_Client\_ID \< \> 0                                                                                | (semelhante ao primeiro relatório) |                                                           (ver o mesmo acima)                                                            |
|        Organização        | Tabela Direta |                                                     (@\#AD\_Org\_ID@)                                                      |                                 |                                                                        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                        | (semelhante ao primeiro relatório) |                                                           (ver o mesmo acima)                                                            |
|     Depósito em Lote      |   Procurar    |                                                                                                                            | cdepositbatch\_cdepositbatchlin |                                                                                                                                                                                                |                                    |                                                                                                                                          |
|        Linha Núm.         |    Inteiro    | (@SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C\_DepositBatchLine WHERE C\_DepositBatch\_ID=@C\_DepositBatch\_ID@) |                                 |                                                                                                                                                                                                |   Unique line for this document    |             Indicates the unique line for a document. It will also control the display order of the lines within a document.             |
|         Pagamento         | Tabela Direta |                                                                                                                            |   cpayment\_cdepositbatchline   | C\_Payment.IsReconciled='N' AND C\_Payment.TrxType \< \> 'X' AND (C\_Payment.C\_DepositBatch\_ID = 0 OR C\_Payment.C\_DepositBatch\_ID IS NULL) AND C\_Payment.C\_DocType\_ID=@C\_DocType\_ID@ |         Payment identifier         |                                           The Payment is a unique identifier of this payment.                                            |
|    Valor do Pagamento     |     Valor     |                                                                                                                            |                                 |                                                                                                                                                                                                |         Amount being paid          | Indicates the amount this payment is for. The payment amount can be for single or multiple invoices or a partial payment for an invoice. |
|           Ativo           |    Sim-Não    |                                                            (Y)                                                             |                                 |                                                                                                                                                                                                | (semelhante ao primeiro relatório) |                                                           (ver o mesmo acima)                                                            |
|        Processado         |    Sim-Não    |                                                                                                                            |                                 |                                                                                                                                                                                                |  The document has been processed   |                                   The Processed checkbox indicates that a document has been processed.                                   |

</div>

</div>

  

</div>
