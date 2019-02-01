---
title: "Apontamento de Métricas"
id: ApontamentodeMetricas
---
<div id="d6269e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Apontamento de Métricas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Apontamento de Métricas -
    MP\_AssetMeter\_Log](#d6269e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Apontamento de Métricas

<span class="emphasis">*Comentário/Ajuda:* </span>Enter your meter
readings separate operations control

<span class="emphasis"> *Criado em:* </span>2017-06-22 17:09:16.0

<span class="emphasis">*Atualizado em:* </span>2017-06-22 17:09:16.0

![](/img/manual/ApontamentodeMetricas.png)

<div id="d6269e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Apontamento de Métricas - MP\_AssetMeter\_Log

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_AssetMeter_Log_data)

<span class="emphasis">*Descrição:*</span> Apontamento de Métricas

<span class="emphasis">*Comentário/Ajuda:* </span> Use this meter Log
data entry for separate work without reference to the Asset Meter. You
can search for the Asset Meter later

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d6269e40" class="table">

<div class="table-title">

Table 1.1. Meter Log
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      | Valores (Padrão) |        Chave restritiva         |                                    Regra de validação                                    |                Descrição                 |                                                       Comentário/Ajuda                                                       |
| :---------------------: | :------------------: | :--------------: | :-----------------------------: | :--------------------------------------------------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
| Apontamento de Métricas |          ID          |                  |                                 |                                                                                          |                                          |                                                                                                                              |
|         Empresa         |    Tabela Direta     |                  |    ADClient\_MPAssetMeterLog    |                                                                                          |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|       Organização       |    Tabela Direta     |                  |     ADOrg\_MPAssetMeterLog      |                                                                                          |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|  Métrica de Prevenção   |        Tabela        |  MP\_AssetMeter  |  MPAssetMeter\_MPAssetMeterLog  |                                                                                          |                                          |                                                                                                                              |
|    Ordem de Trabalho    |    Tabela Direta     |                  |      MPOT\_MPAssetMeterLog      |                                                                                          |                                          |                                                                                                                              |
|     Chave de Busca      | Texto Curto (String) |                  |                                 |                                                                                          |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|          Ativo          |       Sim-Não        |                  |                                 |                                                                                          |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|          Ativo          |       Procurar       |                  |     AAsset\_MPAssetMeterLog     |                                                                                          |  Asset used internally or by customers   | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|      Métrica Alvo       |        Tabela        |  MP\_AssetMeter  | MPAssetMeterSearch\_MPAssetMete | A\_Asset\_ID = @A\_Asset\_ID@ AND IsActive = 'Y' AND AD\_Org\_ID IN (@\#AD\_Org\_ID@, 0) |                                          |                                                                                                                              |
|        Descrição        | Texto Curto (String) |                  |                                 |                                                                                          | Optional short description of the record |                                         A description is limited to 255 characters.                                          |
|    Data da Transação    |      Data+Hora       |                  |                                 |                                                                                          |             Transaction Date             |                                 The Transaction Date indicates the date of the transaction.                                  |
|          Valor          |        Valor         |                  |                                 |                                                                                          |                  Amount                  |                                                            Amount                                                            |
|       Valor Total       |        Número        |                  |                                 |                                                                                          |               Total Amount               |                                    The Total Amount indicates the total document amount.                                     |

</div>

</div>

  

</div>
