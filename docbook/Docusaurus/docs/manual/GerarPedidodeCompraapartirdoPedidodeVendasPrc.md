---
title: "Gerar Pedido de Compra a partir do Pedido de Vendas"
id: GerarPedidodeCompraapartirdoPedidodeVendasPrc
---
<div id="d109706e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Gerar Pedido de Compra a partir do Pedido de Vendas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2002-12-09 17:07:54.0

<span class="emphasis">*Atualizado:*</span>2005-03-09 21:01:42.0

<span class="emphasis"> *Descrição:* </span>Criar Pedido de Compra a
partir dos Pedidos de Vendas

<span class="emphasis"> *Comentário/Ajuda:* </span>Após completar as
ordens de vendas, você pode criar um ou mais pedidos de compra para cada
ordem de venda. Um pedido de compras faz referência sempre a uma única
ordem de vendas (i.e. sem consolidação das ordens de venda). A
Organização da Ordem de Venda é usada para criar o Pedido de Compra.
Se um tipo de documento de PC (padrão) for definido no nível de
Organização, este será utilizado ao invés dos tipos de documento
definidos no nível de Empresa. PCs são criados para todas as linhas das
ordens de vendas onde o produto tem um fornecedor atual e o fornecedor
tem uma Lista de Preços de Fornecedor com todos os Produtos na Versão
mais atualizada da Lista de Preços. A Unidade de Medida é copiada; PC e
PV podem ter diferentes moedas. Uma vez que o processo é executado, você
precisa sincronizar os PC/PV manualmente (ex. no caso de linhas
adicionais e de linhas alteradas (produto %26 quantidade).

![](/img/manual/GerarPedidodeCompraapartirdoPedidodeVendas.png)

<div id="d109706e22" class="table">

<div class="table-title">

Table 1.1. GerarPedidodeCompraapartirdoPedidodeVendas
Parâmetros

</div>

<div class="table-contents">

|             Nome             | Nome da coluna  | Referência |   Valores(Padrão)   |                                  Descrição                                  |                                                                                                         Comentário/Ajuda                                                                                                          |
| :--------------------------: | :-------------: | :--------: | :-----------------: | :-------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Parceiro de Negócios     | C\_BPartner\_ID |  Procurar  |                     |                     Identifica um Parceiro de Negócios.                     |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|          Fornecedor          |   Vendor\_ID    |   Tabela   | C\_BPartner Vendors |                      É o Fornecedor de produto/serviço                      |                                                                                                               null                                                                                                                |
|            Pedido            |  C\_Order\_ID   |  Procurar  |                     |                                   Pedido                                    | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
| Entrega direta ao consumidor |   IsDropShip    |   Lista    |       Não Sim       | Entregas diretas são enviadas do Fornecedor diretamente ao Consumidor final |          Entregas diretas não causam nenhuma reserva ou movimentação de estoque já que o embarque será feito diretamente a partir do estoque do fornecedor. O embarque do Fornecedor ao Cliente tem que ser confirmado.           |
|        Data do Pedido        |   DateOrdered   |    Data    |                     |                               Data do Pedido                                |                                                                                               Indica a Data que um item foi pedido.                                                                                               |

</div>

</div>

  

</div>
