---
title: "Local de Separação"
id: LocaldeSeparacao
---
<div id="d138003e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Local de Separação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Local de Separação -
    COF\_LocalSeparation](#d138003e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-04-24 17:41:15.0

<span class="emphasis">*Atualizado em:* </span>2015-04-24 17:41:15.0

![](/img/manual/LocaldeSeparacao.png)

<div id="d138003e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Local de Separação - COF\_LocalSeparation

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d138003e30" class="table">

<div class="table-title">

Table 1.1. Local Separation
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |   Valores (Padrão)   |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                        Comentário/Ajuda                                         |
| :----------------: | :------------------: | :------------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :---------------------------------------------------------------------------------------------: |
| Local de Separação |          ID          |                      |                                |                                                  |      Primary Key : Local Separation      |                                 Primary Key : Local Separation                                  |
|      Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                       (ver o mesmo acima)                                       |
|    Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                       (ver o mesmo acima)                                       |
|       Ativo        |       Sim-Não        |         (Y)          |                                |                                                  |    (semelhante ao primeiro relatório)    |                                       (ver o mesmo acima)                                       |
|      Armazém       |       Procurar       |                      | MWarehouse\_COFLocalSeparation |                                                  |   Storage Warehouse and Service Point    | The Warehouse identifies a unique Warehouse where products are stored or Services are provided. |
|     Descrição      | Texto Curto (String) |                      |                                |                                                  | Optional short description of the record |                           A description is limited to 255 characters.                           |
|        Doca        | Texto Curto (String) |                      |                                |                                                  |                                          |                                                                                                 |
|       Gaiola       | Texto Curto (String) |                      |                                |                                                  |                                          |                                                                                                 |
|      Divisão       | Texto Curto (String) |                      |                                |                                                  |                                          |                                                                                                 |
|       Palete       | Texto Curto (String) |                      |                                |                                                  |                                          |                                                                                                 |

</div>

</div>

  

</div>
