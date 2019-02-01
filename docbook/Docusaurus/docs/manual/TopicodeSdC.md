---
title: "Tópico de SdC"
id: TopicodeSdC
---
<div id="d244889e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tópico de SdC

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tópico -
    C\_RfQ\_Topic](#d244889e22)</span>
  - <span class="section">[2. Tabela: Assinante -
    C\_RfQ\_TopicSubscriber](#d244889e197)</span>
  - <span class="section">[3. Tabela: Restrição -
    C\_RfQ\_TopicSubscriberOnly](#d244889e399)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Tópicos de
Requisição de Cotação e Assinantes

<span class="emphasis">*Comentário/Ajuda:* </span>Um Tópico de
Solicitação de Cotação permite a você gerenciar uma lista de
assinantes de potenciais fornecedores para responder a SdCs

<span class="emphasis"> *Criado em:* </span>2004-02-19 13:45:55.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d244889e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tópico - C\_RfQ\_Topic

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_RfQ_Topic_data)

<span class="emphasis">*Descrição:*</span> Tópico de Solicitação de
Cotação

<span class="emphasis">*Comentário/Ajuda:* </span> Um Tópico de
Solicitação de Cotação permite a você gerenciar uma lista de assinantes
de potenciais fornecedores para responder a SdCs

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d244889e39" class="table">

<div class="table-title">

Table 1.1. Topic
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   |     Chave restritiva     |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :------------------: | :------------------: | :------------------: | :----------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Tópico de SdC     |          ID          |                      |                          |                                                  |                      Topic for Request for Quotations                      |                                                A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs                                                 |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|         Nome         | Texto Curto (String) |                      |                          |                                                  |                   Alphanumeric identifier of the entity                    |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|      Descrição       | Texto Curto (String) |                      |                          |                                                  |                  Optional short description of the record                  |                                                                                  A description is limited to 255 characters.                                                                                  |
|        Ativo         |       Sim-Não        |         (Y)          |                          |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|     Auto-Serviço     |       Sim-Não        |                      |                          |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
| Formato de Impressão |    Tabela Direta     |         (0)          | adprintformat\_arfqtopic |                                                  |                             Data Print Format                              |                                                                          The print format determines how data is rendered for print.                                                                          |
|  C\_RfQ\_Topic\_UU   | Texto Curto (String) |                      |                          |                                                  |                                                                            |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d244889e197" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Assinante - C\_RfQ\_TopicSubscriber

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_RfQ_TopicSubscriber_data)

<span class="emphasis">*Descrição:*</span> Assinante de Tópico de
Solicitação de Cotação

<span class="emphasis">*Comentário/Ajuda:* </span> Assinar para convidar
para responder a SdCs

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d244889e214" class="table">

<div class="table-title">

Table 1.2. Subscriber
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                   Regra de validação                    |                           Descrição                           |                                                Comentário/Ajuda                                                 |
| :-------------------------: | :------------------: | :----------------: | :-------------------------: | :-----------------------------------------------------: | :-----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|      Assinante de SdC       |          ID          |                    |                             |                                                         |            Request for Quotation Topic Subscriber             |                                     Subscriber to invite to respond to RfQs                                     |
|           Empresa           |    Tabela Direta     | (@AD\_Client\_ID@) |                             |            AD\_Client.AD\_Client\_ID \< \> 0            |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|         Organização         |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)     |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|        Tópico de SdC        |    Tabela Direta     |                    |   c\_rfqtopic\_subscriber   |                                                         |               Topic for Request for Quotations                | A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs  |
|    Parceiro de Negócios     |       Procurar       |                    |  cbpartner\_crfqtopicsubr   | C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'  |                 Identifies a Business Partner                 | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|   Localização do Parceiro   |    Tabela Direta     |                    | cbpartnerloc\_crfqtopicsubr | C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@ |  Identifies the (ship to) address for this Business Partner   |                        The Partner address indicates the location of a Business Partner                         |
|       Usuário/Contato       |    Tabela Direta     |                    |   aduser\_arfqtopicsubcr    |       AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@        | User within the system - Internal or Business Partner Contact |  The User identifies a unique user in the system. This could be an internal user or a business partner contact  |
|            Ativo            |       Sim-Não        |        (Y)         |                             |                                                         |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                               |
|     Data da Assinatura      |         Data         |                    |                             |                                                         |             Date the contact actively subscribed              |                                  Date the contact subscribe the interest area                                   |
|     Data da desistência     |         Data         |                    |                             |                                                         |                  Date the contact opted out                   |  If the field has a date, the customer opted out (unsubscribed) and cannot receive mails for the Interest Area  |
| C\_RfQ\_TopicSubscriber\_UU | Texto Curto (String) |                    |                             |                                                         |                                                               |                                                                                                                 |

</div>

</div>

  

<div id="d244889e399" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Restrição - C\_RfQ\_TopicSubscriberOnly

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Inclui Assinante somente para
certos produtos ou categorias de produtos

<span class="emphasis">*Comentário/Ajuda:* </span> Digitar os produtos /
categorias de produtos para os quais o assinante deve ser incluído. Se
nenhum produto / categoria de produtos for digitada, será pedido ao
assinante que responda a todas as linhas em uma SdC

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d244889e414" class="table">

<div class="table-title">

Table 1.3. Restriction
Fields

</div>

<div class="table-contents">

|              Nome do campo              |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                                                                          Regra de validação                                                                          |                             Descrição                              |                                                                                      Comentário/Ajuda                                                                                      |
| :-------------------------------------: | :------------------: | :----------------: | :-------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Restrição de Assinante de Tópico de SdC |          ID          |                    |                             |                                                                                                                                                                      | Include Subscriber only for certain products or product categories | Products and/or Product Categories for which the subscriber should be included. If no product / category is entered, the subscriber is requested to answer requests for all lines in a RfQ |
|                 Empresa                 |    Tabela Direta     | (@AD\_Client\_ID@) |                             |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                 (semelhante ao primeiro relatório)                 |                                                                                    (ver o mesmo acima)                                                                                     |
|               Organização               |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                 (semelhante ao primeiro relatório)                 |                                                                                    (ver o mesmo acima)                                                                                     |
|            Assinante de SdC             |    Tabela Direta     |                    |  crfqtopicsubscriber\_only  |                                                                                                                                                                      |               Request for Quotation Topic Subscriber               |                                                                          Subscriber to invite to respond to RfQs                                                                           |
|                  Ativo                  |       Sim-Não        |        (Y)         |                             |                                                                                                                                                                      |                 (semelhante ao primeiro relatório)                 |                                                                                    (ver o mesmo acima)                                                                                     |
|                 Produto                 |       Procurar       |                    |   mproduct\_crfqtsubonly    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                       Product, Service, Item                       |                                                         Identifies an item which is either purchased or sold in this organization.                                                         |
|          Categoria de Produto           |    Tabela Direta     |        (-1)        | mprodcategory\_crfqtsubonly |                                                                                                                                                                      |                       Category of a Product                        |                                       Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                        |
|                Descrição                | Texto Curto (String) |                    |                             |                                                                                                                                                                      |              Optional short description of the record              |                                                                        A description is limited to 255 characters.                                                                         |
|     C\_RfQ\_TopicSubscriberOnly\_UU     | Texto Curto (String) |                    |                             |                                                                                                                                                                      |                                                                    |                                                                                                                                                                                            |

</div>

</div>

  

</div>
