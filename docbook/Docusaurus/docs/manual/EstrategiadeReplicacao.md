---
title: "Estratégia de Replicação"
id: EstrategiadeReplicacao
---
<div id="d90095e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Estratégia de Replicação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Estratégia de Replicação -
    AD\_ReplicationStrategy](#d90095e23)</span>
  - <span class="section">[2. Tabela: Tabela de Replicação -
    AD\_ReplicationTable](#d90095e229)</span>
  - <span class="section">[3. Tabela: Documento de Replicação -
    AD\_ReplicationDocument](#d90095e422)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Estratégia
de Replicação de Dados

<span class="emphasis">*Comentário/Ajuda:* </span>A "Estratégia de
Replicação de Dados" determina como e quais tabelas serão replicadas.
Note que a migração não sincroniza itens do Dicionário de Aplicação.

<span class="emphasis"> *Criado em:* </span>2003-06-19 16:30:38.0

<span class="emphasis">*Atualizado em:* </span>2008-03-24 09:09:35.0

![](/img/manual/EstrategiadeReplicacao.png)

<div id="d90095e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Estratégia de Replicação - AD\_ReplicationStrategy

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ReplicationStrategy_data)

<span class="emphasis">*Descrição:*</span> Estratégia de Replicação de
Dados

<span class="emphasis">*Comentário/Ajuda:* </span> A "Estratégia de
Replicação de Dados" determina como e quais tabelas serão replicadas.
Note que a migração não sincroniza itens do Dicionário de Aplicação.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d90095e40" class="table">

<div class="table-title">

Table 1.1. Replication Strategy
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |                                   Valores (Padrão)                                   |        Chave restritiva         |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :-------------------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Estratégia de Replicação   |                ID                 |                                                                                      |                                 |                                                                |                    Data Replication Strategy                     |                                                             The Data Replication Strategy determines what and how tables are replicated                                                             |
|           Empresa           |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                 |                                 |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|         Organização         |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                   |                                 |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Chave de Busca        |       Texto Curto (String)        |                                                                                      |                                 |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|            Nome             |       Texto Curto (String)        |                                                                                      |                                 |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|          Descrição          |       Texto Curto (String)        |                                                                                      |                                 |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|      Comentário/Ajuda       | Texto Médio (até 2000 caracteres) |                                                                                      |                                 |                                                                |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|            Ativo            |              Sim-Não              |                                         (Y)                                          |                                 |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|      Tipo de Entidade       |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adreplicationstrategy  | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|  Processador de Exportação  |           Tabela Direta           |                                                                                      | expprocessor\_adreplicationstra |                                                                |                                                                  |                                                                                                                                                                                                     |
| AD\_ReplicationStrategy\_UU |       Texto Curto (String)        |                                                                                      |                                 |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d90095e229" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tabela de Replicação - AD\_ReplicationTable

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ReplicationTable_data)

<span class="emphasis">*Descrição:*</span> Informação de Tabela de
Estratégia de Replicação de Dados

<span class="emphasis">*Comentário/Ajuda:* </span> Determina como a
tabela é replicada. Você tem pleno acesso a Tabelas Locais, Tabelas de
Referência estão em sistemas Remotos e são "Somente Leitura". Os dados
de tabelas de Fusão em sistemas Remotos são copiados ao sistema central.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d90095e246" class="table">

<div class="table-title">

Table 1.2. Replication Table
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |                                   Valores (Padrão)                                   |      Chave restritiva       |                       Regra de validação                       |                            Descrição                             |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :----------------------: | :------------------: | :----------------------------------------------------------------------------------: | :-------------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tabela de Replicação   |          ID          |                                                                                      |                             |                                                                |               Data Replication Strategy Table Info               |                                                                                                                                      Determines how the table is replicated                                                                                                                                      |
|         Empresa          |    Tabela Direta     |                                  (@AD\_Client\_ID@)                                  |                             |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|       Organização        |    Tabela Direta     |                                   (@AD\_Org\_ID@)                                    |                             |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
| Estratégia de Replicação |    Tabela Direta     |                                                                                      |  adrepstrategy\_adreptable  |                                                                |                    Data Replication Strategy                     |                                                                                                                   The Data Replication Strategy determines what and how tables are replicated                                                                                                                    |
|          Tabela          |    Tabela Direta     |                                                                                      | adtable\_adreplicationtable |                                                                |                    Database Table information                    |                                                                                                                       The Database Table provides the information of the table definition                                                                                                                        |
|          Ativo           |       Sim-Não        |                                         (Y)                                          |                             |                                                                |                (semelhante ao primeiro relatório)                |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|        Descrição         | Texto Curto (String) |                                                                                      |                             |                                                                |             Optional short description of the record             |                                                                                                                                   A description is limited to 255 characters.                                                                                                                                    |
|   Lista de Replicação    |        Lista         |                           Broadcast Local Fusão Referência                           |                             |                                                                |                     Type of Data Replication                     | The Type of data Replication determines the direction of the data replication. Reference means that the data in this system is read only -\> Local means that the data in this system is not replicated to other systems - Merge means that the data in this system is synchronized with the other system \< -\> |
|     Tipo de Entidade     |        Tabela        | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adreplicationtable | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization |                                                       The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!                                                        |
| AD\_ReplicationTable\_UU | Texto Curto (String) |                                                                                      |                             |                                                                |                                                                  |                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

<div id="d90095e422" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Documento de Replicação - AD\_ReplicationDocument

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ReplicationDocument_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d90095e431" class="table">

<div class="table-title">

Table 1.3. Replication Document
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |         Valores (Padrão)         |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :-------------------------: | :------------------: | :------------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Documento de Replicação   |          ID          |                                  |                                 |                                                  |                                          |                                                                                                                                                                                                                                                                                                                  |
|           Empresa           |    Tabela Direta     |       (@\#AD\_Client\_ID@)       |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|         Organização         |    Tabela Direta     |        (@\#AD\_Org\_ID@)         |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|  Estratégia de Replicação   |          ID          |                                  |                                 |                                                  |        Data Replication Strategy         |                                                                                                                   The Data Replication Strategy determines what and how tables are replicated                                                                                                                    |
|      Tipo de Documento      |    Tabela Direta     |                                  | cdoctype\_adreplicationdocument |                                                  |          Document type or rules          |                                                                                                                       The Document Type determines document sequence and processing rules                                                                                                                        |
|           Tabela            |       Procurar       |                                  | adtable\_adreplicationdocument  |                                                  |        Database Table information        |                                                                                                                       The Database Table provides the information of the table definition                                                                                                                        |
|            Ativo            |       Sim-Não        |              ('Y')               |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|          Descrição          | Texto Curto (String) |                                  |                                 |                                                  | Optional short description of the record |                                                                                                                                   A description is limited to 255 characters.                                                                                                                                    |
|     Lista de Replicação     |        Lista         | Broadcast Local Fusão Referência |                                 |                                                  |         Type of Data Replication         | The Type of data Replication determines the direction of the data replication. Reference means that the data in this system is read only -\> Local means that the data in this system is not replicated to other systems - Merge means that the data in this system is synchronized with the other system \< -\> |
| AD\_ReplicationDocument\_UU | Texto Curto (String) |                                  |                                 |                                                  |                                          |                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

</div>
