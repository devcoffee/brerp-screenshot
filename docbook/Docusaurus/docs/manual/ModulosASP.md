---
title: "Módulos ASP"
id: ModulosASP
---
<div id="d146967e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Módulos ASP

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Módulo -
    ASP\_Module](#d146967e22)</span>
  - <span class="section">[2. Tabela: Nível -
    ASP\_Level](#d146967e186)</span>
  - <span class="section">[3. Tabela: Janela -
    ASP\_Window](#d146967e382)</span>
  - <span class="section">[4. Tabela: Aba -
    ASP\_Tab](#d146967e537)</span>
  - <span class="section">[5. Tabela: Campo -
    ASP\_Field](#d146967e721)</span>
  - <span class="section">[6. Tabela: Processo -
    ASP\_Process](#d146967e876)</span>
  - <span class="section">[7. Tabela: Parâmetros do Processo -
    ASP\_Process\_Para](#d146967e1031)</span>
  - <span class="section">[8. Tabela: Formulário -
    ASP\_Form](#d146967e1186)</span>
  - <span class="section">[9. Tabela: Tarefa -
    ASP\_Task](#d146967e1341)</span>
  - <span class="section">[10. Tabela: Fluxo de Trabalho -
    ASP\_Workflow](#d146967e1496)</span>
  - <span class="section">[11. Tabela: Ref List -
    ASP\_Ref\_List](#d146967e1651)</span>

</div>

<span class="emphasis">*Descrição:* </span> ASP = As Service Provider

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-01-09 23:30:05.0

<span class="emphasis">*Atualizado em:* </span>2012-09-19 10:53:44.0

<div id="d146967e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Módulo - ASP\_Module

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d146967e29" class="table">

<div class="table-title">

Table 1.1. Module
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Módulo SaaS    |                ID                 |                      |                  |                                                  |                                          |                                                                                                                                              |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca  |       Texto Curto (String)        |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| ASP\_Module\_UU  |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d146967e186" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Nível - ASP\_Level

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Module

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d146967e197" class="table">

<div class="table-title">

Table 1.2. Level
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   |  Chave restritiva   |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :------------------: | :-----------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Nível SaaS     |                ID                 |                      |                     |                                                  |                                          |                                                                                                                                              |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Módulo SaaS     |           Tabela Direta           |                      | aspmodule\_asplevel |                                                  |                                          |                                                                                                                                              |
|   Chave de Busca   |       Texto Curto (String)        |                      |                     |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Nome        |       Texto Curto (String)        |                      |                     |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição      |       Texto Curto (String)        |                      |                     |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                      |                     |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| ASP Generate Level |               Botão               |                      |                     |                                                  |                                          |                                                                                                                                              |
|       Ativo        |              Sim-Não              |         (Y)          |                     |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   ASP\_Level\_UU   |       Texto Curto (String)        |                      |                     |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d146967e382" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Janela - ASP\_Window

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Level

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d146967e393" class="table">

<div class="table-title">

Table 1.3. Window
Fields

</div>

<div class="table-contents">

|  Nome do campo  |      Referência      |    Valores (Padrão)     |  Chave restritiva   |                Regra de validação                |             Descrição              |                      Comentário/Ajuda                      |
| :-------------: | :------------------: | :---------------------: | :-----------------: | :----------------------------------------------: | :--------------------------------: | :--------------------------------------------------------: |
|   Janela SaaS   |          ID          |                         |                     |                                                  |                                    |                                                            |
|     Empresa     |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                     |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                     |
|   Organização   |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                     |
|   Nível SaaS    |    Tabela Direta     |                         | asplevel\_aspwindow |                                                  |                                    |                                                            |
|     Janela      |    Tabela Direta     |                         | adwindow\_aspwindow |                                                  |    Data entry or display window    | The Window field identifies a unique Window in the system. |
|   Estado SaaS   |        Lista         | Hide Show Undefined (S) |                     |                                                  |                                    |                                                            |
|      Ativo      |       Sim-Não        |           (Y)           |                     |                                                  | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                     |
| ASP\_Window\_UU | Texto Curto (String) |                         |                     |                                                  |                                    |                                                            |

</div>

</div>

  

<div id="d146967e537" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Aba - ASP\_Tab

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Window

<span class="emphasis">*Nível da tabela:* </span>3

</div>

<div id="d146967e548" class="table">

<div class="table-title">

Table 1.4. Tab
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |    Valores (Padrão)     | Chave restritiva  |                Regra de validação                |             Descrição              |                    Comentário/Ajuda                    |
| :-----------------: | :------------------: | :---------------------: | :---------------: | :----------------------------------------------: | :--------------------------------: | :----------------------------------------------------: |
|      Aba SaaS       |          ID          |                         |                   |                                                  |                                    |                                                        |
|       Empresa       |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                   |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                  (ver o mesmo acima)                   |
|     Organização     |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                  (ver o mesmo acima)                   |
|     Janela SaaS     |    Tabela Direta     |                         | aspwindow\_asptab |                                                  |                                    |                                                        |
|         Aba         |    Tabela Direta     |                         |   adtab\_asptab   |     AD\_Tab.AD\_Window\_ID=@AD\_Window\_ID@      |        Tab within a Window         | The Tab indicates a tab that displays within a window. |
|     Estado SaaS     |        Lista         | Hide Show Undefined (S) |                   |                                                  |                                    |                                                        |
|     TodosCampos     |       Sim-Não        |           (Y)           |                   |                                                  |                                    |                                                        |
| ASP Generate Fields |        Botão         |                         |                   |                                                  |                                    |                                                        |
|        Ativo        |       Sim-Não        |           (Y)           |                   |                                                  | (semelhante ao primeiro relatório) |                  (ver o mesmo acima)                   |
|    ASP\_Tab\_UU     | Texto Curto (String) |                         |                   |                                                  |                                    |                                                        |

</div>

</div>

  

<div id="d146967e721" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Campo - ASP\_Field

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Tab

<span class="emphasis">*Nível da tabela:* </span>4

</div>

<div id="d146967e732" class="table">

<div class="table-title">

Table 1.5. Field
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |    Valores (Padrão)     | Chave restritiva  |                Regra de validação                |             Descrição              |                 Comentário/Ajuda                  |
| :------------: | :------------------: | :---------------------: | :---------------: | :----------------------------------------------: | :--------------------------------: | :-----------------------------------------------: |
|   Campo SaaS   |          ID          |                         |                   |                                                  |                                    |                                                   |
|    Empresa     |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                   |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                (ver o mesmo acima)                |
|  Organização   |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                (ver o mesmo acima)                |
|    Aba SaaS    |    Tabela Direta     |                         | asptab\_aspfield  |                                                  |                                    |                                                   |
|     Campo      |    Tabela Direta     |                         | adfield\_aspfield |       AD\_Field.AD\_Tab\_ID=@AD\_Tab\_ID@        |     Field on a database table      | The Field identifies a field on a database table. |
|  Estado SaaS   |        Lista         | Hide Show Undefined (S) |                   |                                                  |                                    |                                                   |
|     Ativo      |       Sim-Não        |           (Y)           |                   |                                                  | (semelhante ao primeiro relatório) |                (ver o mesmo acima)                |
| ASP\_Field\_UU | Texto Curto (String) |                         |                   |                                                  |                                    |                                                   |

</div>

</div>

  

<div id="d146967e876" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Processo - ASP\_Process

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Level

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d146967e887" class="table">

<div class="table-title">

Table 1.6. Process
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |    Valores (Padrão)     |   Chave restritiva    |                Regra de validação                |             Descrição              |                            Comentário/Ajuda                            |
| :--------------: | :------------------: | :---------------------: | :-------------------: | :----------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------: |
|  Processo SaaS   |          ID          |                         |                       |                                                  |                                    |                                                                        |
|     Empresa      |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                       |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|   Organização    |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|    Nível SaaS    |    Tabela Direta     |                         | asplevel\_aspprocess  |                                                  |                                    |                                                                        |
|     Processo     |    Tabela Direta     |                         | adprocess\_aspprocess |                                                  |         Process or Report          | The Process field identifies a unique Process or Report in the system. |
|   Estado SaaS    |        Lista         | Hide Show Undefined (S) |                       |                                                  |                                    |                                                                        |
|      Ativo       |       Sim-Não        |           (Y)           |                       |                                                  | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
| ASP\_Process\_UU | Texto Curto (String) |                         |                       |                                                  |                                    |                                                                        |

</div>

</div>

  

<div id="d146967e1031" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Parâmetros do Processo - ASP\_Process\_Para

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Process

<span class="emphasis">*Nível da tabela:* </span>3

</div>

<div id="d146967e1042" class="table">

<div class="table-title">

Table 1.7. Process Parameter
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      |    Valores (Padrão)     |       Chave restritiva        |                 Regra de validação                  |             Descrição              |  Comentário/Ajuda   |
| :------------------------: | :------------------: | :---------------------: | :---------------------------: | :-------------------------------------------------: | :--------------------------------: | :-----------------: |
| Parâmetro de Processo SaaS |          ID          |                         |                               |                                                     |                                    |                     |
|          Empresa           |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                               |          AD\_Client.AD\_Client\_ID \< \> 0          | (semelhante ao primeiro relatório) | (ver o mesmo acima) |
|        Organização         |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                               |  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)   | (semelhante ao primeiro relatório) | (ver o mesmo acima) |
|       Processo SaaS        |    Tabela Direta     |                         |  aspprocess\_aspprocesspara   |                                                     |                                    |                     |
|   Parâmetro de Processo    |    Tabela Direta     |                         | adprocesspara\_aspprocesspara | AD\_Process\_Para.AD\_Process\_ID=@AD\_Process\_ID@ |                                    |                     |
|        Estado SaaS         |        Lista         | Hide Show Undefined (S) |                               |                                                     |                                    |                     |
|           Ativo            |       Sim-Não        |           (Y)           |                               |                                                     | (semelhante ao primeiro relatório) | (ver o mesmo acima) |
|   ASP\_Process\_Para\_UU   | Texto Curto (String) |                         |                               |                                                     |                                    |                     |

</div>

</div>

  

<div id="d146967e1186" class="section section">

<div class="titlepage">

<div>

<div>

## 8. Tabela: Formulário - ASP\_Form

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Level

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d146967e1197" class="table">

<div class="table-title">

Table 1.8. Form
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |    Valores (Padrão)     | Chave restritiva  |                Regra de validação                |             Descrição              |                            Comentário/Ajuda                            |
| :-----------------: | :------------------: | :---------------------: | :---------------: | :----------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------: |
|   Formulário SaaS   |          ID          |                         |                   |                                                  |                                    |                                                                        |
|       Empresa       |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                   |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|     Organização     |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|     Nível SaaS      |    Tabela Direta     |                         | asplevel\_aspform |                                                  |                                    |                                                                        |
| Formulário Especial |    Tabela Direta     |                         |  adform\_aspform  |                                                  |            Special Form            | The Special Form field identifies a unique Special Form in the system. |
|     Estado SaaS     |        Lista         | Hide Show Undefined (S) |                   |                                                  |                                    |                                                                        |
|        Ativo        |       Sim-Não        |           (Y)           |                   |                                                  | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|    ASP\_Form\_UU    | Texto Curto (String) |                         |                   |                                                  |                                    |                                                                        |

</div>

</div>

  

<div id="d146967e1341" class="section section">

<div class="titlepage">

<div>

<div>

## 9. Tabela: Tarefa - ASP\_Task

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Level

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d146967e1352" class="table">

<div class="table-title">

Table 1.9. Task
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |    Valores (Padrão)     | Chave restritiva  |                Regra de validação                |             Descrição              |                         Comentário/Ajuda                         |
| :-----------: | :------------------: | :---------------------: | :---------------: | :----------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------: |
|  Tarefa SaaS  |          ID          |                         |                   |                                                  |                                    |                                                                  |
|    Empresa    |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                   |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                       (ver o mesmo acima)                        |
|  Organização  |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                       (ver o mesmo acima)                        |
|  Nível SaaS   |    Tabela Direta     |                         | asplevel\_asptask |                                                  |                                    |                                                                  |
|   Tarefa SO   |    Tabela Direta     |                         |  adtask\_asptask  |                                                  |       Operation System Task        | The Task field identifies a Operation System Task in the system. |
|  Estado SaaS  |        Lista         | Hide Show Undefined (S) |                   |                                                  |                                    |                                                                  |
|     Ativo     |       Sim-Não        |           (Y)           |                   |                                                  | (semelhante ao primeiro relatório) |                       (ver o mesmo acima)                        |
| ASP\_Task\_UU | Texto Curto (String) |                         |                   |                                                  |                                    |                                                                  |

</div>

</div>

  

<div id="d146967e1496" class="section section">

<div class="titlepage">

<div>

<div>

## 10. Tabela: Fluxo de Trabalho - ASP\_Workflow

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Level

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d146967e1507" class="table">

<div class="table-title">

Table 1.10. Workflow
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |    Valores (Padrão)     |    Chave restritiva     |                Regra de validação                |             Descrição              |                        Comentário/Ajuda                        |
| :--------------------: | :------------------: | :---------------------: | :---------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------: |
| Fluxo de Trabalho SaaS |          ID          |                         |                         |                                                  |                                    |                                                                |
|        Empresa         |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                         |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
|      Organização       |    Tabela Direta     |    (@\#AD\_Org\_ID@)    |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
|       Nível SaaS       |    Tabela Direta     |                         |  asplevel\_aspworkflow  |                                                  |                                    |                                                                |
|   Fluxo de Trabalho    |    Tabela Direta     |                         | adworkflow\_aspworkflow |      AD\_Workflow.WorkflowType IN ('G','W')      |  Workflow or combination of tasks  | The Workflow field identifies a unique Workflow in the system. |
|      Estado SaaS       |        Lista         | Hide Show Undefined (S) |                         |                                                  |                                    |                                                                |
|         Ativo          |       Sim-Não        |           (Y)           |                         |                                                  | (semelhante ao primeiro relatório) |                      (ver o mesmo acima)                       |
|   ASP\_Workflow\_UU    | Texto Curto (String) |                         |                         |                                                  |                                    |                                                                |

</div>

</div>

  

<div id="d146967e1651" class="section section">

<div class="titlepage">

<div>

<div>

## 11. Tabela: Ref List - ASP\_Ref\_List

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> ASP Level

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d146967e1662" class="table">

<div class="table-title">

Table 1.11. Ref List
Fields

</div>

<div class="table-contents">

|    Nome do campo    |  Referência   |    Valores (Padrão)     |    Chave restritiva     |                 Regra de validação                  |             Descrição              |                                                                     Comentário/Ajuda                                                                      |
| :-----------------: | :-----------: | :---------------------: | :---------------------: | :-------------------------------------------------: | :--------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Lista SaaS      |      ID       |                         |                         |                                                     |                                    |                                                                                                                                                           |
|       Empresa       | Tabela Direta |  (@\#AD\_Client\_ID@)   |                         |          AD\_Client.AD\_Client\_ID \< \> 0          | (semelhante ao primeiro relatório) |                                                                    (ver o mesmo acima)                                                                    |
|     Organização     | Tabela Direta |    (@\#AD\_Org\_ID@)    |                         |  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)   | (semelhante ao primeiro relatório) |                                                                    (ver o mesmo acima)                                                                    |
|     Nível SaaS      | Tabela Direta |                         |  asplevel\_aspreflist   |                                                     |                                    |                                                                                                                                                           |
|     Referência      | Tabela Direta |                         | adreference\_aspreflist |          AD\_Reference.ValidationType='L'           |  System Reference and Validation   |                                             The Reference could be a display type, list or table validation.                                              |
| Lista de Referência | Tabela Direta |                         |  adreflist\_aspreflist  | AD\_Ref\_List.AD\_Reference\_ID=@AD\_Reference\_ID@ |   Reference List based on Table    | The Reference List field indicates a list of reference values from a database tables. Reference lists populate drop down list boxes in data entry screens |
|     Estado SaaS     |     Lista     | Hide Show Undefined (S) |                         |                                                     |                                    |                                                                                                                                                           |
|        Ativo        |    Sim-Não    |           (Y)           |                         |                                                     | (semelhante ao primeiro relatório) |                                                                    (ver o mesmo acima)                                                                    |

</div>

</div>

  

</div>
