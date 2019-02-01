---
title: "Provedor de Impostos"
id: ProvedordeImpostos
---
<div id="d187349e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Provedor de Impostos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Provedor de Impostos -
    C\_TaxProvider](#d187349e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-14 14:50:03.0

<span class="emphasis">*Atualizado em:* </span>2013-08-14 14:50:03.0

<div id="d187349e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Provedor de Impostos - C\_TaxProvider

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_TaxProvider_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d187349e31" class="table">

<div class="table-title">

Table 1.1. Tax Provider
Fields

</div>

<div class="table-contents">

|            Nome do campo             |      Referência      |   Valores (Padrão)   |       Chave restritiva        |                Regra de validação                |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :----------------------------------: | :------------------: | :------------------: | :---------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Provedor de Impostos         |          ID          |                      |                               |                                                  |                                                       |                                                                                                                                              |
|               Empresa                |    Tabela Direta     | (@\#AD\_Client\_ID@) |    adclient\_ctaxprovider     |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|             Organização              |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |      adorg\_ctaxprovider      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
| Configuração de Provedor de Impostos |    Tabela Direta     |                      | ctaxprovidercfg\_ctaxprovider |                                                  |                                                       |                                                                                                                                              |
|                 Nome                 | Texto Curto (String) |                      |                               |                                                  |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                Ativo                 |       Sim-Não        |         (Y)          |                               |                                                  |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|                Conta                 | Texto Curto (String) |                      |                               |                                                  |                                                       |                                                                                                                                              |
|          Código da Empresa           | Texto Curto (String) |                      |                               |                                                  |                                                       |                                                                                                                                              |
|               Licença                | Texto Curto (String) |                      |                               |                                                  |                                                       |                                                                                                                                              |
|              Seqüência               |       Inteiro        |         (0)          |                               |                                                  | Method of ordering records; lowest number comes first |                                                 The Sequence indicates the order of records                                                  |
|           Validar Conexão            |        Botão         |                      |                               |                                                  |                                                       |                                                                                                                                              |

</div>

</div>

  

</div>
