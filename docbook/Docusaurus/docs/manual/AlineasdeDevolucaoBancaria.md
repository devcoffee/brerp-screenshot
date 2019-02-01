---
title: "Alíneas de Devolução Bancária"
id: AlineasdeDevolucaoBancaria
---
<div id="d3887e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Alíneas de Devolução Bancária

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Alíneas de Devolução -
    COF\_C\_Alinea](#d3887e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-01-14 14:32:22.0

<span class="emphasis">*Atualizado em:* </span>2015-01-14 14:32:22.0

![](/img/manual/AlineasdeDevolucaoBancaria.png)

<div id="d3887e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Alíneas de Devolução - COF\_C\_Alinea

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_Alinea_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d3887e32" class="table">

<div class="table-title">

Table 1.1. Alíneas de Devolução
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   |   Chave restritiva   |                Regra de validação                |                  Descrição                  |                                                               Comentário/Ajuda                                                               |
| :------------: | :------------------: | :------------------: | :------------------: | :----------------------------------------------: | :-----------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) | ADClient\_COFCAlinea |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|  Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  ADOrg\_COFCAlinea   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|     Ativo      |       Sim-Não        |         (Y)          |                      |                                                  |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
| Chave de Busca | Texto Curto (String) |                      |                      |                                                  |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|      Nome      | Texto Curto (String) |                      |                      |                                                  |    Alphanumeric identifier of the entity    | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição    | Texto Curto (String) |                      |                      |                                                  |  Optional short description of the record   |                                                 A description is limited to 255 characters.                                                  |
|     Alínea     |          ID          |                      |                      |                                                  | Primary Key : Alíneas de Devolução Bancária |                                                 Primary Key : Alíneas de Devolução Bancária                                                  |

</div>

</div>

  

</div>
