---
title: "Empresa"
id: Empresa
---
<div id="d84237e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Empresa

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Empresa -
    AD\_Client](#d84237e23)</span>
  - <span class="section">[2. Tabela: Informações da Empresa -
    AD\_ClientInfo](#d84237e570)</span>
  - <span class="section">[3. Tabela: Compartilhamento de Empresa -
    AD\_ClientShare](#d84237e1070)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Empresas /
Locatários

<span class="emphasis">*Comentário/Ajuda:* </span>A Empresa é o maior
nível de uma entidade de negócios independente. Cada Empresa terá uma
ou mais Organizações reportando-se a ela. Cada Empresa define os
parâmetros contábeis (Esquema Contábil, definição da Árvore, UDMs não
monetárias). Para criar novas Empresas, rode a Configuração Inicial de
Empresas com o Papel de Administrador de Sistema. Não crie uma nova
empresa nesta janela, mas use "Configuração Inicial de Empresas" para
configurar a segurança e as regras de acesso necessárias. Se você criar
uma nova empresa aqui, você não poderá vê-la e a também a
infra-estrutura essencial da empresa não será configurada.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Empresa.png)

<div id="d84237e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Empresa - AD\_Client

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Client_data)

<span class="emphasis">*Descrição:*</span> Definição de
Empresa/Locatário

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Definição de
Empresa" define uma empresa exclusiva. Não crie uma nova empresa nesta
janela, mas use "Configuração Inicial de Empresas" (No papel de
Administrador de Sistema) para configurar a segurança e as regras de
acesso necessárias. Se você criar uma nova empresa aqui, você não poderá
vê-la e a também a infra-estrutura essencial da empresa não será
configurada.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d84237e40" class="table">

<div class="table-title">

Table 1.1. Client
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |                             Valores (Padrão)                             |        Chave restritiva         |                Regra de validação                |                                               Descrição                                                |                                                                                                                             Comentário/Ajuda                                                                                                                             |
| :------------------------------: | :------------------: | :----------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :----------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Empresa              |    Tabela Direta     |                           (@\#AD\_Client\_ID@)                           |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |                                   (semelhante ao primeiro relatório)                                   |                                                                                                                           (ver o mesmo acima)                                                                                                                            |
|           Organização            |    Tabela Direta     |                            (@\#AD\_Org\_ID@)                             |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                   (semelhante ao primeiro relatório)                                   |                                                                                                                           (ver o mesmo acima)                                                                                                                            |
|       Unix Attachment Path       | Texto Curto (String) |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|    Caminho Anexo das Janelas     | Texto Curto (String) |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
| Store Attachments On File System |       Sim-Não        |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|       Custo Imediatamente        |       Sim-Não        |                                   (N)                                    |                                 |                                                  |                                  Update Costs immediately for testing                                  |              If selected, costs are updated immediately when a Cost Detail record is created (by matching or shipping). Otherwise the costs are updated by batch or when the costs are needed for posting. You should select this only if you are testing,               |
|       Lançar Imediatamente       |       Sim-Não        |                                   (N)                                    |                                 |                                                  |                        Post the accounting immediately for testing (Deprecated)                        | If selected, the accounting consequences are immediately generated when completing a document. Otherwise the document is posted by a batch process. You should select this only if you are testing. Deprecated column - use instead the functionality Client Accounting. |
|     Diretório de Documentos      | Texto Curto (String) |                                                                          |                                 |                                                  |                          Directory for documents from the application server                           |                                                          Directory to store documents by the application server. The path/directory is accessed by the application server and may not be accessible to clients.                                                          |
|          Chave de Busca          | Texto Curto (String) |                                                                          |                                 |                                                  |                                   (semelhante ao primeiro relatório)                                   |                                                                                                                           (ver o mesmo acima)                                                                                                                            |
|               Nome               | Texto Curto (String) |                                                                          |                                 |                                                  |                                 Alphanumeric identifier of the entity                                  |                                                               The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                               |
|            Descrição             | Texto Curto (String) |                                                                          |                                 |                                                  |                                Optional short description of the record                                |                                                                                                               A description is limited to 255 characters.                                                                                                                |
|              Ativo               |       Sim-Não        |                                   (Y)                                    |                                 |                                                  |                                   (semelhante ao primeiro relatório)                                   |                                                                                                                           (ver o mesmo acima)                                                                                                                            |
|         Use Funções Beta         |       Sim-Não        |                                   (Y)                                    |                                 |                                                  |                                  Enable the use of Beta Functionality                                  |                                                       The exact scope of Beta Functionality is listed in the release note. It is usually not recommended to enable Beta functionality in production environments.                                                        |
|              Idioma              |        Tabela        |                           AD\_Language System                            |        adlangu\_adclient        |                                                  |                                        Language for this entity                                        |                                                                                                  The Language identifies the language to use for display and formatting                                                                                                  |
|     Documentos Multi-Idiomas     |       Sim-Não        |                                                                          |                                 |                                                  |                                      Documents are Multi Lingual                                       |                            If selected, you enable multi lingual documents and need to maintain translations for entities used in documents (examples: Products, Payment Terms, ...). Please note, that the base language is always English.                             |
|          Auto Arquivar           |        Lista         | Todos (Relatórios, Documentos) Documentos Documentos Externos Nenhum (N) |                                 |                                                  |                           Enable and level of automatic Archive of documents                           |                                                            iDempiere allows to automatically create archives of Documents (e.g. Invoices) or Reports. You view the archived material with the Archive Viewer                                                             |
|      Política de Materiais       |        Lista         |                              PePs UePs (F)                               |                                 |                                                  |                                        Material Movement Policy                                        |                  The Material Movement Policy determines how the stock is flowing (FiFo or LiFo) if a specific Product Instance was not selected. The policy can not contradict the costing method (e.g. FiFo movement policy and LiFo costing method).                  |
|        Servidor de Email         | Texto Curto (String) |                                                                          |                                 |                                                  |                               Hostname of Mail Server for SMTP and IMAP                                |                                                                           The host name of the Mail Server for this client with SMTP services to send mail, and IMAP to process incoming mail.                                                                           |
|        Autenticação SMTP         |       Sim-Não        |                                   (N)                                    |                                 |                                                  |                                Your mail server requires Authentication                                |                  Some email servers require authentication before sending emails. If yes, users are required to define their email user name and password. If authentication is required and no user name and password is required, delivery will fail.                  |
|            Porta SMTP            |       Inteiro        |                                                                          |                                 |                                                  |                                            SMTP Port Number                                            |                                                                                                                                                                                                                                                                          |
|           SMTP SSL/TLS           |       Sim-Não        |                                   (N)                                    |                                 |                                                  |                                          Use SSL/TLS for SMTP                                          |                                                                                                                                                                                                                                                                          |
|              E-mail              | Texto Curto (String) |                                                                          |                                 |                                                  | EMail address to send automated mails from or receive mails for automated processing (fully qualified) |       EMails for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. The address must be filly qualified (e.g. joe.smith@company.com) and should be a valid address.       |
|       Pasta de Solicitação       | Texto Curto (String) |                                                                          |                                 |                                                  |                    EMail folder to process incoming emails; if empty INBOX is used                     |                                                                 Email folder used to read emails to process as requests, If left empty the default mailbox (INBOX) will be used. Requires IMAP services.                                                                 |
|      Usuário da Solicitação      | Texto Curto (String) |                                                                          |                                 |                                                  |                                   User Name (ID) of the email owner                                    | EMail user name for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. Required, if your mail server requires authentification as well as for processing incoming mails.  |
| Senha do Usuário de Solicitação  | Texto Curto (String) |                                                                          |                                 |                                                  |                           Password of the user name (ID) for mail processing                           |                                                                                                                                                                                                                                                                          |
|        Servidor de email         |       Sim-Não        |                                                                          |                                 |                                                  |                                         Send EMail from Server                                         |                             When selected, mail is sent from the server rather then the client. This decreases availability. You would select this when you do not want to enable email relay for the client addresses in your mail server.                              |
|          Teste de email          |        Botão         |                                                                          |                                 |                                                  |                                               Test EMail                                               |                                                                                                                                                                                                                                                                          |
|         Model Validator          | Texto Curto (String) |                                                                          |                                 |                                                  |                          List of data model validation classes separated by ;                          |                        List of classes implementing the interface org.compiere.model.ModelValidator, separated by semicolon. The class is called for the client and allows to validate documents in the prepare stage and monitor model changes.                         |
|   Store Archive On File System   |       Sim-Não        |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|           Utiliza SaaS           |       Sim-Não        |                                   (N)                                    |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|     Estratégia de Replicação     |    Tabela Direta     |                                                                          | adreplicationstrategy\_adclient |                                                  |                                       Data Replication Strategy                                        |                                                                                               The Data Replication Strategy determines what and how tables are replicated                                                                                                |
|  Caminho de Arquivo das Janelas  | Texto Curto (String) |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|        Unix Archive Path         | Texto Curto (String) |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|        Políticas de Senha        |    Tabela Direta     |                                                                          |    adpasswordrule\_adclient     |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |
|          AD\_Client\_UU          | Texto Curto (String) |                                                                          |                                 |                                                  |                                                                                                        |                                                                                                                                                                                                                                                                          |

</div>

</div>

  

<div id="d84237e570" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Informações da Empresa - AD\_ClientInfo

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ClientInfo_data)

<span class="emphasis">*Descrição:*</span> Informações da Empresa

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Informações da
Empresa" define os detalhes de cada empresa. As Regras Contábeis e
padrões de alto nível são definidos aqui. O Calendário é usado para
determinar se um período está aberto ou fechado.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d84237e587" class="table">

<div class="table-title">

Table 1.2. Client Info
Fields

</div>

<div class="table-contents">

|                    Nome do campo                     |  Referência   |    Valores (Padrão)     |        Chave restritiva         |                        Regra de validação                         |                                Descrição                                |                                                                                                             Comentário/Ajuda                                                                                                             |
| :--------------------------------------------------: | :-----------: | :---------------------: | :-----------------------------: | :---------------------------------------------------------------: | :---------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                     Organização                      | Tabela Direta |     (@AD\_Org\_ID@)     |                                 |         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)          |                   (semelhante ao primeiro relatório)                    |                                                                                                           (ver o mesmo acima)                                                                                                            |
|                        Ativo                         |    Sim-Não    |           (Y)           |                                 |                                                                   |                   (semelhante ao primeiro relatório)                    |                                                                                                           (ver o mesmo acima)                                                                                                            |
|                       Empresa                        | Tabela Direta |   (@AD\_Client\_ID@)    |     adclient\_adclientinfo      |                 AD\_Client.AD\_Client\_ID \< \> 0                 |                   (semelhante ao primeiro relatório)                    |                                                                                                           (ver o mesmo acima)                                                                                                            |
| Descontos calculados a partir dos Valores das Linhas |    Sim-Não    |                         |                                 | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |     Payment Discount calculation does not include Taxes and Charges     | If the payment discount is calculated from line amounts only, the tax and charge amounts are not included. This is e.g. business practice in the US. If not selected the total invoice amount is used to calculate the payment discount. |
|                      Calendário                      | Tabela Direta |                         |     ccalendar\_adclientinfo     | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                        Accounting Calendar Name                         |       The Calendar uniquely identifies an accounting calendar. Multiple calendars can be used. For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30.       |
|              Esquema Contábil Primário               |    Tabela     |      C\_AcctSchema      |   cacctschema1\_adclientinfo    | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                      Primary rules for accounting                       |                                                                  An Accounting Schema defines the rules used accounting such as costing method, currency and calendar.                                                                   |
|                 UDM para Comprimento                 |    Tabela     |         C\_UOM          | c\_uom\_length\_ad\_clientinfo  | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                   Standard Unit of Measure for Length                   |                                                                  The Standard UOM for Length indicates the UOM to use for products referenced by length in a document.                                                                   |
|                    UOM for Volume                    |    Tabela     |         C\_UOM          | c\_uom\_volume\_ad\_clientinfo  | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                   Standard Unit of Measure for Volume                   |                                                                  The Standard UOM for Volume indicates the UOM to use for products referenced by volume in a document.                                                                   |
|                    UDM para Peso                     |    Tabela     |         C\_UOM          | c\_uom\_weight\_ad\_clientinfo  | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                   Standard Unit of Measure for Weight                   |                                                                  The Standard UOM for Weight indicates the UOM to use for products referenced by weight in a document.                                                                   |
|                 Modelo de P.Negócios                 |   Procurar    |    C\_BPartner (Trx)    | cbpartnercashtrx\_adclientinfo  | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |   Business Partner used for creating new Business Partners on the fly   |                  When creating a new Business Partner from the Business Partner Search Field (right-click: Create), the selected business partner is used as a template, e.g. to define price list, payment terms, etc.                  |
|                  Produto para Frete                  |   Procurar    | M\_Product (no summary) |  mproductfreight\_adclientinfo  | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                                                                         |                                                                                                                                                                                                                                          |
|                     UOM for Time                     |    Tabela     |         C\_UOM          |  c\_uom\_time\_ad\_clientinfo   | <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Client\_ID=0 |                    Standard Unit of Measure for Time                    |                                                                    The Standard UOM for Time indicates the UOM to use for products referenced by time in a document.                                                                     |
|                   Despesa (Frete)                    |    Tabela     |        C\_Charge        |  cchargefreight\_adclientinfo   |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|              Provedor de Armazenamento               | Tabela Direta |                         | adstorageprovider\_adclientinfo |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|                   Arquivo da Loja                    |    Tabela     | AD\_StorageProvider\_ID |  storagearchive\_adclientinfo   |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|                   Days to keep Log                   |    Inteiro    |                         |                                 |                                                                   |                 Number of days to keep the log entries                  |                                                                                                     Older Log entries may be deleted                                                                                                     |
|                Árvore da Organização                 |    Tabela     |        AD\_Tree         |     adtreeorg\_adclientinfo     |                                                                   | Trees are used for (financial) reporting and security access (via role) |                                                                                  Trees are used for (finanial) reporting and security access (via role)                                                                                  |
|                    Árvore de Menu                    |    Tabela     |        AD\_Tree         |    adtreemenu\_adclientinfo     |                                                                   |                            Tree of the menu                             |                                                                                                             Menu access tree                                                                                                             |
|                 Árvore Parc.Negócios                 |    Tabela     |        AD\_Tree         |  adtreebpartner\_adclientinfo   |                                                                   |                Trees are used for (financial) reporting                 |                                                                                                 Trees are used for (finanial) reporting                                                                                                  |
|                  Árvore de Produto                   |    Tabela     |        AD\_Tree         |   adtreeproduct\_adclientinfo   |                                                                   |                Trees are used for (financial) reporting                 |                                                                                                 Trees are used for (finanial) reporting                                                                                                  |
|                  Árvore de Projeto                   |    Tabela     |        AD\_Tree         |   adtreeproject\_adclientinfo   |                                                                   |                Trees are used for (financial) reporting                 |                                                                                                 Trees are used for (finanial) reporting                                                                                                  |
|              Árvore de Região de Vendas              |    Tabela     |        AD\_Tree         |  adtreesalesreg\_adclientinfo   |                                                                   |                Trees are used for (financial) reporting                 |                                                                                                 Trees are used for (finanial) reporting                                                                                                  |
|                  Árvore de Campanha                  |    Tabela     |        AD\_Tree         |  adtreecampaign\_adclientinfo   |                                                                   |                Trees are used for (financial) reporting                 |                                                                                                 Trees are used for (finanial) reporting                                                                                                  |
|                 Árvore de Atividade                  |    Tabela     |        AD\_Tree         |  adtreeactivity\_adclientinfo   |                                                                   |                Trees are used for (financial) reporting                 |                                                                                                 Trees are used for (finanial) reporting                                                                                                  |
|                         Logo                         |    Imagem     |                         |       logo\_adclientinfo        |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|                 Logo para Relatórios                 |    Imagem     |                         |    logoreport\_adclientinfo     |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|                    Logo para Web                     |    Imagem     |                         |      logoweb\_adclientinfo      |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|      Solicitar confirmação ao Fechar documentos      |    Sim-Não    |           (Y)           |                                 |                                                                   |                                                                         |                                                                                                                                                                                                                                          |
|           Solicitar confirmação ao Anular            |    Sim-Não    |           (N)           |                                 |                                                                   |                                                                         |                                                                                                                                                                                                                                          |

</div>

</div>

  

<div id="d84237e1070" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Compartilhamento de Empresa - AD\_ClientShare

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Force (not) sharing of
client/org entities

<span class="emphasis">*Comentário/Ajuda:* </span> Business Partner can
be either defined on Client level (shared) or on Org level (not shared).
You can define here of Products are always shared (i.e. always created
under Organization "\*") or if they are not shared (i.e. you cannot
enter them with Organization "\*"). The creation of "Client and Org"
shared records is the default and is ignored.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d84237e1085" class="table">

<div class="table-title">

Table 1.3. Client Share
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |                  Valores (Padrão)                  |    Chave restritiva     |                         Regra de validação                          |                 Descrição                  |                                                                                                                                                                                           Comentário/Ajuda                                                                                                                                                                                            |
| :-------------------------: | :------------------: | :------------------------------------------------: | :---------------------: | :-----------------------------------------------------------------: | :----------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Compartilhamento de Empresa |          ID          |                                                    |                         |                                                                     | Force (not) sharing of client/org entities | For entities with data access level of Client+Organization either force to share the entries or not. Example: Product and Business Partner can be either defined on Client level (shared) or on Org level (not shared). You can define here of Products are always shared (i.e. always created under Organization "\*") or if they are not shared (i.e. you cannot enter them with Organization "\*") |
|           Empresa           |    Tabela Direta     |                                                    | adclient\_adclientshare |                  AD\_Client.AD\_Client\_ID \< \> 0                  |     (semelhante ao primeiro relatório)     |                                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                                          |
|         Organização         |    Tabela Direta     |                                                    |  adorg\_adclientshare   |                                                                     |     (semelhante ao primeiro relatório)     |                                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                                          |
|            Nome             | Texto Curto (String) |                                                    |                         |                                                                     |   Alphanumeric identifier of the entity    |                                                                                                                             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                              |
|          Descrição          | Texto Curto (String) |                                                    |                         |                                                                     |  Optional short description of the record  |                                                                                                                                                                              A description is limited to 255 characters.                                                                                                                                                                              |
|            Ativo            |       Sim-Não        |                                                    |                         |                                                                     |     (semelhante ao primeiro relatório)     |                                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                                          |
|           Tabela            |    Tabela Direta     |                                                    | adtable\_adclientshare  | AD\_Table.AccessLevel IN ('2','3','6','7') AND AD\_Table.IsView='N' |         Database Table information         |                                                                                                                                                                  The Database Table provides the information of the table definition                                                                                                                                                                  |
|  Tipo de Compartilhamento   |        Lista         | Client (all shared) Org (not shared) Client or Org |                         |                                                                     |              Type of sharing               |                                                                                                                                                                         Defines if a table is shared within a client or not.                                                                                                                                                                          |
|     AD\_ClientShare\_UU     | Texto Curto (String) |                                                    |                         |                                                                     |                                            |                                                                                                                                                                                                                                                                                                                                                                                                       |

</div>

</div>

  

</div>
