---
title: "Área de Interesse"
id: AreadeInteresse
---
<div id="d7443e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Área de Interesse

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Área de Interesse -
    R\_InterestArea](#d7443e23)</span>
  - <span class="section">[2. Tabela: Subscriptions -
    R\_ContactInterest](#d7443e198)</span>
  - <span class="section">[3. Tabela: LDAP Access -
    AD\_LdapAccess](#d7443e345)</span>

</div>

<span class="emphasis">*Descrição:* </span> Área de Interesse ou Tópico

<span class="emphasis">*Comentário/Ajuda:* </span>Áreas de Interesse
refletem o interesse de um contato em um tópico específico. Áreas de
interesse podem ser utilizadas em Campanhas de Marketing.

<span class="emphasis"> *Criado em:* </span>2002-10-01 23:04:38.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/AreadeInteresse.png)

<div id="d7443e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Área de Interesse - R\_InterestArea

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_InterestArea_data)

<span class="emphasis">*Descrição:*</span> Área de Interesse ou Tópico

<span class="emphasis">*Comentário/Ajuda:* </span> Áreas de Interesse
refletem o interesse de um contato em um tópico específico. Áreas de
interesse podem ser utilizadas em Campanhas de Marketing. Se uma lista
não for "Auto Serviço", ela não é visível para usuários via Internet
(web).

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d7443e40" class="table">

<div class="table-title">

Table 1.1. Interest Area
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Área de Interesse  |          ID          |                      |                  |                                                  |                           Interest Area or Topic                           |                                                 Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.                                                  |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|   Chave de Busca    | Texto Curto (String) |                      |                  |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  |                   Alphanumeric identifier of the entity                    |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|      Descrição      | Texto Curto (String) |                      |                  |                                                  |                  Optional short description of the record                  |                                                                                  A description is limited to 255 characters.                                                                                  |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|    Auto-Serviço     |       Sim-Não        |         (Y)          |                  |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
| R\_InterestArea\_UU | Texto Curto (String) |                      |                  |                                                  |                                                                            |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d7443e198" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Subscriptions - R\_ContactInterest

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_ContactInterest_data)

<span class="emphasis">*Descrição:*</span> User Subscriptions

<span class="emphasis">*Coluna linkada:* </span> Interest Area

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7443e215" class="table">

<div class="table-title">

Table 1.2. Subscriptions
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :-----------------: | :-----------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|       Empresa       | Tabela Direta | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|     Organização     | Tabela Direta |        (0)         |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|  Área de Interesse  | Tabela Direta |                    | rinterestarea\_rcontactinterest |                                                  |                    Interest Area or Topic                     | Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.  |
|   Usuário/Contato   | Tabela Direta |  (@AD\_User\_ID@)  |    aduser\_rcontactinterest     |    AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@    | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|        Ativo        |    Sim-Não    |        (Y)         |                                 |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
| Data da Assinatura  |     Data      |                    |                                 |                                                  |             Date the contact actively subscribed              |                                 Date the contact subscribe the interest area                                  |
| Data da desistência |     Data      |                    |                                 |                                                  |                  Date the contact opted out                   | If the field has a date, the customer opted out (unsubscribed) and cannot receive mails for the Interest Area |

</div>

</div>

  

<div id="d7443e345" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: LDAP Access - AD\_LdapAccess

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> User Access via LDAP

<span class="emphasis">*Coluna linkada:* </span> Interest Area

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d7443e360" class="table">

<div class="table-title">

Table 1.3. LDAP Access
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             | Valores (Padrão) |       Chave restritiva        |        Regra de validação         |                                   Descrição                                   |                                                                                                                        Comentário/Ajuda                                                                                                                         |
| :----------------: | :-------------------------------: | :--------------: | :---------------------------: | :-------------------------------: | :---------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Ldap Access     |                ID                 |                  |                               |                                   |                                Ldap Access Log                                |                                                                                                                         Access via LDAP                                                                                                                         |
|       Ativo        |              Sim-Não              |                  |                               |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|      Empresa       |           Tabela Direta           |                  |                               | AD\_Client.AD\_Client\_ID \< \> 0 |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|    Organização     |           Tabela Direta           |                  |                               |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
| Área de Interesse  |           Tabela Direta           |                  |  rinterestarea\_adldapaccess  |                                   |                            Interest Area or Topic                             |                                                                          Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.                                                                           |
|   Ldap Processor   |           Tabela Direta           |                  | adldapprocessor\_adldapaccess |                                   | LDAP Server to authenticate and authorize external systems based on iDempiere | The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them. There is only one server per iDempiere system. The "o" is the Client key and the optional "ou" is the Interest Area key. |
|  Usuário/Contato   |           Tabela Direta           |                  |     aduser\_adldapaccess      |                                   |         User within the system - Internal or Business Partner Contact         |                                                                          The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                          |
|       Criado       |             Data+Hora             |    (SYSDATE)     |                               |                                   |                         Date this record was created                          |                                                                                               The Created field indicates the date that this record was created.                                                                                                |
|        Erro        |              Sim-Não              |                  |                               |                                   |                      An Error occurred in the execution                       |                                                                                                                                                                                                                                                                 |
|       Resumo       | Texto Médio (até 2000 caracteres) |                  |                               |                                   |                        Textual summary of this request                        |                                                                                               The Summary allows free form text entry of a recap of this request.                                                                                               |
|     Descrição      |       Texto Curto (String)        |                  |                               |                                   |                   Optional short description of the record                    |                                                                                                           A description is limited to 255 characters.                                                                                                           |
| AD\_LdapAccess\_UU |       Texto Curto (String)        |                  |                               |                                   |                                                                               |                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>
