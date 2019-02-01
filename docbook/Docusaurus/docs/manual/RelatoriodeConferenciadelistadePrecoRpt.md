---
title: "Relatório de Conferência de lista de Preço"
id: RelatoriodeConferenciadelistadePrecoRpt
---
<div id="d198912e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Conferência de lista de Preço

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-05-13 16:36:21.0

<span class="emphasis">*Atualizado:*</span>2015-05-13 16:36:21.0

<span class="emphasis"> *Descrição:* </span>Relatório de Conferência de
lista de Preço

<span class="emphasis"> *ReportView:* </span>null

<div id="d198912e21" class="table">

<div class="table-title">

Table 1.1. RelatoriodeConferenciadelistadePreco
Parâmetros

</div>

<div class="table-contents">

|           Nome           |      Nome da coluna       |  Referência   |   Valores(Padrão)    |                        Descrição                         |                                                                            Comentário/Ajuda                                                                            |
| :----------------------: | :-----------------------: | :-----------: | :------------------: | :------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |      AD\_Client\_ID       | Tabela Direta | (@\#AD\_Client\_ID@) |         Empresa/Locatário para esta instalação.          | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|   Categoria de Produto   | M\_Product\_Category\_ID  |   Procurar    |                      |                 Categoria de um Produto                  |                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                        |
| Versão da Lista de Preço | M\_PriceList\_Version\_ID |   Procurar    |                      | Identifica uma instância exclusiva de uma Lista de Preço |                      Cada Lista de Preço pode ter múltiplas versões. O uso mais comum é para indicar as datas de validade de uma Lista de Preço.                       |
|     Tipo do Produto      |   COF\_ProductType\_ID    |   Procurar    |                      |    Coluna de relação com a tabela de tipo de produto     |                                                                       Primary Key : Product Type                                                                       |
|    Classe do Produto     |   COF\_ProductClass\_ID   |   Procurar    |                      |   Coluna de relação com a tabela de classe de produto    |                                                                      Primary Key : Product Class                                                                       |
|     Grupo do Produto     |   COF\_ProductGroup\_ID   |   Procurar    |                      |    Coluna de relação com a tabela de grupo do produto    |                                                                      Primary Key : Product Group                                                                       |
|   Organização Estoque    |    COF\_OrgStorage\_ID    |    Tabela     |    AD\_Org (all)     |                           null                           |                                                                                  null                                                                                  |
|       Organização        |        AD\_Org\_ID        | Tabela Direta |  (@\#AD\_Org\_ID@)   |        Entidade organizacional dentro da Empresa         |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|  Organização do Produto  |    COF\_OrgProduct\_ID    |    Tabela     |  COF\_AD\_Org (all)  |                           null                           |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
