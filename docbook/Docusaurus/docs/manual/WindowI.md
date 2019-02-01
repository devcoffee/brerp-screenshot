---
title: "Window"
id: WindowI
---
<div id="d255223e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Window

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-07-19 16:39:30.0

<span class="emphasis"> *Atualizado:* </span>2018-07-19 16:40:32.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>AD\_Window w LEFT JOIN
ad\_window\_trl wt ON (w.ad\_window\_id = wt.ad\_window\_id AND
wt.ad\_language = '@\#AD\_Language@')

<span class="emphasis"> *Order By :*</span>null<span class="emphasis">
*Valor Padrão* </span>

<div id="d255223e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|        Nome         |            Referência             |                       Sql SELECT                       |                                       QueryCriteria                                        |                Descrição                |                                                                       Comentário/Ajuda                                                                       |
| :-----------------: | :-------------------------------: | :----------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Nome         |       Texto Curto (String)        |           COALESCE(wt.name, w.name) AS Name            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Identificador Alfanumérico da entidade  | O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento. |
|      Descrição      |       Texto Curto (String)        | COALESCE(wt.description, w.description) AS Description |                                                                                            | Descrição resumida opcional do registro |                                                          Uma descrição é limitada a 255 caracteres.                                                          |
|  Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |           COALESCE(wt.help, w.help) AS Help            |                                                                                            |           Comentário ou Dica            |                                         O campo "Ajuda" contém uma dica, comentário ou ajuda sobre o uso deste item.                                         |
| Transação de Vendas |               Lista               |                       w.IsSOTrx                        |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |     Esta é uma Transação de Vendas      |                                 A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                  |
|       Janela        |                ID                 |                    w.AD\_Window\_ID                    |                                                                                            | Entrada de dados ou janela de exposição |                                                   O campo "Janela" identifica uma Janela única no sistema.                                                   |

</div>

</div>

  

\[DADOS INVÁLIDOS\]

</div>
