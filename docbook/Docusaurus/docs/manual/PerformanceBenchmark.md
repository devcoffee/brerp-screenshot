---
title: "Performance Benchmark"
id: PerformanceBenchmark
---
<div id="d172935e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Performance Benchmark

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Benchmark -
    PA\_Benchmark](#d172935e22)</span>
  - <span class="section">[2. Tabela: Dados -
    PA\_BenchmarkData](#d172935e192)</span>

</div>

<span class="emphasis">*Descrição:* </span> Performance Benchmark

<span class="emphasis">*Comentário/Ajuda:* </span>Data Series to compare
internal performance with (e.g. stock price, ...)

<span class="emphasis"> *Criado em:* </span>2005-12-26 12:28:41.0

<span class="emphasis">*Atualizado em:* </span>2005-12-26 12:38:50.0

<div id="d172935e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Benchmark - PA\_Benchmark

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Performance Benchmark

<span class="emphasis">*Comentário/Ajuda:* </span> Data Series to
compare internal performance with (e.g. stock price, ...)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d172935e37" class="table">

<div class="table-title">

Table 1.1. Benchmark
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             | Valores (Padrão) | Chave restritiva |        Regra de validação         |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Benchmark     |                ID                 |                  |                  |                                   |          Performance Benchmark           |                                   Data Series to compare internal performance with (e.g. stock price, ...)                                   |
|      Empresa      |           Tabela Direta           |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome        |       Texto Curto (String)        |                  |                  |                                   |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     |       Texto Curto (String)        |                  |                  |                                   | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                  |                  |                                   |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo       |              Sim-Não              |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Tipo Acumalação  |               Lista               |    Média Soma    |                  |                                   |   How to accumulate data on time axis    |                          Sum adds the data points (e.g. stock volume) - Average is appropriate for e.g. Stock Price                          |
| PA\_Benchmark\_UU |       Texto Curto (String)        |                  |                  |                                   |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d172935e192" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Dados - PA\_BenchmarkData

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Performance Benchmark Data
Point

<span class="emphasis">*Comentário/Ajuda:* </span> Data Series Point to
compare internal performance with (e.g. stock price, ...)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172935e207" class="table">

<div class="table-title">

Table 1.2. Data
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      | Valores (Padrão) |       Chave restritiva       |        Regra de validação         |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :--------------: | :--------------------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Benchmark Data     |          ID          |                  |                              |                                   |     Performance Benchmark Data Point     |                                Data Series Point to compare internal performance with (e.g. stock price, ...)                                |
|        Empresa        |    Tabela Direta     |                  |                              | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |                  |                              |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Benchmark       |    Tabela Direta     |                  | pabenchmark\_pabenchmarkdata |                                   |          Performance Benchmark           |                                   Data Series to compare internal performance with (e.g. stock price, ...)                                   |
|         Nome          | Texto Curto (String) |                  |                              |                                   |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       | Texto Curto (String) |                  |                              |                                   | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Ativo         |       Sim-Não        |                  |                              |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Data          |      Data+Hora       |                  |                              |                                   |              Benchmark Date              |                                                       Date of the Benchmark Data Point                                                       |
|         Valor         |        Número        |                  |                              |                                   |             Benchmark Value              |                                                      Value of the Benchmark Data Point                                                       |
| PA\_BenchmarkData\_UU | Texto Curto (String) |                  |                              |                                   |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
