---
title: "Relatorio de Fechamento de Estoque x Contabilidade"
id: RelatoriodeFechamentodeEstoquexContabilidadeRpt
---
<div id="d200143e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatorio de Fechamento de Estoque x Contabilidade

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-08-01 13:06:00.0

<span class="emphasis">*Atualizado:*</span>2015-08-01 13:06:00.0

<span class="emphasis"> *Descrição:* </span>Relatorio de Fechamento de
Estoque x Contabilidade

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeFechamentodeEstoquexContabilidade.png)

<div id="d200143e22" class="table">

<div class="table-title">

Table 1.1. RelatoriodeFechamentodeEstoquexContabilidade
Parâmetros

</div>

<div class="table-contents">

|        Nome        |   Nome da coluna    |  Referência   |   Valores(Padrão)    |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :----------------: | :-----------------: | :-----------: | :------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa       |   AD\_Client\_ID    | Tabela Direta | (@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|    Organização     |     AD\_Org\_ID     | Tabela Direta |  (@\#AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Elemento de Contas | C\_ElementValue\_ID |   Procurar    |                      |            Elemento de Contas             |                                         Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                          |
| Elemento de Custo  | M\_CostElement\_ID  | Tabela Direta |                      |       Elemento de Custo de Produto        |                                                                                  null                                                                                  |
|  Esquema Contábil  |  C\_AcctSchema\_ID  | Tabela Direta |                      |         Regras para contabilidade         |                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                         |
|      Armazém       |  M\_Warehouse\_ID   | Tabela Direta |                      |  Armazém de estocagem e Ponto de Serviço  |                          O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                          |

</div>

</div>

  

</div>
