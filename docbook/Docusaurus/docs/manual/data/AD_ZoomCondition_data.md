<div id="d110357e1" class="table">

<div class="table-title">

Table 1. Condição do
Zoom

</div>

<div class="table-contents">

|        |        |                  |           |                         |           |                                                                                                                                                                        |                |
| :----: | :----: | :--------------: | :-------: | :---------------------: | :-------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------: |
| Tabela | Janela | Condição do Zoom | Descrição |          Nome           | Seqüência |                                                                               Sql WHERE                                                                                | Lógica de Zoom |
|  321   | 200043 |      200001      |           | Zoom to Cost Adjustment |    10     | M\_Inventory.C\_DocType\_ID in ( select c\_doctype\_id from c\_doctype where c\_doctype.ad\_client\_id=m\_inventory.ad\_client\_id and c\_doctype.docsubtypeinv='CA' ) |                |
|  321   |  341   |      200002      |           |  Zoom to Internal Use   |    20     | M\_Inventory.C\_DocType\_ID in ( select c\_doctype\_id from c\_doctype where c\_doctype.ad\_client\_id=m\_inventory.ad\_client\_id and c\_doctype.docsubtypeinv='IU' ) |                |
|  319   | 53098  |      200003      |           |    Return to Vendor     |    10     |                                                                    M\_InOut.MovementType IN ('V-')                                                                     |                |
|  319   | 53097  |      200004      |           |     Customer Return     |    20     |                                                                    M\_InOut.MovementType IN ('C+')                                                                     |                |
|  259   |  143   |      200005      |           |       Sales Order       |    10     |              'SOO' = (SELECT DocBaseType FROM C\_DocType WHERE C\_DocType\_ID=C\_Order.C\_DocTypeTarget\_ID AND AD\_Client\_ID = C\_Order.AD\_Client\_ID)              |  @IsSOTrx@=Y   |
|  259   |  181   |      200006      |           |     Purchase Order      |    20     |              'POO' = (SELECT DocBaseType FROM C\_DocType WHERE C\_DocType\_ID=C\_Order.C\_DocTypeTarget\_ID AND AD\_Client\_ID = C\_Order.AD\_Client\_ID)              |  @IsSOTrx@=N   |

</div>

</div>
