---
title: "Ativo Fixo Importado"
id: AtivoFixoImportado
---
<div id="d13403e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ativo Fixo Importado

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ativo Fixo -
    I\_FixedAsset](#d13403e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2010-06-20 15:50:46.0

<span class="emphasis">*Atualizado em:* </span>2010-06-20 15:50:46.0

<div id="d13403e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ativo Fixo - I\_FixedAsset

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d13403e29" class="table">

<div class="table-title">

Table 1.1. Fixed Asset
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |                                                                         Valores (Padrão)                                                                          |     Chave restritiva     |        Regra de validação         |                       Descrição                       |                                                                          Comentário/Ajuda                                                                          |
| :----------------------------: | :------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------: | :-------------------------------: | :---------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Data da Depreciação do Ativo  |         Data         |                                                                                                                                                                   |                          |                                   |               Date of last depreciation               |                                           Date of the last deprecation, if the asset is used internally and depreciated.                                           |
|           Processed            |       Sim-Não        |                                                                                                                                                                   |                          |                                   |            The document has been processed            |                                                The Processed checkbox indicates that a document has been processed.                                                |
|    Remanescente do Período     |       Inteiro        |                                                                                (0)                                                                                |                          |                                   |                                                       |                                                                                                                                                                    |
|             Ativo              |       Sim-Não        |                                                                               ('Y')                                                                               |                          |                                   |          (semelhante ao primeiro relatório)           |                                                                        (ver o mesmo acima)                                                                         |
|   Depreciação Valor/Período    |        Valor         |                                                                                (0)                                                                                |                          |                                   |         Applies to Straight Line depreciation         |                                                                                                                                                                    |
|      Importar Ativo Fixo       |          ID          |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|     Valor do Tipo de Ativo     | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|         Tipo do Ativo          |    Tabela Direta     |                                                                                                                                                                   | aassettype\_ifixedasset  |                                   |                                                       |                                                                                                                                                                    |
|        Classe do Ativo         |    Tabela Direta     |                                                                                                                                                                   | aassetclass\_ifixedasset |                                   |                                                       |                                                                                                                                                                    |
|    Chave da Classe do Ativo    | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|             Cidade             |       Procurar       |                                                                                                                                                                   |    ccity\_ifixedasset    |                                   |                         City                          |                                                                         City in a country                                                                          |
|           Seqüência            |       Inteiro        |                                                                                (1)                                                                                |                          |                                   | Method of ordering records; lowest number comes first |                                                            The Sequence indicates the order of records                                                             |
|          Cidade Valor          | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|           Importado            |       Sim-Não        |                                                                               ('N')                                                                               |                          |                                   |            Has this import been processed             |                                                The Imported check box indicates if this import has been processed.                                                 |
| Mensagem de Erro de Importação | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |        Messages generated from import process         |                                     The Import Error Message displays any error messages generated during the import process.                                      |
|            Empresa             |    Tabela Direta     |                                                                                                                                                                   |                          | AD\_Client.AD\_Client\_ID \< \> 0 |          (semelhante ao primeiro relatório)           |                                                                        (ver o mesmo acima)                                                                         |
|          Organização           |    Tabela Direta     |                                                                                                                                                                   |                          |                                   |          (semelhante ao primeiro relatório)           |                                                                        (ver o mesmo acima)                                                                         |
|             Ativo              |       Procurar       |                                                                                                                                                                   |   aasset\_ifixedasset    |                                   |         Asset used internally or by customers         |                    An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                    |
|        No do Inventário        | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|              Nome              | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |         Alphanumeric identifier of the entity         |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.            |
|   Data de Entrada em Serviço   |         Data         |                                                                                                                                                                   |                          |                                   |         Date when Asset was put into service          |                                    The date when the asset was put into service - usually used as start date for depreciation.                                     |
|         Data da Conta          |         Data         |                                                                                                                                                                   |                          |                                   |                    Accounting Date                    | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|         Grupo de Ativo         |    Tabela Direta     |                                                                                                                                                                   | aassetgroup\_ifixedasset |                                   |                    Group of Assets                    |       The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset.        |
|      Grupo Chave do Ativo      | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|   P.Negócios (Representante)   |       Procurar       |                                                                         C\_BPartner (Trx)                                                                         | cbpartnersr\_ifixedasset |                                   |         Business Partner (Agent or Sales Rep)         |                                                                                                                                                                    |
| Chave de Parceiro de Negócios  | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |            The Key of the Business Partner            |                                                                                                                                                                    |
|            Produto             |       Procurar       |                                                                                                                                                                   |  mproduct\_ifixedasset   |                                   |                Product, Service, Item                 |                                             Identifies an item which is either purchased or sold in this organization.                                             |
|        Chave de Produto        | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                  Key of the Product                   |                                                                                                                                                                    |
|           Descrição            | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |       Optional short description of the record        |                                                            A description is limited to 255 characters.                                                             |
|              UDM               |       Procurar       |                                                                                                                                                                   |    cuom\_ifixedasset     |                                   |                    Unit of Measure                    |                                                       The UOM defines a unique non monetary Unit of Measure                                                        |
|            Símbolo             | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |             Symbol for a Unit of Measure              |                                         The Symbol identifies the Symbol to be displayed and printed for a Unit of Measure                                         |
|          Localizador           |    Tabela Direta     |                                                                                                                                                                   |  mlocator\_ifixedasset   |                                   |                   Warehouse Locator                   |                                                  The Locator indicates where in a Warehouse a product is located.                                                  |
|      Chave de Localização      | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |             Key of the Warehouse Locator              |                                                                                                                                                                    |
|           Quantidade           |      Quantidade      |                                                                                (1)                                                                                |                          |                                   |                       Quantity                        |                                         The Quantity indicates the number of a specific product or item for this document.                                         |
|         Custo do Ativo         |        Valor         |                                                                                (0)                                                                                |                          |                                   |                                                       |                                                                                                                                                                    |
|          Valor Salvo           |        Número        |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|       Vida Útil - Meses        |       Inteiro        |                                                                                                                                                                   |                          |                                   |        Months of the usable life of the asset         |                                                                                                                                                                    |
|   Use Vida - Meses (fiscal)    |       Inteiro        |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|         Período Atual          |       Inteiro        |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|     Depreciação Acumulada      |        Valor         |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
| Depreciação Acumulada (fiscal) |        Valor         |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|       Ação do Documento        |        Lista         | \< Nenhum\> Aprovar Fechar Completo Invalidar Lançar Preparar Estornar - Provisão Estornar - Corrigir Reativar Rejeitar Anulado Espere Completar Destravar ('CO') |                          |                                   |          The targeted status of the document          |                                    You find the current status in the Document Status field. The options are listed in a popup                                     |
|       Import Fixed Asset       |        Botão         |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |
|       I\_FixedAsset\_UU        | Texto Curto (String) |                                                                                                                                                                   |                          |                                   |                                                       |                                                                                                                                                                    |

</div>

</div>

  

</div>
