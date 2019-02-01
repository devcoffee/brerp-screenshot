---
title: "Categoria de Imposto"
id: CategoriadeImposto
---
<div id="d19394e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Categoria de Imposto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Categoria de Imposto -
    C\_TaxCategory](#d19394e23)</span>
  - <span class="section">[2. Tabela: Tradução -
    C\_TaxCategory\_Trl](#d19394e197)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Categorias
de Impostos

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Categoria de
Imposto" é usada para digitar e manter as Categorias de Impostos. Cada
Produto é associado a uma Categoria de Imposto o que facilita reagir a
variações de Alíquotas de Impostos.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/CategoriadeImposto.png)

<div id="d19394e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Categoria de Imposto - C\_TaxCategory

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_TaxCategory_data)

<span class="emphasis">*Descrição:*</span> Categoria de Imposto

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Categoria de
Imposto" é usada para definir e manter as Categorias de Impostos. Cada
Produto é associado com uma Categoria de Impostos. Isto facilita
adaptações a mudanças na taxação.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d19394e40" class="table">

<div class="table-title">

Table 1.1. Tax Category
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Categoria de Imposto |          ID          |                      |                  |                                                  |               Tax Category               |                   The Tax Category provides a method of grouping similar taxes. For example, Sales Tax or Value Added Tax.                   |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Ativo         |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Padrão        |       Sim-Não        |                      |                  |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|    Commodity Code    | Texto Curto (String) |                      |                  |                                                  | Commodity code used for tax calculation  |                                     The Commodity Code indicates a code that is used in tax calculations                                     |
|  C\_TaxCategory\_UU  | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d19394e197" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução - C\_TaxCategory\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_TaxCategory_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d19394e210" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Categoria de Imposto   |    Tabela Direta     |                    |      ctaxcategory\_trl      |                                                  |               Tax Category               |                   The Tax Category provides a method of grouping similar taxes. For example, Sales Tax or Value Added Tax.                   |
|         Idioma          |        Tabela        |    AD\_Language    | adlanguage\_ctaxcategorytrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo          |       Sim-Não        |        (Y)         |                             |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Traduzida        |       Sim-Não        |                    |                             |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|          Nome           | Texto Curto (String) |                    |                             |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        | Texto Curto (String) |                    |                             |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| C\_TaxCategory\_Trl\_UU | Texto Curto (String) |                    |                             |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
