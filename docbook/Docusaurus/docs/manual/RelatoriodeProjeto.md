---
title: "Relatório de Projeto"
id: RelatoriodeProjeto
---
<div id="d201568e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Relatório de Projeto

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ciclo de Projeto -
    C\_Cycle](#d201568e22)</span>
  - <span class="section">[2. Tabela: Passo -
    C\_CycleStep](#d201568e182)</span>
  - <span class="section">[3. Tabela: Fase de Ciclo -
    C\_CyclePhase](#d201568e358)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Ciclos de
Relatórios de Projeto

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Ciclo de
Projeto" define os passos associados a um Projeto específico. Você pode
querer definir diversos Ciclos de Projeto para diferenciar os diferentes
tipos de projeto. Os Ciclos de Projeto podem usar todos ou um
subconjunto dos Estados de Projeto (ex. Seu ciclo de projeto de
oportunidade pode incluir os passos desde a prospecção até o contrato -
o ciclo de serviços pode incluir passos desde a instalação até o aceite
do cliente).

<span class="emphasis"> *Criado em:* </span>2001-03-11 17:44:08.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d201568e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ciclo de Projeto - C\_Cycle

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Cycle_data)

<span class="emphasis">*Descrição:*</span> Definir Relatório de Ciclo de
Projeto

<span class="emphasis">*Comentário/Ajuda:* </span> Define a moeda usada
em relatórios de Projeto. Os Projetos em si, podem estar em uma moeda
diferente.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d201568e39" class="table">

<div class="table-title">

Table 1.1. Project Cycle
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   | Chave restritiva  |                Regra de validação                |                  Descrição                  |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :------------------: | :---------------: | :----------------------------------------------: | :-----------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Ciclo de Projeto |          ID          |                      |                   |                                                  | Identifier for this Project Reporting Cycle |                         Identifies a Project Cycle which can be made up of one or more cycle steps and cycle phases.                         |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                   |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|       Nome       | Texto Curto (String) |                      |                   |                                                  |    Alphanumeric identifier of the entity    | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     | Texto Curto (String) |                      |                   |                                                  |  Optional short description of the record   |                                                 A description is limited to 255 characters.                                                  |
|      Ativo       |       Sim-Não        |         (Y)          |                   |                                                  |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|     Moeda De     |    Tabela Direta     |                      | ccurrency\_ccycle |                                                  |        The Currency for this record         |                                Indicates the Currency to be used when processing or reporting on this record                                 |
|   C\_Cycle\_UU   | Texto Curto (String) |                      |                   |                                                  |                                             |                                                                                                                                              |

</div>

</div>

  

<div id="d201568e182" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Passo - C\_CycleStep

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_CycleStep_data)

<span class="emphasis">*Descrição:*</span> Passo de Ciclo de Projeto

<span class="emphasis">*Comentário/Ajuda:* </span> O Passo de Ciclo
determina a seqüência lógica de eventos dentro do seu ciclo. É comum que
a similaridade de Fases de Projeto faça diferentes tipos de projetos
comparáveis.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d201568e199" class="table">

<div class="table-title">

Table 1.2. Step
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |                                            Valores (Padrão)                                            |  Chave restritiva  |                Regra de validação                |                       Descrição                       |                                                                                                                                                                          Comentário/Ajuda                                                                                                                                                                           |
| :--------------: | :------------------: | :----------------------------------------------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :---------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Passo de Ciclo  |          ID          |                                                                                                        |                    |                                                  |                The step for this Cycle                |                                                                                                                                        Identifies one or more steps within a Project Cycle. A cycle Step has multiple Phases                                                                                                                                        |
|     Empresa      |    Tabela Direta     |                                           (@AD\_Client\_ID@)                                           |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                         |
|   Organização    |    Tabela Direta     |                                            (@AD\_Org\_ID@)                                             |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                         |
| Ciclo de Projeto |    Tabela Direta     |                                                                                                        | ccycle\_ccyclestep |                                                  |      Identifier for this Project Reporting Cycle      |                                                                                                                                    Identifies a Project Cycle which can be made up of one or more cycle steps and cycle phases.                                                                                                                                     |
|    Seqüência     |       Inteiro        | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM C\_CycleStep WHERE C\_Cycle\_ID=@C\_Cycle\_ID@) |                    |                                                  | Method of ordering records; lowest number comes first |                                                                                                                                                             The Sequence indicates the order of records                                                                                                                                                             |
|      Ativo       |       Sim-Não        |                                                  (Y)                                                   |                    |                                                  |          (semelhante ao primeiro relatório)           |                                                                                                                                                                         (ver o mesmo acima)                                                                                                                                                                         |
|       Nome       | Texto Curto (String) |                                                                                                        |                    |                                                  |         Alphanumeric identifier of the entity         |                                                                                                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                             |
|  Peso Relativo   |      Quantidade      |                                                  (1)                                                   |                    |                                                  |      Relative weight of this step (0 = ignored)       | The relative weight allows you to adjust the project cycle report based on probabilities. For example, if you have a 1:10 chance in closing a contract when it is in the prospect stage and a 1:2 chance when it is in the contract stage, you may put a weight of 0.1 and 0.5 on those steps. This allows sales funnels or measures of completion of your project. |
| C\_CycleStep\_UU | Texto Curto (String) |                                                                                                        |                    |                                                  |                                                       |                                                                                                                                                                                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d201568e358" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Fase de Ciclo - C\_CyclePhase

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_CyclePhase_data)

<span class="emphasis">*Descrição:*</span> Vincular Passo de Ciclo com
as Fases de Projeto

<span class="emphasis">*Comentário/Ajuda:* </span> Vincula Fases de
Projeto similares a um Passo de Ciclo

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d201568e375" class="table">

<div class="table-title">

Table 1.3. Cycle Phase
Fields

</div>

<div class="table-contents">

| Nome do campo  |  Referência   |  Valores (Padrão)  |    Chave restritiva     |                Regra de validação                |             Descrição              |                                   Comentário/Ajuda                                    |
| :------------: | :-----------: | :----------------: | :---------------------: | :----------------------------------------------: | :--------------------------------: | :-----------------------------------------------------------------------------------: |
|    Empresa     | Tabela Direta | (@AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                  (ver o mesmo acima)                                  |
|  Organização   | Tabela Direta |  (@AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                  (ver o mesmo acima)                                  |
| Passo de Ciclo | Tabela Direta |                    | ccyclestep\_ccyclephase |                                                  |      The step for this Cycle       | Identifies one or more steps within a Project Cycle. A cycle Step has multiple Phases |
|     Ativo      |    Sim-Não    |        (Y)         |                         |                                                  | (semelhante ao primeiro relatório) |                                  (ver o mesmo acima)                                  |
|  Fase Padrão   | Tabela Direta |                    |   cphase\_ccyclephase   |                                                  | Standard Phase of the Project Type |     Phase of the project with standard performance information with standard work     |

</div>

</div>

  

</div>
