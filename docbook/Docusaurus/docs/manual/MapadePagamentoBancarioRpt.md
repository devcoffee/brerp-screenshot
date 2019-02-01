---
title: "Mapa de Pagamento Bancario"
id: MapadePagamentoBancarioRpt
---
<div id="d144166e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Mapa de Pagamento Bancario

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-07-14 18:02:10.0

<span class="emphasis">*Atualizado:*</span>2015-07-14 18:02:10.0

<span class="emphasis"> *Descrição:* </span>Mapa de Pagamento Bancario

<span class="emphasis"> *ReportView:* </span>null

<div id="d144166e21" class="table">

<div class="table-title">

Table 1.1. MapadePagamentoBancario
Parâmetros

</div>

<div class="table-contents">

|           Nome           |   Nome da coluna   |  Referência   |                               Valores(Padrão)                               |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :----------------------: | :----------------: | :-----------: | :-------------------------------------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Conta Bancária      | C\_BankAccount\_ID |   Procurar    |                                                                             |              Conta no Banco               |                                                          A "Conta Bancária" identifica uma conta neste Banco.                                                          |
|         Empresa          |   AD\_Client\_ID   | Tabela Direta |                            (@\#AD\_Client\_ID@)                             |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|       Organização        |    AD\_Org\_ID     | Tabela Direta |                              (@\#AD\_Org\_ID@)                              | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Data da Linha de Extrato | StatementLineDate  |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |         Data da Linha do Extrato          |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
