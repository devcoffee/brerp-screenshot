---
title: "Tarefa"
id: Tarefa
---
<div id="d239351e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tarefa

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tarefa -
    AD\_Task](#d239351e23)</span>
  - <span class="section">[2. Tabela: Tradução de Tarefas -
    AD\_Task\_Trl](#d239351e245)</span>
  - <span class="section">[3. Tabela: Acesso -
    AD\_Task\_Access](#d239351e430)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Tarefas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela
"Gerenciamento de Tarefas" define as diferentes tarefas usadas em Fluxos
de Trabalho e o nível de acesso a essas tarefas.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Tarefa.png)

<div id="d239351e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tarefa - AD\_Task

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Task_data)

<span class="emphasis">*Descrição:*</span> Tarefa

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Tarefa" define
as tarefas exclusivas que serão usadas.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d239351e40" class="table">

<div class="table-title">

Table 1.1. Task
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |                                        Valores (Padrão)                                         | Chave restritiva  |                                             Regra de validação                                              |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :----------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------: | :---------------: | :---------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Tarefa SO         |                ID                 |                                                                                                 |                   |                                                                                                             |                      Operation System Task                       |                                                                  The Task field identifies a Operation System Task in the system.                                                                   |
|         Empresa          |           Tabela Direta           |                                      (@\#AD\_Client\_ID@)                                       |    taskclient     |                                      AD\_Client.AD\_Client\_ID \< \> 0                                      |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Organização        |           Tabela Direta           |                                        (@\#AD\_Org\_ID@)                                        |      taskorg      |                              (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                               |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|           Nome           |       Texto Curto (String)        |                                                                                                 |                   |                                                                                                             |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|        Descrição         |       Texto Curto (String)        |                                                                                                 |                   |                                                                                                             |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                                                                                 |                   |                                                                                                             |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|          Ativo           |              Sim-Não              |                                               (Y)                                               |                   |                                                                                                             |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|     Tipo de Entidade     |              Tabela               |      \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)       |  entityt\_adtask  |                       <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D                        | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
| Nível de Acesso de Dados |               Lista               | Organização Somente Cliente Empresa+Organização Somente Sistema Sistema+Cliente (Empresa) Todos |                   |                                                                                                             |                      Access Level required                       |                                                                   Indicates the access level required for this record or process.                                                                   |
|  Processar no Servidor   |              Sim-Não              |                                               (N)                                               |                   |                                                                                                             |                 Run this Process on Server only                  |                                             Enabling this flag disables to run the process on the client. This potentially decreases the availability.                                              |
|        Comando SO        |       Texto Curto (String)        |                                                                                                 |                   |                                                                                                             |                     Operating System Command                     |           The OS Command is for optionally defining a command to that will be part of this task. For example it can be used to starting a back up process or performing a file transfer.            |
|    Ajuda de Contexto     |           Tabela Direta           |                                                                                                 | adctxhelp\_adtask | AD\_CtxHelp\_ID IN (SELECT AD\_CtxHelp\_ID FROM AD\_CtxHelp WHERE CtxType IS NULL OR CtxType IN ('A', 'K')) |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d239351e245" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução de Tarefas - AD\_Task\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Task_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d239351e258" class="table">

<div class="table-title">

Table 1.2. Task Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa      |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Tarefa SO     |           Tabela Direta           |                    |      ad\_tasktrl      |                                                  |          Operation System Task           |                                       The Task field identifies a Operation System Task in the system.                                       |
|      Idioma       |              Tabela               |    AD\_Language    | ad\_language\_tasktrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo       |              Sim-Não              |        (Y)         |                       |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Traduzida     |              Sim-Não              |                    |                       |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome        |       Texto Curto (String)        |                    |                       |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     |       Texto Curto (String)        |                    |                       |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| AD\_Task\_Trl\_UU |       Texto Curto (String)        |                    |                       |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d239351e430" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Acesso - AD\_Task\_Access

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Task_Access_data)

<span class="emphasis">*Descrição:*</span> Acesso a Tarefas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Acesso a
Tarefas" define os Papéis (Funções) que terão acesso a esta tarefa e o
tipo de acesso que é outorgado a cada Papel (Função).

<span class="emphasis">*Coluna linkada:* </span> OS Task

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d239351e451" class="table">

<div class="table-title">

Table 1.3. Access
Fields

</div>

<div class="table-contents">

|   Nome do campo   |  Referência   |  Valores (Padrão)  |    Chave restritiva    |                Regra de validação                |             Descrição              |                                     Comentário/Ajuda                                      |
| :---------------: | :-----------: | :----------------: | :--------------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------------------------------------------------------------------: |
|      Empresa      | Tabela Direta | (@AD\_Client\_ID@) | ad\_taskaccess\_client |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|    Organização    | Tabela Direta |  (@AD\_Org\_ID@)   |  ad\_taskaccess\_org   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
|     Tarefa SO     | Tabela Direta |                    |  adtask\_adtaskaccess  |                                                  |       Operation System Task        |             The Task field identifies a Operation System Task in the system.              |
|      Perfil       | Tabela Direta |                    |  adrole\_adtaskaccess  |                                                  |        Responsibility Role         | The Role determines security and access a user who has this Role will have in the System. |
|       Ativo       |    Sim-Não    |        (Y)         |                        |                                                  | (semelhante ao primeiro relatório) |                                    (ver o mesmo acima)                                    |
| Escrita e Leitura |    Sim-Não    |                    |                        |                                                  |       Field is read / write        |             The Read Write indicates that this field may be read and updated.             |

</div>

</div>

  

</div>
