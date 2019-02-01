---
title: "Moeda"
id: Moeda
---
<div id="d147946e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Moeda

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Moeda -
    C\_Currency](#d147946e23)</span>
  - <span class="section">[2. Tabela: Taxas de Conversão -
    C\_Conversion\_Rate](#d147946e299)</span>
  - <span class="section">[3. Tabela: Contabilidade -
    C\_Currency\_Acct](#d147946e521)</span>
  - <span class="section">[4. Tabela: Tradução -
    C\_Currency\_Trl](#d147946e697)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Moedas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Moeda"
define quaisquer moedas que serão usadas em documentos ou relatórios.
Você deveria definir moedas a serem utilizadas no nível de Sistema e
somente acrescentar moedas no nível de Empresa para os casos de moedas
estatísticas (por exemplo para moedas instáveis)

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Moeda.png)

<div id="d147946e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Moeda - C\_Currency

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Currency_data)

<span class="emphasis">*Descrição:*</span> Definir Moeda

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Moeda" define
qualquer moeda que você utilizará nas transações ou relatórios.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d147946e40" class="table">

<div class="table-title">

Table 1.1. Currency
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva  |                Regra de validação                |                       Descrição                        |                                                            Comentário/Ajuda                                                            |
| :------------------: | :------------------: | :------------------: | :---------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------: |
|     A Moeda Euro     |       Sim-Não        |         (N)          |                   |                                                  |               This currency is the Euro                |                         The Euro Currency checkbox is used to indicate if this currency is the Euro Currency.                          |
|   C\_Currency\_UU    | Texto Curto (String) |                      |                   |                                                  |                                                        |                                                                                                                                        |
|    Membro da UME     |       Sim-Não        |         (N)          |                   |                                                  | This currency is member if the European Monetary Union |                The Emu Member checkbox is used to indicate if this currency is a member of the European Economic Union.                |
|       Taxa UME       |        Número        |                      |                   |                                                  |               Official rate to the Euro                |                   The EMU Rate defines the official rate to be used when converting from this currency to the Euro.                    |
|       Moeda De       |          ID          |                      |                   |                                                  |              The Currency for this record              |                             Indicates the Currency to be used when processing or reporting on this record                              |
| Data de Entrada UME  |         Data         |                      |                   |                                                  |   Date when the currency joined / will join the EMU    |               The EMU Entry Date defines the date that this currency entered, or will enter the Economic Monetary Union.               |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) | c\_currencyclient |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                          (ver o mesmo acima)                                                           |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  c\_currencyorg   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                          (ver o mesmo acima)                                                           |
| Código de Moeda ISO  | Texto Curto (String) |                      |                   |                                                  |       Three letter ISO 4217 Code of the Currency       |                                        For details - http://www.unece.org/trade/rec/rec09en.htm                                        |
|       Símbolo        | Texto Curto (String) |                      |                   |                                                  |  Symbol of the currency (opt used for printing only)   |                           The Currency Symbol defines the symbol that will print when this currency is used.                           |
|      Descrição       | Texto Curto (String) |                      |                   |                                                  |        Optional short description of the record        |                                              A description is limited to 255 characters.                                               |
|        Ativo         |       Sim-Não        |         (Y)          |                   |                                                  |           (semelhante ao primeiro relatório)           |                                                          (ver o mesmo acima)                                                           |
|   Precisão Padrão    |       Inteiro        |         (2)          |                   |                                                  |          Rule for rounding calculated amounts          | The Standard Precision defines the number of decimal places that amounts will be rounded to for accounting transactions and documents. |
| Precisão do Custeio  |       Inteiro        |         (4)          |                   |                                                  |           Rounding used costing calculations           |    The Costing Precision defines the number of decimal places that amounts will be rounded to when performing costing calculations.    |
|  Código Importação   |       Inteiro        |                      |                   |                                                  |                                                        |                                                                                                                                        |
| Código de Exportação |       Inteiro        |                      |                   |                                                  |                                                        |                                                                                                                                        |

</div>

</div>

  

<div id="d147946e299" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Taxas de Conversão - C\_Conversion\_Rate

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Conversion_Rate_data)

<span class="emphasis">*Descrição:*</span> Definir taxas de conversão de
moedas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Taxas de
Conversão" define as taxas a serem usadas ao se converter uma moeda de
origem em uma moeda contábil ou moeda de relatório. Note que somente a
taxa de multiplicação é utilizada; A taxa de divisão é somente para
visualização.

<span class="emphasis">*Coluna linkada:* </span> Currency

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d147946e320" class="table">

<div class="table-title">

