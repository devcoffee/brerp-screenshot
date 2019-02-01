---
title: "Processador de Pagamento"
id: ProcessadordePagamento
---
<div id="d179176e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Pagamento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador de Pagamento -
    C\_PaymentProcessor](#d179176e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-10-03 15:53:54.0

<span class="emphasis">*Atualizado em:* </span>2012-10-03 15:53:54.0

![](/img/manual/ProcessadordePagamento.png)

<div id="d179176e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador de Pagamento - C\_PaymentProcessor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaymentProcessor_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d179176e32" class="table">

<div class="table-title">

Table 1.1. Payment Processor
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |      Referência      |                                   Valores (Padrão)                                    |       Chave restritiva        |                Regra de validação                |                 Descrição                  |                                                                                                                        Comentário/Ajuda                                                                                                                         |
| :------------------------------------------------: | :------------------: | :-----------------------------------------------------------------------------------: | :---------------------------: | :----------------------------------------------: | :----------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                     Comissão %                     |        Número        |                                                                                       |                               |                                                  |     Commission stated as a percentage      |                                                                                              The Commission indicates (as a percentage) the commission to be paid.                                                                                              |
|              Processador de Pagamento              |          ID          |                                                                                       |                               |                                                  | Payment processor for electronic payments  |                                                                                        The Payment Processor indicates the processor to be used for electronic payments                                                                                         |
|                   Conta Bancária                   |    Tabela Direta     |                                                                                       | cbankaccount\_cpaymtprocessor |                                                  |            Account at the Bank             |                                                                                                      The Bank Account identifies an account at this Bank.                                                                                                       |
|                     Seqüência                      |        Tabela        |                              AD\_Sequence for Documents                               | adsequence\_cpaymentprocessor |                                                  |             Document Sequence              |                                                                                              The Sequence defines the numbering sequence to be used for documents.                                                                                              |
|                Custo por transação                 |    Custos+Preços     |                                                                                       |                               |                                                  |         Fixed cost per transaction         |                                                                                      The Cost per Transaction indicates the fixed cost per to be charged per transaction.                                                                                       |
|                      Empresa                       |    Tabela Direta     |                                 (@\#AD\_Client\_ID@)                                  |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|                    Organização                     |    Tabela Direta     |                                   (@\#AD\_Org\_ID@)                                   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|                        Nome                        | Texto Curto (String) |                                                                                       |                               |                                                  |   Alphanumeric identifier of the entity    |                                                          The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                           |
|                     Descrição                      | Texto Curto (String) |                                                                                       |                               |                                                  |  Optional short description of the record  |                                                                                                           A description is limited to 255 characters.                                                                                                           |
|                       Ativo                        |       Sim-Não        |                                          (Y)                                          |                               |                                                  |     (semelhante ao primeiro relatório)     |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|               Endereço do Hospedeiro               | Texto Curto (String) |                                                                                       |                               |                                                  |          Host Address URL or DNS           |                                                                                                  The Host Address identifies the URL or DNS of the target host                                                                                                  |
|                Porta do Hospedeiro                 |       Inteiro        |                                                                                       |                               |                                                  |          Host Communication Port           |                                                                                                 The Host Port identifies the port to communicate with the host.                                                                                                 |
|                   Endereço Proxy                   | Texto Curto (String) |                                                                                       |                               |                                                  |        Address of your proxy server        |                                                                             The Proxy Address must be defined if you must pass through a firewall to access your payment processor.                                                                             |
|                   Porta do Proxy                   |       Inteiro        |                                                                                       |                               |                                                  |         Port of your proxy server          |                                                                                                    The Proxy Port identifies the port of your proxy server.                                                                                                     |
|                    Proxy logon                     | Texto Curto (String) |                                                                                       |                               |                                                  |         Logon of your proxy server         |                                                                                                 The Proxy Logon identifies the Logon ID for your proxy server.                                                                                                  |
|                   Senha do Proxy                   | Texto Curto (String) |                                                                                       |                               |                                                  |       Password of your proxy server        |                                                                                                The Proxy Password identifies the password for your proxy server.                                                                                                |
|                 Aceita Master Card                 |       Sim-Não        |                                                                                       |                               |                                                  |             Accept Master Card             |                                                                                                             Indicates if Master Cards are accepted                                                                                                              |
|                    Aceita Visa                     |       Sim-Não        |                                                                                       |                               |                                                  |             Accept Visa Cards              |                                                                                                              Indicates if Visa Cards are accepted                                                                                                               |
|                    Aceita AMEX                     |       Sim-Não        |                                                                                       |                               |                                                  |        Accept American Express Card        |                                                                                                        Indicates if American Express Cards are accepted                                                                                                         |
|                   Aceita Diners                    |       Sim-Não        |                                                                                       |                               |                                                  |            Accept Diner's Club             |                                                                                                          Indicates if Diner's Club Cards are accepted                                                                                                           |
|                 Aceita Corporativo                 |       Sim-Não        |                                                                                       |                               |                                                  |      Accept Corporate Purchase Cards       |                                                                                                       Indicates if Corporate Purchase Cards are accepted                                                                                                        |
|                  Aceita Discover                   |       Sim-Não        |                                                                                       |                               |                                                  |            Accept Discover Card            |                                                                                                            Indicates if Discover Cards are accepted                                                                                                             |
|              Aceitar Depósito Direto               |       Sim-Não        |                                                                                       |                               |                                                  |  Accept Direct Deposit (payee initiated)   |                                                                          Indicates if Direct Deposits (wire transfers, etc.) are accepted. Direct Deposits are initiated by the payee.                                                                          |
|                Aceita Débito Direto                |       Sim-Não        |                                                                                       |                               |                                                  |  Accept Direct Debits (vendor initiated)   |                                                           Accept Direct Debit transactions. Direct Debits are initiated by the vendor who has permission to deduct amounts from the payee's account.                                                            |
|              Aceita Cheque Eletrônico              |       Sim-Não        |                                                                                       |                               |                                                  |     Accept ECheck (Electronic Checks)      |                                                                                                                Indicates if EChecks are accepted                                                                                                                |
|                     Aceita ATM                     |       Sim-Não        |                                                                                       |                               |                                                  |            Accept Bank ATM Card            |                                                                                                            Indicates if Bank ATM Cards are accepted                                                                                                             |
|                    Valor Mínimo                    |        Valor         |                                                                                       |                               |                                                  |    Minimum Amount in Document Currency     |                                                                                                                                                                                                                                                                 |
|                   Only Currency                    |    Tabela Direta     |                                                                                       | ccurrency\_cpaymentprocessor  |                                                  |        The Currency for this record        |                                                                                          Indicates the Currency to be used when processing or reporting on this record                                                                                          |
| Exige o Código de Verificação do Cartão de Crédito |       Sim-Não        |                                                                                       |                               |                                                  | Require 3/4 digit Credit Verification Code |                                                                The Require CC Verification checkbox indicates if this bank accounts requires a verification number for credit card transactions.                                                                |
|         Classe de Processador de Pagamento         | Texto Curto (String) |                                                                                       |                               |                                                  |        Payment Processor Java Class        | Payment Processor class identifies the Java class used to process payments extending the org.compiere.model.PaymentProcessor class. Example implementations are Optimal Payments: org.compiere.model.PP\_Optimal or Verisign: org.compiere.model.PP\_PayFlowPro |
|                 Tipo de Transação                  |        Lista         | Autorização Crédito (Pagamento) Captação Postergada Autorização Verbal Vendas Anulado |                               |                                                  |      Type of credit card transaction       |                                                                               The Transaction Type indicates the type of transaction to be submitted to the Credit Card Company.                                                                                |

</div>

</div>

  

</div>
