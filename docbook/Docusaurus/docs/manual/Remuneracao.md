---
title: "Remuneração"
id: Remuneracao
---
<div id="d204685e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Remuneração

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Remuneração -
    C\_Remuneration](#d204685e23)</span>
  - <span class="section">[2. Tabela: Remuneração do Cargo -
    C\_JobRemuneration](#d204685e248)</span>
  - <span class="section">[3. Tabela: Remuneração de Funcionário -
    C\_UserRemuneration](#d204685e420)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Remuneração

<span class="emphasis">*Comentário/Ajuda:* </span>Ordenado de horistas e
Salários

<span class="emphasis"> *Criado em:* </span>2005-05-15 02:12:03.0

<span class="emphasis">*Atualizado em:* </span>2017-12-16 10:04:11.0

![](/img/manual/Remuneracao.png)

<div id="d204685e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Remuneração - C\_Remuneration

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Gerenciamento de Níveis de
Remuneração

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d204685e34" class="table">

<div class="table-title">

Table 1.1. Remuneration
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |                                   Valores (Padrão)                                    | Chave restritiva |                Regra de validação                |                   Descrição                    |                                                               Comentário/Ajuda                                                               |
| :--------------------: | :-------------------------------: | :-----------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Remuneração       |                ID                 |                                                                                       |                  |                                                  |                 Wage or Salary                 |                                                                                                                                              |
|        Empresa         |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                  |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|      Organização       |           Tabela Direta           |                                   (@\#AD\_Org\_ID@)                                   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|          Nome          |       Texto Curto (String)        |                                                                                       |                  |                                                  |     Alphanumeric identifier of the entity      | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição        |       Texto Curto (String)        |                                                                                       |                  |                                                  |    Optional short description of the record    |                                                 A description is limited to 255 characters.                                                  |
|    Comentário/Ajuda    | Texto Médio (até 2000 caracteres) |                                                                                       |                  |                                                  |                Comment or Hint                 |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|         Ativo          |              Sim-Não              |                                          (Y)                                          |                  |                                                  |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|  Tipo de Remuneração   |               Lista               | Duas vezes por semana Diariamente A cada hora Mensalmente Quinzenalmente Semanalmente |                  |                                                  |              Type of Remuneration              |                                                                                                                                              |
|      Valor Bruto       |               Valor               |                                                                                       |                  |                                                  |           Gross Remuneration Amount            |                                Gross Salary or Wage Amount (without Overtime, Benefits and Employer overhead)                                |
|      Custo Bruto       |           Custos+Preços           |                                                                                       |                  |                                                  |            Gross Remuneration Costs            |                              Gross Salary or Wage Costs (without Overtime, with Benefits and Employer overhead)                              |
|     Horas Normais      |              Inteiro              |                                                                                       |                  |                                                  | Standard Work Hours based on Remuneration Type |             Number of hours per Remuneration Type (e.g. Daily 8 hours, Weekly 40 hours, etc.) to determine when overtime starts              |
| Valor das Horas Extras |               Valor               |                                                                                       |                  |                                                  |              Hourly Overtime Rate              |                                             Hourly Amount without Benefits and Employer overhead                                             |
| Custo de Horas Extras  |           Custos+Preços           |                                                                                       |                  |                                                  |              Hourly Overtime Cost              |                                              Hourly Amount with Benefits and Employer overhead                                               |

</div>

</div>

  

<div id="d204685e248" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Remuneração do Cargo - C\_JobRemuneration

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Gerenciamento de Remuneração
de Posição (cargo)

<span class="emphasis">*Coluna linkada:* </span> Remuneration

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d204685e263" class="table">

<div class="table-title">

Table 1.2. Position Remuneration
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |  Valores (Padrão)  |    Chave restritiva    |                Regra de validação                |                 Descrição                  |                      Comentário/Ajuda                       |
| :------------------: | :------------------: | :----------------: | :--------------------: | :----------------------------------------------: | :----------------------------------------: | :---------------------------------------------------------: |
| Remuneração do Cargo |          ID          |                    |                        |                                                  |       Remuneration for the Position        |                                                             |
|       Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|     Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|     Remuneração      |    Tabela Direta     |                    | cremuneration\_cjobrem |                                                  |               Wage or Salary               |                                                             |
|       Posição        |    Tabela Direta     |                    | cjob\_cjobremuneration |                                                  |                Job Position                |                                                             |
|        Ativo         |       Sim-Não        |        (Y)         |                        |                                                  |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|     Válido desde     |      Data+Hora       |                    |                        |                                                  | Valid from including this date (first day) | The Valid From date indicates the first day of a date range |
|      Válido até      |      Data+Hora       |                    |                        |                                                  |  Valid to including this date (last day)   |  The Valid To date indicates the last day of a date range   |
|      Descrição       | Texto Curto (String) |                    |                        |                                                  |  Optional short description of the record  |         A description is limited to 255 characters.         |

</div>

</div>

  

<div id="d204685e420" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Remuneração de Funcionário - C\_UserRemuneration

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Sobrescrever a Remuneração do
Cargo do Funcionário

<span class="emphasis">*Coluna linkada:* </span> Remuneration

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d204685e435" class="table">

<div class="table-title">

Table 1.3. Employee Remuneration
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      |  Valores (Padrão)  |     Chave restritiva      |                                                          Regra de validação                                                           |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :------------------------: | :------------------: | :----------------: | :-----------------------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
| Remuneração de Funcionário |          ID          |                    |                           |                                                                                                                                       |               Employee Wage or Salary Overwrite               |                                      Overwrite the standard Remuneration                                      |
|          Empresa           |    Tabela Direta     | (@AD\_Client\_ID@) |                           |                                                   AD\_Client.AD\_Client\_ID \< \> 0                                                   |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Organização         |    Tabela Direta     |  (@AD\_Org\_ID@)   |                           |                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                            |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Remuneração         |    Tabela Direta     |                    |  cremuneration\_cuserrem  |                                                                                                                                       |                        Wage or Salary                         |                                                                                                               |
|      Usuário/Contato       |       Procurar       |                    | aduser\_cuserremuneration | EXISTS (SELECT \* FROM C\_BPartner bp WHERE AD\_User.C\_BPartner\_ID=bp.C\_BPartner\_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y')) | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|           Ativo            |       Sim-Não        |        (Y)         |                           |                                                                                                                                       |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Valor Bruto         |        Valor         |                    |                           |                                                                                                                                       |                   Gross Remuneration Amount                   |                Gross Salary or Wage Amount (without Overtime, Benefits and Employer overhead)                 |
|        Custo Bruto         |    Custos+Preços     |                    |                           |                                                                                                                                       |                   Gross Remuneration Costs                    |              Gross Salary or Wage Costs (without Overtime, with Benefits and Employer overhead)               |
|   Valor das Horas Extras   |        Valor         |                    |                           |                                                                                                                                       |                     Hourly Overtime Rate                      |                             Hourly Amount without Benefits and Employer overhead                              |
|   Custo de Horas Extras    |    Custos+Preços     |                    |                           |                                                                                                                                       |                     Hourly Overtime Cost                      |                               Hourly Amount with Benefits and Employer overhead                               |
|        Válido desde        |      Data+Hora       |                    |                           |                                                                                                                                       |          Valid from including this date (first day)           |                          The Valid From date indicates the first day of a date range                          |
|         Válido até         |      Data+Hora       |                    |                           |                                                                                                                                       |            Valid to including this date (last day)            |                           The Valid To date indicates the last day of a date range                            |
|         Descrição          | Texto Curto (String) |                    |                           |                                                                                                                                       |           Optional short description of the record            |                                  A description is limited to 255 characters.                                  |

</div>

</div>

  

</div>
