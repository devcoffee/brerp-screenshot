---
title: "Apontamento de Etiquetas"
id: ApontamentodeEtiquetas
---
<div id="d6125e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Apontamento de Etiquetas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Apontamento de Etiquetas -
    COF\_LabelEntry](#d6125e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Janela utilizada para
mostrar todas as leituras de etiquetas

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-03 09:31:58.0

<span class="emphasis">*Atualizado em:* </span>2017-01-03 09:31:58.0

![](/img/manual/ApontamentodeEtiquetas.png)

<div id="d6125e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Apontamento de Etiquetas - COF\_LabelEntry

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d6125e30" class="table">

<div class="table-title">

Table 1.1. Label Entry
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |                                 Valores (Padrão)                                  |       Chave restritiva        |                Regra de validação                |                                                                   Descrição                                                                   |                                                                                                   Comentário/Ajuda                                                                                                   |
| :----------------------: | :------------------: | :-------------------------------------------------------------------------------: | :---------------------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   COF\_LabelEntry\_ID    |          ID          |                                                                                   |                               |                                                  |                                                           Primary Key : Label Entry                                                           |                                                                                              Primary Key : Label Entry                                                                                               |
|         Empresa          |    Tabela Direta     |                               (@\#AD\_Client\_ID@)                                |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |                                                      (semelhante ao primeiro relatório)                                                       |                                                                                                 (ver o mesmo acima)                                                                                                  |
|       Organização        |    Tabela Direta     |                                 (@\#AD\_Org\_ID@)                                 |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                                      (semelhante ao primeiro relatório)                                                       |                                                                                                 (ver o mesmo acima)                                                                                                  |
|      Chave de Busca      | Texto Curto (String) |                                                                                   |                               |                                                  |                                                      (semelhante ao primeiro relatório)                                                       |                                                                                                 (ver o mesmo acima)                                                                                                  |
|           Nome           | Texto Curto (String) |                                                                                   |                               |                                                  |                                                     Alphanumeric identifier of the entity                                                     |                                     The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                     |
|     Código de Barras     | Texto Curto (String) |                                                                                   |                               |                                                  |                                                                                                                                               |                                                                                                                                                                                                                      |
| Configuração de Etiqueta |    Tabela Direta     |                                                                                   | COFLabelConfig\_COFLabelEntry |                                                  |                                                          Primary Key : Label Config                                                           |                                                                                              Primary Key : Label Config                                                                                              |
|         Etiqueta         |    Tabela Direta     |                                                                                   |    COFLabel\_COFLabelEntry    |                                                  |                                                              Primary Key : Label                                                              |                                                                                                 Primary Key : Label                                                                                                  |
|          Tabela          |    Tabela Direta     |                                                                                   |    ADTable\_COFLabelEntry     |                                                  |                                                          Database Table information                                                           |                                                                         The Database Table provides the information of the table definition                                                                          |
|  ID da Linha da Tabela   |          ID          |                                                                                   |                               |                                                  |                                                   This field is used to save the table line                                                   |                                                                                      This field is used to save the table line                                                                                       |
|      ID do Registro      |          ID          |                                                                                   |                               |                                                  |                                                           Direct internal record ID                                                           | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
| ID da Linha do Registro  |          ID          |                                                                                   |                               |                                                  |                                                  This element save the line of the record ID                                                  |                                                                                     This element save the line of the record ID                                                                                      |
|          Estado          |        Lista         | Apontamento de Entrada Apontamento de Saída Gerada Entrada Anulada Saída Impressa |                               |                                                  |                                                     Status of the currently running check                                                     |                                                                                        Status of the currently running check                                                                                         |
|       Localizador        |  Locator (Armazém)   |                                                                                   |    MLocator\_COFLabelEntry    |                                                  |                                                               Warehouse Locator                                                               |                                                                           The Locator indicates where in a Warehouse a product is located.                                                                           |
| Tipo de Produto Apontado |        Lista         |                           By-product Co-product Normal                            |                               |                                                  | This column it's used to determinate the type of product in the entry, specify if the product are a normal product, co product or by product. |                                                                                                                                                                                                                      |
|        Processado        |       Sim-Não        |                                        (N)                                        |                               |                                                  |                                                                                                                                               |                                                                                                                                                                                                                      |
|   Tipo de apontamento    |       Sim-Não        |                                                                                   |                               |                                                  |                                                          This is a Sales Transaction                                                          |                                                                    The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                                                     |
|          Ativo           |       Sim-Não        |                                        (Y)                                        |                               |                                                  |                                                      (semelhante ao primeiro relatório)                                                       |                                                                                                 (ver o mesmo acima)                                                                                                  |

</div>

</div>

  

</div>
