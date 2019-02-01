---
title: "Grupo de Promoção"
id: GrupodePromocao
---
<div id="d112383e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Promoção

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Promoção -
    M\_PromotionGroup](#d112383e22)</span>
  - <span class="section">[2. Tabela: Grupo de Linha -
    M\_PromotionGroupLine](#d112383e158)</span>

</div>

<span class="emphasis">*Descrição:* </span> Agrupamento de produtos para
uma configuração de promoção

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2009-04-09 16:49:11.0

<span class="emphasis">*Atualizado em:* </span>2009-04-09 16:49:11.0

<div id="d112383e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Promoção - M\_PromotionGroup

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112383e29" class="table">

<div class="table-title">

Table 1.1. Promotion Group
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :----------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Grupo da Promoção   |          ID          |                    |                  |                                                  |                                          |                                                                                                                                              |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome          | Texto Curto (String) |                    |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       | Texto Curto (String) |                    |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Ativo         |       Sim-Não        |        (Y)         |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| M\_PromotionGroup\_UU | Texto Curto (String) |                    |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d112383e158" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Grupo de Linha - M\_PromotionGroupLine

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d112383e165" class="table">

<div class="table-title">

Table 1.2. Group Line
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                                          Regra de validação                                                                          |             Descrição              |                              Comentário/Ajuda                              |
| :------------------------: | :------------------: | :------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------: |
| Linha de Grupo da Promoção |          ID          |                      |                                 |                                                                                                                                                                      |                                    |                                                                            |
|          Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|        Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|           Ativo            |       Sim-Não        |         (Y)          |                                 |                                                                                                                                                                      | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|     Grupo da Promoção      |    Tabela Direta     |                      | mpromotiongroup\_mpromotiongrou |                                                                                                                                                                      |                                    |                                                                            |
|          Produto           |       Procurar       |                      |  mproduct\_mpromotiongroupline  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |       Product, Service, Item       | Identifies an item which is either purchased or sold in this organization. |
| M\_PromotionGroupLine\_UU  | Texto Curto (String) |                      |                                 |                                                                                                                                                                      |                                    |                                                                            |

</div>

</div>

  

</div>
