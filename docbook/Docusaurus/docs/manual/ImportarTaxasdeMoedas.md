---
title: "Importar Taxas de Moedas"
id: ImportarTaxasdeMoedas
---
<div id="d119023e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Taxas de Moedas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Importar Taxas de Moedas -
    I\_Conversion\_Rate](#d119023e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importar Taxas de Conversão
de Moedas

<span class="emphasis">*Comentário/Ajuda:* </span>As taxas são
importadas após a validação de moedas, tipo de taxa de conversão e
taxas. A Taxa multiplicativa é usada. Se uma taxa recíproca for criada,
a Taxa divisora será usada.

<span class="emphasis"> *Criado em:* </span>2003-12-29 19:53:18.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ImportarTaxasdeMoedas.png)

<div id="d119023e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Importar Taxas de Moedas - I\_Conversion\_Rate

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/I_Conversion_Rate_data)

<span class="emphasis">*Descrição:*</span> Importar Taxas de Conversão
de Moedas

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d119023e36" class="table">

<div class="table-title">

Table 1.1. Import Currency Rate
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                            Descrição                             |                                                                                 Comentário/Ajuda                                                                                  |
| :----------------------------: | :------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Importar Taxa de Conversão   |          ID          |                      |                            |                                                  |                 Import Currency Conversion Rate                  |                                                                                                                                                                                   |
|           Importado            |       Sim-Não        |                      |                            |                                                  |                  Has this import been processed                  |                                                        The Imported check box indicates if this import has been processed.                                                        |
|       Taxa de Conversão        |    Tabela Direta     |                      | cconversionrate\_iconvrate |                                                  |               Rate used for converting currencies                |                           The Conversion Rate defines the rate (multiply or divide) to use when converting a source currency to an accounting currency.                           |
| Mensagem de Erro de Importação | Texto Curto (String) |                      |                            |                                                  |              Messages generated from import process              |                                             The Import Error Message displays any error messages generated during the import process.                                             |
|            Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|          Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|             Ativo              |       Sim-Não        |         (Y)          |                            |                                                  |                (semelhante ao primeiro relatório)                |                                                                                (ver o mesmo acima)                                                                                |
|      Código de Moeda ISO       | Texto Curto (String) |                      |                            |                                                  |            Three letter ISO 4217 Code of the Currency            |                                                             For details - http://www.unece.org/trade/rec/rec09en.htm                                                              |
|            Moeda De            |    Tabela Direta     |                      |    ccurrency\_iconvrate    |                                                  |                   The Currency for this record                   |                                                   Indicates the Currency to be used when processing or reporting on this record                                                   |
| Código de Moeda ISO de Destino | Texto Curto (String) |                      |                            |                                                  |          Three letter ISO 4217 Code of the To Currency           |                                                             For details - http://www.unece.org/trade/rec/rec09en.htm                                                              |
|           Moeda para           |        Tabela        |    C\_Currencies     |   ccurrency\_iconvrateto   |                                                  |                         Target currency                          |                                                       The Currency To defines the target currency for this conversion rate.                                                       |
|     Chave de Tipo de Moeda     | Texto Curto (String) |                      |                            |                                                  |         Key value for the Currency Conversion Rate Type          |                                                       The date type key for the conversion of foreign currency transactions                                                       |
|       Tipo de Conversão        |    Tabela Direta     |                      |    cconvtype\_iconvrate    |                                                  |                  Currency Conversion Rate Type                   |                              The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.                               |
|      Taxa Multiplicadora       |        Número        |                      |                            |                                                  |     Rate to multiple the source by to calculate the target.      | To convert Source number to Target number, the Source is multiplied by the multiply rate. If the Multiply Rate is entered, then the Divide Rate will be automatically calculated. |
|         Taxa Divisora          |        Número        |                      |                            |                                                  | To convert Source number to Target number, the Source is divided |       To convert Source number to Target number, the Source is divided by the divide rate. If you enter a Divide Rate, the Multiply Rate will be automatically calculated.        |
|          Válido desde          |         Data         |                      |                            |                                                  |            Valid from including this date (first day)            |                                                            The Valid From date indicates the first day of a date range                                                            |
|           Válido até           |         Data         |                      |                            |                                                  |             Valid to including this date (last day)              |                                                             The Valid To date indicates the last day of a date range                                                              |
|      Criar Taxa Recíproca      |       Sim-Não        |         (N)          |                            |                                                  |         Create Reciprocal Rate from current information          |                                       If selected, the imported USD-\> EUR rate is used to create/calculate the reciprocal rate EUR-\> USD.                                       |
|   Importar Taxa de Conversão   |        Botão         |                      |                            |                                                  |                                                                  |                                                                                                                                                                                   |
|           Processado           |       Sim-Não        |                      |                            |                                                  |                 The document has been processed                  |                                                       The Processed checkbox indicates that a document has been processed.                                                        |
|    I\_Conversion\_Rate\_UU     | Texto Curto (String) |                      |                            |                                                  |                                                                  |                                                                                                                                                                                   |

</div>

</div>

  

</div>
