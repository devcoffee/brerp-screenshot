---
title: "Região de Entrega"
id: RegiaodeEntrega
---
<div id="d194297e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Região de Entrega

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Região de Entrega -
    COF\_M\_ShipRegion](#d194297e23)</span>
  - <span class="section">[2. Tabela: Cidades da Região de Entrega -
    COF\_M\_ShipRegion\_CIty](#d194297e190)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-12-09 16:29:50.0

<span class="emphasis">*Atualizado em:* </span>2015-12-09 16:29:50.0

![](/img/manual/RegiaodeEntrega.png)

<div id="d194297e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Região de Entrega - COF\_M\_ShipRegion

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_M_ShipRegion_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d194297e32" class="table">

<div class="table-title">

Table 1.1. Shipment Region
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |                                        Valores (Padrão)                                         | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :---------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Região de Entrega   |          ID          |                                                                                                 |                  |                                                  |      Primary Key : Shipment Region       |                                                        Primary Key : Shipment Region                                                         |
|       Empresa        |    Tabela Direta     |                                      (@\#AD\_Client\_ID@)                                       |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |                                        (@\#AD\_Org\_ID@)                                        |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca    | Texto Curto (String) |                                                                                                 |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Sequência de Entrega |       Inteiro        | (@SQL=SELECT COALESCE(MAX(COF\_SequenciaEntrega),0)+10 AS DefaultValue FROM COF\_M\_ShipRegion) |                  |                                                  |                                          |                                                                                                                                              |
|         Nome         | Texto Curto (String) |                                                                                                 |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                                                                                                 |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Padrão        |       Sim-Não        |                                                                                                 |                  |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|        Ativo         |       Sim-Não        |                                               (Y)                                               |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d194297e190" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Cidades da Região de Entrega - COF\_M\_ShipRegion\_CIty

</div>

</div>

</div>

<span class="emphasis">*Coluna mãe:* </span> Shipment Region

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d194297e201" class="table">

<div class="table-title">

Table 1.2. Cidades da Região de Entrega
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |                                                                        Valores (Padrão)                                                                        |        Chave restritiva         |                Regra de validação                |                 Descrição                  |              Comentário/Ajuda              |
| :--------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :----------------------------------------: | :----------------------------------------: |
| COF\_M\_ShipRegion\_CIty\_ID |          ID          |                                                                                                                                                                |                                 |                                                  | Primary Key : Cidades da Região de Entrega | Primary Key : Cidades da Região de Entrega |
| COF\_M\_ShipRegion\_CIty\_UU | Texto Curto (String) |                                                                                                                                                                |                                 |                                                  |                                            |                                            |
|           Empresa            |    Tabela Direta     |                                                                      (@\#AD\_Client\_ID@)                                                                      |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |            (ver o mesmo acima)             |
|         Organização          |    Tabela Direta     |                                                                       (@\#AD\_Org\_ID@)                                                                        |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |            (ver o mesmo acima)             |
|      Região de Entrega       |    Tabela Direta     |                                                                   (@COF\_M\_ShipRegion\_ID@)                                                                   | COFMShipRegion\_COFMShipRegionC |                                                  |       Primary Key : Shipment Region        |       Primary Key : Shipment Region        |
|            Cidade            |       Procurar       |                                                                                                                                                                |    CCity\_COFMShipRegionCIty    |                                                  |                    City                    |             City in a country              |
|    Prioridade de Entrega     |       Inteiro        | (@SQL=SELECT COALESCE(MAX(COF\_PrioridadeEntrega),0)+10 AS DefaultValue FROM COF\_M\_ShipRegion\_CIty WHERE COF\_M\_ShipRegion\_ID = @COF\_M\_ShipRegion\_ID@) |                                 |                                                  |                                            |                                            |
|            Ativo             |       Sim-Não        |                                                                              (Y)                                                                               |                                 |                                                  |     (semelhante ao primeiro relatório)     |            (ver o mesmo acima)             |

</div>

</div>

  

</div>
