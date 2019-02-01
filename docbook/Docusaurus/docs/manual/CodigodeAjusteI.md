---
title: "Código de Ajuste"
id: CodigodeAjusteI
---
<div id="d28466e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Código de Ajuste

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2016-01-16 11:40:58.0

<span class="emphasis"> *Atualizado:* </span>2016-01-16 12:02:43.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_C\_Adjustment\_Code ac

<span class="emphasis"> *Order By
:*</span>ac.COF\_C\_Adjustment\_Code\_ID

<div id="d28466e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome          |      Referência      |         Sql SELECT         |                                     QueryCriteria                                      |                      Descrição                      |                                           Comentário/Ajuda                                            |
| :--------------------: | :------------------: | :------------------------: | :------------------------------------------------------------------------------------: | :-------------------------------------------------: | :---------------------------------------------------------------------------------------------------: |
|    Tabela de Ajuste    |        Tabela        | ac.COF\_C\_AdjustTable\_ID | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |               Tabela Base para Ajuste               |                                      Primary Key : Adjust Table                                       |
|        Imposto         |       Procurar       |    ac.LBR\_TaxName\_ID     | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |              Define o nome do Imposto               |                                 Chave primária da tabela LBR\_TaxName                                 |
|          Tipo          |        Lista         |          ac.Type           | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null | Tipo de Validação (SQL, Java Script, Java Language) | O "Tipo" indica o tipo de validação que irá ocorrer. Este pode ser SQL, Java Script ou Java Language. |
|     Classificação      |        Lista         |     ac.Classification      | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |               Classificação por grupo               |                 A "Classificação" pode ser usada para opcionalmente agrupar produtos.                 |
|  Código da Impreesão   | Texto Curto (String) |     ac.cof\_PrintCode      |                                                                                        |                        null                         |                                                 null                                                  |
| Descrição da Impressão | Texto Curto (String) |  ac.cof\_PrintDescription  |                                                                                        |                        null                         |                                                 null                                                  |
|         Ajuste         |       Procurar       | ac.COF\_C\_Adjustment\_ID  | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                   Ajuste do SPED                    |                                                 null                                                  |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/AdjustmentCodeinfodata.html),

</div>
