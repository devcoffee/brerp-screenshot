---
title: "Contas a Pagar/Plano Caixa"
id: ContasaPagarPlanoCaixaRpt
---
<div id="d36060e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Contas a Pagar/Plano Caixa

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-08-10 14:21:44.0

<span class="emphasis">*Atualizado:*</span>2016-08-12 10:50:39.0

<span class="emphasis"> *Descrição:* </span>Relatório Contas a
Pagar/Plano de Caixa

<span class="emphasis"> *Comentário/Ajuda:* </span>Mostra todas as
faturas a pagar, assim como o plano de caixa, ambos em um período
determinado.

<span class="emphasis"> *ReportView:* </span>null

<div id="d36060e25" class="table">

<div class="table-title">

Table 1.1. ContasaPagar/PlanoCaixa
Parâmetros

</div>

<div class="table-contents">

|        Nome         |   Nome da coluna    |  Referência   |                               Valores(Padrão)                               |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :-----------------: | :-----------------: | :-----------: | :-------------------------------------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa       |   AD\_Client\_ID    | Tabela Direta |                            (@\#AD\_Client\_ID@)                             |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização     |     AD\_Org\_ID     | Tabela Direta |                              (@\#AD\_Org\_ID@)                              | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Transação de Vendas |       IsSOTrx       |    Sim-Não    |                                     (Y)                                     |      Esta é uma Transação de Vendas       |                                                  O checkbox Transação de Vendas indica se é uma transação de vendas.                                                   |
| Tipo de Lançamento  | COF\_TipoLancamento |     Lista     |                                Previsto Real                                |                   null                    |                                                                                  null                                                                                  |
| Data de Vencimento  |       DueDate       |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |       Data em que vence o pagamento       |                                                          Data que o pagamento vence sem deduções ou descontos                                                          |

</div>

</div>

  

</div>
