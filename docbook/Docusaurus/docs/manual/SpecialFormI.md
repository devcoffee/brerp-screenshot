---
title: "Special Form"
id: SpecialFormI
---
<div id="d214193e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Special Form

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-07-19 14:53:22.0

<span class="emphasis"> *Atualizado:* </span>2018-07-19 14:57:29.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>AD\_Form f LEFT JOIN
ad\_form\_trl ft ON (f.ad\_form\_id = ft.ad\_form\_id AND
ft.ad\_language = '@\#AD\_Language@')

<span class="emphasis"> *Order By :*</span>null<span class="emphasis">
*Valor Padrão* </span>

<div id="d214193e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|   Nome    |      Referência      |                       Sql SELECT                       |                                       QueryCriteria                                        |                Descrição                |                                                                       Comentário/Ajuda                                                                       |
| :-------: | :------------------: | :----------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Nome    | Texto Curto (String) |           COALESCE(ft.name, f.name) AS Name            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Identificador Alfanumérico da entidade  | O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento. |
| Descrição | Texto Curto (String) | COALESCE(ft.description, f.description) AS Description |                                                                                            | Descrição resumida opcional do registro |                                                          Uma descrição é limitada a 255 caracteres.                                                          |

</div>

</div>

  

\[DADOS INVÁLIDOS\]

</div>
