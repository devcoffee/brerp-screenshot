---
title: "Preferências do Painel"
id: PreferenciasdoPainel
---
<div id="d177548e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Preferências do Painel

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Preferências -
    PA\_DashboardPreference](#d177548e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-08-22 17:27:17.0

<span class="emphasis">*Atualizado em:* </span>2012-08-22 17:31:25.0

![](/img/manual/PreferenciasdoPainel.png)

<div id="d177548e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Preferências - PA\_DashboardPreference

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_DashboardPreference_data)

<span class="emphasis">*Claúsula Where:*</span>
PA\_DashboardPreference.AD\_Client\_ID = @\#AD\_Client\_ID@

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d177548e36" class="table">

<div class="table-title">

Table 1.1. Preference
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      | Valores (Padrão)  |        Chave restritiva        |                Regra de validação                |                           Descrição                           |                                                 Comentário/Ajuda                                                 |
| :-------------------------: | :------------------: | :---------------: | :----------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
|    Painel de Preferencia    |          ID          |                   |                                |                                                  |                                                               |                                                                                                                  |
|           Empresa           |    Tabela Direta     |                   |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                                |
|         Organização         |    Tabela Direta     | (@\#AD\_Org\_ID@) |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                                |
|       Usuário/Contato       |    Tabela Direta     |        (0)        | aduser\_padashboardpreference  |                                                  | User within the system - Internal or Business Partner Contact |  The User identifies a unique user in the system. This could be an internal user or a business partner contact   |
|           Perfil            |    Tabela Direta     |        (0)        | adrole\_padashboardpreference  |                                                  |                      Responsibility Role                      |            The Role determines security and access a user who has this Role will have in the System.             |
|  PA\_DashboardContent\_ID   |    Tabela Direta     |                   | padashboardcontent\_padashpref |                                                  |                                                               |                                                                                                                  |
|            Ativo            |       Sim-Não        |                   |                                |                                                  |              (semelhante ao primeiro relatório)               |                                               (ver o mesmo acima)                                                |
|        Column Number        |       Inteiro        |        (1)        |                                |                                                  |                Dashboard content column number                |                   Dashboard content column number, not used by the swing client at the moment.                   |
|         Linha Núm.          |        Número        |                   |                                |                                                  |                 Unique line for this document                 | Indicates the unique line for a document. It will also control the display order of the lines within a document. |
|    Recolhida por Padrão     |       Sim-Não        |        (N)        |                                |                                                  |   Flag to set the initial state of collapsible field group.   |                                                                                                                  |
|      Mostre no Painel       |       Sim-Não        |       ('Y')       |                                |                                                  |               Show the dashlet in the dashboard               |                                                                                                                  |
| PA\_DashboardPreference\_UU | Texto Curto (String) |                   |                                |                                                  |                                                               |                                                                                                                  |

</div>

</div>

  

</div>
