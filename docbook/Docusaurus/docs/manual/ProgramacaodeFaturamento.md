---
title: "Programação de Faturamento"
id: ProgramacaodeFaturamento
---
<div id="d184018e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Programação de Faturamento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Programação de Faturamento -
    C\_InvoiceSchedule](#d184018e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento da Programação
de Faturamento

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Programação
de Faturamento" define a freqüência e datas de corte para gerar faturas
resumidas. Se um cliente exigir uma fatura única para múltiplas entregas
você deveria definir a Programação de Faturamento apropriada e
associá-la a esse cliente.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d184018e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Programação de Faturamento - C\_InvoiceSchedule

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_InvoiceSchedule_data)

<span class="emphasis">*Descrição:*</span> Definir Programação de
Faturamento

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Programação de
Faturamento" define a freqüência com a qual os lotes de faturas serão
gerados para um determinado Parceiro de Negócios.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d184018e39" class="table">

<div class="table-title">

Table 1.1. Invoice Schedule
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |                                Valores (Padrão)                                | Chave restritiva |                Regra de validação                |                     Descrição                      |                                                                                                                                                                                              Comentário/Ajuda                                                                                                                                                                                               |
| :---------------------------------: | :------------------: | :----------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Programação de Faturamento      |          ID          |                                                                                |                  |                                                  |          Schedule for generating Invoices          |                                                                                                                                                                The Invoice Schedule identifies the frequency used when generating invoices.                                                                                                                                                                 |
|               Empresa               |    Tabela Direta     |                              (@\#AD\_Client\_ID@)                              |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |         (semelhante ao primeiro relatório)         |                                                                                                                                                                                             (ver o mesmo acima)                                                                                                                                                                                             |
|             Organização             |    Tabela Direta     |                               (@\#AD\_Org\_ID@)                                |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |         (semelhante ao primeiro relatório)         |                                                                                                                                                                                             (ver o mesmo acima)                                                                                                                                                                                             |
|                Nome                 | Texto Curto (String) |                                                                                |                  |                                                  |       Alphanumeric identifier of the entity        |                                                                                                                                The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                 |
|              Descrição              | Texto Curto (String) |                                                                                |                  |                                                  |      Optional short description of the record      |                                                                                                                                                                                 A description is limited to 255 characters.                                                                                                                                                                                 |
|                Ativo                |       Sim-Não        |                                      (Y)                                       |                  |                                                  |         (semelhante ao primeiro relatório)         |                                                                                                                                                                                             (ver o mesmo acima)                                                                                                                                                                                             |
|               Padrão                |       Sim-Não        |                                                                                |                  |                                                  |                   Default value                    |                                                                                                                                                               The Default Checkbox indicates if this record will be used as a default value.                                                                                                                                                                |
|            Valor Limite             |       Sim-Não        |                                                                                |                  |                                                  | Send invoices only if the amount exceeds the limit |                                                                                                                                                    The Amount Limit checkbox indicates if invoices will be sent out if they are below the entered limit.                                                                                                                                                    |
|                Valor                |        Valor         |                                                                                |                  |                                                  |                       Amount                       |                                                                                                                                                                                                   Amount                                                                                                                                                                                                    |
|        Freqüência da Fatura         |        Lista         |              Diariamente Mensalmente Quinzenalmente Semanalmente               |                  |                                                  |        How often invoices will be generated        |                                                                                                                                                         The Invoice Frequency indicates the frequency of invoice generation for a Business Partner.                                                                                                                                                         |
|      Faturar nas Semanas Pares      |       Sim-Não        |                                                                                |                  |                                                  |            Send invoices on even weeks             |                                                                                                                                                   The Invoice on Even Weeks checkbox indicates if biweekly invoices should be sent on even week numbers.                                                                                                                                                    |
|     Dia de Semana para Faturar      |        Lista         | Segunda-feira Terça-feira Quarta-feira Quinta-feira Sexta-feira Sábado Domingo |                  |                                                  |              Day to generate invoices              |                                                                                                                                                                  The Invoice Week Day indicates the day of the week to generate invoices.                                                                                                                                                                   |
| Último dia da semana p/ Faturamento |        Lista         | Segunda-feira Terça-feira Quarta-feira Quinta-feira Sexta-feira Sábado Domingo |                  |                                                  | Last day in the week for shipments to be included  |                                                                                                                                       The Invoice Week Day Cutoff indicates the last day of the week a shipment must be made to be included in the invoice schedule.                                                                                                                                        |
|            Dia da Fatura            |       Inteiro        |                                      (1)                                       |                  |                                                  |             Day of Invoice Generation              |                                                                                                                                            The Invoice Day indicates the day of invoice generation. If twice monthly, the second time is 15 days after this day.                                                                                                                                            |
|      Último dia p/ Faturamento      |       Inteiro        |                                      (1)                                       |                  |                                                  |          Last day for including shipments          | The Invoice Day Cut Off indicates the last day for shipments to be included in the current invoice schedule. For example, if the invoice schedule is defined for the first day of the month, the cut off day may be the 25th of the month. An shipment on the 24th of May would be included in the invoices sent on June 1st but a shipment on the 26th would be included in the invoices sent on July 1st. |
|       C\_InvoiceSchedule\_UU        | Texto Curto (String) |                                                                                |                  |                                                  |                                                    |                                                                                                                                                                                                                                                                                                                                                                                                             |

</div>

</div>

  

</div>
