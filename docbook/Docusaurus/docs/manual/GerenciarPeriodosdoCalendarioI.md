---
title: "Gerenciar Períodos do Calendário"
id: GerenciarPeriodosdoCalendarioI
---
<div id="d109951e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Gerenciar Períodos do Calendário

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2017-07-10 16:28:30.0

<span class="emphasis"> *Atualizado:* </span>2017-07-12 12:15:45.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>RV\_PeriodControl a

<span class="emphasis"> *Order By :*</span>a.FiscalYear DESC ,
a.C\_Calendar\_ID , a.PeriodNo DESC

![](/img/manual/GerenciarPeriodosdoCalendario.png)

<div id="d109951e26" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|           Nome            |            Referência             |    Sql SELECT     |                                       QueryCriteria                                        |              Descrição              |                                                                                                                                Comentário/Ajuda                                                                                                                                |
| :-----------------------: | :-------------------------------: | :---------------: | :----------------------------------------------------------------------------------------: | :---------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Ano            |           Tabela Direta           |   a.C\_Year\_ID   |                                                                                            |              Ano Civil              |                                                                                                     O "Ano" identifica de forma única um ano contábil para um calendário.                                                                                                      |
|   Período (Ano Fiscal)    |           Tabela Direta           |  a.C\_Period\_ID  |                                                                                            |        Período do Calendário        |                                                                                                      O "Período" indica uma faixa exclusiva de datas para um calendário.                                                                                                       |
|          viewid           | Texto Médio (até 2000 caracteres) |     a.viewid      |                                                                                            |                null                 |                                                                                                                                      null                                                                                                                                      |
|        Calendário         |           Tabela Direta           | a.C\_Calendar\_ID |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Nome do Calendário de Contabilidade | O "Calendário" identifica de modo exclusivo um calendário de contabilidade. Podem ser usados múltiplos calendários. Por exemplo você pode precisar um calendário padrão que rode de 1 de janeiro a 31 de dezembro e um calendário fiscal que rode de 1 de julho a 30 de junho. |
|            Ano            |       Texto Curto (String)        |   a.FiscalYear    | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |            O Ano Fiscal             |                                                                                                             O "Ano" identifica o ano contábil para um calendário.                                                                                                              |
|      Data de Início       |               Data                |    a.StartDate    | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |  Primeira data efetiva (inclusive)  |                                                                                                            A "Data de Início" indica o primeiro dia ou data inicial                                                                                                            |
|        Data Final         |               Data                |     a.EndDate     | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |   Última data efetiva (inclusive)   |                                                                                                                A "Data Final" indica a última data nesta faixa.                                                                                                                |
| Tipo de Base de Documento |               Lista               |   a.DocBaseType   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |      Tipo lógico de documento       |                                               O campo "Tipo de Base de Documento" identifica a base ou ponto de partida para um documento. Múltiplos tipos de documentos podem compartilhar um único tipo de base de documento.                                                |
|     Estado do Período     |               Lista               |  a.PeriodStatus   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |     Estado atual deste período      |                                                                                O "Estado do Período" indica o estado atual deste período. Por exemplo 'Fechado', 'Aberto', 'Nunca Foi Aberto'.                                                                                 |
|      Tipo de Período      |               Lista               |   a.PeriodType    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |           Tipo de Período           |                                                                                                       O "Tipo de Período" indica o tipo (Padrão, ou Ajuste) do período.                                                                                                        |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/GerenciarPeriodosdoCalendarioinfodata.html),

</div>
