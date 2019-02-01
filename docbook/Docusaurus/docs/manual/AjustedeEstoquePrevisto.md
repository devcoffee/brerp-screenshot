---
title: "Ajuste de Estoque Previsto"
id: AjustedeEstoquePrevisto
---
<div id="d3364e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ajuste de Estoque Previsto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ajuste de Estoque Previsto -
    COF\_AjusteEstoquePrevisto](#d3364e23)</span>
  - <span class="section">[2. Tabela: Linha de Ajuste de Estoque
    Previsto - COF\_AjusteEstoquePrvstLine](#d3364e249)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-05-08 15:18:35.0

<span class="emphasis">*Atualizado em:* </span>2018-05-08 15:18:35.0

![](/img/manual/AjustedeEstoquePrevisto.png)

<div id="d3364e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ajuste de Estoque Previsto - COF\_AjusteEstoquePrevisto

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d3364e30" class="table">

<div class="table-title">

Table 1.1. Ajuste de Estoque Previsto
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |                                                                    Valores (Padrão)                                                                    |        Chave restritiva         |                                 Regra de validação                                 |                   Descrição                   |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-----------------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :--------------------------------------------------------------------------------: | :-------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Ajuste de Estoque Previsto    |          ID          |                                                                                                                                                        |                                 |                                                                                    |   Primary Key : Ajuste de Estoque Previsto    |                                                                                                                                                                                                                                                                                                                                            Primary Key : Ajuste de Estoque Previsto                                                                                                                                                                                                                                                                                                                                             |
| COF\_AjusteEstoquePrevisto\_UU  | Texto Curto (String) |                                                                                                                                                        |                                 |                                                                                    |                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|             Empresa             |    Tabela Direta     |                                                                  (@\#AD\_Client\_ID@)                                                                  |                                 |                         AD\_Client.AD\_Client\_ID \< \> 0                          |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|           Organização           |    Tabela Direta     |                                                                   (@\#AD\_Org\_ID@)                                                                    |                                 |                  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                  |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Número do Documento       | Texto Curto (String) |                                                                                                                                                        |                                 |                                                                                    |   Document sequence number of the document    | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|              Ativo              |       Sim-Não        |                                                                          (Y)                                                                           |                                 |                                                                                    |      (semelhante ao primeiro relatório)       |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|            Descrição            | Texto Curto (String) |                                                                                                                                                        |                                 |                                                                                    |   Optional short description of the record    |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|        Data do Documento        |         Data         |                                                                       (@\#Date@)                                                                       |                                 |                                                                                    |             Date of the Document              |                                                                                                                                                                                                                                                                                                     The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                                                                                                                                                                                                                                                                                      |
|       Estado do Documento       |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                                 |                                                                                    |      The current status of the document       |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|     Tipo de Documento Alvo      |        Tabela        |                                                                       C\_DocType                                                                       | CDocTypeTarget\_COFAjusteEstoqu | C\_DocType.DocBaseType IN ('AEP') AND C\_DocType.AD\_Client\_ID=@\#AD\_Client\_ID@ | Target document type for conversing documents |                                                                                                                                                                                                                                                             You can convert document types (e.g. from Offer to Order or Invoice). The conversion is then reflected in the current type. This processing is initiated by selecting the appropriate Document Action.                                                                                                                                                                                                                                                              |
| Process Ajuste Estoque Previsto |        Botão         |                                                                 \_Document Action(PR)                                                                  |                                 |                                                                                    |      The targeted status of the document      |                                                                                                                                                                                                                                                                                                                   You find the current status in the Document Status field. The options are listed in a popup                                                                                                                                                                                                                                                                                                                   |
|           Processado            |       Sim-Não        |                                                                          (N)                                                                           |                                 |                                                                                    |        The document has been processed        |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|            Aprovado             |       Sim-Não        |                                                                          (Y)                                                                           |                                 |                                                                                    | Indicates if this document requires approval  |                                                                                                                                                                                                                                                                                                                 The Approved checkbox indicates if this document requires approval before it can be processed.                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

<div id="d3364e249" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha de Ajuste de Estoque Previsto - COF\_AjusteEstoquePrvstLine

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d3364e256" class="table">

<div class="table-title">

Table 1.2. Linha de Ajuste de Estoque Previsto
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |                                                                                             Valores (Padrão)                                                                                             |        Chave restritiva         |                                                                          Regra de validação                                                                          |                        Descrição                         |                                  Comentário/Ajuda                                  |
| :---------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------: | :--------------------------------------------------------------------------------: |
|   COF\_AjusteEstoquePrvstLine\_UU   | Texto Curto (String) |                                                                                                                                                                                                          |                                 |                                                                                                                                                                      |                                                          |                                                                                    |
| Linha de Ajuste de Estoque Previsto |          ID          |                                                                                                                                                                                                          |                                 |                                                                                                                                                                      |    Primary Key : Linha de Ajuste de Estoque Previsto     |                 Primary Key : Linha de Ajuste de Estoque Previsto                  |
|               Empresa               |    Tabela Direta     |                                                                                           (@\#AD\_Client\_ID@)                                                                                           |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |            (semelhante ao primeiro relatório)            |                                (ver o mesmo acima)                                 |
|             Organização             |    Tabela Direta     |                                                                                             (@AD\_Org\_ID@)                                                                                              |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |            (semelhante ao primeiro relatório)            |                                (ver o mesmo acima)                                 |
|     Ajuste de Estoque Previsto      |    Tabela Direta     |                                                                                                                                                                                                          | COFAjusteEstoquePrevisto\_COFAj |                                                                                                                                                                      |         Primary Key : Ajuste de Estoque Previsto         |                      Primary Key : Ajuste de Estoque Previsto                      |
|                Ativo                |       Sim-Não        |                                                                                                   (Y)                                                                                                    |                                 |                                                                                                                                                                      |            (semelhante ao primeiro relatório)            |                                (ver o mesmo acima)                                 |
|                Linha                |       Inteiro        | (@SQL= SELECT NVL(MAX(COF\_AjusteEstoquePrvstLine.LineNo), 0) + 10 FROM COF\_AjusteEstoquePrvstLine WHERE COF\_AjusteEstoquePrvstLine.COF\_AjusteEstoquePrevisto\_ID = @COF\_AjusteEstoquePrevisto\_ID@) |                                 |                                                                                                                                                                      |                         Line No                          |                                                                                    |
|              Descrição              | Texto Curto (String) |                                                                                                                                                                                                          |                                 |                                                                                                                                                                      |         Optional short description of the record         |                    A description is limited to 255 characters.                     |
|               Produto               |       Procurar       |                                                                                                                                                                                                          | MProduct\_COFAjusteEstoquePrvst | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                  Product, Service, Item                  |     Identifies an item which is either purchased or sold in this organization.     |
|             Quantidade              |      Quantidade      |                                                                                                                                                                                                          |                                 |                                                                                                                                                                      |                         Quantity                         | The Quantity indicates the number of a specific product or item for this document. |
|        Preço de Custo Atual         |    Custos+Preços     |                                                                                                   (0)                                                                                                    |                                 |                                                                                                                                                                      |              The currently used cost price               |                                                                                    |
|         Novo Preço de Custo         |    Custos+Preços     |                                                                                                   (0)                                                                                                    |                                 |                                                                                                                                                                      | New current cost price after processing of M\_CostDetail |                                                                                    |

</div>

</div>

  

</div>
