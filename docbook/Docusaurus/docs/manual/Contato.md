---
title: "Contato"
id: Contato
---
<div id="d36105e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Contato

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Contato -
    AD\_User](#d36105e23)</span>
  - <span class="section">[2. Tabela: Atividade -
    C\_ContactActivity](#d36105e340)</span>

</div>

<span class="emphasis">*Descrição:* </span> Manutenção de Contatos

<span class="emphasis">*Comentário/Ajuda:* </span>The Contact Window
allows you to maintain Contacts who are individuals you deal with.
Contacts may also be internal or external users who can log into the
system and have access to functionality via one or more roles. A contact
can also be a business partner contact.

<span class="emphasis"> *Criado em:* </span>2013-08-25 14:49:13.0

<span class="emphasis">*Atualizado em:* </span>2013-09-12 01:13:21.0

![](/img/manual/Contato.png)

<div id="d36105e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Contato - AD\_User

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_User_data)

<span class="emphasis">*Descrição:*</span> Detalhes do contato

<span class="emphasis">*Claúsula Where:*</span> AD\_User.C\_BPartner\_ID
IS NOT NULL AND 'Y' = (select c\_bpartner.iscustomer from c\_bpartner
where c\_bpartner.c\_bpartner\_id=ad\_user.c\_bpartner\_id)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d36105e40" class="table">

<div class="table-title">

Table 1.1. Contact
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |   Valores (Padrão)   |  Chave restritiva   |                                                                    Regra de validação                                                                     |                           Descrição                           |                                                                                                  Comentário/Ajuda                                                                                                  |
| :---------------------: | :-------------------------------: | :------------------: | :-----------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |  ad\_user\_client   |                                                             AD\_Client.AD\_Client\_ID \< \> 0                                                             |              (semelhante ao primeiro relatório)               |                                                                                                (ver o mesmo acima)                                                                                                 |
|       Organização       |           Tabela Direta           |   (@AD\_Org\_ID@)    |    ad\_user\_org    |                                            (AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ OR AD\_Org.AD\_Org\_ID=0)                                             |              (semelhante ao primeiro relatório)               |                                                                                                (ver o mesmo acima)                                                                                                 |
|          Nome           |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |             Alphanumeric identifier of the entity             |                                    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                    |
|        Descrição        |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |           Optional short description of the record            |                                                                                    A description is limited to 255 characters.                                                                                     |
|       Comentários       | Texto Médio (até 2000 caracteres) |                      |                     |                                                                                                                                                           |              Comments or additional information               |                                                                      The Comments field allows for free form entry of additional information.                                                                      |
|          Ativo          |              Sim-Não              |         (Y)          |                     |                                                                                                                                                           |              (semelhante ao primeiro relatório)               |                                                                                                (ver o mesmo acima)                                                                                                 |
|   Endereço de e-mail    |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |                    Electronic Mail Address                    | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|          Fone           |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |                 Identifies a telephone number                 |                                                                                   The Phone field identifies a telephone number                                                                                    |
|         2º Fone         |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |           Identifies an alternate telephone number.           |                                                                           The 2nd Phone field identifies an alternate telephone number.                                                                            |
|           Fax           |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |                       Facsimile number                        |                                                                    The Fax identifies a facsimile number for this Business Partner or Location                                                                     |
|         Título          |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |              Name this entity is referred to as               |                                                                           The Title indicates the name that an entity is referred to as.                                                                           |
|  Parceiro de Negócios   |             Procurar              |                      |  cbpartner\_aduser  |                C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N' <span class="emphasis">*ReadOnly Logic*</span>: @C\_BPartner\_ID@\!0                |                 Identifies a Business Partner                 |                                                  A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                   |
| Localização do Parceiro |           Tabela Direta           |                      | cbplocation\_aduser |                                                  C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@                                                  |  Identifies the (ship to) address for this Business Partner   |                                                                          The Partner address indicates the location of a Business Partner                                                                          |
|         Posição         |           Tabela Direta           |                      |    cjob\_aduser     | ((C\_Job.IsEmployee=(SELECT IsEmployee FROM C\_BPartner WHERE C\_BPartner\_ID=@C\_BPartner\_ID:0@)) OR (C\_Job.IsEmployee='N' AND @C\_BPartner\_ID:0@=0)) |                         Job Position                          |                                                                                                                                                                                                                    |
|       Aniversário       |               Data                |                      |                     |                                                                                                                                                           |                  Birthday or Anniversary day                  |                                                                                            Birthday or Anniversary day                                                                                             |
|     Último Contato      |               Data                |                      |                     |                                                                                                                                                           |            Date this individual was last contacted            |                                                             The Last Contact indicates the date that this Business Partner Contact was last contacted.                                                             |
|    Último Resultado     |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |                    Result of last contact                     |                                                                          The Last Result identifies the result of the last contact made.                                                                           |
|     Usuário/Contato     |                ID                 |                      |                     |                                                                                                                                                           | User within the system - Internal or Business Partner Contact |                                                   The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                    |
|      AD\_User\_UU       |       Texto Curto (String)        |                      |                     |                                                                                                                                                           |                                                               |                                                                                                                                                                                                                    |

</div>

</div>

  

<div id="d36105e340" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Atividade - C\_ContactActivity

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ContactActivity_data)

