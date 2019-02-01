---
title: "Performance Ratio"
id: PerformanceRatio
---
<div id="d173233e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Performance Ratio

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Razão -
    PA\_Ratio](#d173233e23)</span>
  - <span class="section">[2. Tabela: Elemento -
    PA\_RatioElement](#d173233e194)</span>

</div>

<span class="emphasis">*Descrição:* </span> Maintain Performance Ratios

<span class="emphasis">*Comentário/Ajuda:* </span>Calculation
instruction for a ratio

<span class="emphasis"> *Criado em:* </span>2005-12-26 12:48:57.0

<span class="emphasis">*Atualizado em:* </span>2006-01-04 14:11:21.0

![](/img/manual/PerformanceRatio.png)

<div id="d173233e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Razão - PA\_Ratio

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_Ratio_data)

<span class="emphasis">*Descrição:*</span> Performance Ratio

<span class="emphasis">*Comentário/Ajuda:* </span> Calculation
instruction set for a performance ratio

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d173233e40" class="table">

<div class="table-title">

Table 1.1. Ratio
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             | Valores (Padrão) |   Chave restritiva   |        Regra de validação         |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :--------------: | :------------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Razão       |                ID                 |                  |                      |                                   |            Performance Ratio             |                                             Calculation instruction set for a performance ratio                                              |
|     Empresa      |           Tabela Direta           |                  |                      | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |                  |                      |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                  |                      |                                   |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Ativo       |              Sim-Não              |                  |                      |                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Descrição     |       Texto Curto (String)        |                  |                      |                                   | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                  |                      |                                   |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| Esquema Contábil |           Tabela Direta           |                  | cacctschema\_paratio |                                   |           Rules for accounting           |                   An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                    |
|  PA\_Ratio\_UU   |       Texto Curto (String)        |                  |                      |                                   |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d173233e194" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Elemento - PA\_RatioElement

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_RatioElement_data)

<span class="emphasis">*Descrição:*</span> Performance Ratio Element

<span class="emphasis">*Comentário/Ajuda:* </span> Individual
calculation instruction for a ratio

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d173233e211" class="table">

<div class="table-title">

Table 1.2. Element
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |                         Valores (Padrão)                          |       Chave restritiva        |        Regra de validação         |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :---------------------------------------------------------------: | :---------------------------: | :-------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Elemento de Relação  |          ID          |                                                                   |                               |                                   |               Performance Ratio Element               |                                                Individual calculation instruction for a ratio                                                |
|       Empresa        |    Tabela Direta     |                                                                   |                               | AD\_Client.AD\_Client\_ID \< \> 0 |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |                                                                   |                               |                                   |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|        Razão         |    Tabela Direta     |                                                                   |    paratio\_paratioelement    |                                   |                   Performance Ratio                   |                                             Calculation instruction set for a performance ratio                                              |
|         Nome         | Texto Curto (String) |                                                                   |                               |                                   |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                                                                   |                               |                                   |       Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|        Ativo         |       Sim-Não        |                                                                   |                               |                                   |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Seqüência       |       Inteiro        |                                                                   |                               |                                   | Method of ordering records; lowest number comes first |                                                 The Sequence indicates the order of records                                                  |
|       Operand        |        Lista         |                  Divide Multiply Minus Plus (P)                   |                               |                                   |                     Ratio Operand                     |          Operand how data is calculated. If it is the first in the series, 'minus' will create a negative value, otherwise ignored.          |
|     Element Type     |        Lista         |               Account Value Constante Razão Cálculo               |                               |                                   |                  Ratio Element Type                   |                                                    Type of data used for the calculation                                                     |
|  Cálculo de Medição  |    Tabela Direta     |                                                                   | pameasurecalc\_paratioelement |                                   |     Calculation method for measuring performance      |                                    The Measure Calculation indicates the method of measuring performance.                                    |
|   Valor Constante    |        Número        |                                                                   |                               |                                   |                    Constant value                     |                                                                                                                                              |
|     Razão Usada      |        Tabela        |                             PA\_Ratio                             |  paratioused\_paratioelement  |                                   |                Performance Ratio Used                 |              Existing Performance Ratio to be used in the calculation. Make sure that the Ratio is not self-referencing (loop).              |
|        Conta         |        Tabela        |                            Account\_ID                            | celementvalue\_paratioelement |                                   |                     Account used                      |                                                          The (natural) account used                                                          |
|  Tipo de Lançamento  |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas |                               |                                   |     The type of posted amount for the transaction     |            The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.             |
| PA\_RatioElement\_UU | Texto Curto (String) |                                                                   |                               |                                   |                                                       |                                                                                                                                              |

</div>

</div>

  

</div>
