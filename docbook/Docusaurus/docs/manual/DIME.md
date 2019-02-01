---
title: "DIME"
id: DIME
---
<div id="d41604e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: DIME

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: DIME -
    COF\_C\_DIME](#d41604e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> DIME

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-12-03 14:52:19.0

<span class="emphasis">*Atualizado em:* </span>2012-12-03 14:58:09.0

![](/img/manual/DIME.png)

<div id="d41604e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: DIME - COF\_C\_DIME

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> DIME

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d41604e34" class="table">

<div class="table-title">

Table 1.1. DIME
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |             Descrição              |                             Comentário/Ajuda                             |
| :------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------: | :----------------------------------------------------------------------: |
|         DIME         |                ID                 |                      |                  |                                                  |       Primary Key : DIME-SC        |                          Primary Key : DIME-SC                           |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                           (ver o mesmo acima)                            |
|     Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                           (ver o mesmo acima)                            |
|     Comentários      | Texto Médio (até 2000 caracteres) |                      |                  |                                                  | Comments or additional information | The Comments field allows for free form entry of additional information. |
|        Ativo         |              Sim-Não              |         (Y)          |                  |                                                  | (semelhante ao primeiro relatório) |                           (ver o mesmo acima)                            |
| Período (Ano Fiscal) |           Tabela Direta           |                      |                  |                                                  |       Period of the Calendar       |     The Period indicates an exclusive range of dates for a calendar.     |
|        Do dia        |               Data                |                      |                  |                                                  |     Starting date for a range      |          The Date From indicates the starting date of a range.           |
|        Ao dia        |               Data                |                      |                  |                                                  |      End date of a date range      |        The Date To indicates the end date of a range (inclusive)         |
|      Diretório       |             FilePath              |                      |                  |                                                  |                                    |                                                                          |
|   Geração da DIME    |               Botão               |                      |                  |                                                  |                                    |                                                                          |

</div>

</div>

  

</div>
