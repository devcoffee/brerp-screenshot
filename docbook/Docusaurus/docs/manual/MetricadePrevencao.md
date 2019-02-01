---
title: "Métrica de Prevenção"
id: MetricadePrevencao
---
<div id="d145999e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Métrica de Prevenção

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Métrica de Prevenção -
    MP\_Meter](#d145999e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-22 17:09:13.0

<span class="emphasis">*Atualizado em:* </span>2017-06-22 17:09:13.0

![](/img/manual/MetricadePrevencao.png)

<div id="d145999e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Métrica de Prevenção - MP\_Meter

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_Meter_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145999e32" class="table">

<div class="table-title">

Table 1.1. Meter
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      | Valores (Padrão) | Chave restritiva  | Regra de validação |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :--------------: | :---------------: | :----------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Métrica de Prevenção |          ID          |                  |                   |                    |                                       |                                                                                                                                              |
|       Empresa        |    Tabela Direta     |                  | ADClient\_MPMeter |                    |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |                  |  ADOrg\_MPMeter   |                    |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                  |                   |                    | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Day Maximum      |       Inteiro        |                  |                   |                    |                                       |                                                                                                                                              |
|        Ativo         |       Sim-Não        |                  |                   |                    |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
