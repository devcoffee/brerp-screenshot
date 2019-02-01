---
title: "Edição do Conteúdo do Painel"
id: EdicaodoConteudodoPainel
---
<div id="d81803e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Edição do Conteúdo do Painel

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Edit -
    PA\_DashboardContent](#d81803e23)</span>
  - <span class="section">[2. Tabela: Acesso ao Conteúdo do Dashboard -
    PA\_DashboardContent\_Access](#d81803e392)</span>
  - <span class="section">[3. Tabela: Tradução -
    PA\_DashboardContent\_Trl](#d81803e533)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-07-09 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2013-09-12 17:06:23.0

![](/img/manual/EdicaodoConteudodoPainel.png)

<div id="d81803e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Edit - PA\_DashboardContent

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_DashboardContent_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d81803e32" class="table">

<div class="table-title">

Table 1.1. Dashboard Content
Fields

</div>

<div class="table-contents">

|          Nome do campo          |            Referência            |   Valores (Padrão)   |       Chave restritiva        |                Regra de validação                |                           Descrição                           |                                                               Comentário/Ajuda                                                                |
| :-----------------------------: | :------------------------------: | :------------------: | :---------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------: |
|         Usuário/Contato         |          Tabela Direta           |         (0)          |  aduser\_padashboardcontent   |                                                  | User within the system - Internal or Business Partner Contact |                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|             Perfil              |          Tabela Direta           |         (0)          |  adrole\_padashboardcontent   |            AD\_Role.IsMasterRole='N'             |                      Responsibility Role                      |                           The Role determines security and access a user who has this Role will have in the System.                           |
|    PA\_DashboardContent\_ID     |                ID                |                      |                               |                                                  |                                                               |                                                                                                                                               |
|             Empresa             |          Tabela Direta           |                      |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                              (ver o mesmo acima)                                                              |
|           Organização           |          Tabela Direta           |  (@\#AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                              (ver o mesmo acima)                                                              |
|              Nome               |       Texto Curto (String)       |                      |                               |                                                  |             Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.  |
|              Ativo              |             Sim-Não              |                      |                               |                                                  |              (semelhante ao primeiro relatório)               |                                                              (ver o mesmo acima)                                                              |
|          Column Number          |             Inteiro              |         (1)          |                               |                                                  |                Dashboard content column number                |                                 Dashboard content column number, not used by the swing client at the moment.                                  |
|           Linha Núm.            |              Número              |                      |                               |                                                  |                 Unique line for this document                 |               Indicates the unique line for a document. It will also control the display order of the lines within a document.                |
|            Descrição            |       Texto Curto (String)       |                      |                               |                                                  |           Optional short description of the record            |                                                  A description is limited to 255 characters.                                                  |
|              HTML               | Texto Longo (\> 2000 caracteres) |                      |                               |                                                  |                                                               |                                                                                                                                               |
|     Caminho do arquivo ZUL      |       Texto Curto (String)       |                      |                               |                                                  |                   URI for Dashboard Gadget                    | URI for Dashboard Gadget. This can be absolute path to a zul file or an unique gadget id which is instantiated through OSGi factory services. |
|            Objetivo             |          Tabela Direta           |                      |  pagoal\_padashboardcontent   |                                                  |                       Performance Goal                        |                             The Performance Goal indicates what this users performance will be measured against.                              |
|        Mostrar Objetivo         |              Lista               | Chart HTML Table (T) |                               |                                                  |               Type of goal display on dashboard               |                                               Display goal on dashboard as html table or graph.                                               |
|             Janela              |          Tabela Direta           |                      | adwindow\_padashboardcontent  |                                                  |                 Data entry or display window                  |                                          The Window field identifies a unique Window in the system.                                           |
|            Processo             |          Tabela Direta           |                      | adprocess\_padashboardcontent |                                                  |                       Process or Report                       |                                    The Process field identifies a unique Process or Report in the system.                                     |
| Conteúdo do Formato Incorporado |             Sim-Não              |         (N)          |                               |                                                  |              Embed report content into dashboard              |                                                                                                                                               |
|     Parâmetros de Processo      |       Texto Curto (String)       |                      |                               |                                                  |            Comma separated process parameter list             |                                        A list of name value pair process parameter separated by comma                                         |
|             Gráfico             |          Tabela Direta           |                      |  adchart\_padashboardcontent  |                                                  |                                                               |                                                                                                                                               |
|           Desmontável           |             Sim-Não              |         (Y)          |                               |                                                  |       Flag to indicate the state of the dashboard panel       |                                Flag to indicate the state of the dashboard panel (i.e. collapsible or static)                                 |
|      Recolhida por Padrão       |             Sim-Não              |         (N)          |                               |                                                  |   Flag to set the initial state of collapsible field group.   |                                                                                                                                               |
|        Mostre no Painel         |             Sim-Não              |        ('Y')         |                               |                                                  |               Show the dashlet in the dashboard               |                                                                                                                                               |
|        Mostrar no Login         |             Sim-Não              |         (Y)          |                               |                                                  |                                                               |                                                                                                                                               |

</div>

</div>

  

<div id="d81803e392" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Acesso ao Conteúdo do Dashboard - PA\_DashboardContent\_Access

</div>

</div>

</div>

<span class="emphasis">*Lógica de visualização:*</span>
@\#AD\_Client\_ID@ \> 0

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d81803e403" class="table">

<div class="table-title">

Table 1.2. Dashboard Content Access
Fields

</div>

<div class="table-contents">

|          Nome do campo           |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :------------------------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
| PA\_DashboardContent\_Access\_ID |      ID       |                      |                                 |                                                  |                                                               |                                                                                                               |
|             Empresa              | Tabela Direta | (@\#AD\_Client\_ID@) | adclient\_padashboardcontentacc |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|           Organização            | Tabela Direta |  (@\#AD\_Org\_ID@)   | adorg\_padashboardcontentaccess | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|     PA\_DashboardContent\_ID     | Tabela Direta |                      | padashboardcontacc\_padashboard |                                                  |                                                               |                                                                                                               |
|         Usuário/Contato          |   Procurar    |     AD\_User(-1)     | aduser\_padashboardcontentacces |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|              Perfil              | Tabela Direta |                      | adrole\_padashboardcontentacces |                                                  |                      Responsibility Role                      |           The Role determines security and access a user who has this Role will have in the System.           |
|              Ativo               |    Sim-Não    |         (Y)          |                                 |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |

</div>

</div>

  

<div id="d81803e533" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - PA\_DashboardContent\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_DashboardContent_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d81803e546" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência            |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |          Tabela Direta           | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização        |          Tabela Direta           |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| PA\_DashboardContent\_ID |          Tabela Direta           |                    | padashboardcontent\_padashboard |                                                  |                                          |                                                                                                                                              |
|          Idioma          |              Tabela              |    AD\_Language    | adlangu\_padashboardcontenttrl  |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo           |             Sim-Não              |        (Y)         |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Traduzida         |             Sim-Não              |                    |                                 |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|           Nome           |       Texto Curto (String)       |                    |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         |       Texto Curto (String)       |                    |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|           HTML           | Texto Longo (\> 2000 caracteres) |                    |                                 |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
