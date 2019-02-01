---
title: "Cobrança"
id: Cobranca
---
<div id="d28119e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Cobrança

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Cobrança -
    C\_Dunning](#d28119e22)</span>
  - <span class="section">[2. Tabela: Nível -
    C\_DunningLevel](#d28119e210)</span>
  - <span class="section">[3. Tabela: Tradução -
    C\_DunningLevel\_Trl](#d28119e597)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Níveis de
Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Cobrança"
define os parâmetros que serão utilizados ao gerar Cartas de Cobrança.
Cada cliente pode ser associado a um Código de Cobrança.

<span class="emphasis"> *Criado em:* </span>1999-12-04 21:34:10.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d28119e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Cobrança - C\_Dunning

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Dunning_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Regras de
Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Cobrança"
define os parâmetros para um nível de cobrança.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d28119e39" class="table">

<div class="table-title">

Table 1.1. Dunning
Fields

</div>

<div class="table-contents">

|            Nome do campo             |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                  Descrição                  |                                                                 Comentário/Ajuda                                                                 |
| :----------------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------: |
|               Cobrança               |          ID          |                      |                  |                                                  |     Dunning Rules for overdue invoices      |                                   The Dunning indicates the rules and method of dunning for past due payments.                                   |
|      Enviar Cartas de Cobrança       |       Sim-Não        |                      |                  |                                                  |  Indicates if dunning letters will be sent  |           The Send Dunning Letters checkbox indicates if dunning letters will be sent to Business Partners who use this dunning rule.            |
|               Empresa                |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)      |                                                               (ver o mesmo acima)                                                                |
|             Organização              |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)      |                                                               (ver o mesmo acima)                                                                |
|                 Nome                 | Texto Curto (String) |                      |                  |                                                  |    Alphanumeric identifier of the entity    |   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.   |
|              Descrição               | Texto Curto (String) |                      |                  |                                                  |  Optional short description of the record   |                                                   A description is limited to 255 characters.                                                    |
|                Ativo                 |       Sim-Não        |         (Y)          |                  |                                                  |     (semelhante ao primeiro relatório)      |                                                               (ver o mesmo acima)                                                                |
|                Padrão                |       Sim-Não        |                      |                  |                                                  |                Default value                |                                  The Default Checkbox indicates if this record will be used as a default value.                                  |
| Criar níveis de cobrança sequenciais |       Sim-Não        |                      |                  |                                                  | Create Dunning Letter by level sequentially | If selected, the dunning letters are created in the sequence of the dunning levels. Otherwise, the dunning level is based on the days (over)due. |
|            C\_Dunning\_UU            | Texto Curto (String) |                      |                  |                                                  |                                             |                                                                                                                                                  |

</div>

</div>

  

<div id="d28119e210" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Nível - C\_DunningLevel

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_DunningLevel_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Níveis de
Cobrança

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Nível de
Cobrança" define o prazo e freqüência dos avisos de cobrança.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d28119e227" class="table">

<div class="table-title">

Table 1.2. Level
Fields

</div>

<div class="table-contents">

|          Nome do campo           |            Referência             |                      Valores (Padrão)                       |       Chave restritiva       |                Regra de validação                |                           Descrição                           |                                                                           Comentário/Ajuda                                                                            |
| :------------------------------: | :-------------------------------: | :---------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Juros em %            |              Número               |                                                             |                              |                                                  |       Percentage interest to charge on overdue invoices       | The Interest amount in percent indicates the interest to be charged on overdue invoices. This field displays only if the charge interest checkbox has been selected.  |
|           Cobrar Juros           |              Sim-Não              |                                                             |                              |                                                  |   Indicates if interest will be charged on overdue invoices   |                                    The Charge Interest checkbox indicates if interest will be charged on overdue invoice amounts.                                     |
|        Nível de Cobrança         |                ID                 |                                                             |                              |                                                  |                                                               |                                                                                                                                                                       |
|             Empresa              |           Tabela Direta           |                     (@AD\_Client\_ID@)                      |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                          (ver o mesmo acima)                                                                          |
|           Organização            |           Tabela Direta           |                       (@AD\_Org\_ID@)                       |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                          (ver o mesmo acima)                                                                          |
|             Cobrança             |           Tabela Direta           |                                                             |   cdunning\_cdunninglevel    |                                                  |              Dunning Rules for overdue invoices               |                                             The Dunning indicates the rules and method of dunning for past due payments.                                              |
|               Nome               |       Texto Curto (String)        |                                                             |                              |                                                  |             Alphanumeric identifier of the entity             |             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.              |
|            Descrição             |       Texto Curto (String)        |                                                             |                              |                                                  |           Optional short description of the record            |                                                              A description is limited to 255 characters.                                                              |
|              Ativo               |              Sim-Não              |                             (Y)                             |                              |                                                  |              (semelhante ao primeiro relatório)               |                                                                          (ver o mesmo acima)                                                                          |
|  Dias Após a Data do Vencimento  |              Número               |                                                             |                              |                                                  |    Days after due date to dun (if negative days until due)    | The Days After Due Date indicates the number of days after the payment due date to initiate dunning. If the number is negative, it includes not the not due invoices. |
|       Mostrar Não Vencido        |              Sim-Não              |                                                             |                              |                                                  |       Show/print all invoices which are not due (yet).        |                                                   The dunning letter with this level includes all not due invoices.                                                   |
|  Dias entre Avisos de Cobrança   |              Inteiro              |                                                             |                              |                                                  |             Days between sending dunning notices              |                                        The Days Between Dunning indicates the number of days between sending dunning notices.                                         |
|      Mostrar Todas Vencidas      |              Sim-Não              |                                                             |                              |                                                  |                  Show/print all due invoices                  |                                                     The dunning letter with this level includes all due invoices.                                                     |
|     Cobrar Encargos de Mora      |              Sim-Não              |                                                             |                              |                                                  |    Indicates if fees will be charged for overdue invoices     |                                    The Charge Fee checkbox indicates if the dunning letter will include fees for overdue invoices                                     |
|     Valor de Encargo de Mora     |               Valor               |                                                             |                              |                                                  |                Fee amount in invoice currency                 |    The Fee Amount indicates the charge amount on a dunning letter for overdue invoices. This field will only display if the charge fee checkbox has been selected.    |
|        Texto de Impressão        |       Texto Curto (String)        |                                                             |                              |                                                  | The label text to be printed on a document or correspondence. |                  The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.                  |
|               Nota               | Texto Médio (até 2000 caracteres) |                                                             |                              |                                                  |         Optional additional user defined information          |                                      The Note field allows for optional entry of user defined information regarding this record                                       |
| Formato de Impressão de Cobrança |              Tabela               |                       AD\_PrintFormat                       | adprintformat\_cdunninglevel |                                                  |           Print Format for printing Dunning Letters           |                                                       You need to define a Print Format to print the document.                                                        |
|         Cancelar Crédito         |              Sim-Não              |                                                             |                              |                                                  |            Set the business partner to credit stop            |                       If a dunning letter of this level is created, the business partner is set to Credit Stop (needs to be manually changed).                        |
|    Definir Prazo de Pagamento    |              Sim-Não              |                                                             |                              |                                                  |         Set the payment term of the Business Partner          |                                If a dunning letter of this level is created, the payment term of this business partner is overwritten.                                |
|      Condição de Pagamento       |           Tabela Direta           |                                                             | cpaymentterm\_cdunninglevel  |                                                  |            The terms of Payment (timing, discount)            |                                                       Payment Terms identify the method and timing of payment.                                                        |
|        Estado da Cobrança        |               Lista               | Agência de Cobrança Cobrança Procedimento Legal Não Cobrado |                              |                                                  |                   Invoice Collection Status                   |                                                               Status of the invoice collection process                                                                |
|           É Declaração           |              Sim-Não              |                             (N)                             |                              |                                                  |         Dunning Level is a definition of a statement          |                                                                                                                                                                       |
|       C\_DunningLevel\_UU        |       Texto Curto (String)        |                                                             |                              |                                                  |                                                               |                                                                                                                                                                       |

</div>

</div>

  

<div id="d28119e597" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - C\_DunningLevel\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_DunningLevel_Trl_data)

