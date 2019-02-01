---
title: "Lote"
id: Lote
---
<div id="d138937e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Lote

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Lote - M\_Lot](#d138937e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definição de Lote de Produto

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento do Lote
individual de um Produto

<span class="emphasis"> *Criado em:* </span>2003-05-05 21:03:29.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d138937e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Lote - M\_Lot

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Definição de Lote de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento do Lote
individual de um Produto

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d138937e37" class="table">

<div class="table-title">

Table 1.1. Lot
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                                                                          Regra de validação                                                                          |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :--------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Lote       |                ID                 |                      |                  |                                                                                                                                                                      |          Product Lot Definition          |                                                       The individual Lot of a Product                                                        |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Produto      |             Procurar              |                      |  mproduct\_mlot  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |          Product, Service, Item          |                                  Identifies an item which is either purchased or sold in this organization.                                  |
| Controle de Lote |           Tabela Direta           |                      |  mlotctl\_mlot   |                                                                                                                                                                      |           Product Lot Control            |                                                Definition to create Lot numbers for Products                                                 |
|       Nome       |       Texto Curto (String)        |                      |                  |                                                                                                                                                                      |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     | Texto Médio (até 2000 caracteres) |                      |                  |                                                                                                                                                                      | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                  |                                                                                                                                                                      |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                  |                                                                                                                                                                      |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Do dia      |               Data                |                      |                  |                                                                                                                                                                      |        Starting date for a range         |                                            The Date From indicates the starting date of a range.                                             |
|      Ao dia      |               Data                |                      |                  |                                                                                                                                                                      |         End date of a date range         |                                          The Date To indicates the end date of a range (inclusive)                                           |
|    M\_Lot\_UU    |       Texto Curto (String)        |                      |                  |                                                                                                                                                                      |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
