---
title: "Usuário"
id: Usuario
---
<div id="d250637e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Usuário

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Usuário/Contato -
    AD\_User](#d250637e22)</span>
  - <span class="section">[2. Tabela: Funções de Usuários -
    AD\_User\_Roles](#d250637e803)</span>
  - <span class="section">[3. Tabela: Substituto do Usuário -
    AD\_User\_Substitute](#d250637e925)</span>
  - <span class="section">[4. Tabela: Atribuição da Org. -
    C\_OrgAssignment](#d250637e1130)</span>
  - <span class="section">[5. Tabela: Acesso Org -
    AD\_User\_OrgAccess](#d250637e1292)</span>
  - <span class="section">[6. Tabela: Enviar mensagem para usuário -
    AD\_UserMail](#d250637e1415)</span>
  - <span class="section">[7. Tabela: Perguntas -
    AD\_UserQuery](#d250637e1703)</span>
  - <span class="section">[8. Tabela: LDAP Access -
    AD\_LdapAccess](#d250637e1887)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Usuários
do Sistema

<span class="emphasis">*Comentário/Ajuda:* </span>The User Window allows
you to maintain User of the system. Usuários podem se logar no sistema e
obter acesso à funcionalidade através de uma ou mais funções (ou
papéis). A user can also be a business aprtner contact.

<span class="emphasis"> *Criado em:* </span>1999-06-07 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2005-11-22 11:37:02.0

<div id="d250637e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Usuário/Contato - AD\_User

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Usuário

<span class="emphasis">*Comentário/Ajuda:* </span> Usuário dentro do
Sistema - Interno ou Contato de Parceiro de Negócios

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d250637e37" class="table">

<div class="table-title">

Table 1.1. User Contact
Fields

</div>

<div class="table-contents">

|               Nome do campo               |            Referência             |          Valores (Padrão)          |     Chave restritiva     |                                                                    Regra de validação                                                                     |                                    Descrição                                     |                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                              |
| :---------------------------------------: | :-------------------------------: | :--------------------------------: | :----------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Connection Profile             |               Lista               |    LAN Terminal Server VPN WAN     |                          |                                                                                                                                                           |                   How a Java Client connects to the server(s)                    |                                      Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.                                      |
|               Is In Payroll               |              Sim-Não              |                (N)                 |                          |                                                                                                                                                           |          Defined if any User Contact will be used for Calculate Payroll          |                                                                                                                                                                                                                                                                                                                                                                           |
|                   Salt                    |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |             Random data added to improve password hash effectiveness             |                                                                                                                                                                                                                                                                                                                                                                           |
|              Usuário/Contato              |                ID                 |                                    |                          |                                                                                                                                                           |          User within the system - Internal or Business Partner Contact           |                                                                                                                               The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                               |
|              Converter Lead               |               Botão               |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|                  Empresa                  |           Tabela Direta           |        (@\#AD\_Client\_ID@)        |     ad\_user\_client     |                                                             AD\_Client.AD\_Client\_ID \< \> 0                                                             |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|                  Imagem                   |              Imagem               |                                    |     ADImage\_ADUser      |                                                                                                                                                           |                                  Image or Icon                                   |                                                                             Images and Icon can be used to display supported graphic formats (gif, jpg, png). You can either load the image (in the database) or point to a graphic via a URI (i.e. it can point to a resource, http address)                                                                             |
|                Organização                |           Tabela Direta           |          (@AD\_Org\_ID@)           |      ad\_user\_org       |                                            (AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ OR AD\_Org.AD\_Org\_ID=0)                                             |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|                   Nome                    |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                      Alphanumeric identifier of the entity                       |                                                                                                               The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                |
|                 Descrição                 |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                     Optional short description of the record                     |                                                                                                                                                                A description is limited to 255 characters.                                                                                                                                                                |
|                Comentários                | Texto Médio (até 2000 caracteres) |                                    |                          |                                                                                                                                                           |                        Comments or additional information                        |                                                                                                                                                 The Comments field allows for free form entry of additional information.                                                                                                                                                  |
|              Chave de Busca               |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|                   Ativo                   |              Sim-Não              |                (Y)                 |                          |                                                                                                                                                           |                        (semelhante ao primeiro relatório)                        |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|           Parceiro de Negócios            |             Procurar              |                                    |    cbpartner\_aduser     |                C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N' <span class="emphasis">*ReadOnly Logic*</span>: @C\_BPartner\_ID@\!0                |                          Identifies a Business Partner                           |                                                                                                                              A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                              |
|          Localização do Parceiro          |           Tabela Direta           |                                    |   cbplocation\_aduser    |                                                  C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@                                                  |            Identifies the (ship to) address for this Business Partner            |                                                                                                                                                     The Partner address indicates the location of a Business Partner                                                                                                                                                      |
|            Endereço de e-mail             |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                             Electronic Mail Address                              |                                                                            The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.                                                                             |
|                   Senha                   |       Texto Curto (String)        |                                    |                          |                                             <span class="emphasis">*ReadOnly Logic*</span>: @AD\_User\_ID@=0                                              |                     Password of any length (case sensitive)                      |                                                                                                    The Password for this User. Passwords are required to identify authorized users. For iDempiere Users, you can change the password via the Process "Reset Password".                                                                                                    |
|                  Título                   |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                        Name this entity is referred to as                        |                                                                                                                                                      The Title indicates the name that an entity is referred to as.                                                                                                                                                       |
|                  UserPIN                  |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|                Aniversário                |               Data                |                                    |                          |                                                                                                                                                           |                           Birthday or Anniversary day                            |                                                                                                                                                                        Birthday or Anniversary day                                                                                                                                                                        |
|                   Fone                    |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                          Identifies a telephone number                           |                                                                                                                                                               The Phone field identifies a telephone number                                                                                                                                                               |
|                  2º Fone                  |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                    Identifies an alternate telephone number.                     |                                                                                                                                                       The 2nd Phone field identifies an alternate telephone number.                                                                                                                                                       |
|                    Fax                    |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                                 Facsimile number                                 |                                                                                                                                                The Fax identifies a facsimile number for this Business Partner or Location                                                                                                                                                |
|            Tipo de Notificação            |               Lista               | EMail+Aviso Email Aviso Nenhum (E) |                          |                                                                                                                                                           |                              Type of Notifications                               |                                                                                                                                                         Emails or Notification sent out for Request Updates, etc.                                                                                                                                                         |
|                  Posição                  |           Tabela Direta           |                                    |       cjob\_aduser       | ((C\_Job.IsEmployee=(SELECT IsEmployee FROM C\_BPartner WHERE C\_BPartner\_ID=@C\_BPartner\_ID:0@)) OR (C\_Job.IsEmployee='N' AND @C\_BPartner\_ID:0@=0)) |                                   Job Position                                   |                                                                                                                                                                                                                                                                                                                                                                           |
|              Acesso Total PN              |              Sim-Não              |                (Y)                 |                          |                                                                                                                                                           |  The user/contact has full access to Business Partner information and resources  |                                                If selected, the user has full access to the Business Partner (BP) information (Business Documents like Orders, Invoices - Requests) or resources (Assets, Downloads). If you deselect it, the user has no access rights unless, you explicitly grant it in tab "BP Access"                                                |
|          ID do usuário de email           |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                        User Name (ID) in the Mail System                         |                                                                                                     The user name in the mail system is usually the string before the @ of your email address. Required if the mail server requires authentification to send emails.                                                                                                      |
|         Senha do usuário de email         |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                          Password of your email user id                          |                                                                                                                                                   Required if the mail server requires authentification to send emails.                                                                                                                                                   |
|                Supervisor                 |             Procurar              |              AD\_User              |    aduser\_supervisor    |                                                                                                                                                           |     Supervisor for this user/organization - used for escalation and approval     |                                                                                                                             The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                                                                                                                              |
|           Nome de usuário LDAP            |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |          User Name used for authorization via LDAP (directory) services          | Optional LDAP system user name for the user. If not defined, the normal Name of the user is used. This allows to use the internal (LDAP) user id (e.g. jjanke) and the normal display name (e.g. Jorg Janke). The LDAP User Name can also be used without LDAP enables (see system window). This would allow to sign in as jjanke and use the display name of Jorg Janke. |
|      Organização de Transação (Trx)       |              Tabela               |           AD\_Org (Trx)            |     adorgtrx\_aduser     |                                                                                                                                                           |                      Performing or initiating organization                       |                                                        The organization which performs or initiates this transaction (for another organization). The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.                                                         |
|             Auto Expadir Menu             |               Lista               |              Não Sim               |                          |                                                                                                                                                           |                  If ticked, the menu is automatically expanded                   |                                                                                                                                                                                                                                                                                                                                                                           |
|         Template padrão de E-Mail         |              Tabela               |            R\_MailText             | RDEFAULTMAILTEXT\_ADUSER |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
| Adicionar texto de e-mail automáticamente |              Sim-Não              |                (N)                 |                          |                                                                                                                                                           | The selected mail template will be automatically inserted when creating an email |                                                                                                                                                                                                                                                                                                                                                                           |
|                 Saudação                  |           Tabela Direta           |                                    |    cgreeting\_aduser     |                                                                                                                                                           |                       Greeting to print on correspondence                        |                                                                                                                                                     The Greeting identifies the greeting to print on correspondence.                                                                                                                                                      |
|             Email Verificado              |             Data+Hora             |                                    |                          |                                                                                                                                                           |                             Date Email was verified                              |                                                                                                                                                                                                                                                                                                                                                                           |
|              Último Contato               |               Data                |                                    |                          |                                                                                                                                                           |                     Date this individual was last contacted                      |                                                                                                                                        The Last Contact indicates the date that this Business Partner Contact was last contacted.                                                                                                                                         |
|         Informação de Verificação         |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                    Verification information of EMail Address                     |                                                                                                                                             The field contains additional information how the EMail Address has been verified                                                                                                                                             |
|             Último Resultado              |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                              Result of last contact                              |                                                                                                                                                      The Last Result identifies the result of the last contact made.                                                                                                                                                      |
|                 Trancado                  |              Sim-Não              |               ('N')                |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|                 Expirado                  |              Sim-Não              |                (N)                 |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|          Senha Não Restabelecida          |              Sim-Não              |               ('N')                |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|          Data de Conta Bloqueada          |             Data+Hora             |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|         Contagem de Login Falhou          |              Inteiro              |                (0)                 |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|           Data do Último Login            |             Data+Hora             |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|             Security Question             |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|         Data de Mudança da Senha          |             Data+Hora             |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|                  Answer                   |       Texto Curto (String)        |                                    |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |
|                Contato NFe                |              Sim-Não              |                (N)                 |                          |                                                                                                                                                           |                User is NFe Contact (receive email automatically)                 |                                                                                                                                                                                                                                                                                                                                                                           |
|               Email do XML                |              Sim-Não              |                                    |                          |                                                                                                                                                           |               O email compõe a Tag Email no XML do Documento Fical               |                                                                                                                                                                                                                                                                                                                                                                           |
|              Usuário Interno              |              Sim-Não              |               ('N')                |                          |                                                                                                                                                           |                                                                                  |                                                                                                                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d250637e803" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Funções de Usuários - AD\_User\_Roles

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_User_Roles_data)

<span class="emphasis">*Descrição:*</span> Funções de Usuários

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Funções de
Usuários" define as Funções (papéis) que cada usuário pode assumir. As
Funções vão determinar quais janelas, tarefas, processos e fluxos de
trabalho a que um determinado usuário terá acesso.

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e824" class="table">

<div class="table-title">

Table 1.2. User Roles
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |  Valores (Padrão)  |  Chave restritiva   |                            Regra de validação                            |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :-------------: | :-----------: | :----------------: | :-----------------: | :----------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@AD\_Client\_ID@) | ad\_userrolesclient |                    AD\_Client.AD\_Client\_ID \< \> 0                     |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|   Organização   | Tabela Direta |        (0)         |  ad\_userrolesorg   |             (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)             |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
| Usuário/Contato |   Procurar    |                    |  aduser\_userroles  |                                                                          | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|     Perfil      |   Procurar    |                    | adrole\_aduserroles | AD\_Role.AD\_Client\_ID=@\#AD\_Client\_ID@ AND AD\_Role.IsMasterRole='N' |                      Responsibility Role                      |           The Role determines security and access a user who has this Role will have in the System.           |
|      Ativo      |    Sim-Não    |        (Y)         |                     |                                                                          |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |

</div>

</div>

  

<div id="d250637e925" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Substituto do Usuário - AD\_User\_Substitute

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Substituto do Usuário

<span class="emphasis">*Comentário/Ajuda:* </span> Um usuário que pode
atuar por este usuário.

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e944" class="table">

<div class="table-title">

Table 1.3. User Substitute
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |  Valores (Padrão)  |    Chave restritiva    |                                                                                     Regra de validação                                                                                      |                           Descrição                           |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :----------------: | :--------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Substituto do Usuário   |          ID          |                    |                        |                                                                                                                                                                                             |                    Substitute of the user                     |                                                     A user who can act for another user.                                                     |
|         Empresa          |    Tabela Direta     | (@AD\_Client\_ID@) |                        |                                                                              AD\_Client.AD\_Client\_ID \< \> 0                                                                              |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |  (@AD\_Org\_ID@)   |                        |                                                                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                       |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|     Usuário/Contato      |       Procurar       |                    |   aduser\_adusersub    |                                                                                                                                                                                             | User within the system - Internal or Business Partner Contact |                The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|           Nome           | Texto Curto (String) |                    |                        |                                                                                                                                                                                             |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         | Texto Curto (String) |                    |                        |                                                                                                                                                                                             |           Optional short description of the record            |                                                 A description is limited to 255 characters.                                                  |
|          Ativo           |       Sim-Não        |        (Y)         |                        |                                                                                                                                                                                             |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|        Substituto        |       Procurar       |      AD\_User      | adusersub\_ad\_usersub | AD\_User.AD\_Client\_ID=@\#AD\_Client\_ID@ AND AD\_User.AD\_User\_ID IN (SELECT AD\_User\_ID FROM AD\_User\_Roles WHERE IsActive='Y' AND AD\_User\_Roles.AD\_Client\_ID=@\#AD\_Client\_ID@) |       Entity which can be used in place of this entity        |                               The Substitute identifies the entity to be used as a substitute for this entity.                               |
|       Válido desde       |         Data         |                    |                        |                                                                                                                                                                                             |          Valid from including this date (first day)           |                                         The Valid From date indicates the first day of a date range                                          |
|        Válido até        |         Data         |                    |                        |                                                                                                                                                                                             |            Valid to including this date (last day)            |                                           The Valid To date indicates the last day of a date range                                           |
| AD\_User\_Substitute\_UU | Texto Curto (String) |                    |                        |                                                                                                                                                                                             |                                                               |                                                                                                                                              |

</div>

</div>

  

<div id="d250637e1130" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Atribuição da Org. - C\_OrgAssignment

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Designação de Usuário a uma
Organização

<span class="emphasis">*Comentário/Ajuda:* </span> Designar Usuários a
Organizações

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e1149" class="table">

<div class="table-title">

Table 1.4. Org Assignment
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |  Valores (Padrão)  |    Chave restritiva    |                                                          Regra de validação                                                           |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :----------------: | :------------------: | :----------------: | :--------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
| Atribuição da Org. |          ID          |                    |                        |                                                                                                                                       |           Assignment to (transaction) Organization            |                           Assignment to the transaction organization (cost center).                           |
|      Empresa       |    Tabela Direta     | (@AD\_Client\_ID@) |                        |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|    Organização     |    Tabela Direta     |  (@AD\_Org\_ID@)   | adorg\_corgassignment  |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|  Usuário/Contato   |       Procurar       |                    | aduser\_corgassignment | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|       Ativo        |       Sim-Não        |        (Y)         |                        |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|    Válido desde    |         Data         |                    |                        |                                                                                                                                       |          Valid from including this date (first day)           |                          The Valid From date indicates the first day of a date range                          |
|     Válido até     |         Data         |                    |                        |                                                                                                                                       |            Valid to including this date (last day)            |                           The Valid To date indicates the last day of a date range                            |
|     Descrição      | Texto Curto (String) |                    |                        |                                                                                                                                       |           Optional short description of the record            |                                  A description is limited to 255 characters.                                  |

</div>

</div>

  

<div id="d250637e1292" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Acesso Org - AD\_User\_OrgAccess

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_User_OrgAccess_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Acesso de
Usuários à Organização

<span class="emphasis">*Comentário/Ajuda:* </span> Acrescentar as
Empresas e Organizações a que o usuário tem acesso. Estes lançamentos
serão ignorados se, neste papel, o "Acesso de Usuários à Organização"
não for selecionado ou o papel tiver acesso a todos os papéis. Note que
a informação de acesso é memorizada e requer re-login ou reset da
memória cache.

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e1313" class="table">

<div class="table-title">

Table 1.5. Org Access
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :-------------: | :-----------: | :------------------: | :---------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|   Organização   | Tabela Direta |  (@\#AD\_Org\_ID@)   | adorg\_aduserorgaccess  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
| Usuário/Contato | Tabela Direta |                      | aduser\_aduserorgaccess |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|      Ativo      |    Sim-Não    |         (Y)          |                         |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
| Somente Leitura |    Sim-Não    |         (N)          |                         |                                                  |                      Field is read only                       |               The Read Only indicates that this field may only be Read. It may not be updated.                |

</div>

</div>

  

<div id="d250637e1415" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Enviar mensagem para usuário - AD\_UserMail

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_UserMail_data)

<span class="emphasis">*Descrição:*</span> O email foi enviado ao
usuário

<span class="emphasis">*Comentário/Ajuda:* </span> Arquivo de emails
enviados a usuários

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e1432" class="table">

<div class="table-title">

Table 1.6. User Mail
Fields

</div>

<div class="table-contents">

|        Nome do campo         |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                           Descrição                           |                                                                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                                                                      |
| :--------------------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Ativo             |              Sim-Não              |        (Y)         |                       |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
| Enviar mensagem para usuário |                ID                 |                    |                       |                                                  |                     Mail sent to the user                     |                                                                                                                                                                                                                                                               Archive of mails sent to users                                                                                                                                                                                                                                                               |
|           Empresa            |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|         Organização          |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|       Usuário/Contato        |             Procurar              |                    |  aduser\_adusermail   |                                                  | User within the system - Internal or Business Partner Contact |                                                                                                                                                                                                                       The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                                                                                                                        |
|  Modelo de Correspondência   |           Tabela Direta           |                    | rmailtext\_adusermail |                                                  |                  Text templates for mailings                  | The Mail Template indicates the mail template for return messages. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |
|  Enviar Mensagem por email   |           Tabela Direta           |                    | wmailmsg\_adusermail  |                                                  |                Web Store Mail Message Template                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|            Criado            |             Data+Hora             |     (SYSDATE)      |                       |                                                  |                 Date this record was created                  |                                                                                                                                                                                                                                             The Created field indicates the date that this record was created.                                                                                                                                                                                                                                             |
|        ID da Mensagem        |       Texto Curto (String)        |                    |                       |                                                  |                       EMail Message ID                        |                                                                                                                                                                                                                                                           SMTP Message ID for tracking purposes                                                                                                                                                                                                                                                            |
|      E-Mail Enviado de       |       Texto Curto (String)        |                    |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|             Para             |       Texto Curto (String)        |                    |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|              Cc              |       Texto Curto (String)        |                    |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|             Bcc              |       Texto Curto (String)        |                    |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|           Assunto            |       Texto Curto (String)        |                    |                       |                                                  |                     Email Message Subject                     |                                                                                                                                                                                                                                                                    Subject of the EMail                                                                                                                                                                                                                                                                    |
|   Texto de Correspondência   | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |                  Text used for Mail message                   |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|    Confirmação de Entrega    |       Texto Curto (String)        |                    |                       |                                                  |                  EMail Delivery confirmation                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|          Despachado          |               Lista               |      Não Sim       |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d250637e1703" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Perguntas - AD\_UserQuery

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Visualizar e gerenciar as
perguntas salvas

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e1718" class="table">

<div class="table-title">

Table 1.7. Queries
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência            | Valores (Padrão) |   Chave restritiva   |        Regra de validação         |                           Descrição                           |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------------------: | :--------------: | :------------------: | :-------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     User Query      |                ID                |                  |                      |                                   |                       Saved User Query                        |                                                                                                                                              |
|       Empresa       |          Tabela Direta           |                  |                      | AD\_Client.AD\_Client\_ID \< \> 0 |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|     Organização     |          Tabela Direta           |       (0)        |                      |                                   |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|   Usuário/Contato   |             Procurar             |                  | aduser\_aduserquery  |                                   | User within the system - Internal or Business Partner Contact |                The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|        Nome         |       Texto Curto (String)       |                  |                      |                                   |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |       Texto Curto (String)       |                  |                      |                                   |           Optional short description of the record            |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |             Sim-Não              |                  |                      |                                   |              (semelhante ao primeiro relatório)               |                                                             (ver o mesmo acima)                                                              |
|       Tabela        |          Tabela Direta           |                  | adtable\_aduserquery |                                   |                  Database Table information                   |                                     The Database Table provides the information of the table definition                                      |
| Código de Validação | Texto Longo (\> 2000 caracteres) |                  |                      |                                   |                        Validation Code                        |                                    The Validation Code displays the date, time and message of the error.                                     |
|  AD\_UserQuery\_UU  |       Texto Curto (String)       |                  |                      |                                   |                                                               |                                                                                                                                              |

</div>

</div>

  

<div id="d250637e1887" class="section section">

<div class="titlepage">

<div>

<div>

## 8. Tabela: LDAP Access - AD\_LdapAccess

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> User Access via LDAP

<span class="emphasis">*Coluna linkada:* </span> User/Contact

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d250637e1902" class="table">

<div class="table-title">

Table 1.8. LDAP Access
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             | Valores (Padrão) |       Chave restritiva        |        Regra de validação         |                                   Descrição                                   |                                                                                                                        Comentário/Ajuda                                                                                                                         |
| :----------------: | :-------------------------------: | :--------------: | :---------------------------: | :-------------------------------: | :---------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Ldap Access     |                ID                 |                  |                               |                                   |                                Ldap Access Log                                |                                                                                                                         Access via LDAP                                                                                                                         |
|       Ativo        |              Sim-Não              |                  |                               |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|      Empresa       |           Tabela Direta           |                  |                               | AD\_Client.AD\_Client\_ID \< \> 0 |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|    Organização     |           Tabela Direta           |                  |                               |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|  Usuário/Contato   |           Tabela Direta           |                  |     aduser\_adldapaccess      |                                   |         User within the system - Internal or Business Partner Contact         |                                                                          The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                          |
|   Ldap Processor   |           Tabela Direta           |                  | adldapprocessor\_adldapaccess |                                   | LDAP Server to authenticate and authorize external systems based on iDempiere | The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them. There is only one server per iDempiere system. The "o" is the Client key and the optional "ou" is the Interest Area key. |
| Área de Interesse  |           Tabela Direta           |                  |  rinterestarea\_adldapaccess  |                                   |                            Interest Area or Topic                             |                                                                          Interest Areas reflect interest in a topic by a contact. Interest areas can be used for marketing campaigns.                                                                           |
|       Criado       |             Data+Hora             |    (SYSDATE)     |                               |                                   |                         Date this record was created                          |                                                                                               The Created field indicates the date that this record was created.                                                                                                |
|        Erro        |              Sim-Não              |                  |                               |                                   |                      An Error occurred in the execution                       |                                                                                                                                                                                                                                                                 |
|       Resumo       | Texto Médio (até 2000 caracteres) |                  |                               |                                   |                        Textual summary of this request                        |                                                                                               The Summary allows free form text entry of a recap of this request.                                                                                               |
|     Descrição      |       Texto Curto (String)        |                  |                               |                                   |                   Optional short description of the record                    |                                                                                                           A description is limited to 255 characters.                                                                                                           |
| AD\_LdapAccess\_UU |       Texto Curto (String)        |                  |                               |                                   |                                                                               |                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>
