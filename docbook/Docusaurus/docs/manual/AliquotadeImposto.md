---
title: "Alíquota de Imposto"
id: AliquotadeImposto
---
<div id="d3954e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Alíquota de Imposto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Taxa - C\_Tax](#d3954e23)</span>
  - <span class="section">[2. Tabela: Contabilidade -
    C\_Tax\_Acct](#d3954e474)</span>
  - <span class="section">[3. Tabela: ZIP do Imposto -
    C\_TaxPostal](#d3954e690)</span>
  - <span class="section">[4. Tabela: Tradução -
    C\_Tax\_Trl](#d3954e852)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Impostos e
suas Alíquotas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela de "Alíquota
de Imposto" define as diferentes taxas usadas para cada categoria de
impostos. Por exemplo, Impostos sobre Vendas deve ser definido para cada
Estado em que se aplica.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2008-03-03 22:12:55.0

![](/img/manual/AliquotadeImposto.png)

<div id="d3954e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Taxa - C\_Tax

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Tax_data)

<span class="emphasis">*Descrição:*</span> Definição de Impostos

<span class="emphasis">*Comentário/Ajuda:* </span> A Janela de "Alíquota
de Imposto" define as diferentes taxas usadas para cada categoria de
impostos. Por exemplo, Impostos sobre Vendas devem ser definidos para
cada estado ao qual eles se aplicam. Se você tiver múltiplos impostos,
crie um nível de resumo de impostos com a taxa total aproximada dos
impostos e as taxas reais apontando ao nível de resumo de impostos como
seu nível superior. Ao inserir as linhas de pedido ou fatura, o imposto
é estimado, o imposto correto é calculado quando o documento for
processado. O imposto é sempre calculado a partir da linha de montante
líquido. Se um imposto tem o montante líquido mais um outro imposto
como base, você precisa ajustar o percentual para resultar no valor
correto. A Validação De/Para é determinada pelo imposto superior (pai).

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d3954e40" class="table">

<div class="table-title">

Table 1.1. Tax
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |                Valores (Padrão)                |    Chave restritiva     |                Regra de validação                |                                 Descrição                                  |                                                                                                                             Comentário/Ajuda                                                                                                                              |
| :----------------------------: | :------------------: | :--------------------------------------------: | :---------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Taxa              |          ID          |                                                |                         |                                                  |                               Tax identifier                               |                                                                                                         The Tax indicates the type of tax used in document line.                                                                                                          |
|            Empresa             |    Tabela Direta     |              (@\#AD\_Client\_ID@)              |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                                                            (ver o mesmo acima)                                                                                                                            |
|          Organização           |    Tabela Direta     |               (@\#AD\_Org\_ID@)                |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                                                            (ver o mesmo acima)                                                                                                                            |
|              Nome              | Texto Curto (String) |                                                |                         |                                                  |                   Alphanumeric identifier of the entity                    |                                                               The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                |
|           Descrição            | Texto Curto (String) |                                                |                         |                                                  |                  Optional short description of the record                  |                                                                                                                A description is limited to 255 characters.                                                                                                                |
|             Ativo              |       Sim-Não        |                      (Y)                       |                         |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                                                            (ver o mesmo acima)                                                                                                                            |
|             Padrão             |       Sim-Não        |                                                |                         |                                                  |                               Default value                                |                                                                                              The Default Checkbox indicates if this record will be used as a default value.                                                                                               |
|      Categoria de Imposto      |    Tabela Direta     |                                                |   ctaxcategory\_ctax    |                                                  |                                Tax Category                                |                                                                                 The Tax Category provides a method of grouping similar taxes. For example, Sales Tax or Value Added Tax.                                                                                  |
|          Válido desde          |         Data         |                                                |                         |                                                  |                 Valid from including this date (first day)                 |                                                                                                        The Valid From date indicates the first day of a date range                                                                                                        |
|   Isento de Imposto (Vendas)   |       Sim-Não        |                                                |                         |                                                  |                Business partner is exempt from tax on sales                | If a business partner is exempt from tax on sales, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate. This is required for tax reporting, so that you can track tax exempt transactions. |
| Requer Certificado de Imposto  |       Sim-Não        |                                                |                         |                                                  |        This tax rate requires the Business Partner to be tax exempt        |                                                                            The Requires Tax Certificate indicates that a tax certificate is required for a Business Partner to be tax exempt.                                                                             |
|       Nível do Documento       |       Sim-Não        |                                                |                         |                                                  |       Tax is calculated on document level (rather than line by line)       |                If the tax is calculated on document level, all lines with that tax rate are added before calculating the total tax for the document. Otherwise the tax is calculated per line and then added. Due to rounding, the tax amount can differ.                 |
|       Imposto de Vendas        |       Sim-Não        |                      (N)                       |                         |                                                  |              This is a sales tax (i.e. not a value added tax)              |                                                                                            If selected AP tax is handled as expense, otherwise it is handled as a VAT credit.                                                                                             |
|        Nível de Resumo         |       Sim-Não        |                                                |                         |                                                  |                          This is a summary entity                          |                                                                A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                |
|          Imposto Pai           |        Tabela        |              C\_Tax(@C\_Tax\_ID@)              |      ctax\_parent       |                                                  |        Parent Tax indicates a tax that is made up of multiple taxes        |                                                         The Parent Tax indicates a tax that is a reference for multiple taxes. This allows you to charge multiple taxes on a document by entering the Parent Tax                                                          |
|         Tipo de PV/PC          |        Lista         | Ambos Imposto de Compras Imposto de Vendas (B) |                         |                                                  | Sales Tax applies to sales situations, Purchase Tax to purchase situations |                                                     Sales Tax: charged when selling - examples: Sales Tax, Output VAT (payable) Purchase Tax: tax charged when purchasing - examples: Use Tax, Input VAT (receivable)                                                     |
|        Nome do Imposto         | Texto Curto (String) |                                                |                         |                                                  |               Short form for Tax to be printed on documents                |                                                                                      The Tax Indicator identifies the short name that will print on documents referencing this tax.                                                                                       |
|              Taxa              |        Número        |                                                |                         |                                                  |                          Rate or Tax or Exchange                           |                                                                                 The Rate indicates the percentage to be multiplied by the source to arrive at the tax or exchange amount.                                                                                 |
|         Country Group          |        Tabela        |                 Country Group                  | CCountryGroupFrom\_CTax |                                                  |                                                                            |                                                                                                                                                                                                                                                                           |
|              Rule              |    Tabela Direta     |                                                |      adrule\_ctax       |                                                  |                                                                            |                                                                                                                                                                                                                                                                           |
|               To               |        Tabela        |                 Country Group                  |  CCountryGroupTo\_CTax  |                                                  |                                                                            |                                                                                                                                                                                                                                                                           |
|              País              |        Tabela        |                   C\_Country                   |   c\_country\_c\_tax    |                                                  |                                  Country                                   |                                                                                    The Country defines a Country. Each Country must be defined before it can be used in any document.                                                                                     |
|              Para              |        Tabela        |                   C\_Country                   |  c\_countryto\_c\_tax   |                                                  |                             Receiving Country                              |                                                                                                       The To Country indicates the receiving country on a document                                                                                                        |
|             Região             |        Tabela        |                   C\_Region                    |    c\_region\_c\_tax    |    C\_Region.C\_Country\_ID=@C\_Country\_ID@     |                      Identifies a geographical Region                      |                                                                                                          The Region identifies a unique Region for this Country.                                                                                                          |
|              Para              |        Tabela        |                   C\_Region                    |   c\_regionto\_c\_tax   |    C\_Region.C\_Country\_ID=@To\_Country\_ID@    |                              Receiving Region                              |                                                                                                        The To Region indicates the receiving region on a document                                                                                                         |
|      Provedor de Impostos      |    Tabela Direta     |                                                |   ctaxprovider\_ctax    |                                                  |                                                                            |                                                                                                                                                                                                                                                                           |
|            Imposto             |       Procurar       |                  LBR\_TaxName                  |                         |                                                  |                       Primary key table LBR\_TaxName                       |                                                                                                                      Primary key table LBR\_TaxName                                                                                                                       |
| Lançar Imposto (Contabilidade) |       Sim-Não        |                     ('Y')                      |                         |                                                  |                 Defines if the tax is posted at fact acct                  |                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d3954e474" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Contabilidade - C\_Tax\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Tax_Acct_data)

<span class="emphasis">*Descrição:*</span> Contabilidade

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
define os parâmetros contábeis a serem usados para transações
referenciando esta Alíquota de Imposto.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d3954e491" class="table">

<div class="table-title">

Table 1.2. Accounting
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |  Valores (Padrão)  |    Chave restritiva     |                Regra de validação                |                  Descrição                   |                                                   Comentário/Ajuda                                                   |
| :----------------: | :------------------: | :----------------: | :---------------------: | :----------------------------------------------: | :------------------------------------------: | :------------------------------------------------------------------------------------------------------------------: |
|  C\_Tax\_Acct\_UU  | Texto Curto (String) |                    |                         |                                                  |                                              |                                                                                                                      |
|      Empresa       |    Tabela Direta     | (@AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                                                 (ver o mesmo acima)                                                  |
|    Organização     |    Tabela Direta     |  (@AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                                                 (ver o mesmo acima)                                                  |
|        Taxa        |    Tabela Direta     |                    |     ctax\_ctaxacct      |                                                  |                Tax identifier                |                               The Tax indicates the type of tax used in document line.                               |
|  Esquema Contábil  |    Tabela Direta     |                    |  cacctschema\_ctaxacct  |                                                  |             Rules for accounting             |       An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar        |
|       Ativo        |       Sim-Não        |        (Y)         |                         |                                                  |      (semelhante ao primeiro relatório)      |                                                 (ver o mesmo acima)                                                  |
|   Imposto Devido   |        Conta         |                    |     vc\_tdue\_ctax      |                                                  |       Account for Tax you have to pay        |              The Tax Due Account indicates the account used to record taxes that you are liable to pay.              |
|   Tax Liability    |        Conta         |                    |  vc\_tliability\_ctax   |                                                  |    Account for Tax declaration liability     |            The Tax Liability Account indicates the account used to record your tax liability declaration.            |
|   Crédito Fiscal   |        Conta         |                    |    vc\_tcredit\_ctax    |                                                  |       Account for Tax you can reclaim        |               The Tax Credit Account indicates the account used to record taxes that can be reclaimed                |
| Despesa de Imposto |        Conta         |                    |   vc\_texpense\_ctax    |                                                  |   Account for paid tax you cannot reclaim    | The Tax Expense Account indicates the account used to record the taxes that have been paid that cannot be reclaimed. |
|  Tax Receivables   |        Conta         |                    |     vc\_trec\_ctax      |                                                  | Account for Tax credit after tax declaration |  The Tax Receivables Account indicates the account used to record the tax credit amount after your tax declaration.  |
| Imposto Desonerado |        Conta         |                    | COFTDesonAcct\_CTaxAcct |                                                  |                                              |                                                                                                                      |

</div>

</div>

  

<div id="d3954e690" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: ZIP do Imposto - C\_TaxPostal

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> CEP do Imposto

<span class="emphasis">*Comentário/Ajuda:* </span> Para taxas ou
impostos locais, você pode ter que definir uma lista de (faixas de )
códigos postais ou CEPs

<span class="emphasis">*Lógica de visualização:*</span>
@\#COF\_HIDE\_UNUSED\_FIELDS@='N'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d3954e709" class="table">

<div class="table-title">

Table 1.3. Tax ZIP
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |  Valores (Padrão)  | Chave restritiva |                Regra de validação                |             Descrição              |                                 Comentário/Ajuda                                 |
| :--------------: | :------------------: | :----------------: | :--------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------: |
|  ZIP do Imposto  |          ID          |                    |                  |                                                  |           Tax Postal/ZIP           | For local tax, you may have to define a list of (ranges of) postal codes or ZIPs |
|     Empresa      |    Tabela Direta     | (@AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                               (ver o mesmo acima)                                |
|   Organização    |    Tabela Direta     |  (@AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                               (ver o mesmo acima)                                |
|       Taxa       |    Tabela Direta     |                    | ctax\_ctaxpostal |                                                  |           Tax identifier           |             The Tax indicates the type of tax used in document line.             |
|      Ativo       |       Sim-Não        |        (Y)         |                  |                                                  | (semelhante ao primeiro relatório) |                               (ver o mesmo acima)                                |
|       CEP        | Texto Curto (String) |                    |                  |                                                  |            Postal code             |   The Postal Code or ZIP identifies the postal code for this entity's address.   |
|    CEP (Para)    | Texto Curto (String) |                    |                  |                                                  |           Postal code to           |                               Consecutive range to                               |
| C\_TaxPostal\_UU | Texto Curto (String) |                    |                  |                                                  |                                    |                                                                                  |

</div>

</div>

  

<div id="d3954e852" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tradução - C\_Tax\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Tax_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Tax

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d3954e869" class="table">

<div class="table-title">

Table 1.4. Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo  |      Referência      |  Valores (Padrão)  |  Chave restritiva   |                Regra de validação                |                   Descrição                   |                                                               Comentário/Ajuda                                                               |
| :-------------: | :------------------: | :----------------: | :-----------------: | :----------------------------------------------: | :-------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     |    Tabela Direta     | (@AD\_Client\_ID@) |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|   Organização   |    Tabela Direta     |  (@AD\_Org\_ID@)   |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|      Taxa       |    Tabela Direta     |                    |    ctax\_ctaxtrl    |                                                  |                Tax identifier                 |                                           The Tax indicates the type of tax used in document line.                                           |
|     Idioma      |        Tabela        |    AD\_Language    | adlanguage\_ctaxtrl |                                                  |           Language for this entity            |                                    The Language identifies the language to use for display and formatting                                    |
|      Ativo      |       Sim-Não        |        (Y)         |                     |                                                  |      (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|    Traduzida    |       Sim-Não        |                    |                     |                                                  |           This column is translated           |                                       The Translated checkbox indicates if this column is translated.                                        |
|      Nome       | Texto Curto (String) |                    |                     |                                                  |     Alphanumeric identifier of the entity     | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição    | Texto Curto (String) |                    |                     |                                                  |   Optional short description of the record    |                                                 A description is limited to 255 characters.                                                  |
| Nome do Imposto | Texto Curto (String) |                    |                     |                                                  | Short form for Tax to be printed on documents |                        The Tax Indicator identifies the short name that will print on documents referencing this tax.                        |
| C\_Tax\_Trl\_UU | Texto Curto (String) |                    |                     |                                                  |                                               |                                                                                                                                              |

</div>

</div>

  

</div>
