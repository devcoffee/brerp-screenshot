---
title: "Etapa de Vendas"
id: EtapadeVendas
---
<div id="d90356e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Etapa de Vendas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Sales Stage -
    C\_SalesStage](#d90356e23)</span>
  - <span class="section">[2. Tabela: Oportunidades -
    C\_Opportunity](#d90356e218)</span>
  - <span class="section">[3. Tabela: Translation -
    C\_SalesStage\_Trl](#d90356e535)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-25 14:50:00.0

<span class="emphasis">*Atualizado em:* </span>2013-08-25 14:50:00.0

![](/img/manual/EtapadeVendas.png)

<div id="d90356e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Sales Stage - C\_SalesStage

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_SalesStage_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d90356e32" class="table">

<div class="table-title">

Table 1.1. Sales Stage
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Estágio de Vendas   |          ID          |                      |                  |                                                  |       Stages of the sales process        |                                           Define what stages your sales process will move through                                            |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Ativo         |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca    | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Probabilidade     |        Valor         |                      |                  |                                                  |                                          |                                                                                                                                              |
| Estado de Fechamento |       Sim-Não        |         (N)          |                  |                                                  |           The status is closed           |                                                  This allows to have multiple closed status                                                  |
|        Ganha         |       Sim-Não        |                      |                  |                                                  |         The opportunity was won          |                                                                                                                                              |
|  C\_SalesStage\_UU   | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d90356e218" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Oportunidades - C\_Opportunity

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Opportunity_data)

<span class="emphasis">*Coluna linkada:* </span> Sales Stage

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d90356e231" class="table">

<div class="table-title">

Table 1.2. Opportunity
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |   Valores (Padrão)   |     Chave restritiva      |                                      Regra de validação                                       |                           Descrição                           |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :-------------------------: | :-------------------------------: | :------------------: | :-----------------------: | :-------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Oportunidade de Vendas    |                ID                 |                      |                           |                                                                                               |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            Ativo            |              Sim-Não              |         (Y)          |                           |                                                                                               |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|           Empresa           |           Tabela Direta           | (@\#AD\_Client\_ID@) |                           |                               AD\_Client.AD\_Client\_ID \< \> 0                               |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|         Organização         |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                           |                       (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                        |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Número do Documento     |       Texto Curto (String)        |                      |                           |                                                                                               |           Document sequence number of the document            | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|    Parceiro de Negócios     |             Procurar              | (@C\_BPartner\_ID@)  |  cbpartner\_copportunity  |                                                                                               |                 Identifies a Business Partner                 |                                                                                                                                                                                                                                                                                                         A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                                                                                                                                                                                                         |
|       Usuário/Contato       |           Tabela Direta           |         (-1)         |   aduser\_copportunity    |                          AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@                           | User within the system - Internal or Business Partner Contact |                                                                                                                                                                                                                                                                                                          The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                                                                                                                                                                                                          |
|          Campanha           |           Tabela Direta           |                      |  ccampaign\_copportunity  |                                                                                               |                      Marketing Campaign                       |                                                                                                                                                                                                                                                                              The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                                                                                                                                                                                                                                                                               |
|   Representante de Vendas   |              Tabela               | AD\_User - SalesRep  |  salesrep\_copportunity   |                                                                                               |             Sales Representative or Company Agent             |                                                                                                                                                                                                                                                                                                         The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                                                                                                                                                                                                                                                                                          |
|      Estágio de Vendas      |              Tabela               |    C\_SalesStage     | csalesstage\_copportunity | (@C\_Opportunity\_ID@ \> 0 OR (@C\_Opportunity\_ID@ \< = 0 AND C\_SalesStage.IsClosed = 'N')) |                  Stages of the sales process                  |                                                                                                                                                                                                                                                                                                                                     Define what stages your sales process will move through                                                                                                                                                                                                                                                                                                                                     |
|        Probabilidade        |               Valor               |                      |                           |                                                                                               |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Data de Fechamento Prevista |               Data                |                      |                           |                                                                                               |                      Expected Close Date                      |                                                                                                                                                                                                                                                                                                                                The Expected Close Date indicates the expected last or final date                                                                                                                                                                                                                                                                                                                                |
|    Valor da Oportunidade    |               Valor               |                      |                           |              <span class="emphasis">*ReadOnly Logic*</span>: @C\_Order\_ID@\> 0               |           The estimated value of this opportunity.            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|          Moeda De           |           Tabela Direta           |                      |  ccurrency\_copportunity  |                                                                                               |                 The Currency for this record                  |                                                                                                                                                                                                                                                                                                                          Indicates the Currency to be used when processing or reporting on this record                                                                                                                                                                                                                                                                                                                          |
|          Descrição          |       Texto Curto (String)        |                      |                           |                                                                                               |           Optional short description of the record            |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|         Comentários         | Texto Médio (até 2000 caracteres) |                      |                           |                                                                                               |              Comments or additional information               |                                                                                                                                                                                                                                                                                                                            The Comments field allows for free form entry of additional information.                                                                                                                                                                                                                                                                                                                             |
|     Data de Fechamento      |               Data                |                      |                           |                                                                                               |                          Close Date                           |                                                                                                                                                                                                                                                                                                                                         The Start Date indicates the last or final date                                                                                                                                                                                                                                                                                                                                         |
|            Custo            |               Valor               |                      |                           |                                                                                               |                       Cost information                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|     C\_Opportunity\_UU      |       Texto Curto (String)        |                      |                           |                                                                                               |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d90356e535" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Translation - C\_SalesStage\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_SalesStage_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Sales Stage

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d90356e548" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |   Valores (Padrão)   |      Chave restritiva       |                                  Regra de validação                                   |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :------------------: | :------------------: | :-------------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |  ADClient\_CSalesStageTrl   | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |    Tabela Direta     |                      |    ADOrg\_CSalesStageTrl    |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Estágio de Vendas |       Procurar       |                      | CSalesStage\_CSalesStageTrl |                                                                                       |       Stages of the sales process        |                                           Define what stages your sales process will move through                                            |
|      Idioma       |        Tabela        |     AD\_Language     | ADLanguage\_CSalesStageTrl  |                                                                                       |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo       |       Sim-Não        |         (Y)          |                             |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Traduzida     |       Sim-Não        |         (N)          |                             |                                                                                       |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome        | Texto Curto (String) |                      |                             |                                                                                       |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Curto (String) |                      |                             |                                                                                       | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
