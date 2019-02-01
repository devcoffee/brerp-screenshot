---
title: "Finalidade"
id: Finalidade
---
<div id="d104691e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Finalidade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Finalidade -
    C\_Charge](#d104691e23)</span>
  - <span class="section">[2. Tabela: Contabilidade -
    C\_Charge\_Acct](#d104691e283)</span>
  - <span class="section">[3. Tabela: Tradução -
    C\_Charge\_Trl](#d104691e443)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Finalidades

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Finalidade"
define as diferentes despesas a que se pode ficar sujeito. Estas podem
incluir Taxas de Banco, Taxas de Fornecedores e Custos de Manuseio.

<span class="emphasis"> *Criado em:* </span>1999-12-04 21:41:28.0

<span class="emphasis">*Atualizado em:* </span>2016-03-30 22:48:47.169

![](/img/manual/Finalidade.png)

<div id="d104691e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Finalidade - C\_Charge

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Charge_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Finalidades

<span class="emphasis">*Comentário/Ajuda:* </span> A Janela "Finalidade"
define as diferentes despesas a que se pode ficar sujeito. Estas podem
incluir Taxas de Banco, Taxas de Fornecedores e Custos de Manuseio.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d104691e40" class="table">

<div class="table-title">

Table 1.1. Charge
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |   Valores (Padrão)   |   Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------------: | :------------------: | :------------------: | :-------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Finalidade          |          ID          |                      |                       |                                                  |       Additional document charges        |                                    The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                    |
|         Mesma Moeda         |       Sim-Não        |                      |                       |                                                  |                                          |                                                                                                                                              |
|           Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Nome             | Texto Curto (String) |                      |                       |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição          | Texto Curto (String) |                      |                       |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|            Ativo            |       Sim-Não        |         (Y)          |                       |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Valor da Despesa       |        Valor         |                      |                       |                                                  |              Charge Amount               |                                       The Charge Amount indicates the amount for an additional charge.                                       |
|    Categoria de Imposto     |    Tabela Direta     |                      | ctaxcategory\_ccharge |                                                  |               Tax Category               |                   The Tax Category provides a method of grouping similar taxes. For example, Sales Tax or Value Added Tax.                   |
|    Preço Inclui Imposto     |       Sim-Não        |         (N)          |                       |                                                  |       Tax is included in the price       |                    The Tax Included checkbox indicates if the prices include tax. This is also known as the gross price.                     |
|        Mesmo Imposto        |       Sim-Não        |                      |                       |                                                  | Use the same tax as the main transaction |                      The Same Tax checkbox indicates that this charge should use the same tax as the main transaction.                       |
|    Parceiro de Negócios     |       Procurar       |                      |  cbpartner\_ccharge   |                                                  |      Identifies a Business Partner       |               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                |
|        Tipo de Carga        |    Tabela Direta     |                      | cchargetype\_ccharge  |                                                  |                                          |                                                                                                                                              |
| Categoria do Produto (CFOP) |        Tabela        | LBR\_ProductCategory |                       |                                                  |  Primary key table LBR\_ProductCategory  |                                                    Primary key table LBR\_ProductCategory                                                    |
|        C\_Charge\_UU        | Texto Curto (String) |                      |                       |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d104691e283" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Contabilidade - C\_Charge\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Charge_Acct_data)

<span class="emphasis">*Descrição:*</span> Contabilidade de Despesa

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
define os parâmetros contábeis usados para transações envolvendo um
débito ou despesas.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d104691e300" class="table">

<div class="table-title">

Table 1.2. Accounting
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |             Descrição              |                                            Comentário/Ajuda                                             |
| :-------------------------: | :------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :--------------------------------: | :-----------------------------------------------------------------------------------------------------: |
|           Empresa           |    Tabela Direta     | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                           (ver o mesmo acima)                                           |
|         Organização         |    Tabela Direta     |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                           (ver o mesmo acima)                                           |
|         Finalidade          |    Tabela Direta     |                    |   cchrage\_cchargeacct   |                                                  |    Additional document charges     |                 The Charge indicates a type of Charge (Handling, Shipping, Restocking)                  |
|      Esquema Contábil       |    Tabela Direta     |                    | cacctschema\_cchargeacct |                                                  |        Rules for accounting        | An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar |
|            Ativo            |       Sim-Não        |        (Y)         |                          |                                                  | (semelhante ao primeiro relatório) |                                           (ver o mesmo acima)                                           |
|     Gastos com Despesas     |        Conta         |                    |  vc\_chexpense\_ccharge  |                                                  |           Charge Account           |                 The Charge Account identifies the account to use when recording charges                 |
| Charge Revenue (Deprecated) |        Conta         |                    |  chrevenue\_cchargeacct  |                                                  |       Charge Revenue Account       |   The Charge Revenue Account identifies the account to use when recording charges paid by customers.    |
|     C\_Charge\_Acct\_UU     | Texto Curto (String) |                    |                          |                                                  |                                    |                                                                                                         |

</div>

</div>

  

<div id="d104691e443" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - C\_Charge\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Charge_Trl_data)

<span class="emphasis">*Descrição:*</span> Tradução

<span class="emphasis">*Comentário/Ajuda:* </span> A aba de Tradução
define um Tipo de Documento em um idioma alternativo

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d104691e464" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |  Valores (Padrão)  |  Chave restritiva   |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------: | :------------------: | :----------------: | :-----------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa       |    Tabela Direta     | (@AD\_Client\_ID@) |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização     |    Tabela Direta     |  (@AD\_Org\_ID@)   |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Finalidade     |    Tabela Direta     |                    | ccharge\_cchargetrl |                                                  |       Additional document charges        |                                    The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                    |
|       Idioma       |        Tabela        |    AD\_Language    | adlangu\_cchargetrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo        |       Sim-Não        |        (Y)         |                     |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Descrição      | Texto Curto (String) |                    |                     |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Nome        | Texto Curto (String) |                    |                     |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Traduzida      |       Sim-Não        |                    |                     |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
| C\_Charge\_Trl\_UU | Texto Curto (String) |                    |                     |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
