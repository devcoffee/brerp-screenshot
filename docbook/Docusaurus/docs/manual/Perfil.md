---
title: "Perfil"
id: Perfil
---
<div id="d172027e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Perfil

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Papel (Função) -
    AD\_Role](#d172027e23)</span>
  - <span class="section">[2. Tabela: Acesso Org -
    AD\_Role\_OrgAccess](#d172027e807)</span>
  - <span class="section">[3. Tabela: Designação de Usuário -
    AD\_User\_Roles](#d172027e933)</span>
  - <span class="section">[4. Tabela: Acesso a Janelas -
    AD\_Window\_Access](#d172027e1059)</span>
  - <span class="section">[5. Tabela: Acesso a Processos -
    AD\_Process\_Access](#d172027e1195)</span>
  - <span class="section">[6. Tabela: Acesso a Formulários -
    AD\_Form\_Access](#d172027e1331)</span>
  - <span class="section">[7. Tabela: Informações de Acesso -
    AD\_InfoWindow\_Access](#d172027e1467)</span>
  - <span class="section">[8. Tabela: Acesso a Fluxos de Trabalho -
    AD\_Workflow\_Access](#d172027e1581)</span>
  - <span class="section">[9. Tabela: Acesso a Tarefas -
    AD\_Task\_Access](#d172027e1717)</span>
  - <span class="section">[10. Tabela: Document Action Access -
    AD\_Document\_Action\_Access](#d172027e1853)</span>
  - <span class="section">[11. Tabela: Perfis inclusos -
    AD\_Role\_Included](#d172027e1988)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das
Responsabilidades dos Usuários

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Perfil"
permite a você definir os diferentes perfis que os usuários deste
sistema terão. Os perfis controlam o acesso a janelas, tarefas,
relatórios, etc. Para cada Empresa são predefinidos um Perfil de
Administrador e de Usuário. Você pode acrescentar Perfis adicionais para
controlar o acesso a funcionalidades ou dados específicos. Você pode
acrescentar usuários ao Perfil. Note que a informação de acesso é
memorizada e requer re-login ou reset da memória cache.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Perfil.png)

<div id="d172027e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Papel (Função) - AD\_Role

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Role_data)

<span class="emphasis">*Descrição:*</span> Definir funções (papéis) e
responsabilidades

<span class="emphasis">*Comentário/Ajuda:* </span> Define a função
(papel) e acrescenta as empresas e organizações a que esta função tem
acesso. Você pode dar acesso de usuários a esta função (papel) e
modificar o acesso desta função a janelas, formulários, processos e
relatórios assim como tarefas. Se o Nível de Usuário de Função estiver
em Manual, os direitos de acesso designados não são automaticamente
atualizados (ex. se um papel tiver um número restrito de
Janelas/Processos que ele pode acessar). Você precisa adicionar acesso
organizacional a menos que o papel (função) tenha acesso a todas as
organizações. O novo Papel (Função) é atribuido automaticamente ao
SuperUsuário e ao usuário que estiver criando o papel. Se você
selecionar uma Árvore de Organizacional, o usuário terá acesso às folhas
das sub Organizações. Nota: Você não pode alterar o papel do
Administrador do Sistema.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d172027e40" class="table">

<div class="table-title">

Table 1.1. Role
Fields

</div>

<div class="table-contents">

|              Nome do campo              |      Referência      |                Valores (Padrão)                 |     Chave restritiva     |                         Regra de validação                          |                                                             Descrição                                                              |                                                                                                                                        Comentário/Ajuda                                                                                                                                         |
| :-------------------------------------: | :------------------: | :---------------------------------------------: | :----------------------: | :-----------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                 Perfil                  |          ID          |                                                 |                          |                                                                     |                                                        Responsibility Role                                                         |                                                                                                    The Role determines security and access a user who has this Role will have in the System.                                                                                                    |
|                 Empresa                 |    Tabela Direta     |              (@\#AD\_Client\_ID@)               |      ad\_roleclient      |                  AD\_Client.AD\_Client\_ID \< \> 0                  |                                                 (semelhante ao primeiro relatório)                                                 |                                                                                                                                       (ver o mesmo acima)                                                                                                                                       |
|               Organização               |    Tabela Direta     |                (@\#AD\_Org\_ID@)                |       ad\_roleorg        |          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)           |                                                 (semelhante ao primeiro relatório)                                                 |                                                                                                                                       (ver o mesmo acima)                                                                                                                                       |
|                  Nome                   | Texto Curto (String) |                                                 |                          |                                                                     |                                               Alphanumeric identifier of the entity                                                |                                                                          The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                           |
|                Descrição                | Texto Curto (String) |                                                 |                          |                                                                     |                                              Optional short description of the record                                              |                                                                                                                           A description is limited to 255 characters.                                                                                                                           |
|                  Ativo                  |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                 (semelhante ao primeiro relatório)                                                 |                                                                                                                                       (ver o mesmo acima)                                                                                                                                       |
|            Nível do Usuário             |        Lista         | Empresa Empresa+Organização Organização Sistema |                          |                                                                     |                                                     System Client Organization                                                     |                                                         The User Level field determines if users of this Role will have access to System level data, Organization level data, Client level data or Client and Organization level data.                                                          |
|                 Manual                  |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                      This is a manual process                                                      |                                                                                                                The Manual check box indicates if the process will done manually.                                                                                                                |
|              Perfil Mestre              |       Sim-Não        |                       (N)                       |                          |                                                                     | A master role cannot be assigned to users, it is intended to define access to menu option and documents and inherit to other roles |                                                                                                                                                                                                                                                                                                 |
|                Moeda De                 |    Tabela Direta     |              (@$C\_Currency\_ID@)               |  c\_currency\_ad\_role   |                                                                     |                                                    The Currency for this record                                                    |                                                                                                          Indicates the Currency to be used when processing or reporting on this record                                                                                                          |
|           Valor da Aprovação            |        Valor         |                                                 |                          |                                                                     |                                              The approval amount limit for this role                                               |                                                                                                  The Approval Amount field indicates the amount limit this Role has for approval of documents.                                                                                                  |
|        Dias Aprovados Acumulados        |       Inteiro        |                                                 |                          |                                                                     |                The days approval indicates the days to take into account to verify the accumulated approval amount.                |                                                                                     The Days Approval Accumulated field indicates the days to take into account to verify the accumulated approval amount.                                                                                      |
|      Valor da Aprovação Acumulada       |        Valor         |                                                 |                          |                                                                     |                                  The approval amount limit for this role accumulated on a period                                   |                                                                                       The Approval Amount field indicates the amount limit this Role has for approval of documents within a period limit.                                                                                       |
|       Aprovar Documentos próprios       |       Sim-Não        |                                                 |                          |                                                                     |                                        Users with this role can approve their own documents                                        |                                                                                              If a user cannot approve their own documents (orders, etc.), it needs to be approved by someone else.                                                                                              |
|              UserDiscount               |        Número        |                                                 |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|             Árvore de Menu              |        Tabela        |                    AD\_Tree                     |      adtree\_adrole      |                       AD\_Tree.TreeType='MM'                        |                                                          Tree of the menu                                                          |                                                                                                                                        Menu access tree                                                                                                                                         |
|               Supervisor                |       Procurar       |               AD\_User - Internal               | adusersupervisor\_adrole |                                                                     |                              Supervisor for this user/organization - used for escalation and approval                              |                                                                                        The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                                                                                         |
|        Sobrescrever Preço Limite        |       Sim-Não        |                       (N)                       |                          |                                                                     |                                  Overwrite Price Limit if the Price List enforces the Price Limit                                  |                                                                              The Price List allows to enforce the Price Limit. If set, a user with this role can overwrite the price limit (i.e. enter any price).                                                                              |
|          Nível de Preferência           |        Lista         |     Empresa Nenhum Organização Usuário (O)      |                          |                                                                     |                                            Determines what preferences the user can set                                            |                                                       Preferences allow you to define default values. If set to None, you cannot set any preference nor value preference. Only if set to Client, you can see the Record Info Change Log.                                                        |
| Gerenciamento do Registro de Alterações |       Sim-Não        |                       (N)                       |                          |                                                                     |                                                     Maintain a log of changes                                                      |                                                                                                                        If selected, a log of all changes is maintained.                                                                                                                         |
|          Exibir Contabilidade           |       Sim-Não        |                       (N)                       |                          |                                                                     |                                        Users with this role can see accounting information                                         |                                                                                                                  This allows to prevent access to any accounting information.                                                                                                                   |
|           Acessar Todas Orgs.           |       Sim-Não        |                       (N)                       |                          |                                                                     |                                   Access all Organizations (no org access control) of the client                                   |                                                                     When selected, the role has access to all organizations of the client automatically. This also increases performance where you have many organizations.                                                                     |
|          Árvore da Organização          |        Tabela        |                    AD\_Tree                     |    adtreeorg\_adrole     | AD\_Tree.TreeType='OO' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                              Trees are used for (financial) reporting and security access (via role)                               |                                                                                                             Trees are used for (finanial) reporting and security access (via role)                                                                                                              |
|  Usar Acesso de Usuários à Organização  |       Sim-Não        |                       (N)                       |                          |                                                                     |                                     Use Org Access defined by user instead of Role Org Access                                      |                                                                                   You can define the access to Organization either by Role or by User. You would select this, if you have many organizations.                                                                                   |
|         Pode Emitir Relatórios          |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                              Users with this role can create reports                                               |                                                                                                                         You can restrict the ability to report on data.                                                                                                                         |
|              Pode Exportar              |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                Users with this role can export data                                                |                                                                                                                   You can restrict the ability to export data from iDempiere.                                                                                                                   |
|              Trava Pessoal              |       Sim-Não        |                       (N)                       |                          |                                                                     |                                      Allow users with role to lock access to personal records                                      |                                                  If enabled, the user with the role can prevent access of others to personal records. If a record is locked, only the user or people who can read personal locked records can see the record.                                                   |
|             Acesso Pessoal              |       Sim-Não        |                       (N)                       |                          |                                                                     |                                                Allow access to all personal records                                                |                                                                                                                Users of this role have access to all records locked as personal.                                                                                                                |
|    Confirmar Registros de Perguntas     |       Inteiro        |                       (0)                       |                          |                                                                     |                      Require Confirmation if more records will be returned by the query (If not defined 500)                       |                                                                        Enter the number of records the query will return without confirmation to avoid unnecessary system load. If 0, the system default of 500 is used.                                                                        |
|         Max Registros Perguntas         |       Inteiro        |                       (0)                       |                          |                                                                     |        If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records         |                                                                                  Enter the number of records a user will be able to query to avoid unnecessary system load. If 0, no restrictions are imposed.                                                                                  |
|             Acesso Avançado             |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|            Auto Expadir Menu            |       Sim-Não        |                       (N)                       |                          |                                                                     |                                           If ticked, the menu is automatically expanded                                            |                                                                                                                                                                                                                                                                                                 |
|           Connection Profile            |        Lista         |           LAN Terminal Server VPN WAN           |                          |                                                                     |                                            How a Java Client connects to the server(s)                                             | Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile. |
|      Permitir Informações da Conta      |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|     Permitir Informações da Agenda      |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|     Permitir Informações do Produto     |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|    Permitir Informação do PNegocios     |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|      Permitir Informação da Ordem       |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|     Permitir Informações da Fatura      |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|         Allow Info CashJournal          |       Sim-Não        |                       (N)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|        Permitir Informação InOut        |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|    Permitir Informação de Pagamento     |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|     Permitir Informações de Ativos      |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|    Permitir Informações de Recursos     |       Sim-Não        |                       (Y)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|      Nível do Perfil (Hierarquia)       |        Lista         |  010 020 030 040 050 060 070 080 090 100 (100)  |                          |                                                                     |                                       Used to make more easy work with window customization                                        |                            Used to define the role hierarchy of an organization. This value is added to a context variable that can be used for example to create Window Customizations. Example: 100 - President 090 - Manager 080 - Coordinator 070 - Sales Person                            |
|             Allow Info CRP              |       Sim-Não        |                       (N)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|             Allow Info MRP              |       Sim-Não        |                       (N)                       |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|            Desativar Acessos            |        Botão         |                                                 |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|        Criar permissões para Tdd        |        Botão         |                                                 |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |
|              AD\_Role\_UU               | Texto Curto (String) |                                                 |                          |                                                                     |                                                                                                                                    |                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d172027e807" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Acesso Org - AD\_Role\_OrgAccess

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Role_OrgAccess_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Acesso do
Perfil à Organização

<span class="emphasis">*Comentário/Ajuda:* </span> Acrescentar as
Empresas e Organizações a que o usuário tem acesso. Estes lançamentos
serão ignorados se o "Acesso de Usuários à Organização" for selecionado
ou o perfil tiver acesso a todos os perfis. Note que a informação de
acesso é memorizada e requer re-login ou reset da memória cache.

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Lógica de visualização:*</span> @IsMasterRole@=N

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e832" class="table">

<div class="table-title">

Table 1.2. Org Access
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |  Valores (Padrão)  |    Chave restritiva     |                         Regra de validação                         |             Descrição              |                                     Comentário/Ajuda                                      |
| :-------------: | :-----------: | :----------------: | :---------------------: | :----------------------------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@AD\_Client\_ID@) |                         |                 AD\_Client.AD\_Client\_ID \< \> 0                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|   Organização   | Tabela Direta |  (@AD\_Org\_ID@)   | adorg\_adroleorgaccess  | (AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|     Perfil      | Tabela Direta |                    | adrole\_adroleorgaccess |                                                                    |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|      Ativo      |    Sim-Não    |        (Y)         |                         |                                                                    | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Somente Leitura |    Sim-Não    |                    |                         |                                                                    |         Field is read only         |     The Read Only indicates that this field may only be Read. It may not be updated.      |

</div>

</div>

  

<div id="d172027e933" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Designação de Usuário - AD\_User\_Roles

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_User_Roles_data)

<span class="emphasis">*Descrição:*</span> Usuários com esta Função
(papel)

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Designação de
Usuários" mostra usuários que tenham sido definidos para esta Função
(Papel).

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Lógica de visualização:*</span> @IsMasterRole@=N

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e958" class="table">

<div class="table-title">

Table 1.3. User Assignment
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |  Valores (Padrão)  |  Chave restritiva   |                            Regra de validação                            |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :-------------: | :-----------: | :----------------: | :-----------------: | :----------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@AD\_Client\_ID@) | ad\_userrolesclient |                    AD\_Client.AD\_Client\_ID \< \> 0                     |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|   Organização   | Tabela Direta |        (0)         |  ad\_userrolesorg   |             (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)             |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|     Perfil      |   Procurar    |                    | adrole\_aduserroles | AD\_Role.AD\_Client\_ID=@\#AD\_Client\_ID@ AND AD\_Role.IsMasterRole='N' |                      Responsibility Role                      |           The Role determines security and access a user who has this Role will have in the System.           |
| Usuário/Contato |   Procurar    |                    |  aduser\_userroles  |                                                                          | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|      Ativo      |    Sim-Não    |        (Y)         |                     |                                                                          |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |

</div>

</div>

  

<div id="d172027e1059" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Acesso a Janelas - AD\_Window\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Window_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Janelas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Janelas" define as Janelas e o tipo de acesso que é outorgado a este
Papel (Função).

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1080" class="table">

<div class="table-title">

Table 1.4. Window Access
Fields

</div>

<div class="table-contents">

|   Nome do campo   |  Referência   |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :---------------: | :-----------: | :----------------: | :----------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|      Empresa      | Tabela Direta | (@AD\_Client\_ID@) | ad\_functaccess\_client  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Organização    | Tabela Direta |  (@AD\_Org\_ID@)   |    ad\_functaccessorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|      Perfil       | Tabela Direta |                    |  adrole\_adwindowaccess  |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|      Janela       | Tabela Direta |                    | adwindow\_adwindowaccess |                                                  |    Data entry or display window    |                The Window field identifies a unique Window in the system.                 |
|       Ativo       |    Sim-Não    |        (Y)         |                          |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Escrita e Leitura |    Sim-Não    |                    |                          |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

<div id="d172027e1195" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Acesso a Processos - AD\_Process\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Processos

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Processos" define os Processos e o tipo de acesso que é outorgado a este
Papel (Função).

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1216" class="table">

<div class="table-title">

Table 1.5. Process Access
Fields

</div>

<div class="table-contents">

|   Nome do campo   |  Referência   |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :---------------: | :-----------: | :----------------: | :------------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|      Empresa      | Tabela Direta | (@AD\_Client\_ID@) | ad\_processaccess\_client  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Organização    | Tabela Direta |  (@AD\_Org\_ID@)   |  ad\_processtaccess\_org   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|      Perfil       | Tabela Direta |                    |  adrole\_adprocessaccess   |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|     Processo      | Tabela Direta |                    | adprocess\_adprocessaccess |                                                  |         Process or Report          |          The Process field identifies a unique Process or Report in the system.           |
|       Ativo       |    Sim-Não    |        (Y)         |                            |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Escrita e Leitura |    Sim-Não    |                    |                            |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

<div id="d172027e1331" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Acesso a Formulários - AD\_Form\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Form_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Formulários

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Formulários" define os Formulários e o tipo de acesso que é outorgado a
este Papel (Função).

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1352" class="table">

<div class="table-title">

Table 1.6. Form Access
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |  Valores (Padrão)  |   Chave restritiva   |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :-----------------: | :-----------: | :----------------: | :------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|       Empresa       | Tabela Direta | (@AD\_Client\_ID@) |                      |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|     Organização     | Tabela Direta |  (@AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|       Perfil        | Tabela Direta |                    | adrole\_adformaccess |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
| Formulário Especial | Tabela Direta |                    | adform\_adformaccess |                                                  |            Special Form            |          The Special Form field identifies a unique Special Form in the system.           |
|        Ativo        |    Sim-Não    |        (Y)         |                      |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|  Escrita e Leitura  |    Sim-Não    |                    |                      |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

<div id="d172027e1467" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Informações de Acesso - AD\_InfoWindow\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_InfoWindow_Access_data)

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1480" class="table">

<div class="table-title">

Table 1.7. Info Access
Fields

</div>

<div class="table-contents">

| Nome do campo |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                                Comentário/Ajuda                                                |
| :-----------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------------------: |
|    Empresa    | Tabela Direta | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                               |
|  Organização  | Tabela Direta |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                               |
|    Perfil     | Tabela Direta |                      |   adrole\_adinfowindowaccess    |                                                  |        Responsibility Role         |           The Role determines security and access a user who has this Role will have in the System.            |
|  Info Window  | Tabela Direta |                      | adinfowindow\_adinfowindowacces |                                                  |   Info and search/select Window    | The Info window is used to search and select records as well as display information relevant to the selection. |
|     Ativo     |    Sim-Não    |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                               |

</div>

</div>

  

<div id="d172027e1581" class="section section">

<div class="titlepage">

<div>

<div>

## 8. Tabela: Acesso a Fluxos de Trabalho - AD\_Workflow\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Workflow_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Fluxos de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Fluxos de Trabalho" define os Fluxos de Trabalho e o tipo de acesso que
é outorgado a este Papel (Função).

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1602" class="table">

<div class="table-title">

Table 1.8. Workflow Access
Fields

</div>

<div class="table-contents">

|   Nome do campo   |  Referência   |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :---------------: | :-----------: | :----------------: | :------------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|      Empresa      | Tabela Direta | (@AD\_Client\_ID@) | ad\_workflowaccess\_client |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Organização    | Tabela Direta |  (@AD\_Org\_ID@)   |  ad\_workflowaccess\_org   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|      Perfil       | Tabela Direta |                    |  adrole\_adworkflowaccess  |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
| Fluxo de Trabalho | Tabela Direta |                    | adworkfow\_workflowaccess  |                                                  |  Workflow or combination of tasks  |              The Workflow field identifies a unique Workflow in the system.               |
|       Ativo       |    Sim-Não    |        (Y)         |                            |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Escrita e Leitura |    Sim-Não    |                    |                            |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

<div id="d172027e1717" class="section section">

<div class="titlepage">

<div>

<div>

## 9. Tabela: Acesso a Tarefas - AD\_Task\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Task_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Tarefas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Tarefas" define as Tarefas e o tipo de acesso que é outorgado a este
Papel (Função).

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1738" class="table">

<div class="table-title">

Table 1.9. Task Access
Fields

</div>

<div class="table-contents">

|   Nome do campo   |  Referência   |  Valores (Padrão)  |    Chave restritiva    |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :---------------: | :-----------: | :----------------: | :--------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|      Empresa      | Tabela Direta | (@AD\_Client\_ID@) | ad\_taskaccess\_client |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Organização    | Tabela Direta |  (@AD\_Org\_ID@)   |  ad\_taskaccess\_org   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|      Perfil       | Tabela Direta |                    |  adrole\_adtaskaccess  |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|     Tarefa SO     | Tabela Direta |                    |  adtask\_adtaskaccess  |                                                  |       Operation System Task        |             The Task field identifies a Operation System Task in the system.              |
|       Ativo       |    Sim-Não    |        (Y)         |                        |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Escrita e Leitura |    Sim-Não    |                    |                        |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

<div id="d172027e1853" class="section section">

<div class="titlepage">

<div>

<div>

## 10. Tabela: Document Action Access - AD\_Document\_Action\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Document_Action_Access_data)

<span class="emphasis">*Descrição:*</span> Define access to document
type / document action / role combinations.

<span class="emphasis">*Comentário/Ajuda:* </span> Define access to
document type / document action / role combinations.

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e1874" class="table">

<div class="table-title">

Table 1.10. Document Action Access
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |             Descrição              |                                                                     Comentário/Ajuda                                                                      |
| :-----------------: | :-----------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa       | Tabela Direta | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                    (ver o mesmo acima)                                                                    |
|     Organização     | Tabela Direta |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                    (ver o mesmo acima)                                                                    |
|       Perfil        | Tabela Direta |                    | adrole\_addocumentactionaccess  |                                                  |        Responsibility Role         |                                 The Role determines security and access a user who has this Role will have in the System.                                 |
|  Tipo de Documento  | Tabela Direta |                    | cdoctype\_addocumentactionacces |                                                  |       Document type or rules       |                                            The Document Type determines document sequence and processing rules                                            |
| Lista de Referência | Tabela Direta |                    | adreflist\_addocumentactionacce |       AD\_Ref\_List.AD\_Reference\_ID=135        |   Reference List based on Table    | The Reference List field indicates a list of reference values from a database tables. Reference lists populate drop down list boxes in data entry screens |
|        Ativo        |    Sim-Não    |                    |                                 |                                                  | (semelhante ao primeiro relatório) |                                                                    (ver o mesmo acima)                                                                    |

</div>

</div>

  

<div id="d172027e1988" class="section section">

<div class="titlepage">

<div>

<div>

## 11. Tabela: Perfis inclusos - AD\_Role\_Included

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Lógica de visualização:*</span> @IsMasterRole@=N

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d172027e2003" class="table">

<div class="table-title">

Table 1.11. Included roles
Fields

</div>

<div class="table-contents">

|  Nome do campo   | Referência |                                               Valores (Padrão)                                               |      Chave restritiva      |    Regra de validação     |                       Descrição                       |                                     Comentário/Ajuda                                      |
| :--------------: | :--------: | :----------------------------------------------------------------------------------------------------------: | :------------------------: | :-----------------------: | :---------------------------------------------------: | :---------------------------------------------------------------------------------------: |
|     Empresa      |  Procurar  |                                              (@AD\_Client\_ID@)                                              |                            |                           |          (semelhante ao primeiro relatório)           |                                    (ver o mesmo acima)                                    |
|   Organização    |  Procurar  |                                               (@AD\_Org\_ID@)                                                |                            |                           |          (semelhante ao primeiro relatório)           |                                    (ver o mesmo acima)                                    |
|    Seqüência     |  Inteiro   | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_Role\_Included WHERE AD\_Role\_ID=@AD\_Role\_ID@) |                            |                           | Method of ordering records; lowest number comes first |                        The Sequence indicates the order of records                        |
|      Ativo       |  Sim-Não   |                                                     (Y)                                                      |                            |                           |          (semelhante ao primeiro relatório)           |                                    (ver o mesmo acima)                                    |
|      Perfil      |  Procurar  |                                                                                                              | ad\_role\_included\_parent |                           |                  Responsibility Role                  | The Role determines security and access a user who has this Role will have in the System. |
| Regras Incluídas |   Tabela   |                                                   AD\_Role                                                   |  ad\_role\_included\_role  | AD\_Role.IsMasterRole='Y' |                                                       |                                                                                           |

</div>

</div>

  

</div>
