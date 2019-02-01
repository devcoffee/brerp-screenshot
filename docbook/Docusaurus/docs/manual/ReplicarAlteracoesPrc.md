---
title: "Replicar Alterações"
id: ReplicarAlteracoesPrc
---
<div id="d204974e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Replicar Alterações

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-05-22 13:43:21.0

<span class="emphasis">*Atualizado:*</span>2015-05-22 13:44:38.0

<span class="emphasis"> *Descrição:* </span>Replicar Informações de
Alteração de Preço (Markup) para outra Lista de Preço

![](/img/manual/ReplicarAlteracoes.png)

<div id="d204974e18" class="table">

<div class="table-title">

Table 1.1. ReplicarAlteracoes
Parâmetros

</div>

<div class="table-contents">

|             Nome              |       Nome da coluna        | Referência |                  Valores(Padrão)                  |                                       Descrição                                        |                                                     Comentário/Ajuda                                                     |
| :---------------------------: | :-------------------------: | :--------: | :-----------------------------------------------: | :------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
|  Versão da Lista de Preço De  |  M\_PriceList\_Version\_ID  |  Procurar  | M\_PriceList Version(@M\_PriceList\_Version\_ID@) |                    Versão de Lista de Preço de Origem da Replicação                    | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|          Produto De           |       M\_Product\_ID        |  Procurar  |                (@M\_Product\_ID@)                 |               Produto de Origem para Replicação para Nova Lista de Preço               |                        Identifies an item which is either purchased or sold in this organization.                        |
|      Lista de Preço Para      |     cof\_PriceList\_ID      |  Procurar  |                   M\_PriceList                    |      Lista de Preço para qual será replicada as informações de alteração de preço      |                                                           null                                                           |
| Versão da Lista de Preço Para | COF\_PriceList\_Version\_ID |  Procurar  |               M\_PriceList Version                | Versão da Lista de Preço para qual será replicada as informações de alteração de preço | Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for. |
|         Produto Para          |      cof\_Product\_ID       |  Procurar  |              M\_Product (no summary)              |          Produto para qual será replicado a informação de Alteração de Preço           |                                                           null                                                           |
|   Categoria de Produto Para   | cof\_Product\_Category\_ID  |  Procurar  |                M\_Product Category                |               Categoria de Produto para ser Replicado na Lista de Preço                |                                                           null                                                           |

</div>

</div>

  

</div>
