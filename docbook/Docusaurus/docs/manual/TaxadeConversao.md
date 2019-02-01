---
title: "Taxa de Conversão"
id: TaxadeConversao
---
<div id="d239660e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Taxa de Conversão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Taxa de Conversão -
    C\_Conversion\_Rate](#d239660e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Taxas de
Conversão de Moedas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Taxa de
Conversão" é usada para definir as taxas de conversão que serão usadas
ao converter valores de documento de uma moeda a outra. Note que somente
a taxa de multiplicação é utilizada; A taxa de divisão é somente para
visualização.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/TaxadeConversao.png)

<div id="d239660e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Taxa de Conversão - C\_Conversion\_Rate

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Conversion_Rate_data)

<span class="emphasis">*Descrição:*</span> Definir Taxas de Conversão de
Moedas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Taxa de
Conversão" é usada para definir as taxas de conversão a serem usadas ao
converter montantes de documentos de uma moeda para outra Taxas de
conversão podem ser definidas para múltiplos tipos de taxas. Elas também
podem ser efetivas para uma determinada faixa de datas. Note que somente
a taxa de multiplicação é utilizada; A taxa de divisão é somente para
visualização.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d239660e40" class="table">

<div class="table-title">

Table 1.1. Conversion Rate
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

  

</div>
