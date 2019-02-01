---
title: "Segurança de Serviços Web"
id: SegurancadeServicosWeb
---
<div id="d210343e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Segurança de Serviços Web

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Web Service Type -
    WS\_WebServiceType](#d210343e23)</span>
  - <span class="section">[2. Tabela: Parâmetros de Serviço Web -
    WS\_WebService\_Para](#d210343e231)</span>
  - <span class="section">[3. Tabela: Entrada de Serviço Web -
    WS\_WebServiceFieldInput](#d210343e405)</span>
  - <span class="section">[4. Tabela: Resultado de Serviço Web -
    WS\_WebServiceFieldOutput](#d210343e625)</span>
  - <span class="section">[5. Tabela: Acesso de Serviço Web -
    WS\_WebServiceTypeAccess](#d210343e771)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2009-01-30 17:57:08.0

<span class="emphasis">*Atualizado em:* </span>2009-01-30 17:57:08.0

![](/img/manual/SegurancadeServicosWeb.png)

<div id="d210343e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Web Service Type - WS\_WebServiceType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebServiceType_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d210343e32" class="table">

<div class="table-title">

Table 1.1. Web Service Type
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------------: | :-------------------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Serviço Web   |                ID                 |                      |                                 |                                                  |                                          |                                                                                                                                              |
|        Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização       |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Chave de Busca     |       Texto Curto (String)        |                      |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Nome          |       Texto Curto (String)        |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Serviço Web       |           Tabela Direta           |                      | wswebservice\_wswebservicetype  |                                                  |                                          |                                                                                                                                              |
| Método de Serviço Web  |           Tabela Direta           |                      | wswebservicemethod\_wswebservic |     WS\_WebService\_ID=@WS\_WebService\_ID@      |                                          |                                                                                                                                              |
|         Tabela         |           Tabela Direta           |                      |    adtable\_wswebservicetype    |                                                  |        Database Table information        |                                     The Database Table provides the information of the table definition                                      |
|       Descrição        |       Texto Curto (String)        |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Comentário/Ajuda    | Texto Médio (até 2000 caracteres) |                      |                                 |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|         Ativo          |              Sim-Não              |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| WS\_WebServiceType\_UU |       Texto Curto (String)        |                      |                                 |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d210343e231" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parâmetros de Serviço Web - WS\_WebService\_Para

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebService_Para_data)

<span class="emphasis">*Coluna linkada:* </span> Web Service Type

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d210343e244" class="table">

<div class="table-title">

Table 1.2. Web Service Parameters
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                         Regra de validação                         |             Descrição              |  Comentário/Ajuda   |
| :-----------------------: | :------------------: | :----------------: | :-----------------------------: | :----------------------------------------------------------------: | :--------------------------------: | :-----------------: |
| Parâmetros de Serviço Web |          ID          |                    |                                 |                                                                    |                                    |                     |
|          Empresa          |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |                 AD\_Client.AD\_Client\_ID \< \> 0                  | (semelhante ao primeiro relatório) | (ver o mesmo acima) |
|        Organização        |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 |          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)          | (semelhante ao primeiro relatório) | (ver o mesmo acima) |
|    Tipo de Serviço Web    |    Tabela Direta     |                    | wswebservicetype\_wswebservicep |                                                                    |                                    |                     |
|     Nome do Parâmetro     | Texto Curto (String) |                    |                                 |                                                                    |                                    |                     |
|     Tipo de Parâmetro     |        Lista         |   Constant Free    |                                 |                                                                    |                                    |                     |
|      Valor Constante      | Texto Curto (String) |                    |                                 | <span class="emphasis">*ReadOnly Logic*</span>: @ParameterType@\!C |           Constant value           |                     |
|           Ativo           |       Sim-Não        |        (Y)         |                                 |                                                                    | (semelhante ao primeiro relatório) | (ver o mesmo acima) |
| WS\_WebService\_Para\_UU  | Texto Curto (String) |                    |                                 |                                                                    |                                    |                     |

</div>

</div>

  

<div id="d210343e405" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Entrada de Serviço Web - WS\_WebServiceFieldInput

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebServiceFieldInput_data)

<span class="emphasis">*Coluna linkada:* </span> Web Service Type

<span class="emphasis">*Lógica de visualização:*</span>
@AD\_Table\_ID@\> 0

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d210343e422" class="table">

<div class="table-title">

Table 1.3. Web Service Field Input
Fields

</div>

<div class="table-contents">

|          Nome do campo          |            Referência             |     Valores (Padrão)     |        Chave restritiva         |                                     Regra de validação                                      |                     Descrição                      |                                                       Comentário/Ajuda                                                       |
| :-----------------------------: | :-------------------------------: | :----------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------: | :------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
| Campo de Entrada de Serviço Web |                ID                 |                          |                                 |                                                                                             |                                                    |                                                                                                                              |
|             Empresa             |           Tabela Direta           |    (@AD\_Client\_ID@)    |                                 |                              AD\_Client.AD\_Client\_ID \< \> 0                              |         (semelhante ao primeiro relatório)         |                                                     (ver o mesmo acima)                                                      |
|           Organização           |           Tabela Direta           |     (@AD\_Org\_ID@)      |                                 |                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                       |         (semelhante ao primeiro relatório)         |                                                     (ver o mesmo acima)                                                      |
|       Tipo de Serviço Web       |           Tabela Direta           |                          | wswebservicetype\_wswebservicfi |                                                                                             |                                                    |                                                                                                                              |
|             Coluna              |           Tabela Direta           |                          | adcolumn\_wswebservicefieldinpu |                          AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@                           |                Column in the table                 |                                           Link to the database column of the table                                           |
|        Nome da Coluna BD        |       Texto Curto (String)        |                          |                                 |                                                                                             |         Name of the column in the database         |                    The Column Name indicates the name of a column on a table as defined in the database.                     |
|           Referência            |              Tabela               | AD\_Reference Data Types | adreference\_wswebservicefieldi |                                                                                             |          System Reference and Validation           |                               The Reference could be a display type, list or table validation.                               |
|       Chave de Referência       |              Tabela               |   AD\_Reference Values   | adreferencevalue\_wswebservicef | AD\_Reference.ValidationType=CASE WHEN @AD\_Reference\_ID@ IN (17,28) THEN 'L' ELSE 'T' END | Required to specify, if data type is Table or List | The Reference Value indicates where the reference values are stored. It must be specified if the data type is Table or List. |
|              Ativo              |              Sim-Não              |           (Y)            |                                 |                                                                                             |         (semelhante ao primeiro relatório)         |                                                     (ver o mesmo acima)                                                      |
|          Identificador          |              Sim-Não              |           (N)            |                                 |                                                                                             |    This column is part of the record identifier    |             The Identifier checkbox indicates that this column is part of the identifier or key for this table.              |
|       Permitir Valor Nulo       |              Sim-Não              |           (N)            |                                 |                                                                                             |   Should allow null value for identifiere field    |                                                                                                                              |
|      Identificador Lógico       | Texto Médio (até 2000 caracteres) |                          |                                 |                                                                                             |                                                    |                                                                                                                              |

</div>

</div>

  

<div id="d210343e625" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Resultado de Serviço Web - WS\_WebServiceFieldOutput

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebServiceFieldOutput_data)

<span class="emphasis">*Coluna linkada:* </span> Web Service Type

<span class="emphasis">*Lógica de visualização:*</span>
@AD\_Table\_ID@\> 0

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d210343e642" class="table">

<div class="table-title">

Table 1.4. Web Service Field Output
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |             Descrição              |             Comentário/Ajuda             |
| :---------------------------: | :------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :--------------------------------------: |
|  Campo de Saída Serviço Web   |          ID          |                    |                                 |                                                  |                                    |                                          |
|            Empresa            |    Tabela Direta     | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |           (ver o mesmo acima)            |
|          Organização          |    Tabela Direta     |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |           (ver o mesmo acima)            |
|      Tipo de Serviço Web      |    Tabela Direta     |                    | wswebservicetype\_wswebservicfo |                                                  |                                    |                                          |
|            Coluna             |    Tabela Direta     |                    | adcolumn\_wswebservicefieldoutp |     AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@     |        Column in the table         | Link to the database column of the table |
|             Ativo             |       Sim-Não        |        (Y)         |                                 |                                                  | (semelhante ao primeiro relatório) |           (ver o mesmo acima)            |
| WS\_WebServiceFieldOutput\_UU | Texto Curto (String) |                    |                                 |                                                  |                                    |                                          |

</div>

</div>

  

<div id="d210343e771" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Acesso de Serviço Web - WS\_WebServiceTypeAccess

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/WS_WebServiceTypeAccess_data)

<span class="emphasis">*Coluna linkada:* </span> Web Service Type

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d210343e784" class="table">

<div class="table-title">

Table 1.5. Web Service Access
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :-----------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|  Escrita e Leitura  |    Sim-Não    |         (Y)          |                                 |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |
|       Empresa       | Tabela Direta | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|     Organização     | Tabela Direta |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Tipo de Serviço Web | Tabela Direta |                      | wswebservicetype\_wswebservicet |                                                  |                                    |                                                                                           |
|       Perfil        | Tabela Direta |                      | adrole\_wswebservicetypeaccess  |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|        Ativo        |    Sim-Não    |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |

</div>

</div>

  

</div>
