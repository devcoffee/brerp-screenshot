---
title: "Transportadora"
id: Transportadora
---
<div id="d249717e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Transportadora

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Transportadora -
    M\_Shipper](#d249717e23)</span>
  - <span class="section">[2. Tabela: Frete -
    M\_Freight](#d249717e198)</span>
  - <span class="section">[3. Tabela: Embalagem -
    M\_ShipperPackaging](#d249717e445)</span>
  - <span class="section">[4. Tabela: Tipo de Etiqueta -
    M\_ShipperLabels](#d249717e615)</span>
  - <span class="section">[5. Tabela: Tipos de Coleta -
    M\_ShipperPickupTypes](#d249717e790)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de
Transportadoras

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela
"Transportadora" define as diferentes formas de transporte utilizados
por uma organização. Uma Transportadora predefinida tem que ser
selecionada quando um método de entrega de uma Transportadora for usado
em um Pedido.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Transportadora.png)

<div id="d249717e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Transportadora - M\_Shipper

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Shipper_data)

<span class="emphasis">*Descrição:*</span> Transportadoras

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba
"Transportadoras" define quaisquer entidades que vão fornecer transporte
de ou para uma Organização.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d249717e40" class="table">

<div class="table-title">

Table 1.1. Shipper
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |   Valores (Padrão)   |       Chave restritiva       |                                                                   Regra de validação                                                                    |                                   Descrição                                    |                                                               Comentário/Ajuda                                                               |
| :-----------------------: | :------------------: | :------------------: | :--------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Transportadora       |          ID          |                      |                              |                                                                                                                                                         |                      Method or manner of product delivery                      |                                            The Shipper indicates the method of delivering product                                            |
|          Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                              |                                                            AD\_Client.AD\_Client\_ID \< \> 0                                                            |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|        Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                              |                                                    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                     |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|           Nome            | Texto Curto (String) |                      |                              |                                                                                                                                                         |                     Alphanumeric identifier of the entity                      | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|           Ativo           |       Sim-Não        |         (Y)          |                              |                                                                                                                                                         |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|   Parceiro de Negócios    |       Procurar       |                      |     cbpartner\_mshipper      |                                                 C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                  |                         Identifies a Business Partner                          |               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                |
| Configuração do Remetente |    Tabela Direta     |                      |    mshippercfg\_mshipper     |                                                                                                                                                         |                                                                                |                                                                                                                                              |
|   Processo do Remetente   |        Tabela        | M\_ShippingProcessor | mshippingprocessor\_mshipper | M\_ShippingProcessor.M\_ShippingProcessorCfg\_ID IN (SELECT M\_ShippingProcessorCfg\_ID FROM M\_ShipperCfg WHERE M\_ShipperCfg\_ID=@M\_ShipperCfg\_ID@) |                                                                                |                                                                                                                                              |
|   Despacho criado de...   |        Botão         |                      |                              |                                                                                                                                                         | Process which will generate a new document lines based on an existing document |            The Create From process will create a new document based on information in an existing document selected by the user.             |

</div>

</div>

  

<div id="d249717e198" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Frete - M\_Freight

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_Freight_data)

<span class="emphasis">*Descrição:*</span> Taxas de Frete

<span class="emphasis">*Comentário/Ajuda:* </span> Taxas de Frete por
Transportadora

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d249717e215" class="table">

<div class="table-title">

Table 1.2. Freight
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |                 Descrição                  |                                          Comentário/Ajuda                                          |
| :----------------: | :------------------: | :----------------: | :------------------------: | :----------------------------------------------: | :----------------------------------------: | :------------------------------------------------------------------------------------------------: |
|       Frete        |          ID          |                    |                            |                                                  |                Freight Rate                |                                      Freight Rate for Shipper                                      |
|      Empresa       |    Tabela Direta     | (@AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |                                        (ver o mesmo acima)                                         |
|    Organização     |    Tabela Direta     |  (@AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                                        (ver o mesmo acima)                                         |
|   Transportadora   |        Tabela        |     M\_Shipper     |     mshipper\_mfreight     |                                                  |    Method or manner of product delivery    |                       The Shipper indicates the method of delivering product                       |
|       Ativo        |       Sim-Não        |        (Y)         |                            |                                                  |     (semelhante ao primeiro relatório)     |                                        (ver o mesmo acima)                                         |
| Categoria de Frete |    Tabela Direta     |                    | mfreightcategory\_mfreight |                                                  |          Category of the Freight           |           Freight Categories are used to calculate the Freight for the Shipper selected            |
|    Válido desde    |         Data         |                    |                            |                                                  | Valid from including this date (first day) |                    The Valid From date indicates the first day of a date range                     |
|      Moeda De      |    Tabela Direta     |                    |    ccurrency\_mfreight     |                                                  |        The Currency for this record        |           Indicates the Currency to be used when processing or reporting on this record            |
|   Valor do Frete   |        Valor         |                    |                            |                                                  |               Freight Amount               |       The Freight Amount indicates the amount charged for Freight in the document currency.        |
|        País        |    Tabela Direta     |                    |     ccountry\_mfreight     |                                                  |                  Country                   | The Country defines a Country. Each Country must be defined before it can be used in any document. |
|        Para        |        Tabela        |     C\_Country     |    ccountryto\_mfreight    |                                                  |             Receiving Country              |                    The To Country indicates the receiving country on a document                    |
|       Região       |    Tabela Direta     |                    |     cregion\_mfreight      |    C\_Region.C\_Country\_ID=@C\_Country\_ID@     |      Identifies a geographical Region      |                      The Region identifies a unique Region for this Country.                       |
|        Para        |        Tabela        |     C\_Region      |    cregionto\_mfreight     |    C\_Region.C\_Country\_ID=@To\_Country\_ID@    |              Receiving Region              |                     The To Region indicates the receiving region on a document                     |
|   M\_Freight\_UU   | Texto Curto (String) |                    |                            |                                                  |                                            |                                                                                                    |

</div>

</div>

  

<div id="d249717e445" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Embalagem - M\_ShipperPackaging

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Opções de embalagem
suportadas pela Transportadora

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d249717e456" class="table">

<div class="table-title">

Table 1.3. Packaging
Fields

</div>

<div class="table-contents">

|                 Nome do campo                 |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                                                                        Regra de validação                                                                                                        |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-------------------------------------------: | :------------------: | :------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Acondicionamento do Remetente         |          ID          |                      |                                 |                                                                                                                                                                                                                                  |                                       |                                                                                                                                              |
|                    Empresa                    |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                                                                AD\_Client.AD\_Client\_ID \< \> 0                                                                                                 |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|                  Organização                  |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                                                                         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|                Transportadora                 |        Tabela        |      M\_Shipper      |   mshipper\_mshipperpackaging   |                                                                                                                                                                                                                                  | Method or manner of product delivery  |                                            The Shipper indicates the method of delivering product                                            |
| Configuração do Acondicionamento do Remetente |    Tabela Direta     |                      | mshipperpackagingcfg\_mshipperp | M\_ShipperPackagingCfg.M\_ShipperPackagingCfg\_ID IN (SELECT M\_ShipperPackagingCfg\_ID FROM M\_ShipperPackagingCfg WHERE M\_ShipperCfg\_ID IN (SELECT M\_ShipperCfg\_ID FROM M\_Shipper WHERE M\_Shipper\_ID=@M\_Shipper\_ID@)) |                                       |                                                                                                                                              |
|                     Nome                      | Texto Curto (String) |                      |                                 |                                                                                                                                                                                                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                     Ativo                     |       Sim-Não        |         (Y)          |                                 |                                                                                                                                                                                                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|                    Padrão                     |       Sim-Não        |         (N)          |                                 |                                                                                                                                                                                                                                  |             Default value             |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|                     Peso                      |      Quantidade      |                      |                                 |                                                                                                                                                                                                                                  |          Weight of a product          |                                The Weight indicates the weight of the product in the Weight UOM of the Client                                |

</div>

</div>

  

<div id="d249717e615" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tipo de Etiqueta - M\_ShipperLabels

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Tipos de Etiquetas suportados
pela Transportadora

<span class="emphasis">*Comentário/Ajuda:* </span> Utilizado na reserva
online de transportadora para definir o formato da etiqueta que será
impressa.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d249717e630" class="table">

<div class="table-title">

Table 1.4. Label Type
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                                                                  Regra de validação                                                                                                  |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :------------------------------: | :------------------: | :------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Labels do Remetente        |          ID          |                      |                                 |                                                                                                                                                                                                                      |                                       |                                                                                                                                              |
|             Empresa              |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                                                          AD\_Client.AD\_Client\_ID \< \> 0                                                                                           |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|           Organização            |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                                                                   (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                   |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|          Transportadora          |        Tabela        |      M\_Shipper      |    mshipper\_mshipperlabels     |                                                                                                                                                                                                                      | Method or manner of product delivery  |                                            The Shipper indicates the method of delivering product                                            |
| Configuração Labels do Remetente |    Tabela Direta     |                      | mshipperlabelscfg\_mshipperlabe | M\_ShipperLabelsCfg.M\_ShipperLabelsCfg\_ID IN (SELECT M\_ShipperLabelsCfg\_ID FROM M\_ShipperLabelsCfg WHERE M\_ShipperCfg\_ID IN (SELECT M\_ShipperCfg\_ID FROM M\_Shipper WHERE M\_Shipper\_ID=@M\_Shipper\_ID@)) |                                       |                                                                                                                                              |
|               Nome               | Texto Curto (String) |                      |                                 |                                                                                                                                                                                                                      | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Ativo               |       Sim-Não        |         (Y)          |                                 |                                                                                                                                                                                                                      |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|              Padrão              |       Sim-Não        |         (N)          |                                 |                                                                                                                                                                                                                      |             Default value             |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| Método de Impressão de Etiqueta  |        Lista         |  Eltron Image Zebra  |                                 |                                                                                                                                                                                                                      |                                       |                                                                                                                                              |

</div>

</div>

  

<div id="d249717e790" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Tipos de Coleta - M\_ShipperPickupTypes

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Métodos que a Transportadora
irá utilizar para realizar a coleta em sua região.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d249717e801" class="table">

<div class="table-title">

Table 1.5. Pickup Types
Fields

</div>

<div class="table-contents">

|                Nome do campo                |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                                                                            Regra de validação                                                                                                            |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------------------------------------: | :------------------: | :------------------: | :-----------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Tipo de Recolhimento do Remetente      |          ID          |                      |                                 |                                                                                                                                                                                                                                          |                                       |                                                                                                                                              |
|                   Empresa                   |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                                                                    AD\_Client.AD\_Client\_ID \< \> 0                                                                                                     |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|                 Organização                 |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                                                                             (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                             |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|               Transportadora                |        Tabela        |      M\_Shipper      |  mshipper\_mshipperpickuptypes  |                                                                                                                                                                                                                                          | Method or manner of product delivery  |                                            The Shipper indicates the method of delivering product                                            |
| Tipo Configuração do Recolhimento Remetente |    Tabela Direta     |                      | mshipperpickuptypescfg\_mshippe | M\_ShipperPickupTypesCfg.M\_ShipperPickupTypesCfg\_ID IN (SELECT M\_ShipperPickupTypesCfg\_ID FROM M\_ShipperPickupTypesCfg WHERE M\_ShipperCfg\_ID IN (SELECT M\_ShipperCfg\_ID FROM M\_Shipper WHERE M\_Shipper\_ID=@M\_Shipper\_ID@)) |                                       |                                                                                                                                              |
|                    Nome                     | Texto Curto (String) |                      |                                 |                                                                                                                                                                                                                                          | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                    Ativo                    |       Sim-Não        |         (Y)          |                                 |                                                                                                                                                                                                                                          |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|                   Padrão                    |       Sim-Não        |         (N)          |                                 |                                                                                                                                                                                                                                          |             Default value             |                                The Default Checkbox indicates if this record will be used as a default value.                                |

</div>

</div>

  

</div>
