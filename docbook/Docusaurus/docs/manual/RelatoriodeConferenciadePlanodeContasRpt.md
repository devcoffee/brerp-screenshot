---
title: "Relatório de Conferência de Plano de Contas"
id: RelatoriodeConferenciadePlanodeContasRpt
---
<div id="d198873e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Conferência de Plano de Contas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-12-22 16:15:11.0

<span class="emphasis">*Atualizado:*</span>2015-12-22 16:15:11.0

<span class="emphasis"> *Descrição:* </span>Relatório de Conferência de
Plano de Contas

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório utilizado
para confrontar Contas Contabeís com Contas Referenciadas

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeConferenciadePlanodeContas.png)

<div id="d198873e26" class="table">

<div class="table-title">

Table 1.1. RelatoriodeConferenciadePlanodeContas
Parâmetros

</div>

<div class="table-contents">

|         Nome         |    Nome da coluna    |  Referência   |   Valores(Padrão)    |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :------------------: | :-----------: | :------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Elemento       | COF\_ElementFrom\_ID |   Procurar    |      C\_Element      |             Elemento Contábil             |                      O "Elemento Contábil" identifica um Tipo de Conta inequivocamente. Estes são geralmente conhecidos como um Plano de Contas.                       |
|       Empresa        |    AD\_Client\_ID    | Tabela Direta | (@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |     AD\_Org\_ID      | Tabela Direta |  (@\#AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Contas Referenciadas | ContasReferenciadas  |    Sim-Não    |        ('Y')         |     Exibi Apenas Contas Referenciadas     |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
