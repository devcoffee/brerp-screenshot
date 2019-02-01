---
title: "Histórico de Transações Online"
id: HistoricodeTransacoesOnline
---
<div id="d113151e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Histórico de Transações Online

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Histórico de Transações Online -
    C\_OnlineTrxHistory](#d113151e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-10-30 19:28:58.0

<span class="emphasis">*Atualizado em:* </span>2012-10-30 19:28:58.0

<div id="d113151e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Histórico de Transações Online - C\_OnlineTrxHistory

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d113151e29" class="table">

<div class="table-title">

Table 1.1. Online Transaction History
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |             Descrição              |                                                                                                   Comentário/Ajuda                                                                                                   |
| :----------------------------: | :-------------------------------: | :----------------: | :------------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Histórico de Transações Online |                ID                 |                    |                            |                                                  |                                    |                                                                                                                                                                                                                      |
|            Empresa             |           Tabela Direta           | (@AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|          Organização           |           Tabela Direta           |  (@AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|             Criado             |             Data+Hora             |     (SYSDATE)      |                            |                                                  |    Date this record was created    |                                                                          The Created field indicates the date that this record was created.                                                                          |
|             Tabela             |           Tabela Direta           |                    | adtable\_conlinetrxhistory |                                                  |     Database Table information     |                                                                         The Database Table provides the information of the table definition                                                                          |
|         ID do Registro         |               Botão               |                    |                            |                                                  |     Direct internal record ID      | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|             Ativo              |              Sim-Não              |        (Y)         |                            |                                                  | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|       Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                    |                            |                                                  |            Text Message            |                                                                                                                                                                                                                      |
|              Erro              |              Sim-Não              |        (N)         |                            |                                                  | An Error occurred in the execution |                                                                                                                                                                                                                      |
|           Processado           |              Sim-Não              |        (N)         |                            |                                                  |  The document has been processed   |                                                                         The Processed checkbox indicates that a document has been processed.                                                                         |

</div>

</div>

  

</div>
