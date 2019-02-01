---
title: "Recalcular Cubo"
id: RecalcularCuboPrc
---
<div id="d189027e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Recalcular Cubo

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2009-05-15 00:43:07.0

<span class="emphasis">*Atualizado:*</span>2009-12-10 20:24:38.0

<span class="emphasis"> *Descrição:* </span>Recalcular o cubo baseado
nas definições de cubos.

![](/img/manual/RecalcularCubo.png)

<div id="d189027e18" class="table">

<div class="table-title">

Table 1.1. RecalcularCubo
Parâmetros

</div>

<div class="table-contents">

|     Nome     |   Nome da coluna   | Referência | Valores(Padrão) |                               Descrição                               |                                               Comentário/Ajuda                                                |
| :----------: | :----------------: | :--------: | :-------------: | :-------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|    Force     |       Force        |  Sim-Não   |       (N)       |                 Force rebuild of cube even if locked.                 |                                                     null                                                      |
| Report Cube  | PA\_ReportCube\_ID |   Tabela   | PA\_ReportCube  | Define reporting cube for pre-calculation of summary accounting data. | Summary data will be generated for each period of the selected calendar, grouped by the selected dimensions.. |
| Full rebuild |       Reset        |  Sim-Não   |                 |           Delete all existing summary data and recalculate.           |        If not selected, only those periods with recently posted accounting facts will be recalculated.        |

</div>

</div>

  

</div>
