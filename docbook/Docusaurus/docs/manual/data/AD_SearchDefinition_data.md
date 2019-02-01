<div id="d71128e1" class="table">

<div class="table-title">

Table 1. Buscar
Definição

</div>

<div class="table-contents">

|        |                  |        |        |               |                                                                    |        |                         |              |                                                                                                                                                                                                                         |                |                     |
| :----: | :--------------: | :----: | :----: | :-----------: | :----------------------------------------------------------------: | :----: | :---------------------: | :----------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------: | :-----------------: |
| Coluna | Buscar Definição | Tabela | Janela | Tipo de Dados |                             Descrição                              | Padrão |          Nome           | Janela de PC |                                                                                                        Consulta                                                                                                         | Pesquisar Tipo | Código da Transação |
|  2169  |      50000       |  259   |  143   |       S       |          Searches for an order with a fitting documentNo           |  true  |      Order Search       |     181      |                                                                                                                                                                                                                         |       T        |          O          |
|        |      50001       |  291   |  123   |       S       | Searches for a Business Partner with fitting BPName or ContactName | false  | Business Partner Search |              | SELECT b.C\_BPartner\_ID FROM C\_BPartner b INNER JOIN AD\_User u ON (b.C\_BPartner\_ID = u.C\_BPartner\_ID) WHERE (UPPER(b.name) LIKE UPPER(?) OR UPPER(u.name) LIKE UPPER(?)) AND b.AD\_Client\_ID=@\#AD\_Client\_ID@ |       Q        |         BP          |

</div>

</div>
