---
title: "Recalculo de Custo - BOM"
id: RecalculodeCustoBOMPrc
---
<div id="d189094e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Recalculo de Custo - BOM

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2011-07-27 15:21:53.0

<span class="emphasis">*Atualizado:*</span>2011-07-27 15:21:53.0

<span class="emphasis"> *Descrição:* </span>Recalculo de Custo - BOM

<span class="emphasis"> *Comentário/Ajuda:* </span>Recalculo de Custo
Recursivo - BOM

![](/img/manual/RecalculodeCustoBOM.png)

<div id="d189094e22" class="table">

<div class="table-title">

Table 1.1. RecalculodeCustoBOM
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna      |  Referência   | Valores(Padrão) |                      Descrição                      |                                                                      Comentário/Ajuda                                                                       |
| :------------------: | :----------------------: | :-----------: | :-------------: | :-------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Elemento de Custo   |    M\_CostElement\_ID    | Tabela Direta |    (1000001)    |            Elemento de Custo de Produto             |                                                                            null                                                                             |
|     Organização      |       AD\_Org\_ID        | Tabela Direta |                 |      Entidade organizacional dentro da Empresa      | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|       Produto        |      M\_Product\_ID      |   Procurar    |                 |               Produto, Serviço, Item                |                                            Identifica um item que é ou comprado ou vendido por esta organização.                                            |
|   Grupo do Produto   |  COF\_ProductGroup\_ID   |   Procurar    |                 | Coluna de relação com a tabela de grupo do produto  |                                                                 Primary Key : Product Group                                                                 |
|  Classe do Produto   |  COF\_ProductClass\_ID   |   Procurar    |                 | Coluna de relação com a tabela de classe de produto |                                                                 Primary Key : Product Class                                                                 |
|   Tipo do Produto    |   COF\_ProductType\_ID   |   Procurar    |                 |  Coluna de relação com a tabela de tipo de produto  |                                                                 Primary Key : Product Type                                                                  |
| Categoria de Produto | M\_Product\_Category\_ID | Tabela Direta |      (-1)       |               Categoria de um Produto               |                  Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                   |

</div>

</div>

  

</div>
