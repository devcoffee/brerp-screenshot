---
title: "Origem do Pedido"
id: OrigemdoPedido
---
<div id="d157237e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Origem do Pedido

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Order Source -
    C\_OrderSource](#d157237e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>Utilizado para
identificar a origem de um pedido quando os pedidos são recebidos de
diferentes lugares. Por exemplo: Loja Virtual, Equipe de Vendas, Sites
Coletivos, etc.

<span class="emphasis"> *Criado em:* </span>2009-09-18 13:27:44.0

<span class="emphasis">*Atualizado em:* </span>2009-09-18 13:27:44.0

<div id="d157237e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Order Source - C\_OrderSource

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d157237e29" class="table">

<div class="table-title">

Table 1.1. Order Source
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   |    Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :------------------: | :--------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Origem do Pedido  |                ID                 |                      |                        |                                                  |                                          |                                                                                                                                              |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) | adclient\_cordersource |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |  adorg\_cordersource   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Chave de Busca   |       Texto Curto (String)        |                      |                        |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Nome        |       Texto Curto (String)        |                      |                        |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição      |       Texto Curto (String)        |                      |                        |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                      |                        |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo        |              Sim-Não              |        ('Y')         |                        |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| C\_OrderSource\_UU |       Texto Curto (String)        |                      |                        |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
