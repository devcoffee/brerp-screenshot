---
title: "Classificação de Ajuste"
id: ClassificacaodeAjuste
---
<div id="d21471e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Classificação de Ajuste

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Classificação de Ajuste -
    COF\_C\_Adjustment\_Code](#d21471e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Classificação de Ajustes

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-11-30 17:38:45.0

<span class="emphasis">*Atualizado em:* </span>2016-01-17 19:17:59.0

<div id="d21471e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Classificação de Ajuste - COF\_C\_Adjustment\_Code

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span>
COF\_C\_Adjustment\_Code\_ID

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d21471e33" class="table">

<div class="table-title">

Table 1.1. Adjustment Classification
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |    Valores (Padrão)    |        Chave restritiva         |                          Regra de validação                          |                      Descrição                       |                                             Comentário/Ajuda                                              |
| :--------------------: | :-------------------------------: | :--------------------: | :-----------------------------: | :------------------------------------------------------------------: | :--------------------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
|    Código de Ajuste    |                ID                 |                        |                                 |                                                                      |            Primary Key : Adjustment Code             |                                       Primary Key : Adjustment Code                                       |
|        Empresa         |           Tabela Direta           |  (@\#AD\_Client\_ID@)  |                                 |                  AD\_Client.AD\_Client\_ID \< \> 0                   |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|      Organização       |           Tabela Direta           |   (@\#AD\_Org\_ID@)    |                                 |           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)           |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|         Ativo          |              Sim-Não              |          (Y)           |                                 |                                                                      |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|    Simples Nacional    |              Sim-Não              |         ('N')          |                                 |                                                                      |          Is National Simple Classification           |                                                                                                           |
|    Tabela de Ajuste    |              Tabela               |  COF\_C\_TableAdjust   | COFCAdjustTable\_COFCAdjustment |                                                                      |              Primary Key : Adjust Table              |                                        Primary Key : Adjust Table                                         |
|         Ajuste         |             Procurar              |   COF\_C\_Adjustment   | COFCAdjustment\_COFCAdjustmentC | COF\_C\_Adjustment.COF\_C\_AdjustTable\_ID=@COF\_C\_AdjustTable\_ID@ |                   Adjustment SPED                    |                                                                                                           |
|        Imposto         |             Procurar              |      LBR\_TaxName      | LBRTaxName\_COFCAdjustmentCode  |                                                                      |            Primary key table LBR\_TaxName            |                                      Primary key table LBR\_TaxName                                       |
|          Tipo          |               Lista               |     Credor Devedor     |                                 |                                                                      | Type of Validation (SQL, Java Script, Java Language) | The Type indicates the type of validation that will occur. This can be SQL, Java Script or Java Language. |
|     Classificação      |               Lista               | Apuração Entrada Saída |                                 |                                                                      |             Classification for grouping              |                       The Classification can be used to optionally group products.                        |
|  Código da Impreesão   |       Texto Curto (String)        |                        |                                 |                                                                      |                                                      |                                                                                                           |
| Descrição da Impressão | Texto Médio (até 2000 caracteres) |                        |                                 |                                                                      |                                                      |                                                                                                           |

</div>

</div>

  

</div>
