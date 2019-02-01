---
title: "Tipo de Moeda"
id: TipodeMoeda
---
<div id="d242746e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Moeda

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Conversão -
    C\_ConversionType](#d242746e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Tipos de
Taxas de Conversão de Moedas

<span class="emphasis">*Comentário/Ajuda:* </span>O Tipo de Taxas de
Conversão de Moedas define diferentes tipos de taxas, ex. taxas Spot
(mercado à vista), taxas Corporativas e/ou taxas de Compra/Venda.

<span class="emphasis"> *Criado em:* </span>2003-12-21 00:29:33.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/TipodeMoeda.png)

<div id="d242746e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Conversão - C\_ConversionType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ConversionType_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Tipos de
Taxas de Conversão de Moedas

<span class="emphasis">*Comentário/Ajuda:* </span> O Tipo de Taxas de
Conversão de Moedas define diferentes tipos de taxas, ex. taxas Spot
(mercado à vista), taxas Corporativas e/ou taxas de Compra/Venda.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d242746e40" class="table">

<div class="table-title">

Table 1.1. Conversion Type
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tipo de Conversão   |          ID          |                      |                  |                                                  |      Currency Conversion Rate Type       |            The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.            |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca     | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome          | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Ativo         |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Padrão         |       Sim-Não        |                      |                  |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| C\_ConversionType\_UU | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
