---
title: "Grupo Orçamentário"
id: GrupoOrcamentario
---
<div id="d110384e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo Orçamentário

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo Orçamentário -
    COF\_OrcamentoGrupo](#d110384e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-12 11:14:27.0

<span class="emphasis">*Atualizado em:* </span>2017-06-12 11:14:27.0

![](/img/manual/GrupoOrcamentario.png)

<div id="d110384e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo Orçamentário - COF\_OrcamentoGrupo

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d110384e30" class="table">

<div class="table-title">

Table 1.1. Grupo Orçamentário
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                       Descrição                       |              Comentário/Ajuda               |
| :----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------------------: | :-----------------------------------------: |
| Grupo Orçamentário |          ID          |                      |                  |                                                  |           Primary Key : Grupo Orçamentário            |      Primary Key : Grupo Orçamentário       |
|      Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |
|    Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |
|   Chave de Busca   | Texto Curto (String) |                      |                  |                                                  |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |
|     Seqüência      |       Inteiro        |                      |                  |                                                  | Method of ordering records; lowest number comes first | The Sequence indicates the order of records |
|     Descrição      | Texto Curto (String) |                      |                  |                                                  |       Optional short description of the record        | A description is limited to 255 characters. |
|       Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |

</div>

</div>

  

</div>
