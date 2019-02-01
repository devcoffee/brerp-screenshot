---
title: "Relatório Orçamento por Período"
id: RelatorioOrcamentoporPeriodoRpt
---
<div id="d196124e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório Orçamento por Período

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-06-28 16:48:51.0

<span class="emphasis">*Atualizado:*</span>2017-08-23 13:42:51.0

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatorioOrcamentoporPeriodo.png)

<div id="d196124e18" class="table">

<div class="table-title">

Table 1.1. RelatorioOrcamentoporPeriodo
Parâmetros

</div>

<div class="table-contents">

|        Nome        |     Nome da coluna      |  Referência   |  Valores(Padrão)   |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :----------------: | :---------------------: | :-----------: | :----------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Organização     |       AD\_Org\_ID       | Tabela Direta |  (@AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|     Orçamento      |   COF\_Orcamento\_ID    | Tabela Direta |                    |          Primary Key : Orçamento          |                                                                        Primary Key : Orçamento                                                                         |
|      Empresa       |     AD\_Client\_ID      | Tabela Direta | (@AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
| Grupo Orçamentário | COF\_OrcamentoGrupo\_ID | Tabela Direta |                    |     Primary Key : Grupo Orçamentário      |                                                                    Primary Key : Grupo Orçamentário                                                                    |

</div>

</div>

  

</div>
