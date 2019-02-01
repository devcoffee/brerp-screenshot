---
title: "Recorrente"
id: Recorrente
---
<div id="d191934e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Recorrente

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Recorrente -
    C\_Recurring](#d191934e22)</span>
  - <span class="section">[2. Tabela: Execução -
    C\_Recurring\_Run](#d191934e413)</span>

</div>

<span class="emphasis">*Descrição:* </span> Documento Recorrente

<span class="emphasis">*Comentário/Ajuda:* </span>Criar novos documentos
baseado em um documento existente

<span class="emphasis"> *Criado em:* </span>2003-05-28 22:25:58.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d191934e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Recorrente - C\_Recurring

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Recurring_data)

<span class="emphasis">*Descrição:*</span> Documento Recorrente

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
Documentos Recorrentes. A Execução de Próxima Data determina o Documento
(e a Data Contábil) dos documentos gerados.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d191934e39" class="table">

<div class="table-title">

Table 1.1. Recurring
Fields

</div>

<div class="table-contents">

|        Nome do campo         |            Referência             |                     Valores (Padrão)                     |      Chave restritiva       |                        Regra de validação                         |                Descrição                 |                                                                                               Comentário/Ajuda                                                                                                |
| :--------------------------: | :-------------------------------: | :------------------------------------------------------: | :-------------------------: | :---------------------------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Criado            |             Data+Hora             |                        (SYSDATE)                         |                             |                                                                   |       Date this record was created       |                                                                      The Created field indicates the date that this record was created.                                                                       |
|          Recorrente          |                ID                 |                                                          |                             |                                                                   |            Recurring Document            |                                                                                              Recurring Documents                                                                                              |
|           Empresa            |           Tabela Direta           |                   (@\#AD\_Client\_ID@)                   |                             |                 AD\_Client.AD\_Client\_ID \< \> 0                 |    (semelhante ao primeiro relatório)    |                                                                                              (ver o mesmo acima)                                                                                              |
|         Organização          |           Tabela Direta           |                    (@\#AD\_Org\_ID@)                     |                             |         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)          |    (semelhante ao primeiro relatório)    |                                                                                              (ver o mesmo acima)                                                                                              |
|             Nome             |       Texto Curto (String)        |                                                          |                             |                                                                   |  Alphanumeric identifier of the entity   |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|          Descrição           |       Texto Curto (String)        |                                                          |                             |                                                                   | Optional short description of the record |                                                                                  A description is limited to 255 characters.                                                                                  |
|       Comentário/Ajuda       | Texto Médio (até 2000 caracteres) |                                                          |                             |                                                                   |             Comment or Hint              |                                                                  The Help field contains a hint, comment or help about the use of this item.                                                                  |
|     Grupo de Recorrência     |           Tabela Direta           |                                                          | CRecurringGroup\_CRecurring |                                                                   |                                          |                                                                                                                                                                                                               |
|            Ativo             |              Sim-Não              |                           (Y)                            |                             |                                                                   |    (semelhante ao primeiro relatório)    |                                                                                              (ver o mesmo acima)                                                                                              |
|      Tipo de Freqüência      |               Lista               | Diariamente Mensalmente Trimestralmente Semanalmente (M) |                             |                                                                   |            Frequency of event            |                                                                    The frequency type is used for calculating the date of the next event.                                                                     |
|          Freqüência          |              Inteiro              |                                                          |                             |                                                                   |           Frequency of events            |                 The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks.                  |
|     Máximo de Execuções      |              Inteiro              |                                                          |                             |                                                                   |         Number of recurring runs         |                                                                            Number of recurring documents to be generated in total                                                                             |
|   Data da Próxima Execução   |             Data+Hora             |                                                          |                             |                                                                   |      Date the process will run next      |                                                                       The Date Next Run indicates the next time this process will run.                                                                        |
|       Tipo Recorrente        |               Lista               |   Diário de Razão Geral Fatura Projeto Pedido Payment    |                             | <span class="emphasis">*ReadOnly Logic*</span>: @DateLastRun@\!'' |        Type of Recurring Document        |                                                                                     The type of document to be generated                                                                                      |
|            Pedido            |             Procurar              |                                                          |     corder\_crecurring      | <span class="emphasis">*ReadOnly Logic*</span>: @DateLastRun@\!'' |                  Order                   | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
|         Lote Diário          |             Procurar              |                                                          | gljournalbatch\_crecurring  | <span class="emphasis">*ReadOnly Logic*</span>: @DateLastRun@\!'' |       General Ledger Journal Batch       |                                                          The General Ledger Journal Batch identifies a group of journals to be processed as a group.                                                          |
|            Fatura            |             Procurar              |                                                          |    cinvoice\_crecurring     | <span class="emphasis">*ReadOnly Logic*</span>: @DateLastRun@\!'' |            Invoice Identifier            |                                                                                             The Invoice Document.                                                                                             |
|           Projeto            |             Procurar              |                                                          |    cproject\_crecurring     | <span class="emphasis">*ReadOnly Logic*</span>: @DateLastRun@\!'' |            Financial Project             |                                                                  A Project allows you to track and control internal or external activities.                                                                   |
|          Pagamento           |             Procurar              |                                                          |    cpayment\_crecurring     | <span class="emphasis">*ReadOnly Logic*</span>: @DateLastRun@\!'' |            Payment identifier            |                                                                              The Payment is a unique identifier of this payment.                                                                              |
| Data do último processamento |             Data+Hora             |                                                          |                             |                                                                   |      Date the process was last run.      |                                                                       The Date Last Run indicates the last time that a process was run.                                                                       |
|     Execuções Restantes      |              Inteiro              |                                                          |                             |                                                                   |    Number of recurring runs remaining    |                                                                              Number of recurring documents to be still generated                                                                              |
|       Iniciar Processo       |               Botão               |                                                          |                             |                                                                   |                                          |                                                                                                                                                                                                               |
|       C\_Recurring\_UU       |       Texto Curto (String)        |                                                          |                             |                                                                   |                                          |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d191934e413" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Execução - C\_Recurring\_Run

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Execução de Documento
Recorrente

<span class="emphasis">*Comentário/Ajuda:* </span> Histórico de Geração
de Documento Recorrente

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d191934e428" class="table">

<div class="table-title">

Table 1.2. Run
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  |       Chave restritiva        |                Regra de validação                |             Descrição              |                                                                                               Comentário/Ajuda                                                                                                |
| :-------------------: | :------------------: | :----------------: | :---------------------------: | :----------------------------------------------: | :--------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Execução Recorrente  |          ID          |                    |                               |                                                  |       Recurring Document Run       |                                                                                   History of Recurring Document Generation                                                                                    |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                                              (ver o mesmo acima)                                                                                              |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                                              (ver o mesmo acima)                                                                                              |
|      Recorrente       |    Tabela Direta     |                    |   crecurring\_crecurringrun   |                                                  |         Recurring Document         |                                                                                              Recurring Documents                                                                                              |
|        Criado         |      Data+Hora       |     (SYSDATE)      |                               |                                                  |    Date this record was created    |                                                                      The Created field indicates the date that this record was created.                                                                       |
|         Ativo         |       Sim-Não        |        (Y)         |                               |                                                  | (semelhante ao primeiro relatório) |                                                                                              (ver o mesmo acima)                                                                                              |
|   Data do Documento   |         Data         |                    |                               |                                                  |        Date of the Document        |                                            The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                             |
|       Pagamento       |       Procurar       |                    |    cpayment\_crecurringrun    |                                                  |         Payment identifier         |                                                                              The Payment is a unique identifier of this payment.                                                                              |
|        Pedido         |       Procurar       |                    |     corder\_crecurringrun     |                                                  |               Order                | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
|        Projeto        |       Procurar       |                    |    cproject\_crecurringrun    |                                                  |         Financial Project          |                                                                  A Project allows you to track and control internal or external activities.                                                                   |
|        Fatura         |       Procurar       |                    |    cinvoice\_crecurringrun    |                                                  |         Invoice Identifier         |                                                                                             The Invoice Document.                                                                                             |
|      Lote Diário      |       Procurar       |                    | gljournalbatch\_crecurringrun |                                                  |    General Ledger Journal Batch    |                                                          The General Ledger Journal Batch identifies a group of journals to be processed as a group.                                                          |
| C\_Recurring\_Run\_UU | Texto Curto (String) |                    |                               |                                                  |                                    |                                                                                                                                                                                                               |

</div>

</div>

  

</div>
