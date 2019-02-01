---
title: "Atividade"
id: Atividade
---
<div id="d8944e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Atividade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Atividade -
    COF\_Activity](#d8944e22)</span>
  - <span class="section">[2. Tabela: Últimos Pedidos -
    C\_Order](#d8944e416)</span>
  - <span class="section">[3. Tabela: Order Line -
    C\_OrderLine](#d8944e543)</span>
  - <span class="section">[4. Tabela: Itens em Aberto -
    RV\_OpenItem](#d8944e708)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-10-04 22:23:54.0

<span class="emphasis">*Atualizado em:* </span>2017-05-31 14:59:21.0

<div id="d8944e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Atividade - COF\_Activity

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d8944e29" class="table">

<div class="table-title">

Table 1.1. Activity
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |                                              Valores (Padrão)                                               |        Chave restritiva        |                                                                                Regra de validação                                                                                 |                           Descrição                           |                                                Comentário/Ajuda                                                 |
| :---------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------------------: | :----------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|       Processado        |              Sim-Não              |                                                     (N)                                                     |                                |                                                                                                                                                                                   |                The document has been processed                |                      The Processed checkbox indicates that a document has been processed.                       |
|          Ativo          |              Sim-Não              |                                                     (Y)                                                     |                                |                                                                                                                                                                                   |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|        Atividade        |                ID                 |                                                                                                             |                                |                                                                                                                                                                                   |                                                               |                                                                                                                 |
|         Empresa         |           Tabela Direta           |                                            (@\#AD\_Client\_ID@)                                             |                                |                                                                         AD\_Client.AD\_Client\_ID \< \> 0                                                                         |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|       Organização       |           Tabela Direta           |                                              (@\#AD\_Org\_ID@)                                              |                                |                                                                 (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                  |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|     Chave de Busca      |       Texto Curto (String)        |                                                                                                             |                                |                                                                                                                                                                                   |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|         Código          |       Texto Curto (String)        |                                                                                                             |                                |                                                                                                                                                                                   |                                                               |                                                                                                                 |
| Representante de Vendas |              Tabela               |                                             AD\_User - SalesRep                                             |     salesrep\_cofactivity      |                                                                                                                                                                                   |             Sales Representative or Company Agent             | The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.  |
|        Lembrete         |               Lista               | 1 Minuto Antes 5 Minutos Antes 10 Minutos Antes 15 Minutos Antes 1 Hora Antes 30 Minutos Antes Nunca ('NN') |                                |                                                                                                                                                                                   |                                                               |                                                                                                                 |
|         Assunto         |       Texto Curto (String)        |                                                                                                             |                                |                                                                                                                                                                                   |                     Email Message Subject                     |                                              Subject of the EMail                                               |
|        Descrição        |       Texto Curto (String)        |                                                                                                             |                                |                                                                                                                                                                                   |           Optional short description of the record            |                                   A description is limited to 255 characters.                                   |
|     Data de Início      |             Data+Hora             |                                                                                                             |                                |                                                                                                                                                                                   |                First effective day (inclusive)                |                               The Start Date indicates the first or starting date                               |
|       Data Final        |             Data+Hora             |                                                                                                             |                                |                                                                                                                                                                                   |                Last effective date (inclusive)                |                               The End Date indicates the last date in this range.                               |
|    Tipo de Atividade    |           Tabela Direta           |                                                                                                             |  cofactivitytype\_cofactivity  |                                                                                                                                                                                   |                                                               |                                                                                                                 |
|   Estado da Atividade   |           Tabela Direta           |                                                                                                             |                                | COF\_Activity\_Status.COF\_Activity\_Type\_ID = @COF\_Activity\_Type\_ID@ AND (@COF\_Activity\_ID@ \> 0 OR (@COF\_Activity\_ID@ \< = 0 AND COF\_Activity\_Status.IsClosed = 'N')) |                                                               |                                                                                                                 |
|    Ação de Atividade    |           Tabela Direta           |                                                                                                             | cofactivityaction\_cofactivity |                                                                                                                                                                                   |                                                               |                                                                                                                 |
|  Estado de Fechamento   |              Sim-Não              |                                                     (N)                                                     |                                |                                                                                                                                                                                   |                     The status is closed                      |                                   This allows to have multiple closed status                                    |
|          Lead           |             Procurar              |                                            AD\_User - Sales Lead                                            |                                |                                                                                                                                                                                   |                                                               |                                                                                                                 |
|  Parceiro de Negócios   |             Procurar              |                                            C\_BPartner Customers                                            |                                |                                                                                                                                                                                   |                 Identifies a Business Partner                 | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
| Localização do Parceiro |           Tabela Direta           |                                                                                                             | CBPartnerLocation\_COFActivity |                                                              C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@                                                              |  Identifies the (ship to) address for this Business Partner   |                        The Partner address indicates the location of a Business Partner                         |
|     Usuário/Contato     |             Procurar              |                                                                                                             |      aduser\_cofactivity       |                                                                    AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@                                                                     | User within the system - Internal or Business Partner Contact |  The User identifies a unique user in the system. This could be an internal user or a business partner contact  |
| Oportunidade de Vendas  |             Procurar              |                                                                                                             |   COpportunity\_COFActivity    |                                               C\_Opportunity.C\_BPartner\_ID = @C\_BPartner\_ID@ AND C\_Opportunity.IsClosed = 'N'                                                |                                                               |                                                                                                                 |
|       Comentários       | Texto Médio (até 2000 caracteres) |                                                                                                             |                                |                                                                                                                                                                                   |              Comments or additional information               |                    The Comments field allows for free form entry of additional information.                     |
|   Posição Financeira    |               Botão               |                                                                                                             |                                |                                                                                                                                                                                   |                                                               |                                                                                                                 |
|   Reativar Atividade    |               Botão               |                                                                                                             |                                |                                                                                                                                                                                   |                                                               |                                                                                                                 |

</div>

</div>

  

<div id="d8944e416" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Últimos Pedidos - C\_Order

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Order_data)

<span class="emphasis">*Claúsula Where:*</span>
C\_Order.C\_BPartner\_ID=@C\_BPartner\_ID@

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d8944e429" class="table">

<div class="table-title">

Table 1.2. Last Orders
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência             |                                                                    Valores (Padrão)                                                                    | Chave restritiva | Regra de validação |                Descrição                 |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-----------------: | :-------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Pedido        |                ID                 |                                                                                                                                                        |                  |                    |                  Order                   |                                                                                                                                                                                                                                                          The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled.                                                                                                                                                                                                                                                          |
| Número do Documento |       Texto Curto (String)        |                                                                                                                                                        |                  |                    | Document sequence number of the document | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
| Estado do Documento |               Lista               | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                  |                    |    The current status of the document    |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|   Data do Pedido    |               Data                |                                                                       (@\#Date@)                                                                       |                  |                    |              Date of Order               |                                                                                                                                                                                                                                                                                                                                             Indicates the Date an item was ordered.                                                                                                                                                                                                                                                                                                                                             |
|     Total Geral     |               Valor               |                                                                                                                                                        |                  |                    |         Total amount of document         |                                                                                                                                                                                                                                                                                                                    The Grand Total displays the total amount including Tax and Freight in document currency                                                                                                                                                                                                                                                                                                                     |
|      Descrição      | Texto Médio (até 2000 caracteres) |                                                                                                                                                        |                  |                    | Optional short description of the record |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d8944e543" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Order Line - C\_OrderLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_OrderLine_data)

<span class="emphasis">*Claúsula Where:*</span>
C\_OrderLine.C\_Order\_ID=@C\_Order\_ID@

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d8944e556" class="table">

<div class="table-title">

Table 1.3. Order Line
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |                                              Valores (Padrão)                                              |    Chave restritiva    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Regra de validação                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                  Descrição                                  |                                                                                                                       Comentário/Ajuda                                                                                                                       |
| :-----------------: | :-----------: | :--------------------------------------------------------------------------------------------------------: | :--------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Produto       |   Procurar    |                                                                                                            |  mproduct\_corderline  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) <span class="emphasis">*ReadOnly Logic*</span>: @S\_ResourceAssignment\_ID@\!0 | @C\_Charge\_ID@\!0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                           Product, Service, Item                            |                                                                                          Identifies an item which is either purchased or sold in this organization.                                                                                          |
|     Linha Núm.      |    Inteiro    | (@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C\_OrderLine WHERE C\_Order\_ID=@C\_Order\_ID@) |                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                        Unique line for this document                        |                                                                       Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                       |
|         UDM         | Tabela Direta |                                              (@\#C\_UOM\_ID@)                                              |    cuom\_corderline    | ( EXISTS ( /\* UOM is a default UOM and no product selected \*/ SELECT \* FROM C\_UOM uu WHERE C\_UOM.C\_UOM\_ID=uu.C\_UOM\_ID AND IsActive ='Y' AND IsDefault='Y' AND @M\_Product\_ID@=0 ) OR EXISTS ( /\* UOM is the products UOM \*/ SELECT \* FROM M\_Product p WHERE C\_UOM.C\_UOM\_ID=p.C\_UOM\_ID AND @M\_Product\_ID@=p.M\_Product\_ID ) OR EXISTS ( /\* For the products UOM there is a conversion that is explicitly bound to the product \*/ SELECT \* FROM M\_Product p INNER JOIN C\_UOM\_Conversion c ON (p.C\_UOM\_ID=c.C\_UOM\_ID AND p.M\_PRODUCT\_ID=c.M\_Product\_ID AND c.IsActive ='Y' ) WHERE C\_UOM.C\_UOM\_ID=c.C\_UOM\_TO\_ID AND @M\_Product\_ID@=p.M\_Product\_ID ) OR EXISTS ( /\* For the products UOM there is a conversion that is not bound to any product explicitly \*/ SELECT \* FROM M\_Product p INNER JOIN C\_UOM\_Conversion c ON (p.C\_UOM\_ID=c.C\_UOM\_ID AND c.M\_Product\_ID IS NULL AND c.IsActive ='Y' ) WHERE C\_UOM.C\_UOM\_ID=c.C\_UOM\_TO\_ID AND @M\_Product\_ID@=p.M\_Product\_ID AND NOT EXISTS ( SELECT \* FROM M\_Product p1 INNER JOIN C\_UOM\_Conversion c1 ON (p1.C\_UOM\_ID=c1.C\_UOM\_ID AND p1.M\_PRODUCT\_ID=c1.M\_Product\_ID AND c1.IsActive ='N' ) WHERE c.C\_UOM\_ID=c1.C\_UOM\_ID AND c.C\_UOM\_TO\_ID=c1.C\_UOM\_TO\_ID AND p1.M\_Product\_ID=@M\_Product\_ID@ ) ) ) |                               Unit of Measure                               |                                                                                                    The UOM defines a unique non monetary Unit of Measure                                                                                                     |
|       Armazém       |    Tabela     |                                 M\_Warehouse of Client(@M\_Warehouse\_ID@)                                 | mwarehouse\_corderline |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 M\_Warehouse.AD\_Org\_ID=@AD\_Org\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @OrderType@\!'SO'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                     Storage Warehouse and Service Point                     |                                                                               The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                |
|   Valor da Linha    |     Valor     |                                                                                                            |                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Line Extended Amount (Quantity \* Actual Price) without Freight and Charges | Indicates the extended line amount based on the quantity and the actual price. Any additional charges or freight are not included. The Amount may or may not include tax. If the price list is inclusive tax, the line amount is the same as the line total. |
| Quantidade Faturada |  Quantidade   |                                                                                                            |                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                              Invoiced Quantity                              |                                                                                      The Invoiced Quantity indicates the quantity of a product that have been invoiced.                                                                                      |
|   Preço Unitário    | Custos+Preços |                                                                                                            |                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                Actual Price                                 |                                                                                        The Actual or Unit Price indicates the Price for a product in source currency.                                                                                        |
|   Preço de Lista    | Custos+Preços |                                                                                                            |                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   <span class="emphasis">*ReadOnly Logic*</span>: @cof\_isMarkup@='Y'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                 List Price                                  |                                                                                             The List Price is the official List Price in the document currency.                                                                                              |

</div>

</div>

  

<div id="d8944e708" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Itens em Aberto - RV\_OpenItem

</div>

</div>

</div>

<span class="emphasis">*Claúsula Where:*</span>
RV\_OpenItem.C\_BPartner\_ID=@C\_BPartner\_ID@

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d8944e719" class="table">

<div class="table-title">

Table 1.4. Itens em Aberto
Fields

</div>

<div class="table-contents">

|    Nome do campo    | Referência | Valores (Padrão) | Chave restritiva | Regra de validação |          Descrição           |                                                                                               Comentário/Ajuda                                                                                                |
| :-----------------: | :--------: | :--------------: | :--------------: | :----------------: | :--------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Pedido        |  Procurar  |                  |                  |                    |            Order             | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
| Número do Documento |  Inteiro   |                  |                  |                    | Número do Documento Fiscal.  |                                                                                    Número do Documento Fiscal. . Ref.: B08                                                                                    |
| Data do Vencimento  |    Data    |                  |                  |                    | Date when the payment is due |                                                                          Date when the payment is due without deductions or discount                                                                          |
|     Total Geral     |   Valor    |                  |                  |                    |   Total amount of document   |                                                           The Grand Total displays the total amount including Tax and Freight in document currency                                                            |
|    Valor Aberto     |   Valor    |                  |                  |                    |       Open item amount       |                                                                                                                                                                                                               |

</div>

</div>

  

</div>
