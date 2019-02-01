<div id="d440390e1" class="table">

<div class="table-title">

Table 1. Lista de
Preço

</div>

<div class="table-contents">

|                     |          |                           |              |                                                                          |                       |        |             |                       |                          |                      |                |              |                   |
| :-----------------: | :------: | :-----------------------: | :----------: | :----------------------------------------------------------------------: | :-------------------: | :----: | :---------: | :-------------------: | :----------------------: | :------------------: | :------------: | :----------: | :---------------: |
| Lista de Preço Base | Moeda De | Preço por Margem (Markup) | Liberado Web |                                Descrição                                 | Impor Limite de Preço | Padrão | Obrigatório | Existe para o Produto | Lista de Preço de Vendas | Preço Inclui Imposto | Lista de Preço |     Nome     | Precisão de Preço |
|                     |   102    |           false           |    false     |                           Export Prices in EUR                           |         false         | false  |    false    |         false         |           true           |        false         |      103       |    Export    |         2         |
|                     |   100    |           false           |    false     |     This list is created first - the "root" of the other price lists     |         false         | false  |    false    |         false         |          false           |        false         |      102       |   Purchase   |         2         |
|         102         |   100    |           false           |    false     | This is the sales price list and we create it based on the Purchase list |         true          |  true  |    false    |         false         |           true           |        false         |      101       |   Standard   |         2         |
|         102         |   297    |           false           |    false     |                                                                          |         true          |  true  |    false    |         false         |           true           |        false         |    1000002     |  Vendas BRL  |         2         |
|                     |   297    |           false           |    false     |                                                                          |         false         | false  |    false    |         false         |          false           |        false         |    1000003     | Compras BRL  |         2         |
|                     |   100    |           false           |    false     |                                                                          |         false         | false  |    false    |         false         |          false           |        false         |    5000000     |  COMPRA $$   |         2         |
|                     |   100    |           false           |    false     |                                                                          |         false         | false  |    false    |         false         |           true           |        false         |    5000001     |  EXPORTAÇÃO  |         2         |
|                     |   297    |           false           |    false     |                                                                          |         false         |  true  |    false    |         false         |           true           |         true         |    1000004     |    Padrão    |         2         |
|                     |   297    |           false           |    false     |                                                                          |         false         | false  |    false    |         false         |          false           |         true         |    1000006     |    COMPRA    |         2         |
|                     |   297    |           false           |     true     |                                                                          |         false         | false  |    false    |         false         |           true           |         true         |    1000005     |    VENDA     |         2         |
|                     |   297    |           true            |     true     |                                                                          |         false         | false  |    false    |         false         |           true           |         true         |    5000002     | VENDA MARKUP |         2         |

</div>

</div>
