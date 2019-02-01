---
title: "Geral de Contas Bancarias"
id: GeraldeContasBancariasRpt
---
<div id="d109075e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Geral de Contas Bancarias

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-03-08 16:32:11.0

<span class="emphasis">*Atualizado:*</span>2016-03-08 16:32:11.0

<span class="emphasis"> *Descrição:* </span>Geral de Contas Bancarias

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório lista todas
ou apenas uma conta Bancaria dependendo do Parâmetro, listando Saldo
Anterior, Debito, Crédito, Saldo Final.

<span class="emphasis"> *ReportView:* </span>null

<div id="d109075e25" class="table">

<div class="table-title">

Table 1.1. GeraldeContasBancarias
Parâmetros

</div>

<div class="table-contents">

|           Nome           |   Nome da coluna   |  Referência   |                               Valores(Padrão)                               |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :----------------------: | :----------------: | :-----------: | :-------------------------------------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Organização        |    AD\_Org\_ID     | Tabela Direta |                              (@\#AD\_Org\_ID@)                              | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|         Empresa          |   AD\_Client\_ID   | Tabela Direta |                            (@\#AD\_Client\_ID@)                             |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|      Conta Bancária      | C\_BankAccount\_ID |   Procurar    |                                                                             |              Conta no Banco               |                                                          A "Conta Bancária" identifica uma conta neste Banco.                                                          |
|        Atividade         |  C\_Activity\_ID   | Tabela Direta |                                                                             |           Atividade de Negócio            |                                 "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                  |
| Data da Linha de Extrato | StatementLineDate  |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |         Data da Linha do Extrato          |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
