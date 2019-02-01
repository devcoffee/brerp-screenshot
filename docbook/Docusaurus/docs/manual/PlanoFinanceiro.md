---
title: "Plano Financeiro"
id: PlanoFinanceiro
---
<div id="d174918e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Plano Financeiro

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Plano Financeiro -
    COF\_C\_PlanoFinanceiro](#d174918e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Plano Financeiro -
classificação fiscal (ver descrição)

<span class="emphasis">*Comentário/Ajuda:* </span>O BrERP esta projetado
para operar no Regime de competência, porém algumas empresas de menor
porte ou até mesmo empresas maiores, mas que objetivam ter uma visão
financeira de seus apontamentos precisam classificar lançamentos de
forma controverso das normas contábeis. O regime de competência é um
princípio contábil, que deve ser, na prática, estendido a qualquer
alteração patrimonial, independentemente de sua natureza e origem.Sob o
método de competência, os efeitos financeiros das transações e eventos
são reconhecidos nos períodos nos quais ocorrem, independentemente de
terem sido recebidos ou pagos.Como vimos anteriormente, no regime de
caixa registram-se as receitas, despesas e custos somente quando estes
forem recebidos (receitas) ou pagos (despesas e custos).Portanto, sob a
ótica legal, somente e regime de competência pode ser utilizado pelas
organizações para reconhecimento de suas receitas, custos e despesas.

<span class="emphasis"> *Criado em:* </span>2017-03-03 18:24:51.0

<span class="emphasis">*Atualizado em:* </span>2017-03-03 18:24:51.0

<div id="d174918e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Plano Financeiro - COF\_C\_PlanoFinanceiro

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_PlanoFinanceiro_data)

<span class="emphasis">*Descrição:*</span> Plano Financeiro

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d174918e35" class="table">

<div class="table-title">

Table 1.1. Plano Financeiro
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |                           Valores (Padrão)                           | Chave restritiva |                Regra de validação                |                Descrição                 |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :--------------: | :-------------------------------: | :------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Plano Financeiro |                ID                 |                                                                      |                  |                                                  |      Primary Key : Plano Financeiro      |                                                                                                                                          Primary Key : Plano Financeiro                                                                                                                                          |
|     Empresa      |           Tabela Direta           |                         (@\#AD\_Client\_ID@)                         |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|   Organização    |           Tabela Direta           |                          (@\#AD\_Org\_ID@)                           |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|  Chave de Busca  |       Texto Curto (String)        |                                                                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|      Ativo       |              Sim-Não              |                                 (Y)                                  |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|       Nome       |       Texto Curto (String)        |                                                                      |                  |                                                  |  Alphanumeric identifier of the entity   |                                                                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                   |
|    Descrição     | Texto Médio (até 2000 caracteres) |                                                                      |                  |                                                  | Optional short description of the record |                                                                                                                                   A description is limited to 255 characters.                                                                                                                                    |
|  Tipo de Conta   |               Lista               | Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita |                  |                                                  |      Indicates the type of account       | Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo. The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners. Note: Memo account amounts are ignored when checking for balancing |
| Nível de Resumo  |              Sim-Não              |                                 (N)                                  |                  |                                                  |         This is a summary entity         |                                                                                   A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                                    |

</div>

</div>

  

</div>
