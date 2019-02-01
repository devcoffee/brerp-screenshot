<div id="d19522e1" class="table">

<div class="table-title">

Table 1. House Keeping
Configuration

</div>

<div class="table-contents">

|                             |        |              |           |                  |                          |                     |                 |                         |                                                        |                 |                    |                                                                                                   |
| :-------------------------: | :----: | :----------: | :-------: | :--------------: | :----------------------: | :-----------------: | :-------------: | :---------------------: | :----------------------------------------------------: | :-------------: | :----------------: | :-----------------------------------------------------------------------------------------------: |
| House Keeping Configuration | Tabela | Pasta Backup | Descrição | Comentário/Ajuda | Exportação XML de Backup | Salvar no Histórico | Último Excluído |     Última Execução     |                          Nome                          | Processar Agora |   Chave de Busca   |                                             Sql WHERE                                             |
|            50004            |  364   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.513 |    Delete T\_Replenish records preserving last week    |      false      |    T\_Replenish    | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50000            |  631   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.504 |      Delete T\_Aging records preserving last week      |      false      |      T\_Aging      | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50007            |  365   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.567 |     Delete T\_Spool records preserving last 2 days     |      false      |      T\_Spool      | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 2) |
|            50003            |  803   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.521 |    Delete T\_InvoiceGL records preserving last week    |      false      |    T\_InvoiceGL    | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50002            |  478   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.515 | Delete T\_InventoryValue records preserving last week  |      false      | T\_InventoryValue  | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50009            |  753   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.532 |  Delete T\_TrialBalance records preserving last week   |      false      |  T\_TrialBalance   | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50008            |  758   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.497 |   Delete T\_Transaction records preserving last week   |      false      |   T\_Transaction   | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50005            |  545   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.545 | Delete T\_ReportStatement records preserving last week |      false      | T\_ReportStatement | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |
|            50006            |  544   |              |           |                  |          false           |        false        |        0        | 2018-03-08 22:27:54.533 |     Delete T\_Report records preserving last week      |      false      |     T\_Report      | AD\_PInstance\_ID IN (SELECT AD\_PInstance\_ID FROM AD\_PInstance WHERE Created \< = SYSDATE - 7) |

</div>

</div>
