---
title: "Cheque alocados na Fatura"
id: ChequealocadosnaFaturaI
---
<div id="d21187e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Cheque alocados na Fatura

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-09-25 14:16:11.0

<span class="emphasis"> *Atualizado:* </span>2018-09-25 14:20:03.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_C\_CheckAllocate a
LEFT JOIN COF\_C\_ControlCheck cc ON a.COF\_C\_ControlCheck\_ID =
cc.COF\_C\_ControlCheck\_ID

<span class="emphasis"> *Order By :*</span>null

<div id="d21187e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|           Nome           | Referência |                       Sql SELECT                        | QueryCriteria |            Descrição            |                                                Comentário/Ajuda                                                |
| :----------------------: | :--------: | :-----------------------------------------------------: | :-----------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------: |
|          Ao dia          |    Data    |                        cc.DateTo                        |               | Dia final de uma faixa de datas |                     O campo "Ao dia" indica a data final de uma faixa de datas (inclusive)                     |
|          Valor           |   Valor    |                        a.Amount                         |               |   Valor em uma moeda definida   |                             O "Valor" indica o valor para esta linha de documento.                             |
|         ChequeNo         |  Inteiro   |                       cc.ChequeNo                       |               |              null               |                                                      null                                                      |
| ID da programação/fatura |     ID     | COALESCE(a.C\_InvoicePaySchedule\_ID, a.C\_Invoice\_ID) |               |        Parent of Entity         | The Parent indicates the value used to represent the next level in a hierarchy or report to level for a record |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/ChequesalocadosnaFaturainfodata.html),

</div>
