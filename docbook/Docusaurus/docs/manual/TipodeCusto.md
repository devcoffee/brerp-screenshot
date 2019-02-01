---
title: "Tipo de Custo"
id: TipodeCusto
---
<div id="d240832e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Custo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Custo -
    M\_CostType](#d240832e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Tipos de
Custo

<span class="emphasis">*Comentário/Ajuda:* </span>Você pode definir
múltiplos tipos de custos. O tipo de custo selecionado em um "Esquema
Contábil" é utilizada para a contabilidade.

<span class="emphasis"> *Criado em:* </span>2003-06-01 23:19:56.0

<span class="emphasis">*Atualizado em:* </span>2005-04-24 21:03:43.0

<div id="d240832e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Custo - M\_CostType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_CostType_data)

<span class="emphasis">*Descrição:*</span> Tipo de Custo (ex. Atual,
Planejado, Futuro)

<span class="emphasis">*Comentário/Ajuda:* </span> Você pode definir
múltiplos tipos de custos. O tipo de custo selecionado em um "Esquema
Contábil" é utilizada para a Contabilidade.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240832e39" class="table">

<div class="table-title">

Table 1.1. Cost Type
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                 Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Custo   |                ID                 |                      |                  |                                                  | Type of Cost (e.g. Current, Plan, Future) |                   You can define multiple cost types. A cost type selected in an Accounting Schema is used for accounting.                   |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)     |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)     |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                  |                                                  |   Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record  |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |              Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)     |                                                             (ver o mesmo acima)                                                              |
| M\_CostType\_UU  |       Texto Curto (String)        |                      |                  |                                                  |                                           |                                                                                                                                              |

</div>

</div>

  

</div>
