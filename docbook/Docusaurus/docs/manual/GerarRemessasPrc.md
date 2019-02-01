---
title: "Gerar Remessas"
id: GerarRemessasPrc
---
<div id="d109826e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Gerar Remessas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-04-26 21:34:07.0

<span class="emphasis">*Atualizado:*</span>2005-01-05 21:31:14.0

<span class="emphasis"> *Descrição:* </span>Gerar e imprimir Expedições
a partir dos Pedidos em aberto

<span class="emphasis"> *Comentário/Ajuda:* </span>Expedições para
Pedidos em Aberto são criados com base nas Regras de Entrega e na
prioridade relativa desse Pedido. Se uma "Data Prometida" for
selecionada, somente pedidos até essa data (inclusive) serão
selecionados. Se diversos pedidos de um parceiro de negócios tem a mesma
localização, os pedidos podem ser consolidados em um único embarque.
Você também pode incluir pedidos cuja confirmação ainda esteja pendente
(ex. pedido=10 - entregas não confirmadas=4 - iria criar uma nova
remessa de 6 se disponível).

<div id="d109826e21" class="table">

<div class="table-title">

Table 1.1. GerarRemessas
Parâmetros

</div>

<div class="table-contents">

|                 Nome                 |   Nome da coluna    |  Referência   |                                                                         Valores(Padrão)                                                                         |                             Descrição                              |                                                                           Comentário/Ajuda                                                                           |
| :----------------------------------: | :-----------------: | :-----------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Parceiro de Negócios         |   C\_BPartner\_ID   |   Procurar    |                                                                                                                                                                 |                Identifica um Parceiro de Negócios.                 | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|   Consolidar em um único documento   | ConsolidateDocument |    Sim-Não    |                                                                               (Y)                                                                               |          Consolida diversas linhas em um único documento           |                                                                                 null                                                                                 |
|               Armazém                |  M\_Warehouse\_ID   | Tabela Direta |                                                                     (@\#M\_Warehouse\_ID@)                                                                      |              Armazém de estocagem e Ponto de Serviço               |                         O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                         |
|            Data Prometida            |    DatePromised     |     Data      |                                                                                                                                                                 |                  Data que o Pedido foi prometido                   |                                              A "Data Prometida" indica a data, se existir, que um Pedido foi prometido.                                              |
|            Shipment Date             |    MovementDate     |     Data      |                                                                                                                                                                 |                      Date printed on shipment                      |                                                    The Shipment Date indicates the date printed on the shipment.                                                     |
|          Ação do Documento           |      DocAction      |     Lista     | \< Nenhum\> Aprovar Fechar Completo Invalidar Lançar Preparar Estornar - Provisão Estornar - Corrigir Reativar Rejeitar Anulado Espere Completar Destravar (CO) |                  O estado de destino do documento                  |                      Você pode ver o estado atual do documento no campo Estado do Documento. As opções possíveis serão listadas em um diálogo.                       |
| Pedidos com entregas não-confirmadas | IsUnconfirmedInOut  |    Sim-Não    |                                                                               (N)                                                                               | Gerar entregas para Pedidos com confirmações de entrega em aberto? |  Você também pode incluir pedidos que tenham confirmações pendentes (ex. pedido=10 - entregas não confirmadas=4 - iria criar uma nova remessa de 6 se disponível).   |

</div>

</div>

  

</div>
