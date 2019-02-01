---
title: "Curva ABC de Produto"
id: CurvaABCdeProdutoRpt
---
<div id="d39571e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Curva ABC de Produto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-01-31 16:54:27.0

<span class="emphasis">*Atualizado:*</span>2018-01-31 16:54:27.0

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/CurvaABCdeProduto.png)

<div id="d39571e18" class="table">

<div class="table-title">

Table 1.1. CurvaABCdeProduto
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |   Valores(Padrão)    |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :----------------------: | :-----------: | :------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Grupo de Fornecedores  | COF\_GrupoFornecedor\_ID | Tabela Direta |                      |                     Identifica um grupo de fornecedores                      |                                                                                                       Grupo de Fornecedores                                                                                                       |
|         Empresa         |      AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Representante de Vendas |       SalesRep\_ID       |   Procurar    | AD\_User - SalesRep  |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios  |     Lista     |       Não Sim        | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|   Grupo de Parceiros    |     C\_BP\_Group\_ID     |   Procurar    |                      |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
|     Tipo do Produto     |   COF\_ProductType\_ID   |   Procurar    |                      |              Coluna de relação com a tabela de tipo de produto               |                                                                                                    Primary Key : Product Type                                                                                                     |
|    Classe do Produto    |  COF\_ProductClass\_ID   |   Procurar    |                      |             Coluna de relação com a tabela de classe de produto              |                                                                                                    Primary Key : Product Class                                                                                                    |
|    Grupo do Produto     |  COF\_ProductGroup\_ID   |   Procurar    |                      |              Coluna de relação com a tabela de grupo do produto              |                                                                                                    Primary Key : Product Group                                                                                                    |
|  Categoria de Produto   | M\_Product\_Category\_ID | Tabela Direta |                      |                           Categoria de um Produto                            |                                                     Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                      |
|      Data da Conta      |         DateAcct         |     Data      |      (@\#Date@)      |                                Data Contábil                                 |                               A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                |

</div>

</div>

  

</div>
