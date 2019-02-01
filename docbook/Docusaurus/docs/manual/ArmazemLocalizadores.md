---
title: "Armazém %26 Localizadores"
id: ArmazemLocalizadores
---
<div id="d7685e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Armazém %26 Localizadores

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Armazém -
    M\_Warehouse](#d7685e23)</span>
  - <span class="section">[2. Tabela: Localizador -
    M\_Locator](#d7685e302)</span>
  - <span class="section">[3. Tabela: Armazenagem -
    M\_Storage](#d7685e533)</span>
  - <span class="section">[4. Tabela: Reabastecer -
    M\_Replenish](#d7685e733)</span>
  - <span class="section">[5. Tabela: Contabilidade -
    M\_Warehouse\_Acct](#d7685e941)</span>
  - <span class="section">[6. Tabela: Transações de Produtos -
    M\_Transaction](#d7685e1129)</span>
  - <span class="section">[7. Tabela: Armazém de Reposição -
    COF\_SpareWarehouse](#d7685e1388)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Armazéns e
Localizadores

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Armazéns e
Localizadores" define cada Armazém, quaisquer Localizadores para esse
Armazém e os Parâmetros Contábeis a serem utilizados para inventário
nesse Armazém.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ArmazemLocalizadores.png)

<div id="d7685e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Armazém - M\_Warehouse

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Warehouse_data)

<span class="emphasis">*Descrição:*</span> Armazém

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Armazém"
define cada Armazém que é usado para armazenar produtos. Se um armazém
de origem for selecionado, todo o reabastecimento de produtos será feito
a partir daquele armazém. Se você usar algorítimos de reabastecimento
personalizados, você precisa definir a classe utilizada por cada
armazém.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d7685e40" class="table">

<div class="table-title">

Table 1.1. Warehouse
Fields

</div>

<div class="table-contents">

|         Nome do campo         |       Referência       |                           Valores (Padrão)                           |       Chave restritiva       |                  Regra de validação                   |                       Descrição                        |                                                                     Comentário/Ajuda                                                                     |
| :---------------------------: | :--------------------: | :------------------------------------------------------------------: | :--------------------------: | :---------------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Armazém            |           ID           |                                                                      |                              |                                                       |          Storage Warehouse and Service Point           |                             The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                              |
|            Empresa            |     Tabela Direta      |                         (@\#AD\_Client\_ID@)                         |     m\_warehouse\_client     |           AD\_Client.AD\_Client\_ID \< \> 0           |           (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|          Organização          |     Tabela Direta      |                          (@\#AD\_Org\_ID@)                           |      m\_warehouse\_org       | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |           (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|        Chave de Busca         |  Texto Curto (String)  |                                                                      |                              |                                                       |           (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|             Nome              |  Texto Curto (String)  |                                                                      |                              |                                                       |         Alphanumeric identifier of the entity          |       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.       |
|           Descrição           |  Texto Curto (String)  |                                                                      |                              |                                                       |        Optional short description of the record        |                                                       A description is limited to 255 characters.                                                        |
|             Ativo             |        Sim-Não         |                                 (Y)                                  |                              |                                                       |           (semelhante ao primeiro relatório)           |                                                                   (ver o mesmo acima)                                                                    |
|          Em Trânsito          |        Sim-Não         |                                 (N)                                  |                              |                                                       |                 Movement is in transit                 |                         Material Movement is in transit - shipped, but not received. The transaction is completed, if confirmed.                         |
|           Endereço            | Localização (Endereço) |                                                                      |    c\_location\_warehouse    |                                                       |                  Location or Address                   |                                             The Location / Address field defines the location of an entity.                                              |
|    Separador de Elementos     |  Texto Curto (String)  |                                 (\*)                                 |                              |                                                       |                   Element Separator                    |                                  The Element Separator defines the delimiter printed between elements of the structure                                   |
|       Armazém de Origem       |         Tabela         |                        M\_Warehouse of Client                        | mwarehousesource\_mwarehouse |                                                       |          Optional Warehouse to replenish from          |                                          If defined, the warehouse selected is used to replenish the product(s)                                          |
|   Classe de Reabastecimento   |  Texto Curto (String)  |                                                                      |                              |                                                       |      Custom class to calculate Quantity to Order       | If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level. |
| Não Permitir Estoque Negativo |        Sim-Não         |                                 (N)                                  |                              |                                                       |  Negative Inventory is not allowed in this warehouse   |                        If checked, any transaction that results in the onhand inventory being driven negative will be prevented.                         |
|     Reservar Localizador      |         Tabela         |                              M\_Locator                              | mreservelocator\_mwarehouse  |   M\_Locator.M\_Warehouse\_ID=@0|M\_Warehouse\_ID@    |   Reservation Locator (just for reporting purposes)    |                                                                                                                                                          |
|     Em poder de terceiro      |        Sim-Não         |                                ('N')                                 |                              |                                                       | Indicates if this warehouse holds third party locators |                                                  Indicates if this warehouse holds third party locators                                                  |
|       Tipo de Depósito        |         Lista          | Terceiros em Nosso Poder Nosso em Poder de Terceiros Próprio ('OWN') |                              |                                                       |               Defines the Warehouse Type               |                                                                                                                                                          |

</div>

</div>

  

<div id="d7685e302" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Localizador - M\_Locator

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Locator_data)

<span class="emphasis">*Descrição:*</span> Localizador

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Localizador"
define quaisquer localizadores para aquele Armazém.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7685e319" class="table">

<div class="table-title">

Table 1.2. Locator
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |  Valores (Padrão)  |    Chave restritiva    |                  Regra de validação                   |                  Descrição                  |                                                                                                                                                                                                                                                                                    Comentário/Ajuda                                                                                                                                                                                                                                                                                     |
| :-----------------: | :------------------: | :----------------: | :--------------------: | :---------------------------------------------------: | :-----------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Localizador     |          ID          |                    |                        |                                                       |              Warehouse Locator              |                                                                                                                                                                                                                                                            The Locator indicates where in a Warehouse a product is located.                                                                                                                                                                                                                                                             |
|       Empresa       |    Tabela Direta     | (@AD\_Client\_ID@) | m\_wh\_locator\_client |           AD\_Client.AD\_Client\_ID \< \> 0           |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
|     Organização     |    Tabela Direta     |  (@AD\_Org\_ID@)   |  m\_wh\_locator\_org   | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
|       Armazém       |    Tabela Direta     |                    | m\_warehouse\_locator  |                                                       |     Storage Warehouse and Service Point     |                                                                                                                                                                                                                                             The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                                                                                                                                                                             |
|   Chave de Busca    | Texto Curto (String) |                    |                        |                                                       |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
|    Locator Type     |    Tabela Direta     |                    | MLocatorType\_MLocator |                                                       |                                             |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|        Ativo        |       Sim-Não        |        (Y)         |                        |                                                       |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
| Prioridade Relativa |       Inteiro        |        (50)        |                        |                                                       | Where inventory should be picked from first | The Relative Priority indicates the location to pick from first if an product is stored in more than one location. (100 = highest priority, 0 = lowest). For outgoing shipments, the location is picked with the highest priority where the entire quantity can be shipped from. If there is no location, the location with the highest priority is used. The Priority is ignored for products with Guarantee Date (always the oldest first) or if a specific instance is selected. Incoming receipts are stored at the location with the highest priority, if not explicitly selected. |
|       Padrão        |       Sim-Não        |                    |                        |                                                       |                Default value                |                                                                                                                                                                                                                                                     The Default Checkbox indicates if this record will be used as a default value.                                                                                                                                                                                                                                                      |
|    Corredor (X)     | Texto Curto (String) |                    |                        |                                                       |          X dimension, e.g., Aisle           |                                                                                                                                                                                                                                                              The X dimension indicates the Aisle a product is located in.                                                                                                                                                                                                                                                               |
|     Estante (Y)     | Texto Curto (String) |                    |                        |                                                       |           Y dimension, e.g., Bin            |                                                                                                                                                                                                                                                                The Y dimension indicates the Bin a product is located in                                                                                                                                                                                                                                                                |
|      Nível (Z)      | Texto Curto (String) |                    |                        |                                                       |          Z dimension, e.g., Level           |                                                                                                                                                                                                                                                              The Z dimension indicates the Level a product is located in.                                                                                                                                                                                                                                                               |
|   M\_Locator\_UU    | Texto Curto (String) |                    |                        |                                                       |                                             |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |

</div>

</div>

  

<div id="d7685e533" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Armazenagem - M\_Storage

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Informação Detalhada de
Armazenagem

<span class="emphasis">*Coluna linkada:* </span> Locator

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d7685e548" class="table">

<div class="table-title">

Table 1.3. Storage
Fields

</div>

<div class="table-contents">

|           Nome do campo            |     Referência      |  Valores (Padrão)  | Chave restritiva |                                                                          Regra de validação                                                                          |                  Descrição                  |                                                 Comentário/Ajuda                                                 |
| :--------------------------------: | :-----------------: | :----------------: | :--------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
|              Empresa               |    Tabela Direta    | (@AD\_Client\_ID@) |                  |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |     (semelhante ao primeiro relatório)      |                                               (ver o mesmo acima)                                                |
|            Organização             |    Tabela Direta    |  (@AD\_Org\_ID@)   |                  |                                                        AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                                                         |     (semelhante ao primeiro relatório)      |                                               (ver o mesmo acima)                                                |
|            Localizador             |  Locator (Armazém)  |                    |                  |                                                                                                                                                                      |              Warehouse Locator              |                         The Locator indicates where in a Warehouse a product is located.                         |
|   Data da Política de Materiais    |        Data         |                    |                  |                                                                                                                                                                      | Time used for LIFO and FIFO Material Policy |                     This field is used to record time used for LIFO and FIFO material policy                     |
|              Produto               |      Procurar       |                    |                  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |           Product, Service, Item            |                    Identifies an item which is either purchased or sold in this organization.                    |
| Instância do Conjunto de Atributos | Atributo de Produto |                    |                  |                                                                                                                                                                      |       Product Attribute Set Instance        | The values of the actual Product Attribute Instances. The product level attributes are defined on Product level. |
|               Ativo                |       Sim-Não       |        (Y)         |                  |                                                                                                                                                                      |     (semelhante ao primeiro relatório)      |                                               (ver o mesmo acima)                                                |
|       Quantidade em Estoque        |     Quantidade      |                    |                  |                                                                                                                                                                      |              On Hand Quantity               |             The On Hand Quantity indicates the quantity of a product that is on hand in a warehouse.             |
| Data da última contagem de estoque |        Data         |                    |                  |                                                                                                                                                                      |        Date of Last Inventory Count         |                The Date Last Inventory Count indicates the last time an Inventory count was done.                |
|        Quantidade Reservada        |     Quantidade      |                    |                  |                                                                                                                                                                      |              Reserved Quantity              |              The Reserved Quantity indicates the quantity of a product that is currently reserved.               |
|       Quantidade Requisitada       |     Quantidade      |                    |                  |                                                                                                                                                                      |              Ordered Quantity               |                    The Ordered Quantity indicates the quantity of a product that was ordered.                    |

</div>

</div>

  

<div id="d7685e733" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Reabastecer - M\_Replenish

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Replenish_data)

<span class="emphasis">*Descrição:*</span> Definir Reabastecimento de
Produto

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba
"Reabastecimento" define o tipo das quantidades de reabastecimento. Isto
é usado para a geração de pedidos automáticos. Se você selecionar um
tipo de reabastecimento personalizado, você precisa criar uma classe
implementando org.adempiere.util.ReplenishInterface e selecioná-la no
nível do armazém.

<span class="emphasis">*Coluna linkada:* </span> Warehouse

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7685e754" class="table">

<div class="table-title">

Table 1.4. Replenish
Fields

</div>

<div class="table-contents">

|      Nome do campo      |  Referência   |                                          Valores (Padrão)                                          |       Chave restritiva       |                                                                          Regra de validação                                                                          |                Descrição                 |                                                                                                                                                               Comentário/Ajuda                                                                                                                                                               |
| :---------------------: | :-----------: | :------------------------------------------------------------------------------------------------: | :--------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         | Tabela Direta |                                         (@AD\_Client\_ID@)                                         |                              |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |    (semelhante ao primeiro relatório)    |                                                                                                                                                             (ver o mesmo acima)                                                                                                                                                              |
|       Organização       | Tabela Direta |                                          (@AD\_Org\_ID@)                                           |                              |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |    (semelhante ao primeiro relatório)    |                                                                                                                                                             (ver o mesmo acima)                                                                                                                                                              |
|         Armazém         | Tabela Direta |                                                                                                    |   m\_warehouse\_replenish    |                                                                                                                                                                      |   Storage Warehouse and Service Point    |                                                                                                                       The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                                                        |
|         Produto         |   Procurar    |                                                                                                    |    m\_product\_replenish     | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |          Product, Service, Item          |                                                                                                                                  Identifies an item which is either purchased or sold in this organization.                                                                                                                                  |
|          Ativo          |    Sim-Não    |                                                (Y)                                                 |                              |                                                                                                                                                                      |    (semelhante ao primeiro relatório)    |                                                                                                                                                             (ver o mesmo acima)                                                                                                                                                              |
| Tipo de Reabastecimento |     Lista     | Manual Emitir pedido de compras abaixo do nível mínimo Gerenciamento de Nível Máximo Personalizado |                              |                                                                                                                                                                      |     Method for re-ordering a product     | The Replenish Type indicates if this product will be manually re-ordered, ordered when the quantity is below the minimum quantity or ordered when it is below the maximum quantity. If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level. |
|      Nível Mínimo       |     Valor     |                                                                                                    |                              |                                                                                                                                                                      | Minimum Inventory level for this product |                                                                                                                                  Indicates the minimum quantity of this product to be stocked in inventory.                                                                                                                                  |
|      Nível Máximo       |     Valor     |                                                                                                    |                              |                                                                                                                                                                      | Maximum Inventory level for this product |                                                                                                                                  Indicates the maximum quantity of this product to be stocked in inventory.                                                                                                                                  |
|    Armazém de Origem    |    Tabela     |                                       M\_Warehouse of Client                                       | mwarehousesource\_mreplenish |                                                                                                                                                                      |   Optional Warehouse to replenish from   |                                                                                                                                    If defined, the warehouse selected is used to replenish the product(s)                                                                                                                                    |
|   Qtd Tamanho do Lote   |  Quantidade   |                                                                                                    |                              |                                                                                                                                                                      |                                          |                                                                                                                                                                                                                                                                                                                                              |
|       Localizador       | Tabela Direta |                                                                                                    |     mlocator\_mreplenish     |                                                            M\_Locator.M\_Warehouse\_ID=@M\_Warehouse\_ID@                                                            |            Warehouse Locator             |                                                                                                                                       The Locator indicates where in a Warehouse a product is located.                                                                                                                                       |

</div>

</div>

  

<div id="d7685e941" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Contabilidade - M\_Warehouse\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Warehouse_Acct_data)

<span class="emphasis">*Descrição:*</span> Contabilidade

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
define os parâmetros contábeis a serem usados para controle de Estoques
em um dado Armazém.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7685e958" class="table">

<div class="table-title">

Table 1.5. Accounting
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |  Valores (Padrão)  |         Chave restritiva         |                Regra de validação                |                         Descrição                          |                                                                                                               Comentário/Ajuda                                                                                                               |
| :--------------------: | :------------------: | :----------------: | :------------------------------: | :----------------------------------------------: | :--------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                                  |        AD\_Client.AD\_Client\_ID \< \> 0         |             (semelhante ao primeiro relatório)             |                                                                                                             (ver o mesmo acima)                                                                                                              |
|      Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |             (semelhante ao primeiro relatório)             |                                                                                                             (ver o mesmo acima)                                                                                                              |
|        Armazém         |    Tabela Direta     |                    |  m\_warehouse\_warehouse\_acct   |                                                  |            Storage Warehouse and Service Point             |                                                                       The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                        |
|    Esquema Contábil    |    Tabela Direta     |                    |   cacctschema\_mwarehouseacct    |                                                  |                    Rules for accounting                    |                                                                   An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                                    |
|         Ativo          |       Sim-Não        |        (Y)         |                                  |                                                  |             (semelhante ao primeiro relatório)             |                                                                                                             (ver o mesmo acima)                                                                                                              |
|       (Not Used)       |        Conta         |                    |    vc\_winventory\_mwarehouse    |                                                  |   Warehouse Inventory Asset Account - Currently not used   | The Warehouse Inventory Asset Account identifies the account used for recording the value of your inventory. This is the counter account for inventory revaluation differences. The Product Asset account maintains the product asset value. |
|  Inventory Adjustment  |        Conta         |                    | vc\_winvactualadjust\_mwarehouse |                                                  | Account for Inventory value adjustments for Actual Costing |                                                In actual costing systems, this account is used to post Inventory value adjustments. You could set it to the standard Inventory Asset account.                                                |
| Diferenças de Estoque  |        Conta         |                    |   vc\_wdifferences\_mwarehouse   |                                                  |               Warehouse Differences Account                |                                                            The Warehouse Differences Account indicates the account used recording differences identified during inventory counts.                                                            |
| Inventory Revaluation  |        Conta         |                    |   vc\_wrevaluation\_mwarehouse   |                                                  |             Account for Inventory Revaluation              |                                                       The Inventory Revaluation Account identifies the account used to records changes in inventory value due to currency revaluation.                                                       |
| M\_Warehouse\_Acct\_UU | Texto Curto (String) |                    |                                  |                                                  |                                                            |                                                                                                                                                                                                                                              |

</div>

</div>

  

<div id="d7685e1129" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Transações de Produtos - M\_Transaction

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Transaction_data)

<span class="emphasis">*Descrição:*</span> Transações para Produtos
armazenados

<span class="emphasis">*Coluna linkada:* </span> Product

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7685e1146" class="table">

<div class="table-title">

Table 1.6. Product Transactions
Fields

</div>

<div class="table-contents">

|           Nome do campo            |     Referência      |                                                                                                            Valores (Padrão)                                                                                                            |       Chave restritiva        |                                                                          Regra de validação                                                                          |                    Descrição                    |                                                                  Comentário/Ajuda                                                                  |
| :--------------------------------: | :-----------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Transação de Estoque        |         ID          |                                                                                                                                                                                                                                        |                               |                                                                                                                                                                      |                                                 |                                                                                                                                                    |
|              Empresa               |    Tabela Direta    |                                                                                                          (@\#AD\_Client\_ID@)                                                                                                          |                               |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |       (semelhante ao primeiro relatório)        |                                                                (ver o mesmo acima)                                                                 |
|            Organização             |    Tabela Direta    |                                                                                                           (@\#AD\_Org\_ID@)                                                                                                            |                               |                                                        AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                                                         |       (semelhante ao primeiro relatório)        |                                                                (ver o mesmo acima)                                                                 |
|            Localizador             |  Locator (Armazém)  |                                                                                                                                                                                                                                        |   mlocator\_minventorycount   |                                                                                                                                                                      |                Warehouse Locator                |                                          The Locator indicates where in a Warehouse a product is located.                                          |
|               Ativo                |       Sim-Não       |                                                                                                                  (Y)                                                                                                                   |                               |                                                                                                                                                                      |       (semelhante ao primeiro relatório)        |                                                                (ver o mesmo acima)                                                                 |
|              Produto               |      Procurar       |                                                                                                                                                                                                                                        |   mproduct\_minventorycount   | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |             Product, Service, Item              |                                     Identifies an item which is either purchased or sold in this organization.                                     |
| Instância do Conjunto de Atributos | Atributo de Produto |                                                                                                                                                                                                                                        |  mattrsetinst\_mtransaction   |                                                                                                                                                                      |         Product Attribute Set Instance          |                  The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                  |
|       Quantidade Movimentada       |     Quantidade      |                                                                                                                                                                                                                                        |                               |                                                                                                                                                                      |          Quantity of a product moved.           |                                   The Movement Quantity indicates the quantity of a product that has been moved.                                   |
|        Data da Movimentação        |        Data         |                                                                                                                                                                                                                                        |                               |                                                                                                                                                                      | Date a product was moved in or out of inventory | The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement. |
|        Tipo de Movimentação        |        Lista        | Saldo Inicial Entrega para Cliente Devolução de cliente Saída de Estoque Entrada de Estoque Movimento de Movimento para Produção - Produção + Devoluções a Fornecedor Recebimentos de Fornecedor Ordem de Serviço - Ordem de Serviço + |                               |                                                                                                                                                                      |         Method of moving the inventory          |                                   The Movement Type indicates the type of movement (in, out, to production, etc)                                   |
|    Linha de Remessa/Recebimento    |      Procurar       |                                                                                                                                                                                                                                        |   minoutline\_mtransaction    |                                                                                                                                                                      |      Line on Shipment or Receipt document       |                                  The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                  |
|      Linha de Estoque Físico       |      Procurar       |                                                                                                                                                                                                                                        | minventoryline\_mtransaction  |                                                                                                                                                                      |      Unique line in an Inventory document       |                       The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction                       |
|         Linha de Movimento         |      Procurar       |                                                                                                                                                                                                                                        |  mmovementline\_mtransaction  |                                                                                                                                                                      |          Inventory Move document Line           |                       The Movement Line indicates the inventory movement document line (if applicable) for this transaction                        |
|         Linha de Produção          |      Procurar       |                                                                                                                                                                                                                                        | mproductionline\_mtransaction |                                                                                                                                                                      |     Document Line representing a production     |                          The Production Line indicates the production document line (if applicable) for this transaction                           |
|         Emissão do Projeto         |      Procurar       |                                                                                                                                                                                                                                        |  cprojectissue\_mtransaction  |                                                                                                                                                                      |        Project Issues (Material, Labor)         |              Issues to the project initiated by the "Issue to Project" process. You can issue Receipts, Time and Expenses, or Stock.               |

</div>

</div>

  

<div id="d7685e1388" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Armazém de Reposição - COF\_SpareWarehouse

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Armazém de Reposição

<span class="emphasis">*Comentário/Ajuda:* </span> Armazém de Reposição

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7685e1403" class="table">

<div class="table-title">

Table 1.7. Spare Warehouse
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Armazém         |    Tabela Direta     |                      |  MWarehouse\_COFSpareWarehouse  |                                                  |   Storage Warehouse and Service Point    |                       The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                        |
| COF\_SpareWarehouse\_UU | Texto Curto (String) |                      |                                 |                                                  |                                          |                                                                                                                                              |
| COF\_SpareWarehouse\_ID |          ID          |                      |                                 |                                                  |      Primary Key : Spare Warehouse       |                                                        Primary Key : Spare Warehouse                                                         |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Armazém         |        Tabela        |    COF\_Warehouse    | COFWarehouse\_COFSpareWarehouse |                                                  |   Storage Warehouse and Service Point    |                       The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                        |
|          Ativo          |       Sim-Não        |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Nome           | Texto Curto (String) |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        | Texto Curto (String) |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
