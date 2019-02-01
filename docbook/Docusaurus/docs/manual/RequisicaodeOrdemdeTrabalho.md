---
title: "Requisição de Ordem de Trabalho"
id: RequisicaodeOrdemdeTrabalho
---
<div id="d205835e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Requisição de Ordem de Trabalho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Requisição de Ordem de Trabalho -
    MP\_OT\_Request](#d205835e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-22 17:09:21.0

<span class="emphasis">*Atualizado em:* </span>2017-06-22 17:09:21.0

<div id="d205835e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Requisição de Ordem de Trabalho - MP\_OT\_Request

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_OT_Request_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d205835e31" class="table">

<div class="table-title">

Table 1.1. Request
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |               Valores (Padrão)               |     Chave restritiva      |      Regra de validação      |                           Descrição                           |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :------------------------------: | :------------------: | :------------------------------------------: | :-----------------------: | :--------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Requisição de Ordem de Trabalho  |          ID          |                                              |                           |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|             Empresa              |    Tabela Direta     |                                              |   ADClient\_MPOTRequest   |                              |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|           Organização            |    Tabela Direta     |                                              |    ADOrg\_MPOTRequest     |                              |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Número do Documento        | Texto Curto (String) |                                              |                           |                              |           Document sequence number of the document            | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|        Data do Documento         |      Data+Hora       |                                              |                           |                              |                     Date of the Document                      |                                                                                                                                                                                                                                                                                                     The Document Date indicates the date the document was generated. It may or may not be the same as the accounting date.                                                                                                                                                                                                                                                                                                      |
|        Tipo de Documento         |    Tabela Direta     |                                              |   CDocType\_MPOTRequest   | C\_DocType.DocBaseType='MOF' |                    Document type or rules                     |                                                                                                                                                                                                                                                                                                                               The Document Type determines document sequence and processing rules                                                                                                                                                                                                                                                                                                                               |
|              Ativo               |       Sim-Não        |                                              |                           |                              |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|        Tipo da Requisição        |        Lista         |             Corretiva Preventiva             |                           |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Ativo               |    Tabela Direta     |                                              |    AAsset\_MPOTRequest    |                              |             Asset used internally or by customers             |                                                                                                                                                                                                                                                                                                  An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                                                                                                                                                                                                                                                   |
|           Data Exigida           |      Data+Hora       |                                              |                           |                              |                      Date when required                       |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Descrição             | Texto Curto (String) |                                              |                           |                              |           Optional short description of the record            |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|         Usuário/Contato          |    Tabela Direta     |                                              |    ADUser\_MPOTRequest    |                              | User within the system - Internal or Business Partner Contact |                                                                                                                                                                                                                                                                                                          The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                                                                                                                                                                                                          |
| Checklist de Processos (Padrões) |        Tabela        |                MP\_JobStandar                | MPJobStandar\_MPOTRequest |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Prioridade            |        Lista         |  Urgente Alta Média Baixa Menor Importância  |                           |                              |                    Priority of a document                     |                                                                                                                                                                                                                                                                                                                           The Priority indicates the importance (high, medium, low) of this document                                                                                                                                                                                                                                                                                                                            |
|       Estado do Documento        |        Lista         | Aprovado Anulado Aguardando Confirmação (WC) |                           |                              |              The current status of the document               |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|         ProcessRequestOT         |        Botão         |                                              |                           |                              |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Processado            |       Sim-Não        |                                              |                           |                              |                The document has been processed                |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |

</div>

</div>

  

</div>
