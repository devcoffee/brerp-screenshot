---
title: "Tax Definition Group"
id: TaxDefinitionGroup
---
<div id="d239593e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tax Definition Group

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Configuração de Impostos
    - COF\_TaxDefinition\_Group](#d239593e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-01-28 15:46:20.0

<span class="emphasis">*Atualizado em:* </span>2016-01-28
15:46:20.0

<div id="d239593e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Configuração de Impostos - COF\_TaxDefinition\_Group

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d239593e29" class="table">

<div class="table-title">

Table 1.1. Tax Definition Group
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| COF\_TaxDefinition\_Group\_ID |          ID          |                      |                  |                                                  |    Primary Key : Tax Definition Group    |                                                      Primary Key : Tax Definition Group                                                      |
|            Empresa            |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Organização          |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Chave de Busca         | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Ativo             |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Nome              | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|           Descrição           | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