<span class="emphasis">*Descrição:*</span> Atividades do Contato

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d36105e357" class="table">

<div class="table-title">

Table 1.2. Activity
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |                Valores (Padrão)                 |        Chave restritiva        |                                                          Regra de validação                                                           |                           Descrição                           |                                                Comentário/Ajuda                                                |
| :---------------------: | :-------------------------------: | :---------------------------------------------: | :----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------: |
|          Ativo          |              Sim-Não              |                       (Y)                       |                                |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                               |
|  Atividade do Contato   |                ID                 |                                                 |                                |                                                                                                                                       |      Events, tasks, communications related to a contact       |                                                                                                                |
|         Empresa         |           Tabela Direta           |              (@\#AD\_Client\_ID@)               |                                |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                               |
|       Organização       |           Tabela Direta           |                (@\#AD\_Org\_ID@)                |                                |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                               |
|     Usuário/Contato     |             Procurar              |                (@AD\_User\_ID@)                 |    aduser\_ccontactactivity    |                                                                                                                                       | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact  |
|    Tipo de Atividade    |               Lista               |          Email Meeting Phone call Task          |                                |                                                                                                                                       |        Type of activity, e.g. task, email, phone call         |                                                                                                                |
|        Descrição        |       Texto Curto (String)        |                                                 |                                |                                                                                                                                       |           Optional short description of the record            |                                  A description is limited to 255 characters.                                   |
| Representante de Vendas |              Tabela               |           AD\_User(@\#SalesRep\_ID@)            |   SalesRep\_CContactActivity   | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) |             Sales Representative or Company Agent             | The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user. |
| Oportunidade de Vendas  |           Tabela Direta           |             (@C\_Opportunity\_ID@)              | copportunity\_ccontactactivity |                                                                                                                                       |                                                               |                                                                                                                |
|       Comentários       | Texto Médio (até 2000 caracteres) |                                                 |                                |                                                                                                                                       |              Comments or additional information               |                    The Comments field allows for free form entry of additional information.                    |
|     Data de Início      |             Data+Hora             | (@SQL=SELECT SYSDATE AS DefaultValue FROM DUAL) |                                |                                                                                                                                       |                First effective day (inclusive)                |                              The Start Date indicates the first or starting date                               |
|       Data Final        |             Data+Hora             |                                                 |                                |                                                                                                                                       |                Last effective date (inclusive)                |                              The End Date indicates the last date in this range.                               |
|        Completo         |              Sim-Não              |                                                 |                                |                                                                                                                                       |                        It is complete                         |                                        Indication that this is complete                                        |
| C\_ContactActivity\_UU  |       Texto Curto (String)        |                                                 |                                |                                                                                                                                       |                                                               |                                                                                                                |

</div>

</div>

  

</div>
