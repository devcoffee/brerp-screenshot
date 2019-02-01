---
title: "Configuração de Vendas"
id: ConfiguracaodeVendas
---
<div id="d33025e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Workflow: Configuração de Vendas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2001-04-05 21:45:37.0

<span class="emphasis">*Atualizado:*</span>2005-12-25 17:17:57.0

<span class="emphasis"> *Descrição:* </span> Configurar Vendas

<span class="emphasis"> *Comentário/Ajuda:* </span>Setting up Sales
Representatives, Commissions as well as Marketing Channels and
Campaigns.

<span class="emphasis"> *Nó inicial:* </span>Parceiro de Negócios

<span class="emphasis"> *WorkFlowType:* </span>W

![](/img/manual/ConfiguracaodeVendas.png)

<div id="d33025e30" class="table">

<div class="table-title">

Table 1.1. Configuração de Vendas Workflow
Transitions

</div>

<div class="table-contents">

|          Nó           |                            Descrição                            |    Ação    |     Próximo nó     | Condição |
| :-------------------: | :-------------------------------------------------------------: | :--------: | :----------------: | :------: |
| Parceiro de Negócios  | Configurar Representante de Vendas como um Parceiro de Negócios | UserWindow |        User        |          |
|        Usuário        |          Definir Representante de Vendas como Usuário           | UserWindow |    Sales Region    |          |
|   Região de Vendas    |               Gerenciamento das Regiões de Vendas               | UserWindow |     Commission     |          |
|       Comissão        | Gerenciamento de Comissões e Direitos de Exploração (Royalties) | UserWindow | Marketing Channel  |          |
|  Canal de Marketing   |              Gerenciamento dos Canais de Marketing              | UserWindow | Marketing Campaign |          |
| Campanha de Marketing |            Gerenciamento das Campanhas de Marketing             | UserWindow |                    |          |

</div>

</div>

  

</div>
