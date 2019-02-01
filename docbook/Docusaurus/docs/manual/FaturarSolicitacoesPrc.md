---
title: "Faturar Solicitações"
id: FaturarSolicitacoesPrc
---
<div id="d102368e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Faturar Solicitações

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2005-05-19 20:15:57.0

<span class="emphasis">*Atualizado:*</span>2005-05-19 20:47:30.0

<span class="emphasis"> *Descrição:* </span>Criar Faturas para as
Solicitações e Pedidos

<span class="emphasis"> *Comentário/Ajuda:* </span>Criar faturas para o
Tipo de Solicitação com Grupo de Solicitação, e Categoria para Parceiro
de Negócios opcional. O produto definido no parâmetro será utilizado
caso o produto usado para o faturamento não estiver definido.

<div id="d102368e21" class="table">

<div class="table-title">

Table 1.1. FaturarSolicitacoes
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna   |  Referência   | Valores(Padrão) |                     Descrição                      |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :----------------: | :-----------: | :-------------: | :------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Grupo         |    R\_Group\_ID    | Tabela Direta |                 |                Grupo de Solicitação                |                                              Grupo de solicitações (por ex. números de versões, responsabilidade, ...)                                               |
|      Categoria       |  R\_Category\_ID   | Tabela Direta |                 |              Categoria da Solicitação              |                                                                  Categoria ou Tópico da Solicitação                                                                  |
| Tipo de Solicitação  | R\_RequestType\_ID | Tabela Direta |                 | Tipo de Solicitação (ex. Consulta, Reclamação, ..) |            Os "Tipos de Solicitação" são usados para processar e categorizar as solicitações. As opções são Consulta de Conta, Emissão de Garantia, etc.             |
| Parceiro de Negócios |  C\_BPartner\_ID   |   Procurar    |                 |        Identifica um Parceiro de Negócios.         | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|       Produto        |   M\_Product\_ID   |   Procurar    |                 |               Produto, Serviço, Item               |                                                Identifica um item que é ou comprado ou vendido por esta organização.                                                 |

</div>

</div>

  

</div>
