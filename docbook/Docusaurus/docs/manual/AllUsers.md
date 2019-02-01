---
title: "All Users"
id: AllUsers
---
<div id="d4653e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: All Users

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: User -
    AD\_AllUsers\_V](#d4653e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Users from All Clients

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-07-28 18:17:09.0

<span class="emphasis">*Atualizado em:* </span>2017-07-28 18:17:09.0

<div id="d4653e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: User - AD\_AllUsers\_V

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d4653e29" class="table">

<div class="table-title">

Table 1.1. User
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      | Valores (Padrão) | Chave restritiva | Regra de validação |                           Descrição                            |                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                              |
| :----------------------: | :------------------: | :--------------: | :--------------: | :----------------: | :------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        All Users         |          ID          |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|         Empresa          |    Tabela Direta     |                  |                  |                    |               (semelhante ao primeiro relatório)               |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|       Organização        |    Tabela Direta     |                  |                  |                    |               (semelhante ao primeiro relatório)               |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|   AD\_AllUsers\_V\_UU    | Texto Curto (String) |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|          Client          |    Tabela Direta     |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|    Endereço de e-mail    | Texto Curto (String) |                  |                  |                    |                    Electronic Mail Address                     |                                                                            The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web.                                                                             |
|   Nome de usuário LDAP   | Texto Curto (String) |                  |                  |                    | User Name used for authorization via LDAP (directory) services | Optional LDAP system user name for the user. If not defined, the normal Name of the user is used. This allows to use the internal (LDAP) user id (e.g. jjanke) and the normal display name (e.g. Jorg Janke). The LDAP User Name can also be used without LDAP enables (see system window). This would allow to sign in as jjanke and use the display name of Jorg Janke. |
|           Nome           | Texto Curto (String) |                  |                  |                    |             Alphanumeric identifier of the entity              |                                                                                                               The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                |
|        Descrição         | Texto Curto (String) |                  |                  |                    |            Optional short description of the record            |                                                                                                                                                                A description is limited to 255 characters.                                                                                                                                                                |
|   Data do Último Login   |      Data+Hora       |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
| Contagem de Login Falhou |       Inteiro        |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
| Data de Mudança da Senha |         Data         |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|         Expirado         |       Sim-Não        |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|         Trancado         |       Sim-Não        |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
| Senha Não Restabelecida  |       Sim-Não        |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|          Senha           | Texto Curto (String) |                  |                  |                    |            Password of any length (case sensitive)             |                                                                                                    The Password for this User. Passwords are required to identify authorized users. For iDempiere Users, you can change the password via the Process "Reset Password".                                                                                                    |
|           Salt           | Texto Curto (String) |                  |                  |                    |    Random data added to improve password hash effectiveness    |                                                                                                                                                                                                                                                                                                                                                                           |
|         UserPIN          | Texto Curto (String) |                  |                  |                    |                                                                |                                                                                                                                                                                                                                                                                                                                                                           |
|      Chave de Busca      | Texto Curto (String) |                  |                  |                    |               (semelhante ao primeiro relatório)               |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |
|          Ativo           |       Sim-Não        |                  |                  |                    |               (semelhante ao primeiro relatório)               |                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                            |

</div>

</div>

  

</div>
