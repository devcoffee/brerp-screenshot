---
title: "Importar Confirmações"
id: ImportarConfirmacoes
---
<div id="d114338e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Confirmações

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Linhas de Confirmação -
    I\_InOutLineConfirm](#d114338e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importar Linhas de
Confirmação de Recebimento/Entrega

<span class="emphasis">*Comentário/Ajuda:* </span>Importar dados de
Confirmação provenientes de Confirmações existentes de
Recebimento/Entrega

<span class="emphasis"> *Criado em:* </span>2004-07-02 14:36:09.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ImportarConfirmacoes.png)

<div id="d114338e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Linhas de Confirmação - I\_InOutLineConfirm

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Importar Linhas de
Confirmação de Recebimento/Entrega

<span class="emphasis">*Comentário/Ajuda:* </span> Importar dados de
Confirmação provenientes de Confirmações existentes de
Recebimento/Entrega

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d114338e38" class="table">

<div class="table-title">

Table 1.1. Confirmation Lines
Fields

</div>

<div class="table-contents">

|                      Nome do campo                      |      Referência      |   Valores (Padrão)   |     Chave restritiva      |                Regra de validação                |                       Descrição                       |                                     Comentário/Ajuda                                      |
| :-----------------------------------------------------: | :------------------: | :------------------: | :-----------------------: | :----------------------------------------------: | :---------------------------------------------------: | :---------------------------------------------------------------------------------------: |
|                          Ativo                          |       Sim-Não        |         (Y)          |                           |                                                  |          (semelhante ao primeiro relatório)           |                                    (ver o mesmo acima)                                    |
|                        Importado                        |       Sim-Não        |                      |                           |                                                  |            Has this import been processed             |            The Imported check box indicates if this import has been processed.            |
| Linha de Importação de Confirmação de Envio/Recebimento |          ID          |                      |                           |                                                  | Material Shipment or Receipt Confirmation Import Line |                             Import Confirmation Line Details                              |
|             Mensagem de Erro de Importação              | Texto Curto (String) |                      |                           |                                                  |        Messages generated from import process         | The Import Error Message displays any error messages generated during the import process. |
|                         Empresa                         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                    (ver o mesmo acima)                                    |
|                       Organização                       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                    (ver o mesmo acima)                                    |
|        Linha de Confirmação de Envio/Recebimento        |       Procurar       |                      | minoutlineconfirm\_import |                                                  |    Material Shipment or Receipt Confirmation Line     |                                   Confirmation details                                    |
|                    Núm. Confirmação                     | Texto Curto (String) |                      |                           |                                                  |                  Confirmation Number                  |                                                                                           |
|                  Quantidade Confirmada                  |      Quantidade      |                      |                           |                                                  |          Confirmation of a received quantity          |                            Confirmation of a received quantity                            |
|                  Quantidade Sucateada                   |      Quantidade      |                      |                           |                                                  |        The Quantity scrapped due to QA issues         |                                                                                           |
|                        Diferença                        |      Quantidade      |                      |                           |                                                  |                  Difference Quantity                  |                                                                                           |
|                        Descrição                        | Texto Curto (String) |                      |                           |                                                  |       Optional short description of the record        |                        A description is limited to 255 characters.                        |
|                  Importar Confirmações                  |        Botão         |                      |                           |                                                  |                                                       |                                                                                           |
|                       Processado                        |       Sim-Não        |                      |                           |                                                  |            The document has been processed            |           The Processed checkbox indicates that a document has been processed.            |
|                 I\_InOutLineConfirm\_UU                 | Texto Curto (String) |                      |                           |                                                  |                                                       |                                                                                           |

</div>

</div>

  

</div>
