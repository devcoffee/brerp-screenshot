---
title: "Questionário"
id: Questionario
---
<div id="d187444e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Questionário

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Questionário -
    COF\_R\_Survey](#d187444e23)</span>
  - <span class="section">[2. Tabela: Perguntas -
    COF\_R\_Survey\_Question](#d187444e216)</span>
  - <span class="section">[3. Tabela: Valores Possíveis -
    COF\_R\_Question\_Value](#d187444e354)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-27 17:28:14.0

<span class="emphasis">*Atualizado em:* </span>2013-08-27 17:28:14.0

![](/img/manual/Questionario.png)

<div id="d187444e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Questionário - COF\_R\_Survey

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d187444e30" class="table">

<div class="table-title">

Table 1.1. Questionário
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| COF\_R\_Survey\_ID  |          ID          |                      |                  |                                                  |           Primary Key : Survey           |                                                                                                                                                                                                                                                                                                                                                      Primary Key : Survey                                                                                                                                                                                                                                                                                                                                                       |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|   Data de Início    |         Data         |                      |                  |                                                  |     First effective day (inclusive)      |                                                                                                                                                                                                                                                                                                                                       The Start Date indicates the first or starting date                                                                                                                                                                                                                                                                                                                                       |
|     Data Final      |         Data         |                      |                  |                                                  |     Last effective date (inclusive)      |                                                                                                                                                                                                                                                                                                                                       The End Date indicates the last date in this range.                                                                                                                                                                                                                                                                                                                                       |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
| Número do Documento | Texto Curto (String) |                      |                  |                                                  | Document sequence number of the document | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|        Name         | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   |                                                                                                                                                                                                                                                                                          The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                                                                                                           |
|     Description     |      Memorando       |                      |                  |                                                  | Optional short description of the record |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|       Tabela        |        Tabela        | AD\_Table TableName  |                  |                                                  |        Database Table information        |                                                                                                                                                                                                                                                                                                                               The Database Table provides the information of the table definition                                                                                                                                                                                                                                                                                                                               |
|      Condição       | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d187444e216" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Perguntas - COF\_R\_Survey\_Question

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d187444e223" class="table">

<div class="table-title">

Table 1.2. Survey Question
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |      Valores (Padrão)      |        Chave restritiva        |                Regra de validação                |                      Descrição                       |                                             Comentário/Ajuda                                              |
| :--------------------------: | :------------------: | :------------------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
| COF\_R\_Survey\_Question\_ID |          ID          |                            |                                |                                                  |            Primary Key : Survey Question             |                                       Primary Key : Survey Question                                       |
|           Empresa            |    Tabela Direta     |    (@\#AD\_Client\_ID@)    |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|         Organização          |    Tabela Direta     |     (@\#AD\_Org\_ID@)      |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|          Survey ID           |       Procurar       |       COF Survey ID        | COFRSurvey\_COFRSurveyQuestion |                                                  |                 Primary Key : Survey                 |                                           Primary Key : Survey                                            |
|            Ativo             |       Sim-Não        |            (Y)             |                                |                                                  |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|         Description          | Texto Curto (String) |                            |                                |                                                  |       Optional short description of the record       |                                A description is limited to 255 characters.                                |
|             Type             |        Lista         | Lista Numero Sim/Não Texto |                                |                                                  | Type of Validation (SQL, Java Script, Java Language) | The Type indicates the type of validation that will occur. This can be SQL, Java Script or Java Language. |

</div>

</div>

  

<div id="d187444e354" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Valores Possíveis - COF\_R\_Question\_Value

</div>

</div>

</div>

<span class="emphasis">*Lógica de visualização:*</span> @Type@='L'

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d187444e365" class="table">

<div class="table-title">

Table 1.3. Question Value
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |              Comentário/Ajuda               |
| :--------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------: |
| COF\_R\_Question\_Value\_ID  |          ID          |                      |                                 |                                                  |       Primary Key : Question Value       |        Primary Key : Question Value         |
|           Empresa            |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|         Organização          |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|            Ativo             |       Sim-Não        |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
| COF\_R\_Survey\_Question\_ID |       Procurar       |   Survey Question    | COFRSurveyQuestion\_COFRQuestio |                                                  |      Primary Key : Survey Question       |        Primary Key : Survey Question        |
|         Description          | Texto Curto (String) |                      |                                 |                                                  | Optional short description of the record | A description is limited to 255 characters. |

</div>

</div>

  

</div>
