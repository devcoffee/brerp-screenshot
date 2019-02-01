---
title: "Tracking de Pedidos"
id: TrackingdePedidosI
---
<div id="d245138e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Tracking de Pedidos

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-07-02 06:06:22.0

<span class="emphasis"> *Atualizado:* </span>2018-07-02 15:10:14.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>cof\_rv\_tracking\_order a

<span class="emphasis"> *Order By :*</span>a.Created

<div id="d245138e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome          |      Referência      |                Sql SELECT                 |                                     QueryCriteria                                      |                    Descrição                     |                                                                                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                       |
| :--------------------: | :------------------: | :---------------------------------------: | :------------------------------------------------------------------------------------: | :----------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Estado do Documento   |        Lista         |                a.DocStatus                |                                                                                        |           O estado atual do documento            |                                                                                                                                                                                                                                                                                     O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"                                                                                                                                                                                                                                                                                     |
|  Número do Documento   | Texto Curto (String) |               a.DocumentNo                |                                                                                        |   Documenta o número seqüencial dos documentos   | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|     Data do Pedido     |      Data+Hora       |               a.DateOrdered               |                                                                                        |                  Data do Pedido                  |                                                                                                                                                                                                                                                                                                                                            Indica a Data que um item foi pedido.                                                                                                                                                                                                                                                                                                                                             |
|         Pedido         |    Tabela Direta     |              a.C\_Order\_ID               | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                      Pedido                      |                                                                                                                                                                                                                                              O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas.                                                                                                                                                                                                                                               |
|       Criado por       |       Procurar       |                a.CreatedBy                |                                                                                        |        O usuário que criou este registro         |                                                                                                                                                                                                                                                                                                                                O Campo "Criado por" indica o usuário que criou este registro.                                                                                                                                                                                                                                                                                                                                |
|     Atualizado por     |       Procurar       |                a.UpdatedBy                |                                                                                        |      O usuário que atualizou este registro       |                                                                                                                                                                                                                                                                                                                            O Campo "Atualizado por" indica o usuário que atualizou este registro.                                                                                                                                                                                                                                                                                                                            |
| Tipo de Documento Alvo |       Procurar       |          a.C\_DocTypeTarget\_ID           |                                                                                        | Tipo de Documento Alvo para converter documentos |                                                                                                                                                                                                                                                      Você pode converter tipos de documento (por exemplo de Oferta para Pedido ou Fatura). A conversão é então refletida no tipo atual. Este processamento é iniciado ao se selecionar a Ação de Documento apropriada.                                                                                                                                                                                                                                                       |
|       Atualizado       | Texto Curto (String) | to\_char(a.Updated,'dd/mm/YY HH24:MI:SS') |                                                                                        |     Data em que este registro foi atualizado     |                                                                                                                                                                                                                                                                                                                           O Campo "Atualizado" indica a data em que este registro foi atualizado.                                                                                                                                                                                                                                                                                                                            |
|         Criado         | Texto Curto (String) | to\_char(a.Created,'dd/mm/YY HH24:MI:SS') |                                                                                        |          Data de criação deste registro          |                                                                                                                                                                                                                                                                                                                               O Campo "Criado" indica a data em que este registro foi criado.                                                                                                                                                                                                                                                                                                                                |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/TrackingdePedidosinfodata.html),

</div>
