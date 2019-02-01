---
title: "Configuração de Solicitações"
id: ConfiguracaodeSolicitacoes
---
<div id="d32465e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Workflow: Configuração de Solicitações

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2001-12-08 21:07:39.0

<span class="emphasis">*Atualizado:*</span>2005-12-25 17:19:15.0

<span class="emphasis"> *Descrição:* </span> Configurar a empresa para
processar solicitações

<span class="emphasis"> *Nó inicial:* </span>Conferir a Configuração da
Empresa

<span class="emphasis"> *WorkFlowType:* </span>G

![](/img/manual/ConfiguracaodeSolicitacoes.png)

<div id="d32465e26" class="table">

<div class="table-title">

Table 1.1. Configuração de Solicitações Workflow
Transitions

</div>

<div class="table-contents">

|                 Nó                 |                             Descrição                             |    Ação    |        Próximo nó         | Condição |
| :--------------------------------: | :---------------------------------------------------------------: | :--------: | :-----------------------: | :------: |
| Conferir a Configuração da Empresa |       Conferir a Configuração da Empresa para Solicitações.       | UserWindow |        Check Users        |          |
|         Conferir Usuários          |       Conferir usuários para processamento de Solicitações        | UserWindow |  Check Business Partners  |          |
|   Conferir Parceiros de Negócios   | Conferir Parceiros de Negócios para processamento de Solicitações | UserWindow |     Request Processor     |          |
|     Processador de Solicitação     |               Definir Processadores de Solicitação                | UserWindow |       Request Type        |          |
|        Tipo de Solicitação         |               Gerenciamento de Tipos de Solicitação               | UserWindow |       Request Group       |          |
|        Grupo de Solicitação        |               Gerenciamento de Grupo de Solicitação               | UserWindow |     Request Category      |          |
|      Categoria da Solicitação      |             Gerenciamento da Categoria da Solicitação             | UserWindow |    Request Resolution     |          |
|      Resolução de Solicitação      |            Gerenciamento de Resoluções de Solicitação             | UserWindow |      Request Status       |          |
|       Estado da Solicitação        |             Gerenciamento de Estado das Solicitações              | UserWindow | Request Standard Response |          |
|   Resposta Padrão de Solicitação   |         Gerenciamento de Respostas Padrão de Solicitação          | UserWindow |       Request (all)       |          |
|        Solicitações (todas)        |             Ver e trabalhar em todas as solicitações              | UserWindow |                           |          |

</div>

</div>

  

</div>
