---
title: "Ocorrência de Entrega"
id: OcorrenciadeEntrega
---
<div id="d150112e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ocorrência de Entrega

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ocorrência de Entrega -
    COF\_DeliveryOccurrence](#d150112e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-04-28 10:18:55.0

<span class="emphasis">*Atualizado em:* </span>2015-04-28 10:18:55.0

![](/img/manual/OcorrenciadeEntrega.png)

<div id="d150112e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ocorrência de Entrega - COF\_DeliveryOccurrence

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d150112e30" class="table">

<div class="table-title">

Table 1.1. Delivery Occurrence
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                     Comentário/Ajuda                                     |
| :-------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------: |
|    Ocorrência de Entrega    |          ID          |                      |                  |                                                  |    Primary Key : Delivery Occurrence     |                            Primary Key : Delivery Occurrence                             |
| COF\_DeliveryOccurrence\_UU | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                          |
|           Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                   (ver o mesmo acima)                                    |
|         Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                   (ver o mesmo acima)                                    |
|           Código            | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                          |
|     Tipo de Ocorrência      |        Lista         |  Entrada Saída (SA)  |                  |                                                  |                                          |                                                                                          |
|            Ativo            |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                   (ver o mesmo acima)                                    |
|          Descrição          | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                       A description is limited to 255 characters.                        |
|      Finaliza Embarque      |       Sim-Não        |                      |                  |                                                  |                                          |                                                                                          |
|      Item Transferido       |       Sim-Não        |                      |                  |                                                  |                                          | It indicates whether the packing list item should be transferred to another packing list |

</div>

</div>

  

</div>
