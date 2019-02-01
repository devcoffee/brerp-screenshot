---
title: "Ordem de Serviço"
id: OrdemdeServico
---
<div id="d152357e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ordem de Serviço

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ordem de Serviço -
    COF\_OrdemServico](#d152357e23)</span>
  - <span class="section">[2. Tabela: Apontamentos -
    COF\_OSApontamentos](#d152357e687)</span>
  - <span class="section">[3. Tabela: Serviços -
    COF\_OSServico](#d152357e913)</span>
  - <span class="section">[4. Tabela: Produtos -
    COF\_OSProduto](#d152357e1163)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-08-23 09:06:40.0

<span class="emphasis">*Atualizado em:* </span>2017-08-23 09:06:40.0

![](/img/manual/OrdemdeServico.png)

<div id="d152357e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ordem de Serviço - COF\_OrdemServico

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_OrdemServico_data)

<span class="emphasis"> *Relatório:* </span>Imprimir Ordem de Serviço -
ProcCOFImprimirOrdemServico

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d152357e36" class="table">

<div class="table-title">

Table 1.1. Ordem de Serviço
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |                                                                    Valores (Padrão)                                                                    |        Chave restritiva         |                                                                                            Regra de validação                                                                                            |                         Descrição                          |                                                                                            Comentário/Ajuda                                                                                            |
| :--------------------------------: | :-------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       COF\_OrdemServico\_UU        |       Texto Curto (String)        |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|          Ordem de Serviço          |                ID                 |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |               Primary Key : Ordem de Serviço               |                                                                                     Primary Key : Ordem de Serviço                                                                                     |
|              Empresa               |           Tabela Direta           |                                                                  (@\#AD\_Client\_ID@)                                                                  |                                 |                                                                                    AD\_Client.AD\_Client\_ID \< \> 0                                                                                     |             (semelhante ao primeiro relatório)             |                                                                                          (ver o mesmo acima)                                                                                           |
|            Organização             |           Tabela Direta           |                                                                   (@\#AD\_Org\_ID@)                                                                    |                                 |                                                                          AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                                                                           |             (semelhante ao primeiro relatório)             |                                                                                          (ver o mesmo acima)                                                                                           |
|           Chave de Busca           |       Texto Curto (String)        |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |             (semelhante ao primeiro relatório)             |                                                                                          (ver o mesmo acima)                                                                                           |
|           Data de Início           |             Data+Hora             |                                                                       (@\#Date@)                                                                       |                                 |                                                                   <span class="emphasis">*ReadOnly Logic*</span>: @DocStatus@ \! 'DR'                                                                    |              First effective day (inclusive)               |                                                                          The Start Date indicates the first or starting date                                                                           |
|             Data Final             |             Data+Hora             |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |              Last effective date (inclusive)               |                                                                          The End Date indicates the last date in this range.                                                                           |
|           Data Prometida           |             Data+Hora             |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                  Date Order was promised                   |                                                             The Date Promised indicates the date, if any, that an Order was promised for.                                                              |
|       Tipo de Documento Alvo       |              Tabela               |                                                                       C\_DocType                                                                       | CDocTypeTarget\_COFOrdemServico |                                             C\_DocType.DocBaseType IN ('DOS') AND C\_DocType.AD\_Client\_ID=@\#AD\_Client\_ID@ AND C\_DocType.IsActive = 'Y'                                             |       Target document type for conversing documents        | You can convert document types (e.g. from Offer to Order or Invoice). The conversion is then reflected in the current type. This processing is initiated by selecting the appropriate Document Action. |
|              Armazém               |           Tabela Direta           |                                                                                                                                                        |   MWarehouse\_COFOrdemServico   |                                                                                  M\_Warehouse.AD\_Org\_ID=@AD\_Org\_ID@                                                                                  |            Storage Warehouse and Service Point             |                                                    The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                     |
|            Equipamentos            |             Procurar              |                                                                                                                                                        | COFEquipments\_COFOrdemServico  |                                                                                                                                                                                                          |                  Primary Key : Equipments                  |                                                                                        Primary Key : Equipments                                                                                        |
|              Endereço              |      Localização (Endereço)       |                                                                                                                                                        |   CLocation\_COFOrdemServico    |                                                                                                                                                                                                          |                    Location or Address                     |                                                                    The Location / Address field defines the location of an entity.                                                                     |
|               Ativo                |             Procurar              |                                                                                                                                                        |     AAsset\_COFOrdemServico     |                                                                                                                                                                                                          |           Asset used internally or by customers            |                                      An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                      |
|        Parceiro de Negócios        |             Procurar              |                                                                                                                                                        |   CBPartner\_COFOrdemServico    |                                                                                                                                                                                                          |               Identifies a Business Partner                |                                            A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                             |
|              Produto               |             Procurar              |                                                                                                                                                        |    MProduct\_COFOrdemServico    |                                                         (M\_Product.ProductType='I' OR M\_Product.ProductType='A') AND M\_Product.IsActive = 'Y'                                                         |                   Product, Service, Item                   |                                                               Identifies an item which is either purchased or sold in this organization.                                                               |
| Instância do Conjunto de Atributos |        Atributo de Produto        |                                                                                                                                                        | MAttributeSetInstance\_COFOrdem |                                                                                                                                                                                                          |               Product Attribute Set Instance               |                                            The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                            |
|      Localização do Parceiro       |           Tabela Direta           |                                                                                                                                                        | CBPartnerLocation\_COFOrdemServ |                                                                         C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@                                                                          | Identifies the (ship to) address for this Business Partner |                                                                    The Partner address indicates the location of a Business Partner                                                                    |
|     Lista de Preço (Produtos)      |              Tabela               |                                                                      M\_PriceList                                                                      | COFPrecoProduto\_COFOrdemServic | M\_PriceList.IsSOPriceList = 'Y' AND (SELECT COUNT(\*) FROM M\_PriceList\_Version WHERE M\_PriceList.M\_PriceList\_ID=M\_PriceList\_Version.M\_PriceList\_ID AND M\_PriceList\_Version.IsActive='Y')\> 0 |                                                            |                                                                                                                                                                                                        |
|         Nome do Entregador         |       Texto Curto (String)        |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|        Responsável Interno         |             Procurar              |                                                                  C\_BPartner Employee                                                                  | COFBPInternal\_COFOrdemServico  |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|     Lista de Preço (Serviços)      |              Tabela               |                                                                      M\_PriceList                                                                      | COFPrecoServico\_COFOrdemServic | M\_PriceList.IsSOPriceList = 'Y' AND (SELECT COUNT(\*) FROM M\_PriceList\_Version WHERE M\_PriceList.M\_PriceList\_ID=M\_PriceList\_Version.M\_PriceList\_ID AND M\_PriceList\_Version.IsActive='Y')\> 0 |                                                            |                                                                                                                                                                                                        |
|      Representante de Vendas       |             Procurar              |                                                                  AD\_User - SalesRep                                                                   |  CBPartnerSR\_COFOrdemServico   |                                                                                                                                                                                                          |           Business Partner (Agent or Sales Rep)            |                                                                                                                                                                                                        |
|              Projeto               |           Tabela Direta           |                                                                                                                                                        |    CProject\_COFOrdemServico    |                                                                                                                                                                                                          |                     Financial Project                      |                                                               A Project allows you to track and control internal or external activities.                                                               |
|             Atividade              |           Tabela Direta           |                                                                                                                                                        |   CActivity\_COFOrdemServico    |                                                                                                                                                                                                          |                     Business Activity                      |                                                        Activities indicate tasks that are performed and used to utilize Activity based Costing                                                         |
|              Campanha              |           Tabela Direta           |                                                                                                                                                        |   CCampaign\_COFOrdemServico    |                                                                                                                                                                                                          |                     Marketing Campaign                     |                  The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                  |
|          Centro de Custo           |              Tabela               |                                                                  Account\_ID - User1                                                                   |     User1\_COFOrdemServico      |                                                                                                                                                                                                          |               User defined list element \#1                |                                              The user defined element displays the optional elements that have been defined for this account combination.                                              |
|         Centro de Custo 2          |              Tabela               |                                                                  Account\_ID - User2                                                                   |     User2\_COFOrdemServico      |                                                                                                                                                                                                          |               User defined list element \#2                |                                              The user defined element displays the optional elements that have been defined for this account combination.                                              |
|          Região de Vendas          |           Tabela Direta           |                                                                                                                                                        |  CSalesRegion\_COFOrdemServico  |                                                                                                                                                                                                          |                   Sales coverage region                    |                                                                     The Sales Region indicates a specific area of sales coverage.                                                                      |
|            Prognóstico             | Texto Médio (até 2000 caracteres) |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|            Diagnóstico             | Texto Médio (até 2000 caracteres) |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|        Soluções Realizadas         | Texto Médio (até 2000 caracteres) |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|        Estado do Documento         |               Lista               | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                                 |                                                                                                                                                                                                          |             The current status of the document             |                             The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                              |
|      COF\_StatusInternoOS\_ID      |           Tabela Direta           |                                                                                                                                                        | COFStatusInternoOS\_COFOrdemSer |                                                                                                                                                                                                          |              Primary Key : Status Interno OS               |                                                                                    Primary Key : Status Interno OS                                                                                     |
|               Ativo                |              Sim-Não              |                                                                          (Y)                                                                           |                                 |                                                                                                                                                                                                          |             (semelhante ao primeiro relatório)             |                                                                                          (ver o mesmo acima)                                                                                           |
|       Process Ordem Serviço        |               Botão               |                                                                 \_Document Action(DR)                                                                  |                                 |                                                                                                                                                                                                          |            The targeted status of the document             |                                                      You find the current status in the Document Status field. The options are listed in a popup                                                       |
|       Motivo de Paralisação        |           Tabela Direta           |                                                                                                                                                        | COFMotivoParalisacao\_COFOrdemS |                                                                                                                                                                                                          |              Primary Key : Motivo Paralisação              |                                                                                    Primary Key : Motivo Paralisação                                                                                    |
|             Processado             |              Sim-Não              |                                                                          (N)                                                                           |                                 |                                                                                                                                                                                                          |              The document has been processed               |                                                                  The Processed checkbox indicates that a document has been processed.                                                                  |
|         Gerar Apontamentos         |              Sim-Não              |                                                                          (N)                                                                           |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|       Valor Total (Serviços)       |              Número               |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|       Valor Total (Produtos)       |              Número               |                                                                                                                                                        |                                 |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|     Ordem de Venda (Produtos)      |             Procurar              |                                                                        C\_Order                                                                        | COFOrderProduto\_COFOrdemServic |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|     Ordem de Venda (Serviços)      |             Procurar              |                                                                        C\_Order                                                                        | COFOrderServico\_COFOrdemServic |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |
|       Estoque de Uso Interno       |             Procurar              |                                                                      M\_Inventory                                                                      | COFMovementOS\_COFOrdemServico  |                                                                                                                                                                                                          |                                                            |                                                                                                                                                                                                        |

</div>

</div>

  

<div id="d152357e687" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Apontamentos - COF\_OSApontamentos

</div>

</div>

</div>

<span class="emphasis">*Lógica de somente leitura:*</span> @DocStatus@ =
'CO' | @DocStatus@ = 'CL'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d152357e698" class="table">

<div class="table-title">

Table 1.2. Apontamentos
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |         Valores (Padrão)         |        Chave restritiva         |                Regra de validação                |                   Descrição                    |                  Comentário/Ajuda                   |
| :----------------------: | :-------------------------------: | :------------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------: | :-------------------------------------------------: |
| COF\_OSApontamentos\_ID  |                ID                 |                                  |                                 |                                                  | Primary Key : Apontamentos da Ordem de Serviço |   Primary Key : Apontamentos da Ordem de Serviço    |
| COF\_OSApontamentos\_UU  |       Texto Curto (String)        |                                  |                                 |                                                  |                                                |                                                     |
|         Empresa          |           Tabela Direta           |       (@\#AD\_Client\_ID@)       |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)       |                 (ver o mesmo acima)                 |
|       Organização        |           Tabela Direta           |        (@\#AD\_Org\_ID@)         |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)       |                 (ver o mesmo acima)                 |
|     Ordem de Serviço     |           Tabela Direta           |                                  | COFOrdemServico\_COFOSApontamen |                                                  |         Primary Key : Ordem de Serviço         |           Primary Key : Ordem de Serviço            |
|          Ativo           |              Sim-Não              |               (Y)                |                                 |                                                  |       (semelhante ao primeiro relatório)       |                 (ver o mesmo acima)                 |
|      Data de Início      |             Data+Hora             |                                  |                                 |                                                  |        First effective day (inclusive)         | The Start Date indicates the first or starting date |
|        Data Final        |             Data+Hora             |                                  |                                 |                                                  |        Last effective date (inclusive)         | The End Date indicates the last date in this range. |
|         Operador         |             Procurar              |       C\_BPartner Employee       | COFBPOperador\_COFOSApontamento |                                                  |                                                |                                                     |
|     Quantidade Horas     |              Número               |                                  |                                 |                                                  |                                                |                                                     |
|        Ferramenta        |              Tabela               | COF\_PP\_Ferramenta name + value | COFPPFerramenta\_COFOSApontamen |                                                  |            Primary Key : Ferramenta            |              Primary Key : Ferramenta               |
| COF\_StatusInternoOS\_ID |           Tabela Direta           |                                  | COFStatusInternoOS\_COFOSAponta |                                                  |        Primary Key : Status Interno OS         |           Primary Key : Status Interno OS           |
|        Atividades        | Texto Médio (até 2000 caracteres) |                                  |                                 |                                                  |                                                |                                                     |

</div>

</div>

  

<div id="d152357e913" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Serviços - COF\_OSServico

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_OSServico_data)

<span class="emphasis">*Lógica de somente leitura:*</span> @DocStatus@ =
'CO' | @DocStatus@ = 'CL'

<span class="emphasis">*Lógica de visualização:*</span>
@COF\_PrecoServico\_ID@ \> 0

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d152357e930" class="table">

<div class="table-title">

Table 1.3. Serviços
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |      Valores (Padrão)       |       Chave restritiva        |                Regra de validação                |                 Descrição                  |                                      Comentário/Ajuda                                      |
| :----------------: | :------------------: | :-------------------------: | :---------------------------: | :----------------------------------------------: | :----------------------------------------: | :----------------------------------------------------------------------------------------: |
| COF\_OSServico\_UU | Texto Curto (String) |                             |                               |                                                  |                                            |                                                                                            |
| COF\_OSServico\_ID |          ID          |                             |                               |                                                  | Primary Key : Serviços de Ordem de Serviço |                         Primary Key : Serviços de Ordem de Serviço                         |
|      Empresa       |    Tabela Direta     |    (@\#AD\_Client\_ID@)     |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |                                    (ver o mesmo acima)                                     |
|    Organização     |    Tabela Direta     |      (@\#AD\_Org\_ID@)      |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                                    (ver o mesmo acima)                                     |
|  Ordem de Serviço  |    Tabela Direta     |                             | COFOrdemServico\_COFOSServico |                                                  |       Primary Key : Ordem de Serviço       |                               Primary Key : Ordem de Serviço                               |
|   Lista de Preço   |    Tabela Direta     | (@0|COF\_PrecoServico\_ID@) |   MPriceList\_COFOSServico    |                                                  |     Unique identifier of a Price List      | Price Lists are used to determine the pricing, margin and cost of items purchased or sold. |
|     Descrição      | Texto Curto (String) |                             |                               |                                                  |  Optional short description of the record  |                        A description is limited to 255 characters.                         |
|      Serviço       |       Procurar       |   M\_Product (Value+Name)   |   COFServico\_COFOSServico    |           M\_Product.ProductType = 'S'           |                                            |                                                                                            |
|      Faturado      |       Sim-Não        |             (Y)             |                               |                                                  |                                            |                                                                                            |
|     Quantidade     |      Quantidade      |             (0)             |                               |                                                  |                  Quantity                  |     The Quantity indicates the number of a specific product or item for this document.     |
|       Motivo       |        Lista         |   Bônus Cortesia Garantia   |                               |                                                  |                                            |                                                                                            |
|   Valor Unitário   |        Número        |             (0)             |                               |                                                  |                                            |                                                                                            |
|    Total Geral     |        Valor         |                             |                               |                                                  |          Total amount of document          |  The Grand Total displays the total amount including Tax and Freight in document currency  |
|       Ativo        |       Sim-Não        |             (Y)             |                               |                                                  |     (semelhante ao primeiro relatório)     |                                    (ver o mesmo acima)                                     |

</div>

</div>

  

<div id="d152357e1163" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Produtos - COF\_OSProduto

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_OSProduto_data)

<span class="emphasis">*Lógica de somente leitura:*</span> @DocStatus@ =
'CO' | @DocStatus@ = 'CL'

<span class="emphasis">*Lógica de visualização:*</span>
@COF\_PrecoProduto\_ID@ \> 0

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d152357e1180" class="table">

<div class="table-title">

Table 1.4. Produtos
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |      Valores (Padrão)       |       Chave restritiva        |                                                                          Regra de validação                                                                          |             Descrição              |                                      Comentário/Ajuda                                      |
| :----------------------: | :------------------: | :-------------------------: | :---------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :----------------------------------------------------------------------------------------: |
|    COF\_OSProduto\_ID    |          ID          |                             |                               |                                                                                                                                                                      |       Primary Key : Produtos       |                                   Primary Key : Produtos                                   |
|    COF\_OSProduto\_UU    | Texto Curto (String) |                             |                               |                                                                                                                                                                      |                                    |                                                                                            |
|         Empresa          |    Tabela Direta     |    (@\#AD\_Client\_ID@)     |                               |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                     |
|       Organização        |    Tabela Direta     |      (@\#AD\_Org\_ID@)      |                               |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                     |
|     Ordem de Serviço     |    Tabela Direta     |                             | COFOrdemServico\_COFOSProduto |                                                                                                                                                                      |   Primary Key : Ordem de Serviço   |                               Primary Key : Ordem de Serviço                               |
|      Lista de Preço      |    Tabela Direta     | (@0|COF\_PrecoProduto\_ID@) |   MPriceList\_COFOSProduto    |                                                                                                                                                                      | Unique identifier of a Price List  | Price Lists are used to determine the pricing, margin and cost of items purchased or sold. |
|         Produto          |       Procurar       |                             |    MProduct\_COFOSProduto     | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |       Product, Service, Item       |         Identifies an item which is either purchased or sold in this organization.         |
|          Ativo           |       Sim-Não        |             (Y)             |                               |                                                                                                                                                                      | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                     |
|    Incorporar Serviço    |       Sim-Não        |             (N)             |                               |                                                                                                                                                                      |                                    |                                                                                            |
|         Serviço          |       Procurar       |   M\_Product (Value+Name)   |   COFServico\_COFOSProduto    |                                                                     M\_Product.ProductType = 'S'                                                                     |                                    |                                                                                            |
|      Baixa Estoque       |       Sim-Não        |             (N)             |                               |                               <span class="emphasis">*ReadOnly Logic*</span>: @COF\_Faturado@ = 'Y' %26 @COF\_IncorporarServico@ = 'N'                               |                                    |                                                                                            |
|         Faturado         |       Sim-Não        |             (Y)             |                               |                                              <span class="emphasis">*ReadOnly Logic*</span>: @COF\_BaixaEstoque@ = 'Y'                                               |                                    |                                                                                            |
|          Motivo          |        Lista         |   Bônus Cortesia Garantia   |                               |                                                                                                                                                                      |                                    |                                                                                            |
|   Quantidade (Produto)   |      Quantidade      |             (0)             |                               |                                                                                                                                                                      |              Quantity              |     The Quantity indicates the number of a specific product or item for this document.     |
|   Quantidade (Serviço)   |        Número        |             (0)             |                               |                                                                                                                                                                      |                                    |                                                                                            |
| Valor Unitário (Produto) |        Número        |             (0)             |                               |                                                                                                                                                                      |                                    |                                                                                            |
| Valor Unitário (Serviço) |        Número        |             (0)             |                               |                                                                                                                                                                      |                                    |                                                                                            |
|       Total Geral        |        Valor         |                             |                               |                                                                                                                                                                      |      Total amount of document      |  The Grand Total displays the total amount including Tax and Freight in document currency  |

</div>

</div>

  

</div>
