---
title: "Relatório de Reabastecimento"
id: RelatoriodeReabastecimentoRpt
---
<div id="d201768e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Reabastecimento

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-05-11 21:06:15.0

<span class="emphasis">*Atualizado:*</span>2005-12-17 07:59:16.0

<span class="emphasis"> *Descrição:* </span>Relatório de Reabastecimento
de Estoques

<span class="emphasis"> *Comentário/Ajuda:* </span>Este relatório lista
dos produtos e são reabastecidos. Note que um produto pode ter apenas um
fornecedor atual. Se houver mais de um fornecedor por produto, ambos os
registros são resetados. Você precisa selecionar um fornecedor atual
manualmente. Os movimentos só são criados, se um armazém de origem for
definido para que o depósito seja reabastecido.

<span class="emphasis"> *ReportView:* </span>T\_Replenish

![](/img/manual/RelatoriodeReabastecimento.png)

<div id="d201768e26" class="table">

<div class="table-title">

Table 1.1. RelatoriodeReabastecimento
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna    |  Referência   |                            Valores(Padrão)                             |                Descrição                |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :-----------------: | :-----------: | :--------------------------------------------------------------------: | :-------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Parceiro de Negócios |   C\_BPartner\_ID   |    Tabela     |                       C\_BPartner Vendors Avtive                       |   Identifica um Parceiro de Negócios.   | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|  Tipo de Documento   |   C\_DocType\_ID    | Tabela Direta |                                                                        |       Tipo de Documento ou regras       |                                        O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                         |
|        Criar         | ReplenishmentCreate |     Lista     | Distribution Order Movimentação de Estoque Pedido de Compra Requisição |    Criar a partir do Reabastecimento    |                                                                                 null                                                                                 |
|       Armazém        |  M\_Warehouse\_ID   | Tabela Direta |                                                                        | Armazém de estocagem e Ponto de Serviço |                         O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                         |

</div>

</div>

  

<div id="d201768e103" class="table">

<div class="table-title">

Table 1.2. T\_Replenish -
Colunas

</div>

<div class="table-contents">

