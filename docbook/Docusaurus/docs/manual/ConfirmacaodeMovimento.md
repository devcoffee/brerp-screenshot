---
title: "Confirmação de Movimento"
id: ConfirmacaodeMovimento
---
<div id="d34023e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Confirmação de Movimento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Confirmação -
    M\_MovementConfirm](#d34023e23)</span>
  - <span class="section">[2. Tabela: Linha -
    M\_MovementLineConfirm](#d34023e282)</span>

</div>

<span class="emphasis">*Descrição:* </span> Confirmar Movimentações de
Estoque

<span class="emphasis">*Comentário/Ajuda:* </span>O documento é
automaticamente criado quando o tipo de documento da movimentação indica
Trânsito de Entrada. Se houver uma diferença de quantidade, um Estoque
Físico é criado para o armazém de origem (de). Se houver uma quantidade
sucateada, um Estoque Físico é criado para o armazém de destino (para).

<span class="emphasis"> *Criado em:* </span>2004-06-17 11:29:43.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ConfirmacaodeMovimento.png)

<div id="d34023e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Confirmação - M\_MovementConfirm

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Confirmar Movimentações de
Estoque

<span class="emphasis">*Comentário/Ajuda:* </span> O documento é
automaticamente criado quando o tipo de documento da movimentação indica
Trânsito de Entrada.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d34023e38" class="table">

<div class="table-title">

Table 1.1. Confirmation
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |                                                                 Valores (Padrão)                                                                  |      Chave restritiva       |                  Regra de validação                   |                  Descrição                   |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------: | :---------------------------------------------------: | :------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Processado          |       Sim-Não        |                                                                                                                                                   |                             |                                                       |       The document has been processed        |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
| Confirmação de Movimentação |          ID          |                                                                                                                                                   |                             |                                                       |         Inventory Move Confirmation          |                                                                                                                                                                                                                                                                                                               The document is automatically created when the document type of the movement indicates In Transit.                                                                                                                                                                                                                                                                                                                |
|            Ativo            |       Sim-Não        |                                                                        (Y)                                                                        |                             |                                                       |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Processar Agora       |       Sim-Não        |                                                                                                                                                   |                             |                                                       |                                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|           Empresa           |    Tabela Direta     |                                                               (@\#AD\_Client\_ID@)                                                                |                             |           AD\_Client.AD\_Client\_ID \< \> 0           |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|         Organização         |    Tabela Direta     |                                                                 (@\#AD\_Org\_ID@)                                                                 |                             | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |      (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Número do Documento     | Texto Curto (String) |                                                                                                                                                   |                             |                                                       |   Document sequence number of the document   | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|   Movimentação de Estoque   |       Procurar       |                                                                                                                                                   | mmovement\_mmovementconfirm |                                                       |            Movement of Inventory             |                                                                                                                                                                                                                                                                                                                              The Inventory Movement uniquely identifies a group of movement lines.                                                                                                                                                                                                                                                                                                                              |
|          Descrição          | Texto Curto (String) |                                                                                                                                                   |                             |                                                       |   Optional short description of the record   |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|          Aprovado           |       Sim-Não        |                                                                        (N)                                                                        |                             |                                                       | Indicates if this document requires approval |                                                                                                                                                                                                                                                                                                                 The Approved checkbox indicates if this document requires approval before it can be processed.                                                                                                                                                                                                                                                                                                                  |
|     Valor da Aprovação      |        Valor         |                                                                                                                                                   |                             |                                                       |           Document Approval Amount           |                                                                                                                                                                                                                                                                                                                                                  Approval Amount for Workflow                                                                                                                                                                                                                                                                                                                                                   |
|     Estado do Documento     |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |                             |                                                       |      The current status of the document      |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|    Processar Confirmação    |        Botão         |                                                                 \_Document Action                                                                 |                             |                                                       |     The targeted status of the document      |                                                                                                                                                                                                                                                                                                                   You find the current status in the Document Status field. The options are listed in a popup                                                                                                                                                                                                                                                                                                                   |
|       Estoque Físico        |       Procurar       |                                                                                                                                                   |   minventory\_mmovconfirm   |                                                       |     Parameters for a Physical Inventory      |                                                                                                                                                                                                                                                                                                                         The Physical Inventory indicates a unique parameters for a physical inventory.                                                                                                                                                                                                                                                                                                                          |
|   M\_MovementConfirm\_UU    | Texto Curto (String) |                                                                                                                                                   |                             |                                                       |                                              |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d34023e282" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha - M\_MovementLineConfirm

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linhas de Confirmação de
Movimentação de Estoque

<span class="emphasis">*Comentário/Ajuda:* </span> As quantidades estão
na Unidade de Medida de armazenagem\!

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d34023e297" class="table">

<div class="table-title">

Table 1.2. Line
Fields

</div>

<div class="table-contents">

|           Nome do campo           |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                            Comentário/Ajuda                                            |
| :-------------------------------: | :------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------: |
|               Ativo               |       Sim-Não        |        (Y)         |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                          (ver o mesmo acima)                                           |
| Confirmação de Linha de Movimento |          ID          |                    |                                 |                                                  |     Inventory Move Line Confirmation     |                                                                                                        |
|              Empresa              |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                          (ver o mesmo acima)                                           |
|            Organização            |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                          (ver o mesmo acima)                                           |
|    Confirmação de Movimentação    |    Tabela Direta     |                    | mmovementconfirm\_mmovlineconf  |                                                  |       Inventory Move Confirmation        |   The document is automatically created when the document type of the movement indicates In Transit.   |
|        Linha de Movimento         |       Procurar       |                    | mmovementline\_mmovlineconfirm  |                                                  |       Inventory Move document Line       | The Movement Line indicates the inventory movement document line (if applicable) for this transaction  |
|          Quantidade Alvo          |      Quantidade      |                    |                                 |                                                  |         Target Movement Quantity         |                              The Quantity which should have been received                              |
|       Quantidade Confirmada       |      Quantidade      |                    |                                 |                                                  |   Confirmation of a received quantity    |                                  Confirmation of a received quantity                                   |
|             Diferença             |      Quantidade      |                    |                                 |                                                  |           Difference Quantity            |                                                                                                        |
|       Quantidade Sucateada        |      Quantidade      |                    |                                 |                                                  |  The Quantity scrapped due to QA issues  |                                                                                                        |
|             Descrição             | Texto Curto (String) |                    |                                 |                                                  | Optional short description of the record |                              A description is limited to 255 characters.                               |
|      Linha de Estoque Físico      |       Procurar       |                    | minventoryline\_mmovlineconfirm |                                                  |   Unique line in an Inventory document   | The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction |
|            Processado             |       Sim-Não        |                    |                                 |                                                  |     The document has been processed      |                  The Processed checkbox indicates that a document has been processed.                  |
|    M\_MovementLineConfirm\_UU     | Texto Curto (String) |                    |                                 |                                                  |                                          |                                                                                                        |

</div>

</div>

  

</div>
