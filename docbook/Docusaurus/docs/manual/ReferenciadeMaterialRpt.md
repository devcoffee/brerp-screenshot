---
title: "Referência de Material"
id: ReferenciadeMaterialRpt
---
<div id="d194053e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Referência de Material

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2005-03-30 01:12:58.0

<span class="emphasis">*Atualizado:*</span>2005-03-30 01:15:04.0

<span class="emphasis"> *Descrição:* </span>Referência Cruzada de
Transações de Materiais (usado/reservado) Obs : Produto necessita ter
Instância

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório exibe,
por ex. onde os materiais recebidos são usados ou de onde são retirados
as remessas para clientes

<span class="emphasis"> *ReportView:* </span>T\_Transaction

<div id="d194053e25" class="table">

<div class="table-title">

Table 1.1. ReferenciadeMaterial
Parâmetros

</div>

<div class="table-contents">

|             Nome             |   Nome da coluna    | Referência | Valores(Padrão) |             Descrição             |            Comentário/Ajuda            |
| :--------------------------: | :-----------------: | :--------: | :-------------: | :-------------------------------: | :------------------------------------: |
|       Procurar Pedido        |  Search\_Order\_ID  |  Procurar  |    C\_Order     |      Identificador de Pedido      | O "Pedido" é um documento de controle. |
| Procurar Remessa/Recebimento |  Search\_InOut\_ID  |  Procurar  |    M\_InOut     | Documento de Remessa de Material  |    Remessa/Recebimento de Material     |
|       Procurar Fatura        | Search\_Invoice\_ID |  Procurar  |   C\_Invoice    | Procura o Identificador de Fatura |         O Documento da Fatura.         |

</div>

</div>

  

<div id="d194053e89" class="table">

<div class="table-title">

Table 1.2. T\_Transaction -
Colunas

</div>

<div class="table-contents">

