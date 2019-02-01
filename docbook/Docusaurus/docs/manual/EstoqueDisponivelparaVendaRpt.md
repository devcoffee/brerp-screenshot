---
title: "Estoque Disponível para Venda"
id: EstoqueDisponivelparaVendaRpt
---
<div id="d88971e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Estoque Disponível para Venda

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-17 20:24:07.0

<span class="emphasis">*Atualizado:*</span>2016-05-17 21:06:53.0

<span class="emphasis"> *Descrição:* </span>Apresenta as Quantidades
Disponíveis em Estoque Para Venda

<span class="emphasis"> *Comentário/Ajuda:* </span>Quantidade Em Estoque
: Total em Estoque do Item Quantidade Reservada : Quantidade Total
Reservada em Ordens de Venda Quantidade Disponível : Quantidade Total em
Estoque Subtraído da Quantidade Reservada

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/EstoqueDisponivelparaVenda.png)

<div id="d88971e26" class="table">

<div class="table-title">

Table 1.1. EstoqueDisponivelparaVenda
Parâmetros

</div>

<div class="table-contents">

|         Nome          |      Nome da coluna      |  Referência   |   Valores(Padrão)    |                      Descrição                      |                                                                            Comentário/Ajuda                                                                            |
| :-------------------: | :----------------------: | :-----------: | :------------------: | :-------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo de Fornecedores | COF\_GrupoFornecedor\_ID | Tabela Direta |                      |         Identifica um grupo de fornecedores         |                                                                         Grupo de Fornecedores                                                                          |
|        Empresa        |      AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |       Empresa/Locatário para esta instalação.       | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|      Organização      |       AD\_Org\_ID        | Tabela Direta |   (@AD\_Org\_ID@)    |      Entidade organizacional dentro da Empresa      |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Categoria de Produto  | M\_Product\_Category\_ID |   Procurar    | M\_Product Category  |               Categoria de um Produto               |                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                        |
|        Produto        |      M\_Product\_ID      |   Procurar    | M\_Product (stocked) |               Produto, Serviço, Item                |                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                  |
|        Armazém        |     M\_Warehouse\_ID     | Tabela Direta |                      |       Armazém de estocagem e Ponto de Serviço       |                          O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                          |
|   Grupo do Produto    |  COF\_ProductGroup\_ID   |   Procurar    |                      | Coluna de relação com a tabela de grupo do produto  |                                                                      Primary Key : Product Group                                                                       |
|   Classe do Produto   |  COF\_ProductClass\_ID   |   Procurar    |                      | Coluna de relação com a tabela de classe de produto |                                                                      Primary Key : Product Class                                                                       |
|    Tipo do Produto    |   COF\_ProductType\_ID   |   Procurar    |                      |  Coluna de relação com a tabela de tipo de produto  |                                                                       Primary Key : Product Type                                                                       |

</div>

</div>

  

</div>
