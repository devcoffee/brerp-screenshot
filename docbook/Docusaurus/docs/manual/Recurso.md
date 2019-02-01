---
title: "Recurso"
id: Recurso
---
<div id="d192219e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Recurso

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Recurso -
    S\_Resource](#d192219e22)</span>
  - <span class="section">[2. Tabela: Indisponibilidade -
    S\_ResourceUnAvailable](#d192219e249)</span>
  - <span class="section">[3. Tabela: Produto de Recurso -
    M\_Product](#d192219e423)</span>
  - <span class="section">[4. Tabela: Preço -
    M\_ProductPrice](#d192219e1238)</span>
  - <span class="section">[5. Tabela: Contabilidade -
    M\_Product\_Acct](#d192219e1416)</span>
  - <span class="section">[6. Tabela: Tarefa -
    S\_ResourceAssignment](#d192219e1664)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Recursos

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento dos seus
Recursos. O Produto para o Recurso é automaticamente criado e
sincronizado. Atualize Nome, Unidade de Medida, etc. no Recurso e não o
altere no Produto.

<span class="emphasis"> *Criado em:* </span>2002-06-15 22:20:43.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d192219e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Recurso - S\_Resource

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/S_Resource_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Recursos

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d192219e35" class="table">

<div class="table-title">

Table 1.1. Resource
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   |     Chave restritiva     |                                                          Regra de validação                                                           |                           Descrição                           |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :------------------: | :----------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Recurso        |          ID          |                      |                          |                                                                                                                                       |                           Resource                            |                                                                                                                                              |
| Quantidade Debitável |      Quantidade      |                      |                          |                                                                                                                                       |                                                               |                                                                                                                                              |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                          |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                          |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca    | Texto Curto (String) |                      |                          |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                      |                          |                                                                                                                                       |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                      |                          |                                                                                                                                       |           Optional short description of the record            |                                                 A description is limited to 255 characters.                                                  |
|        Ativo         |       Sim-Não        |         (Y)          |                          |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|   Tipo de Recurso    |    Tabela Direta     |                      | sresourcetype\_sresource |                                                                                                                                       |                                                               |                                                                                                                                              |
|   Usuário/Contato    |    Tabela Direta     |                      |    aduser\_sresource     | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) | User within the system - Internal or Business Partner Contact |                The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|       Armazém        |    Tabela Direta     |                      |  mwarehouse\_sresource   |                                                                                                                                       |              Storage Warehouse and Service Point              |                       The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                        |
|      Disponível      |       Sim-Não        |         (Y)          |                          |                                                                                                                                       |                     Resource is available                     |                                                    Resource is available for assignments                                                     |
|   S\_Resource\_UU    | Texto Curto (String) |                      |                          |                                                                                                                                       |                                                               |                                                                                                                                              |

</div>

</div>

  

<div id="d192219e249" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Indisponibilidade - S\_ResourceUnAvailable

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/S_ResourceUnAvailable_data)

<span class="emphasis">*Descrição:*</span> Indisponibilidade de Recurso

<span class="emphasis">*Comentário/Ajuda:* </span> Datas, quando o
recurso não está disponível (ex. Férias)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d192219e266" class="table">

<div class="table-title">

Table 1.2. Unavailability
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |                Descrição                 |                     Comentário/Ajuda                      |
| :--------------------------: | :------------------: | :----------------: | :------------------------: | :----------------------------------------------: | :--------------------------------------: | :-------------------------------------------------------: |
| Indisponibilidade de Recurso |          ID          |                    |                            |                                                  |                                          |                                                           |
|           Empresa            |    Tabela Direta     | (@AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|         Organização          |    Tabela Direta     |  (@AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|           Recurso            |    Tabela Direta     |                    | sresource\_sresunavailable |                                                  |                 Resource                 |                                                           |
|            Ativo             |       Sim-Não        |        (Y)         |                            |                                                  |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|            Do dia            |         Data         |                    |                            |                                                  |        Starting date for a range         |   The Date From indicates the starting date of a range.   |
|            Ao dia            |         Data         |                    |                            |                                                  |         End date of a date range         | The Date To indicates the end date of a range (inclusive) |
|          Descrição           | Texto Curto (String) |                    |                            |                                                  | Optional short description of the record |        A description is limited to 255 characters.        |
|  S\_ResourceUnAvailable\_UU  | Texto Curto (String) |                    |                            |                                                  |                                          |                                                           |

</div>

</div>

  

<div id="d192219e423" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Produto de Recurso - M\_Product

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Product_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de informação
de Produto de Recurso

<span class="emphasis">*Comentário/Ajuda:* </span> O Produto para o
Recurso é automaticamente criado e sincronizado. Atualize Nome, Unidade
de Medida, etc. no Recurso e não o altere no Produto.

<span class="emphasis">*Coluna linkada:* </span> Resource

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d192219e444" class="table">

<div class="table-title">

Table 1.3. Resource Product
Fields

</div>

<div class="table-contents">

|                    Nome do campo                    |            Referência             |                    Valores (Padrão)                    |      Chave restritiva       |                                         Regra de validação                                          |                                 Descrição                                  |                                                                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                                                                      |
| :-------------------------------------------------: | :-------------------------------: | :----------------------------------------------------: | :-------------------------: | :-------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Modelo de Correspondência              |           Tabela Direta           |                                                        |     rmailtext\_mproduct     |                                                                                                     |                        Text templates for mailings                         | The Mail Template indicates the mail template for return messages. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |
|                       Volume                        |               Valor               |                                                        |                             |                                                                                                     |                            Volume of a product                             |                                                                                                                                                                                                                                       The Volume indicates the volume of the product in the Volume UOM of the Client                                                                                                                                                                                                                                       |
|                        Peso                         |               Valor               |                                                        |                             |                                                                                                     |                            Weight of a product                             |                                                                                                                                                                                                                                       The Weight indicates the weight of the product in the Weight UOM of the Client                                                                                                                                                                                                                                       |
|                Largura da Prateleira                |              Inteiro              |                                                        |                             |                                                                                                     |                            Shelf width required                            |                                                                                                                                                                                                                                      The Shelf Width indicates the width dimension required on a shelf for a product                                                                                                                                                                                                                                       |
|                Altura da Prateleira                 |               Valor               |                                                        |                             |                                                                                                     |                           Shelf height required                            |                                                                                                                                                                                                                                     The Shelf Height indicates the height dimension required on a shelf for a product                                                                                                                                                                                                                                      |
|             Profundidade da Prateleira              |              Inteiro              |                                                        |                             |                                                                                                     |                            Shelf depth required                            |                                                                                                                                                                                                                                      The Shelf Depth indicates the depth dimension required on a shelf for a product                                                                                                                                                                                                                                       |
|                 Unidades por Pallet                 |           Custos+Preços           |                                                        |                             |                                                                                                     |                              Units Per Pallet                              |                                                                                                                                                                                                                                 The Units per Pallet indicates the number of units of this product which fit on a pallet.                                                                                                                                                                                                                                  |
|                 Lista de Materiais                  |              Sim-Não              |                          (N)                           |                             | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                             Bill of Materials                              |                                                                                                                                                                                                                                 The Bill of Materials check box indicates if this product consists of a bill of materials.                                                                                                                                                                                                                                 |
|       Imprimir Registros detalhados na Fatura       |              Sim-Não              |                                                        |                             |                                                                                                     |                  Print detail BOM elements on the invoice                  |                                                                                                                                                                                                                 The Print Details on Invoice indicates that the BOM element products will print on the Invoice as opposed to this product.                                                                                                                                                                                                                 |
| Imprimir registros detalhados na Lista de Separação |              Sim-Não              |                                                        |                             |                                                                                                     |                 Print detail BOM elements on the pick list                 |                                                                                                                                                                                                               The Print Details on Pick List indicates that the BOM element products will print on the Pick List as opposed to this product.                                                                                                                                                                                                               |
|                     Verificado                      |              Sim-Não              |                          (N)                           |                             |                                                                                                     |                  The BOM configuration has been verified                   |                                                                                                                                                                                                   The Verified check box indicates if the configuration of this product has been verified. This is used for products that consist of a bill of materials                                                                                                                                                                                                   |
|             Verificar Estrutura de LDM              |               Botão               |                          (N)                           |                             |                                                                                                     |                                                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                   Tipo de Despesa                   |           Tabela Direta           |                                                        |   sexpensetype\_mproduct    |                                                                                                     |                            Expense report type                             |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                       Recurso                       |           Tabela Direta           |                                                        |     sresource\_mproduct     |                                                                                                     |                                  Resource                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                       Produto                       |                ID                 |                                                        |                             |                                                                                                     |                           Product, Service, Item                           |                                                                                                                                                                                                                                         Identifies an item which is either purchased or sold in this organization.                                                                                                                                                                                                                                         |
|                   Núm. da Versão                    |       Texto Curto (String)        |                                                        |                             |                                                                                                     |                               Version Number                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                  Prazo de Validade                  |              Inteiro              |                                                        |                             |                                                                                                     |           Number of days the product is guaranteed or available            |                                                                                                                                                                                                 If the value is 0, there is no limit to the availability or guarantee, otherwise the guarantee date is calculated by adding the days to the delivery date.                                                                                                                                                                                                 |
|                Conjunto de Atributos                |           Tabela Direta           |                                                        |   mattributeset\_mproduct   |                                                                                                     |                           Product Attribute Set                            |                                                                                                                                                                                       Define Product Attribute Sets to add additional attributes and values to the product. You need to define a Attribute Set if you want to enable Serial and Lot Number tracking.                                                                                                                                                                                       |
|         Instância do Conjunto de Atributos          |        Atributo de Produto        |                                                        |   mattrsetinst\_mproduct    |                                                                                                     |                       Product Attribute Set Instance                       |                                                                                                                                                                                                                      The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                                                                                                                                                                                                      |
|                 Categoria de Frete                  |           Tabela Direta           |                                                        | mfreightcategory\_mproduct  |                                                                                                     |                          Category of the Freight                           |                                                                                                                                                                                                                                       Freight Categories are used to calculate the Freight for the Shipper selected                                                                                                                                                                                                                                        |
|                     Localizador                     |         Locator (Armazém)         |                                                        |     mlocator\_mproduct      |                                                                                                     |                             Warehouse Locator                              |                                                                                                                                                                                                                                              The Locator indicates where in a Warehouse a product is located.                                                                                                                                                                                                                                              |
|               Prazo de Validade Mín.                |              Inteiro              |                                                        |                             |                                                                                                     |                      Minimum number of guarantee days                      |                                                                                                                                                                                                    When selecting batch/products with a guarantee date, the minimum left guarantee days for automatic picking. You can pick any batch/product manually.                                                                                                                                                                                                    |
|          Promovido na Loja Virtual da Web           |              Sim-Não              |                                                        |                             |                                                                                                     |  If selected, the product is displayed in the initial or any empty search  |                                                                                                                                                                                In the display of products in the Web Store, the product is displayed in the initial view or if no search criteria are entered. To be displayed, the product must be in the price list used.                                                                                                                                                                                |
|                    Auto-Serviço                     |              Sim-Não              |                          (Y)                           |                             |                                                                                                     | This is a Self-Service entry or this entry can be changed via Self-Service |                                                                                                                                                                       Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality.                                                                                                                                                                        |
|                 Tipo de Assinatura                  |           Tabela Direta           |                                                        | csubscriptiontype\_mproduct |                                                                                                     |                            Type of subscription                            |                                                                                                                                                                                                                                                          Subscription type and renewal frequency                                                                                                                                                                                                                                                           |
|            Entrega direta ao consumidor             |              Sim-Não              |                                                        |                             |                                                                                                     |      Drop Shipments are sent from the Vendor directly to the Customer      |                                                                                                                                                                                     Drop Shipments do not cause any Inventory reservations or movements as the Shipment is from the Vendor's inventory. The Shipment of the Vendor to the Customer must be confirmed.                                                                                                                                                                                      |
|                      Estocado                       |              Sim-Não              |                          (Y)                           |                             | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                      Organization stocks this product                      |                                                                                                                                                                                                                                      The Stocked check box indicates if this product is stocked by this Organization.                                                                                                                                                                                                                                      |
|                       Empresa                       |           Tabela Direta           |                  (@\#AD\_Client\_ID@)                  |     adclient\_mproduct      |                                  AD\_Client.AD\_Client\_ID \< \> 0                                  |                     (semelhante ao primeiro relatório)                     |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|                     Organização                     |           Tabela Direta           |                   (@\#AD\_Org\_ID@)                    |      ad\_org\_mproduct      |                          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                           |                     (semelhante ao primeiro relatório)                     |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|                   Chave de Busca                    |       Texto Curto (String)        |                                                        |                             | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                     (semelhante ao primeiro relatório)                     |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|                        Nome                         |       Texto Curto (String)        |                                                        |                             | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                   Alphanumeric identifier of the entity                    |                                                                                                                                                                                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                        |
|                      Descrição                      |       Texto Curto (String)        |                                                        |                             | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                  Optional short description of the record                  |                                                                                                                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                                                                                                                         |
|                  Comentário/Ajuda                   | Texto Médio (até 2000 caracteres) |                                                        |                             |                                                                                                     |                              Comment or Hint                               |                                                                                                                                                                                                                                        The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                                                                                                         |
|                  Nota de Documento                  | Texto Médio (até 2000 caracteres) |                                                        |                             |                                                                                                     |                   Additional information for a Document                    |                                                                                                                                                                                                                                 The Document Note is used for recording any additional information regarding this product.                                                                                                                                                                                                                                 |
|                       UPC/EAN                       |       Texto Curto (String)        |                       (SEM GTIN)                       |                             |                                                                                                     | Bar Code (Universal Product Code or its superset European Article Number)  |                                                                                                                                               Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode)                                                                                                                                                |
|                         UCE                         |       Texto Curto (String)        |                                                        |                             |                                                                                                     |                             Stock Keeping Unit                             |                                                                                                                                                                                                                 The SKU indicates a user defined stock keeping unit. It may be used for an additional bar code symbols or your own schema.                                                                                                                                                                                                                 |
|                        Ativo                        |              Sim-Não              |                          (Y)                           |                             |                                                                                                     |                     (semelhante ao primeiro relatório)                     |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|                   Nível de Resumo                   |              Sim-Não              |                                                        |                             |                                                                                                     |                          This is a summary entity                          |                                                                                                                                                                                                        A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                                                                                                                                                         |
|                Categoria de Produto                 |           Tabela Direta           |                  M\_Product Category                   | mproduct\_mproductcategory  | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                           Category of a Product                            |                                                                                                                                                                                                                       Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                                                                                                                                                                                        |
|                    Classificação                    |       Texto Curto (String)        |                                                        |                             |                                                                                                     |                        Classification for grouping                         |                                                                                                                                                                                                                                                The Classification can be used to optionally group products.                                                                                                                                                                                                                                                |
|                Categoria de Imposto                 |           Tabela Direta           |                                                        |   ctaxcategory\_mproduct    | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                                Tax Category                                |                                                                                                                                                                                                                          The Tax Category provides a method of grouping similar taxes. For example, Sales Tax or Value Added Tax.                                                                                                                                                                                                                          |
|             Reconhecimento de Receitas              |           Tabela Direta           |                                                        |  crevrecognition\_mproduct  |                                                                                                     |                        Method for recording revenue                        |                                                                                                                                                                                                                                     The Revenue Recognition indicates how revenue will be recognized for this product                                                                                                                                                                                                                                      |
|                         UDM                         |           Tabela Direta           |                                                        |       cuom\_mproduct        | <span class="emphasis">*ReadOnly Logic*</span>: @ProductType@=R | @ProductType@=E | @ProductType@=O |                              Unit of Measure                               |                                                                                                                                                                                                                                                   The UOM defines a unique non monetary Unit of Measure                                                                                                                                                                                                                                                    |
|               Representante de Vendas               |              Tabela               |                  AD\_User - SalesRep                   |     salesrep\_mproduct      |                                                                                                     |                   Sales Representative or Company Agent                    |                                                                                                                                                                                                                       The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                                                                                                                                                                                                       |
|                   Tipo de Produto                   |               Lista               | Ativo Tipo de Despesa Item Online Recurso Serviços (I) |                             |                                                                                                     |                              Type of product                               |                                                                                                                                                                                                                                                The type of product also determines accounting consequences.                                                                                                                                                                                                                                                |
|                      Comprado                       |              Sim-Não              |                          (Y)                           |                             |                                                                                                     |                    Organization purchases this product                     |                                                                                                                                                                                                                                    The Purchased check box indicates if this product is purchased by this organization.                                                                                                                                                                                                                                    |
|                       Vendido                       |              Sim-Não              |                          (Y)                           |                             |                                                                                                     |                      Organization sells this product                       |                                                                                                                                                                                                                                         The Sold check box indicates if this product is sold by this organization.                                                                                                                                                                                                                                         |
|                    Descontinuado                    |              Sim-Não              |                                                        |                             |                                                                                                     |                    This product is no longer available                     |                                                                                                                                                                                                                                         The Discontinued check box indicates a product that has been discontinued.                                                                                                                                                                                                                                         |
|                  Descontinuado Em                   |               Data                |                                                        |                             |                                                                                                     |        Discontinued At indicates Date when product was discontinued        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                    URL da Imagem                    |                URL                |                                                        |                             |                                                                                                     |                                URL of image                                |                                                                                                                                                                                                                   URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.                                                                                                                                                                                                                    |
|                  URL da Descrição                   |                URL                |                                                        |                             |                                                                                                     |                          URL for the description                           |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                   M\_Product\_UU                    |       Texto Curto (String)        |                                                        |                             |                                                                                                     |                                                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d192219e1238" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Preço - M\_ProductPrice

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_ProductPrice_data)

<span class="emphasis">*Descrição:*</span> Formação de Preços de Recurso

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Formação de
Preços" mostra a Lista, Preços Normais e Preços Limite para cada lista
de preço em que um recurso estiver incluído.

<span class="emphasis">*Coluna linkada:* </span> Product

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d192219e1259" class="table">

<div class="table-title">

Table 1.4. Price
Fields

</div>

<div class="table-contents">

|      Nome do campo       |  Referência   |  Valores (Padrão)  |       Chave restritiva       |                                                                          Regra de validação                                                                          |                        Descrição                        |                                                     Comentário/Ajuda                                                     |
| :----------------------: | :-----------: | :----------------: | :--------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
|         Empresa          | Tabela Direta | (@AD\_Client\_ID@) |                              |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |           (semelhante ao primeiro relatório)            |                                                   (ver o mesmo acima)                                                    |
|       Organização        | Tabela Direta |  (@AD\_Org\_ID@)   |                              |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |           (semelhante ao primeiro relatório)            |                                                   (ver o mesmo acima)                                                    |
|         Produto          |   Procurar    |                    |   mproduct\_mproductprice    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                 Product, Service, Item                  |                        Identifies an item which is either purchased or sold in this organization.                        |
| Versão da Lista de Preço | Tabela Direta |                    | mpricelistver\_mproductprice |                                                                                                                                                                      |      Identifies a unique instance of a Price List       | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|          Ativo           |    Sim-Não    |        (Y)         |                              |                                                                                                                                                                      |           (semelhante ao primeiro relatório)            |                                                   (ver o mesmo acima)                                                    |
|      Preço de Lista      | Custos+Preços |                    |                              |                                                                                                                                                                      |                       List Price                        |                           The List Price is the official List Price in the document currency.                            |
|       Preço Padrão       | Custos+Preços |                    |                              |                                                                                                                                                                      |                     Standard Price                      |                The Standard Price indicates the standard or normal price for a product on this price list                |
|       Preço Limite       | Custos+Preços |                    |                              |                                                                                                                                                                      |               Lowest price for a product                |               The Price Limit indicates the lowest price for a product stated in the Price List Currency.                |
|      Product Price       |      ID       |                    |                              |                                                                                                                                                                      | Intersection between a Product and a Price List Version |                                                                                                                          |

</div>

</div>

  

<div id="d192219e1416" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Contabilidade - M\_Product\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Product_Acct_data)

<span class="emphasis">*Descrição:*</span> Definir Parâmetros Contábeis

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
define os padrões a serem usados ao gerar transações contábeis para
pedidos e faturas que envolvam este recurso. Nem todas as contas se
aplicam aos recursos.

<span class="emphasis">*Coluna linkada:* </span> Product

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d192219e1437" class="table">

<div class="table-title">

Table 1.5. Accounting
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |  Valores (Padrão)  |       Chave restritiva        |                Regra de validação                |                         Descrição                         |                                                              Comentário/Ajuda                                                               |
| :--------------------------: | :------------------: | :----------------: | :---------------------------: | :----------------------------------------------: | :-------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------: |
|           Empresa            |    Tabela Direta     | (@AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |            (semelhante ao primeiro relatório)             |                                                             (ver o mesmo acima)                                                             |
|         Organização          |    Tabela Direta     |  (@AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |            (semelhante ao primeiro relatório)             |                                                             (ver o mesmo acima)                                                             |
|           Produto            |    Tabela Direta     |                    | m\_product\_m\_product\_acct  |                                                  |                  Product, Service, Item                   |                                 Identifies an item which is either purchased or sold in this organization.                                  |
|       Esquema Contábil       |    Tabela Direta     |                    |   cacctschema\_mproductacct   |                                                  |                   Rules for accounting                    |                   An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                   |
|            Ativo             |       Sim-Não        |        (Y)         |                               |                                                  |            (semelhante ao primeiro relatório)             |                                                             (ver o mesmo acima)                                                             |
|    Patrimônio de Produto     |        Conta         |                    |     vc\_passet\_mproduct      |                                                  |           Account for Product Asset (Inventory)           |                        The Product Asset Account indicates the account used for valuing this a product in inventory.                        |
|      Despesa de Produto      |        Conta         |                    |    vc\_pexpense\_mproduct     |                                                  |                Account for Product Expense                |                   The Product Expense Account indicates the account used to record expenses associated with this product.                   |
|        CMV de Produto        |        Conta         |                    |      vc\_pcogs\_mproduct      |                                                  |              Account for Cost of Goods Sold               |                   The Product COGS Account indicates the account used when recording costs associated with this product.                    |
| Variação do Preço de Compra  |        Conta         |                    |   vc\_ppurchasepv\_mproduct   |                                                  | Difference between Standard Cost and Purchase Price (PPV) | The Purchase Price Variance is used in Standard Costing. It reflects the difference between the Standard Cost and the Purchase Order Price. |
| Variação de Preço da Fatura  |        Conta         |                    |   vc\_pinvoicepv\_mproduct    |                                                  |     Difference between Costs and Invoice Price (IPV)      |                 The Invoice Price Variance is used reflects the difference between the current Costs and the Invoice Price.                 |
| Desconto Comercial Recebido  |        Conta         |                    |  vc\_ptdiscountrec\_mproduct  |                                                  |             Trade Discount Receivable Account             |                The Trade Discount Receivables Account indicates the account for received trade discounts in vendor invoices                 |
| Desconto Comercial Concedido |        Conta         |                    | vc\_ptdiscountgrant\_mproduct |                                                  |              Trade Discount Granted Account               |                    The Trade Discount Granted Account indicates the account for granted trade discount in sales invoices                    |
|      Receita de Produto      |        Conta         |                    |    vc\_prevenue\_mproduct     |                                                  |        Account for Product Revenue (Sales Account)        |                    The Product Revenue Account indicates the account used for recording sales revenue for this product.                     |
|     M\_Product\_Acct\_UU     | Texto Curto (String) |                    |                               |                                                  |                                                           |                                                                                                                                             |

</div>

</div>

  

<div id="d192219e1664" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Tarefa - S\_ResourceAssignment

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/S_ResourceAssignment_data)

<span class="emphasis">*Descrição:*</span> Atribuições de Recurso

<span class="emphasis">*Comentário/Ajuda:* </span> Histórico de
Atribuições

<span class="emphasis">*Coluna linkada:* </span> Resource

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d192219e1685" class="table">

<div class="table-title">

Table 1.6. Assignment
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |  Valores (Padrão)  |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------------: | :------------------: | :----------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Atribuição de Recurso   |          ID          |                    |                                |                                                  |           Resource Assignment            |                                                                                                                                              |
|          Empresa          |    Tabela Direta     | (@AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Organização        |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Recurso          |    Tabela Direta     |                    | sresource\_sresourceassignment |                                                  |                 Resource                 |                                                                                                                                              |
|           Ativo           |       Sim-Não        |        (Y)         |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Atribuir desde       |      Data+Hora       |                    |                                |                                                  |           Assign resource from           |                                                               Assignment start                                                               |
|       Atribuir até        |      Data+Hora       |                    |                                |                                                  |          Assign resource until           |                                                                Assignment end                                                                |
|        Quantidade         |      Quantidade      |                    |                                |                                                  |                 Quantity                 |                              The Quantity indicates the number of a specific product or item for this document.                              |
|        Confirmado         |       Sim-Não        |                    |                                |                                                  |         Assignment is confirmed          |                                                       Resource assignment is confirmed                                                       |
|           Nome            | Texto Curto (String) |                    |                                |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição         | Texto Curto (String) |                    |                                |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| S\_ResourceAssignment\_UU | Texto Curto (String) |                    |                                |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
