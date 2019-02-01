---
title: "Scripts de Migração"
id: ScriptsdeMigracao
---
<div id="d209471e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Scripts de Migração

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Scripts de Migração -
    AD\_MigrationScript](#d209471e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Scripts de Migração

<span class="emphasis">*Comentário/Ajuda:* </span>Controla e armazena os
scripts de migração aplicados no sistema

<span class="emphasis"> *Criado em:* </span>2008-02-15 15:41:58.0

<span class="emphasis">*Atualizado em:* </span>2008-02-15 15:41:58.0

<div id="d209471e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Scripts de Migração - AD\_MigrationScript

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_MigrationScript_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d209471e31" class="table">

<div class="table-title">

Table 1.1. Migration Scripts
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |      Valores (Padrão)       | Chave restritiva |        Regra de validação         |                          Descrição                           |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :-------------------------------: | :-------------------------: | :--------------: | :-------------------------------: | :----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Migração de Script    |                ID                 |                             |                  |                                   | Table to check whether the migration script has been applied |                                                                                                                                              |
|         Empresa         |           Tabela Direta           |                             |                  | AD\_Client.AD\_Client\_ID \< \> 0 |              (semelhante ao primeiro relatório)              |                                                             (ver o mesmo acima)                                                              |
|       Organização       |           Tabela Direta           |                             |                  |                                   |              (semelhante ao primeiro relatório)              |                                                             (ver o mesmo acima)                                                              |
|          Nome           |       Texto Curto (String)        |                             |                  |                                   |            Alphanumeric identifier of the entity             | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Nome do Arquivo     |             FileName              |                             |                  |                                   |                Name of the local file or URL                 |                            Name of a file in the local directory space - or URL (file://.., http://.., ftp://..)                             |
|  Nome do Desenvolvedor  |       Texto Curto (String)        |                             |                  |                                   |                                                              |                                                                                                                                              |
|     Aplicar Script      |              Sim-Não              |                             |                  |                                   |                                                              |                                                                                                                                              |
|          Ativo          |              Sim-Não              |                             |                  |                                   |              (semelhante ao primeiro relatório)              |                                                             (ver o mesmo acima)                                                              |
|         Projeto         |       Texto Curto (String)        |                             |                  |                                   |                     Name of the Project                      |                                                                                                                                              |
|        Descrição        | Texto Médio (até 2000 caracteres) |                             |                  |                                   |           Optional short description of the record           |                                                 A description is limited to 255 characters.                                                  |
|       Referência        | Texto Médio (até 2000 caracteres) |                             |                  |                                   |                  Reference for this record                   |                                              The Reference displays the source document number.                                              |
|           URL           |                URL                |                             |                  |                                   |       Full URL address - e.g. http://www.idempiere.org       |                                 The URL defines an fully qualified web address like http://www.idempiere.org                                 |
|     Núm. Liberação      | Texto Médio (até 2000 caracteres) |                             |                  |                                   |                   Internal Release Number                    |                                                                                                                                              |
|         Estado          |               Lista               | Completed Error In Progress |                  |                                   |            Status of the currently running check             |                                                    Status of the currently running check                                                     |
| Apply Migration Scripts |               Botão               |                             |                  |                                   |                                                              |                                                                                                                                              |
|    Roteiro (Script)     |              Binário              |                             |                  |                                   |       Dynamic Java Language Script to calculate result       |                                     Use Java language constructs to define the result of the calculation                                     |
| AD\_MigrationScript\_UU |       Texto Curto (String)        |                             |                  |                                   |                                                              |                                                                                                                                              |

</div>

</div>

  

</div>
