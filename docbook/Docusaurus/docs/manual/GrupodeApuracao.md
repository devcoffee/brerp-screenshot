---
title: "Grupo de Apuração"
id: GrupodeApuracao
---
<div id="d110451e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Apuração

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Apuração -
    COF\_C\_Determination\_Group](#d110451e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Grupo de Apuração de
Impostos

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-11-30 22:06:09.0

<span class="emphasis">*Atualizado em:* </span>2016-01-17 19:17:04.0

![](/img/manual/GrupodeApuracao.png)

<div id="d110451e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Apuração - COF\_C\_Determination\_Group

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_Determination_Group_data)

<span class="emphasis">*Coluna linkada:* </span>
COF\_C\_Determination\_Group\_ID

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d110451e36" class="table">

<div class="table-title">

Table 1.1. Tax Determination Group
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |                                    Valores (Padrão)                                     |        Chave restritiva         |                Regra de validação                |             Descrição              |                       Comentário/Ajuda                       |
| :--------------------: | :-------------------------------: | :-------------------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :----------------------------------------------------------: |
|   Grupo de Apuração    |                ID                 |                                                                                         |                                 |                                                  | Primary Key : Determination Group  |              Primary Key : Determination Group               |
|        Empresa         |           Tabela Direta           |                                  (@\#AD\_Client\_ID@)                                   |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                     (ver o mesmo acima)                      |
|      Organização       |           Tabela Direta           |                                    (@\#AD\_Org\_ID@)                                    |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                     (ver o mesmo acima)                      |
|         Ativo          |              Sim-Não              |                                           (Y)                                           |                                 |                                                  | (semelhante ao primeiro relatório) |                     (ver o mesmo acima)                      |
|        Imposto         |             Procurar              |                                      LBR\_TaxName                                       | LBRTaxName\_COFCDeterminationGr |                                                  |   Primary key table LBR\_TaxName   |                Primary key table LBR\_TaxName                |
|     Classificação      |               Lista               | Entrada Estado Entrada Outros Exterior Entrada Exterior Saída Saída Estado Saída Outros |                                 |                                                  |    Classification for grouping     | The Classification can be used to optionally group products. |
|  Código da Impreesão   |       Texto Curto (String)        |                                                                                         |                                 |                                                  |                                    |                                                              |
| Descrição da Impressão | Texto Médio (até 2000 caracteres) |                                                                                         |                                 |                                                  |                                    |                                                              |

</div>

</div>

  

</div>
