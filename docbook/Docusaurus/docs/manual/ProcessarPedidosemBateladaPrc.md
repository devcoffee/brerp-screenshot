---
title: "Processar Pedidos em Batelada"
id: ProcessarPedidosemBateladaPrc
---
<div id="d180248e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Processar Pedidos em Batelada

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2005-01-07 14:24:14.0

<span class="emphasis">*Atualizado:*</span>2005-01-07 14:24:14.0

<span class="emphasis"> *Descrição:* </span>Processar Pedidos em Lotes
(Bateladas)

<span class="emphasis"> *Comentário/Ajuda:* </span>Os pedidos são
processados usando a Ação do Documento selecionada com base nos
critérios de seleção. Certifique-se que a "Ação do Documento" seja
válida para os documentos.

![](/img/manual/ProcessarPedidosemBatelada.png)

<div id="d180248e22" class="table">

<div class="table-title">

Table 1.1. ProcessarPedidosemBatelada
Parâmetros

</div>

<div class="table-contents">

|          Nome           |    Nome da coluna    | Referência |                                                                      Valores(Padrão)                                                                       |                                         Descrição                                          |                                                                                                           Comentário/Ajuda                                                                                                            |
| :---------------------: | :------------------: | :--------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Estado do Documento   |      DocStatus       |   Lista    |     Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento      |                                O estado atual do documento                                 |                                         O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"                                          |
|       Despachado        |     IsDelivered      |   Lista    |                                                                          Não Sim                                                                           |                                            null                                            |                                                                                                                 null                                                                                                                  |
| Faturado (Nota Emitida) |      IsInvoiced      |   Lista    |                                                                          Não Sim                                                                           |                                     Isto foi faturado?                                     |                                                                                               Se selecionado, as faturas serão criadas                                                                                                |
|  Parceiro de Negócios   |   C\_BPartner\_ID    |  Procurar  |                                                                                                                                                            |                            Identifica um Parceiro de Negócios.                             |                                 Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                  |
| Tipo de Documento Alvo  | C\_DocTypeTarget\_ID |   Tabela   |                                                                         C\_DocType                                                                         |                      Tipo de Documento Alvo para converter documentos                      |           Você pode converter tipos de documento (por exemplo de Oferta para Pedido ou Fatura). A conversão é então refletida no tipo atual. Este processamento é iniciado ao se selecionar a Ação de Documento apropriada.           |
|      Auto-Serviço       |    IsSelfService     |   Lista    |                                                                          Não Sim                                                                           | Este é um lançamento de Auto-Serviço ou este lançamento pode ser alterado via Auto-Serviço | O Auto-Serviço permite aos usuários introduzir ou atualizar seus dados. O sinalizador indica que este registro foi introduzido ou criado via Auto-Serviço ou que o usuário pode alterá-lo por meio da funcionalidade de Auto-Serviço. |
|    Ação do Documento    |      DocAction       |   Lista    | \< Nenhum\> Aprovar Fechar Completo Invalidar Lançar Preparar Estornar - Provisão Estornar - Corrigir Reativar Rejeitar Anulado Espere Completar Destravar |                              O estado de destino do documento                              |                                                       Você pode ver o estado atual do documento no campo Estado do Documento. As opções possíveis serão listadas em um diálogo.                                                       |
|     Data do Pedido      |     DateOrdered      |    Data    |                                                                                                                                                            |                                       Data do Pedido                                       |                                                                                                 Indica a Data que um item foi pedido.                                                                                                 |

</div>

</div>

  

</div>
