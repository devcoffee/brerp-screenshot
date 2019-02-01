---
title: "Relatório de Auditoria de Programação de Pagamento Inválida"
id: RelatoriodeAuditoriadeProgramacaodePagamentoInvalidaRpt
---
<div id="d197084e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Auditoria de Programação de Pagamento Inválida

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-07-12 09:31:53.0

<span class="emphasis">*Atualizado:*</span>2016-07-12 09:31:53.0

<span class="emphasis"> *Descrição:* </span>Este relatório traz todas as
programações de pagamentos que estão inválidas de uma fatura.

<span class="emphasis"> *ReportView:* </span>null

<div id="d197084e21" class="table">

<div class="table-title">

Table 1.1. RelatoriodeAuditoriadeProgramacaodePagamentoInvalida
Parâmetros

</div>

<div class="table-contents">

|         Nome         | Nome da coluna  |  Referência   |   Valores(Padrão)    |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :-------------: | :-----------: | :------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        | AD\_Client\_ID  | Tabela Direta | (@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |   AD\_Org\_ID   | Tabela Direta |  (@\#AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Parceiro de Negócios | C\_BPartner\_ID |   Procurar    |                      |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
| Transação de Vendas  |     IsSOTrx     |    Sim-Não    |         (Y)          |      Esta é uma Transação de Vendas       |                                      A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                       |
|    Data Faturada     |  DateInvoiced   |     Data      |      (@\#Date@)      |   Data impressa na Fatura (Nota Fiscal)   |                                                    A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                     |

</div>

</div>

  

</div>
