---
title: "Instância do Conjunto de Atributos"
id: InstanciadoConjuntodeAtributos
---
<div id="d129581e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Instância do Conjunto de Atributos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Instância -
    M\_AttributeSetInstance](#d129581e23)</span>
  - <span class="section">[2. Tabela: Remessa, Recebimento -
    M\_InOutLineMA\_v](#d129581e219)</span>
  - <span class="section">[3. Tabela: Movimentação -
    M\_MovementLineMA\_v](#d129581e402)</span>
  - <span class="section">[4. Tabela: Fatura -
    RV\_C\_InvoiceLine](#d129581e600)</span>

</div>

<span class="emphasis">*Descrição:* </span> Visualizar Detalhes da
Instância do Conjunto de Atributos e utilizar

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2005-09-12 14:49:42.0

<span class="emphasis">*Atualizado em:* </span>2005-09-12 14:49:42.0

![](/img/manual/InstanciadoConjuntodeAtributos.png)

<div id="d129581e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Instância - M\_AttributeSetInstance

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_AttributeSetInstance_data)

<span class="emphasis">*Descrição:*</span> Instância do Conjunto de
Atributos

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d129581e36" class="table">

<div class="table-title">

Table 1.1. Instance
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      | Valores (Padrão) |       Chave restritiva        |                                                Regra de validação                                                |                Descrição                 |                                                                                Comentário/Ajuda                                                                                |
| :--------------------------------: | :------------------: | :--------------: | :---------------------------: | :--------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|               Ativo                |       Sim-Não        |       (Y)        |                               |                                                                                                                  |    (semelhante ao primeiro relatório)    |                                                                              (ver o mesmo acima)                                                                               |
|              Empresa               |    Tabela Direta     |                  |                               |                                        AD\_Client.AD\_Client\_ID \< \> 0                                         |    (semelhante ao primeiro relatório)    |                                                                              (ver o mesmo acima)                                                                               |
|            Organização             |    Tabela Direta     |                  |                               |                                 (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                 |    (semelhante ao primeiro relatório)    |                                                                              (ver o mesmo acima)                                                                               |
| Instância do Conjunto de Atributos |          ID          |                  |                               |                                                                                                                  |      Product Attribute Set Instance      |                                The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                |
|       Conjunto de Atributos        |    Tabela Direta     |                  | mattributeset\_mattribsetinst |                                                                                                                  |          Product Attribute Set           | Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking. |
|             Descrição              | Texto Curto (String) |                  |                               |                                                                                                                  | Optional short description of the record |                                                                  A description is limited to 255 characters.                                                                   |
|                Lote                |       Procurar       |                  |  mlot\_mattributesetinstance  | M\_Lot.M\_Product\_ID IN (SELECT M\_Product\_ID FROM M\_Product WHERE M\_AttributeSet\_ID=@M\_AttributeSet\_ID@) |          Product Lot Definition          |                                                                        The individual Lot of a Product                                                                         |
|             Lote Núm.              | Texto Curto (String) |                  |                               |                                                                                                                  |        Lot number (alphanumeric)         |                                                     The Lot Number indicates the specific lot that a product was part of.                                                      |
|       Vencimento da Garantia       |         Data         |                  |                               |                                                                                                                  |       Date when guarantee expires        |                                                             Date when the normal guarantee or availability expires                                                             |
|             Núm. Série             | Texto Curto (String) |                  |                               |                                                                                                                  |          Product Serial Number           |                                     The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                                     |
|    M\_AttributeSetInstance\_UU     | Texto Curto (String) |                  |                               |                                                                                                                  |                                          |                                                                                                                                                                                |

</div>

</div>

  

<div id="d129581e219" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Remessa, Recebimento - M\_InOutLineMA\_v

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linhas de Recebimento e
Entrega de Material

<span class="emphasis">*Coluna linkada:* </span> Attribute Set Instance

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d129581e234" class="table">

<div class="table-title">

Table 1.2. Shipment, Receipt
Fields

</div>

<div class="table-contents">

|           Nome do campo            |     Referência      | Valores (Padrão) | Chave restritiva |        Regra de validação         |              Descrição               |                                                 Comentário/Ajuda                                                 |
| :--------------------------------: | :-----------------: | :--------------: | :--------------: | :-------------------------------: | :----------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
|               Ativo                |       Sim-Não       |                  |                  |                                   |  (semelhante ao primeiro relatório)  |                                               (ver o mesmo acima)                                                |
|              Empresa               |    Tabela Direta    |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |  (semelhante ao primeiro relatório)  |                                               (ver o mesmo acima)                                                |
|            Organização             |    Tabela Direta    |                  |                  |                                   |  (semelhante ao primeiro relatório)  |                                               (ver o mesmo acima)                                                |
| Instância do Conjunto de Atributos | Atributo de Produto |                  |                  |                                   |    Product Attribute Set Instance    | The values of the actual Product Attribute Instances. The product level attributes are defined on Product level. |
|               Recibo               |      Procurar       |                  |                  |                                   |      Material Shipment Document      |                                         The Material Shipment / Receipt                                          |
|        Linha de Recebimento        |      Procurar       |                  |                  |                                   | Line on Shipment or Receipt document |                 The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                 |
|             Linha Núm.             |       Inteiro       |                  |                  |                                   |    Unique line for this document     | Indicates the unique line for a document. It will also control the display order of the lines within a document. |
|            Localizador             |      Procurar       |                  |                  |                                   |          Warehouse Locator           |                         The Locator indicates where in a Warehouse a product is located.                         |
|              Produto               |      Procurar       |                  |                  |                                   |        Product, Service, Item        |                    Identifies an item which is either purchased or sold in this organization.                    |
|       Quantidade Movimentada       |     Quantidade      |                  |                  |                                   |     Quantity of a product moved.     |                  The Movement Quantity indicates the quantity of a product that has been moved.                  |

</div>

</div>

  

<div id="d129581e402" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Movimentação - M\_MovementLineMA\_v

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linhas de Movimentação de
Material

<span class="emphasis">*Coluna linkada:* </span> Attribute Set Instance

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d129581e417" class="table">

<div class="table-title">

Table 1.3. Movement
Fields

</div>

<div class="table-contents">

|           Nome do campo            |     Referência      | Valores (Padrão) | Chave restritiva |        Regra de validação         |             Descrição              |                                                 Comentário/Ajuda                                                 |
| :--------------------------------: | :-----------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
|               Ativo                |       Sim-Não       |                  |                  |                                   | (semelhante ao primeiro relatório) |                                               (ver o mesmo acima)                                                |
|              Empresa               |    Tabela Direta    |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 | (semelhante ao primeiro relatório) |                                               (ver o mesmo acima)                                                |
|            Organização             |    Tabela Direta    |                  |                  |                                   | (semelhante ao primeiro relatório) |                                               (ver o mesmo acima)                                                |
| Instância do Conjunto de Atributos | Atributo de Produto |                  |                  |                                   |   Product Attribute Set Instance   | The values of the actual Product Attribute Instances. The product level attributes are defined on Product level. |
|      Movimentação de Estoque       |      Procurar       |                  |                  |                                   |       Movement of Inventory        |                      The Inventory Movement uniquely identifies a group of movement lines.                       |
|         Linha de Movimento         |      Procurar       |                  |                  |                                   |    Inventory Move document Line    |      The Movement Line indicates the inventory movement document line (if applicable) for this transaction       |
|             Linha Núm.             |       Inteiro       |                  |                  |                                   |   Unique line for this document    | Indicates the unique line for a document. It will also control the display order of the lines within a document. |
|            Localizador             |    Tabela Direta    |                  |                  |                                   |         Warehouse Locator          |                         The Locator indicates where in a Warehouse a product is located.                         |
|       Localizador de Destino       |       Tabela        |    M\_Locator    |                  |                                   |   Location inventory is moved to   |                   The Locator To indicates the location where the inventory is being moved to.                   |
|              Produto               |      Procurar       |                  |                  |                                   |       Product, Service, Item       |                    Identifies an item which is either purchased or sold in this organization.                    |
|       Quantidade Movimentada       |     Quantidade      |                  |                  |                                   |    Quantity of a product moved.    |                  The Movement Quantity indicates the quantity of a product that has been moved.                  |

</div>

</div>

  

<div id="d129581e600" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Fatura - RV\_C\_InvoiceLine

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linhas de Faturas AP / AR

<span class="emphasis">*Coluna linkada:* </span> Attribute Set Instance

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d129581e615" class="table">

<div class="table-title">

Table 1.4. Invoice
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |                                                                 Valores (Padrão)                                                                  | Chave restritiva |                Regra de validação                |                                  Descrição                                  |                                                                                                                       Comentário/Ajuda                                                                                                                       |
| :--------------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Valor da Margem           |        Valor         |                                                                                                                                                   |                  |                                                  |    Difference between actual and limit price multiplied by the quantity     |                                                                         The margin amount is calculated as the difference between actual and limit price multiplied by the quantity                                                                          |
|      Valor da Lista de Linha       |        Valor         |                                                                                                                                                   |                  |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|       Valor Limite da Linha        |        Valor         |                                                                                                                                                   |                  |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|         Desconto da Linha          |        Valor         |                                                                                                                                                   |                  |                                                  |                            Line Discount Amount                             |                                                                                                      Indicates the discount for this line as an amount.                                                                                                      |
|            Margem Bruta            |        Número        |                                                                                                                                                   |                  |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|               Preço                |    Custos+Preços     |                                                                                                                                                   |                  |                                                  |          Price Entered - the price based on the selected/base UoM           |                                                                                        The price entered is converted to the actual price based on the UoM conversion                                                                                        |
|             Quantidade             |      Quantidade      |                                                                                                                                                   |                  |                                                  |              The Quantity Entered is based on the selected UoM              |                                                                                                The Quantity Entered is converted to base product UoM quantity                                                                                                |
|        Transação de Vendas         |       Sim-Não        |                                                                                                                                                   |                  |                                                  |                         This is a Sales Transaction                         |                                                                                        The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                                         |
|         Tipo de Documento          |    Tabela Direta     |                                                                                                                                                   |                  |                                                  |                           Document type or rules                            |                                                                                             The Document Type determines document sequence and processing rules                                                                                              |
|        Estado do Documento         |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |                  |                                                  |                     The current status of the document                      |                                                        The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                         |
|        Atributo de Produto         | Texto Curto (String) |                                                                                                                                                   |                  |                                                  |                   Product Attribute Instance Description                    |                                                                                                                                                                                                                                                              |
|       Conjunto de Atributos        |    Tabela Direta     |                                                                                                                                                   |                  |                                                  |                            Product Attribute Set                            |                                        Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking.                                        |
|       Vencimento da Garantia       |         Data         |                                                                                                                                                   |                  |                                                  |                         Date when guarantee expires                         |                                                                                                    Date when the normal guarantee or availability expires                                                                                                    |
|        Agente da Companhia         |        Tabela        |                                                                AD\_User - SalesRep                                                                |                  |                                                  |                    Sales Representative or Company Agent                    |                                                                        The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                                                        |
|         Grupo de Parceiros         |    Tabela Direta     |                                                                                                                                                   |                  |                                                  |                           Business Partner Group                            |                                                                        The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.                                                                        |
|        Categoria de Produto        |    Tabela Direta     |                                                                                                                                                   |                  |                                                  |                            Category of a Product                            |                                                                        Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                                         |
|           Data Faturada            |         Data         |                                                                                                                                                   |                  |                                                  |                           Date printed on Invoice                           |                                                                                                 The Date Invoice indicates the date printed on the invoice.                                                                                                  |
|           Data da Conta            |         Data         |                                                                                                                                                   |                  |                                                  |                               Accounting Date                               |                                              The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                              |
|           Preço de Lista           |    Custos+Preços     |                                                                                                                                                   |                  |                                                  |                                 List Price                                  |                                                                                             The List Price is the official List Price in the document currency.                                                                                              |
|            Preço Limite            |    Custos+Preços     |                                                                                                                                                   |                  |                                                  |                         Lowest price for a product                          |                                                                                 The Price Limit indicates the lowest price for a product stated in the Price List Currency.                                                                                  |
|             Desconto %             |       Inteiro        |                                                                                                                                                   |                  |                                                  |                             Discount in percent                             |                                                                                            The Discount indicates the discount applied or taken as a percentage.                                                                                             |
|              Margem %              |        Número        |                                                                                                                                                   |                  |                                                  |                    Margin for a product as a percentage                     |                                                                            The Margin indicates the margin for this product as a percentage of the limit price and selling price.                                                                            |
|           Valor da Linha           |        Valor         |                                                                                                                                                   |                  |                                                  | Line Extended Amount (Quantity \* Actual Price) without Freight and Charges | Indicates the extended line amount based on the quantity and the actual price. Any additional charges or freight are not included. The Amount may or may not include tax. If the price list is inclusive tax, the line amount is the same as the line total. |
|              Empresa               |    Tabela Direta     |                                                                                                                                                   |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                      |                                                                                                                     (ver o mesmo acima)                                                                                                                      |
|            Organização             |    Tabela Direta     |                                                                                                                                                   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                      |                                                                                                                     (ver o mesmo acima)                                                                                                                      |
| Instância do Conjunto de Atributos |       Procurar       |                                                                                                                                                   |                  |                                                  |                       Product Attribute Set Instance                        |                                                                       The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                                                       |
|               Fatura               |       Procurar       |                                                                                                                                                   |                  |                                                  |                             Invoice Identifier                              |                                                                                                                    The Invoice Document.                                                                                                                     |
|          Linha de Fatura           |       Procurar       |                                                                                                                                                   |                  |                                                  |                             Invoice Detail Line                             |                                                                                              The Invoice Line uniquely identifies a single line of an Invoice.                                                                                               |
|              Produto               |       Procurar       |                                                                                                                                                   |                  |                                                  |                           Product, Service, Item                            |                                                                                          Identifies an item which is either purchased or sold in this organization.                                                                                          |
|        Quantidade Faturada         |      Quantidade      |                                                                                                                                                   |                  |                                                  |                              Invoiced Quantity                              |                                                                                      The Invoiced Quantity indicates the quantity of a product that have been invoiced.                                                                                      |
|        Parceiro de Negócios        |       Procurar       |                                                                                                                                                   |                  |                                                  |                        Identifies a Business Partner                        |                                                                       A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                        |
|           Preço Unitário           |    Custos+Preços     |                                                                                                                                                   |                  |                                                  |                                Actual Price                                 |                                                                                        The Actual or Unit Price indicates the Price for a product in source currency.                                                                                        |
|             Lote Núm.              | Texto Curto (String) |                                                                                                                                                   |                  |                                                  |                          Lot number (alphanumeric)                          |                                                                                            The Lot Number indicates the specific lot that a product was part of.                                                                                             |
|                Lote                |    Tabela Direta     |                                                                                                                                                   |                  |                                                  |                           Product Lot Definition                            |                                                                                                               The individual Lot of a Product                                                                                                                |
|             Núm. Série             | Texto Curto (String) |                                                                                                                                                   |                  |                                                  |                            Product Serial Number                            |                                                                            The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                                                                            |

</div>

</div>

  

</div>
