---
title: "Relatório Comparativo Semestral de Vendas"
id: RelatorioComparativoSemestraldeVendasRpt
---
<div id="d195857e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório Comparativo Semestral de Vendas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-02-01 15:18:24.0

<span class="emphasis">*Atualizado:*</span>2018-02-01 15:18:24.0

<span class="emphasis"> *ReportView:* </span>null

<div id="d195857e17" class="table">

<div class="table-title">

Table 1.1. RelatorioComparativoSemestraldeVendas
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |                                     Valores(Padrão)                                      |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :----------------------: | :-----------: | :--------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Parceiro de Negócios   |     C\_BPartner\_ID      |   Procurar    |                                                                                          |                     Identifica um Parceiro de Negócios.                      |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|   Grupo de Parceiros    |     C\_BP\_Group\_ID     | Tabela Direta |                                                                                          |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
|     Tipo do Produto     |   COF\_ProductType\_ID   |   Procurar    |                                                                                          |              Coluna de relação com a tabela de tipo de produto               |                                                                                                    Primary Key : Product Type                                                                                                     |
|    Classe do Produto    |  COF\_ProductClass\_ID   |   Procurar    |                                                                                          |             Coluna de relação com a tabela de classe de produto              |                                                                                                    Primary Key : Product Class                                                                                                    |
|    Grupo do Produto     |  COF\_ProductGroup\_ID   |   Procurar    |                                                                                          |              Coluna de relação com a tabela de grupo do produto              |                                                                                                    Primary Key : Product Group                                                                                                    |
|  Categoria de Produto   | M\_Product\_Category\_ID | Tabela Direta |                                                                                          |                           Categoria de um Produto                            |                                                     Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                      |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios  |     Lista     |                                         Não Sim                                          | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
| Representante de Vendas |       SalesRep\_ID       |   Procurar    |                                   AD\_User - SalesRep                                    |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|           Ano           |         COF\_Ano         |    Inteiro    |                                                                                          |                                     null                                     |                                                                                                               null                                                                                                                |
|   Transação de Vendas   |         IsSOTrx          |    Sim-Não    |                                           (Y)                                            |                        Esta é uma Transação de Vendas                        |                                                                    A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                                                    |
|         Empresa         |      AD\_Client\_ID      | Tabela Direta |                                   (@\#AD\_Client\_ID@)                                   |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |                                                                                          |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|           Mês           |         COF\_Mes         |     Lista     | Janeiro Fevereiro Março Abril Maio Junho Julho Agosto Setembro Outubro Novembro Dezembro |                                     null                                     |                                                                                                               null                                                                                                                |

</div>

</div>

  

</div>
