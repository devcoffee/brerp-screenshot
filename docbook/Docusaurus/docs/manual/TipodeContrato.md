---
title: "Tipo de Contrato"
id: TipodeContrato
---
<div id="d240757e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Contrato

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Contrato -
    COF\_ContractCategory](#d240757e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tipo de Contrato

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-06-06 13:47:58.0

<span class="emphasis">*Atualizado em:* </span>2016-06-06 13:47:58.0

![](/img/manual/TipodeContrato.png)

<div id="d240757e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Contrato - COF\_ContractCategory

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Tipo de Contrato

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240757e34" class="table">

<div class="table-title">

Table 1.1. ContractCategory
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Contrato   |          ID          |                      |                  |                                                  |     Primary Key : Contract Category      |                                                       Primary Key : Contract Category                                                        |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Chave de Busca    | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Transação de Vendas |       Sim-Não        |                      |                  |                                                  |       This is a Sales Transaction        |                                The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                 |

</div>

</div>

  

</div>