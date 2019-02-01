---
title: "Tabela de Ajuste"
id: TabeladeAjuste
---
<div id="d237755e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tabela de Ajuste

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tabela de Ajustes -
    COF\_C\_AdjustTable](#d237755e23)</span>
  - <span class="section">[2. Tabela: Ajuste SPED -
    COF\_C\_Adjustment](#d237755e175)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tabela de Ajustes do SPED

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-01-15 10:08:20.0

<span class="emphasis">*Atualizado em:* </span>2016-01-15 10:08:20.0

![](/img/manual/TabeladeAjuste.png)

<div id="d237755e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tabela de Ajustes - COF\_C\_AdjustTable

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d237755e30" class="table">

<div class="table-title">

Table 1.1. Adjust Table
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   |     Chave restritiva     |                Regra de validação                |             Descrição              |                        Comentário/Ajuda                        |
| :--------------: | :------------------: | :------------------: | :----------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------: |
| Tabela de Ajuste |          ID          |                      |                          |                                                  |     Primary Key : Adjust Table     |                   Primary Key : Adjust Table                   |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
|   Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
|      Ativo       |       Sim-Não        |         (Y)          |                          |                                                  | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
| Simples Nacional |       Sim-Não        |        ('N')         |                          |                                                  | Is National Simple Classification  |                                                                |
|      Código      | Texto Curto (String) |                      |                          |                                                  | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
|      Região      |        Tabela        |      C\_Region       | CRegion\_COFCAdjustTable |           C\_Region.C\_Country\_ID=139           |  Identifies a geographical Region  |    The Region identifies a unique Region for this Country.     |
|  Nome da Tabela  | Texto Curto (String) |                      |                          |                                                  | Name of the table in the database  | The DB Table Name indicates the name of the table in database. |

</div>

</div>

  

<div id="d237755e175" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Ajuste SPED - COF\_C\_Adjustment

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> COF\_C\_AdjustTable\_ID

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d237755e186" class="table">

<div class="table-title">

Table 1.2. Adjustment Code
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |                Valores (Padrão)                |        Chave restritiva         |                Regra de validação                 |                Descrição                 |                    Comentário/Ajuda                     |
| :--------------: | :------------------: | :--------------------------------------------: | :-----------------------------: | :-----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------: |
|      Ajuste      |          ID          |                                                |                                 |                                                   |             Adjustment SPED              |                                                         |
|     Empresa      |    Tabela Direta     |              (@\#AD\_Client\_ID@)              |                                 |         AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                   (ver o mesmo acima)                   |
|   Organização    |    Tabela Direta     |               (@\#AD\_Org\_ID@)                |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)  |    (semelhante ao primeiro relatório)    |                   (ver o mesmo acima)                   |
|      Ativo       |       Sim-Não        |                      (Y)                       |                                 |                                                   |    (semelhante ao primeiro relatório)    |                   (ver o mesmo acima)                   |
| Tabela de Ajuste |        Tabela        | COF\_C\_TableAdjust(@COF\_C\_AdjustTable\_ID@) | COFCAdjustTable\_COFCAdjustment | COF\_C\_AdjustTable.C\_Region\_ID=@C\_Region\_ID@ |        Primary Key : Adjust Table        |               Primary Key : Adjust Table                |
|      Região      |        Tabela        |           C\_Region(@C\_Region\_ID@)           |     CRegion\_COFCAdjustment     |           C\_Region.C\_Country\_ID=139            |     Identifies a geographical Region     | The Region identifies a unique Region for this Country. |
|      Código      | Texto Curto (String) |                                                |                                 |                                                   |    (semelhante ao primeiro relatório)    |                   (ver o mesmo acima)                   |
|    Descrição     | Texto Curto (String) |                                                |                                 |                                                   | Optional short description of the record |       A description is limited to 255 characters.       |

</div>

</div>

  

</div>
