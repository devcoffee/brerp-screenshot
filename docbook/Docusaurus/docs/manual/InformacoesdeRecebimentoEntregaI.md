---
title: "Informações de Recebimento/Entrega"
id: InformacoesdeRecebimentoEntregaI
---
<div id="d126032e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Recebimento/Entrega

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2013-02-01 15:31:40.0

<span class="emphasis"> *Atualizado:* </span>2018-01-22 16:33:42.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>M\_InOut i

<span class="emphasis"> *Order By :*</span>2,3,4<span class="emphasis">
*Valor Padrão* </span>

<div id="d126032e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome           |            Referência             |             Sql SELECT             |                                       QueryCriteria                                        |                                              Descrição                                              |                                                                                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                       |
| :---------------------: | :-------------------------------: | :--------------------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Parceiro de Negócios   |             Procurar              |         i.C\_BPartner\_ID          |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                 Identifica um Parceiro de Negócios.                                 |                                                                                                                                                                                                                                                                             Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                                                                                                                                                                                                                                                             |
|  Data da Movimentação   |               Data                |           i.MovementDate           |                                                                                            |              Data em que um produto foi movido para dentro ou para fora de um estoque               |                                                                                                                                                                                                                                                                  A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento.                                                                                                                                                                                                                                                                   |
|  Data da Movimentação   |               Data                |  i.MovementDate AS MovementDateTo  | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |              Data em que um produto foi movido para dentro ou para fora de um estoque               |                                                                                                                                                                                                                                                                  A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento.                                                                                                                                                                                                                                                                   |
|  Data da Movimentação   |               Data                | i.MovementDate AS MovementDateFrom | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |              Data em que um produto foi movido para dentro ou para fora de um estoque               |                                                                                                                                                                                                                                                                  A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento.                                                                                                                                                                                                                                                                   |
|   Número do Documento   |       Texto Curto (String)        |            i.DocumentNo            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                            Documenta o número seqüencial dos documentos                             | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|     Usuário/Contato     |           Tabela Direta           |           i.AD\_User\_ID           |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |               Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios                |                                                                                                                                                                                                                                                                                        O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                                                                                                                                                                                                                                                                        |
| Localização do Parceiro |           Tabela Direta           |    i.C\_BPartner\_Location\_ID     |                                                                                            |                 Identifica o endereço (de remessa para) este Parceiro de Negócios.                  |                                                                                                                                                                                                                                                                                                                          O "Endereço do Parceiro" indica a localização de um Parceiro de Negócios.                                                                                                                                                                                                                                                                                                                           |
|   Remessa/Recebimento   |                ID                 |           i.M\_InOut\_ID           |                                                                                            |                                  Documento de Remessa de Material                                   |                                                                                                                                                                                                                                                                                                                                               Remessa/Recebimento de Material                                                                                                                                                                                                                                                                                                                                                |
|    Região de Entrega    |           Tabela Direta           |      i.COF\_M\_ShipRegion\_ID      |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                    Primary Key : Shipment Region                                    |                                                                                                                                                                                                                                                                                                                                                Primary Key : Shipment Region                                                                                                                                                                                                                                                                                                                                                 |
|  Referência do Pedido   |       Texto Curto (String)        |           i.POReference            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Número de Referência da Transação (Pedido de Vendas, Pedido de Compras) do seu Parceiro de Negócios |                                                                                                                                                                                                           A "Referência de Pedido" do Parceiro de Negócios é o número do pedido para esta transação específica; Frequentemente números de Pedidos de Compra são fornecidos para imprimir nas faturas para facilitar a referência. Um número padrão pode ser definido na janela de Parceiro de Negócios (Cliente).                                                                                                                                                                                                            |
|     Via de Entrega      |               Lista               |         i.DeliveryViaRule          |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                     Como o pedido será entregue                                     |                                                                                                                                                                                                                                                                                                    A "Via de Entrega" indica como os pedidos deverão ser entregues. Por exemplo, se o pedido será retirado ou despachado.                                                                                                                                                                                                                                                                                                    |
|   Transação de Vendas   |              Sim-Não              |             i.IsSOTrx              |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                   Esta é uma Transação de Vendas                                    |                                                                                                                                                                                                                                                                                                                 A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                                                                                                                                                                                                                                                                                                  |
|   Estado do Documento   |               Lista               |            i.DocStatus             |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                     O estado atual do documento                                     |                                                                                                                                                                                                                                                                                     O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"                                                                                                                                                                                                                                                                                     |
|        Descrição        | Texto Médio (até 2000 caracteres) |           i.Description            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                               Descrição resumida opcional do registro                               |                                                                                                                                                                                                                                                                                                                                          Uma descrição é limitada a 255 caracteres.                                                                                                                                                                                                                                                                                                                                          |
|         Pedido          |             Procurar              |           i.C\_Order\_ID           |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                               Pedido                                                |                                                                                                                                                                                                                                              O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas.                                                                                                                                                                                                                                               |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/ShipmentInfoinfodata.html),

</div>