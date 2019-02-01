---
title: "Remessa de Mercadorias"
id: RemessadeMercadorias
---
<div id="d204604e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Remessa de Mercadorias

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Remessa de Mercadorias -
    M\_CommodityShipment](#d204604e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-12-06 18:58:59.0

<span class="emphasis">*Atualizado em:* </span>2012-12-06 18:58:59.0

![](/img/manual/RemessadeMercadorias.png)

<div id="d204604e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Remessa de Mercadorias - M\_CommodityShipment

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d204604e30" class="table">

<div class="table-title">

Table 1.1. Commodity Shipment
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |    Valores (Padrão)     |        Chave restritiva         |                Regra de validação                |                Descrição                 |                              Comentário/Ajuda                              |
| :-----------------------------: | :------------------: | :---------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------: |
|      X\_CommodityShipment       |          ID          |                         |                                 |                                                  |                                          |                                                                            |
|             Empresa             |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                            (ver o mesmo acima)                             |
|           Organização           |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                            (ver o mesmo acima)                             |
|             Produto             |       Procurar       | M\_Product (no summary) |  mproduct\_mcommodityshipment   |                                                  |          Product, Service, Item          | Identifies an item which is either purchased or sold in this organization. |
|              Ativo              |       Sim-Não        |           (Y)           |                                 |                                                  |    (semelhante ao primeiro relatório)    |                            (ver o mesmo acima)                             |
|       Código Harmonizado        | Texto Curto (String) |                         |                                 |                                                  |                                          |                                                                            |
|       País de Fabricação        |        Tabela        |       C\_Country        | countryofmanufacture\_mcommodit |                                                  |                                          |                                                                            |
| Numero da Licença de Exportação | Texto Curto (String) |                         |                                 |                                                  |                                          |                                                                            |
|            Descrição            | Texto Curto (String) |                         |                                 |                                                  | Optional short description of the record |                A description is limited to 255 characters.                 |

</div>

</div>

  

</div>
