---
title: "Ativo"
id: Ativo
---
<div id="d9718e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ativo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ativo -
    A\_Asset](#d9718e22)</span>
  - <span class="section">[2. Tabela: Produto -
    A\_Asset\_Product](#d9718e951)</span>
  - <span class="section">[3. Tabela: Saldos Patrimoniais -
    A\_Depreciation\_Workfile](#d9718e1151)</span>
  - <span class="section">[4. Tabela: Configurações Contábeis -
    A\_Asset\_Acct](#d9718e1831)</span>
  - <span class="section">[5. Tabela: Ativação/Adição -
    A\_Asset\_Addition](#d9718e2448)</span>
  - <span class="section">[6. Tabela: Detalhes de Custo -
    A\_Asset\_Addition](#d9718e3185)</span>
  - <span class="section">[7. Tabela: Disponível -
    A\_Asset\_Disposed](#d9718e3460)</span>
  - <span class="section">[8. Tabela: Métrica de Prevenção -
    MP\_AssetMeter](#d9718e3733)</span>
  - <span class="section">[9. Tabela: Apontamento de Métricas -
    MP\_AssetMeter\_Log](#d9718e3956)</span>
  - <span class="section">[10. Tabela: Entrega -
    A\_Asset\_Delivery](#d9718e4148)</span>
  - <span class="section">[11. Tabela: Uso de Ativo -
    A\_Asset\_Use](#d9718e4474)</span>
  - <span class="section">[12. Tabela: Histórico de Ativo -
    A\_Asset\_Change](#d9718e4628)</span>
  - <span class="section">[13. Tabela: Projeto -
    R\_IssueProject](#d9718e5851)</span>
  - <span class="section">[14. Tabela: Informações Financeiras -
    A\_Asset\_Info\_Fin](#d9718e6063)</span>
  - <span class="section">[15. Tabela: Informações sobre a licença -
    A\_Asset\_Info\_Lic](#d9718e6363)</span>
  - <span class="section">[16. Tabela: Informações de Seguro -
    A\_Asset\_Info\_Ins](#d9718e6591)</span>
  - <span class="section">[17. Tabela: Informações de Imposto -
    A\_Asset\_Info\_Tax](#d9718e6814)</span>
  - <span class="section">[18. Tabela: Outras Informações -
    A\_Asset\_Info\_Oth](#d9718e7024)</span>
  - <span class="section">[19. Tabela: Despesa -
    A\_Depreciation\_Exp](#d9718e7357)</span>

</div>

<span class="emphasis">*Descrição:* </span> Ativo usado internamente ou
por clientes

<span class="emphasis">*Comentário/Ajuda:* </span>Um ativo é criado ou
ao comprar ou ao entregar um produto. Um ativo pode ser usado
internamente ou ser um ativo de cliente.

<span class="emphasis"> *Criado em:* </span>2003-01-23 00:51:59.0

<span class="emphasis">*Atualizado em:* </span>2010-06-17 15:12:01.0

<div id="d9718e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ativo - A\_Asset

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_data)

<span class="emphasis">*Descrição:*</span> Ativo usado internamente ou
por clientes

<span class="emphasis">*Comentário/Ajuda:* </span> Um ativo é criado ou
ao comprar ou ao entregar um produto. Um ativo pode ser usado
internamente ou ser um ativo de cliente.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d9718e39" class="table">

<div class="table-title">

Table 1.1. Asset
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |                            Valores (Padrão)                             |       Chave restritiva        |                                                                          Regra de validação                                                                          |                           Descrição                           |                                                                   Comentário/Ajuda                                                                    |
| :--------------------------------: | :-------------------------------: | :---------------------------------------------------------------------: | :---------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Linha de Remessa/Recebimento    |           Tabela Direta           |                                                                         |      minoutline\_aasset       |                                                                                                                                                                      |             Line on Shipment or Receipt document              |                                   The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                    |
|             Fabricante             |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                  Manufacturer of the Product                  |                                The manufacturer of the Product (used if different from the Business Partner / Vendor)                                 |
|           Tipo do Ativo            |       Texto Curto (String)        |                                  (MFX)                                  |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|          Vida Útil - Anos          |              Inteiro              |                                                                         |                               |                                                                                                                                                                      |             Years of the usable life of the asset             |                                                                                                                                                       |
|           Tipo do Ativo            |           Tabela Direta           |                                                                         |      aassettype\_aasset       |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|             Processado             |              Sim-Não              |                                  ('N')                                  |                               |                                                                                                                                                                      |                The document has been processed                |                                         The Processed checkbox indicates that a document has been processed.                                          |
|          Adição de Ativos          |               Lista               |    Dispose Inbound Modify Outbound Reevaluate Retire Transfer ('MD')    |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|          Classe do Ativo           |             Procurar              |                          A\_Asset\_Class (all)                          |      aassetclass\_aasset      |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|           Qtd. Original            |              Número               |                                                                         |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|          Processar Agora           |              Sim-Não              |                                   (N)                                   |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|         Vida Útil - Meses          |              Inteiro              |                                                                         |                               |                                                                                                                                                                      |            Months of the usable life of the asset             |                                                                                                                                                       |
|             Quantidade             |              Número               |                                                                         |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|               Ativo                |                ID                 |                                                                         |                               |                                                                                                                                                                      |             Asset used internally or by customers             |             An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.              |
|             Quantidade             |            Quantidade             |                                                                         |                               |                                                                                                                                                                      |                           Quantity                            |                                  The Quantity indicates the number of a specific product or item for this document.                                   |
|              Empresa               |           Tabela Direta           |                          (@\#AD\_Client\_ID@)                           |                               |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |              (semelhante ao primeiro relatório)               |                                                                  (ver o mesmo acima)                                                                  |
|            Organização             |           Tabela Direta           |                            (@\#AD\_Org\_ID@)                            |                               |                                                        AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                                                         |              (semelhante ao primeiro relatório)               |                                                                  (ver o mesmo acima)                                                                  |
|           Chave de Busca           |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |              (semelhante ao primeiro relatório)               |                                                                  (ver o mesmo acima)                                                                  |
|          No do Inventário          |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|                Nome                |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |             Alphanumeric identifier of the entity             |     The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.      |
|             Descrição              |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |           Optional short description of the record            |                                                      A description is limited to 255 characters.                                                      |
|          Comentário/Ajuda          | Texto Médio (até 2000 caracteres) |                                                                         |                               |                                                                                                                                                                      |                        Comment or Hint                        |                                      The Help field contains a hint, comment or help about the use of this item.                                      |
|               Ativo                |              Sim-Não              |                                   (Y)                                   |                               |                                                                                                                                                                      |              (semelhante ao primeiro relatório)               |                                                                  (ver o mesmo acima)                                                                  |
|            ID do Ativo             |             Procurar              |                              A\_Asset\_ID                               |     aparentasset\_aasset      |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|           Grupo de Ativo           |             Procurar              |                             A\_Asset\_Group                             |      aassetgroup\_aasset      |                                                          A\_Asset\_Type\_ID IN (NULL, @A\_Asset\_Type\_ID@)                                                          |                        Group of Assets                        | The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset. |
|           Núm. da Versão           |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                        Version Number                         |                                                                                                                                                       |
|              Produto               |             Procurar              |                                                                         |       mproduct\_aasset        | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                    Product, Service, Item                     |                                      Identifies an item which is either purchased or sold in this organization.                                       |
| Instância do Conjunto de Atributos |        Atributo de Produto        |                                                                         | mattributesetinstance\_aasset |                                                                                                                                                                      |                Product Attribute Set Instance                 |                   The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                    |
|             Núm. Série             |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                     Product Serial Number                     |                        The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                         |
|         Ano de Fabricação          |              Inteiro              |                                 (1900)                                  |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|             Lote Núm.              |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                   Lot number (alphanumeric)                   |                                         The Lot Number indicates the specific lot that a product was part of.                                         |
|     Data de Entrada em Serviço     |               Data                |                                                                         |                               |                                                                                                                                                                      |             Date when Asset was put into service              |                              The date when the asset was put into service - usually used as start date for depreciation.                              |
|       Vencimento da Garantia       |               Data                |                                                                         |                               |                                                                                                                                                                      |                  Date when guarantee expires                  |                                                Date when the normal guarantee or availability expires                                                 |
|      Data de Criação do Ativo      |               Data                |                                (@Date@)                                 |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|        Reav. Data do Ativo         |               Data                |                                                                         |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|              Projeto               |             Procurar              |                                                                         |       cproject\_aasset        |                                                                                                                                                                      |                       Financial Project                       |                                      A Project allows you to track and control internal or external activities.                                       |
|             Atividade              |           Tabela Direta           |                                                                         |       cactivity\_aasset       |                                                                                                                                                                      |                       Business Activity                       |                                Activities indicate tasks that are performed and used to utilize Activity based Costing                                |
|              Em Posse              |              Sim-Não              |                                                                         |                               |                                                                                                                                                                      |      The asset is in the possession of the organization       |                       Assets which are not in possession are e.g. at Customer site and may or may not be owned by the company.                        |
|        Parceiro de Negócios        |             Procurar              |                                                                         |       cbpartner\_aasset       |                                                        C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                        |                 Identifies a Business Partner                 |                    A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                    |
|      Localização do Parceiro       |           Tabela Direta           |                                                                         |      cbplocation\_aasset      |                                                       C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@                                                        |  Identifies the (ship to) address for this Business Partner   |                                           The Partner address indicates the location of a Business Partner                                            |
|          Usuário/Contato           |           Tabela Direta           |                                                                         |        aduser\_aasset         |                                                              AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@                                                              | User within the system - Internal or Business Partner Contact |                     The User identifies a unique user in the system. This could be an internal user or a business partner contact                     |
|            Localizador             |         Locator (Armazém)         |                                                                         |       mlocator\_aasset        |                                                                                                                                                                      |                       Warehouse Locator                       |                                           The Locator indicates where in a Warehouse a product is located.                                            |
|     P.Negócios (Representante)     |              Tabela               |                     C\_BPartner Vendor or SalesRep                      |      cbpartnersr\_aasset      |                                                                                                                                                                      |             Business Partner (Agent or Sales Rep)             |                                                                                                                                                       |
|              Endereço              |      Localização (Endereço)       |                                                                         |       clocation\_aasset       |                                                                                                                                                                      |                      Location or Address                      |                                            The Location / Address field defines the location of an entity.                                            |
|     Comentário de localização      |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |    Additional comments or remarks concerning the location     |                                                                                                                                                       |
|              Em Poder              |              Sim-Não              |                                                                         |                               |                                                                                                                                                                      |            The asset is owned by the organization             |                                The asset may not be in possession, but the asset is legally owned by the organization                                 |
|               Lessor               |             Procurar              |                           C\_BPartner Vendors                           |     leasebpartner\_aasset     |                                                                                                                                                                      |           The Business Partner who rents or leases            |                                                                                                                                                       |
|         Lease Termination          |               Data                |                                                                         |                               |                                                                                                                                                                      |                    Lease Termination Date                     |                                                                  Last Date of Lease                                                                   |
|             Depreciar              |              Sim-Não              |                                                                         |                               |                                                                                                                                                                      |                 The asset will be depreciated                 |                                                 The asset is used internally and will be depreciated                                                  |
|       Totalmente depreciado        |              Sim-Não              |                                   (N)                                   |                               |                                                                                                                                                                      |                The asset is fully depreciated                 |                                                         The asset costs are fully amortized.                                                          |
|          Núm.Máx. de Usos          |              Inteiro              |                                                                         |                               |                                                                                                                                                                      |      Units of use until the asset is not usable anymore       |                                         Life use and the actual use may be used to calculate the depreciation                                         |
|           Número de Usos           |              Inteiro              |                                                                         |                               |                                                                                                                                                                      |              Currently used units of the assets               |                                                                                                                                                       |
|         Última Manutenção          |               Data                |                                                                         |                               |                                                                                                                                                                      |                     Last Maintenance Date                     |                                                                                                                                                       |
|           Última Unidade           |              Inteiro              |                                                                         |                               |                                                                                                                                                                      |                     Last Maintenance Unit                     |                                                                                                                                                       |
|         Última Observação          |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                     Last Maintenance Note                     |                                                                                                                                                       |
|         Próxima Manutenção         |               Data                |                                                                         |                               |                                                                                                                                                                      |                     Next Maintenence Date                     |                                                                                                                                                       |
|             Next Unit              |              Inteiro              |                                                                         |                               |                                                                                                                                                                      |                     Next Maintenence Unit                     |                                                                                                                                                       |
|          Status do Ativo           |               Lista               | Ativado Disponível Depreciado Novo Preservação Reformado Vendido ('NW') |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|          Data de Ativação          |               Data                |                                                                         |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |
|    Data da Depreciação do Ativo    |               Data                |                                                                         |                               |                                                                                                                                                                      |                   Date of last depreciation                   |                                    Date of the last deprecation, if the asset is used internally and depreciated.                                     |
|             Descartado             |              Sim-Não              |                                                                         |                               |                                                                                                                                                                      |                     The asset is disposed                     |                                                       The asset is no longer used and disposed                                                        |
|     Data do Descarte do Ativo      |               Data                |                                                                         |                               |                                                                                                                                                                      |              Date when the asset is/was disposed              |                                                                                                                                                       |
|            A\_Asset\_UU            |       Texto Curto (String)        |                                                                         |                               |                                                                                                                                                                      |                                                               |                                                                                                                                                       |

</div>

</div>

  

<div id="d9718e951" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Produto - A\_Asset\_Product

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Product_data)

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e964" class="table">

<div class="table-title">

Table 1.2. Product
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |    Valores (Padrão)     |        Chave restritiva         |        Regra de validação         |                Descrição                 |                                                       Comentário/Ajuda                                                       |
| :--------------------------------: | :------------------: | :---------------------: | :-----------------------------: | :-------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|          Produtos Ativos           |          ID          |                         |                                 |                                   |                                          |                                                                                                                              |
|              Empresa               |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                                 | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|            Organização             |    Tabela Direta     |     (@AD\_Org\_ID@)     |                                 |                                   |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|               Ativo                |       Procurar       |                         |      aasset\_aassetproduct      |                                   |  Asset used internally or by customers   | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|               Ativo                |       Sim-Não        |          ('Y')          |                                 |                                   |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|              Produto               |        Tabela        | M\_Product (no summary) |     mproduct\_aassetproduct     |                                   |          Product, Service, Item          |                          Identifies an item which is either purchased or sold in this organization.                          |
| Instância do Conjunto de Atributos | Atributo de Produto  |                         | mattributesetinstance\_aassetpr |                                   |      Product Attribute Set Instance      |       The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.       |
|             Quantidade             |      Quantidade      |           (0)           |                                 |                                   |                                          |                                                                                                                              |
|            Localizador             |  Locator (Armazém)   |                         |     mlocator\_aassetproduct     |                                   |            Warehouse Locator             |                               The Locator indicates where in a Warehouse a product is located.                               |
|             Descrição              | Texto Curto (String) |                         |                                 |                                   | Optional short description of the record |                                         A description is limited to 255 characters.                                          |
|       A\_Asset\_Product\_UU        | Texto Curto (String) |                         |                                 |                                   |                                          |                                                                                                                              |

</div>

</div>

  

<div id="d9718e1151" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Saldos Patrimoniais - A\_Depreciation\_Workfile

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Depreciation_Workfile_data)

<span class="emphasis">*Descrição:*</span> Relatório de Saldos
Patrimoniais e Ajustes

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e1168" class="table">

<div class="table-title">

Table 1.3. Asset Balances
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |                            Valores (Padrão)                             |        Chave restritiva         |                  Regra de validação                   |                   Descrição                   |                                                                          Comentário/Ajuda                                                                          |
| :------------------------------: | :------------------: | :---------------------------------------------------------------------: | :-----------------------------: | :---------------------------------------------------: | :-------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Calc. Acumulado Depr.       |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|            Valor Base            |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|         Curr. Dep. Exp.          |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|            Processado            |       Sim-Não        |                                   (N)                                   |                                 |                                                       |        The document has been processed        |                                                The Processed checkbox indicates that a document has been processed.                                                |
|  Modo de Financiamento do Ativo  |    Tabela Direta     |                                                                         | afundingmode\_adepreciationwork |                                                       |                                               |                                                                                                                                                                    |
|      Arquivo de Depreciação      |          ID          |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|      Ano Corrente do Ativo       |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|       Período da Previsão        |        Número        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|  Prior. Year Accumulated Depr.   |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|    Contribuição de terceiros     |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|       Contribuição Própria       |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|              Ativo               |       Sim-Não        |                                                                         |                                 |                                                       |      (semelhante ao primeiro relatório)       |                                                                        (ver o mesmo acima)                                                                         |
|        Tipo Financiamento        |        Lista         |                     Cofinantare Proprie Terti ('P')                     |                                 |                                                       |                Financing Type                 |                                                                                                                                                                    |
|   Data da Depreciação do Ativo   |         Data         |                                                                         |                                 |                                                       |           Date of last depreciation           |                                           Date of the last deprecation, if the asset is used internally and depreciated.                                           |
|     Período de Vida (fiscal)     |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|            Quantidade            |        Número        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|      Anos de Vida (fiscal)       |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|         Período Postado          |       Inteiro        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|         Período de Vida          |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|      Anos de Vida do Ativo       |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|             Empresa              |    Tabela Direta     |                                                                         |                                 |           AD\_Client.AD\_Client\_ID \< \> 0           |      (semelhante ao primeiro relatório)       |                                                                        (ver o mesmo acima)                                                                         |
|           Organização            |    Tabela Direta     |                                                                         |                                 | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |      (semelhante ao primeiro relatório)       |                                                                        (ver o mesmo acima)                                                                         |
|              Ativo               |       Procurar       |                                                                         |  aasset\_adepreciationworkfile  |                                                       |     Asset used internally or by customers     |                    An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                    |
|            Descrição             | Texto Curto (String) |                                                                         |                                 |                                                       |   Optional short description of the record    |                                                            A description is limited to 255 characters.                                                             |
|          Custo do Ativo          |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|        Tipo de Lançamento        |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas ('A') |                                 |                                                       | The type of posted amount for the transaction |                       The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                        |
|           Valor Salvo            |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|      Depreciação Acumulada       |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|  Depreciação Acumulada (fiscal)  |        Valor         |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|     Quantidade Remanescente      |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
| Quantidade Remanescente (fiscal) |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|       SL Despesa / Período       |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|  SL Despesa / Período (fiscal)   |        Valor         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|      Períodos de Vida (min)      |       Inteiro        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|      Períodos de Vida (max)      |       Inteiro        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|         Vida Útil - Anos         |       Inteiro        |                                   (0)                                   |                                 |                                                       |     Years of the usable life of the asset     |                                                                                                                                                                    |
|     Use Vida - Anos (fiscal)     |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|        Vida Útil - Meses         |       Inteiro        |                                   (0)                                   |                                 |                                                       |    Months of the usable life of the asset     |                                                                                                                                                                    |
|    Use Vida - Meses (fiscal)     |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|            Depreciar             |       Sim-Não        |                                                                         |                                 |                                                       |         The asset will be depreciated         |                                                        The asset is used internally and will be depreciated                                                        |
|          Current Period          |       Inteiro        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |
|           Account Date           |         Data         |                                                                         |                                 |                                                       |                Accounting Date                | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|      Atualizar Depreciação       |        Botão         |                                   (N)                                   |                                 |                                                       |                                               |                                                                                                                                                                    |
|  A\_Depreciation\_Workfile\_UU   | Texto Curto (String) |                                                                         |                                 |                                                       |                                               |                                                                                                                                                                    |

</div>

</div>

  

<div id="d9718e1831" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Configurações Contábeis - A\_Asset\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Acct_data)

<span class="emphasis">*Descrição:*</span> Digite as informações de
configuração da contabilidade

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e1848" class="table">

<div class="table-title">

Table 1.4. Accounting Setup
Fields

</div>

<div class="table-contents">

|                        Nome do campo                         |      Referência      |                            Valores (Padrão)                             |        Chave restritiva         |                Regra de validação                |                   Descrição                   |                                                       Comentário/Ajuda                                                       |
| :----------------------------------------------------------: | :------------------: | :---------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :-------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|                        Conta do Ativo                        |          ID          |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                            Ativo                             |       Sim-Não        |                                                                         |                                 |                                                  |      (semelhante ao primeiro relatório)       |                                                     (ver o mesmo acima)                                                      |
|                    Dividir em Percentagem                    |        Número        |                                   (1)                                   |                                 |                                                  |                                               |                                                                                                                              |
|                Despesa de Reavaliação Offset                 |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|              Percentual Variável da Depreciação              |        Número        |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|               Tipo de Cálculo para Depreciação               |        Tabela        |                         A\_Depreciation\_Method                         | adepreciationmethod\_aassetacct |                                                  |                                               |                                                                                                                              |
|                      Tipo de Convenção                       |        Tabela        |                            A\_ConventionType                            |  adepreciationconv\_aassetacct  |                                                  |                                               |                                                                                                                              |
|           Reaval de Custos Offset da Conta Prévia            |        Conta         |                                                                         | arevalcostoffsetprior\_aassetac |                                                  |                                               |                                                                                                                              |
|              Reaval. de Custos Offset da Conta               |        Conta         |                                                                         |  arevalcostoffset\_aassetacct   |                                                  |                                               |                                                                                                                              |
|              A\_Reval\_Accumdep\_Offset\_Prior               |        Conta         |                                                                         | arevaladepoffsetprior\_aassetac |                                                  |                                               |                                                                                                                              |
|               A\_Reval\_Accumdep\_Offset\_Cur                |        Conta         |                                                                         | arevaladepoffsetcur\_aassetacct |                                                  |                                               |                                                                                                                              |
|                Reaval. Depexp Offset da Conta                |        Conta         |                                                                         | arevaldepexpoffset\_aassetacct  |                                                  |                                               |                                                                                                                              |
|                Método de Depreciação (fiscal)                |        Tabela        |                         A\_Depreciation\_Method                         | adepreciationmethodf\_aassetacc |                                                  |                                               |                                                                                                                              |
|              Convenção da Depreciação (fiscal)               |        Tabela        |                            A\_ConventionType                            | adepreciationconvf\_aassetacct  |                                                  |                                               |                                                                                                                              |
|                 Percentual Variável (fiscal)                 |        Número        |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                      A\_Asset\_Acct\_UU                      | Texto Curto (String) |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|      Reavaliação de Custos Offset da Para o Ano Prévio       |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|       Reavaliação de Custos Offset da Para o Ano Atual       |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|               Método de Cálculo de Reavaliação               |        Lista         |                 Default Inception to date Year Balances                 |                                 |                                                  |                                               |                                                                                                                              |
|  Reavaliação Depreciação Acumulada Offset para Ano Anterior  |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
| Reavaliação Offset da Depreciação Acumulada Para o Ano Atual |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                        Período Início                        |       Inteiro        |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                         Período Fim                          |       Inteiro        |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                     Receita a Disposição                     |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                       Perda de Cessão                        |        Conta         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                           Empresa                            |    Tabela Direta     |                               AD\_Client                                |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)       |                                                     (ver o mesmo acima)                                                      |
|                         Organização                          |    Tabela Direta     |                              AD\_Org (all)                              |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)       |                                                     (ver o mesmo acima)                                                      |
|                       Esquema Contábil                       |    Tabela Direta     |                                                                         |     cacctschema\_aassetacct     |                                                  |             Rules for accounting              |           An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar            |
|                            Ativo                             |       Procurar       |                                                                         |       aasset\_aassetacct        |                                                  |     Asset used internally or by customers     | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|                         Válido desde                         |         Data         |                                                                         |                                 |                                                  |  Valid from including this date (first day)   |                                 The Valid From date indicates the first day of a date range                                  |
|                         Valor Salvo                          |        Valor         |                                   (0)                                   |                                 |                                                  |                                               |                                                                                                                              |
|                      Tipo de Lançamento                      |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas ('A') |                                 |                                                  | The type of posted amount for the transaction |    The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.     |
|                 Atualizar Contas de Despesa                  |        Botão         |                                                                         |                                 |                                                  |                                               |                                                                                                                              |
|                     Tipo de Depreciação                      |        Tabela        |                          A\_Depreciation\_Type                          |    adepreciation\_aassetacct    |                                                  |                                               |                                                                                                                              |
|                     Depreciação (fiscal)                     |        Tabela        |                          A\_Depreciation\_Type                          |   adepreciationf\_aassetacct    |                                                  |                                               |                                                                                                                              |
|                      Conta Custo Ativo                       |        Conta         |                                                                         |      aassetvc\_aassetacct       |                                                  |                                               |                                                                                                                              |
|                    Depreciação Acumulada                     |        Conta         |                                                                         | aaccumdepreciation\_aassetacct  |                                                  |                                               |                                                                                                                              |
|                 Conta Despesa de Depreciação                 |        Conta         |                                                                         |   adepreciationvc\_aassetacct   |                                                  |                                               |                                                                                                                              |
|                  Conta Receita a Disposição                  |        Conta         |                                                                         |  adisposalrevenue\_aassetacct   |                                                  |                                               |                                                                                                                              |
|                   Conta Perda a Disposição                   |        Conta         |                                                                         |    adisposalloss\_aassetacct    |                                                  |                                               |                                                                                                                              |

</div>

</div>

  

<div id="d9718e2448" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Ativação/Adição - A\_Asset\_Addition

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Ativação/Adição

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e2463" class="table">

<div class="table-title">

Table 1.5. Activation/Addition
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |                                                                     Valores (Padrão)                                                                     |        Chave restritiva         |                                             Regra de validação                                             |                   Descrição                   |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :--------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :--------------------------------------------------------------------------------------------------------: | :-------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Lançado               |        Botão         |                                                                    \_Posted Status(N)                                                                    |                                 |                                                                                                            |                Posting status                 |                                                                                                                                                                                                                                                                                                                   The Posted field indicates the status of the Generation of General Ledger Accounting Lines                                                                                                                                                                                                                                                                                                                    |
|         Tipo de Conversão          |    Tabela Direta     |                                                                                                                                                          | cconversiontype\_aassetaddition |                                                                                                            |         Currency Conversion Rate Type         |                                                                                                                                                                                                                                                                                                     The Currency Conversion Rate Type lets you define different type of rates, e.g. Spot, Corporate and/or Sell/Buy rates.                                                                                                                                                                                                                                                                                                      |
|              Aprovado              |       Sim-Não        |                                                                 (@\#IsCanApproveOwnDoc@)                                                                 |                                 |                                                                                                            | Indicates if this document requires approval  |                                                                                                                                                                                                                                                                                                                 The Approved checkbox indicates if this document requires approval before it can be processed.                                                                                                                                                                                                                                                                                                                  |
|               Ativo                |       Sim-Não        |                                                                                                                                                          |                                 |                                                                                                            |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|          Processar Agora           |       Sim-Não        |                                                                                                                                                          |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|   Ajustar Depreciação Acumulada    |       Sim-Não        |                                                                           (N)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|                Taxa                |        Número        |                                                                                                                                                          |                                 |                                                                                                            |           Currency Conversion Rate            |                                                                                                                                                                                                                                                                                                      The Currency Conversion Rate indicates the rate to use when converting the source currency to the accounting currency                                                                                                                                                                                                                                                                                                      |
|           Período Início           |       Inteiro        |                                                                           (0)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          Adição de Ativo           |          ID          |                                                                                                                                                          |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Lote Diário             |    Tabela Direta     |                                                                                                                                                          | gljournalbatch\_aassetaddition  |                                                                                                            |         General Ledger Journal Batch          |                                                                                                                                                                                                                                                                                                                   The General Ledger Journal Batch identifies a group of journals to be processed as a group.                                                                                                                                                                                                                                                                                                                   |
|             Linha Núm.             |       Inteiro        |                                                                                                                                                          |                                 |                                                                                                            |         Unique line for this document         |                                                                                                                                                                                                                                                                                                        Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                                                                                                                                                                                                                                                         |
|              Empresa               |    Tabela Direta     |                                                                    (@AD\_Client\_ID@)                                                                    |                                 |                                     AD\_Client.AD\_Client\_ID \< \> 0                                      |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|            Organização             |    Tabela Direta     |                                                                     (@AD\_Org\_ID@)                                                                      |                                 |                           AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                            |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|        Número do Documento         | Texto Curto (String) |                                                                DocumentNo Invoice Vendor                                                                 |                                 |                                                                                                            |   Document sequence number of the document    | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|        Ativos Relacionados?        |       Sim-Não        |                                                                          ('N')                                                                           |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|               Ativo                |       Procurar       |                                                                                                                                                          |     aasset\_aassetaddition      |                                                                                                            |     Asset used internally or by customers     |                                                                                                                                                                                                                                                                                                  An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                                                                                                                                                                                                                                                   |
|         Data do Documento          |         Data         |                                                                        (@\#Date@)                                                                        |                                 |                                                                                                            |             Date of the Document              |                                                                                                                                                                                                                                                                                                     The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                                                                                                                                                                                                                                                                                      |
|           Data da Conta            |         Data         |                                                                        (@\#Date@)                                                                        |                                 |                                                                                                            |                Accounting Date                |                                                                                                                                                                                                                                                                               The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.                                                                                                                                                                                                                                                                                |
|         Tipo de Lançamento         |        Lista         |                                          Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A)                                           |                                 |                                                                                                            | The type of posted amount for the transaction |                                                                                                                                                                                                                                                                                                      The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                                                                                                                                                                                                                                                                                                      |
|           Tipo de Ativo            |        Lista         |                                                                  Ativo Despesa ('Cap')                                                                   |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          Fonte de Entrada          |        Lista         |                                                  Imported Invoice Journal Entry Manual Project ('INV')                                                   |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|               Fatura               |       Procurar       |                                                                                                                                                          |    cinvoice\_aassetaddition     |                                                                                                            |              Invoice Identifier               |                                                                                                                                                                                                                                                                                                                                                      The Invoice Document.                                                                                                                                                                                                                                                                                                                                                      |
|          Linha de Fatura           |       Procurar       |                                                                                                                                                          |  cinvoiceline\_aassetaddition   |                            <span class="emphasis">*ReadOnly Logic*</span>: 1=1                             |              Invoice Detail Line              |                                                                                                                                                                                                                                                                                                                                The Invoice Line uniquely identifies a single line of an Invoice.                                                                                                                                                                                                                                                                                                                                |
|         Confrontar Fatura          |       Procurar       |                                                              M\_MatchInv for Asset Addition                                                              |    mmatchinv\_aassetaddition    |                                              A\_Processed='N'                                              |       Match Shipment/Receipt to Invoice       |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|    Linha de Remessa/Recebimento    |       Procurar       |                                                                                                                                                          |   minoutline\_aassetaddition    |                            <span class="emphasis">*ReadOnly Logic*</span>: 1=1                             |     Line on Shipment or Receipt document      |                                                                                                                                                                                                                                                                                                                        The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                                                                                                                                                                                                                                                                                         |
|              Projeto               |       Procurar       |                                                                                                                                                          |    cproject\_aassetaddition     |                    C\_Project.IsSummary='N' AND C\_Project.ProjectCategory IN ('W','A')                    |               Financial Project               |                                                                                                                                                                                                                                                                                                                           A Project allows you to track and control internal or external activities.                                                                                                                                                                                                                                                                                                                            |
|             Finalidade             |       Procurar       |                                                                                                                                                          |     ccharge\_aassetaddition     |                                                                                                            |          Additional document charges          |                                                                                                                                                                                                                                                                                                                             The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                                                                                                                                                                                                                                                                                                              |
|        Importar Ativo Fixo         |    Tabela Direta     |                                                                                                                                                          |   ifixedasset\_aassetaddition   |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Produto               |       Procurar       |                                                                 M\_Product (no summary)                                                                  |    mproduct\_aassetaddition     |                   <span class="emphasis">*ReadOnly Logic*</span>: @A\_SourceType@='INV'                    |            Product, Service, Item             |                                                                                                                                                                                                                                                                                                                           Identifies an item which is either purchased or sold in this organization.                                                                                                                                                                                                                                                                                                                            |
| Instância do Conjunto de Atributos | Atributo de Produto  |                                                                                                                                                          | mattributesetinstance\_aassetad |                                                                                                            |        Product Attribute Set Instance         |                                                                                                                                                                                                                                                                                                        The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                                                                                                                                                                                                                                                                                         |
|            Localizador             |  Locator (Armazém)   |                                                                                                                                                          |    mlocator\_aassetaddition     | M\_Locator.AD\_Org\_ID=@AD\_Org\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @A\_SourceType@='INV' |               Warehouse Locator               |                                                                                                                                                                                                                                                                                                                                The Locator indicates where in a Warehouse a product is located.                                                                                                                                                                                                                                                                                                                                 |
|             Descrição              | Texto Curto (String) |                                                                                                                                                          |                                 |                                                                                                            |   Optional short description of the record    |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|          Valor de Origem           |        Valor         |                                                                                                                                                          |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|           Valor do Ativo           |        Valor         |                                                                                                                                                          |                                 |                                                                                                            |            Book Value of the asset            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Valor do Bem            |        Valor         |                                                                           (0)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Moeda De              |    Tabela Direta     |                                                                                                                                                          |    ccurrency\_aassetaddition    |                                                                                                            |         The Currency for this record          |                                                                                                                                                                                                                                                                                                                          Indicates the Currency to be used when processing or reporting on this record                                                                                                                                                                                                                                                                                                                          |
|             Quantidade             |        Número        |                                                                           (0)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Depreciação Acumulada        |        Valor         |                                                                           (0)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|   Depreciação Acumulada (fiscal)   |        Valor         |                                                                           (0)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|        Anos de Depreciação         |       Inteiro        |                                                                           (0)                                                                            |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Uso em Anos de Vida Delta (fiscal) |       Inteiro        |                                                                           (0)                                                                            |                                 |                                                                                                            |         Delta Use Life Years (fiscal)         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Períodos de Vida (min)       |       Inteiro        |                                                                                                                                                          |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Períodos de Vida (max)       |       Inteiro        |                                                                                                                                                          |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|             Processado             |       Sim-Não        |                                                                          ('N')                                                                           |                                 |                                                                                                            |        The document has been processed        |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|        Estado do Documento         |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento ('DR') |                                 |                                                                                                            |      The current status of the document       |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|       Asset Addition Process       |        Botão         |                                                                 \_Document Action('CO')                                                                  |                                 |                                                                                                            |      The targeted status of the document      |                                                                                                                                                                                                                                                                                                                   You find the current status in the Document Status field. The options are listed in a popup                                                                                                                                                                                                                                                                                                                   |
|       A\_Asset\_Addition\_UU       | Texto Curto (String) |                                                                                                                                                          |                                 |                                                                                                            |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d9718e3185" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Detalhes de Custo - A\_Asset\_Addition

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Addition_data)

<span class="emphasis">*Descrição:*</span> Detalhe do Custo

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e3198" class="table">

<div class="table-title">

Table 1.6. Cost Details
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |                           Valores (Padrão)                            |        Chave restritiva        |                  Regra de validação                   |                   Descrição                   |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :--------------------------: | :------------------: | :-------------------------------------------------------------------: | :----------------------------: | :---------------------------------------------------: | :-------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Linha de Remessa/Recebimento |       Procurar       |                                                                       |   minoutline\_aassetaddition   |  <span class="emphasis">*ReadOnly Logic*</span>: 1=1  |     Line on Shipment or Receipt document      |                                                                                                                                                                                                                                                                                                                        The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                                                                                                                                                                                                                                                                                         |
|       Adição de Ativo        |          ID          |                                                                       |                                |                                                       |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Ativo             |       Sim-Não        |                                                                       |                                |                                                       |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|           Empresa            |    Tabela Direta     |                          (@AD\_Client\_ID@)                           |                                |           AD\_Client.AD\_Client\_ID \< \> 0           |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|         Organização          |    Tabela Direta     |                            (@AD\_Org\_ID@)                            |                                | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Número do Documento      | Texto Curto (String) |                       DocumentNo Invoice Vendor                       |                                |                                                       |   Document sequence number of the document    | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|            Ativo             |       Procurar       |                                                                       |     aasset\_aassetaddition     |                                                       |     Asset used internally or by customers     |                                                                                                                                                                                                                                                                                                  An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                                                                                                                                                                                                                                                   |
|      Tipo de Lançamento      |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A) |                                |                                                       | The type of posted amount for the transaction |                                                                                                                                                                                                                                                                                                      The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                                                                                                                                                                                                                                                                                                      |
|        Tipo de Ativo         |        Lista         |                         Ativo Despesa ('Cap')                         |                                |                                                       |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|       Fonte de Entrada       |        Lista         |         Imported Invoice Journal Entry Manual Project ('INV')         |                                |                                                       |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|         Lote Diário          |    Tabela Direta     |                                                                       | gljournalbatch\_aassetaddition |                                                       |         General Ledger Journal Batch          |                                                                                                                                                                                                                                                                                                                   The General Ledger Journal Batch identifies a group of journals to be processed as a group.                                                                                                                                                                                                                                                                                                                   |
|            Fatura            |       Procurar       |                                                                       |    cinvoice\_aassetaddition    |                                                       |              Invoice Identifier               |                                                                                                                                                                                                                                                                                                                                                      The Invoice Document.                                                                                                                                                                                                                                                                                                                                                      |
|          Linha Núm.          |       Inteiro        |                                                                       |                                |                                                       |         Unique line for this document         |                                                                                                                                                                                                                                                                                                        Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                                                                                                                                                                                                                                                         |
|          Descrição           | Texto Curto (String) |                                                                       |                                |                                                       |   Optional short description of the record    |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|        Valor do Ativo        |        Valor         |                                                                       |                                |                                                       |            Book Value of the asset            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          Quantidade          |        Número        |                                  (0)                                  |                                |                                                       |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d9718e3460" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Disponível - A\_Asset\_Disposed

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Disposed_data)

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e3473" class="table">

<div class="table-title">

Table 1.7. Disposal
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      |                               Valores (Padrão)                                |      Chave restritiva       |                  Regra de validação                   |               Descrição               |                                                                          Comentário/Ajuda                                                                          |
| :------------------------: | :------------------: | :---------------------------------------------------------------------------: | :-------------------------: | :---------------------------------------------------: | :-----------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Asset Disposed       |          ID          |                                                                               |                             |                                                       |                                       |                                                                                                                                                                    |
| Código de Razão Disponivel |        Lista         |        Doação Destruído Descartado Vendido Vendido por Terceiro Roubo         |                             |                                                       |                                       |                                                                                                                                                                    |
|    Período (Ano Fiscal)    |        Tabela        |                               C\_Period (Open)                                |   cperiod\_aassetdisposed   |                                                       |        Period of the Calendar         |                                                  The Period indicates an exclusive range of dates for a calendar.                                                  |
|      Processar Agora       |        Botão         |                                                                               |                             |                                                       |                                       |                                                                                                                                                                    |
|          Empresa           |    Tabela Direta     |                                  AD\_Client                                   |                             |           AD\_Client.AD\_Client\_ID \< \> 0           |  (semelhante ao primeiro relatório)   |                                                                        (ver o mesmo acima)                                                                         |
|        Organização         |    Tabela Direta     |                                 AD\_Org (Trx)                                 |                             | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |  (semelhante ao primeiro relatório)   |                                                                        (ver o mesmo acima)                                                                         |
|           Ativo            |       Procurar       |                                                                               |   aasset\_aassetdisposed    |     Processed='Y' AND A\_Asset\_Status\< \> 'DI'      | Asset used internally or by customers |                    An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                    |
|       Tipo de Baixa        |        Lista         | Cash Cash\_ Partial Retirement Preservation Simple Simples Venda Trade w/cash |                             |                                                       |                                       |                                                                                                                                                                    |
|     Data a Disposição      |         Data         |                                                                               |                             |                                                       |                                       |                                                                                                                                                                    |
|     Data do Documento      |         Data         |                                   (@Date@)                                    |                             |                                                       |         Date of the Document          |                       The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                       |
|       Data da Conta        |         Data         |                                   (@Date@)                                    |                             |                                                       |            Accounting Date            | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|         Proventos          |        Valor         |                                                                               |                             |                                                       |                                       |                                                                                                                                                                    |
|       Ativo Comércio       |        Tabela        |                                 A\_Asset\_ID                                  | aassettrade\_aassetdisposed |                                                       |                                       |                                                                                                                                                                    |
|           Ativo            |       Sim-Não        |                                                                               |                             |                                                       |  (semelhante ao primeiro relatório)   |                                                                        (ver o mesmo acima)                                                                         |
|         Processado         |       Sim-Não        |                                                                               |                             |                                                       |    The document has been processed    |                                                The Processed checkbox indicates that a document has been processed.                                                |
|   A\_Asset\_Disposed\_UU   | Texto Curto (String) |                                                                               |                             |                                                       |                                       |                                                                                                                                                                    |

</div>

</div>

  

<div id="d9718e3733" class="section section">

<div class="titlepage">

<div>

<div>

## 8. Tabela: Métrica de Prevenção - MP\_AssetMeter

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_AssetMeter_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e3742" class="table">

<div class="table-title">

Table 1.8. Asset Meter
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      | Valores (Padrão) |    Chave restritiva    | Regra de validação |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :--------------: | :--------------------: | :----------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Métrica de Prevenção |          ID          |                  |                        |                    |                                          |                                                                                                                                              |
|  Data da Transação   |      Data+Hora       |    (@\#Date@)    |                        |                    |             Transaction Date             |                                         The Transaction Date indicates the date of the transaction.                                          |
|  MP\_AssetMeter\_UU  | Texto Curto (String) |                  |                        |                    |                                          |                                                                                                                                              |
|       Empresa        |    Tabela Direta     |                  | ADClient\_MPAssetMeter |                    |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |                  |  ADOrg\_MPAssetMeter   |                    |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Ativo         |    Tabela Direta     |                  |  AAsset\_MPAssetMeter  |                    |  Asset used internally or by customers   |         An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.         |
|        Ativo         |       Sim-Não        |                  |                        |                    |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca    | Texto Curto (String) |                  |                        |                    |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                  |                        |                    |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| Métrica de Prevenção |        Tabela        |    MP\_Meter     | MPMeter\_MPAssetMeter  |                    |                                          |                                                                                                                                              |
|      Descrição       | Texto Curto (String) |                  |                        |                    | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Valor         |        Número        |       (0)        |                        |                    |                  Amount                  |                                                                    Amount                                                                    |
|     Valor Total      |        Número        |       (0)        |                        |                    |               Total Amount               |                                            The Total Amount indicates the total document amount.                                             |

</div>

</div>

  

<div id="d9718e3956" class="section section">

<div class="titlepage">

<div>

<div>

## 9. Tabela: Apontamento de Métricas - MP\_AssetMeter\_Log

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_AssetMeter_Log_data)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d9718e3965" class="table">

<div class="table-title">

Table 1.9. Meter Log
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      | Valores (Padrão) |       Chave restritiva        | Regra de validação |                Descrição                 |                      Comentário/Ajuda                       |
| :---------------------: | :------------------: | :--------------: | :---------------------------: | :----------------: | :--------------------------------------: | :---------------------------------------------------------: |
| Apontamento de Métricas |          ID          |                  |                               |                    |                                          |                                                             |
|         Empresa         |    Tabela Direta     |                  |   ADClient\_MPAssetMeterLog   |                    |    (semelhante ao primeiro relatório)    |                     (ver o mesmo acima)                     |
|       Organização       |    Tabela Direta     |                  |    ADOrg\_MPAssetMeterLog     |                    |    (semelhante ao primeiro relatório)    |                     (ver o mesmo acima)                     |
|  Métrica de Prevenção   |        Tabela        |  MP\_AssetMeter  | MPAssetMeter\_MPAssetMeterLog |                    |                                          |                                                             |
|    Ordem de Trabalho    |    Tabela Direta     |                  |     MPOT\_MPAssetMeterLog     |                    |                                          |                                                             |
|     Chave de Busca      | Texto Curto (String) |                  |                               |                    |    (semelhante ao primeiro relatório)    |                     (ver o mesmo acima)                     |
|          Ativo          |       Sim-Não        |                  |                               |                    |    (semelhante ao primeiro relatório)    |                     (ver o mesmo acima)                     |
|        Descrição        | Texto Curto (String) |                  |                               |                    | Optional short description of the record |         A description is limited to 255 characters.         |
|    Data da Transação    |      Data+Hora       |                  |                               |                    |             Transaction Date             | The Transaction Date indicates the date of the transaction. |
|          Valor          |        Valor         |                  |                               |                    |                  Amount                  |                           Amount                            |
|       Valor Total       |        Número        |                  |                               |                    |               Total Amount               |    The Total Amount indicates the total document amount.    |

</div>

</div>

  

<div id="d9718e4148" class="section section">

<div class="titlepage">

<div>

<div>

## 10. Tabela: Entrega - A\_Asset\_Delivery

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Entrega ou Disponibilidade

<span class="emphasis">*Comentário/Ajuda:* </span> Registro de Entrega
ou Disponibilidade

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e4163" class="table">

<div class="table-title">

Table 1.10. Delivery
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |                           Descrição                           |                                                                                                  Comentário/Ajuda                                                                                                  |
| :--------------------------: | :------------------: | :----------------: | :------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Ativo             |       Sim-Não        |        (Y)         |                            |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                (ver o mesmo acima)                                                                                                 |
|       Remessa de Ativo       |          ID          |                    |                            |                                                  |                       Delivery of Asset                       |                                                                         The availability of the asset to the business partner (customer).                                                                          |
|           Empresa            |    Tabela Direta     | (@AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                (ver o mesmo acima)                                                                                                 |
|         Organização          |    Tabela Direta     |  (@AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                (ver o mesmo acima)                                                                                                 |
|            Ativo             |       Procurar       |                    |   aasset\_aassetdelivery   |                                                  |             Asset used internally or by customers             |                                            An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                            |
|     Download de Produto      |    Tabela Direta     |                    | mproductdl\_aassetdelivery |                                                  |                       Product downloads                       |                                                             Define download for a product. If the product is an asset, the user can download the data.                                                             |
|     Data da Movimentação     |      Data+Hora       |                    |                            |                                                  |        Date a product was moved in or out of inventory        |                                 The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement.                                 |
|       Usuário/Contato        |       Procurar       |                    |   aduser\_aassetdelivery   |                                                  | User within the system - Internal or Business Partner Contact |                                                   The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                    |
|          Descrição           | Texto Curto (String) |                    |                            |                                                  |           Optional short description of the record            |                                                                                    A description is limited to 255 characters.                                                                                     |
|        Núm. da Versão        | Texto Curto (String) |                    |                            |                                                  |                        Version Number                         |                                                                                                                                                                                                                    |
|          Lote Núm.           | Texto Curto (String) |                    |                            |                                                  |                   Lot number (alphanumeric)                   |                                                                       The Lot Number indicates the specific lot that a product was part of.                                                                        |
|          Núm. Série          | Texto Curto (String) |                    |                            |                                                  |                     Product Serial Number                     |                                                       The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                                                       |
| Linha de Remessa/Recebimento |       Procurar       |                    |  moutline\_aassetdelivery  |                                                  |             Line on Shipment or Receipt document              |                                                                  The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                                  |
|      Endereço de e-mail      | Texto Curto (String) |                    |                            |                                                  |                    Electronic Mail Address                    | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|        ID da Mensagem        | Texto Curto (String) |                    |                            |                                                  |                       EMail Message ID                        |                                                                                       SMTP Message ID for tracking purposes                                                                                        |
|    Confirmação de Entrega    | Texto Curto (String) |                    |                            |                                                  |                  EMail Delivery confirmation                  |                                                                                                                                                                                                                    |
|             URL              |         URL          |                    |                            |                                                  |       Full URL address - e.g. http://www.idempiere.org        |                                                                    The URL defines an fully qualified web address like http://www.idempiere.org                                                                    |
|          Referência          | Texto Curto (String) |                    |                            |                                                  |                     Referring web address                     |                                                                                                                                                                                                                    |
|          End.Remoto          | Texto Curto (String) |                    |                            |                                                  |                        Remote Address                         |                                                                          The Remote Address indicates an alternative or external address.                                                                          |
|      Hospedeiro Remoto       | Texto Curto (String) |                    |                            |                                                  |                       Remote host Info                        |                                                                                                                                                                                                                    |

</div>

</div>

  

<div id="d9718e4474" class="section section">

<div class="titlepage">

<div>

<div>

## 11. Tabela: Uso de Ativo - A\_Asset\_Use

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Registro de Uso de Ativos

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e4485" class="table">

<div class="table-title">

Table 1.11. Asset Usage
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |       Valores (Padrão)       | Chave restritiva  |                  Regra de validação                   |                Descrição                 |                                                       Comentário/Ajuda                                                       |
| :------------: | :------------------: | :--------------------------: | :---------------: | :---------------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|  Uso do Ativo  |          ID          |                              |                   |                                                       |                                          |                                                                                                                              |
|     Ativo      |       Sim-Não        |                              |                   |                                                       |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|    Empresa     |    Tabela Direta     |      (@AD\_Client\_ID@)      |                   |           AD\_Client.AD\_Client\_ID \< \> 0           |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|  Organização   |    Tabela Direta     |       (@AD\_Org\_ID@)        |                   | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|     Ativo      |       Procurar       | A\_Asset\_ID(@A\_Asset\_ID@) | aasset\_aassetuse |                                                       |  Asset used internally or by customers   | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|   DataUsada    |         Data         |                              |                   |                                                       |                                          |                                                                                                                              |
| Número de Usos |       Inteiro        |                              |                   |                                                       |    Currently used units of the assets    |                                                                                                                              |
|   Descrição    | Texto Curto (String) |                              |                   |                                                       | Optional short description of the record |                                         A description is limited to 255 characters.                                          |

</div>

</div>

  

<div id="d9718e4628" class="section section">

<div class="titlepage">

<div>

<div>

## 12. Tabela: Histórico de Ativo - A\_Asset\_Change

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Change_data)

<span class="emphasis">*Descrição:*</span> Detalhes do histórico de
transações de Ativos

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e4641" class="table">

<div class="table-title">

Table 1.12. Asset History
Fields

</div>

<div class="table-contents">

|                        Nome do campo                         |       Referência       |                                                  Valores (Padrão)                                                   |        Chave restritiva         |        Regra de validação         |                           Descrição                           |                                                                          Comentário/Ajuda                                                                          |
| :----------------------------------------------------------: | :--------------------: | :-----------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :-------------------------------: | :-----------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                        Conta do Ativo                        |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                       Adição de Ativo                        |           ID           |                                                                                                                     |      aaaddition\_aachange       |                                   |                                                               |                                                                                                                                                                    |
|                        Data da Troca                         |       Data+Hora        |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                     A\_Asset\_Change\_UU                     |  Texto Curto (String)  |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                          Combinação                          |         Conta          |                                                                                                                     |  cvalidcombinati\_aassetchange  |                                   |                   Valid Account Combination                   |                                      The Combination identifies a valid combination of element which represent a GL account.                                       |
|                       Ativo Aposentado                       |           ID           |                                                                                                                     |     aaretirement\_aachange      |                                   |           Internally used asset is not longer used.           |                                                                                                                                                                    |
|                            Ativo                             |        Sim-Não         |                                                                                                                     |                                 |                                   |              (semelhante ao primeiro relatório)               |                                                                        (ver o mesmo acima)                                                                         |
|                           Empresa                            |     Tabela Direta      |                                                                                                                     |                                 | AD\_Client.AD\_Client\_ID \< \> 0 |              (semelhante ao primeiro relatório)               |                                                                        (ver o mesmo acima)                                                                         |
|                         Organização                          |     Tabela Direta      |                                                                                                                     |                                 |                                   |              (semelhante ao primeiro relatório)               |                                                                        (ver o mesmo acima)                                                                         |
|                            Ativo                             |        Procurar        |                                                                                                                     |      aasset\_aassetchange       |                                   |             Asset used internally or by customers             |                    An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                    |
|                           Detalhes                           |  Texto Curto (String)  |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                      Tipo de Lançamento                      |         Lista          |                       Real Orçamento Encerramento Comprometimento Reservas Estatísticas ('A')                       |                                 |                                   |         The type of posted amount for the transaction         |                       The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                        |
|                        Altera o Tipo                         |         Lista          | Addition Balance Create Depreciation Disposal Expense Forecast Import Revaluation Setup Split Transfer Update Usage |                                 |                                   |                                                               |                                                                                                                                                                    |
|                            Criado                            |       Data+Hora        |                                                      (SYSDATE)                                                      |                                 |                                   |                 Date this record was created                  |                                                 The Created field indicates the date that this record was created.                                                 |
|                        Atualizado por                        |         Tabela         |                                                      AD\_User                                                       |                                 |                                   |                 User who updated this records                 |                                                  The Updated By field indicates the user who updated this record.                                                  |
|                       Esquema Contábil                       |     Tabela Direta      |                                                                                                                     |    cacctschema\_aassetchange    |                                   |                     Rules for accounting                      |                              An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                               |
|                        Período Início                        |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                         Período Fim                          |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                     Tipo de Depreciação                      |         Tabela         |                                                A\_Depreciation\_Type                                                |                                 |                                   |                                                               |                                                                                                                                                                    |
|                 Valor Manual de Depreciação                  |         Valor          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|               Quantidade Manual de Depreciação               |         Lista          |                                                    Period Yearly                                                    |                                 |                                   |                                                               |                                                                                                                                                                    |
|              Percentual Variável da Depreciação              |         Número         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|              Cabeçalho da Tabela de Depreciação              |         Tabela         |                                            A\_Depreciation\_Table\_Codes                                            | adepreciationtableheader\_aass2 |                                   |                                                               |                                                                                                                                                                    |
|               Tipo de Cálculo para Depreciação               |         Tabela         |                                               A\_Depreciation\_Method                                               |                                 |                                   |                                                               |                                                                                                                                                                    |
|                      Asset Spread Type                       |         Tabela         |                                                  A\_Asset\_Spread                                                   |                                 |                                   |                                                               |                                                                                                                                                                    |
|                      Tipo de Convenção                       |         Tabela         |                                                  A\_ConventionType                                                  |                                 |                                   |                                                               |                                                                                                                                                                    |
|                         Valor Salvo                          |         Valor          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                    Dividir em Percentagem                    |         Número         |                                                         (1)                                                         |                                 |                                   |                                                               |                                                                                                                                                                    |
|                           Em Poder                           |        Sim-Não         |                                                                                                                     |                                 |                                   |            The asset is owned by the organization             |                                       The asset may not be in possession, but the asset is legally owned by the organization                                       |
|                           Em Posse                           |        Sim-Não         |                                                                                                                     |                                 |                                   |      The asset is in the possession of the organization       |                              Assets which are not in possession are e.g. at Customer site and may or may not be owned by the company.                              |
|                          Depreciar                           |        Sim-Não         |                                                                                                                     |                                 |                                   |                 The asset will be depreciated                 |                                                        The asset is used internally and will be depreciated                                                        |
|                    Totalmente depreciado                     |        Sim-Não         |                                                                                                                     |                                 |                                   |                The asset is fully depreciated                 |                                                                The asset costs are fully amortized.                                                                |
|                          Descartado                          |        Sim-Não         |                                                                                                                     |                                 |                                   |                     The asset is disposed                     |                                                              The asset is no longer used and disposed                                                              |
|               Método de Cálculo de Reavaliação               |         Lista          |                                       Default Inception to date Year Balances                                       |                                 |                                   |                                                               |                                                                                                                                                                    |
|                        Valor Alterado                        |         Valor          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                        Valor do Ativo                        |         Valor          |                                                         (0)                                                         |                                 |                                   |                    Book Value of the asset                    |                                                                                                                                                                    |
|               Valor Contábil Montante do Ativo               |         Valor          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|               Acum. Depreciação Amt. do Ativo                |         Valor          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                       Valor de Mercado                       |         Valor          |                                                                                                                     |                                 |                                   |                   Market value of the asset                   |                                                            For reporting, the market value of the asset                                                            |
|                        Qtd. Original                         |         Número         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                          Quantidade                          |         Número         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                        Data da Conta                         |          Data          |                                                                                                                     |                                 |                                   |                        Accounting Date                        | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|                   Data de Criação do Ativo                   |          Data          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                  Data de Entrada em Serviço                  |          Data          |                                                                                                                     |                                 |                                   |             Date when Asset was put into service              |                                    The date when the asset was put into service - usually used as start date for depreciation.                                     |
|                 Data da Depreciação do Ativo                 |          Data          |                                                                                                                     |                                 |                                   |                   Date of last depreciation                   |                                           Date of the last deprecation, if the asset is used internally and depreciated.                                           |
|                     Reav. Data do Ativo                      |          Data          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                  Data do Descarte do Ativo                   |          Data          |                                                                                                                     |                                 |                                   |              Date when the asset is/was disposed              |                                                                                                                                                                    |
|                       Vida Útil - Anos                       |        Inteiro         |                                                                                                                     |                                 |                                   |             Years of the usable life of the asset             |                                                                                                                                                                    |
|                      Vida Útil - Meses                       |        Inteiro         |                                                                                                                     |                                 |                                   |            Months of the usable life of the asset             |                                                                                                                                                                    |
|                       Núm.Máx. de Usos                       |        Inteiro         |                                                                                                                     |                                 |                                   |      Units of use until the asset is not usable anymore       |                                               Life use and the actual use may be used to calculate the depreciation                                                |
|                        Número de Usos                        |        Inteiro         |                                                                                                                     |                                 |                                   |              Currently used units of the assets               |                                                                                                                                                                    |
|                         ID do Ativo                          |         Tabela         |                                                    A\_Asset\_ID                                                     |   aparentasset\_aassetchange    |                                   |                                                               |                                                                                                                                                                    |
|                       Usuário/Contato                        |        Procurar        |                                                 AD\_User - Internal                                                 |      aduser\_aassetchange       |                                   | User within the system - Internal or Business Partner Contact |                           The User identifies a unique user in the system. This could be an internal user or a business partner contact                            |
|                           Endereço                           | Localização (Endereço) |                                                                                                                     |     clocation\_aassetchange     |                                   |                      Location or Address                      |                                                  The Location / Address field defines the location of an entity.                                                   |
|                          Lote Núm.                           |  Texto Curto (String)  |                                                                                                                     |                                 |                                   |                   Lot number (alphanumeric)                   |                                               The Lot Number indicates the specific lot that a product was part of.                                                |
|                          Núm. Série                          |  Texto Curto (String)  |                                                                                                                     |                                 |                                   |                     Product Serial Number                     |                               The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                               |
|                        Núm. da Versão                        |  Texto Curto (String)  |                                                                                                                     |                                 |                                   |                        Version Number                         |                                                                                                                                                                    |
|                     Parceiro de Negócios                     |     Tabela Direta      |                                                                                                                     |     cbpartner\_aassetchange     |                                   |                 Identifies a Business Partner                 |                          A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                           |
|                   Localização do Parceiro                    |         Tabela         |                                                C\_BPartner Location                                                 | cbpartnerlocation\_aassetchange |                                   |  Identifies the (ship to) address for this Business Partner   |                                                  The Partner address indicates the location of a Business Partner                                                  |
|                      Conta Custo Ativo                       |         Conta          |                                                                                                                     |     aassetvc\_aassetchange      |                                   |                                                               |                                                                                                                                                                    |
|                 Conta Despesa de Depreciação                 |         Conta          |                                                                                                                     |   adepreciation\_aassetchange   |                                   |                                                               |                                                                                                                                                                    |
|                    Depreciação Acumulada                     |         Conta          |                                                                                                                     | aaccumdepreciation\_aassetchang |                                   |                                                               |                                                                                                                                                                    |
|                     Receita a Disposição                     |         Conta          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                  Conta Receita a Disposição                  |         Conta          |                                                                                                                     | adisposalrevenue\_aassetchange  |                                   |                                                               |                                                                                                                                                                    |
|                   Conta Perda a Disposição                   |         Conta          |                                                                                                                     |   adisposalloss\_aassetchange   |                                   |                                                               |                                                                                                                                                                    |
|                       Perda de Cessão                        |         Conta          |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|              Reaval. de Custos Offset da Conta               |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|       Reavaliação de Custos Offset da Para o Ano Atual       |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|           Reaval de Custos Offset da Conta Prévia            |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|      Reavaliação de Custos Offset da Para o Ano Prévio       |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|               A\_Reval\_Accumdep\_Offset\_Cur                |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
| Reavaliação Offset da Depreciação Acumulada Para o Ano Atual |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|              A\_Reval\_Accumdep\_Offset\_Prior               |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|  Reavaliação Depreciação Acumulada Offset para Ano Anterior  |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                Reaval. Depexp Offset da Conta                |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                Despesa de Reavaliação Offset                 |        Inteiro         |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                        Ativo Alterado                        |           ID           |                                                                                                                     |                                 |                                   |                                                               |                                                                                                                                                                    |
|                 c\_invoice\_c\_bpartner\_id                  |         Tabela         |                                                  C\_BPartner (Trx)                                                  | CInvoiceCBPartner\_AAssetChange |                                   |                                                               |                                                                                                                                                                    |
|                        Data Faturada                         |          Data          |                                                                                                                     |                                 |                                   |                    Date printed on Invoice                    |                                                    The Date Invoice indicates the date printed on the invoice.                                                     |
|                   c\_invoice\_ad\_user\_id                   |         Tabela         |                                                      AD\_User                                                       |  CInvoiceADUser\_AAssetChange   |                                   |                                                               |                                                                                                                                                                    |
|               c\_invoice\_c\_doctypetarget\_id               |         Tabela         |                                                     C\_DocType                                                      | CInvoiceCDocTypeTarget\_AAssetC |                                   |                                                               |                                                                                                                                                                    |
|                    Loclização do Parceiro                    |         Tabela         |                                                C\_BPartner Location                                                 | CInvoiceCBPartnerLoc\_AAssetCha |                                   |                                                               |                                                                                                                                                                    |
|                     Quantidade Faturada                      |       Quantidade       |                                                                                                                     |                                 |                                   |                     The quantity invoiced                     |                                                                                                                                                                    |

</div>

</div>

  

<div id="d9718e5851" class="section section">

<div class="titlepage">

<div>

<div>

## 13. Tabela: Projeto - R\_IssueProject

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Projeto

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e5866" class="table">

<div class="table-title">

Table 1.13. Issue Project
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |          Valores (Padrão)          |    Chave restritiva     |        Regra de validação         |                              Descrição                              |                                                                     Comentário/Ajuda                                                                     |
| :-----------------: | :------------------: | :--------------------------------: | :---------------------: | :-------------------------------: | :-----------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Issue Project    |          ID          |                                    |                         |                                   |                       Implementation Projects                       |                                                                                                                                                          |
|       Empresa       |    Tabela Direta     |                                    |                         | AD\_Client.AD\_Client\_ID \< \> 0 |                 (semelhante ao primeiro relatório)                  |                                                                   (ver o mesmo acima)                                                                    |
|     Organização     |    Tabela Direta     |                                    |                         |                                   |                 (semelhante ao primeiro relatório)                  |                                                                   (ver o mesmo acima)                                                                    |
|        Ativo        |       Procurar       |                                    |  aasset\_rissueproject  |                                   |                Asset used internally or by customers                |               An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.               |
|       Projeto       |       Procurar       |                                    | cproject\_rissueproject |                                   |                          Financial Project                          |                                        A Project allows you to track and control internal or external activities.                                        |
|        Nome         | Texto Curto (String) |                                    |                         |                                   |                Alphanumeric identifier of the entity                |       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.       |
|      Descrição      | Texto Curto (String) |                                    |                         |                                   |              Optional short description of the record               |                                                       A description is limited to 255 characters.                                                        |
|        Ativo        |       Sim-Não        |                                    |                         |                                   |                 (semelhante ao primeiro relatório)                  |                                                                   (ver o mesmo acima)                                                                    |
|       Status        |        Lista         | Evaluation Implementation Produção |                         |                                   |  Status of the system - Support priority depends on system status   |                                                   System status helps to prioritize support resources                                                    |
|    Estatísticas     | Texto Curto (String) |                                    |                         |                                   | Information to help profiling the system for solving support issues | Profile information do not contain sensitive information and are used to support issue detection and diagnostics as well as general anonymous statistics |
|       Profile       | Texto Curto (String) |                                    |                         |                                   | Information to help profiling the system for solving support issues |                     Profile information do not contain sensitive information and are used to support issue detection and diagnostics                     |
| R\_IssueProject\_UU | Texto Curto (String) |                                    |                         |                                   |                                                                     |                                                                                                                                                          |

</div>

</div>

  

<div id="d9718e6063" class="section section">

<div class="titlepage">

<div>

<div>

## 14. Tabela: Informações Financeiras - A\_Asset\_Info\_Fin

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Informações Financeiras para
o Ativo

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e6078" class="table">

<div class="table-title">

Table 1.14. Finance Information
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |                                     Valores (Padrão)                                      |     Chave restritiva     |                  Regra de validação                   |               Descrição               |                                                       Comentário/Ajuda                                                       |
| :----------------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------: | :----------------------: | :---------------------------------------------------: | :-----------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|       Info Fin. do Ativo       |                ID                 |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|           Processado           |              Sim-Não              |                                           ('N')                                           |                          |                                                       |    The document has been processed    |                             The Processed checkbox indicates that a document has been processed.                             |
|            Empresa             |           Tabela Direta           |                                        AD\_Client                                         |                          |           AD\_Client.AD\_Client\_ID \< \> 0           |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|          Organização           |           Tabela Direta           |                                       AD\_Org (all)                                       |                          | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|             Ativo              |             Procurar              |                                                                                           |  aasset\_aassetinfofin   |                                                       | Asset used internally or by customers | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|             Ativo              |              Sim-Não              |                                                                                           |                          |                                                       |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|        Método Finanças         |               Lista               |                   Capitalized Lease Non-Capitalized Lease Owned Rented                    |                          |                                                       |                                       |                                                                                                                              |
|      Parceiro de Negócios      |             Procurar              |                                                                                           | cbpartner\_aassetinfofin |                                                       |     Identifies a Business Partner     |       A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson        |
|        Data do Contrato        |               Data                |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
| Data de Vencimento do Contrato |               Data                |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|          Mensalidade           |               Valor               |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|       Data de Vencimento       |               Lista               | Fixo dia 15 1st of every month Beginning of every month Yearly on or before contract date |                          |                                                       |                                       |                                                                                                                              |
|        Opção de Compra         |              Sim-Não              |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|     Opção Preço de Compra      |               Valor               |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|   Opção de Crédito na Compra   |              Inteiro              |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|  Opção de Crédito % na Compra  |              Número               |                                                                                           |                          |                                                       |                                       |                                                                                                                              |
|       Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                                                                                           |                          |                                                       |             Text Message              |                                                                                                                              |
|    A\_Asset\_Info\_Fin\_UU     |       Texto Curto (String)        |                                                                                           |                          |                                                       |                                       |                                                                                                                              |

</div>

</div>

  

<div id="d9718e6363" class="section section">

<div class="titlepage">

<div>

<div>

## 15. Tabela: Informações sobre a licença - A\_Asset\_Info\_Lic

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Informações sobre a licença
para o ativo

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e6378" class="table">

<div class="table-title">

Table 1.15. License Information
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      | Valores (Padrão) |   Chave restritiva    |                  Regra de validação                   |                 Descrição                  |                                                       Comentário/Ajuda                                                       |
| :-------------------------: | :------------------: | :--------------: | :-------------------: | :---------------------------------------------------: | :----------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|     Info Lic. do Ativo      |          ID          |                  |                       |                                                       |                                            |                                                                                                                              |
|         Processado          |       Sim-Não        |      ('N')       |                       |                                                       |      The document has been processed       |                             The Processed checkbox indicates that a document has been processed.                             |
|           Empresa           |    Tabela Direta     |    AD\_Client    |                       |           AD\_Client.AD\_Client\_ID \< \> 0           |     (semelhante ao primeiro relatório)     |                                                     (ver o mesmo acima)                                                      |
|         Organização         |    Tabela Direta     |  AD\_Org (all)   |                       | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |     (semelhante ao primeiro relatório)     |                                                     (ver o mesmo acima)                                                      |
|            Ativo            |       Procurar       |                  | aasset\_aassetinfolic |                                                       |   Asset used internally or by customers    | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|            Texto            | Texto Curto (String) |                  |                       |                                                       |                                            |                                                                                                                              |
|            Ativo            |       Sim-Não        |                  |                       |                                                       |     (semelhante ao primeiro relatório)     |                                                     (ver o mesmo acima)                                                      |
|       Estado da Conta       | Texto Curto (String) |                  |                       |                                                       | State of the Credit Card or Account holder |                                        The State of the Credit Card or Account holder                                        |
|      Agência Emissora       | Texto Curto (String) |                  |                       |                                                       |                                            |                                                                                                                              |
|         No Licença          | Texto Curto (String) |                  |                       |                                                       |                                            |                                                                                                                              |
|       Taxa de Licença       |        Valor         |                  |                       |                                                       |                                            |                                                                                                                              |
| Data de Revisão da Política |         Data         |                  |                       |                                                       |                                            |                                                                                                                              |
|   A\_Asset\_Info\_Lic\_UU   | Texto Curto (String) |                  |                       |                                                       |                                            |                                                                                                                              |

</div>

</div>

  

<div id="d9718e6591" class="section section">

<div class="titlepage">

<div>

<div>

## 16. Tabela: Informações de Seguro - A\_Asset\_Info\_Ins

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Informações de Seguro para o
Ativo

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e6602" class="table">

<div class="table-title">

Table 1.16. Insurance Information
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      | Valores (Padrão) | Chave restritiva |                  Regra de validação                   |               Descrição               |                                                       Comentário/Ajuda                                                       |
| :-------------------------: | :------------------: | :--------------: | :--------------: | :---------------------------------------------------: | :-----------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|     Info Ins. do Ativo      |          ID          |                  |                  |                                                       |                                       |                                                                                                                              |
|            Ativo            |       Sim-Não        |                  |                  |                                                       |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|           Empresa           |    Tabela Direta     |    AD\_Client    |                  |           AD\_Client.AD\_Client\_ID \< \> 0           |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|         Organização         |    Tabela Direta     |  AD\_Org (all)   |                  | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|            Ativo            |          ID          |                  |                  |                                                       | Asset used internally or by customers | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|    Companhia de Seguros     | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|     Número da Política      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
| Data de Revisão da Política |         Data         |                  |                  |                                                       |                                       |                                                                                                                              |
|      Prêmio do Seguro       |        Valor         |                  |                  |                                                       |                                       |                                                                                                                              |
|     Custos de Reposição     |        Valor         |                  |                  |                                                       |                                       |                                                                                                                              |
|       Valor Segurado        |        Valor         |                  |                  |                                                       |                                       |                                                                                                                              |
|            Texto            | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|   A\_Asset\_Info\_Ins\_UU   | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |

</div>

</div>

  

<div id="d9718e6814" class="section section">

<div class="titlepage">

<div>

<div>

## 17. Tabela: Informações de Imposto - A\_Asset\_Info\_Tax

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Informações de Imposto para o
Ativo

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e6825" class="table">

<div class="table-title">

Table 1.17. Tax Information
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |                   Valores (Padrão)                   | Chave restritiva |                  Regra de validação                   |                 Descrição                  |                                                       Comentário/Ajuda                                                       |
| :---------------------: | :------------------: | :--------------------------------------------------: | :--------------: | :---------------------------------------------------: | :----------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|          Ativo          |       Sim-Não        |                                                      |                  |                                                       |     (semelhante ao primeiro relatório)     |                                                     (ver o mesmo acima)                                                      |
|   Info Imposta Ativo    |          ID          |                                                      |                  |                                                       |                                            |                                                                                                                              |
|         Empresa         |    Tabela Direta     |                      AD\_Client                      |                  |           AD\_Client.AD\_Client\_ID \< \> 0           |     (semelhante ao primeiro relatório)     |                                                     (ver o mesmo acima)                                                      |
|       Organização       |    Tabela Direta     |                    AD\_Org (all)                     |                  | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |     (semelhante ao primeiro relatório)     |                                                     (ver o mesmo acima)                                                      |
|          Ativo          |          ID          |                                                      |                  |                                                       |   Asset used internally or by customers    | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|      Taxa Entidade      | Texto Curto (String) |                                                      |                  |                                                       |                                            |                                                                                                                              |
|     Estado da Conta     | Texto Curto (String) |                                                      |                  |                                                       | State of the Credit Card or Account holder |                                        The State of the Credit Card or Account holder                                        |
|     Comprado novo?      |       Sim-Não        |                                                      |                  |                                                       |                                            |                                                                                                                              |
|     Método Finanças     |        Lista         | Capitalized Lease Non-Capitalized Lease Owned Rented |                  |                                                       |                                            |                                                                                                                              |
| Crédito de Investimento |       Inteiro        |                                                      |                  |                                                       |                                            |                                                                                                                              |
|    Texto de Mensagem    | Texto Curto (String) |                                                      |                  |                                                       |                Text Message                |                                                                                                                              |
| A\_Asset\_Info\_Tax\_UU | Texto Curto (String) |                                                      |                  |                                                       |                                            |                                                                                                                              |

</div>

</div>

  

<div id="d9718e7024" class="section section">

<div class="titlepage">

<div>

<div>

## 18. Tabela: Outras Informações - A\_Asset\_Info\_Oth

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Outras informações
relacionadas ao ativo

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e7035" class="table">

<div class="table-title">

Table 1.18. Other Information
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      | Valores (Padrão) | Chave restritiva |                  Regra de validação                   |               Descrição               |                                                       Comentário/Ajuda                                                       |
| :------------------: | :------------------: | :--------------: | :--------------: | :---------------------------------------------------: | :-----------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
| Outras Info do Ativo |          ID          |                  |                  |                                                       |                                       |                                                                                                                              |
|        Ativo         |       Sim-Não        |                  |                  |                                                       |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|       Empresa        |    Tabela Direta     |                  |                  |           AD\_Client.AD\_Client\_ID \< \> 0           |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|     Organização      |    Tabela Direta     |                  |                  | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |  (semelhante ao primeiro relatório)   |                                                     (ver o mesmo acima)                                                      |
|        Ativo         |          ID          |                  |                  |                                                       | Asset used internally or by customers | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|      Usuário 1       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 10      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 2       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 11      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 3       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 12      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 4       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 13      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 5       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 14      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 6       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 15      | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 7       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 8       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|      Usuário 9       | Texto Curto (String) |                  |                  |                                                       |                                       |                                                                                                                              |
|        Texto         |      Memorando       |                  |                  |                                                       |                                       |                                                                                                                              |

</div>

</div>

  

<div id="d9718e7357" class="section section">

<div class="titlepage">

<div>

<div>

## 19. Tabela: Despesa - A\_Depreciation\_Exp

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Depreciation_Exp_data)

<span class="emphasis">*Coluna linkada:* </span> Asset

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9718e7370" class="table">

<div class="table-title">

Table 1.19. Expense
Fields

</div>

<div class="table-contents">

|             Nome do campo              |            Referência             |                            Valores (Padrão)                             |        Chave restritiva         | Regra de validação |                   Descrição                   |                                                                          Comentário/Ajuda                                                                          |
| :------------------------------------: | :-------------------------------: | :---------------------------------------------------------------------: | :-----------------------------: | :----------------: | :-------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                 Ativo                  |              Sim-Não              |                                                                         |                                 |                    |      (semelhante ao primeiro relatório)       |                                                                        (ver o mesmo acima)                                                                         |
|                Empresa                 |              Tabela               |                               AD\_Client                                |                                 |                    |      (semelhante ao primeiro relatório)       |                                                                        (ver o mesmo acima)                                                                         |
|              Organização               |              Tabela               |                              AD\_Org (all)                              |                                 |                    |      (semelhante ao primeiro relatório)       |                                                                        (ver o mesmo acima)                                                                         |
|          Exp. de Depreciação           |                ID                 |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|               Depreciar                |              Sim-Não              |                                                                         |                                 |                    |         The asset will be depreciated         |                                                        The asset is used internally and will be depreciated                                                        |
|              Conta Número              |               Conta               |                                                                         | aaccountnumber\_adepreciationex |                    |                                               |                                                                                                                                                                    |
|            Tipo de Entrada             |               Lista               |          Depreciation Disposals Forecasts New Splits Transfers          |                                 |                    |                                               |                                                                                                                                                                    |
|               Descrição                |       Texto Curto (String)        |                                                                         |                                 |                    |   Optional short description of the record    |                                                            A description is limited to 255 characters.                                                             |
|                Despesa                 |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|            Despesa (fiscal)            |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|             Conta (débito)             |               Conta               |                           C\_ValidCombination                           |    draccou\_adepreciationexp    |                    |                 Account used                  |                                                                     The (natural) account used                                                                     |
|            Conta (crédito)             |               Conta               |                           C\_ValidCombination                           |    craccou\_adepreciationexp    |                    |                 Account used                  |                                                                     The (natural) account used                                                                     |
|             Período/Anual              |              Inteiro              |                             C\_Period (all)                             |                                 |                    |                                               |                                                                                                                                                                    |
|             Data da Conta              |               Data                |                                                                         |                                 |                    |                Accounting Date                | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|           Tipo de Lançamento           |               Lista               | Real Orçamento Encerramento Comprometimento Reservas Estatísticas ('A') |                                 |                    | The type of posted amount for the transaction |                       The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                        |
|                 Ativo                  |             Procurar              |                                                                         |    aasset\_adepreciationexp     |                    |     Asset used internally or by customers     |                    An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                    |
|               Processado               |              Sim-Não              |                                                                         |                                 |                    |        The document has been processed        |                                                The Processed checkbox indicates that a document has been processed.                                                |
|   Processar Despesas de Depreciação    |               Botão               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|            Comentário/Ajuda            | Texto Médio (até 2000 caracteres) |                                                                         |                                 |                    |                Comment or Hint                |                                            The Help field contains a hint, comment or help about the use of this item.                                             |
|             Custo do Ativo             |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|           Custo Ativo Delta            |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|         Depreciação Acumulada          |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|     Depreciação Acumulada (delta)      |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|     Depreciação Acumulada (fiscal)     |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
| Depreciação Acumulada - fiscal (delta) |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|        Quantidade Remanescente         |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|    Quantidade Remanescente (fiscal)    |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|           Vida Útil - Meses            |              Inteiro              |                                                                         |                                 |                    |    Months of the usable life of the asset     |                                                                                                                                                                    |
|       Use Vida - Meses (fiscal)        |              Inteiro              |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|            Adição de Ativo             |           Tabela Direta           |                                                                         | aassetaddition\_adepreciationex |                    |                                               |                                                                                                                                                                    |
|             Asset Disposed             |           Tabela Direta           |                                                                         | aassetdisposed\_adepreciationex |                    |                                               |                                                                                                                                                                    |
|        A\_Depreciation\_Exp\_UU        |       Texto Curto (String)        |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |

</div>

</div>

  

</div>
