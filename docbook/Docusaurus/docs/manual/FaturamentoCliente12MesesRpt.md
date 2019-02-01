---
title: "Faturamento Cliente 12 Meses"
id: FaturamentoCliente12MesesRpt
---
<div id="d101052e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Faturamento Cliente 12 Meses

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-03-08 15:41:20.0

<span class="emphasis">*Atualizado:*</span>2017-12-20 11:57:39.0

<span class="emphasis"> *Descrição:* </span>Faturamento Cliente 12 Meses

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório selecionado
por Data de Faturamento, exibe o que foi faturado em cada Mês. Tem
totalizador que no final exibe o valor Total do que foi faturado.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/FaturamentoCliente12Meses.png)

<div id="d101052e26" class="table">

<div class="table-title">

Table 1.1. FaturamentoCliente12Meses
Parâmetros

</div>

<div class="table-contents">

|          Nome           |     Nome da coluna      |  Referência   |   Valores(Padrão)    |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :---------------------: | :-----------: | :------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |     AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|       Organização       |       AD\_Org\_ID       | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Representante de Vendas |      SalesRep\_ID       |   Procurar    |                      |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|  Parceiro de Negócios   |     C\_BPartner\_ID     |   Procurar    |                      |                     Identifica um Parceiro de Negócios.                      |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios |     Lista     |       Não Sim        | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|   Grupo de Parceiros    |    C\_BP\_Group\_ID     | Tabela Direta |                      |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |

</div>

</div>

  

</div>
