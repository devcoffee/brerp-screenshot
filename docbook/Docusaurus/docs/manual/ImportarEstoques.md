---
title: "Importar Estoques"
id: ImportarEstoques
---
<div id="d115152e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Estoques

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Inventário -
    I\_Inventory](#d115152e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importar Transações de
Estoque

<span class="emphasis">*Comentário/Ajuda:* </span>Validar e Importar
Transações de Estoque

<span class="emphasis"> *Criado em:* </span>2003-05-28 22:43:30.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d115152e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Inventário - I\_Inventory

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/I_Inventory_data)

<span class="emphasis">*Descrição:*</span> Importar Estoques

<span class="emphasis">*Comentário/Ajuda:* </span> Validar e Importar
Transações de Estoque. O Localizador é primariamente determinado pela
Chave de Localização, então o Armazém e os Campos X,Y,Z.\< p\> Um
Estoque Físico é criado por Armazém e Data de Movimentação.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d115152e39" class="table">

<div class="table-title">

Table 1.1. Inventory
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                              Regra de validação                               |                                 Descrição                                 |                                                                                                                       Comentário/Ajuda                                                                                                                        |
| :--------------------------------: | :------------------: | :------------------: | :------------------------: | :---------------------------------------------------------------------------: | :-----------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          I\_Inventory\_UU          | Texto Curto (String) |                      |                            |                                                                               |                                                                           |                                                                                                                                                                                                                                                               |
|               Ativo                |       Sim-Não        |         (Y)          |                            |                                                                               |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|             Processado             |       Sim-Não        |                      |                            |                                                                               |                      The document has been processed                      |                                                                                             The Processed checkbox indicates that a document has been processed.                                                                                              |
|              Armazém               |    Tabela Direta     |                      |   mwarehouse\_iinventory   |                                                                               |                    Storage Warehouse and Service Point                    |                                                                                The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                |
|         Importar Estoques          |          ID          |                      |                            |                                                                               |                       Import Inventory Transactions                       |                                                                                                                                                                                                                                                               |
|             Importado              |       Sim-Não        |                      |                            |                                                                               |                      Has this import been processed                       |                                                                                              The Imported check box indicates if this import has been processed.                                                                                              |
|           Estoque Físico           |       Procurar       |                      |   minventory\_iinventory   |                                                                               |                    Parameters for a Physical Inventory                    |                                                                                        The Physical Inventory indicates a unique parameters for a physical inventory.                                                                                         |
|      Linha de Estoque Físico       |       Procurar       |                      | minventoryline\_iinventory |                                                                               |                   Unique line in an Inventory document                    |                                                                            The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction                                                                             |
|   Mensagem de Erro de Importação   | Texto Curto (String) |                      |                            |                                                                               |                  Messages generated from import process                   |                                                                                   The Import Error Message displays any error messages generated during the import process.                                                                                   |
|              Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                            |                       AD\_Client.AD\_Client\_ID \< \> 0                       |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|            Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                            |             AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'             |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|     Nome do Tipo de Documento      | Texto Curto (String) |                      |                            |                                                                               |                         Name of the Document Type                         |                                                                                                                                                                                                                                                               |
|         Tipo de Documento          |    Tabela Direta     |                      |    cdoctype\_iinventory    | C\_DocType.DocBaseType='MMI' AND C\_DocType.AD\_Client\_ID=@\#AD\_Client\_ID@ |                          Document type or rules                           |                                                                                              The Document Type determines document sequence and processing rules                                                                                              |
|        Data da Movimentação        |         Data         |                      |                            |                                                                               |              Date a product was moved in or out of inventory              |                                                      The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement.                                                       |
|          Chave de Armazém          | Texto Curto (String) |                      |                            |                                                                               |                           Key of the Warehouse                            |                                                                                                                 Key to identify the Warehouse                                                                                                                 |
|            Corredor (X)            | Texto Curto (String) |                      |                            |                                                                               |                         X dimension, e.g., Aisle                          |                                                                                                 The X dimension indicates the Aisle a product is located in.                                                                                                  |
|            Estante (Y)             | Texto Curto (String) |                      |                            |                                                                               |                          Y dimension, e.g., Bin                           |                                                                                                   The Y dimension indicates the Bin a product is located in                                                                                                   |
|             Nível (Z)              | Texto Curto (String) |                      |                            |                                                                               |                         Z dimension, e.g., Level                          |                                                                                                 The Z dimension indicates the Level a product is located in.                                                                                                  |
|        Chave de Localização        | Texto Curto (String) |                      |                            |                                                                               |                       Key of the Warehouse Locator                        |                                                                                                                                                                                                                                                               |
|            Localizador             |    Tabela Direta     |                      |    mlocator\_iinventory    |                                                                               |                             Warehouse Locator                             |                                                                                               The Locator indicates where in a Warehouse a product is located.                                                                                                |
|           Chave de Busca           | Texto Curto (String) |                      |                            |                                                                               |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|              UPC/EAN               | Texto Curto (String) |                      |                            |                                                                               | Bar Code (Universal Product Code or its superset European Article Number) | Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode) |
|              Produto               |       Procurar       |                      |    mproduct\_iinventory    |                                                                               |                          Product, Service, Item                           |                                                                                          Identifies an item which is either purchased or sold in this organization.                                                                                           |
|             Lote Núm.              | Texto Curto (String) |                      |                            |                                                                               |                         Lot number (alphanumeric)                         |                                                                                             The Lot Number indicates the specific lot that a product was part of.                                                                                             |
|             Núm. Série             | Texto Curto (String) |                      |                            |                                                                               |                           Product Serial Number                           |                                                                            The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                                                                             |
|        Quantidade Contábil         |      Quantidade      |                      |                            |                                                                               |                               Book Quantity                               |                                                                                  The Quantity Book indicates the line count stored in the system for a product in inventory                                                                                   |
|         Quantidade Contada         |      Quantidade      |                      |                            |                                                                               |                             Counted Quantity                              |                                                                                   The Quantity Count indicates the actual inventory count taken for a product in inventory                                                                                    |
|         Qde de Uso Interno         |      Quantidade      |                      |                            |                                                                               |               Internal Use Quantity removed from Inventory                |                                                                                 Quantity of product inventory used internally (positive if taken out - negative if returned)                                                                                  |
|          Nome da Despesa           | Texto Curto (String) |                      |                            |                                                                               |                            Name of the Charge                             |                                                                                                                                                                                                                                                               |
|             Finalidade             |    Tabela Direta     |                      |    ccharge\_iinventory     |                                                                               |                        Additional document charges                        |                                                                                            The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                                                                             |
|             Descrição              | Texto Curto (String) |                      |                            |                                                                               |                 Optional short description of the record                  |                                                                                                          A description is limited to 255 characters.                                                                                                          |
|        Preço de Custo Atual        |        Valor         |                      |                            |                                                                               |                       The currently used cost price                       |                                                                                                                                                                                                                                                               |
|        Cost Adjustment Line        |       Procurar       |   M\_InventoryLine   |  MCostingLine\_IInventory  |                                                                               |           Unique line in an Inventory cost adjustment document            |                                                                      The Cost Adjustment Line indicates the inventory cost adjustment document line (if applicable) for this transaction                                                                      |
|         Importar Estoques          |        Botão         |                      |                            |                                                                               |                                                                           |                                                                                                                                                                                                                                                               |
| Instância do Conjunto de Atributos | Texto Curto (String) |                      |                            |                                                                               |                                                                           |                                                                                                                                                                                                                                                               |

</div>

</div>

  

</div>
