---
title: "Manutenção do Assistente de Configuração"
id: ManutencaodoAssistentedeConfiguracao
---
<div id="d144091e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Manutenção do Assistente de Configuração

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Assistente de Configuração -
    AD\_WizardProcess](#d144091e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Janela de Manutenção do
Assistente de Configuração

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-11-20 11:01:13.0

<span class="emphasis">*Atualizado em:* </span>2012-11-20 11:34:06.0

![](/img/manual/ManutencaodoAssistentedeConfiguracao.png)

<div id="d144091e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Assistente de Configuração - AD\_WizardProcess

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Assistente de Configuração

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d144091e34" class="table">

<div class="table-title">

Table 1.1. Setup Wizard
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |                 Valores (Padrão)                 |     Chave restritiva      |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :------------------: | :-------------------------------: | :----------------------------------------------: | :-----------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|    Wizard Process    |                ID                 |                                                  |                           |                                                  |                                                               |                                                                                                               |
|       Empresa        |           Tabela Direta           |               (@\#AD\_Client\_ID@)               |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|     Organização      |           Tabela Direta           |                (@\#AD\_Org\_ID@)                 |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|          Nó          |             Procurar              |                                                  | adwfnode\_adwizardprocess |                                                  |           Workflow Node (activity), step or process           |                      The Workflow Node indicates a unique step or process in a Workflow.                      |
|        Ativo         |              Sim-Não              |                       (Y)                        |                           |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
| Estado do Assistente |               Lista               | Delayed Finished In-Progress New Pending Skipped |                           |                                                  |                                                               |                                                                                                               |
|   Usuário/Contato    |             Procurar              |               AD\_User - Internal                |  aduser\_adwizardprocess  |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|         Nota         | Texto Médio (até 2000 caracteres) |                                                  |                           |                                                  |         Optional additional user defined information          |          The Note field allows for optional entry of user defined information regarding this record           |

</div>

</div>

  

</div>
