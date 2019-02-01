---
title: "Seleção de Pagamento"
id: SelecaodePagamento
---
<div id="d210967e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Seleção de Pagamento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Seleção de Pagamento -
    C\_PaySelection](#d210967e23)</span>
  - <span class="section">[2. Tabela: Linha de Seleção de Pagamento -
    C\_PaySelectionLine](#d210967e269)</span>
  - <span class="section">[3. Tabela: Pagamento Preparado -
    C\_PaySelectionCheck](#d210967e602)</span>

</div>

<span class="emphasis">*Descrição:* </span> Selecionar Faturas para
Pagamento

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Seleção de
Pagamento" permite a você selecionar e processar as faturas que você
deseja pagar. (a) Você pode criar uma Seleção de Pagamento e selecionar
as faturas manualmente ou gerar sugestões baseadas em critérios. Você
pode alterar o valor a ser pago ou excluir faturas que você não deseja
pagar. (b) Se você estiver contente com a Seleção de Pagamentos, você
cria os pagamentos. (c) Você imprime ou exporta seus pagamentos na
Janela "Imprimir/Exportar Pagamentos"

<span class="emphasis"> *Criado em:* </span>2001-02-15 17:12:45.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/SelecaodePagamento.png)

<div id="d210967e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Seleção de Pagamento - C\_PaySelection

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaySelection_data)

<span class="emphasis">*Descrição:*</span> Definir Pagamento

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Seleção de
Pagamento" define a conta bancária e data de pagamentos a serem feitos.
Você também cria pagamentos aqui.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d210967e40" class="table">

<div class="table-title">

Table 1.1. Payment Selection
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |   Valores (Padrão)   |      Chave restritiva       |                  Regra de validação                   |                                   Descrição                                    |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :------------------: | :-------------------------: | :---------------------------------------------------: | :----------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Seleção de Pagamento  |          ID          |                      |                             |                                                       |                               Payment Selection                                |                                              The Payment Selection identifies a unique Payment                                               |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                             |           AD\_Client.AD\_Client\_ID \< \> 0           |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                             | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|         Nome          | Texto Curto (String) |      (@\#Date@)      |                             |                                                       |                     Alphanumeric identifier of the entity                      | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       | Texto Curto (String) |                      |                             |                                                       |                    Optional short description of the record                    |                                                 A description is limited to 255 characters.                                                  |
|         Ativo         |       Sim-Não        |         (Y)          |                             |                                                       |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|    Conta Bancária     |    Tabela Direta     |                      | cbankaccount\_cpayselection |                                                       |                              Account at the Bank                               |                                             The Bank Account identifies an account at this Bank.                                             |
|   Data do Pagamento   |         Data         |      (@\#Date@)      |                             |                                                       |                               Date Payment made                                |                                          The Payment Date indicates the date the payment was made.                                           |
|       Aprovado        |       Sim-Não        |                      |                             |                                                       |                  Indicates if this document requires approval                  |                        The Approved checkbox indicates if this document requires approval before it can be processed.                        |
|      Valor Total      |        Valor         |                      |                             |                                                       |                                  Total Amount                                  |                                            The Total Amount indicates the total document amount.                                             |
| Criar a partir de ... |        Botão         |                      |                             |                                                       | Process which will generate a new document lines based on an existing document |            The Create From process will create a new document based on information in an existing document selected by the user.             |
|  Preparar Pagamento   |        Botão         |                      |                             |                                                       |                                                                                |                                                                                                                                              |
|      Processado       |       Sim-Não        |                      |                             |                                                       |                        The document has been processed                         |                                     The Processed checkbox indicates that a document has been processed.                                     |
|  C\_PaySelection\_UU  | Texto Curto (String) |                      |                             |                                                       |                                                                                |                                                                                                                                              |

</div>

</div>

  

<div id="d210967e269" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha de Seleção de Pagamento - C\_PaySelectionLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaySelectionLine_data)

<span class="emphasis">*Descrição:*</span> Linha de Seleção de Pagamento

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Linha de
Seleção de Pagamento" define as faturas individuais que uma
organização está pagando a um Fornecedor com este pagamento.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d210967e286" class="table">

<div class="table-title">

Table 1.2. Payment Selection Line
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |                                                      Valores (Padrão)                                                      |        Chave restritiva         |                                     Regra de validação                                      |                Descrição                 |                                                             Comentário/Ajuda                                                             |
| :--------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------: |
|               Manual               |       Sim-Não        |                                                                                                                            |                                 |                                                                                             |         This is a manual process         |                                    The Manual check box indicates if the process will done manually.                                     |
|   Linha de Seleção de Pagamento    |          ID          |                                                                                                                            |                                 |                                                                                             |          Payment Selection Line          |                                     The Payment Selection Line identifies a unique line in a payment                                     |
|              Empresa               |    Tabela Direta     |                                                     (@AD\_Client\_ID@)                                                     |                                 |                              AD\_Client.AD\_Client\_ID \< \> 0                              |    (semelhante ao primeiro relatório)    |                                                           (ver o mesmo acima)                                                            |
|            Organização             |    Tabela Direta     |                                                      (@AD\_Org\_ID@)                                                       |                                 |                    AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                    |    (semelhante ao primeiro relatório)    |                                                           (ver o mesmo acima)                                                            |
|        Seleção de Pagamento        |    Tabela Direta     |                                                                                                                            |      cpaysel\_cpayselline       |                                                                                             |            Payment Selection             |                                            The Payment Selection identifies a unique Payment                                             |
|             Linha Núm.             |       Inteiro        | (@SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C\_PaySelectionLine WHERE C\_PaySelection\_ID=@C\_PaySelection\_ID@) |                                 |                                                                                             |      Unique line for this document       |             Indicates the unique line for a document. It will also control the display order of the lines within a document.             |
|             Descrição              | Texto Curto (String) |                                                                                                                            |                                 |                                                                                             | Optional short description of the record |                                               A description is limited to 255 characters.                                                |
|               Ativo                |       Sim-Não        |                                                            (Y)                                                             |                                 |                                                                                             |    (semelhante ao primeiro relatório)    |                                                           (ver o mesmo acima)                                                            |
|         Regra de Pagamento         |        Lista         |                    Dinheiro Débito Direto Cartão de Crédito Mixed Em Crédito Cheque Depósito Direto (S)                    |                                 |                                AD\_Ref\_List.Value \< \> 'M'                                |         How you pay the invoice          |                                        The Payment Rule indicates the method of invoice payment.                                         |
|               Fatura               |       Procurar       |                                                                                                                            |    cinvoice\_cpayselectline     |                            C\_Invoice.DocStatus IN ('CO', 'CL')                             |            Invoice Identifier            |                                                          The Invoice Document.                                                           |
|        Transação de Vendas         |       Sim-Não        |                                                                                                                            |                                 |                                                                                             |       This is a Sales Transaction        |                              The Sales Transaction checkbox indicates if this item is a Sales Transaction.                               |
|            Valor Aberto            |        Valor         |                                                                                                                            |                                 |                                                                                             |             Open item amount             |                                                                                                                                          |
|         Valor do Pagamento         |        Valor         |                                                                                                                            |                                 |                                                                                             |            Amount being paid             | Indicates the amount this payment is for. The payment amount can be for single or multiple invoices or a partial payment for an invoice. |
|           Valor da Baixa           |        Valor         |                                                            (0)                                                             |                                 |                                                                                             |           Amount to write-off            |                              The Write Off Amount indicates the amount to be written off as uncollectible.                               |
|         Valor do Desconto          |        Valor         |                                                                                                                            |                                 |                                                                                             |      Calculated amount of discount       |                                The Discount Amount indicates the discount amount for a document or line.                                 |
|             Diferença              |        Valor         |                                                                                                                            |                                 |                                                                                             |            Difference Amount             |                                                                                                                                          |
|        Pay Selection Check         |    Tabela Direta     |                                                                                                                            |    cpayselcheck\_cpayselline    |                                                                                             |         Payment Selection Check          |                                                                                                                                          |
|             Processado             |       Sim-Não        |                                                            (N)                                                             |                                 |                                                                                             |     The document has been processed      |                                   The Processed checkbox indicates that a document has been processed.                                   |
| Programação de Pagamento de Fatura |        Tabela        |                                            C\_InvoicePaySchedule (Format Value)                                            | CInvoicePaySchedule\_CPaySelect | C\_InvoicePaySchedule.C\_Invoice\_ID=@C\_Invoice\_ID@ AND C\_InvoicePaySchedule.IsValid='Y' |         Invoice Payment Schedule         |                                  The Invoice Payment Schedule determines when partial payments are due.                                  |
|      C\_PaySelectionLine\_UU       | Texto Curto (String) |                                                                                                                            |                                 |                                                                                             |                                          |                                                                                                                                          |

</div>

</div>

  

<div id="d210967e602" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Pagamento Preparado - C\_PaySelectionCheck

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaySelectionCheck_data)

<span class="emphasis">*Descrição:*</span> Visualizar os Pagamentos
Preparados Gerados (Cheques)

<span class="emphasis">*Comentário/Ajuda:* </span> Você cria os
Pagamentos reais via "Imprimir/Exportar Pagamentos"

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d210967e619" class="table">

<div class="table-title">

Table 1.3. Prepared Payment
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |                                 Valores (Padrão)                                 |        Chave restritiva        |                   Regra de validação                   |                  Descrição                   |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :----------------------: | :------------------: | :------------------------------------------------------------------------------: | :----------------------------: | :----------------------------------------------------: | :------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Ativo           |       Sim-Não        |                                       (Y)                                        |                                |                                                        |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|   Pay Selection Check    |          ID          |                                                                                  |                                |                                                        |           Payment Selection Check            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|         Empresa          |    Tabela Direta     |                                (@AD\_Client\_ID@)                                |                                |           AD\_Client.AD\_Client\_ID \< \> 0            |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Organização        |    Tabela Direta     |                                 (@AD\_Org\_ID@)                                  |                                |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)    |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|   Seleção de Pagamento   |    Tabela Direta     |                                                                                  | cpayselection\_cpayselectcheck |                                                        |              Payment Selection               |                                                                                                                                                                                                                                                                                                                                        The Payment Selection identifies a unique Payment                                                                                                                                                                                                                                                                                                                                        |
|   Parceiro de Negócios   |       Procurar       |                                                                                  | cbpartner\_cpayselectioncheck  | C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N' |        Identifies a Business Partner         |                                                                                                                                                                                                                                                                                                         A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                                                                                                                                                                                                         |
|    Regra de Pagamento    |        Lista         | Dinheiro Débito Direto Cartão de Crédito Mixed Em Crédito Cheque Depósito Direto |                                |             AD\_Ref\_List.Value \< \> 'M'              |           How you pay the invoice            |                                                                                                                                                                                                                                                                                                                                    The Payment Rule indicates the method of invoice payment.                                                                                                                                                                                                                                                                                                                                    |
|        Quantidade        |       Inteiro        |                                                                                  |                                |                                                        |                   Quantity                   |                                                                                                                                                                                                                                                                                                                       The Quantity indicates the number of a specific product or item for this document.                                                                                                                                                                                                                                                                                                                        |
|    Valor do Pagamento    |        Valor         |                                                                                  |                                |                                                        |              Amount being paid               |                                                                                                                                                                                                                                                                                            Indicates the amount this payment is for. The payment amount can be for single or multiple invoices or a partial payment for an invoice.                                                                                                                                                                                                                                                                                             |
|    Valor do Desconto     |        Valor         |                                                                                  |                                |                                                        |        Calculated amount of discount         |                                                                                                                                                                                                                                                                                                                            The Discount Amount indicates the discount amount for a document or line.                                                                                                                                                                                                                                                                                                                            |
|      Valor da Baixa      |        Valor         |                                       (0)                                        |                                |                                                        |             Amount to write-off              |                                                                                                                                                                                                                                                                                                                          The Write Off Amount indicates the amount to be written off as uncollectible.                                                                                                                                                                                                                                                                                                                          |
|   Número do Documento    | Texto Curto (String) |                                                                                  |                                |                                                        |   Document sequence number of the document   | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|          Recibo          |       Sim-Não        |                                                                                  |                                |                                                        |    This is a sales transaction (receipt)     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|        Pagamento         |       Procurar       |                                    C\_Payment                                    |  cpayment\_cpayselectioncheck  |                                                        |              Payment identifier              |                                                                                                                                                                                                                                                                                                                                       The Payment is a unique identifier of this payment.                                                                                                                                                                                                                                                                                                                                       |
|         Impresso         |       Sim-Não        |                                                                                  |                                |                                                        | Indicates if this document / line is printed |                                                                                                                                                                                                                                                                                                                      The Printed checkbox indicates if this document or line will included when printing.                                                                                                                                                                                                                                                                                                                       |
|        Processado        |       Sim-Não        |                                       (N)                                        |                                |                                                        |       The document has been processed        |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
| C\_PaySelectionCheck\_UU | Texto Curto (String) |                                                                                  |                                |                                                        |                                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>
