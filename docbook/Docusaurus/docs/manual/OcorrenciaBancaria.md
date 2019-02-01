---
title: "Ocorrência Bancária"
id: OcorrenciaBancaria
---
<div id="d150023e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ocorrência Bancária

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Bank Occurrence -
    COF\_C\_BankOccurrence](#d150023e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Ocorrência Bancária

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2014-01-28 15:39:24.0

<span class="emphasis">*Atualizado em:* </span>2014-01-28 15:39:24.0

<div id="d150023e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Bank Occurrence - COF\_C\_BankOccurrence

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_BankOccurrence_data)

<span class="emphasis">*Descrição:*</span> Bank Occurrence

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d150023e35" class="table">

<div class="table-title">

Table 1.1. Bank Occurrence
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |                                                  Valores (Padrão)                                                  |       Chave restritiva       |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Ocorrência Bancária  |          ID          |                                                                                                                    |                              |                                                  |           Ocorrência Bancária            |                                                             Ocorrência Bancária                                                              |
|       Empresa        |    Tabela Direta     |                                                (@\#AD\_Client\_ID@)                                                | ADClient\_COFCBankOccurrence |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |                                                 (@\#AD\_Org\_ID@)                                                  |  ADOrg\_COFCBankOccurrence   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Banco         |    Tabela Direta     |                                                                                                                    |  CBank\_COFCBankOccurrence   |                                                  |                   Bank                   |       The Bank is a unique identifier of a Bank for this Organization or for a Business Partner with whom this Organization transacts.       |
|    Chave de Busca    | Texto Curto (String) |                                                                                                                    |                              |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Ativo         |       Sim-Não        |                                                        (Y)                                                         |                              |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Código da Ocorrência | Texto Curto (String) |                                                                                                                    |                              |                                                  |                                          |                                                                                                                                              |
|         Nome         | Texto Curto (String) |                                                                                                                    |                              |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                                                                                                                    |                              |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Tipo da Ocorrência  |        Lista         | Cancelado Entrada Confirmada Liquidação Liquidação em Cartório Baixa Manual Ocorrência Rejeitado Título Protestado |                              |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
