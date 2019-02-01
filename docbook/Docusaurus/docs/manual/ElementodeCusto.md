---
title: "Elemento de Custo"
id: ElementodeCusto
---
<div id="d83317e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Elemento de Custo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Elemento de Custo -
    M\_CostElement](#d83317e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Elemento de
Custo de Produto

<span class="emphasis">*Comentário/Ajuda:* </span>Você pode definir seus
próprios elementos de custo de produtos.

<span class="emphasis"> *Criado em:* </span>2005-04-24 22:06:58.0

<span class="emphasis">*Atualizado em:* </span>2005-04-24 22:18:10.0

![](/img/manual/ElementodeCusto.png)

<div id="d83317e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Elemento de Custo - M\_CostElement

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_CostElement_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Elementos de
Custo de Produto

<span class="emphasis">*Comentário/Ajuda:* </span> Você pode gerenciar
múltiplos Custos de Materiais. O método de formação de custos determina
qual Tipo de Custo de Material será utilizado para a contabilidade.
Defina um Método de Formação de Custos (para elementos materiais) apenas
se você quer que os custos sejam calculados por esse método de custeio.
O Método de Formação de Custos definido no Esquema Contábil ou Conta de
Categoria de Produto será utilizado para a contabilidade.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d83317e40" class="table">

<div class="table-title">

Table 1.1. Cost Element
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |                                                    Valores (Padrão)                                                    | Chave restritiva |                                       Regra de validação                                       |                Descrição                 |                                                                                                                                                      Comentário/Ajuda                                                                                                                                                      |
| :-------------------------: | :-------------------------------: | :--------------------------------------------------------------------------------------------------------------------: | :--------------: | :--------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Elemento de Custo      |                ID                 |                                                                                                                        |                  |                                                                                                |           Product Cost Element           |                                                                                                                                                                                                                                                                                                                            |
|           Empresa           |           Tabela Direta           |                                                  (@\#AD\_Client\_ID@)                                                  |                  |                               AD\_Client.AD\_Client\_ID \< \> 0                                |    (semelhante ao primeiro relatório)    |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|         Organização         |           Tabela Direta           |                                                   (@\#AD\_Org\_ID@)                                                    |                  |                        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                        |    (semelhante ao primeiro relatório)    |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|            Nome             |       Texto Curto (String)        |                                                                                                                        |                  |                                                                                                |  Alphanumeric identifier of the entity   |                                                                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                        |
|          Descrição          | Texto Médio (até 2000 caracteres) |                                                                                                                        |                  |                                                                                                | Optional short description of the record |                                                                                                                                        A description is limited to 255 characters.                                                                                                                                         |
|            Ativo            |              Sim-Não              |                                                          (Y)                                                           |                  |                                                                                                |    (semelhante ao primeiro relatório)    |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|  Tipo de Elemento de Custo  |               Lista               |                   Ônus (Desp.Indir.Material) Material Custos Indiretos Recurso Processamento Externo                   |                  |                <span class="emphasis">*ReadOnly Logic*</span>: @IsCalculated@=Y                |           Type of Cost Element           |                                                                                                                                                                                                                                                                                                                            |
| Método de Formação de Custo |               Lista               | PC Médio Peps (Fifo) Última Fatura Fatura Média Ueps (Lifo) Preço do Último PC Custeio Padrão Definido pelo usuário \_ |                  | AD\_Ref\_List.Value \< \> 'x' <span class="emphasis">*ReadOnly Logic*</span>: @IsCalculated@=Y |  Indicates how Costs will be calculated  | The Costing Method indicates how costs will be calculated (Standard, Average, Lifo, FiFo). The default costing method is defined on accounting schema level and can be optionally overwritten in the product category. The costing method cannot conflict with the Material Movement Policy (defined on Product Category). |
|          Calculado          |              Sim-Não              |                                                                                                                        |                  |                <span class="emphasis">*ReadOnly Logic*</span>: @IsCalculated@=Y                |  The value is calculated by the system   |                                                                                                                                     You cannot change values maintained by the system.                                                                                                                                     |
|     M\_CostElement\_UU      |       Texto Curto (String)        |                                                                                                                        |                  |                                                                                                |                                          |                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
