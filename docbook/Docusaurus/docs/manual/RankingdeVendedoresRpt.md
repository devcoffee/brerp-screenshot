---
title: "Ranking de Vendedores"
id: RankingdeVendedoresRpt
---
<div id="d188689e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Ranking de Vendedores

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-22 15:32:38.0

<span class="emphasis">*Atualizado:*</span>2016-05-22 15:32:38.0

<span class="emphasis"> *Descrição:* </span>Ranking de Vendedores

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório exibe todos
os vendedores que tiveram vendas dentro do período selecionado, listando
por ordem de maior venda.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RankingdeVendedores.png)

<div id="d188689e26" class="table">

<div class="table-title">

Table 1.1. RankingdeVendedores
Parâmetros

</div>

<div class="table-contents">

|          Nome           |     Nome da coluna      |  Referência   |   Valores(Padrão)    |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :---------------------: | :-----------: | :------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |     AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|       Organização       |       AD\_Org\_ID       | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Representante de Vendas |      SalesRep\_ID       |   Procurar    |                      |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios |     Lista     |       Não Sim        | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|      Data Faturada      |      DateInvoiced       |     Data      |      (@\#Date@)      |                    Data impressa na Fatura (Nota Fiscal)                     |                                                                                  A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                  |

</div>

</div>

  

</div>
