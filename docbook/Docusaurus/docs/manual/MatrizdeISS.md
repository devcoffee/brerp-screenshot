---
title: "Matriz de ISS"
id: MatrizdeISS
---
<div id="d144661e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Matriz de ISS

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Matriz de ISS -
    LBR\_ISSMatrix](#d144661e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-03-02 11:02:41.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:58:01.0

![](/img/manual/MatrizdeISS.png)

<div id="d144661e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Matriz de ISS - LBR\_ISSMatrix

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d144661e30" class="table">

<div class="table-title">

Table 1.1. ISS Matrix
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |    Valores (Padrão)     | Chave restritiva |                Regra de validação                |             Descrição              |                              Comentário/Ajuda                              |
| :----------------: | :------------------: | :---------------------: | :--------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------: |
|   Matriz de ISS    |          ID          |                         |                  |                                                  |       Defines the ISS Matrix       |                      Primary key table LBR\_ISSMatrix                      |
|       Ativo        |       Sim-Não        |          ('Y')          |                  |                                                  | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|      Empresa       |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|    Organização     |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|      Produto       |       Procurar       | M\_Product (no summary) |                  |           M\_Product.ProductType = 'S'           |       Product, Service, Item       | Identifies an item which is either purchased or sold in this organization. |
|       Região       |        Tabela        |        C\_Region        |                  |           C\_Region.C\_Country\_ID=139           |  Identifies a geographical Region  |          The Region identifies a unique Region for this Country.           |
|       Cidade       |       Procurar       |         C\_City         |                  |     C\_City.C\_Region\_ID = @C\_Region\_ID@      |                City                |                             City in a country                              |
| Imposto Brasileiro | Impostos Brasileiros |                         |                  |                                                  |     Primary key table LBR\_Tax     |                         Primary key table LBR\_Tax                         |

</div>

</div>

  

</div>