|      Nome da coluna      |      Referência      |                                           Valores padrão                                           |      Valor de restrição      |                Regra de validação                |                       Descrição                       |                                                                                                                                                               Comentário/Ajuda                                                                                                                                                               |
| :----------------------: | :------------------: | :------------------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |    Tabela Direta     |                                                                                                    |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |                      (ver acima)                      |                                                                                                                                                                 (ver acima)                                                                                                                                                                  |
|       Organização        |    Tabela Direta     |                                                                                                    |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                      (ver acima)                      |                                                                                                                                                                 (ver acima)                                                                                                                                                                  |
|  Instância de Processo   |    Tabela Direta     |                                                                                                    |   adpinstance\_treplenish    |                                                  |                Instance of the process                |                                                                                                                                                                                                                                                                                                                                              |
|   Parceiro de Negócios   |       Procurar       |                                                                                                    |                              |                                                  |             Identifies a Business Partner             |                                                                                                               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                |
|    Tipo de Documento     |    Tabela Direta     |                                                                                                    |     cdoctype\_treplenish     |                                                  |                Document type or rules                 |                                                                                                                                     The Document Type determines document sequence and processing rules                                                                                                                                      |
|    Classificação ABC     |        Lista         |                                               A B C                                                |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                                                                              |
|    Classe do Produto     |        Tabela        |                                    COF\_ProductClass Value Name                                    | COFProductClass\_TReplenish  |                                                  |              Primary Key : Product Class              |                                                                                                                                                         Primary Key : Product Class                                                                                                                                                          |
|     Grupo do Produto     |        Tabela        |                                    COF\_ProductGroup Value Name                                    | COFProductGroup\_TReplenish  |                                                  |              Primary Key : Product Group              |                                                                                                                                                         Primary Key : Product Group                                                                                                                                                          |
|     Tipo do Produto      |        Tabela        |                                    COF\_ProductType Name Value                                     |  COFProductType\_TReplenish  |                                                  |              Primary Key : Product Type               |                                                                                                                                                          Primary Key : Product Type                                                                                                                                                          |
|       Nível Máximo       |      Quantidade      |                                                                                                    |                              |                                                  |       Maximum Inventory level for this product        |                                                                                                                                  Indicates the maximum quantity of this product to be stocked in inventory.                                                                                                                                  |
|       Nível Mínimo       |      Quantidade      |                                                                                                    |                              |                                                  |       Minimum Inventory level for this product        |                                                                                                                                  Indicates the minimum quantity of this product to be stocked in inventory.                                                                                                                                  |
|         Produto          |       Procurar       |                                                                                                    |     mproduct\_treplenish     |                                                  |                Product, Service, Item                 |                                                                                                                                  Identifies an item which is either purchased or sold in this organization.                                                                                                                                  |
|         Armazém          |    Tabela Direta     |                                                                                                    |    mwarehouse\_treplenish    |                                                  |          Storage Warehouse and Service Point          |                                                                                                                       The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                                                        |
|    Armazém de Origem     |        Tabela        |                                       M\_Warehouse of Client                                       | mwarehousesource\_treplenish |                                                  |         Optional Warehouse to replenish from          |                                                                                                                                    If defined, the warehouse selected is used to replenish the product(s)                                                                                                                                    |
|   Qde Mínima de Pedido   |      Quantidade      |                                                                                                    |                              |                                                  |             Minimum order quantity in UOM             |                                                                                                                       The Minimum Order Quantity indicates the smallest quantity of this product which can be ordered.                                                                                                                       |
| Qde por Pacote do Pedido |      Quantidade      |                                                                                                    |                              |                                                  | Package order size in UOM (e.g. order set of 5 units) |                                                                                                                             The Order Pack Quantity indicates the number of units in each pack of this product.                                                                                                                              |
|  Quantidade em Estoque   |      Quantidade      |                                                                                                    |                              |                                                  |                   On Hand Quantity                    |                                                                                                                           The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.                                                                                                                           |
|  Quantidade Requisitada  |      Quantidade      |                                                                                                    |                              |                                                  |                   Ordered Quantity                    |                                                                                                                                  The Ordered Quantity indicates the quantity of a product that was ordered.                                                                                                                                  |
|   Quantidade Reservada   |      Quantidade      |                                                                                                    |                              |                                                  |                   Reserved Quantity                   |                                                                                                                            The Reserved Quantity indicates the quantity of a product that is currently reserved.                                                                                                                             |
|    Quantidade a Pedir    |      Quantidade      |                                                                                                    |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                                                                              |
|          Criar           |        Lista         |               Distribution Order Movimentação de Estoque Pedido de Compra Requisição               |                              |                                                  |               Create from Replenishment               |                                                                                                                                                                                                                                                                                                                                              |
| Tipo de Reabastecimento  |        Lista         | Manual Emitir pedido de compras abaixo do nível mínimo Gerenciamento de Nível Máximo Personalizado |                              |                                                  |           Method for re-ordering a product            | The Replenish Type indicates if this product will be manually re-ordered, ordered when the quantity is below the minimum quantity or ordered when it is below the maximum quantity. If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level. |
|     T\_Replenish\_UU     | Texto Curto (String) |                                                                                                    |                              |                                                  |                                                       |                                                                                                                                                                                                                                                                                                                                              |
|        Atualizado        |      Data+Hora       |                                             (SYSDATE)                                              |                              |                                                  |             Date this record was updated              |                                                                                                                                      The Updated field indicates the date that this record was updated.                                                                                                                                      |
|      Atualizado por      |        Tabela        |                                              AD\_User                                              |                              |                                                  |             User who updated this records             |                                                                                                                                       The Updated By field indicates the user who updated this record.                                                                                                                                       |

</div>

</div>

  

</div>
