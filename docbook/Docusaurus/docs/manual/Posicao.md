---
title: "Posição"
id: Posicao
---
<div id="d176623e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Posição

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Posição -
    C\_Job](#d176623e22)</span>
  - <span class="section">[2. Tabela: Tarefa -
    C\_JobAssignment](#d176623e211)</span>
  - <span class="section">[3. Tabela: Remuneração -
    C\_JobRemuneration](#d176623e397)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Postos de
Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento de
cargos internos (funcionários) ou externos

<span class="emphasis"> *Criado em:* </span>2005-05-15 01:54:15.0

<span class="emphasis">*Atualizado em:* </span>2005-11-13 13:38:40.0

<div id="d176623e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Posição - C\_Job

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Job_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Postos de
Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
cargos internos (funcionários) ou externos

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d176623e39" class="table">

<div class="table-title">

Table 1.1. Position
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   |  Chave restritiva  |                Regra de validação                |                     Descrição                     |                                                                         Comentário/Ajuda                                                                         |
| :------------------: | :-------------------------------: | :------------------: | :----------------: | :----------------------------------------------: | :-----------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Posição        |                ID                 |                      |                    |                                                  |                   Job Position                    |                                                                                                                                                                  |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)         |                                                                       (ver o mesmo acima)                                                                        |
|     Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)         |                                                                       (ver o mesmo acima)                                                                        |
|         Nome         |       Texto Curto (String)        |                      |                    |                                                  |       Alphanumeric identifier of the entity       |           The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.           |
|      Descrição       |       Texto Curto (String)        |                      |                    |                                                  |     Optional short description of the record      |                                                           A description is limited to 255 characters.                                                            |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                      |                    |                                                  |                  Comment or Hint                  |                                           The Help field contains a hint, comment or help about the use of this item.                                            |
|        Ativo         |              Sim-Não              |         (Y)          |                    |                                                  |        (semelhante ao primeiro relatório)         |                                                                       (ver o mesmo acima)                                                                        |
|     Funcionário      |              Sim-Não              |         (Y)          |                    |                                                  | Indicates if this Business Partner is an employee | The Employee checkbox indicates if this Business Partner is an Employee. If it is selected, additional fields will display which further identify this employee. |
| Categoria de Posição |           Tabela Direta           |                      | cjobcategory\_cjob |                                                  |               Job Position Category               |                                                                 Classification of Job Positions                                                                  |
|      C\_Job\_UU      |       Texto Curto (String)        |                      |                    |                                                  |                                                   |                                                                                                                                                                  |

</div>

</div>

  

<div id="d176623e211" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tarefa - C\_JobAssignment

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Atribuição do Funcionário

<span class="emphasis">*Coluna linkada:* </span> Position

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d176623e226" class="table">

<div class="table-title">

Table 1.2. Assignment
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  |    Chave restritiva    |                                                          Regra de validação                                                           |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :-------------------: | :------------------: | :----------------: | :--------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
| Atribuição da Posição |          ID          |                    |                        |                                                                                                                                       |         Assignment of Employee (User) to Job Position         |                                                                                                               |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                        |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                        |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Posição        |    Tabela Direta     |                    |  cjob\_cjobassignment  |                                                                                                                                       |                         Job Position                          |                                                                                                               |
|    Usuário/Contato    |       Procurar       |                    | aduser\_cjobassignment | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|         Ativo         |       Sim-Não        |        (Y)         |                        |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|     Válido desde      |      Data+Hora       |                    |                        |                                                                                                                                       |          Valid from including this date (first day)           |                          The Valid From date indicates the first day of a date range                          |
|      Válido até       |      Data+Hora       |                    |                        |                                                                                                                                       |            Valid to including this date (last day)            |                           The Valid To date indicates the last day of a date range                            |
|       Descrição       | Texto Curto (String) |                    |                        |                                                                                                                                       |           Optional short description of the record            |                                  A description is limited to 255 characters.                                  |
| C\_JobAssignment\_UU  | Texto Curto (String) |                    |                        |                                                                                                                                       |                                                               |                                                                                                               |

</div>

</div>

  

<div id="d176623e397" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Remuneração - C\_JobRemuneration

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Remuneração do Cargo

<span class="emphasis">*Coluna linkada:* </span> Position

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d176623e412" class="table">

<div class="table-title">

Table 1.3. Remuneration
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |  Valores (Padrão)  |    Chave restritiva    |                Regra de validação                |                 Descrição                  |                      Comentário/Ajuda                       |
| :--------------------: | :------------------: | :----------------: | :--------------------: | :----------------------------------------------: | :----------------------------------------: | :---------------------------------------------------------: |
|  Remuneração do Cargo  |          ID          |                    |                        |                                                  |       Remuneration for the Position        |                                                             |
|        Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|      Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|        Posição         |    Tabela Direta     |                    | cjob\_cjobremuneration |                                                  |                Job Position                |                                                             |
|      Remuneração       |    Tabela Direta     |                    | cremuneration\_cjobrem |                                                  |               Wage or Salary               |                                                             |
|         Ativo          |       Sim-Não        |        (Y)         |                        |                                                  |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|      Válido desde      |      Data+Hora       |                    |                        |                                                  | Valid from including this date (first day) | The Valid From date indicates the first day of a date range |
|       Válido até       |      Data+Hora       |                    |                        |                                                  |  Valid to including this date (last day)   |  The Valid To date indicates the last day of a date range   |
|       Descrição        | Texto Curto (String) |                    |                        |                                                  |  Optional short description of the record  |         A description is limited to 255 characters.         |
| C\_JobRemuneration\_UU | Texto Curto (String) |                    |                        |                                                  |                                            |                                                             |

</div>

</div>

  

</div>
