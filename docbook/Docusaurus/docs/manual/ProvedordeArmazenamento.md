---
title: "Provedor de Armazenamento"
id: ProvedordeArmazenamento
---
<div id="d187260e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Provedor de Armazenamento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Provedor de Armazenamento -
    AD\_StorageProvider](#d187260e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-11-23 18:26:10.0

<span class="emphasis">*Atualizado em:* </span>2012-11-23 18:26:10.0

![](/img/manual/ProvedordeArmazenamento.png)

<div id="d187260e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Provedor de Armazenamento - AD\_StorageProvider

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_StorageProvider_data)

<span class="emphasis">*Descrição:*</span> Provedor de Armazenamento

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d187260e36" class="table">

<div class="table-title">

Table 1.1. Storage Provider
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                        Descrição                        |                                                                          Comentário/Ajuda                                                                           |
| :-----------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Provedor de Armazenamento |          ID          |                      |                  |                                                  |                                                         |                                                                                                                                                                     |
|          Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)            |                                                                         (ver o mesmo acima)                                                                         |
|        Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)            |                                                                         (ver o mesmo acima)                                                                         |
|           Nome            | Texto Curto (String) |                      |                  |                                                  |          Alphanumeric identifier of the entity          |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.             |
|          Método           |        Lista         | Database File System |                  |                                                  |                                                         |                                                                                                                                                                     |
|            URL            |         URL          |                      |                  |                                                  |    Full URL address - e.g. http://www.idempiere.org     |                                            The URL defines an fully qualified web address like http://www.idempiere.org                                             |
|          Folder           | Texto Curto (String) |                      |                  |                                                  | A folder on a local or remote system to store data into |                                                         We store files in folders, especially media files.                                                          |
|     Email Registrado      | Texto Curto (String) |                      |                  |                                                  |                                                         |                                                                                                                                                                     |
|           Senha           | Texto Curto (String) |                      |                  |                                                  |         Password of any length (case sensitive)         | The Password for this User. Passwords are required to identify authorized users. For iDempiere Users, you can change the password via the Process "Reset Password". |
|           Ativo           |       Sim-Não        |         (Y)          |                  |                                                  |           (semelhante ao primeiro relatório)            |                                                                         (ver o mesmo acima)                                                                         |

</div>

</div>

  

</div>