|           Nome da coluna           |      Referência      |                                                                                                             Valores padrão                                                                                                             |      Valor de restrição       |                Regra de validação                |                    Descrição                    |                                                                  Comentário/Ajuda                                                                  |
| :--------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------: | :----------------------------------------------: | :---------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Empresa               |    Tabela Direta     |                                                                                                                                                                                                                                        |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |                   (ver acima)                   |                                                                    (ver acima)                                                                     |
|            Organização             |    Tabela Direta     |                                                                                                                                                                                                                                        |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                   (ver acima)                   |                                                                    (ver acima)                                                                     |
|       Instância de Processo        |       Procurar       |                                                                                                                                                                                                                                        |   adpinstance\_ttransaction   |                                                  |             Instance of the process             |                                                                                                                                                    |
|              Projeto               |       Procurar       |                                                                                                                                                                                                                                        |                               |                                                  |                Financial Project                |                                     A Project allows you to track and control internal or external activities.                                     |
|         Emissão do Projeto         |       Procurar       |                                                                                                                                                                                                                                        |  cprojectissue\_ttransaction  |                                                  |        Project Issues (Material, Labor)         |              Issues to the project initiated by the "Issue to Project" process. You can issue Receipts, Time and Expenses, or Stock.               |
|               Criado               |      Data+Hora       |                                                                                                               (SYSDATE)                                                                                                                |                               |                                                  |          Date this record was created           |                                         The Created field indicates the date that this record was created.                                         |
|             Criado por             |        Tabela        |                                                                                                                AD\_User                                                                                                                |                               |                                                  |          User who created this records          |                                          The Created By field indicates the user who created this record.                                          |
|               Ativo                |       Sim-Não        |                                                                                                                  (Y)                                                                                                                   |                               |                                                  |                   (ver acima)                   |                                                                    (ver acima)                                                                     |
| Instância do Conjunto de Atributos | Atributo de Produto  |                                                                                                                                                                                                                                        |      masi\_ttransaction       |                                                  |         Product Attribute Set Instance          |                  The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                  |
|        Remessa/Recebimento         |       Procurar       |                                                                                                                                                                                                                                        |                               |                                                  |           Material Shipment Document            |                                                          The Material Shipment / Receipt                                                           |
|    Linha de Remessa/Recebimento    |       Procurar       |                                                                                                                                                                                                                                        |   minoutline\_ttransaction    |                                                  |      Line on Shipment or Receipt document       |                                  The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                  |
|           Estoque Físico           |       Procurar       |                                                                                                                                                                                                                                        |                               |                                                  |       Parameters for a Physical Inventory       |                                   The Physical Inventory indicates a unique parameters for a physical inventory.                                   |
|      Linha de Estoque Físico       |       Procurar       |                                                                                                                                                                                                                                        | minventoryline\_ttransaction  |                                                  |      Unique line in an Inventory document       |                       The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction                       |
|            Localizador             |  Locator (Armazém)   |                                                                                                                                                                                                                                        |    mlocator\_ttransaction     |                                                  |                Warehouse Locator                |                                          The Locator indicates where in a Warehouse a product is located.                                          |
|      Movimentação de Estoque       |       Procurar       |                                                                                                                                                                                                                                        |                               |                                                  |              Movement of Inventory              |                                       The Inventory Movement uniquely identifies a group of movement lines.                                        |
|         Linha de Movimento         |       Procurar       |                                                                                                                                                                                                                                        |  mmovementline\_ttransaction  |                                                  |          Inventory Move document Line           |                       The Movement Line indicates the inventory movement document line (if applicable) for this transaction                        |
|        Data da Movimentação        |      Data+Hora       |                                                                                                                                                                                                                                        |                               |                                                  | Date a product was moved in or out of inventory | The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement. |
|       Quantidade Movimentada       |      Quantidade      |                                                                                                                                                                                                                                        |                               |                                                  |          Quantity of a product moved.           |                                   The Movement Quantity indicates the quantity of a product that has been moved.                                   |
|        Tipo de Movimentação        |        Lista         | Saldo Inicial Entrega para Cliente Devolução de cliente Saída de Estoque Entrada de Estoque Movimento de Movimento para Produção - Produção + Devoluções a Fornecedor Recebimentos de Fornecedor Ordem de Serviço - Ordem de Serviço + |                               |                                                  |         Method of moving the inventory          |                                   The Movement Type indicates the type of movement (in, out, to production, etc)                                   |
|              Produto               |       Procurar       |                                                                                                                                                                                                                                        |    mproduct\_ttransaction     |                                                  |             Product, Service, Item              |                                     Identifies an item which is either purchased or sold in this organization.                                     |
|              Produção              |       Procurar       |                                                                                                                                                                                                                                        |                               |                                                  |          Plan for producing a product           |                                                The Production uniquely identifies a Production Plan                                                |
|         Linha de Produção          |       Procurar       |                                                                                                                                                                                                                                        | mproductionline\_ttransaction |                                                  |     Document Line representing a production     |                          The Production Line indicates the production document line (if applicable) for this transaction                           |
|        Transação de Estoque        |       Procurar       |                                                                                                                                                                                                                                        |  mtransaction\_ttransaction   |                                                  |                                                 |                                                                                                                                                    |
|    Procurar Remessa/Recebimento    |       Procurar       |                                                                                                              M\_InOutLine                                                                                                              |                               |                                                  |           Material Shipment Document            |                                                          The Material Shipment / Receipt                                                           |
|          Procurar Fatura           |       Procurar       |                                                                                                               C\_Invoice                                                                                                               |                               |                                                  |            Search Invoice Identifier            |                                                               The Invoice Document.                                                                |
|          Procurar Pedido           |       Procurar       |                                                                                                                C\_Order                                                                                                                |                               |                                                  |                Order Identifier                 |                                                            Order is a control document.                                                            |
|         T\_Transaction\_UU         | Texto Curto (String) |                                                                                                                                                                                                                                        |                               |                                                  |                                                 |                                                                                                                                                    |
|             Atualizado             |      Data+Hora       |                                                                                                               (SYSDATE)                                                                                                                |                               |                                                  |          Date this record was updated           |                                         The Updated field indicates the date that this record was updated.                                         |
|           Atualizado por           |        Tabela        |                                                                                                                AD\_User                                                                                                                |                               |                                                  |          User who updated this records          |                                          The Updated By field indicates the user who updated this record.                                          |

</div>

</div>

  

</div>
