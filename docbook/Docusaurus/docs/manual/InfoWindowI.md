---
title: "Info Window"
id: InfoWindowI
---
<div id="d123889e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Info Window

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-07-19 14:41:53.0

<span class="emphasis"> *Atualizado:* </span>2018-07-19 14:57:07.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>AD\_InfoWindow iw LEFT JOIN
ad\_infowindow\_trl iwt ON (iw.ad\_infowindow\_id =
iwt.ad\_infowindow\_id AND iwt.ad\_language = '@\#AD\_Language@')

<span class="emphasis"> *Order By :*</span>null<span class="emphasis">
*Valor Padrão* </span>

<div id="d123889e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|       Nome       |            Referência             |                        Sql SELECT                        |                                       QueryCriteria                                        |                Descrição                |                                                                       Comentário/Ajuda                                                                       |
| :--------------: | :-------------------------------: | :------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Nome       |       Texto Curto (String)        |           COALESCE(iwt.name, iw.name) AS Name            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Identificador Alfanumérico da entidade  | O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento. |
|    Descrição     |       Texto Curto (String)        | COALESCE(iwt.description, iw.description) AS Description |                                                                                            | Descrição resumida opcional do registro |                                                          Uma descrição é limitada a 255 caracteres.                                                          |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |           COALESCE(iwt.help, iw.help) AS Help            |                                                                                            |           Comentário ou Dica            |                                         O campo "Ajuda" contém uma dica, comentário ou ajuda sobre o uso deste item.                                         |
|      Tabela      |             Procurar              |                     iw.AD\_Table\_ID                     |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Informação da Tabela no Banco de Dados  |                                           A Tabela no Banco de Dados fornece informações das Definições da Tabela.                                           |
| Mostre no Painel |               Lista               |                   iw.IsShowInDashboard                   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |       Mostrar o dashlet no painel       |                                                                             null                                                                             |
|      Padrão      |               Lista               |                       iw.IsDefault                       |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |              Valor padrão               |                                   A caixa de verificação "Padrão" indica se este registro será usado como um valor padrão.                                   |

</div>

</div>

  

\[DADOS INVÁLIDOS\]

</div>
