---
title: "Fluxo de Caixa Resumido"
id: FluxodeCaixaResumidoRpt
---
<div id="d104961e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Fluxo de Caixa Resumido

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-10-26 10:48:09.0

<span class="emphasis">*Atualizado:*</span>2015-10-26 10:48:09.0

<span class="emphasis"> *Comentário/Ajuda:* </span>Projeta o fluxo para
o período selecionado, levando em consideração o contas a receber e o
contas a pagar até a data e o saldo bancário. Obs: descarta contas que
estão selecionados para não compor fluxo de caixa e também duplicatas
que estão com tipo de operação diferente de cobrança simples.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/FluxodeCaixaResumido.png)

<div id="d104961e22" class="table">

<div class="table-title">

Table 1.1. FluxodeCaixaResumido
Parâmetros

</div>

<div class="table-contents">

|             Nome              |         Nome da coluna          |  Referência   |          Valores(Padrão)          |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------------: | :-----------------------------: | :-----------: | :-------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Empresa            |         AD\_Client\_ID          | Tabela Direta |       (@\#AD\_Client\_ID@)        |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|  Considerar Projeção Passada  |    consideraProjecaoPassada     |    Sim-Não    |                                   |                         Considerar Projeção Passada                          |                                                                                                               null                                                                                                                |
|   Considerar Plano de Caixa   |     considerarPlanoDeCaixa      |    Sim-Não    |               ('N')               |                                     null                                     |                                                                                                               null                                                                                                                |
| Buscar Saldos Não Conciliados | COF\_BuscarSaldosNaoConciliados |    Sim-Não    |                (N)                |                                     null                                     |                                                                                                               null                                                                                                                |
|     Exibir em Relatórios      |     cof\_ExibirEmRelatorios     |     Lista     |              Não Sim              | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|        Exibir Detalhes        |       COF\_ExibirDetalhes       |    Sim-Não    |                                   |                                     null                                     |                                                                                                               null                                                                                                                |
|          Organização          |           AD\_Org\_ID           | Tabela Direta |         (@\#AD\_Org\_ID@)         |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|       Data da Transação       |             DateTrx             |     Data      |            (@\#Date@)             |                              Data da Transação                               |                                                                                    A "Data da Transação" indica a data da transação comercial.                                                                                    |
|       Data de Conversão       |       COF\_DataConversao        |     Data      | (@SQL=SELECT SYSDATE-1 FROM DUAL) |                                     null                                     |                                                                                                               null                                                                                                                |

</div>

</div>

  

</div>
