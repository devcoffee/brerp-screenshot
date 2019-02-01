---
title: "Criar Plano de Caixa através de Pedido de Compra"
id: CriarPlanodeCaixaatravesdePedidodeCompraPrc
---
<div id="d38538e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Criar Plano de Caixa através de Pedido de Compra

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-08-03 18:05:35.0

<span class="emphasis">*Atualizado:*</span>2018-08-03 18:05:35.0

<span class="emphasis"> *Comentário/Ajuda:* </span>De acordo com o
intervalo selecionado e organização, montará plano de caixa e suas
linhas baseados nos Pedidos de Compras que ainda restam quantidade a
faturar

![](/img/manual/CriarPlanodeCaixaatravesdePedidodeCompra.png)

<div id="d38538e18" class="table">

<div class="table-title">

Table 1.1. CriarPlanodeCaixaatravesdePedidodeCompra
Parâmetros

</div>

<div class="table-contents">

|         Nome         | Nome da coluna  |  Referência   | Valores(Padrão) |                 Descrição                 |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :-------------: | :-----------: | :-------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Organização      |   AD\_Org\_ID   | Tabela Direta |                 | Entidade organizacional dentro da Empresa |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
| Parceiro de Negócios | C\_BPartner\_ID |   Procurar    |                 |    Identifica um Parceiro de Negócios.    | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|    Data Prometida    |  DatePromised   |     Data      |                 |      Data que o Pedido foi prometido      |                                              A "Data Prometida" indica a data, se existir, que um Pedido foi prometido.                                              |
|      Finalidade      |  C\_Charge\_ID  | Tabela Direta |                 |         Finalidade do lançamento          |                      O campo "Finalidade" indica a finalidade do lançamento, ou o tipo de despesa/receita (Manipulação, Despacho, Re-estocagem)                      |

</div>

</div>

  

</div>
