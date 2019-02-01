---
title: "Responsável pelo Fluxo de Trabalho"
id: ResponsavelpeloFluxodeTrabalho
---
<div id="d206348e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Responsável pelo Fluxo de Trabalho

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Responsável -
    AD\_WF\_Responsible](#d206348e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Responsável pela Execução do
Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span>A responsabilidade
final por um Fluxo de Trabalho é do usuário real. A Responsabilidade do
Fluxo de Trabalho permite definir meios de encontrar aquele usuário
real.

<span class="emphasis"> *Criado em:* </span>2004-01-01 23:57:28.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ResponsavelpeloFluxodeTrabalho.png)

<div id="d206348e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Responsável - AD\_WF\_Responsible

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WF_Responsible_data)

<span class="emphasis">*Descrição:*</span> Responsável pela Execução do
Fluxo de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span> A responsabilidade
final por um Fluxo de Trabalho é do usuário real. A Responsabilidade do
Fluxo de Trabalho permite definir meios de encontrar aquele usuário
real.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d206348e40" class="table">

<div class="table-title">

Table 1.1. Responsible
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |                                   Valores (Padrão)                                   |     Chave restritiva     |                            Regra de validação                            |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :--------------------------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :----------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Responsável pelo Fluxo de Trabalho |                ID                 |                                                                                      |                          |                                                                          |                Responsible for Workflow Execution                |                             The ultimate responsibility for a workflow is with an actual user. The Workflow Responsible allows to define ways to find that actual User.                             |
|              Empresa               |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                 |                          |                    AD\_Client.AD\_Client\_ID \< \> 0                     |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|            Organização             |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                   |  adorg\_adwfresponsible  |             (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)             |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|                Nome                |       Texto Curto (String)        |                                                                                      |                          |                                                                          |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|             Descrição              |       Texto Curto (String)        |                                                                                      |                          |                                                                          |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|               Ativo                |              Sim-Não              |                                         (Y)                                          |                          |                                                                          |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|          Tipo de Entidade          |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adwfresponsible |      <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D      | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|      Tipo de Responsabilidade      |               Lista               |             Humana Manual Organização Papel (Função) Recurso de Sistema              |                          |                                                                          |            Type of the Responsibility for a workflow             |                                                             Type how the responsible user for the execution of a workflow is determined                                                             |
|               Perfil               |           Tabela Direta           |                                                                                      | adrole\_adwfresponsible  | AD\_Role.AD\_Client\_ID=@\#AD\_Client\_ID@ AND AD\_Role.IsMasterRole='N' |                       Responsibility Role                        |                                                      The Role determines security and access a user who has this Role will have in the System.                                                      |
|          Usuário/Contato           |             Procurar              |                                 AD\_User - Internal                                  | aduser\_adwfresponsible  |                                                                          |  User within the system - Internal or Business Partner Contact   |                                            The User identifies a unique user in the system. This could be an internal user or a business partner contact                                            |
|          Roteiro (Script)          | Texto Médio (até 2000 caracteres) |                                                                                      |                          |                                                                          |         Dynamic Java Language Script to calculate result         |                                                                Use Java language constructs to define the result of the calculation                                                                 |
|      AD\_WF\_Responsible\_UU       |       Texto Curto (String)        |                                                                                      |                          |                                                                          |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

</div>
