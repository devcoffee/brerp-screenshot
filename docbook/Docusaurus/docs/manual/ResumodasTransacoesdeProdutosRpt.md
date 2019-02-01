---
title: "Resumo das Transações de Produtos"
id: ResumodasTransacoesdeProdutosRpt
---
<div id="d207937e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Resumo das Transações de Produtos

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-05-11 18:54:21.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Resumo das Transações de
Produtos

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório mostra o
resumo de transações para produtos armazenados

<span class="emphasis"> *ReportView:* </span>RV\_M\_Transaction\_Sum

<div id="d207937e25" class="table">

<div class="table-title">

Table 1.1. ResumodasTransacoesdeProdutos
Parâmetros

</div>

<div class="table-contents">

|         Nome         |    Nome da coluna     |  Referência   |                                                                                                            Valores(Padrão)                                                                                                             |                                Descrição                                 |                                                                                     Comentário/Ajuda                                                                                      |
| :------------------: | :-------------------: | :-----------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tipo do Produto    | COF\_ProductType\_ID  |   Procurar    |                                                                                                                                                                                                                                        |            Coluna de relação com a tabela de tipo de produto             |                                                                                Primary Key : Product Type                                                                                 |
|       Produto        |    M\_Product\_ID     |   Procurar    |                                                                                                                                                                                                                                        |                          Produto, Serviço, Item                          |                                                           Identifica um item que é ou comprado ou vendido por esta organização.                                                           |
|       Armazém        |   M\_Warehouse\_ID    | Tabela Direta |                                                                                                                                                                                                                                        |                 Armazém de estocagem e Ponto de Serviço                  |                                   O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                                    |
|     Organização      |      AD\_Org\_ID      | Tabela Direta |                                                                                                           (@\#AD\_Org\_ID@)                                                                                                            |                Entidade organizacional dentro da Empresa                 |                Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                |
| Tipo de Movimentação |     MovementType      |     Lista     | Saldo Inicial Entrega para Cliente Devolução de cliente Saída de Estoque Entrada de Estoque Movimento de Movimento para Produção - Produção + Devoluções a Fornecedor Recebimentos de Fornecedor Ordem de Serviço - Ordem de Serviço + |                    Método de Movimentação de Estoque                     |                                                 O "Tipo de Movimentação" indica o tipo de movimento (entrada, saída, para produção, etc)                                                  |
|  Classe do Produto   | COF\_ProductClass\_ID |   Procurar    |                                                                                                                                                                                                                                        |           Coluna de relação com a tabela de classe de produto            |                                                                                Primary Key : Product Class                                                                                |
|   Grupo do Produto   | COF\_ProductGroup\_ID |   Procurar    |                                                                                                                                                                                                                                        |            Coluna de relação com a tabela de grupo do produto            |                                                                                Primary Key : Product Group                                                                                |
| Data da Movimentação |     MovementDate      |     Data      |                                                                                                               (@\#Date@)                                                                                                               | Data em que um produto foi movido para dentro ou para fora de um estoque | A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento. |

</div>

</div>

  

<div id="d207937e154" class="table">

<div class="table-title">

Table 1.2. RV\_M\_Transaction\_Sum -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna     |    Referência     |                                                                                                             Valores padrão                                                                                                             | Valor de restrição |                Regra de validação                |                    Descrição                    |                                                                  Comentário/Ajuda                                                                  |
| :--------------------: | :---------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :---------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa         |   Tabela Direta   |                                                                                                                                                                                                                                        |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                   (ver acima)                   |                                                                    (ver acima)                                                                     |
|      Organização       |   Tabela Direta   |                                                                                                                                                                                                                                        |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                   (ver acima)                   |                                                                    (ver acima)                                                                     |
|   Classe do Produto    |      Tabela       |                                                                                                      COF\_ProductClass Value Name                                                                                                      |                    |                                                  |           Primary Key : Product Class           |                                                            Primary Key : Product Class                                                             |
|    Grupo do Produto    |      Tabela       |                                                                                                      COF\_ProductGroup Value Name                                                                                                      |                    |                                                  |           Primary Key : Product Group           |                                                            Primary Key : Product Group                                                             |
|    Tipo do Produto     |      Tabela       |                                                                                                      COF\_ProductType Name Value                                                                                                       |                    |                                                  |           Primary Key : Product Type            |                                                             Primary Key : Product Type                                                             |
|      Localizador       | Locator (Armazém) |                                                                                                                                                                                                                                        |                    |                                                  |                Warehouse Locator                |                                          The Locator indicates where in a Warehouse a product is located.                                          |
|  Data da Movimentação  |       Data        |                                                                                                                                                                                                                                        |                    |                                                  | Date a product was moved in or out of inventory | The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement. |
| Quantidade Movimentada |    Quantidade     |                                                                                                                                                                                                                                        |                    |                                                  |          Quantity of a product moved.           |                                   The Movement Quantity indicates the quantity of a product that has been moved.                                   |
|  Tipo de Movimentação  |       Lista       | Saldo Inicial Entrega para Cliente Devolução de cliente Saída de Estoque Entrada de Estoque Movimento de Movimento para Produção - Produção + Devoluções a Fornecedor Recebimentos de Fornecedor Ordem de Serviço - Ordem de Serviço + |                    |                                                  |         Method of moving the inventory          |                                   The Movement Type indicates the type of movement (in, out, to production, etc)                                   |
|        Produto         |   Tabela Direta   |                                                                                                                                                                                                                                        |                    |                                                  |             Product, Service, Item              |                                     Identifies an item which is either purchased or sold in this organization.                                     |
|        Armazém         |   Tabela Direta   |                                                                                                                                                                                                                                        |                    |                                                  |       Storage Warehouse and Service Point       |                          The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                           |

</div>

</div>

  

</div>
