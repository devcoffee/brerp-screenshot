---
title: "Tipo de Entidade"
id: TipodeEntidade
---
<div id="d242456e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Entidade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Entidade -
    AD\_EntityType](#d242456e22)</span>
  - <span class="section">[2. Tabela: System Modifin -
    AD\_Modification](#d242456e252)</span>

</div>

<span class="emphasis">*Descrição:* </span> Maintain System Entity Type

<span class="emphasis">*Comentário/Ajuda:* </span>The entity type
determines the ownership of Application Dictionary entries. The types
"Dictionary" and "Compiere" should not be used and are maintainted by
ComPiere (i.e. all changes are reversed during migration to the current
definition).

<span class="emphasis"> *Criado em:* </span>2006-06-11 11:22:09.0

<span class="emphasis">*Atualizado em:* </span>2006-06-11 11:41:58.0

<div id="d242456e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Entidade - AD\_EntityType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_EntityType_data)

<span class="emphasis">*Descrição:*</span> System Entity Type

<span class="emphasis">*Comentário/Ajuda:* </span> The entity type
determines the ownership of Application Dictionary entries. The types
"Dictionary" and "Compiere" should not be used and are maintainted by
ComPiere (i.e. all changes are reversed during migration to the current
definition).

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d242456e39" class="table">

<div class="table-title">

Table 1.1. Entity Type
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |                           Valores (Padrão)                            | Chave restritiva |        Regra de validação         |                            Descrição                             |                                                                                                                                                                                 Comentário/Ajuda                                                                                                                                                                                  |
| :----------------: | :-------------------------------: | :-------------------------------------------------------------------: | :--------------: | :-------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Entidade  |                ID                 |                                                                       |                  |                                   |                        System Entity Type                        |                                                                The entity type determines the ownership of Application Dictionary entries. The types "Dictionary" and "iDempiere" should not be used and are maintainted by iDempiere (i.e. all changes are reversed during migration to the current definition).                                                                 |
|      Empresa       |           Tabela Direta           |                                  (0)                                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                (ver o mesmo acima)                                                                                                                                                                                |
|    Organização     |           Tabela Direta           |                                  (0)                                  |                  |                                   |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                (ver o mesmo acima)                                                                                                                                                                                |
|  Tipo de Entidade  |       Texto Curto (String)        | (@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) |                  |                                   | Dictionary Entity Type; Determines ownership and synchronization |                                                                                        The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!                                                                                        |
|        Nome        |       Texto Curto (String)        |                                                                       |                  |                                   |              Alphanumeric identifier of the entity               |                                                                                                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                    |
|     Descrição      |       Texto Curto (String)        |                                                                       |                  |                                   |             Optional short description of the record             |                                                                                                                                                                    A description is limited to 255 characters.                                                                                                                                                                    |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                                                                       |                  |                                   |                         Comment or Hint                          |                                                                                                                                                    The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                    |
|       Ativo        |              Sim-Não              |                                                                       |                  |                                   |                (semelhante ao primeiro relatório)                |                                                                                                                                                                                (ver o mesmo acima)                                                                                                                                                                                |
|       Versão       |       Texto Curto (String)        |                                                                       |                  |                                   |                 Version of the table definition                  |                                                                                                                                                            The Version indicates the version of this table definition.                                                                                                                                                            |
|     Classpath      |       Texto Curto (String)        |                                                                       |                  |                                   |                       Extension Classpath                        |                                                                                                                     If your appplication requires additional jar files, enter them here. The jar files must be located in the $IDEMPIERE\_HOME/lib directory.                                                                                                                     |
|    ModelPackage    |       Texto Curto (String)        |                                                                       |                  |                                   |                Java Package of the model classes                 | By default, the Java model classes for extensions are in the compiere.model package. If you provide a jar file in the classpath, you can define here your specific model package. The model classes are used to save/modify/delete entries and as well as in Workflow. Refer to the Compiere naming convention to make sure that your class is used rather then the base classes. |
| Register Extension |               Botão               |                                                                       |                  |                                   |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                   |
| AD\_EntityType\_UU |       Texto Curto (String)        |                                                                       |                  |                                   |                                                                  |                                                                                                                                                                                                                                                                                                                                                                                   |

</div>

</div>

  

<div id="d242456e252" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: System Modifin - AD\_Modification

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> System Modification or
Extension

<span class="emphasis">*Comentário/Ajuda:* </span> Description of the
System modification or extension

<span class="emphasis">*Coluna linkada:* </span> Entity Type

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d242456e271" class="table">

<div class="table-title">

Table 1.2. System Modifin
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |                                               Valores (Padrão)                                                |       Chave restritiva       |        Regra de validação         |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :------------------: | :-------------------------------: | :-----------------------------------------------------------------------------------------------------------: | :--------------------------: | :-------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Modification     |                ID                 |                                                                                                               |                              |                                   |                 System Modification or Extension                 |                                                                         Description of the System modification or extension                                                                         |
|       Empresa        |           Tabela Direta           |                                                                                                               |                              | AD\_Client.AD\_Client\_ID \< \> 0 |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|     Organização      |           Tabela Direta           |                                                                                                               |                              |                                   |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Tipo de Entidade   |              Tabela               |             \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)              | adenritytype\_admodification |                                   | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|      Seqüência       |              Inteiro              | (@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD\_Modification WHERE EntityType='@EntityType@') |                              |                                   |      Method of ordering records; lowest number comes first       |                                                                             The Sequence indicates the order of records                                                                             |
|         Nome         |       Texto Curto (String)        |                                                                                                               |                              |                                   |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|      Descrição       |       Texto Curto (String)        |                                                                                                               |                              |                                   |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                                                                                                               |                              |                                   |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|        Ativo         |              Sim-Não              |                                                                                                               |                              |                                   |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|        Versão        |       Texto Curto (String)        |                                                                                                               |                              |                                   |                 Version of the table definition                  |                                                                     The Version indicates the version of this table definition.                                                                     |
| AD\_Modification\_UU |       Texto Curto (String)        |                                                                                                               |                              |                                   |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

</div>
