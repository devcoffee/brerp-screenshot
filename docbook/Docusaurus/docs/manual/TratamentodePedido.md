---
title: "Tratamento de Pedido"
id: TratamentodePedido
---
<div id="d250130e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tratamento de Pedido

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tratamento de Pedido -
    COF\_TratamentoPedido](#d250130e23)</span>
  - <span class="section">[2. Tabela: Substituição de Item -
    COF\_ItemSubstituto](#d250130e167)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tratamento de Pedido

<span class="emphasis">*Comentário/Ajuda:* </span>Tratamento de Pedido

<span class="emphasis"> *Criado em:* </span>2018-06-04 16:27:03.0

<span class="emphasis">*Atualizado em:* </span>2018-06-04 16:27:03.0

![](/img/manual/TratamentodePedido.png)

<div id="d250130e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tratamento de Pedido - COF\_TratamentoPedido

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Tratamento de Pedido

<span class="emphasis">*Comentário/Ajuda:* </span> Tratamento de Pedido

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d250130e38" class="table">

<div class="table-title">

Table 1.1. Tratamento de Pedido
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |   Valores (Padrão)   |      Chave restritiva       |                Regra de validação                |                Descrição                 |                                                                                               Comentário/Ajuda                                                                                                |
| :-----------------------: | :------------------: | :------------------: | :-------------------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tratamento de Pedido    |          ID          |                      |                             |                                                  |    Primary Key : Tratamento de Pedido    |                                                                                      Primary Key : Tratamento de Pedido                                                                                       |
| COF\_TratamentoPedido\_UU | Texto Curto (String) |                      |                             |                                                  |                                          |                                                                                                                                                                                                               |
|          Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                              (ver o mesmo acima)                                                                                              |
|        Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                              (ver o mesmo acima)                                                                                              |
|          Pedido           |       Procurar       |                      | COrder\_COFTratamentoPedido |                                                  |                  Order                   | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
|         Descrição         | Texto Curto (String) |                      |                             |                                                  | Optional short description of the record |                                                                                  A description is limited to 255 characters.                                                                                  |
|           Ativo           |       Sim-Não        |         (Y)          |                             |                                                  |    (semelhante ao primeiro relatório)    |                                                                                              (ver o mesmo acima)                                                                                              |

</div>

</div>

  

<div id="d250130e167" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Substituição de Item - COF\_ItemSubstituto

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Itens substitutos para uma
linha de documento.

<span class="emphasis">*Comentário/Ajuda:* </span> Itens substitutos
para uma linha de documento.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250130e182" class="table">

<div class="table-title">

Table 1.2. Substituição de Item
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                                          Regra de validação                                                                          |                                  Descrição                                  |                                                                                                                       Comentário/Ajuda                                                                                                                       |
| :--------------------------: | :------------------: | :------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Pedido            |       Procurar       |                      |    COrder\_COFItemSubstituto    |                                                                                                                                                                      |                                    Order                                    |                        The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled.                         |
|   COF\_ItemSubstituto\_UU    | Texto Curto (String) |                      |                                 |                                                                                                                                                                      |                                                                             |                                                                                                                                                                                                                                                              |
|     Tratamento de Pedido     |    Tabela Direta     |                      | COFTratamentoPedido\_COFItemSub |                                                                                                                                                                      |                     Primary Key : Tratamento de Pedido                      |                                                                                                              Primary Key : Tratamento de Pedido                                                                                                              |
|   COF\_ItemSubstituto\_ID    |          ID          |                      |                                 |                                                                                                                                                                      |                        Primary Key : Item Substituto                        |                                                                                                                Primary Key : Item Substituto                                                                                                                 |
|           Empresa            |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                     (semelhante ao primeiro relatório)                      |                                                                                                                     (ver o mesmo acima)                                                                                                                      |
|         Organização          |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                     (semelhante ao primeiro relatório)                      |                                                                                                                     (ver o mesmo acima)                                                                                                                      |
|            Linha             |       Inteiro        |                      |                                 |                                                                                                                                                                      |                                   Line No                                   |                                                                                                                                                                                                                                                              |
|            Válido            |       Sim-Não        |                      |                                 |                                                                                                                                                                      |                              Element is valid                               |                                                                                                           The element passed the validation check                                                                                                            |
|   Linha de Ordem de Vendas   |    Tabela Direta     |                      |  COrderLine\_COFItemSubstituto  |                                                               C\_OrderLine.C\_Order\_ID=@C\_Order\_ID@                                                               |                              Sales Order Line                               |                                                                                             The Sales Order Line is a unique identifier for a line in an order.                                                                                              |
|           Faturado           |       Sim-Não        |         (N)          |                                 |                                                                                                                                                                      |                                                                             |                                                                                                                                                                                                                                                              |
| Linha de Remessa/Recebimento |       Procurar       |                      |  MInOutLine\_COFItemSubstituto  |                                                                                                                                                                      |                    Line on Shipment or Receipt document                     |                                                                                       The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                                                       |
|      Gerar Nota Fiscal       |       Sim-Não        |         (N)          |                                 |                                                                                                                                                                      |                                                                             |                                                                                                                                                                                                                                                              |
|           Produto            |       Procurar       |                      |   MProduct\_COFItemSubstituto   | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                           Product, Service, Item                            |                                                                                          Identifies an item which is either purchased or sold in this organization.                                                                                          |
|          Quantidade          |      Quantidade      |                      |                                 |                                                                                                                                                                      |                                  Quantity                                   |                                                                                      The Quantity indicates the number of a specific product or item for this document.                                                                                      |
|            Preço             |    Custos+Preços     |                      |                                 |                                                                                                                                                                      |          Price Entered - the price based on the selected/base UoM           |                                                                                        The price entered is converted to the actual price based on the UoM conversion                                                                                        |
|        Quantidade NF         |      Quantidade      |                      |                                 |                                                                                                                                                                      |                                                                             |                                                                                                                                                                                                                                                              |
|        Preço Unitário        |    Custos+Preços     |                      |                                 |                                                                                                                                                                      |                                Actual Price                                 |                                                                                        The Actual or Unit Price indicates the Price for a product in source currency.                                                                                        |
|        Quantidade IS         |      Quantidade      |                      |                                 |                                                                                                                                                                      |                                                                             |                                                                                                                                                                                                                                                              |
|        Valor da Linha        |        Valor         |                      |                                 |                                                                                                                                                                      | Line Extended Amount (Quantity \* Actual Price) without Freight and Charges | Indicates the extended line amount based on the quantity and the actual price. Any additional charges or freight are not included. The Amount may or may not include tax. If the price list is inclusive tax, the line amount is the same as the line total. |
|            Ativo             |       Sim-Não        |         (Y)          |                                 |                                                                                                                                                                      |                     (semelhante ao primeiro relatório)                      |                                                                                                                     (ver o mesmo acima)                                                                                                                      |
|            Fatura            |       Procurar       |                      |   CInvoice\_COFItemSubstituto   |                                                                                                                                                                      |                             Invoice Identifier                              |                                                                                                                    The Invoice Document.                                                                                                                     |

</div>

</div>

  

</div>
