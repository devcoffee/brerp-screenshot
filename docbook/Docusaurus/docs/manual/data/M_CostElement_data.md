<div id="d416746e1" class="table">

<div class="table-title">

Table 1. Elemento de
Custo

</div>

<div class="table-contents">

|                           |                             |                                                                                                                                                                                                                     |           |                   |                     |
| :-----------------------: | :-------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------: | :---------------: | :-----------------: |
| Tipo de Elemento de Custo | Método de Formação de Custo |                                                                                                      Descrição                                                                                                      | Calculado | Elemento de Custo |        Nome         |
|             M             |                             |                                                                              Create additional Material Cost Elements for Landed Costs                                                                              |   false   |        101        |       Freight       |
|             M             |              F              |                                                                                                                                                                                                                     |   true    |        102        |        Fifo         |
|             M             |              A              |                                                                                                                                                                                                                     |   true    |        103        |     Average PO      |
|             B             |              S              |                                                                                                    Standard Cost                                                                                                    |   false   |       50000       |       Burden        |
|             R             |              S              |                                                                                                    Standard Cost                                                                                                    |   false   |        105        |        Labor        |
|             O             |              S              |                                                                                                    Standard Cost                                                                                                    |   false   |       50001       |      Overhead       |
|             X             |              S              |                                                                                                    Standard Cost                                                                                                    |   false   |       50002       | Outside Processing  |
|             M             |              S              | Standard Cost Note: Define additional (Material) Costing Method, if you want to maintain/calculate the costs. For accounting, the costing method defined in the Accounting Schema or Product Category Acct is used. |   false   |        100        |      Material       |
|             M             |              S              |                                                                                                                                                                                                                     |   false   |      1000000      |   Custeio Padrão    |
|             M             |              I              |                                                                                                                                                                                                                     |   false   |      5000000      |    Fatura Média     |
|             M             |              I              |                                                                                                                                                                                                                     |   true    |        104        |   Average Invoice   |
|             M             |              A              |                                                                                                                                                                                                                     |   false   |      5000001      |      PC Médio       |
|             M             |                             |                                                                                                                                                                                                                     |   false   |      5000002      |   Custo Indireto    |
|             M             |              p              |                                                                                                                                                                                                                     |   false   |      5000004      | Ultimo Preco Compra |

</div>

</div>
