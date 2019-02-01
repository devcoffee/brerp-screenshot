---
title: "Informações de Armazenagem (Monitoramento de Estoque)"
id: InformacoesdeArmazenagemMonitoramentodeEstoqueI
---
<div id="d124355e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Armazenagem (Monitoramento de Estoque)

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-01-04 15:05:16.0

<span class="emphasis"> *Atualizado:* </span>2018-07-02 15:09:43.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>rv\_storage\_per\_product
ssp

<span class="emphasis"> *Order By :*</span>null

<div id="d124355e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|         Nome          |  Referência   |                                                                                                         Sql SELECT                                                                                                          |                                     QueryCriteria                                      |                Descrição                |                                                   Comentário/Ajuda                                                   |
| :-------------------: | :-----------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :-------------------------------------: | :------------------------------------------------------------------------------------------------------------------: |
|        Armazém        | Tabela Direta |                                                                                                    ssp.M\_Warehouse\_ID                                                                                                     |                                                                                        | Armazém de estocagem e Ponto de Serviço | O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços. |
| Quantidade em Estoque |  Quantidade   |                                                                                  bomqtyonhand(ssp.m\_product\_id, ssp.m\_warehouse\_id, 0)                                                                                  |                                                                                        |  Quantidade Real Disponível em Estoque  |               A "Quantidade em Estoque" Indica a Quantidade Real Existente em um Determinado Armazém.                |
|        Produto        | Tabela Direta |                                                                                                     ssp.M\_Product\_ID                                                                                                      | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |         Produto, Serviço, Item          |                        Identifica um item que é ou comprado ou vendido por esta organização.                         |
|  Quantidade Prevista  |  Quantidade   | COALESCE((select ep.Qty from COF\_EstoquePrevisto ep where ep.AD\_Org\_ID=(select AD\_Org\_ID from M\_Warehouse w where w.M\_Warehouse\_ID=ssp.M\_Warehouse\_ID) AND ep.M\_Product\_ID=ssp.M\_Product\_ID), 0) as QtdFiscal |                                                                                        |           Quantidade Prevista           |                                                 Quantidade Prevista                                                  |

</div>

</div>

  

[\[BANCO DE
DADOS\]](data/InformacoesdeArmazenagemMonitoramentodeEstoqueinfodata.html),

</div>
