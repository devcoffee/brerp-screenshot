---
title: "Acesso a Dados de Função"
id: AcessoaDadosdeFuncao
---
<div id="d1570e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Acesso a Dados de Função

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Perfil -
    AD\_Role](#d1570e23)</span>
  - <span class="section">[2. Tabela: Acesso de Tabela -
    AD\_Table\_Access](#d1570e437)</span>
  - <span class="section">[3. Tabela: Acesso de Coluna -
    AD\_Column\_Access](#d1570e631)</span>
  - <span class="section">[4. Tabela: Acesso de Registro -
    AD\_Record\_Access](#d1570e794)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Regras de
Acesso a Dados

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento de
Regras de Acesso a Dados de Papéis (Funções)/Responsabilidades. Note que
a informação de acesso é memorizada e requer re-login ou reset da
memória cache.

<span class="emphasis"> *Criado em:* </span>2003-05-28 22:59:19.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/AcessoaDadosdeFuncao.png)

<div id="d1570e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Perfil - AD\_Role

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Role_data)

<span class="emphasis">*Descrição:*</span> Perfil com Restrição de
Acesso de Dados

<span class="emphasis">*Comentário/Ajuda:* </span> Selecione o Perfil
com Restrição de Acesso de Dados. Note que a informação de acesso é
memorizada e requer re-login ou reset da memória cache.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d1570e40" class="table">

<div class="table-title">

Table 1.1. Role
Fields

</div>

<div class="table-contents">

|              Nome do campo              |      Referência      |                Valores (Padrão)                 |     Chave restritiva     |                         Regra de validação                          |                                Descrição                                 |                                                                                       Comentário/Ajuda                                                                                       |
| :-------------------------------------: | :------------------: | :---------------------------------------------: | :----------------------: | :-----------------------------------------------------------------: | :----------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Aprovar Documentos próprios       |       Sim-Não        |                                                 |                          |                                                                     |           Users with this role can approve their own documents           |                                            If a user cannot approve their own documents (orders, etc.), it needs to be approved by someone else.                                             |
|                 Manual                  |       Sim-Não        |                       (Y)                       |                          |                                                                     |                         This is a manual process                         |                                                              The Manual check box indicates if the process will done manually.                                                               |
|  Usar Acesso de Usuários à Organização  |       Sim-Não        |                       (N)                       |                          |                                                                     |        Use Org Access defined by user instead of Role Org Access         |                                 You can define the access to Organization either by Role or by User. You would select this, if you have many organizations.                                  |
|                 Perfil                  |          ID          |                                                 |                          |                                                                     |                           Responsibility Role                            |                                                  The Role determines security and access a user who has this Role will have in the System.                                                   |
|          Árvore da Organização          |        Tabela        |                    AD\_Tree                     |    adtreeorg\_adrole     | AD\_Tree.TreeType='OO' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ | Trees are used for (financial) reporting and security access (via role)  |                                                            Trees are used for (finanial) reporting and security access (via role)                                                            |
|        Sobrescrever Preço Limite        |       Sim-Não        |                       (N)                       |                          |                                                                     |     Overwrite Price Limit if the Price List enforces the Price Limit     |                            The Price List allows to enforce the Price Limit. If set, a user with this role can overwrite the price limit (i.e. enter any price).                             |
|               Supervisor                |       Procurar       |               AD\_User - Internal               | adusersupervisor\_adrole |                                                                     | Supervisor for this user/organization - used for escalation and approval |                                       The Supervisor indicates who will be used for forwarding and escalating issues for this user - or for approvals.                                       |
|            Nível do Usuário             |        Lista         | Empresa Empresa+Organização Organização Sistema |                          |                                                                     |                        System Client Organization                        |        The User Level field determines if users of this Role will have access to System level data, Organization level data, Client level data or Client and Organization level data.        |
|                  Ativo                  |       Sim-Não        |                       (Y)                       |                          |                                                                     |                    (semelhante ao primeiro relatório)                    |                                                                                     (ver o mesmo acima)                                                                                      |
|                Moeda De                 |    Tabela Direta     |              (@$C\_Currency\_ID@)               |  c\_currency\_ad\_role   |                                                                     |                       The Currency for this record                       |                                                        Indicates the Currency to be used when processing or reporting on this record                                                         |
|           Valor da Aprovação            |        Valor         |                                                 |                          |                                                                     |                 The approval amount limit for this role                  |                                                The Approval Amount field indicates the amount limit this Role has for approval of documents.                                                 |
|             Árvore de Menu              |        Tabela        |                    AD\_Tree                     |      adtree\_adrole      |                       AD\_Tree.TreeType='MM'                        |                             Tree of the menu                             |                                                                                       Menu access tree                                                                                       |
|                 Empresa                 |    Tabela Direta     |              (@\#AD\_Client\_ID@)               |      ad\_roleclient      |                  AD\_Client.AD\_Client\_ID \< \> 0                  |                    (semelhante ao primeiro relatório)                    |                                                                                     (ver o mesmo acima)                                                                                      |
|               Organização               |    Tabela Direta     |                (@\#AD\_Org\_ID@)                |       ad\_roleorg        |          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)           |                    (semelhante ao primeiro relatório)                    |                                                                                     (ver o mesmo acima)                                                                                      |
|                  Nome                   | Texto Curto (String) |                                                 |                          |                                                                     |                  Alphanumeric identifier of the entity                   |                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                         |
|                Descrição                | Texto Curto (String) |                                                 |                          |                                                                     |                 Optional short description of the record                 |                                                                         A description is limited to 255 characters.                                                                          |
|          Nível de Preferência           |        Lista         |     Empresa Nenhum Organização Usuário (O)      |                          |                                                                     |               Determines what preferences the user can set               |      Preferences allow you to define default values. If set to None, you cannot set any preference nor value preference. Only if set to Client, you can see the Record Info Change Log.      |
| Gerenciamento do Registro de Alterações |       Sim-Não        |                       (N)                       |                          |                                                                     |                        Maintain a log of changes                         |                                                                       If selected, a log of all changes is maintained.                                                                       |
|          Exibir Contabilidade           |       Sim-Não        |                       (N)                       |                          |                                                                     |           Users with this role can see accounting information            |                                                                 This allows to prevent access to any accounting information.                                                                 |
|           Acessar Todas Orgs.           |       Sim-Não        |                       (N)                       |                          |                                                                     |      Access all Organizations (no org access control) of the client      |                   When selected, the role has access to all organizations of the client automatically. This also increases performance where you have many organizations.                    |
|         Pode Emitir Relatórios          |       Sim-Não        |                       (Y)                       |                          |                                                                     |                 Users with this role can create reports                  |                                                                       You can restrict the ability to report on data.                                                                        |
|              Pode Exportar              |       Sim-Não        |                       (Y)                       |                          |                                                                     |                   Users with this role can export data                   |                                                                 You can restrict the ability to export data from iDempiere.                                                                  |
|              Trava Pessoal              |       Sim-Não        |                       (N)                       |                          |                                                                     |         Allow users with role to lock access to personal records         | If enabled, the user with the role can prevent access of others to personal records. If a record is locked, only the user or people who can read personal locked records can see the record. |
|             Acesso Pessoal              |       Sim-Não        |                       (N)                       |                          |                                                                     |                   Allow access to all personal records                   |                                                              Users of this role have access to all records locked as personal.                                                               |
|              AD\_Role\_UU               | Texto Curto (String) |                                                 |                          |                                                                     |                                                                          |                                                                                                                                                                                              |

</div>

</div>

  

<div id="d1570e437" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Acesso de Tabela - AD\_Table\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Table_Access_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Acesso de
Tabela

<span class="emphasis">*Comentário/Ajuda:* </span> Se listado aqui, o
Papel (Função) pode (ou não) acessar todos os dados desta tabela, mesmo
se o Papel (Função) tiver acesso à funcionalidade. Se você "Inclui
Acesso" a uma Tabela e seleciona "Somente Leitura", você pode somente
ler os dados (senão, terá acesso completo). Se você "Exclui Acesso" a
uma Tabela e seleciona "Somente Leitura", você pode somente ler os dados
(senão, não terá acesso). Por favor, note que as regras de acesso a
tabelas aqui são em adição aos Níveis de Acesso de Dados definidos para
uma Tabela e o Nível de Usuário definido para um Papel (Função). Estas
regras são avaliadas primeiro e você somente precisa definir as exceções
a estas regras aqui. \< p\> Note que a informação de acesso é memorizada
e requer re-login ou reset da memória cache. Esteja ciente que se você
usa "Regras de Inclusão", que você necessita incluir também diversas
entidades de apoio. Como uma alternativa, outorgue acesso somente à
funcionalidade exigida.

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d1570e458" class="table">

<div class="table-title">

Table 1.2. Table Access
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |               Valores (Padrão)               |    Chave restritiva    |                Regra de validação                |                                Descrição                                |                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                             |
| :-------------: | :-----------: | :------------------------------------------: | :--------------------: | :----------------------------------------------: | :---------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta |              (@AD\_Client\_ID@)              |  ad\_dataaccessclient  |        AD\_Client.AD\_Client\_ID \< \> 0         |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|   Organização   | Tabela Direta |               (@AD\_Org\_ID@)                |   ad\_dataaccessorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|     Perfil      | Tabela Direta |                                              | adrole\_adtableaccess  |                                                  |                           Responsibility Role                           |                                                                                                                                                                                        The Role determines security and access a user who has this Role will have in the System.                                                                                                                                                                                         |
|     Tabela      | Tabela Direta |                                              | adtable\_adtableaccess |                                                  |                       Database Table information                        |                                                                                                                                                                                                   The Database Table provides the information of the table definition                                                                                                                                                                                                    |
|      Ativo      |    Sim-Não    |                     (Y)                      |                        |                                                  |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|     Excluir     |    Sim-Não    |                     (Y)                      |                        |                                                  | Exclude access to the data - if not selected Include access to the data | If selected (excluded), the role cannot access the data specified. If not selected (included), the role can ONLY access the data specified. Exclude items represent a negative list (i.e. you don't have access to the listed items). Include items represent a positive list (i.e. you only have access to the listed items). You would usually not mix Exclude and Include. If you have one include rule in your list, you would only have access to that item anyway. |
| Tipo de Acesso  |     Lista     | Acessando Exportando Gerando o Relatório (A) |                        |                                                  |                    The type of access for this rule                     |                                                                                                                    If you restrict Access to the entity, you also cannot Report or Export it (i.e. to have access is a requirement that you can report or export the data). The Report and Export rules are further restrictions if you have access.                                                                                                                     |
| Somente Leitura |    Sim-Não    |                                              |                        |                                                  |                           Field is read only                            |                                                                                                                                                                                             The Read Only indicates that this field may only be Read. It may not be updated.                                                                                                                                                                                             |
|   Can Report    |    Sim-Não    |                                              |                        |                                                  |                 Users with this role can create reports                 |                                                                                                                                                                                                             You can restrict the ability to report on data.                                                                                                                                                                                                              |
|   Can Export    |    Sim-Não    |                                              |                        |                                                  |                  Users with this role can export data                   |                                                                                                                                                                                                       You can restrict the ability to export data from iDempiere.                                                                                                                                                                                                        |

</div>

</div>

  

<div id="d1570e631" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Acesso de Coluna - AD\_Column\_Access

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Gerenciamento de Acesso de
Coluna

<span class="emphasis">*Comentário/Ajuda:* </span> Se listado aqui, o
Papel (Função) pode (ou não) acessar as colunas desta tabela, mesmo se o
Papel (Função) tiver acesso à funcionalidade. Se você "Inclui Acesso" a
uma coluna e seleciona "Somente Leitura", você pode somente ler os dados
(senão, terá acesso completo). Se você "Exclui Acesso" a uma coluna e
seleciona "Somente Leitura", você pode somente ler os dados (senão, não
terá acesso). Note que a informação de acesso é memorizada e requer
re-login ou reset da memória cache.

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d1570e650" class="table">

<div class="table-title">

Table 1.3. Column Access
Fields

</div>

<div class="table-contents">

|  Nome do campo  |  Referência   |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                                Descrição                                |                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                             |
| :-------------: | :-----------: | :----------------: | :----------------------: | :----------------------------------------------: | :---------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa     | Tabela Direta | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|   Organização   | Tabela Direta |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|     Perfil      | Tabela Direta |                    |  adrole\_adcolumnaccess  |                                                  |                           Responsibility Role                           |                                                                                                                                                                                        The Role determines security and access a user who has this Role will have in the System.                                                                                                                                                                                         |
|     Tabela      | Tabela Direta |                    | adtable\_adcolumnaccess  |                                                  |                       Database Table information                        |                                                                                                                                                                                                   The Database Table provides the information of the table definition                                                                                                                                                                                                    |
|     Coluna      | Tabela Direta |                    | adcolumn\_adcolumnaccess |     AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@     |                           Column in the table                           |                                                                                                                                                                                                                 Link to the database column of the table                                                                                                                                                                                                                 |
|      Ativo      |    Sim-Não    |        (Y)         |                          |                                                  |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|     Excluir     |    Sim-Não    |        (Y)         |                          |                                                  | Exclude access to the data - if not selected Include access to the data | If selected (excluded), the role cannot access the data specified. If not selected (included), the role can ONLY access the data specified. Exclude items represent a negative list (i.e. you don't have access to the listed items). Include items represent a positive list (i.e. you only have access to the listed items). You would usually not mix Exclude and Include. If you have one include rule in your list, you would only have access to that item anyway. |
| Somente Leitura |    Sim-Não    |                    |                          |                                                  |                           Field is read only                            |                                                                                                                                                                                             The Read Only indicates that this field may only be Read. It may not be updated.                                                                                                                                                                                             |

</div>

</div>

  

<div id="d1570e794" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Acesso de Registro - AD\_Record\_Access

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Gerenciamento de Acesso de
Registro

<span class="emphasis">*Comentário/Ajuda:* </span> Você cria registros
de "Acesso de Registro" habilitando "Trava Pessoal" para o Papel
(Função) administrativo e dando um Ctl-Lock (segurando a tecla Ctrl ao
clicar o Botão de Trava). \< p\> Se listado aqui, o Papel (Função) pode
(ou não) acessar os registros de dados desta tabela, mesmo se o Papel
(Função) tiver acesso à funcionalidade. Se você "Inclui Acesso" a um
registro e seleciona "Somente Leitura", você pode somente ler os dados
(senão, terá acesso completo). Se você "Exclui Acesso" a uma registro e
seleciona "Somente Leitura", você pode somente ler os dados (senão, não
terá acesso). Note que a informação de acesso é memorizada e requer
re-login ou reset da memória cache.

<span class="emphasis">*Coluna linkada:* </span> Role

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d1570e813" class="table">

<div class="table-title">

Table 1.4. Record Access
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |  Valores (Padrão)  |    Chave restritiva     |                Regra de validação                |                                Descrição                                |                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                             |
| :--------------------: | :------------------: | :----------------: | :---------------------: | :----------------------------------------------: | :---------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|      Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|         Perfil         |    Tabela Direta     |                    | adrole\_ardecordaccess  |                                                  |                           Responsibility Role                           |                                                                                                                                                                                        The Role determines security and access a user who has this Role will have in the System.                                                                                                                                                                                         |
|         Tabela         |    Tabela Direta     |                    | adtable\_adrecordaccess |                                                  |                       Database Table information                        |                                                                                                                                                                                                   The Database Table provides the information of the table definition                                                                                                                                                                                                    |
|     ID do Registro     |        Botão         |                    |                         |                                                  |                        Direct internal record ID                        |                                                                                                                           The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known.                                                                                                                           |
|         Ativo          |       Sim-Não        |        (Y)         |                         |                                                  |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|        Excluir         |       Sim-Não        |        (Y)         |                         |                                                  | Exclude access to the data - if not selected Include access to the data | If selected (excluded), the role cannot access the data specified. If not selected (included), the role can ONLY access the data specified. Exclude items represent a negative list (i.e. you don't have access to the listed items). Include items represent a positive list (i.e. you only have access to the listed items). You would usually not mix Exclude and Include. If you have one include rule in your list, you would only have access to that item anyway. |
|    Somente Leitura     |       Sim-Não        |                    |                         |                                                  |                           Field is read only                            |                                                                                                                                                                                             The Read Only indicates that this field may only be Read. It may not be updated.                                                                                                                                                                                             |
| Entidades Dependentes  |       Sim-Não        |        (N)         |                         |                                                  |                 Also check access in dependent entities                 |            Also dependent entities are included. Please be aware, that enabling this rule has severe consequences and that this is only wanted in some circumstances. \< p\> Example Rule: "Include Payment Term Immediate with Dependent Entities" Primary effect: users with this role can only select the payment term Immediate Secondary effect (dependent entities): users with this role can see only invoices/orders with the payment term immediate.            |
| AD\_Record\_Access\_UU | Texto Curto (String) |                    |                         |                                                  |                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
