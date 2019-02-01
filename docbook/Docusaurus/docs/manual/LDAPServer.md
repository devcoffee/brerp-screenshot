---
title: "LDAP Server"
id: LDAPServer
---
<div id="d134440e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: LDAP Server

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: LDAP Server -
    AD\_LdapProcessor](#d134440e22)</span>
  - <span class="section">[2. Tabela: LDAP Server Log -
    AD\_LdapProcessorLog](#d134440e252)</span>

</div>

<span class="emphasis">*Descrição:* </span> LDAP Server to authenticate
and authorize external systems based on Compiere

<span class="emphasis">*Comentário/Ajuda:* </span>The LDAP Server allows
third party software (e.g. Apache) to use the users defined in the
system to authentificate and authorize them. There is only one server
per Compiere system. The "o" is the Client key and the optional "ou" is
the Interest Area key.

<span class="emphasis"> *Criado em:* </span>2006-10-29 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2006-10-29 00:00:00.0

<div id="d134440e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: LDAP Server - AD\_LdapProcessor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_LdapProcessor_data)

<span class="emphasis">*Descrição:*</span> LDAP Server to authenticate
and authorize external systems based on Compiere

<span class="emphasis">*Comentário/Ajuda:* </span> The LDAP Server
allows third party software (e.g. Apache) to use the users defined in
the system to authentificate and authorize them. There is only one
server per Compiere system. The "o" is the Client key and the optional
"ou" is the Interest Area key.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d134440e39" class="table">

<div class="table-title">

Table 1.1. LDAP Server
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      | Valores (Padrão) |    Chave restritiva     |        Regra de validação         |                                   Descrição                                   |                                                                                                                        Comentário/Ajuda                                                                                                                         |
| :-----------------------------: | :------------------: | :--------------: | :---------------------: | :-------------------------------: | :---------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Ldap Processor          |          ID          |                  |                         |                                   | LDAP Server to authenticate and authorize external systems based on iDempiere | The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them. There is only one server per iDempiere system. The "o" is the Client key and the optional "ou" is the Interest Area key. |
|         Processar Agora         |       Sim-Não        |                  |                         |                                   |                                                                               |                                                                                                                                                                                                                                                                 |
|             Empresa             |    Tabela Direta     |                  |                         | AD\_Client.AD\_Client\_ID \< \> 0 |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|           Organização           |    Tabela Direta     |                  |                         |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|              Nome               | Texto Curto (String) |                  |                         |                                   |                     Alphanumeric identifier of the entity                     |                                                          The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                           |
|            Descrição            | Texto Curto (String) |                  |                         |                                   |                   Optional short description of the record                    |                                                                                                           A description is limited to 255 characters.                                                                                                           |
|              Ativo              |       Sim-Não        |                  |                         |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|            Ldap Port            |       Inteiro        |      (389)       |                         |                                   |                       The port the server is listening                        |                                                                                                                  The default LDAP port is 389                                                                                                                   |
|           Supervisor            |        Tabela        |     AD\_User     | aduser\_adldapprocessor |                                   |   Supervisor for this user/organization - used for escalation and approval    |                                                                        The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                                                                         |
| Dias para manter registro (log) |       Inteiro        |       (7)        |                         |                                   |                    Number of days to keep the log entries                     |                                                                                                                Older Log entries may be deleted                                                                                                                 |
|  Data do último processamento   |      Data+Hora       |                  |                         |                                   |                        Date the process was last run.                         |                                                                                                The Date Last Run indicates the last time that a process was run.                                                                                                |
|    Data da Próxima Execução     |      Data+Hora       |                  |                         |                                   |                        Date the process will run next                         |                                                                                                The Date Next Run indicates the next time this process will run.                                                                                                 |
|      AD\_LdapProcessor\_UU      | Texto Curto (String) |                  |                         |                                   |                                                                               |                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d134440e252" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: LDAP Server Log - AD\_LdapProcessorLog

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Log of the LDAP Server

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d134440e263" class="table">

<div class="table-title">

Table 1.2. LDAP Server Log
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             | Valores (Padrão) |        Chave restritiva        |        Regra de validação         |                                   Descrição                                   |                                                                                                                        Comentário/Ajuda                                                                                                                         |
| :----------------------: | :-------------------------------: | :--------------: | :----------------------------: | :-------------------------------: | :---------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Dados Binários      |              Binário              |                  |                                |                                   |                                  Binary Data                                  |                                                                                                              The Binary field stores binary data.                                                                                                               |
|    Ldap Processor Log    |                ID                 |                  |                                |                                   |                                LDAP Server Log                                |                                                                                                                                                                                                                                                                 |
|          Ativo           |              Sim-Não              |                  |                                |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|         Empresa          |           Tabela Direta           |                  |                                | AD\_Client.AD\_Client\_ID \< \> 0 |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|       Organização        |           Tabela Direta           |                  |                                |                                   |                      (semelhante ao primeiro relatório)                       |                                                                                                                       (ver o mesmo acima)                                                                                                                       |
|      Ldap Processor      |           Tabela Direta           |                  | adldapprocessor\_adldapproclog |                                   | LDAP Server to authenticate and authorize external systems based on iDempiere | The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them. There is only one server per iDempiere system. The "o" is the Client key and the optional "ou" is the Interest Area key. |
|          Criado          |             Data+Hora             |    (SYSDATE)     |                                |                                   |                         Date this record was created                          |                                                                                               The Created field indicates the date that this record was created.                                                                                                |
|          Resumo          | Texto Médio (até 2000 caracteres) |                  |                                |                                   |                        Textual summary of this request                        |                                                                                               The Summary allows free form text entry of a recap of this request.                                                                                               |
|           Erro           |              Sim-Não              |                  |                                |                                   |                      An Error occurred in the execution                       |                                                                                                                                                                                                                                                                 |
|        Referência        |       Texto Curto (String)        |                  |                                |                                   |                           Reference for this record                           |                                                                                                       The Reference displays the source document number.                                                                                                        |
|    Texto de Mensagem     | Texto Médio (até 2000 caracteres) |                  |                                |                                   |                                 Text Message                                  |                                                                                                                                                                                                                                                                 |
|        Descrição         |       Texto Curto (String)        |                  |                                |                                   |                   Optional short description of the record                    |                                                                                                           A description is limited to 255 characters.                                                                                                           |
| AD\_LdapProcessorLog\_UU |       Texto Curto (String)        |                  |                                |                                   |                                                                               |                                                                                                                                                                                                                                                                 |

</div>

</div>

  

</div>
