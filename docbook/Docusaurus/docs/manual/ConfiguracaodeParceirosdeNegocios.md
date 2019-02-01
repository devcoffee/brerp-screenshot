---
title: "Configuração de Parceiros de Negócios"
id: ConfiguracaodeParceirosdeNegocios
---
<div id="d32301e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Workflow: Configuração de Parceiros de Negócios

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2001-04-05 21:05:17.0

<span class="emphasis">*Atualizado:*</span>2005-12-25 17:16:56.0

<span class="emphasis"> *Descrição:* </span> Configuração de Regras de
Parceiros de Negócios

<span class="emphasis"> *Comentário/Ajuda:* </span>This workflow defines
the Business Partners and the supporting rules.

<span class="emphasis"> *Nó inicial:* </span>Grupo de Parceiros de
Negócios

<span class="emphasis"> *WorkFlowType:* </span>W

![](/img/manual/ConfiguracaodeParceirosdeNegocios.png)

<div id="d32301e30" class="table">

<div class="table-title">

Table 1.1. Configuração de Parceiros de Negócios Workflow
Transitions

</div>

<div class="table-contents">

|                 Nó                  |                    Descrição                     |    Ação    |       Próximo nó        | Condição |
| :---------------------------------: | :----------------------------------------------: | :--------: | :---------------------: | :------: |
|   Grupo de Parceiros de Negócios    | Gerenciamento de Grupos de Parceiros de Negócios | UserWindow |        Greeting         |          |
|              Saudação               |            Gerenciamento de Saudações            | UserWindow |      Payment Term       |          |
|        Condição de Pagamento        |      Gerenciamento de Condição de Pagamento      | UserWindow |    Invoice Schedule     |          |
|     Programação de Faturamento      |   Gerenciamento da Programação de Faturamento    | UserWindow |         Dunning         |          |
|              Cobrança               |       Gerenciamento dos Níveis de Cobrança       | UserWindow | Import Business Partner |          |
| Importação de Parceiros de Negócios |       Importação de Parceiros de Negócios        | UserWindow |    Business Partner     |          |
|        Parceiro de Negócios         |      Gerenciamento de Parceiros de Negócios      | UserWindow |                         |          |

</div>

</div>

  

</div>
