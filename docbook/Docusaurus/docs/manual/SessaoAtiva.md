---
title: "Sessão Ativa"
id: SessaoAtiva
---
<div id="d211753e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Sessão Ativa

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Sessões -
    AD\_SessionInfo\_v](#d211753e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> List of Current Logged in
user

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-10-11 18:17:05.0

<span class="emphasis">*Atualizado em:* </span>2012-10-18 13:30:02.0

<div id="d211753e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Sessões - AD\_SessionInfo\_v

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Sessões Ativas

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d211753e33" class="table">

<div class="table-title">

Table 1.1. Sessions
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      | Valores (Padrão) | Chave restritiva |        Regra de validação         |             Descrição              |                                                                                                  Comentário/Ajuda                                                                                                  |
| :--------------------: | :------------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| ad\_sessioninfo\_v\_uu | Texto Curto (String) |                  |                  |                                   |                                    |                                                                                                                                                                                                                    |
|        Empresa         |    Tabela Direta     |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 | (semelhante ao primeiro relatório) |                                                                                                (ver o mesmo acima)                                                                                                 |
|      Organização       |    Tabela Direta     |                  |                  |                                   | (semelhante ao primeiro relatório) |                                                                                                (ver o mesmo acima)                                                                                                 |
|   AD\_SessionInfo\_v   |          ID          |                  |                  |                                   |                                    |                                                                                                                                                                                                                    |
|    Nome do Clinete     | Texto Curto (String) |                  |                  |                                   |                                    |                                                                                   Client in which current session user logged in                                                                                   |
|  Nome da Organização   | Texto Curto (String) |                  |                  |                                   |      Name of the Organization      |                                                                                                                                                                                                                    |
|       End.Remoto       | Texto Curto (String) |                  |                  |                                   |           Remote Address           |                                                                          The Remote Address indicates an alternative or external address.                                                                          |
|   Hospedeiro Remoto    | Texto Curto (String) |                  |                  |                                   |          Remote host Info          |                                                                                                                                                                                                                    |
|    Nome de Usuário     | Texto Curto (String) |                  |                  |                                   |                                    |                                                                                                  Login User Name                                                                                                   |
|   Endereço de e-mail   | Texto Curto (String) |                  |                  |                                   |      Electronic Mail Address       | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|   Perfil do Usuário    | Texto Curto (String) |                  |                  |                                   |                                    |                                                                                          Role name of user logged in with                                                                                          |
|     Data de Login      |      Data+Hora       |                  |                  |                                   |                                    |                                                                                                                                                                                                                    |
|         Sessão         |    Tabela Direta     |                  |                  |                                   |     User Session Online or Web     |                                                                                         Online or Web Session Information                                                                                          |
|       Sessão Web       | Texto Curto (String) |                  |                  |                                   |           Web Session ID           |                                                                                                                                                                                                                    |
|         Criado         |      Data+Hora       |    (SYSDATE)     |                  |                                   |    Date this record was created    |                                                                         The Created field indicates the date that this record was created.                                                                         |
|       Atualizado       |      Data+Hora       |    (SYSDATE)     |                  |                                   |    Date this record was updated    |                                                                         The Updated field indicates the date that this record was updated.                                                                         |
|    Nome do Servidor    | Texto Curto (String) |                  |                  |                                   |                                    |                                                                                                 Node instance name                                                                                                 |
|         Ativo          |       Sim-Não        |                  |                  |                                   | (semelhante ao primeiro relatório) |                                                                                                (ver o mesmo acima)                                                                                                 |

</div>

</div>

  

</div>
