---
title: "Grupo de Recorrência"
id: GrupodeRecorrencia
---
<div id="d112510e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Recorrência

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Recurring Group -
    C\_RecurringGroup](#d112510e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Grupo de Recorrência

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2014-07-27 15:38:22.0

<span class="emphasis">*Atualizado em:* </span>2014-07-27 15:38:22.0

<div id="d112510e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Recurring Group - C\_RecurringGroup

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112510e29" class="table">

<div class="table-title">

Table 1.1. Recurring Group
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   |     Chave restritiva      |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :-------------------------------: | :------------------: | :-----------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo de Recorrência |                ID                 |                      |                           |                                                  |                                          |                                                                                                                                              |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) | ADClient\_CRecurringGroup |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |  ADOrg\_CRecurringGroup   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca    |       Texto Curto (String)        |                      |                           |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         |       Texto Curto (String)        |                      |                           |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       |       Texto Curto (String)        |                      |                           |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                      |                           |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|        Ativo         |              Sim-Não              |         (Y)          |                           |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
