---
title: "Workflow"
id: WorkflowI
---
<div id="d255269e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Workflow

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-07-19 14:47:03.0

<span class="emphasis"> *Atualizado:* </span>2018-07-19 14:57:38.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>AD\_Workflow wf LEFT JOIN
ad\_workflow\_trl wft ON (wf.ad\_workflow\_id = wft.ad\_workflow\_id AND
wft.ad\_language = '@\#AD\_Language@')

<span class="emphasis"> *Order By :*</span>null<span class="emphasis">
*Valor Padrão* </span>

<div id="d255269e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|           Nome            |            Referência            |                        Sql SELECT                        |                                       QueryCriteria                                        |                Descrição                |                                                                       Comentário/Ajuda                                                                       |
| :-----------------------: | :------------------------------: | :------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Nome            |       Texto Curto (String)       |           COALESCE(wft.name, wf.name) AS Name            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Identificador Alfanumérico da entidade  | O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento. |
|         Descrição         |       Texto Curto (String)       | COALESCE(wft.description, wf.description) AS Description |                                                                                            | Descrição resumida opcional do registro |                                                          Uma descrição é limitada a 255 caracteres.                                                          |
|     Comentário/Ajuda      | Texto Longo (\> 2000 caracteres) |           COALESCE(wft.help, wf.help) AS Help            |                                                                                            |           Comentário ou Dica            |                                         O campo "Ajuda" contém uma dica, comentário ou ajuda sobre o uso deste item.                                         |
|          Tabela           |             Procurar             |                     wf.AD\_Table\_ID                     |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Informação da Tabela no Banco de Dados  |                                           A Tabela no Banco de Dados fornece informações das Definições da Tabela.                                           |
| Tipo de Fluxo de Trabalho |              Lista               |                     wf.WorkflowType                      | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |        Tipo de Fluxo de Trabalho        |                                        O tipo de fluxo de trabalho determina como o fluxo de trabalho será iniciado.                                         |
|   Estado de Publicação    |              Lista               |                     wf.PublishStatus                     |  <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>Upper   |          Estado de Publicação           |                                                               Usado para documentação interna                                                                |
|          Válido           |              Lista               |                        wf.IsValid                        |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |           O elemento é válido           |                                                         O elemento passou a conferência de validação                                                         |

</div>

</div>

  

\[DADOS INVÁLIDOS\]

</div>