Table 1.2. Conversion Rates
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                            Descrição                             |                                                                                 Comentário/Ajuda                                                                                  |
| :---------------------: | :------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Taxa de Conversão    |          ID          |                      |                            |                                                  |               Rate used for converting currencies                |                           The Conversion Rate defines the rate (multiply or divide) to use when converting a source currency to an accounting currency.                           |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) | c\_conversion\_rateclient  |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |   c\_conversion\_rateorg   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|        Moeda De         |        Tabela        |    C\_Currencies     | ccurrency\_cconversionrate |                                                  |                   The Currency for this record                   |                                                   Indicates the Currency to be used when processing or reporting on this record                                                   |
|       Moeda para        |        Tabela        |    C\_Currencies     |   c\_currencyconvrateto    |                                                  |                         Target currency                          |                                                       The Currency To defines the target currency for this conversion rate.                                                       |
|          Ativo          |       Sim-Não        |         (Y)          |                            |                                                  |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|    Tipo de Conversão    |    Tabela Direta     |                      | cconversiontype\_cconvrate |                                                  |                  Currency Conversion Rate Type                   |                              The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.                               |
|      Válido desde       |         Data         |                      |                            |                                                  |            Valid from including this date (first day)            |                                                            The Valid From date indicates the first day of a date range                                                            |
|       Válido até        |         Data         |                      |                            |                                                  |             Valid to including this date (last day)              |                                                             The Valid To date indicates the last day of a date range                                                              |
|   Taxa Multiplicadora   |        Número        |                      |                            |                                                  |     Rate to multiple the source by to calculate the target.      | To convert Source number to Target number, the Source is multiplied by the multiply rate. If the Multiply Rate is entered, then the Divide Rate will be automatically calculated. |
|      Taxa Divisora      |        Número        |                      |                            |                                                  | To convert Source number to Target number, the Source is divided |       To convert Source number to Target number, the Source is divided by the divide rate. If you enter a Divide Rate, the Multiply Rate will be automatically calculated.        |
| C\_Conversion\_Rate\_UU | Texto Curto (String) |                      |                            |                                                  |                                                                  |                                                                                                                                                                                   |

</div>

</div>

  

<div id="d147946e521" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Contabilidade - C\_Currency\_Acct

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Moeda Contábil

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
define os parâmetros contábeis usados para transações envolvendo uma
moeda. Por favor note que se não for definido, as contas padrão do
Esquema Contábil serão usadas\!

<span class="emphasis">*Coluna linkada:* </span> Currency

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d147946e540" class="table">

<div class="table-title">

Table 1.3. Accounting
Fields

</div>

<div class="table-contents">

|    Nome do campo     |  Referência   |  Valores (Padrão)  |       Chave restritiva        |                Regra de validação                |                    Descrição                     |                                                                  Comentário/Ajuda                                                                   |
| :------------------: | :-----------: | :----------------: | :---------------------------: | :----------------------------------------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        | Tabela Direta | (@AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)        |                                                                 (ver o mesmo acima)                                                                 |
|     Organização      | Tabela Direta |        (0)         |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)        |                                                                 (ver o mesmo acima)                                                                 |
|       Moeda De       | Tabela Direta |                    |   ccurrency\_ccurrencyacct    |                                                  |           The Currency for this record           |                                    Indicates the Currency to be used when processing or reporting on this record                                    |
|   Esquema Contábil   | Tabela Direta |                    |  cacctschema\_ccurrencyacct   |                                                  |               Rules for accounting               |                       An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                       |
|        Ativo         |    Sim-Não    |        (Y)         |                               |                                                  |        (semelhante ao primeiro relatório)        |                                                                 (ver o mesmo acima)                                                                 |
|  Realized Gain Acct  |     Conta     |                    |  vc\_realizedgain\_ccurrency  |                                                  |              Realized Gain Account               |     The Realized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have been realized.     |
|  Realized Loss Acct  |     Conta     |                    |  vc\_realizedloss\_ccurrency  |                                                  |              Realized Loss Account               |  The Realized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized.  |
| Unrealized Gain Acct |     Conta     |                    | vc\_unrealizedgain\_ccurrency |                                                  | Unrealized Gain Account for currency revaluation | The Unrealized Gain Account indicates the account to be used when recording gains achieved from currency revaluation that have yet to be realized.  |
| Unrealized Loss Acct |     Conta     |                    | vc\_unrealizedloss\_ccurrency |                                                  | Unrealized Loss Account for currency revaluation | The Unrealized Loss Account indicates the account to be used when recording losses incurred from currency revaluation that have yet to be realized. |

</div>

</div>

  

<div id="d147946e697" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tradução - C\_Currency\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Currency_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Currency

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d147946e714" class="table">

<div class="table-title">

Table 1.4. Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                      Descrição                      |                                  Comentário/Ajuda                                  |
| :------------------: | :------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :-------------------------------------------------: | :--------------------------------------------------------------------------------: |
|       Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |         (semelhante ao primeiro relatório)          |                                (ver o mesmo acima)                                 |
|     Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |         (semelhante ao primeiro relatório)          |                                (ver o mesmo acima)                                 |
|       Moeda De       |    Tabela Direta     |                    | ccurrency\_ccurrencytrl  |                                                  |            The Currency for this record             |   Indicates the Currency to be used when processing or reporting on this record    |
|        Idioma        |        Tabela        |    AD\_Language    | adlanguage\_ccurrencytrl |                                                  |              Language for this entity               |       The Language identifies the language to use for display and formatting       |
|        Ativo         |       Sim-Não        |        (Y)         |                          |                                                  |         (semelhante ao primeiro relatório)          |                                (ver o mesmo acima)                                 |
|      Traduzida       |       Sim-Não        |                    |                          |                                                  |              This column is translated              |          The Translated checkbox indicates if this column is translated.           |
|      Descrição       | Texto Curto (String) |                    |                          |                                                  |      Optional short description of the record       |                    A description is limited to 255 characters.                     |
|       Símbolo        | Texto Curto (String) |                    |                          |                                                  | Symbol of the currency (opt used for printing only) | The Currency Symbol defines the symbol that will print when this currency is used. |
| C\_Currency\_Trl\_UU | Texto Curto (String) |                    |                          |                                                  |                                                     |                                                                                    |

</div>

</div>

  

</div>
