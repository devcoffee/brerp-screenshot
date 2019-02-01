---
title: "Atualização de custo padrão"
id: AtualizacaodecustopadraoPrc
---
<div id="d14282e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Atualização de custo padrão

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2002-02-21 15:16:44.0

<span class="emphasis">*Atualizado:*</span>2005-11-27 18:37:05.0

<span class="emphasis"> *Descrição:* </span>Defina o preço de custo
padrão e futuro

<span class="emphasis"> *Comentário/Ajuda:* </span>Para os custos
padrão, você pode definir / recalcular o preço de custo atual ou futuro
(para o tipo de custo do esquema contábil). Se o Nível de Custeio do
Esquema de Contabilidade estiver definido como Cliente, os registros de
custo faltantes serão criados. Os custos históricos são calculados com
base no valor acumulado / quantidade do método de cálculo de custos.

![](/img/manual/Atualizacaodecustopadrao.png)

<div id="d14282e22" class="table">

<div class="table-title">

Table 1.1. Atualizacaodecustopadrao
Parâmetros

</div>

<div class="table-contents">

|           Nome            |      Nome da coluna       |  Referência   |                                                                                         Valores(Padrão)                                                                                          |                             Descrição                             |                                                     Comentário/Ajuda                                                     |
| :-----------------------: | :-----------------------: | :-----------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------: |
| Ajustar Custos Futuros a  |      SetFutureCostTo      |     Lista     | PC Médio Average Invoice History Average PO History Future Standard Cost PePs Preço da Última Fatura Fatura Média UePs Lista de Preço (Limite) Preço do Último PC Custo Padrão Old Standard Cost |                Ajusta os Custos Futuros à seleção                 |                                                           null                                                           |
| Versão da Lista de Preço  | M\_PriceList\_Version\_ID | Tabela Direta |                                                                                                                                                                                                  | Only used if Price List is used to set future/standard cost price |                                                           null                                                           |
| Definir Custo Padrão para |     SetStandardCostTo     |     Lista     | PC Médio Average Invoice History Average PO History Future Standard Cost PePs Preço da Última Fatura Fatura Média UePs Lista de Preço (Limite) Preço do Último PC Custo Padrão Old Standard Cost |           Estabeleça novos Custos Padrão para a seleção           |                                                           null                                                           |
|   Categoria de Produto    | M\_Product\_Category\_ID  | Tabela Direta |                                                                                               (-1)                                                                                               |                      Categoria de um Produto                      | Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção. |
|       Document Type       |      C\_DocType\_ID       |    Tabela     |                                                                                            C\_DocType                                                                                            |              Inventory Cost Adjustment Document Type              |                                                           null                                                           |
|     Grupo do Produto      |   COF\_ProductGroup\_ID   | Tabela Direta |                                                                                                                                                                                                  |        Coluna de relação com a tabela de grupo do produto         |                                               Primary Key : Product Group                                                |
|     Classe do Produto     |   COF\_ProductClass\_ID   | Tabela Direta |                                                                                                                                                                                                  |        Coluna de relação com a tabela de classe de produto        |                                               Primary Key : Product Class                                                |
|      Tipo do Produto      |   COF\_ProductType\_ID    | Tabela Direta |                                                                                                                                                                                                  |         Coluna de relação com a tabela de tipo de produto         |                                                Primary Key : Product Type                                                |
|          Produto          |      M\_Product\_ID       |   Procurar    |                                                                                                                                                                                                  |                      Produto, Serviço, Item                       |                          Identifica um item que é ou comprado ou vendido por esta organização.                           |

</div>

</div>

  

</div>
