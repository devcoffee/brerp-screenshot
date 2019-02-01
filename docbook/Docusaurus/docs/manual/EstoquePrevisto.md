---
title: "Estoque Previsto"
id: EstoquePrevisto
---
<div id="d89479e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Estoque Previsto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Estoque Previsto -
    COF\_EstoquePrevisto](#d89479e23)</span>
  - <span class="section">[2. Tabela: Transações -
    COF\_TrxEstoquePrevisto](#d89479e189)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-05-09 10:32:28.0

<span class="emphasis">*Atualizado em:* </span>2018-05-09 10:32:28.0

![](/img/manual/EstoquePrevisto.png)

<div id="d89479e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Estoque Previsto - COF\_EstoquePrevisto

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d89479e30" class="table">

<div class="table-title">

Table 1.1. Estoque Previsto
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |   Valores (Padrão)   |       Chave restritiva       |                                                                          Regra de validação                                                                          |             Descrição              |                                  Comentário/Ajuda                                  |
| :----------------------: | :------------------: | :------------------: | :--------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------------------: |
| COF\_EstoquePrevisto\_ID |          ID          |                      |                              |                                                                                                                                                                      |   Primary Key : Estoque Previsto   |                           Primary Key : Estoque Previsto                           |
| COF\_EstoquePrevisto\_UU | Texto Curto (String) |                      |                              |                                                                                                                                                                      |                                    |                                                                                    |
|         Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                              |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   | (semelhante ao primeiro relatório) |                                (ver o mesmo acima)                                 |
|       Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                              |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           | (semelhante ao primeiro relatório) |                                (ver o mesmo acima)                                 |
|         Produto          |       Procurar       |                      | MProduct\_COFEstoquePrevisto | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |       Product, Service, Item       |     Identifies an item which is either purchased or sold in this organization.     |
|        Quantidade        |      Quantidade      |                      |                              |                                                                                                                                                                      |              Quantity              | The Quantity indicates the number of a specific product or item for this document. |
|   Preço de Custo Atual   |    Custos+Preços     |         (0)          |                              |                                                                                                                                                                      |   The currently used cost price    |                                                                                    |
|     Valor Acumulado      |        Valor         |         (0)          |                              |                                                                                                                                                                      |            Total Amount            |                                 Sum of all amounts                                 |
|          Ativo           |       Sim-Não        |         (Y)          |                              |                                                                                                                                                                      | (semelhante ao primeiro relatório) |                                (ver o mesmo acima)                                 |

</div>

</div>

  

<div id="d89479e189" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Transações - COF\_TrxEstoquePrevisto

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Product

<span class="emphasis">*Coluna mãe:* </span> Product

<span class="emphasis">*Claúsula Where:*</span>
COF\_TrxEstoquePrevisto.AD\_Org\_ID=@AD\_Org\_ID@

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d89479e208" class="table">

<div class="table-title">

Table 1.2. Transações
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |                                                           Valores (Padrão)                                                            |        Chave restritiva         |                                                                          Regra de validação                                                                          |                          Descrição                          |                                                                  Comentário/Ajuda                                                                  |
| :---------------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|     COF\_TrxEstoquePrevisto\_ID     |          ID          |                                                                                                                                       |                                 |                                                                                                                                                                      |         Primary Key : Transação de Estoque Previsto         |                                                    Primary Key : Transação de Estoque Previsto                                                     |
|     COF\_TrxEstoquePrevisto\_UU     | Texto Curto (String) |                                                                                                                                       |                                 |                                                                                                                                                                      |                                                             |                                                                                                                                                    |
|               Empresa               |    Tabela Direta     |                                                         (@\#AD\_Client\_ID@)                                                          |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |             (semelhante ao primeiro relatório)              |                                                                (ver o mesmo acima)                                                                 |
|             Organização             |    Tabela Direta     |                                                            (@AD\_Org\_ID@)                                                            |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |             (semelhante ao primeiro relatório)              |                                                                (ver o mesmo acima)                                                                 |
|     Identificador de Transação      |        Lista         | Ajuste de Estoque (-) Ajuste de Estoque (+) Fatura (-) Fatura (+) Produção (-) Produção (+) Documento Fiscal (-) Documento Fiscal (+) |                                 |                                                                                                                                                                      |                                                             |                                                                                                                                                    |
|                Ativo                |       Sim-Não        |                                                                  (Y)                                                                  |                                 |                                                                                                                                                                      |             (semelhante ao primeiro relatório)              |                                                                (ver o mesmo acima)                                                                 |
|               Produto               |       Procurar       |                                                                                                                                       | MProduct\_COFTrxEstoquePrevisto | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                   Product, Service, Item                    |                                     Identifies an item which is either purchased or sold in this organization.                                     |
|        Data da Movimentação         |         Data         |                                                                                                                                       |                                 |                                                                                                                                                                      |       Date a product was moved in or out of inventory       | The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement. |
|       Antiga Quantidade Atual       |      Quantidade      |                                                                  (0)                                                                  |                                 |                                                                                                                                                                      | Old current quantity before the processing of M\_CostDetail |                                                                                                                                                    |
|             Quantidade              |      Quantidade      |                                                                                                                                       |                                 |                                                                                                                                                                      |                          Quantity                           |                                 The Quantity indicates the number of a specific product or item for this document.                                 |
|                Valor                |        Valor         |                                                                  (0)                                                                  |                                 |                                                                                                                                                                      |                           Amount                            |                                                                       Amount                                                                       |
|           Valor Acumulado           |        Valor         |                                                                  (0)                                                                  |                                 |                                                                                                                                                                      |                        Total Amount                         |                                                                 Sum of all amounts                                                                 |
|        Doc. Fiscal - Linhas         |    Tabela Direta     |                                                                                                                                       | LBRDocFiscalLine\_COFTrxEstoque |                                                                                                                                                                      |                                                             |                                                                                                                                                    |
|          Linha de Produção          |       Procurar       |                                                                                                                                       | MProductionLine\_COFTrxEstoqueP |                                                                                                                                                                      |           Document Line representing a production           |                          The Production Line indicates the production document line (if applicable) for this transaction                           |
| Linha de Ajuste de Estoque Previsto |    Tabela Direta     |                                                                                                                                       | COFAjusteEstoquePrvstLine\_COFT |                                                                                                                                                                      |      Primary Key : Linha de Ajuste de Estoque Previsto      |                                                 Primary Key : Linha de Ajuste de Estoque Previsto                                                  |
|              Descrição              | Texto Curto (String) |                                                                                                                                       |                                 |                                                                                                                                                                      |          Optional short description of the record           |                                                    A description is limited to 255 characters.                                                     |

</div>

</div>

  

</div>
