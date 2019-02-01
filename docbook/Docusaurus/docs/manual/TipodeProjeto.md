---
title: "Tipo de Projeto"
id: TipodeProjeto
---
<div id="d242897e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Projeto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Projeto -
    C\_ProjectType](#d242897e22)</span>
  - <span class="section">[2. Tabela: Fase Padrão -
    C\_Phase](#d242897e197)</span>
  - <span class="section">[3. Tabela: Tarefa Padrão -
    C\_Task](#d242897e415)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Tipo e Fase
de Projeto

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento de Tipos
de Projetos e suas Fases com informação de desempenho padrão

<span class="emphasis"> *Criado em:* </span>2003-05-28 22:08:57.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d242897e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Projeto - C\_ProjectType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ProjectType_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Tipo de
Projeto

<span class="emphasis">*Comentário/Ajuda:* </span> Tipo de projeto com
fases opcionais e tarefas de projeto com informação de desempenho padrão

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d242897e39" class="table">

<div class="table-title">

Table 1.1. Project Type
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |                                  Valores (Padrão)                                   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                                                                                                                                     Comentário/Ajuda                                                                                                                                                                      |
| :------------------: | :-------------------------------: | :---------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tipo de Projeto    |                ID                 |                                                                                     |                  |                                                  |           Type of the project            |                                                                                                                               Type of the project with optional phases of the project with standard performance information                                                                                                                               |
|       Empresa        |           Tabela Direta           |                                (@\#AD\_Client\_ID@)                                 |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|     Organização      |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                  |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|         Nome         |       Texto Curto (String)        |                                                                                     |                  |                                                  |  Alphanumeric identifier of the entity   |                                                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                        |
|      Descrição       |       Texto Curto (String)        |                                                                                     |                  |                                                  | Optional short description of the record |                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                        |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                                                                                     |                  |                                                  |             Comment or Hint              |                                                                                                                                        The Help field contains a hint, comment or help about the use of this item.                                                                                                                                        |
|        Ativo         |              Sim-Não              |                                         (Y)                                         |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
| Categoria de Projeto |               Lista               | Projeto de Ativos Geral Projeto de Serviços (Despesa) Ordem de Serviço (Tarefa) (N) |                  |                                                  |             Project Category             | The Project Category determines the behavior of the project: General - no special accounting, e.g. for Presales or general tracking Service - no special accounting, e.g. for Service/Charge projects Work Order - creates Project/Job WIP transactions - ability to issue material Asset - create Project Asset transactions - ability to issue material |
|  C\_ProjectType\_UU  |       Texto Curto (String)        |                                                                                     |                  |                                                  |                                          |                                                                                                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d242897e197" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Fase Padrão - C\_Phase

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Phase_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Fase de
Projeto Padrão

<span class="emphasis">*Comentário/Ajuda:* </span> Fase Padrão de
Projeto com informação de desempenho

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d242897e214" class="table">

<div class="table-title">

Table 1.2. Standard Phase
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |                                                Valores (Padrão)                                                |   Chave restritiva   |                                                                          Regra de validação                                                                          |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :------------------------------------------------------------------------------------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Fase Padrão    |                ID                 |                                                                                                                |                      |                                                                                                                                                                      |          Standard Phase of the Project Type           |                                Phase of the project with standard performance information with standard work                                 |
|      Empresa      |           Tabela Direta           |                                               (@AD\_Client\_ID@)                                               |                      |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |                                                (@AD\_Org\_ID@)                                                 |                      |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|  Tipo de Projeto  |           Tabela Direta           |                                                                                                                | cprojecttype\_cphase |                                                                                                                                                                      |                  Type of the project                  |                        Type of the project with optional phases of the project with standard performance information                         |
|     Seqüência     |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM C\_Phase WHERE C\_ProjectType\_ID=@C\_ProjectType\_ID@) |                      |                                                                                                                                                                      | Method of ordering records; lowest number comes first |                                                 The Sequence indicates the order of records                                                  |
|       Nome        |       Texto Curto (String)        |                                                                                                                |                      |                                                                                                                                                                      |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Médio (até 2000 caracteres) |                                                                                                                |                      |                                                                                                                                                                      |       Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                                                                                                                |                      |                                                                                                                                                                      |                    Comment or Hint                    |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo       |              Sim-Não              |                                                      (Y)                                                       |                      |                                                                                                                                                                      |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Produto      |             Procurar              |                                                                                                                |   mproduct\_cphase   | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                Product, Service, Item                 |                                  Identifies an item which is either purchased or sold in this organization.                                  |
| Quantidade Padrão |            Quantidade             |                                                      (1)                                                       |                      |                                                                                                                                                                      |                   Standard Quantity                   |                                                                                                                                              |
|   C\_Phase\_UU    |       Texto Curto (String)        |                                                                                                                |                      |                                                                                                                                                                      |                                                       |                                                                                                                                              |

</div>

</div>

  

<div id="d242897e415" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tarefa Padrão - C\_Task

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Task_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Tarefa de
Projeto Padrão

<span class="emphasis">*Comentário/Ajuda:* </span> Tarefa de Projeto
Padrão

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d242897e432" class="table">

<div class="table-title">

Table 1.3. Standard Task
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |                                         Valores (Padrão)                                          | Chave restritiva |                                                                          Regra de validação                                                                          |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :-----------------------------------------------------------------------------------------------: | :--------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tarefa Padrão   |                ID                 |                                                                                                   |                  |                                                                                                                                                                      |              Standard Project Type Task               |                                        Standard Project Task in a Project Phase with standard effort                                         |
|      Empresa      |           Tabela Direta           |                                        (@AD\_Client\_ID@)                                         |                  |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |                                          (@AD\_Org\_ID@)                                          |                  |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|    Fase Padrão    |           Tabela Direta           |                                                                                                   |  cphase\_ctask   |                                                                                                                                                                      |          Standard Phase of the Project Type           |                                Phase of the project with standard performance information with standard work                                 |
|     Seqüência     |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM C\_Task WHERE C\_Phase\_ID=@C\_Phase\_ID@) |                  |                                                                                                                                                                      | Method of ordering records; lowest number comes first |                                                 The Sequence indicates the order of records                                                  |
|       Nome        |       Texto Curto (String)        |                                                                                                   |                  |                                                                                                                                                                      |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Médio (até 2000 caracteres) |                                                                                                   |                  |                                                                                                                                                                      |       Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                                                                                                   |                  |                                                                                                                                                                      |                    Comment or Hint                    |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo       |              Sim-Não              |                                                (Y)                                                |                  |                                                                                                                                                                      |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Produto      |             Procurar              |                                                                                                   | mproduct\_ctask  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                Product, Service, Item                 |                                  Identifies an item which is either purchased or sold in this organization.                                  |
| Quantidade Padrão |            Quantidade             |                                                (1)                                                |                  |                                                                                                                                                                      |                   Standard Quantity                   |                                                                                                                                              |
|    C\_Task\_UU    |       Texto Curto (String)        |                                                                                                   |                  |                                                                                                                                                                      |                                                       |                                                                                                                                              |

</div>

</div>

  

</div>