<span class="emphasis">*Descrição:*</span> Tradução do Nível de Cobrança

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d28119e614" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |  Valores (Padrão)  |     Chave restritiva      |                Regra de validação                |                           Descrição                           |                                                          Comentário/Ajuda                                                           |
| :----------------------: | :-------------------------------: | :----------------: | :-----------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |           Tabela Direta           | (@AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                         (ver o mesmo acima)                                                         |
|       Organização        |           Tabela Direta           |  (@AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                         (ver o mesmo acima)                                                         |
|    Nível de Cobrança     |           Tabela Direta           |                    |   cdunninglevel\_cdltrl   |                                                  |                                                               |                                                                                                                                     |
|          Idioma          |              Tabela               |    AD\_Language    | adlanguage\_cdunninglevel |                                                  |                   Language for this entity                    |                               The Language identifies the language to use for display and formatting                                |
|          Ativo           |              Sim-Não              |        (Y)         |                           |                                                  |              (semelhante ao primeiro relatório)               |                                                         (ver o mesmo acima)                                                         |
|    Texto de Impressão    |       Texto Curto (String)        |                    |                           |                                                  | The label text to be printed on a document or correspondence. | The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters. |
|           Nota           | Texto Médio (até 2000 caracteres) |                    |                           |                                                  |         Optional additional user defined information          |                     The Note field allows for optional entry of user defined information regarding this record                      |
|        Traduzida         |              Sim-Não              |                    |                           |                                                  |                   This column is translated                   |                                   The Translated checkbox indicates if this column is translated.                                   |
| C\_DunningLevel\_Trl\_UU |       Texto Curto (String)        |                    |                           |                                                  |                                                               |                                                                                                                                     |

</div>

</div>

  

</div>
