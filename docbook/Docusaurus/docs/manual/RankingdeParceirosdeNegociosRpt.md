---
title: "Ranking de Parceiros de Negócios"
id: RankingdeParceirosdeNegociosRpt
---
<div id="d188644e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Ranking de Parceiros de Negócios

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-03-11 16:42:29.0

<span class="emphasis">*Atualizado:*</span>2016-03-11 16:42:29.0

<span class="emphasis"> *Descrição:* </span>Lista os 50 maiores
devedores/atrasados

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
Ranking Parceiros de Negócios exibe os 50 maiores parcieros de negócios
devedores/atrasados

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RankingdeParceirosdeNegocios.png)

<div id="d188644e26" class="table">

<div class="table-title">

Table 1.1. RankingdeParceirosdeNegocios
Parâmetros

</div>

<div class="table-contents">

|         Nome         |     Nome da coluna      |  Referência   |   Valores(Padrão)    |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :------------------: | :---------------------: | :-----------: | :------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |     AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|     Organização      |       AD\_Org\_ID       | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|         Tipo         |        cof\_Type        |     Lista     | Devedor Atrasado (0) |                                     null                                     |                                                                                                               null                                                                                                                |
| Transação de Vendas  |         IsSOTrx         |    Sim-Não    |        ('N')         |                        Esta é uma Transação de Vendas                        |                                                                    A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                                                    |
| Exibir em Relatórios | cof\_ExibirEmRelatorios |     Lista     |       Não Sim        | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |

</div>

</div>

  

</div>
