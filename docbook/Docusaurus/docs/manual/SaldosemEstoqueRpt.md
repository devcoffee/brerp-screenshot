---
title: "Saldos em Estoque"
id: SaldosemEstoqueRpt
---
<div id="d209226e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Saldos em Estoque

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-17 17:34:41.0

<span class="emphasis">*Atualizado:*</span>2016-05-17 21:04:14.0

<span class="emphasis"> *Descrição:* </span>Apresenta as Quantidades
Disponíveis em Estoque Agrupado e Totalizado por Produto

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/SaldosemEstoque.png)

<div id="d209226e22" class="table">

<div class="table-title">

Table 1.1. SaldosemEstoque
Parâmetros

</div>

<div class="table-contents">

|           Nome           |      Nome da coluna      |  Referência   |          Valores(Padrão)           |                      Descrição                      |                                                                            Comentário/Ajuda                                                                            |
| :----------------------: | :----------------------: | :-----------: | :--------------------------------: | :-------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Tipo do Produto      |   COF\_ProductType\_ID   | Tabela Direta |                                    |  Coluna de relação com a tabela de tipo de produto  |                                                                       Primary Key : Product Type                                                                       |
|    Classe do Produto     |  COF\_ProductClass\_ID   | Tabela Direta |                                    | Coluna de relação com a tabela de classe de produto |                                                                      Primary Key : Product Class                                                                       |
|     Grupo do Produto     |  COF\_ProductGroup\_ID   | Tabela Direta |                                    | Coluna de relação com a tabela de grupo do produto  |                                                                      Primary Key : Product Group                                                                       |
|  Grupo de Fornecedores   | COF\_GrupoFornecedor\_ID | Tabela Direta |                                    |         Identifica um grupo de fornecedores         |                                                                         Grupo de Fornecedores                                                                          |
|         Empresa          |      AD\_Client\_ID      |    Tabela     |        (@\#AD\_Client\_ID@)        |       Empresa/Locatário para esta instalação.       | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|       Organização        |       AD\_Org\_ID        | Tabela Direta | AD\_Org (all but 0)(@AD\_Org\_ID@) |      Entidade organizacional dentro da Empresa      |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|   Categoria de Produto   | M\_Product\_Category\_ID |   Procurar    |        M\_Product Category         |               Categoria de um Produto               |                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                        |
|         Produto          |      M\_Product\_ID      |   Procurar    |        M\_Product (stocked)        |               Produto, Serviço, Item                |                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                  |
|      Tipo de Custo       |     M\_CostType\_ID      | Tabela Direta |                                    |    Tipo de Custo (ex. Atual, Planejado, Futuro)     |                  Você pode definir múltiplos tipos de custos. O tipo de custo selecionado em um "Esquema Contábil" é utilizada para a contabilidade.                   |
|    Elemento de Custo     |    M\_CostElement\_ID    | Tabela Direta |                                    |            Elemento de Custo de Produto             |                                                                                  null                                                                                  |
| Apenas Saldos em Estoque | COF\_ApenasSaldoEstoque  |    Sim-Não    |                                    |                        null                         |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
