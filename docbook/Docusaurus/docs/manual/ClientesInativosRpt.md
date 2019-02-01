---
title: "Clientes Inativos"
id: ClientesInativosRpt
---
<div id="d28026e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Clientes Inativos

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-11-14 11:00:27.0

<span class="emphasis">*Atualizado:*</span>2015-11-14 11:00:27.0

<span class="emphasis"> *Descrição:* </span>Clientes Inativos

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
Clientes Inativos lista todos os clientes que não compram desde os dias
informados no parâmetro, podendo selecionar um Representante Interno ou
não.

<span class="emphasis"> *ReportView:* </span>null

<div id="d28026e25" class="table">

<div class="table-title">

Table 1.1. ClientesInativos
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |   Valores(Padrão)    |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :----------------------: | :-----------: | :------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Dias Inativos      |       DiasInativos       |    Inteiro    |        (180)         |                                     null                                     |                                                                                                               null                                                                                                                |
|  Grupo de Fornecedores  | COF\_GrupoFornecedor\_ID | Tabela Direta |                      |                     Identifica um grupo de fornecedores                      |                                                                                                       Grupo de Fornecedores                                                                                                       |
|         Empresa         |      AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Representante de Vendas |       SalesRep\_ID       | Tabela Direta |   (@AD\_User\_ID@)   |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|      Mostrar Todos      |       cof\_ShowAll       |    Sim-Não    |                      |        Mostrar todos ou somente clientes que já compraram alguma vez         |                                                                                                               null                                                                                                                |
|         Produto         |      M\_Product\_ID      |   Procurar    |                      |                            Produto, Serviço, Item                            |                                                                               Identifica um item que é ou comprado ou vendido por esta organização.                                                                               |
|     Tipo do Produto     |   COF\_ProductType\_ID   | Tabela Direta |                      |              Coluna de relação com a tabela de tipo de produto               |                                                                                                    Primary Key : Product Type                                                                                                     |
|    Classe do Produto    |  COF\_ProductClass\_ID   | Tabela Direta |                      |             Coluna de relação com a tabela de classe de produto              |                                                                                                    Primary Key : Product Class                                                                                                    |
|    Grupo do Produto     |  COF\_ProductGroup\_ID   | Tabela Direta |                      |              Coluna de relação com a tabela de grupo do produto              |                                                                                                    Primary Key : Product Group                                                                                                    |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios  |     Lista     |       Não Sim        | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|   Grupo de Parceiros    |     C\_BP\_Group\_ID     | Tabela Direta |                      |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
|  Categoria de Produto   | M\_Product\_Category\_ID | Tabela Direta |                      |                           Categoria de um Produto                            |                                                     Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                      |

</div>

</div>

  

</div>
