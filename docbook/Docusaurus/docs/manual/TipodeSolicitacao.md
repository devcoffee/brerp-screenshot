---
title: "Tipo de Solicitação"
id: TipodeSolicitacao
---
<div id="d243478e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Solicitação -
    R\_RequestType](#d243478e22)</span>
  - <span class="section">[2. Tabela: Notificação de Atualização -
    R\_RequestTypeUpdates](#d243478e385)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Tipos de
Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span>Os "Tipos de
Solicitação" são usados para processar e categorizar as solicitações.
As opções são Consulta de Conta, Emissão de Garantia, etc.

<span class="emphasis"> *Criado em:* </span>2002-10-01 22:58:52.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d243478e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Solicitação - R\_RequestType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_RequestType_data)

<span class="emphasis">*Descrição:*</span> Tipo de Solicitação (ex.
Consulta, Reclamação, ..)

<span class="emphasis">*Comentário/Ajuda:* </span> Os "Tipos de
Solicitação" são usados para processar e categorizar as solicitações.
As opções são Consulta de Conta, Emissão de Garantia, etc.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d243478e39" class="table">

<div class="table-title">

Table 1.1. Request Type
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |                        Valores (Padrão)                        |        Chave restritiva        |                Regra de validação                |                                           Descrição                                            |                                                                                               Comentário/Ajuda                                                                                                |
| :------------------------------: | :------------------: | :------------------------------------------------------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Tipo de Solicitação        |          ID          |                                                                |                                |                                                  |                         Type of request (e.g. Inquiry, Complaint, ..)                          |                                              Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.                                               |
|             Indexed              |       Sim-Não        |                                                                |                                |                                                  |                       Index the document for the internal search engine                        |                                               For cross document search, the document can be indexed for faster search (Container, Document Type, Request Type)                                               |
|             Empresa              |    Tabela Direta     |                      (@\#AD\_Client\_ID@)                      |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |                               (semelhante ao primeiro relatório)                               |                                                                                              (ver o mesmo acima)                                                                                              |
|           Organização            |    Tabela Direta     |                       (@\#AD\_Org\_ID@)                        |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                               (semelhante ao primeiro relatório)                               |                                                                                              (ver o mesmo acima)                                                                                              |
|               Nome               | Texto Curto (String) |                                                                |                                |                                                  |                             Alphanumeric identifier of the entity                              |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|            Descrição             | Texto Curto (String) |                                                                |                                |                                                  |                            Optional short description of the record                            |                                                                                  A description is limited to 255 characters.                                                                                  |
|              Ativo               |       Sim-Não        |                              (Y)                               |                                |                                                  |                               (semelhante ao primeiro relatório)                               |                                                                                              (ver o mesmo acima)                                                                                              |
|    Remetente (Saída de Email)    |       Procurar       |                                                                |      ADUser\_RRequestType      |                                                  |                 User within the system - Internal or Business Partner Contact                  |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|         Status Category          |    Tabela Direta     |                                                                | rstatuscategory\_rrequesttype  |                                                  |                                    Request Status Category                                     |                                                    Category of Request Status enables to maintain different set of Status for different Request Categories                                                    |
|        Template de Email         |    Tabela Direta     |                                                                | COFTemplateEmail\_RRequestType |                                                  |                                Primary Key : Template de Email                                 |                                                                                        Primary Key : Template de Email                                                                                        |
|              Padrão              |       Sim-Não        |                              (N)                               |                                |                                                  |                                         Default value                                          |                                                                The Default Checkbox indicates if this record will be used as a default value.                                                                 |
|           Auto-Serviço           |       Sim-Não        |                              (Y)                               |                                |                                                  |           This is a Self-Service entry or this entry can be changed via Self-Service           | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
|         Email ao Vencer          |       Sim-Não        |                                                                |                                |                                                  |                              Send EMail when Request becomes due                               |                                                                                      Send EMail when Request becomes due                                                                                      |
| Tolerância da Data do Vencimento |       Inteiro        |                              (7)                               |                                |                                                  | Tolerance in days between the Date Next Action and the date the request is regarded as overdue |                                           When the Date Next Action is passed, the Request becomes Due. After the Due Date Tolerance, the Request becomes Overdue.                                            |
|         Email ao Atrasar         |       Sim-Não        |                                                                |                                |                                                  |                            Send EMail when Request becomes overdue                             |                                                                                    Send EMail when Request becomes overdue                                                                                    |
|     Prazo de Vencimento Auto     |       Inteiro        |                              (0)                               |                                |                                                  |                                    Automatic Due Date Days                                     |                                     If a due date is not defined and the Auto Due Days ins greater then zero, a due date in the number of days is automatically created.                                      |
|     Faturado (Nota Emitida)      |       Sim-Não        |                              (N)                               |                                |                                                  |                                       Is this invoiced?                                        |                                                                                       If selected, invoices are created                                                                                       |
|        Confidencialidade         |        Lista         | Informação Pública Confidencial Interno Informação Privada (C) |                                |                                                  |                                    Type of Confidentiality                                     |                                                                                                                                                                                                               |
|       Inform. Confidencial       |       Sim-Não        |                              (N)                               |                                |                                                  |                               Can enter confidential information                               |                                                           When entering/updating Requests over the web, the user can mark his info as confidential                                                            |
|  Criar Solicitação de Alteração  |       Sim-Não        |                                                                |                                |                                                  |                     Automatically create BOM (Engineering) Change Request                      |                                         Create automatically a Product Bill of Material (Engineering) Change Request when the Request Group references a Product BOM                                          |
|         Cor do Cabeçalho         | Texto Curto (String) |                                                                |                                |                                                  |                                Header color of calendar dashlet                                |                                                                                                                                                                                                               |
|         Cor do Conteúdo          | Texto Curto (String) |                                                                |                                |                                                  |                               Content color of calendar dashlet                                |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d243478e385" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Notificação de Atualização - R\_RequestTypeUpdates

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_RequestTypeUpdates_data)

<span class="emphasis">*Descrição:*</span> Lista os Recipientes que
devem receber Atualizações de Solicitações

<span class="emphasis">*Coluna linkada:* </span> Request Type

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d243478e402" class="table">

<div class="table-title">

Table 1.2. Update Notification
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :-----------------: | :-----------: | :----------------: | :-------------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa       | Tabela Direta | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|     Organização     | Tabela Direta |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
| Tipo de Solicitação | Tabela Direta |                    |  rrequesttype\_rrtupdates   |                                                  |               Type of request (e.g. Inquiry, Complaint, ..)                |                                              Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.                                               |
|   Usuário/Contato   |   Procurar    |                    | aduser\_rrequesttypeupdates |                                                  |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|        Ativo        |    Sim-Não    |        (Y)         |                             |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|    Auto-Serviço     |    Sim-Não    |                    |                             |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |

</div>

</div>

  

</div>
