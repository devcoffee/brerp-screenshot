---
title: "Detalhes Orçamento"
id: DetalhesOrcamentoRpt
---
<div id="d48401e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Detalhes Orçamento

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-06-23 11:30:58.0

<span class="emphasis">*Atualizado:*</span>2017-06-23 11:30:58.0

<span class="emphasis"> *ReportView:* </span>COF\_DetalhesOrcamento

<div id="d48401e17" class="table">

<div class="table-title">

Table 1.1. DetalhesOrcamento
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna       |  Referência   | Valores(Padrão) |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :-----------------------: | :-----------: | :-------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |      AD\_Client\_ID       | Tabela Direta |                 |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |        AD\_Org\_ID        | Tabela Direta |                 | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|      Orçamento       |    COF\_Orcamento\_ID     | Tabela Direta |                 |          Primary Key : Orçamento          |                                                                        Primary Key : Orçamento                                                                         |
| Período de Orçamento | COF\_OrcamentoPeriodo\_ID | Tabela Direta |                 |           Primary Key : Período           |                                                                         Primary Key : Período                                                                          |
|  Grupo Orçamentário  |  COF\_OrcamentoGrupo\_ID  | Tabela Direta |                 |     Primary Key : Grupo Orçamentário      |                                                                    Primary Key : Grupo Orçamentário                                                                    |

</div>

</div>

  

<div id="d48401e107" class="table">

<div class="table-title">

Table 1.2. COF\_DetalhesOrcamento -
Colunas

</div>

<div class="table-contents">

|    Nome da coluna     |      Referência      |    Valores padrão    | Valor de restrição |                Regra de validação                |            Descrição             |         Comentário/Ajuda         |
| :-------------------: | :------------------: | :------------------: | :----------------: | :----------------------------------------------: | :------------------------------: | :------------------------------: |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |           (ver acima)            |           (ver acima)            |
|      Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (ver acima)            |           (ver acima)            |
|  Grupo Orçamentário   |    Tabela Direta     |                      |                    |                                                  | Primary Key : Grupo Orçamentário | Primary Key : Grupo Orçamentário |
|       Orçamento       |    Tabela Direta     |                      |                    |                                                  |     Primary Key : Orçamento      |     Primary Key : Orçamento      |
| Período de Orçamento  |    Tabela Direta     |                      |                    |                                                  |      Primary Key : Período       |      Primary Key : Período       |
| itemultimaatualizacao |      Data+Hora       |                      |                    |                                                  |                                  |                                  |
|  itemvalorcalculado   |        Número        |                      |                    |                                                  |                                  |                                  |
|    itemvalororcado    |        Número        |                      |                    |                                                  |                                  |                                  |
|       itemvalue       | Texto Curto (String) |                      |                    |                                                  |                                  |                                  |
|   orcamentodatefrom   |      Data+Hora       |                      |                    |                                                  |                                  |                                  |
|    orcamentodateto    |      Data+Hora       |                      |                    |                                                  |                                  |                                  |
|   orcamentoemvigor    |       Sim-Não        |                      |                    |                                                  |                                  |                                  |
|    orcamentovalue     | Texto Curto (String) |                      |                    |                                                  |                                  |                                  |
|  orggrupodescription  | Texto Curto (String) |                      |                    |                                                  |                                  |                                  |
|     orcgrupovalue     | Texto Curto (String) |                      |                    |                                                  |                                  |                                  |
|    periododatefrom    |      Data+Hora       |                      |                    |                                                  |                                  |                                  |
|     periododateto     |      Data+Hora       |                      |                    |                                                  |                                  |                                  |
|     periodovalue      | Texto Curto (String) |                      |                    |                                                  |                                  |                                  |
|     tipoorcamento     | Texto Curto (String) |                      |                    |                                                  |                                  |                                  |

</div>

</div>

  

</div>
