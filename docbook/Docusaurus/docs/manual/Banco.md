---
title: "Banco"
id: Banco
---
<div id="d16416e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Banco

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Banco -
    C\_Bank](#d16416e23)</span>
  - <span class="section">[2. Tabela: Conta -
    C\_BankAccount](#d16416e212)</span>
  - <span class="section">[3. Tabela: Documento de Conta Bancária -
    C\_BankAccountDoc](#d16416e544)</span>
  - <span class="section">[4. Tabela: Processador de Conta Bancária -
    C\_BankAccount\_Processor](#d16416e748)</span>
  - <span class="section">[5. Tabela: Carregador de Extrato -
    C\_BankStatementLoader](#d16416e1251)</span>
  - <span class="section">[6. Tabela: Contabilidade -
    C\_BankAccount\_Acct](#d16416e1634)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Bancos

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Banco" é
usada para definir os bancos e as contas associadas com uma organização
ou parceiro de negócios

<span class="emphasis"> *Criado em:* </span>1999-12-04 21:30:21.0

<span class="emphasis">*Atualizado em:* </span>2012-09-07 00:09:36.0

![](/img/manual/Banco.png)

<div id="d16416e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Banco - C\_Bank

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Bank_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Bancos

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Banco" define
um banco que é usado por uma organização ou um parceiro de negócios. A
cada Banco é dado um Nome de identificação, Endereço, Número Rastreador
(Routing No) e Código SWIFT (Society For Worldwide Interbank Financial
Telecommunications)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d16416e40" class="table">

<div class="table-title">

Table 1.1. Bank / Cash
Fields

</div>

<div class="table-contents">

|   Nome do campo    |       Referência       |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                                                                                                                                     Comentário/Ajuda                                                                                                                                                                      |
| :----------------: | :--------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Banco        |           ID           |                      |                  |                                                  |                   Bank                   |                                                                                                             The Bank is a unique identifier of a Bank for this Organization or for a Business Partner with whom this Organization transacts.                                                                                                              |
|      Empresa       |     Tabela Direta      | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|    Organização     |     Tabela Direta      |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|        Nome        |  Texto Curto (String)  |                      |                  |                                                  |  Alphanumeric identifier of the entity   |                                                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                        |
|     Descrição      |  Texto Curto (String)  |                      |                  |                                                  | Optional short description of the record |                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                        |
|       Ativo        |        Sim-Não         |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|      Endereço      | Localização (Endereço) |                      | clocation\_cbank |                                                  |           Location or Address            |                                                                                                                                              The Location / Address field defines the location of an entity.                                                                                                                                              |
|   Banco Próprio    |        Sim-Não         |         (Y)          |                  |                                                  |        Bank for this Organization        |                                                                                                                      The Own Bank field indicates if this bank is for this Organization as opposed to a Bank for a Business Partner.                                                                                                                      |
| Número de Rastreio |  Texto Curto (String)  |                      |                  |                                                  |           Bank Routing Number            |                                                                                                                  The Bank Routing Number (ABA Number) identifies a legal Bank. It is used in routing checks and electronic transactions.                                                                                                                  |
|    Código SWIFT    |  Texto Curto (String)  |                      |                  |                                                  |            Swift Code or BIC             | The Swift Code (Society of Worldwide Interbank Financial Telecommunications) or BIC (Bank Identifier Code) is an identifier of a Bank. The first 4 characters are the bank code, followed by the 2 character country code, the two character location code and optional 3 character branch code. For details see http://www.swift.com/biconline/index.cfm |

</div>

</div>

  

<div id="d16416e212" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Conta - C\_BankAccount

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_BankAccount_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Conta
Bancária

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Conta" é usada
para definir uma ou mais contas em um Banco. Cada conta tem uma Moeda e
um Número de Conta exclusivo. A conta bancária da organização é
utilizada para a contabilidade.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d16416e229" class="table">

<div class="table-title">

Table 1.2. Account
Fields

</div>

<div class="table-contents">

|              Nome do campo              |      Referência      |            Valores (Padrão)             |    Chave restritiva     |                  Regra de validação                   |                Descrição                 |                                                                                                                                          Comentário/Ajuda                                                                                                                                          |
| :-------------------------------------: | :------------------: | :-------------------------------------: | :---------------------: | :---------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Conta Bancária              |          ID          |                                         |                         |                                                       |           Account at the Bank            |                                                                                                                        The Bank Account identifies an account at this Bank.                                                                                                                        |
|                 Empresa                 |    Tabela Direta     |           (@AD\_Client\_ID@)            |                         |           AD\_Client.AD\_Client\_ID \< \> 0           |    (semelhante ao primeiro relatório)    |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|               Organização               |    Tabela Direta     |             (@AD\_Org\_ID@)             |                         | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |    (semelhante ao primeiro relatório)    |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|             Chave de Busca              | Texto Curto (String) |                                         |                         |                                                       |    (semelhante ao primeiro relatório)    |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|                  Nome                   | Texto Curto (String) |                                         |                         |                                                       |  Alphanumeric identifier of the entity   |                                                                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                            |
|                  Banco                  |    Tabela Direta     |                                         |   cbank\_cbankaccount   |                                                       |                   Bank                   |                                                                                  The Bank is a unique identifier of a Bank for this Organization or for a Business Partner with whom this Organization transacts.                                                                                  |
|               Núm. Conta                | Texto Curto (String) |                                         |                         |                                                       |              Account Number              |                                                                                                               The Account Number indicates the Number assigned to this bank account.                                                                                                               |
|                  NCBB                   | Texto Curto (String) |                                         |                         |                                                       |        Basic Bank Account Number         |                                                                             The Basic (or Domestic) Bank Account Number is used in Bank transfers (see also IBAN). For details see ISO 13616 and http://www.ecbs.org/                                                                              |
|                  IBAN                   | Texto Curto (String) |                                         |                         |                                                       |    International Bank Account Number     | If your bank provides an International Bank Account Number, enter it here Details ISO 13616 and http://www.ecbs.org. The account number has the maximum length of 22 characters (without spaces). The IBAN is often printed with a apace after 4 characters. Do not enter the spaces in iDempiere. |
|                Descrição                | Texto Curto (String) |                                         |                         |                                                       | Optional short description of the record |                                                                                                                            A description is limited to 255 characters.                                                                                                                             |
|                  Ativo                  |       Sim-Não        |                   (Y)                   |                         |                                                       |    (semelhante ao primeiro relatório)    |                                                                                                                                        (ver o mesmo acima)                                                                                                                                         |
|                 Padrão                  |       Sim-Não        |                                         |                         |                                                       |              Default value               |                                                                                                           The Default Checkbox indicates if this record will be used as a default value.                                                                                                           |
|                Moeda De                 |    Tabela Direta     |                                         | ccurrency\_cbankaccount |                                                       |       The Currency for this record       |                                                                                                           Indicates the Currency to be used when processing or reporting on this record                                                                                                            |
|         Tipo de Conta Bancária          |        Lista         | Dinheiro Conta Corrente Cartão Poupança |                         |                                                       |            Bank Account Type             |                                                                                           The Bank Account Type field indicates the type of account (savings, checking etc) this account is defined as.                                                                                            |
|            Limite de Crédito            |        Número        |                                         |                         |                                                       |         Amount of Credit allowed         |                                                                                                                The Credit Limit field indicates the credit limit for this account.                                                                                                                 |
| Classe Exportação da Folha de Pagamento | Texto Curto (String) |                                         |                         |                                                       |                                          |                                                                                                                                                                                                                                                                                                    |
|               Saldo Atual               |        Número        |                                         |                         |                                                       |             Current Balance              |                                                                                                              The Current Balance field indicates the current balance in this account.                                                                                                              |
|          Compoe Fluxo de Caixa          |       Sim-Não        |                  ('Y')                  |                         |                                                       |                                          |                                                                                                                                                                                                                                                                                                    |
|            Centro de Custo 2            |        Tabela        |           Account\_ID - User2           | COFUser2\_CBankAccount  |                                                       |            Centro de Custo 2             |                                                                                                                                         Centro de Custo 2.                                                                                                                                         |
|         Transitória de Crédito          |       Sim-Não        |                   (N)                   |                         |                                                       |                                          |                                                                                                                                                                                                                                                                                                    |

</div>

</div>

  

<div id="d16416e544" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Documento de Conta Bancária - C\_BankAccountDoc

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_BankAccountDoc_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Documentos
de Conta Bancária

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Documento de
Conta Bancária" define os documentos utilizados para esta conta
bancária. Você define seu cheque e outro número de documento de
pagamento (seqüência) assim como o formato.

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d16416e561" class="table">

<div class="table-title">

Table 1.3. Bank Account Document
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |                                 Valores (Padrão)                                 |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------------: | :------------------: | :------------------------------------------------------------------------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Documento de Conta Bancária   |          ID          |                                                                                  |                                |                                                  |         Checks, Transfers, etc.          |                                                    Bank documents, you generate or track                                                     |
|            Empresa             |    Tabela Direta     |                                (@AD\_Client\_ID@)                                |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Organização           |    Tabela Direta     |                                 (@AD\_Org\_ID@)                                  |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Conta Bancária         |    Tabela Direta     |                                                                                  |      cbankaccount\_cbadoc      |                                                  |           Account at the Bank            |                                             The Bank Account identifies an account at this Bank.                                             |
|              Nome              | Texto Curto (String) |                                                                                  |                                |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|           Descrição            | Texto Curto (String) |                                                                                  |                                |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|             Ativo              |       Sim-Não        |                                       (Y)                                        |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Regra de Pagamento       |        Lista         | Dinheiro Débito Direto Cartão de Crédito Mixed Em Crédito Cheque Depósito Direto |                                |          AD\_Ref\_List.Value \< \> 'M'           |         How you pay the invoice          |                                          The Payment Rule indicates the method of invoice payment.                                           |
|         Próximo Número         |       Inteiro        |                                                                                  |                                |                                                  |        The next number to be used        |                                     The Current Next indicates the next number to use for this document                                      |
| Formato de Impressão de Cheque |        Tabela        |                              AD\_PrintFormat Check                               | adprintformat\_cbankaccountdoc |                                                  |     Print Format for printing Checks     |                                           You need to define a Print Format to print the document.                                           |
|     C\_BankAccountDoc\_UU      | Texto Curto (String) |                                                                                  |                                |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d16416e748" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Processador de Conta Bancária - C\_BankAccount\_Processor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_BankAccount_Processor_data)

<span class="emphasis">*Descrição:*</span> Maintain Bank Account Payment
Processors

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d16416e761" class="table">

<div class="table-title">

Table 1.4. Bank Account Processor
Fields

</div>

<div class="table-contents">

|                   Nome do campo                    |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                    Descrição                    |                                                                          Comentário/Ajuda                                                                           |
| :------------------------------------------------: | :------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :---------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                    Aceita AMEX                     |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|               Aceita Depósito Direto               |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                Aceita Débito Direto                |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                   Aceita Diners                    |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                 Aceite Empresarial                 |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                   Aceita Cheque                    |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                     Aceita ATM                     |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                    Aceita Visa                     |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                     Aceita ATM                     |       Sim-Não        |        (N)         |                                 |                                                  |              Accept Bank ATM Card               |                                                              Indicates if Bank ATM Cards are accepted                                                               |
|                 Aceita MasterCard                  |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                 Aceitar Descobrir                  |       Sim-Não        |                    |                                 |                                                  |                                                 |                                                                                                                                                                     |
|                      Empresa                       |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)        |                                                                         (ver o mesmo acima)                                                                         |
|                    Organização                     |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)        |                                                                         (ver o mesmo acima)                                                                         |
|                   Conta Bancária                   |    Tabela Direta     |                    | cbankaccount\_cbankaccountproce |                                                  |               Account at the Bank               |                                                        The Bank Account identifies an account at this Bank.                                                         |
|              Processador de Pagamento              |    Tabela Direta     |                    | cpaymentprocessor\_cbankaccount |                                                  |    Payment processor for electronic payments    |                                          The Payment Processor indicates the processor to be used for electronic payments                                           |
|                       Ativo                        |       Sim-Não        |        (Y)         |                                 |                                                  |       (semelhante ao primeiro relatório)        |                                                                         (ver o mesmo acima)                                                                         |
|                   ID do Parceiro                   | Texto Curto (String) |                    |                                 |                                                  | Partner ID or Account for the Payment Processor |                                                            Partner ID (Verisign) or Account ID (Optimal)                                                            |
|                  ID do Fornecedor                  | Texto Curto (String) |                    |                                 |                                                  |       Vendor ID for the Payment Processor       |                                                                                                                                                                     |
|                   ID do Usuário                    | Texto Curto (String) |                    |                                 |                                                  |            User ID or account number            |                                              The User ID identifies a user and allows access to records or processes.                                               |
|                       Senha                        | Texto Curto (String) |                    |                                 |                                                  |     Password of any length (case sensitive)     | The Password for this User. Passwords are required to identify authorized users. For iDempiere Users, you can change the password via the Process "Reset Password". |
|                 Aceita Master Card                 |       Sim-Não        |        (N)         |                                 |                                                  |               Accept Master Card                |                                                               Indicates if Master Cards are accepted                                                                |
|                    Aceita Visa                     |       Sim-Não        |        (N)         |                                 |                                                  |                Accept Visa Cards                |                                                                Indicates if Visa Cards are accepted                                                                 |
|                    Aceita AMEX                     |       Sim-Não        |        (N)         |                                 |                                                  |          Accept American Express Card           |                                                          Indicates if American Express Cards are accepted                                                           |
|                   Aceita Diners                    |       Sim-Não        |        (N)         |                                 |                                                  |               Accept Diner's Club               |                                                            Indicates if Diner's Club Cards are accepted                                                             |
|                 Aceita Corporativo                 |       Sim-Não        |        (N)         |                                 |                                                  |         Accept Corporate Purchase Cards         |                                                         Indicates if Corporate Purchase Cards are accepted                                                          |
|                  Aceita Discover                   |       Sim-Não        |        (N)         |                                 |                                                  |              Accept Discover Card               |                                                              Indicates if Discover Cards are accepted                                                               |
|              Aceitar Depósito Direto               |       Sim-Não        |        (N)         |                                 |                                                  |     Accept Direct Deposit (payee initiated)     |                            Indicates if Direct Deposits (wire transfers, etc.) are accepted. Direct Deposits are initiated by the payee.                            |
|                Aceita Débito Direto                |       Sim-Não        |        (N)         |                                 |                                                  |     Accept Direct Debits (vendor initiated)     |             Accept Direct Debit transactions. Direct Debits are initiated by the vendor who has permission to deduct amounts from the payee's account.              |
|              Aceita Cheque Eletrônico              |       Sim-Não        |        (N)         |                                 |                                                  |        Accept ECheck (Electronic Checks)        |                                                                  Indicates if EChecks are accepted                                                                  |
|                    Valor Mínimo                    |        Valor         |                    |                                 |                                                  |       Minimum Amount in Document Currency       |                                                                                                                                                                     |
|                   Only Currency                    |    Tabela Direta     |                    | ccurrency\_cbankaccountprocesso |                                                  |          The Currency for this record           |                                            Indicates the Currency to be used when processing or reporting on this record                                            |
| Exige o Código de Verificação do Cartão de Crédito |       Sim-Não        |        (N)         |                                 |                                                  |   Require 3/4 digit Credit Verification Code    |                  The Require CC Verification checkbox indicates if this bank accounts requires a verification number for credit card transactions.                  |

</div>

</div>

  

<div id="d16416e1251" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Carregador de Extrato - C\_BankStatementLoader

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Definição de Carregador de
Extrato Bancário (SWIFT, OFX)

<span class="emphasis">*Comentário/Ajuda:* </span> A definição do
carregador fornece os parâmetros para carregar extratos bancários de
formatos de TEF (Transferência Eletrônica de Fundos - EFT) tais como
SWIFT (MT940) ou OFX. Os parâmetros necessários dependem da real classe
do carregador de extratos

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d16416e1266" class="table">

<div class="table-title">

Table 1.5. Statement Loader
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |                    Descrição                     |                                                                          Comentário/Ajuda                                                                           |
| :-----------------------------: | :------------------: | :----------------: | :------------------------: | :----------------------------------------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Carregador de Extrato Bancário  |          ID          |                    |                            |                                                  | Definition of Bank Statement Loader (SWIFT, OFX) |                          The loader definition provides the parameters to load bank statements from EFT formats like SWIFT (MT940) or OFX                           |
|             Empresa             |    Tabela Direta     | (@AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)        |                                                                         (ver o mesmo acima)                                                                         |
|           Organização           |    Tabela Direta     |  (@AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)        |                                                                         (ver o mesmo acima)                                                                         |
|         Conta Bancária          |    Tabela Direta     |                    | cbankacct\_cbankstmtloader |                                                  |               Account at the Bank                |                                                        The Bank Account identifies an account at this Bank.                                                         |
|              Nome               | Texto Curto (String) |                    |                            |                                                  |      Alphanumeric identifier of the entity       |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.             |
|            Descrição            | Texto Curto (String) |                    |                            |                                                  |     Optional short description of the record     |                                                             A description is limited to 255 characters.                                                             |
|              Ativo              |       Sim-Não        |        (Y)         |                            |                                                  |        (semelhante ao primeiro relatório)        |                                                                         (ver o mesmo acima)                                                                         |
|  ID da Instituição Financeira   | Texto Curto (String) |                    |                            |                                                  |    The ID of the Financial Institution / Bank    |                                             Depending on the loader, it might require a ID of the financial institution                                             |
|          ID de Filial           | Texto Curto (String) |                    |                            |                                                  |                  Bank Branch ID                  |                                                  Dependent on the loader, you may have to provide a bank branch ID                                                  |
|           Núm. Conta            | Texto Curto (String) |                    |                            |                                                  |                  Account Number                  |                                               The Account Number indicates the Number assigned to this bank account.                                                |
|               PIN               | Texto Curto (String) |                    |                            |                                                  |          Personal Identification Number          |                                                                                                                                                                     |
|          ID do Usuário          | Texto Curto (String) |                    |                            |                                                  |            User ID or account number             |                                              The User ID identifies a user and allows access to records or processes.                                               |
|              Senha              | Texto Curto (String) |                    |                            |                                                  |     Password of any length (case sensitive)      | The Password for this User. Passwords are required to identify authorized users. For iDempiere Users, you can change the password via the Process "Reset Password". |
|     Endereço do Hospedeiro      | Texto Curto (String) |                    |                            |                                                  |             Host Address URL or DNS              |                                                    The Host Address identifies the URL or DNS of the target host                                                    |
|       Porta do Hospedeiro       |       Inteiro        |       (443)        |                            |                                                  |             Host Communication Port              |                                                   The Host Port identifies the port to communicate with the host.                                                   |
|         Endereço Proxy          | Texto Curto (String) |                    |                            |                                                  |           Address of your proxy server           |                               The Proxy Address must be defined if you must pass through a firewall to access your payment processor.                               |
|         Porta do Proxy          |       Inteiro        |                    |                            |                                                  |            Port of your proxy server             |                                                      The Proxy Port identifies the port of your proxy server.                                                       |
|           Proxy logon           | Texto Curto (String) |                    |                            |                                                  |            Logon of your proxy server            |                                                   The Proxy Logon identifies the Logon ID for your proxy server.                                                    |
|         Senha do Proxy          | Texto Curto (String) |                    |                            |                                                  |          Password of your proxy server           |                                                  The Proxy Password identifies the password for your proxy server.                                                  |
|         Nome do Arquivo         | Texto Curto (String) |                    |                            |                                                  |          Name of the local file or URL           |                                        Name of a file in the local directory space - or URL (file://.., http://.., ftp://..)                                        |
| Classe do Carregador de Extrato | Texto Curto (String) |                    |                            |                                                  |     Class name of the bank statement loader      |                      The name of the actual bank statement loader implementing the interface org.compiere.impexp.BankStatementLoaderInterface                       |
|         Formato de Data         | Texto Curto (String) |                    |                            |                                                  |       Date format used in the input format       |                                               The date format is usually detected, but sometimes need to be defined.                                                |
|  Data do último processamento   |      Data+Hora       |                    |                            |                                                  |          Date the process was last run.          |                                                  The Date Last Run indicates the last time that a process was run.                                                  |
|   C\_BankStatementLoader\_UU    | Texto Curto (String) |                    |                            |                                                  |                                                  |                                                                                                                                                                     |

</div>

</div>

  

<div id="d16416e1634" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Contabilidade - C\_BankAccount\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_BankAccount_Acct_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Dados
Contábeis

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
é usada para definir as contas usadas para transações com este Banco.

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d16416e1651" class="table">

<div class="table-title">

Table 1.6. Accounting
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |  Valores (Padrão)  |         Chave restritiva         |                Regra de validação                |               Descrição               |                                                                       Comentário/Ajuda                                                                       |
| :-------------------------: | :------------------: | :----------------: | :------------------------------: | :----------------------------------------------: | :-----------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Empresa           |    Tabela Direta     | (@AD\_Client\_ID@) |                                  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                                     (ver o mesmo acima)                                                                      |
|         Organização         |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                                     (ver o mesmo acima)                                                                      |
|       Conta Bancária        |    Tabela Direta     |                    |   cbankaccount\_cbankacctacct    |                                                  |          Account at the Bank          |                                                     The Bank Account identifies an account at this Bank.                                                     |
|      Esquema Contábil       |    Tabela Direta     |                    |  cacctschema\_cbankaccountacct   |                                                  |         Rules for accounting          |                           An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                            |
|            Ativo            |       Sim-Não        |        (Y)         |                                  |                                                  |  (semelhante ao primeiro relatório)   |                                                                     (ver o mesmo acima)                                                                      |
|       Ativo Bancário        |        Conta         |                    |     vc\_basset\_cbankaccount     |                                                  |          Bank Asset Account           |                       The Bank Asset Account identifies the account to be used for booking changes to the balance in this bank account                       |
|         Em Trânsito         |        Conta         |                    |   vc\_bintransit\_cbankaccount   |                                                  |        Bank In Transit Account        |                                The Bank in Transit Account identifies the account to be used for funds which are in transit.                                 |
|    Seleção de Pagamento     |        Conta         |                    | vc\_bpaymentselect\_cbankaccount |                                                  | AP Payment Selection Clearing Account |                                                                                                                                                              |
|      Verba não alocada      |        Conta         |                    | vc\_bunallocatedcash\_cbankaccou |                                                  |   Unallocated Cash Clearing Account   |                                                              Receipts not allocated to Invoices                                                              |
| Bank Unidentified Receipts  |        Conta         |                    | vc\_bunidentified\_cbankaccount  |                                                  |  Bank Unidentified Receipts Account   |       The Bank Unidentified Receipts Account identifies the account to be used when recording receipts that can not be reconciled at the present time.       |
| Despesa de Juros Bancários  |        Conta         |                    |  vc\_binterestexp\_cbankaccount  |                                                  |     Bank Interest Expense Account     |                             The Bank Interest Expense Account identifies the account to be used for recording interest expenses.                             |
| Receitas de Juros Bancários |        Conta         |                    |  vc\_binterestrev\_cbankaccount  |                                                  |     Bank Interest Revenue Account     |                      The Bank Interest Revenue Account identifies the account to be used for recording interest revenue from this Bank.                      |
|        Bank Expense         |        Conta         |                    |    vc\_bexpense\_cbankaccount    |                                                  |         Bank Expense Account          |                      The Bank Expense Account identifies the account to be used for recording charges or fees incurred from this Bank.                       |
|    Bank Revaluation Gain    |        Conta         |                    | vc\_brevaluationgain\_cbankaccou |                                                  |     Bank Revaluation Gain Account     |           The Bank Revaluation Gain Account identifies the account to be used for recording gains that are recognized when converting currencies.            |
|    Bank Revaluation Loss    |        Conta         |                    | vc\_brevaluationloss\_cbankaccou |                                                  |     Bank Revaluation Loss Account     |           The Bank Revaluation Loss Account identifies the account to be used for recording losses that are recognized when converting currencies.           |
|    Bank Settlement Gain     |        Conta         |                    | vc\_bsettlementgain\_cbankaccoun |                                                  |     Bank Settlement Gain Account      | The Bank Settlement Gain account identifies the account to be used when recording a currency gain when the settlement and receipt currency are not the same. |
|    Bank Settlement Loss     |        Conta         |                    | vc\_bsettlementloss\_cbankaccoun |                                                  |     Bank Settlement Loss Account      | The Bank Settlement loss account identifies the account to be used when recording a currency loss when the settlement and receipt currency are not the same. |
|  C\_BankAccount\_Acct\_UU   | Texto Curto (String) |                    |                                  |                                                  |                                       |                                                                                                                                                              |

</div>

</div>

  

</div>
