---
title: "Importar Extrato Bancário"
id: ImportarExtratoBancario
---
<div id="d115680e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Extrato Bancário

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Extrato Bancário -
    I\_BankStatement](#d115680e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importar Extratos Bancários

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2003-06-07 20:39:05.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d115680e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Extrato Bancário - I\_BankStatement

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Importar Extrato Bancário

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d115680e33" class="table">

<div class="table-title">

Table 1.1. Bank Statement
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |                                   Valores (Padrão)                                    |        Chave restritiva        |                Regra de validação                |                           Descrição                           |                                                                                                                                          Comentário/Ajuda                                                                                                                                          |
| :-----------------------------: | :------------------: | :-----------------------------------------------------------------------------------: | :----------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Ativo              |       Sim-Não        |                                          (Y)                                          |                                |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|    Importar Extrato Bancário    |          ID          |                                                                                       |                                |                                                  |                 Import of the Bank Statement                  |                                                                                                                                                                                                                                                                                                    |
|            Importado            |       Sim-Não        |                                                                                       |                                |                                                  |                Has this import been processed                 |                                                                                                                The Imported check box indicates if this import has been processed.                                                                                                                 |
|        Extrato Bancário         |       Procurar       |                                                                                       | cbankstatement\_ibankstatement |                                                  |                   Bank Statement of account                   |                                                                               The Bank Statement identifies a unique Bank Statement for a defined time period. The statement defines all transactions that occurred                                                                                |
|    Linha de Extrato Bancário    |       Procurar       |                                                                                       |    cbankstmtline\_ibankstmt    |                                                  |              Line on a statement from this Bank               |                                                                                  The Bank Statement Line identifies a unique transaction (Payment, Withdrawal, Charge) for the defined time period at this Bank.                                                                                   |
| Mensagem de Erro de Importação  | Texto Curto (String) |                                                                                       |                                |                                                  |            Messages generated from import process             |                                                                                                     The Import Error Message displays any error messages generated during the import process.                                                                                                      |
|             Empresa             |    Tabela Direta     |                                 (@\#AD\_Client\_ID@)                                  |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|           Organização           |    Tabela Direta     |                                   (@\#AD\_Org\_ID@)                                   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|              Nome               | Texto Curto (String) |                                                                                       |                                |                                                  |             Alphanumeric identifier of the entity             |                                                                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                            |
|            Descrição            | Texto Curto (String) |                                                                                       |                                |                                                  |           Optional short description of the record            |                                                                                                                            A description is limited to 255 characters.                                                                                                                             |
|       Número de Rastreio        | Texto Curto (String) |                                                                                       |                                |                                                  |                      Bank Routing Number                      |                                                                                      The Bank Routing Number (ABA Number) identifies a legal Bank. It is used in routing checks and electronic transactions.                                                                                       |
|     Núm. da Conta Bancária      | Texto Curto (String) |                                                                                       |                                |                                                  |                      Bank Account Number                      |                                                                                                                                                                                                                                                                                                    |
|              IBAN               | Texto Curto (String) |                                                                                       |                                |                                                  |               International Bank Account Number               | If your bank provides an International Bank Account Number, enter it here Details ISO 13616 and http://www.ecbs.org. The account number has the maximum length of 22 characters (without spaces). The IBAN is often printed with a apace after 4 characters. Do not enter the spaces in iDempiere. |
|         Conta Bancária          |    Tabela Direta     |                                                                                       |  cbankaccount\_ibankstatement  |                                                  |                      Account at the Bank                      |                                                                                                                        The Bank Account identifies an account at this Bank.                                                                                                                        |
|         Data do Extrato         |         Data         |                                                                                       |                                |                                                  |                     Date of the statement                     |                                                                                                                    The Statement Date field defines the date of the statement.                                                                                                                     |
|           Linha Núm.            |       Inteiro        |                                                                                       |                                |                                                  |                 Unique line for this document                 |                                                                                          Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                                          |
|         Núm. Referência         | Texto Curto (String) |                                                                                       |                                |                                                  | Your customer or vendor number at the Business Partner's site |                                                                                     The reference number can be printed on orders and invoices to allow your business partner to faster identify your records.                                                                                     |
|       Descrição de Linha        | Texto Curto (String) |                                                                                       |                                |                                                  |                    Description of the Line                    |                                                                                                                                                                                                                                                                                                    |
|    Data da Linha de Extrato     |         Data         |                                                                                       |                                |                                                  |                  Date of the Statement Line                   |                                                                                                                                                                                                                                                                                                    |
|          Data da Conta          |         Data         |                                                                                       |                                |                                                  |                        Accounting Date                        |                                                                 The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                                 |
|        Data de Vigência         |         Data         |                                                                                       |                                |                                                  |                 Date when money is available                  |                                                                                                            The Effective Date indicates the date that money is available from the bank.                                                                                                            |
|            Estornar             |       Sim-Não        |                                                                                       |                                |                                                  |                This is a reversing transaction                |                                                                                                           The Reversal check box indicates if this is a reversal of a prior transaction.                                                                                                           |
|       Código de Moeda ISO       | Texto Curto (String) |                                                                                       |                                |                                                  |          Three letter ISO 4217 Code of the Currency           |                                                                                                                      For details - http://www.unece.org/trade/rec/rec09en.htm                                                                                                                      |
|            Moeda De             |    Tabela Direta     |                                                                                       |   ccurrency\_ibankstatement    |                                                  |                 The Currency for this record                  |                                                                                                           Indicates the Currency to be used when processing or reporting on this record                                                                                                            |
|       Valor da Transação        |        Valor         |                                                                                       |                                |                                                  |                    Amount of a transaction                    |                                                                                                               The Transaction Amount indicates the amount for a single transaction.                                                                                                                |
|        Valor do Extrato         |        Valor         |                                                                                       |                                |                                                  |                       Statement Amount                        |                                                                                                               The Statement Amount indicates the amount of a single statement line.                                                                                                                |
|         Nome da Despesa         | Texto Curto (String) |                                                                                       |                                |                                                  |                      Name of the Charge                       |                                                                                                                                                                                                                                                                                                    |
|           Finalidade            |    Tabela Direta     |                                                                                       |       ccharge\_ibankstmt       |                                                  |                  Additional document charges                  |                                                                                                               The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                                                                                               |
|         Valor dos Juros         |        Valor         |                                                                                       |                                |                                                  |                        Interest Amount                        |                                                                                                        The Interest Amount indicates any interest charged or received on a Bank Statement.                                                                                                         |
|        Valor da Despesa         |        Valor         |                                                                                       |                                |                                                  |                         Charge Amount                         |                                                                                                                  The Charge Amount indicates the amount for an additional charge.                                                                                                                  |
|            Memorando            | Texto Curto (String) |                                                                                       |                                |                                                  |                           Memo Text                           |                                                                                                                                                                                                                                                                                                    |
|  Chave de Parceiro de Negócios  | Texto Curto (String) |                                                                                       |                                |                                                  |                  Key of the Business Partner                  |                                                                                                                                                                                                                                                                                                    |
|      Parceiro de Negócios       |       Procurar       |                                                                                       |   cbpartner\_ibankstatement    |                                                  |                 Identifies a Business Partner                 |                                                                                          A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                           |
|   Núm. de Documento de Fatura   | Texto Curto (String) |                                                                                       |                                |                                                  |                Document Number of the Invoice                 |                                                                                                                                                                                                                                                                                                    |
|             Fatura              |       Procurar       |                                                                                       |    cinvoice\_ibankstatement    |                                                  |                      Invoice Identifier                       |                                                                                                                                       The Invoice Document.                                                                                                                                        |
| Núm. de Documento de Pagamento  | Texto Curto (String) |                                                                                       |                                |                                                  |                Document number of the Payment                 |                                                                                                                                                                                                                                                                                                    |
|            Pagamento            |       Procurar       |                                                                                       |    cpayment\_ibankstatement    |                                                  |                      Payment identifier                       |                                                                                                                        The Payment is a unique identifier of this payment.                                                                                                                         |
|        Tipo de Transação        |        Lista         | Autorização Crédito (Pagamento) Captação Postergada Autorização Verbal Vendas Anulado |                                |                                                  |                Type of credit card transaction                |                                                                                                 The Transaction Type indicates the type of transaction to be submitted to the Credit Card Company.                                                                                                 |
|   Confrontar Extrato Bancário   |        Botão         |                                                                                       |                                |                                                  |                                                               |                                                                                                                                                                                                                                                                                                    |
|    Importar Extrato Bancário    |        Botão         |                                                                                       |                                |                                                  |                                                               |                                                                                                                                                                                                                                                                                                    |
|         Criar Pagamento         |        Botão         |                                                                                       |                                |                                                  |                                                               |                                                                                                                                                                                                                                                                                                    |
|           Processado            |       Sim-Não        |                                                                                       |                                |                                                  |                The document has been processed                |                                                                                                                The Processed checkbox indicates that a document has been processed.                                                                                                                |
|  Referência do Extrato da TEF   | Texto Curto (String) |                                                                                       |                                |                                                  |         Electronic Funds Transfer Statement Reference         |                                                                                                                                     Information from EFT media                                                                                                                                     |
|     Data do Extrato da TEF      |         Data         |                                                                                       |                                |                                                  |           Electronic Funds Transfer Statement Date            |                                                                                                                                     Information from EFT media                                                                                                                                     |
|        ID de Trx de TEF         | Texto Curto (String) |                                                                                       |                                |                                                  |           Electronic Funds Transfer Transaction ID            |                                                                                                                                     Information from EFT media                                                                                                                                     |
|       Tipo de Trx de TEF        | Texto Curto (String) |                                                                                       |                                |                                                  |          Electronic Funds Transfer Transaction Type           |                                                                                                                                     Information from EFT media                                                                                                                                     |
|       Núm. Cheque de TEF        | Texto Curto (String) |                                                                                       |                                |                                                  |              Electronic Funds Transfer Check No               |                                                                                                                                     Information from EFT media                                                                                                                                     |
|        Referência de TEF        | Texto Curto (String) |                                                                                       |                                |                                                  |              Electronic Funds Transfer Reference              |                                                                                                                                     Information from EFT media                                                                                                                                     |
|            Memo TEF             | Texto Curto (String) |                                                                                       |                                |                                                  |                Electronic Funds Transfer Memo                 |                                                                                                                                     Information from EFT media                                                                                                                                     |
|       Beneficiário da TEF       | Texto Curto (String) |                                                                                       |                                |                                                  |          Electronic Funds Transfer Payee information          |                                                                                                                                     Information from EFT media                                                                                                                                     |
|  Conta do Beneficiário da TEF   | Texto Curto (String) |                                                                                       |                                |                                                  |      Electronic Funds Transfer Payee Account Information      |                                                                                                                                     Information from EFT media                                                                                                                                     |
| Data da Linha do Extrato da TEF |         Data         |                                                                                       |                                |                                                  |         Electronic Funds Transfer Statement Line Date         |                                                                                                                                     Information from EFT media                                                                                                                                     |
|       Data Efetiva da TEF       |         Data         |                                                                                       |                                |                                                  |       Electronic Funds Transfer Valuta (effective) Date       |                                                                                                                                     Information from EFT media                                                                                                                                     |
|          Moeda da TEF           | Texto Curto (String) |                                                                                       |                                |                                                  |              Electronic Funds Transfer Currency               |                                                                                                                                     Information from EFT media                                                                                                                                     |
|          Valor da TEF           |        Valor         |                                                                                       |                                |                                                  |               Electronic Funds Transfer Amount                |                                                                                                                                                                                                                                                                                                    |
|      I\_BankStatement\_UU       | Texto Curto (String) |                                                                                       |                                |                                                  |                                                               |                                                                                                                                                                                                                                                                                                    |

</div>

</div>

  

</div>