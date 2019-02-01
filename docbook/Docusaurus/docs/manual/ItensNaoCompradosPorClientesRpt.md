---
title: "Itens Não Comprados Por Clientes"
id: ItensNaoCompradosPorClientesRpt
---
<div id="d130782e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Itens Não Comprados Por Clientes

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-02-06 09:05:51.0

<span class="emphasis">*Atualizado:*</span>2018-02-06 09:05:51.0

<span class="emphasis"> *Descrição:* </span>Lista os Produtos não
vendidos a clientes em um determinado período de tempo, ou de toda
história do faturamento.

<span class="emphasis"> *ReportView:* </span>null

<div id="d130782e21" class="table">

<div class="table-title">

Table 1.1. ItensNaoCompradosPorClientes
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |   Valores(Padrão)    |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :----------------------: | :-----------: | :------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|         Empresa         |      AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|  Parceiro de Negócios   |     C\_BPartner\_ID      |   Procurar    |                      |                     Identifica um Parceiro de Negócios.                      |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|   Grupo de Parceiros    |     C\_BP\_Group\_ID     | Tabela Direta |                      |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
| Representante de Vendas |       SalesRep\_ID       |   Procurar    | AD\_User - SalesRep  |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|         Produto         |      M\_Product\_ID      |   Procurar    |                      |                            Produto, Serviço, Item                            |                                                                               Identifica um item que é ou comprado ou vendido por esta organização.                                                                               |
|  Categoria de Produto   | M\_Product\_Category\_ID | Tabela Direta |                      |                           Categoria de um Produto                            |                                                     Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                      |
|     Tipo do Produto     |   COF\_ProductType\_ID   |   Procurar    |                      |              Coluna de relação com a tabela de tipo de produto               |                                                                                                    Primary Key : Product Type                                                                                                     |
|    Grupo do Produto     |  COF\_ProductGroup\_ID   |   Procurar    |                      |              Coluna de relação com a tabela de grupo do produto              |                                                                                                    Primary Key : Product Group                                                                                                    |
|    Classe do Produto    |  COF\_ProductClass\_ID   |   Procurar    |                      |             Coluna de relação com a tabela de classe de produto              |                                                                                                    Primary Key : Product Class                                                                                                    |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios  |     Lista     |       Não Sim        | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|  Grupo de Fornecedores  | COF\_GrupoFornecedor\_ID | Tabela Direta |                      |                     Identifica um grupo de fornecedores                      |                                                                                                       Grupo de Fornecedores                                                                                                       |
|      Data Faturada      |       DateInvoiced       |     Data      |                      |                    Data impressa na Fatura (Nota Fiscal)                     |                                                                                  A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                  |

</div>

</div>

  

</div>
