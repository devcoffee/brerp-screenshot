<div id="d84e1" class="table">

<div class="table-title">

Table 1. Regra de
Alerta

</div>

<div class="table-contents">

|        |                 |        |             |                  |        |            |                           |                   |                   |                                                                                                                                                                                                                                                                                                                          |           |
| :----: | :-------------: | :----: | :---------: | :--------------: | :----: | :--------: | :-----------------------: | :---------------: | :---------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------: |
| Alerta | Regra de Alerta | Tabela | Msg de Erro |     Sql FROM     | Válido |    Nome    |    Outra Cláusula SQL     | Pós Processamento | Pré Processamento |                                                                                                                                                        Sql SELECT                                                                                                                                                        | Sql WHERE |
|  100   |       100       |        |             | DBA\_Free\_Space |  true  | Space Info | GROUP BY Tablespace\_Name |                   |                   | Tablespace\_Name, COUNT (\*) AS Pieces, SUM (bytes)/1024/1024 Free\_MB, MAX (bytes)/1024 Largest\_kB, ROUND(MAX (bytes) / SUM (bytes),2) \* 100 Ratio, SUM (blocks) Free\_Blocks, MAX (blocks) Largest\_Blocks, ROUND(SQRT (MAX (blocks) / SUM (blocks)) \* (100 / SQRT (SQRT (COUNT (blocks)))),2) Fragmentation\_Index |           |

</div>

</div>
