---
title: "Orçamento de Razão Geral"
id: OrcamentodeRazaoGeral
---
<div id="d151615e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Orçamento de Razão Geral

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Orçamento -
    GL\_Budget](#d151615e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Orçamentos
de Razão Geral

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>1999-09-26 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/OrcamentodeRazaoGeral.png)

<div id="d151615e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Orçamento - GL\_Budget

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/GL_Budget_data)

<span class="emphasis">*Descrição:*</span> A Aba "Orçamento RG" define o
Orçamento de Razão Geral

<span class="emphasis">*Comentário/Ajuda:* </span> Os Orçamentos de RG
são usados para definir os custos antecipados ao se fazer negócios.
Eles são usados em relatórios em comparação aos valores reais.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d151615e40" class="table">

<div class="table-title">

Table 1.1. Budget
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                  Descrição                  |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Orçamento      |          ID          |                      |                  |                                                  |            General Ledger Budget            |   The General Ledger Budget identifies a user defined budget. These can be used in reporting as a comparison against your actual amounts.    |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  |    Alphanumeric identifier of the entity    | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      | Texto Curto (String) |                      |                  |                                                  |  Optional short description of the record   |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|      Primário       |       Sim-Não        |                      |                  |                                                  |   Indicates if this is the primary budget   |                                     The Primary checkbox indicates if this budget is the primary budget.                                     |
| Estado do Orçamento |        Lista         | Aprovado Esboço (D)  |                  |                                                  | Indicates the current status of this budget |                             The Budget Status indicates the current status of this budget (i.e Draft, Approved)                              |
|   GL\_Budget\_UU    | Texto Curto (String) |                      |                  |                                                  |                                             |                                                                                                                                              |

</div>

</div>

  

</div>
