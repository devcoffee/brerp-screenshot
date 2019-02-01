---
title: "Condição de Pagamento"
id: CondicaodePagamento
---
<div id="d29402e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Condição de Pagamento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Condição de Pagamento -
    C\_PaymentTerm](#d29402e23)</span>
  - <span class="section">[2. Tabela: Programação -
    C\_PaySchedule](#d29402e495)</span>
  - <span class="section">[3. Tabela: Tradução -
    C\_PaymentTerm\_Trl](#d29402e722)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Condição de
Pagamento

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela " Condição de
Pagamento" define as diferentes condições de pagamento que a sua empresa
oferece aos seus clientes e que são oferecidos a você pelos seus
fornecedores. Cada fatura tem que conter uma Condição de Pagamento. Na
fatura normal, o Nome e a Nota de Documento da Condição de Pagamento é
impressa.

<span class="emphasis"> *Criado em:* </span>1999-08-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/CondicaodePagamento.png)

<div id="d29402e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Condição de Pagamento - C\_PaymentTerm

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaymentTerm_data)

<span class="emphasis">*Descrição:*</span> Definir Condições de
Pagamento

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Condição de
Pagamento" define as diferentes condições de pagamento que você oferece
aos seus Parceiros de Negócios para pagamentos de faturas e também
aquelas condições que são oferecidos pelos seus fornecedores para
pagamentos das suas faturas. Na fatura normal, o Nome e a Nota de
Documento da Condição de Pagamento é impressa.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d29402e40" class="table">

<div class="table-title">

Table 1.1. Payment Term
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |                                Valores (Padrão)                                | Chave restritiva |                Regra de validação                |                                        Descrição                                        |                                                                                                              Comentário/Ajuda                                                                                                               |
| :----------------------------: | :-------------------------------: | :----------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       C\_PaymentTerm\_UU       |       Texto Curto (String)        |                                                                                |                  |                                                  |                                                                                         |                                                                                                                                                                                                                                             |
|     Condição de Pagamento      |                ID                 |                                                                                |                  |                                                  |                         The terms of Payment (timing, discount)                         |                                                                                          Payment Terms identify the method and timing of payment.                                                                                           |
|            Empresa             |           Tabela Direta           |                              (@\#AD\_Client\_ID@)                              |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                           (semelhante ao primeiro relatório)                            |                                                                                                             (ver o mesmo acima)                                                                                                             |
|          Organização           |           Tabela Direta           |                               (@\#AD\_Org\_ID@)                                |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                           (semelhante ao primeiro relatório)                            |                                                                                                             (ver o mesmo acima)                                                                                                             |
|         Chave de Busca         |       Texto Curto (String)        |                                                                                |                  |                                                  |                           (semelhante ao primeiro relatório)                            |                                                                                                             (ver o mesmo acima)                                                                                                             |
|              Nome              |       Texto Curto (String)        |                                                                                |                  |                                                  |                          Alphanumeric identifier of the entity                          |                                                The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                 |
|           Descrição            |       Texto Curto (String)        |                                                                                |                  |                                                  |                        Optional short description of the record                         |                                                                                                 A description is limited to 255 characters.                                                                                                 |
|             Ativo              |              Sim-Não              |                                      (Y)                                       |                  |                                                  |                           (semelhante ao primeiro relatório)                            |                                                                                                             (ver o mesmo acima)                                                                                                             |
|             Padrão             |              Sim-Não              |                                                                                |                  |                                                  |                                      Default value                                      |                                                                               The Default Checkbox indicates if this record will be used as a default value.                                                                                |
|    Data Fixa de Vencimento     |              Sim-Não              |                                                                                |                  |                                                  |                             Payment is due on a fixed date                              |                                                             The Fixed Due Date checkbox indicates if invoices using this payment tern will be due on a fixed day of the month.                                                              |
|          Após Entrega          |              Sim-Não              |                                                                                |                  |                                                  |                     Due after delivery rather than after invoicing                      |                                                                   The After Delivery checkbox indicates that payment is due after delivery as opposed to after invoicing.                                                                   |
|       Dia útil anterior        |              Sim-Não              |                                                                                |                  |                                                  |                        Payment due on the previous business day                         |                                                          The Previous Business Day checkbox indicates that payment is due on the previous business day before invoice or delivery.                                                          |
|        Próximo Dia Útil        |              Sim-Não              |                                                                                |                  |                                                  |                          Payment due on the next business day                           |                                                              The Next Business Day checkbox indicates that payment is due on the next business day after invoice or delivery.                                                               |
|        Dia fixo do mês         |              Inteiro              |                                                                                |                  |                                                  |                            Day of the month of the due date                             |                                                The Fix Month Day indicates the day of the month that invoices are due. This field only displays if the fixed due date checkbox is selected.                                                 |
|       Corte fixo do mês        |              Inteiro              |                                                                                |                  |                                                  |                          Last day to include for next due date                          |                             The Fix Month Cutoff indicates the last day invoices can have to be included in the current due date. This field only displays when the fixed due date checkbox has been selected.                              |
|    Deslocamento Fixo de Mês    |              Inteiro              |                                                                                |                  |                                                  |                         Number of months (0=same, 1=following)                          | The Fixed Month Offset indicates the number of months from the current month to indicate an invoice is due. A 0 indicates the same month, a 1 the following month. This field will only display if the fixed due date checkbox is selected. |
|         Dias Líquidos          |              Inteiro              |                                                                                |                  |                                                  |                            Net Days in which payment is due                             |                                                                                    Indicates the number of days after invoice date that payment is due.                                                                                     |
|          Dia Líquido           |               Lista               | Segunda-feira Terça-feira Quarta-feira Quinta-feira Sexta-feira Sábado Domingo |                  |                                                  |                               Day when payment is due net                               |                                                                  When defined, overwrites the number of net days with the relative number of days to the the day defined.                                                                   |
|        Dias de Desconto        |              Inteiro              |                                                                                |                  |                                                  |              Number of days from invoice date to be eligible for discount               |                                                           The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.                                                           |
|           Desconto %           |              Número               |                                                                                |                  |                                                  |                                   Discount in percent                                   |                                                                                    The Discount indicates the discount applied or taken as a percentage.                                                                                    |
|       Dias de Desconto 2       |              Inteiro              |                                                                                |                  |                                                  |              Number of days from invoice date to be eligible for discount               |                                                           The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.                                                           |
|          Desconto 2 %          |              Número               |                                                                                |                  |                                                  |                                   Discount in percent                                   |                                                                                    The Discount indicates the discount applied or taken as a percentage.                                                                                    |
|        Dias de Carência        |              Inteiro              |                                                                                |                  |                                                  |                    Days after due date to send first dunning letter                     |                              The Grace Days indicates the number of days after the due date to send the first dunning letter. This field displays only if the send dunning letters checkbox has been selected.                              |
|       Nota de Documento        | Texto Médio (até 2000 caracteres) |                                                                                |                  |                                                  |                          Additional information for a Document                          |                                                                         The Document Note is used for recording any additional information regarding this product.                                                                          |
|   Uso do Termo de Pagamento    |               Lista               |                            Ambos Compras Vendas (B)                            |                  |                                                  | Payment term usage indicates if this payment term is used for sales, purchases or both. |                                                                                                                                                                                                                                             |
|          Juros Mensal          |              Número               |                                      (0)                                       |                  |                                                  |                                                                                         |                                                                                                                                                                                                                                             |
|            Validar             |               Botão               |                                                                                |                  |                                                  |                                                                                         |                                                                                                                                                                                                                                             |
|             Válido             |              Sim-Não              |                                                                                |                  |                                                  |                                    Element is valid                                     |                                                                                                   The element passed the validation check                                                                                                   |
|     Condição de Pagamento      |               Lista               |                             Á Vista À Prazo Outros                             |                  |                                                  |                                                                                         |                                                                                                                                                                                                                                             |
| Criar Programação de Pagamento |               Botão               |                                                                                |                  |                                                  |                                                                                         |                                                                                                                                                                                                                                             |

</div>

</div>

  

<div id="d29402e495" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Programação - C\_PaySchedule

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaySchedule_data)

<span class="emphasis">*Descrição:*</span> Programação de Pagamentos

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d29402e508" class="table">

<div class="table-title">

Table 1.2. Schedule
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |                                Valores (Padrão)                                |      Chave restritiva      |                Regra de validação                |                          Descrição                           |                                                                                 Comentário/Ajuda                                                                                  |
| :-----------------------: | :------------------: | :----------------------------------------------------------------------------: | :------------------------: | :----------------------------------------------: | :----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Dia Líquido        |        Lista         | Segunda-feira Terça-feira Quarta-feira Quinta-feira Sexta-feira Sábado Domingo |                            |                                                  |                 Day when payment is due net                  |                                     When defined, overwrites the number of net days with the relative number of days to the the day defined.                                      |
| Programação de Pagamentos |          ID          |                                                                                |                            |                                                  |                  Payment Schedule Template                   |                                                                   Information when parts of the payment are due                                                                   |
|     Dias de Carência      |       Inteiro        |                                                                                |                            |                                                  |       Days after due date to send first dunning letter       | The Grace Days indicates the number of days after the due date to send the first dunning letter. This field displays only if the send dunning letters checkbox has been selected. |
|          Empresa          |    Tabela Direta     |                               (@AD\_Client\_ID@)                               |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)              |                                                                                (ver o mesmo acima)                                                                                |
|        Organização        |    Tabela Direta     |                                (@AD\_Org\_ID@)                                 |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)              |                                                                                (ver o mesmo acima)                                                                                |
|   Condição de Pagamento   |    Tabela Direta     |                                                                                | cpaymentterm\_cpayschedule |                                                  |           The terms of Payment (timing, discount)            |                                                             Payment Terms identify the method and timing of payment.                                                              |
|           Ativo           |       Sim-Não        |                                      (Y)                                       |                            |                                                  |              (semelhante ao primeiro relatório)              |                                                                                (ver o mesmo acima)                                                                                |
|          Válido           |       Sim-Não        |                                                                                |                            |                                                  |                       Element is valid                       |                                                                      The element passed the validation check                                                                      |
|        Porcentagem        |        Número        |                                                                                |                            |                                                  |                 Percent of the entire amount                 |                                                                        Percentage of an amount (up to 100)                                                                        |
|       Dias Líquidos       |       Inteiro        |                                                                                |                            |                                                  |               Net Days in which payment is due               |                                                       Indicates the number of days after invoice date that payment is due.                                                        |
|     Dias de Desconto      |       Inteiro        |                                                                                |                            |                                                  | Number of days from invoice date to be eligible for discount |                              The Discount Days indicates the number of days that payment must be received in to be eligible for the stated discount.                              |
|        Desconto %         |        Número        |                                                                                |                            |                                                  |                     Discount in percent                      |                                                       The Discount indicates the discount applied or taken as a percentage.                                                       |
|    C\_PaySchedule\_UU     | Texto Curto (String) |                                                                                |                            |                                                  |                                                              |                                                                                                                                                                                   |

</div>

</div>

  

<div id="d29402e722" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - C\_PaymentTerm\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PaymentTerm_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d29402e735" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :-------------------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |           Tabela Direta           | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização       |           Tabela Direta           |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Condição de Pagamento  |           Tabela Direta           |                    |  cpaymentterm\_cpaytermtrl  |                                                  | The terms of Payment (timing, discount)  |                                           Payment Terms identify the method and timing of payment.                                           |
|         Idioma          |              Tabela               |    AD\_Language    | adlanguage\_cpaymenttermtrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|          Nome           |       Texto Curto (String)        |                    |                             |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        |       Texto Curto (String)        |                    |                             |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Nota de Documento    | Texto Médio (até 2000 caracteres) |                    |                             |                                                  |  Additional information for a Document   |                          The Document Note is used for recording any additional information regarding this product.                          |
|          Ativo          |              Sim-Não              |        (Y)         |                             |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Traduzida        |              Sim-Não              |                    |                             |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
| C\_PaymentTerm\_Trl\_UU |       Texto Curto (String)        |                    |                             |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
