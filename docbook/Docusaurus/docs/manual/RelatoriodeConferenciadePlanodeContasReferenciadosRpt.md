---
title: "Relatório de Conferência de Plano de Contas Referenciados"
id: RelatoriodeConferenciadePlanodeContasReferenciadosRpt
---
<div id="d198834e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Conferência de Plano de Contas Referenciados

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-12-22 16:27:20.0

<span class="emphasis">*Atualizado:*</span>2015-12-22 16:27:20.0

<span class="emphasis"> *Descrição:* </span>Relatório de Conferência de
Plano de Contas Referenciados

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório utilizado
para confrontar Contas Referenciadas com Contas Contabeís

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeConferenciadePlanodeContasReferenciados.png)

<div id="d198834e26" class="table">

<div class="table-title">

Table 1.1. RelatoriodeConferenciadePlanodeContasReferenciados
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna    |  Referência   |   Valores(Padrão)    |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :-----------------: | :-----------: | :------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |   AD\_Client\_ID    | Tabela Direta | (@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |     AD\_Org\_ID     | Tabela Direta |  (@\#AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|       Elemento       |   C\_Element\_ID    |   Procurar    |                      |             Elemento Contábil             |                      O "Elemento Contábil" identifica um Tipo de Conta inequivocamente. Estes são geralmente conhecidos como um Plano de Contas.                       |
| Contas Referenciadas | ContasReferenciadas |    Sim-Não    |        ('Y')         |     Exibi Apenas Contas Referenciadas     |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
