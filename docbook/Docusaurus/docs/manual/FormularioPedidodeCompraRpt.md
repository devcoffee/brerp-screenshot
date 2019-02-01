---
title: "Formulário Pedido de Compra"
id: FormularioPedidodeCompraRpt
---
<div id="d108530e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Formulário Pedido de Compra

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2014-05-12 17:12:05.0

<span class="emphasis">*Atualizado:*</span>2014-08-11 14:48:36.0

<span class="emphasis"> *Descrição:* </span>Formulário Pedido de Compra

<span class="emphasis"> *Comentário/Ajuda:* </span>Emissão do Formulário
de Pedido de Compras

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/FormularioPedidodeCompra.png)

<div id="d108530e26" class="table">

<div class="table-title">

Table 1.1. FormularioPedidodeCompra
Parâmetros

</div>

<div class="table-contents">

|          Nome           |    Nome da coluna    |  Referência   | Valores(Padrão)  |                 Descrição                 |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :------------------: | :-----------: | :--------------: | :---------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Somente Itens Pendentes | COF\_SomentePendente |     Lista     |     Não Sim      |                   null                    |                                                                                                               null                                                                                                                |
|       Organização       |     AD\_Org\_ID      | Tabela Direta | (@AD\_Org\_ID@)  | Entidade organizacional dentro da Empresa |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|         Pedido          |     C\_Order\_ID     |   Procurar    | (@C\_Order\_ID@) |                  Pedido                   | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |

</div>

</div>

  

</div>
