---
title: "Pacotes Instalados"
id: PacotesInstalados
---
<div id="d158167e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Pacotes Instalados

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Packages Installed -
    AD\_Package\_Imp\_Inst](#d158167e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Lista de Pacotes Instalados.

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2006-12-11 23:45:25.0

<span class="emphasis">*Atualizado em:* </span>2006-12-12 01:43:07.0

![](/img/manual/PacotesInstalados.png)

<div id="d158167e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Packages Installed - AD\_Package\_Imp\_Inst

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Package_Imp_Inst_data)

<span class="emphasis">*Descrição:*</span> Packages Installed

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d158167e36" class="table">

<div class="table-title">

Table 1.1. Packages Installed
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             | Valores (Padrão) | Chave restritiva |        Regra de validação         |                Descrição                 |                                                                                                  Comentário/Ajuda                                                                                                  |
| :------------------------: | :-------------------------------: | :--------------: | :--------------: | :-------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Ativo            |              Sim-Não              |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
| AD\_PACKAGE\_IMP\_INST\_ID |                ID                 |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|      Processar Agora       |              Sim-Não              |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|           Versão           |       Texto Curto (String)        |                  |                  |                                   |     Version of the table definition      |                                                                            The Version indicates the version of this table definition.                                                                             |
|       Núm. Liberação       |       Texto Curto (String)        |                  |                  |                                   |         Internal Release Number          |                                                                                                                                                                                                                    |
|         Processado         |              Sim-Não              |                  |                  |                                   |     The document has been processed      |                                                                        The Processed checkbox indicates that a document has been processed.                                                                        |
|          Creator           |       Texto Curto (String)        |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|       CreatorContact       | Texto Médio (até 2000 caracteres) |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|     Endereço de e-mail     |       Texto Curto (String)        |                  |                  |                                   |         Electronic Mail Address          | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|          Empresa           |           Tabela Direta           |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
|        Organização         |           Tabela Direta           |                  |                  |                                   |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
|            Nome            |       Texto Curto (String)        |                  |                  |                                   |  Alphanumeric identifier of the entity   |                                    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                    |
|        PK\_Version         |       Texto Curto (String)        |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|         Descrição          | Texto Médio (até 2000 caracteres) |                  |                  |                                   | Optional short description of the record |                                                                                    A description is limited to 255 characters.                                                                                     |
|         PK\_Status         |       Texto Curto (String)        |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
|           Criado           |             Data+Hora             |    (SYSDATE)     |                  |                                   |       Date this record was created       |                                                                         The Created field indicates the date that this record was created.                                                                         |
|         Atualizado         |             Data+Hora             |    (SYSDATE)     |                  |                                   |       Date this record was updated       |                                                                         The Updated field indicates the date that this record was updated.                                                                         |
|         Uninstall          |              Sim-Não              |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |
| AD\_Package\_Imp\_Inst\_UU |       Texto Curto (String)        |                  |                  |                                   |                                          |                                                                                                                                                                                                                    |

</div>

</div>

  

</div>
