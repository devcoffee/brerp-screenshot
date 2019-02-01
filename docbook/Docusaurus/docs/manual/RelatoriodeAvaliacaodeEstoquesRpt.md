---
title: "Relatório de Avaliação de Estoques"
id: RelatoriodeAvaliacaodeEstoquesRpt
---
<div id="d197128e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Avaliação de Estoques

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2002-01-17 21:58:12.0

<span class="emphasis">*Atualizado:*</span>2006-01-11 18:41:13.0

<span class="emphasis"> *Descrição:* </span>Relatório de Avaliação de
Estoques

<span class="emphasis"> *Comentário/Ajuda:* </span> O relatório lista os
produtos com sua quantidade e valores atualizados na data de avaliação.
Além dos preços, os custos padrão e um outro elemento de custo opcional
são usados ​​para calcular o inventário do armazém específico.

<span class="emphasis"> *ReportView:* </span>RV\_T\_InventoryValue

![](/img/manual/RelatoriodeAvaliacaodeEstoques.png)

<div id="d197128e26" class="table">

<div class="table-title">

Table 1.1. RelatoriodeAvaliacaodeEstoques
Parâmetros

</div>

<div class="table-contents">

|           Nome           |      Nome da coluna       |  Referência   |        Valores(Padrão)         |                        Descrição                         |                                                                      Comentário/Ajuda                                                                       |
| :----------------------: | :-----------------------: | :-----------: | :----------------------------: | :------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Elemento de Custo     |    M\_CostElement\_ID     | Tabela Direta |                                |               Elemento de Custo de Produto               |                                                                            null                                                                             |
|         Moeda De         |      C\_Currency\_ID      | Tabela Direta |                                |                A Moeda para este registro                |                                      Indica a moeda a ser utilizada ao fazer processos ou relatórios com este registro                                      |
|  Grupo de Fornecedores   | COF\_GrupoFornecedor\_ID  | Tabela Direta |                                |           Identifica um grupo de fornecedores            |                                                                    Grupo de Fornecedores                                                                    |
|         Armazém          |     M\_Warehouse\_ID      | Tabela Direta |                                |         Armazém de estocagem e Ponto de Serviço          |                    O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                     |
|    Data da Avaliação     |         DateValue         |     Data      |                                |                    Data da avaliação                     |                                                                            null                                                                             |
| Versão da Lista de Preço | M\_PriceList\_Version\_ID | Tabela Direta |                                | Identifica uma instância exclusiva de uma Lista de Preço |                 Cada Lista de Preço pode ter múltiplas versões. O uso mais comum é para indicar as datas de validade de uma Lista de Preço.                 |
|       Organização        |        AD\_Org\_ID        | Tabela Direta | AD\_Org (all)(@\#AD\_Org\_ID@) |        Entidade organizacional dentro da Empresa         | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|     Esquema Contábil     |     C\_AcctSchema\_ID     | Tabela Direta |                                |                Regras para contabilidade                 |                   Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                   |
|     Tipo do Produto      |   COF\_ProductType\_ID    |   Procurar    |                                |    Coluna de relação com a tabela de tipo de produto     |                                                                 Primary Key : Product Type                                                                  |
|    Classe do Produto     |   COF\_ProductClass\_ID   |   Procurar    |                                |   Coluna de relação com a tabela de classe de produto    |                                                                 Primary Key : Product Class                                                                 |
|     Grupo do Produto     |   COF\_ProductGroup\_ID   |   Procurar    |                                |    Coluna de relação com a tabela de grupo do produto    |                                                                 Primary Key : Product Group                                                                 |

</div>

</div>

  

<div id="d197128e194" class="table">

<div class="table-title">

Table 1.2. RV\_T\_InventoryValue -
Colunas

</div>

<div class="table-contents">

|           Nome da coluna           |      Referência      |        Valores padrão        |       Valor de restrição        |                Regra de validação                |                  Descrição                   |                                                     Comentário/Ajuda                                                     |
| :--------------------------------: | :------------------: | :--------------------------: | :-----------------------------: | :----------------------------------------------: | :------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
|              Empresa               |    Tabela Direta     |                              |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |                 (ver acima)                  |                                                       (ver acima)                                                        |
|            Organização             |    Tabela Direta     |                              |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                 (ver acima)                  |                                                       (ver acima)                                                        |
|       Instância de Processo        |    Tabela Direta     |                              |  adpinstance\_tinventoryvalue   |                                                  |           Instance of the process            |                                                                                                                          |
|              Moeda De              |    Tabela Direta     |                              |   ccurrency\_tinventoryvalue    |                                                  |         The Currency for this record         |                      Indicates the Currency to be used when processing or reporting on this record                       |
|       Grupo de Fornecedores        |    Tabela Direta     |                              | COFGrupoFornecedor\_TInventoryV |                                                  |            Grupo de Fornecedores             |                                                  Grupo de Fornecedores                                                   |
|         Classe do Produto          |        Tabela        | COF\_ProductClass Value Name | COFProductClass\_TInventoryValu |                                                  |         Primary Key : Product Class          |                                               Primary Key : Product Class                                                |
|          Grupo do Produto          |        Tabela        | COF\_ProductGroup Value Name | COFProductGroup\_TInventoryValu |                                                  |         Primary Key : Product Group          |                                               Primary Key : Product Group                                                |
|          Tipo do Produto           |        Tabela        | COF\_ProductType Name Value  | COFProductType\_TInventoryValue |                                                  |          Primary Key : Product Type          |                                                Primary Key : Product Type                                                |
|               Custo                |        Número        |                              |                                 |                                                  |               Cost information               |                                                                                                                          |
|           Valor de Custo           |        Valor         |                              |                                 |                                                  |               Value with Cost                |                                                                                                                          |
|            Custo Padrão            |    Custos+Preços     |                              |                                 |                                                  |                Standard Costs                |                                                  Standard (plan) costs.                                                  |
|       Valor do Custo Padrão        |    Custos+Preços     |                              |                                 |                                                  |           Value in Standard Costs            |                                                                                                                          |
|         Data da Avaliação          |         Data         |                              |                                 |                                                  |              Date of valuation               |                                                                                                                          |
| Instância do Conjunto de Atributos | Atributo de Produto  |                              |      masi\_tinventoryvalue      |                                                  |        Product Attribute Set Instance        |     The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.     |
|         Elemento de Custo          |    Tabela Direta     |                              |  mcostelement\_tinventoryvalue  |                                                  |             Product Cost Element             |                                                                                                                          |
|      Versão da Lista de Preço      |    Tabela Direta     |                              |   mplversion\_tinventoryvalue   |                                                  | Identifies a unique instance of a Price List | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|              Produto               |       Procurar       |                              |    mproduct\_tinventoryvalue    |                                                  |            Product, Service, Item            |                        Identifies an item which is either purchased or sold in this organization.                        |
|              Armazém               |    Tabela Direta     |                              |   mwarehouse\_tinventoryvalue   |                                                  |     Storage Warehouse and Service Point      |             The Warehouse identifies a unique Warehouse where products are stored or Services are provided.              |
|            Preço Limite            |    Custos+Preços     |                              |                                 |                                                  |          Lowest price for a product          |               The Price Limit indicates the lowest price for a product stated in the Price List Currency.                |
|       Valor em Preço Limite        |    Custos+Preços     |                              |                                 |                                                  |            Value with limit price            |                                                                                                                          |
|           Preço de Lista           |    Custos+Preços     |                              |                                 |                                                  |                  List Price                  |                           The List Price is the official List Price in the document currency.                            |
|    Avaliação com Preço de Lista    |    Custos+Preços     |                              |                                 |                                                  |          Valuation with List Price           |                                                                                                                          |
|            Preço do PC             |    Custos+Preços     |                              |                                 |                                                  |       Price based on a purchase order        |                          The PO Price indicates the price for a product per the purchase order.                          |
|     Avaliação com Preço de PC      |    Custos+Preços     |                              |                                 |                                                  |           Valuation with PO Price            |                                                                                                                          |
|            Preço Padrão            |    Custos+Preços     |                              |                                 |                                                  |                Standard Price                |                The Standard Price indicates the standard or normal price for a product on this price list                |
|       Valor em Preço Padrão        |    Custos+Preços     |                              |                                 |                                                  |        Valuation with standard price         |                                                                                                                          |
|       Quantidade em Estoque        |      Quantidade      |                              |                                 |                                                  |               On Hand Quantity               |                 The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.                 |
|       T\_InventoryValue\_UU        | Texto Curto (String) |                              |                                 |                                                  |                                              |                                                                                                                          |

</div>

</div>

  

</div>
