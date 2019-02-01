---
title: "Configurar Replicação"
id: ConfigurarReplicacao
---
<div id="d33685e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Workflow: Configurar Replicação

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2008-03-05 00:52:04.0

<span class="emphasis">*Atualizado:*</span>2008-03-05 21:55:31.0

<span class="emphasis"> *Descrição:* </span> Configurar dados para
replicação

<span class="emphasis"> *Comentário/Ajuda:* </span>Data Replication
allows you to synchronize data of remote instances with a central
office. All actions are initialized from the central office.\< p\> \<
b\> Central System:\< /b\> - setup system with all organizations, roles,
etc. - run the migration to make sure that it is up-to-date - export the
central system \< p\> \< b\> Remote System:\< /b\> - install the exact
version as Central System - import data from Central System in the
remote locations \< p\> \< b\> Central System:\< /b\> - Replication
Strategy - Define Export Format - Config Export Processor - Start JMS
Server \< p\> \*\* Enter Transactions \*\* \< p\> \< b\> Remote
System:\< /b\> - Config Import Processor

<span class="emphasis"> *Nó inicial:* </span>Replication Strategy

<span class="emphasis"> *WorkFlowType:* </span>G

![](/img/manual/ConfigurarReplicacao.png)

<div id="d33685e30" class="table">

<div class="table-title">

Table 1.1. Configurar Replicação Workflow
Transitions

</div>

<div class="table-contents">

|          Nó           |       Descrição       |    Ação    |      Próximo nó       | Condição |
| :-------------------: | :-------------------: | :--------: | :-------------------: | :------: |
| Replication Strategy  | Replication Strategy  | UserWindow |     Export Format     |          |
|     Export Format     |     Export Format     | UserWindow | Export Processor Type |          |
| Export Processor Type | Export Processor Type | UserWindow |   Export Processor    |          |
|   Export Processor    |   Export Processor    | UserWindow | Import Processor Type |          |
| Import Processor Type | Import Processor Type | UserWindow |   Import Proccesor    |          |
|   Import Proccesor    |   Import Proccesor    | UserWindow |                       |          |

</div>

</div>

  

</div>
