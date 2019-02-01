---
title: "Informações de Recurso"
id: InformacoesdeRecursoI
---
<div id="d126138e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Recurso

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2013-02-01 17:35:31.0

<span class="emphasis"> *Atualizado:* </span>2017-06-14 14:50:44.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>S\_ResourceAssignment ra
INNER JOIN S\_Resource r ON (ra.S\_Resource\_ID=r.S\_Resource\_ID) INNER
JOIN S\_ResourceType rt ON
(r.S\_ResourceType\_ID=rt.S\_ResourceType\_ID) INNER JOIN C\_UOM uom ON
(rt.C\_UOM\_ID=uom.C\_UOM\_ID)

<span class="emphasis"> *Order By
:*</span>rt.Name,r.Name,ra.AssignDateFrom<span class="emphasis"> *Valor
Padrão* </span>

<div id="d126138e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|      Nome       |  Referência   |      Sql SELECT       |                                       QueryCriteria                                        |          Descrição           |                                   Comentário/Ajuda                                   |
| :-------------: | :-----------: | :-------------------: | :----------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------------------------------------------: |
|     Recurso     |   Procurar    |  ra.S\_Resource\_ID   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |           Recurso            |                                         null                                         |
| Atribuir desde  |   Data+Hora   |   ra.AssignDateFrom   |                                                                                            |    Atribuir recurso desde    |                                   Início da tarefa                                   |
|   Quantidade    |  Quantidade   |        ra.Qty         |                                                                                            |          Quantidade          | A "Quantidade" indica o número de um item ou produto específico para este documento. |
|       UDM       | Tabela Direta |     rt.C\_UOM\_ID     |                                                                                            |      Unidade de Medida       |             A "UDM" define uma exclusiva Unidade de Medida não monetária             |
|  Atribuir até   |   Data+Hora   |    ra.AssignDateTo    |                                                                                            |     Atribuir recurso até     |                                   Final da Tarefa                                    |
|  Atribuir até   |     Data      |    ra.AssignDateTo    | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |     Atribuir recurso até     |                                   Final da Tarefa                                    |
|   Confirmado    |    Sim-Não    |    ra.IsConfirmed     |                                                                                            | A atribuição está confirmada |                       A atribuição de recursos está confirmada                       |
| Atribuir desde  |     Data      |   ra.AssignDateFrom   | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |    Atribuir recurso desde    |                                   Início da tarefa                                   |
| Tipo de Recurso |   Procurar    | r.S\_ResourceType\_ID |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |             null             |                                         null                                         |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/ResourceInfoinfodata.html),

</div>
