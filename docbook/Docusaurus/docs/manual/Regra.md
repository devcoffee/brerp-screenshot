---
title: "Regra"
id: Regra
---
<div id="d194903e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Regra

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Regra -
    AD\_Rule](#d194903e22)</span>
  - <span class="section">[2. Tabela: Table Script Validator -
    AD\_Table\_ScriptValidator](#d194903e265)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-01-23 11:59:57.0

<span class="emphasis">*Atualizado em:* </span>2008-01-23 11:59:57.0

<div id="d194903e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Regra - AD\_Rule

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Rule_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d194903e31" class="table">

<div class="table-title">

Table 1.1. Rule
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |                                                                                   Valores (Padrão)                                                                                   | Chave restritiva |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :----------------------: | :-------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Regra           |                ID                 |                                                                                                                                                                                      |                  |                                                                |                                                                  |                                                                                                                                                                                                     |
|         Empresa          |           Tabela Direta           |                                                                                 (@\#AD\_Client\_ID@)                                                                                 |                  |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Organização        |           Tabela Direta           |                                                                                  (@\#AD\_Org\_ID@)                                                                                   |                  |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|      Chave de Busca      |       Texto Curto (String)        |                                                                                                                                                                                      |                  |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|           Nome           |       Texto Curto (String)        |                                                                                                                                                                                      |                  |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|        Descrição         |       Texto Curto (String)        |                                                                                                                                                                                      |                  |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                                                                                                                                                                      |                  |                                                                |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
|      Tipo de Evento      |               Lista               | Callout Model Validator Document Event Human Resource %26 Payroll Model Validator Login Event Measure for Performance Analysis Process GL Reconciliation Model Validator Table Event |                  |                                                                |                          Type of Event                           |                                                                                                                                                                                                     |
|      Tipo de Regra       |               Lista               |                                                              Aspect Orient Program SQL JSR 94 Rule Engine API BeanShell                                                              |                  |                                                                |                                                                  |                                                                                                                                                                                                     |
| Nível de Acesso de Dados |               Lista               |                                           Organização Somente Cliente Empresa+Organização Somente Sistema Sistema+Cliente (Empresa) Todos                                            |                  |                                                                |                      Access Level required                       |                                                                   Indicates the access level required for this record or process.                                                                   |
|     Roteiro (Script)     |             Memorando             |                                                                                                                                                                                      |                  |                                                                |         Dynamic Java Language Script to calculate result         |                                                                Use Java language constructs to define the result of the calculation                                                                 |
|     Tipo de Entidade     |              Tabela               |                                                 \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual)                                                 | entityt\_adrule  | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|          Ativo           |              Sim-Não              |                                                                                         (Y)                                                                                          |                  |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       AD\_Rule\_UU       |       Texto Curto (String)        |                                                                                                                                                                                      |                  |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d194903e265" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Table Script Validator - AD\_Table\_ScriptValidator

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Rule

<span class="emphasis">*Lógica de visualização:*</span> @EventType@ = T
| @EventType@ = D

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d194903e280" class="table">

<div class="table-title">

Table 1.2. Table Script Validator
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |                                                                                                                                                                                                                                                                                                     Valores (Padrão)                                                                                                                                                                                                                                                                                                      |        Chave restritiva         |                Regra de validação                |                       Descrição                       |                          Comentário/Ajuda                           |
| :----------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :-----------------------------------------------------------------: |
|    Tabela Script Validador     |          ID          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                 |                                                  |                                                       |                                                                     |
| AD\_Table\_ScriptValidator\_UU | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                 |                                                  |                                                       |                                                                     |
|            Empresa             |    Tabela Direta     |                                                                                                                                                                                                                                                                                                   (@\#AD\_Client\_ID@)                                                                                                                                                                                                                                                                                                    |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                         (ver o mesmo acima)                         |
|          Organização           |    Tabela Direta     |                                                                                                                                                                                                                                                                                                     (@\#AD\_Org\_ID@)                                                                                                                                                                                                                                                                                                     |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                         (ver o mesmo acima)                         |
|             Regra              |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | adrule\_adtablescriptvalidator  |             EventType IN ('D', 'T')              |                                                       |                                                                     |
|             Tabela             |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | adtable\_adtablescriptvalidator |                                                  |              Database Table information               | The Database Table provides the information of the table definition |
|           Seqüência            |       Inteiro        |                                                                                                                                                                                                                                                                                                            (0)                                                                                                                                                                                                                                                                                                            |                                 |                                                  | Method of ordering records; lowest number comes first |             The Sequence indicates the order of records             |
|   Evento do Modelo Validador   |        Lista         | Document After Reactivate Document After Close Document After Complete Document After Post Document After Prepare Document After Reverse Accrual Document After Reverse Correct Document After Void Document Before Reactivate Document Before Close Document Before Complete Document Before Post Document Before Prepare Document Before Reverse Accrual Document Before Reverse Correct Document Before Void Table After Change Table After Change Replication Table After Delete Table After New Table After New Replication Table Before Change Table Before Delete Table Before Delete Replication Table Before New |                                 |                                                  |                                                       |                                                                     |
|             Ativo              |       Sim-Não        |                                                                                                                                                                                                                                                                                                            (Y)                                                                                                                                                                                                                                                                                                            |                                 |                                                  |          (semelhante ao primeiro relatório)           |                         (ver o mesmo acima)                         |

</div>

</div>

  

</div>
