---
title: "Detalhes Estoque Previsto"
id: DetalhesEstoquePrevistoRpt
---
<div id="d47973e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Detalhes Estoque Previsto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-06-29 15:33:32.0

<span class="emphasis">*Atualizado:*</span>2018-06-29 15:33:32.0

<span class="emphasis"> *ReportView:*
</span>COF\_RV\_DetalhesEstoquePrevisto

![](/img/manual/DetalhesEstoquePrevisto.png)

<div id="d47973e18" class="table">

<div class="table-title">

Table 1.1. DetalhesEstoquePrevisto
Parâmetros

</div>

<div class="table-contents">

|         Nome         |    Nome da coluna     |  Referência   |       Valores(Padrão)        |                                Descrição                                 |                                                                                     Comentário/Ajuda                                                                                      |
| :------------------: | :-------------------: | :-----------: | :--------------------------: | :----------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Data da Movimentação |     MovementDate      |     Data      |                              | Data em que um produto foi movido para dentro ou para fora de um estoque | A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento. |
|   Grupo do Produto   | COF\_ProductGroup\_ID |   Procurar    | COF\_ProductGroup Value Name |            Coluna de relação com a tabela de grupo do produto            |                                                                                Primary Key : Product Group                                                                                |
|  Classe do Produto   | COF\_ProductClass\_ID |   Procurar    | COF\_ProductClass Value Name |           Coluna de relação com a tabela de classe de produto            |                                                                                Primary Key : Product Class                                                                                |
|   Tipo do Produto    | COF\_ProductType\_ID  |   Procurar    | COF\_ProductType Name Value  |            Coluna de relação com a tabela de tipo de produto             |                                                                                Primary Key : Product Type                                                                                 |
|       Produto        |    M\_Product\_ID     |   Procurar    |                              |                          Produto, Serviço, Item                          |                                                           Identifica um item que é ou comprado ou vendido por esta organização.                                                           |
|     Organização      |      AD\_Org\_ID      | Tabela Direta |      (@\#AD\_Org\_ID@)       |                Entidade organizacional dentro da Empresa                 |                Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                |

</div>

</div>

  

<div id="d47973e121" class="table">

<div class="table-title">

Table 1.2. COF\_RV\_DetalhesEstoquePrevisto -
Colunas

</div>

<div class="table-contents">

|           Nome da coluna            |  Referência   |                                                            Valores padrão                                                             | Valor de restrição |                                                                          Regra de validação                                                                          |                     Descrição                     |                                                                  Comentário/Ajuda                                                                  |
| :---------------------------------: | :-----------: | :-----------------------------------------------------------------------------------------------------------------------------------: | :----------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|               Empresa               | Tabela Direta |                                                         (@\#AD\_Client\_ID@)                                                          |                    |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                    (ver acima)                    |                                                                    (ver acima)                                                                     |
|             Organização             | Tabela Direta |                                                           (@\#AD\_Org\_ID@)                                                           |                    |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                    (ver acima)                    |                                                                    (ver acima)                                                                     |
|                Valor                |     Valor     |                                                                                                                                       |                    |                                                                                                                                                                      |                      Amount                       |                                                                       Amount                                                                       |
| Linha de Ajuste de Estoque Previsto | Tabela Direta |                                                                                                                                       |                    |                                                                                                                                                                      | Primary Key : Linha de Ajuste de Estoque Previsto |                                                 Primary Key : Linha de Ajuste de Estoque Previsto                                                  |
|        cof\_cumulatedcostamt        |     Valor     |                                                                                                                                       |                    |                                                                                                                                                                      |                                                   |                                                                                                                                                    |
|     Identificador de Transação      |     Lista     | Ajuste de Estoque (-) Ajuste de Estoque (+) Fatura (-) Fatura (+) Produção (-) Produção (+) Documento Fiscal (-) Documento Fiscal (+) |                    |                                                                                                                                                                      |                                                   |                                                                                                                                                    |
|          Classe do Produto          |    Tabela     |                                                     COF\_ProductClass Value Name                                                      |                    |                                                                                                                                                                      |            Primary Key : Product Class            |                                                            Primary Key : Product Class                                                             |
|          Grupo do Produto           |    Tabela     |                                                     COF\_ProductGroup Value Name                                                      |                    |                                                                                                                                                                      |            Primary Key : Product Group            |                                                            Primary Key : Product Group                                                             |
|           Tipo do Produto           |    Tabela     |                                                      COF\_ProductType Name Value                                                      |                    |                                                                                                                                                                      |            Primary Key : Product Type             |                                                             Primary Key : Product Type                                                             |
|           Valor Acumulado           |     Valor     |                                                                  (0)                                                                  |                    |                                                                                                                                                                      |                   Total Amount                    |                                                                 Sum of all amounts                                                                 |
|        Preço de Custo Atual         | Custos+Preços |                                                                                                                                       |                    |                                                                                                                                                                      |           The currently used cost price           |                                                                                                                                                    |
|        Doc. Fiscal - Linhas         | Tabela Direta |                                                                                                                                       |                    |                                                                                                                                                                      |                                                   |                                                                                                                                                    |
|        Data da Movimentação         |     Data      |                                                                                                                                       |                    |                                                                                                                                                                      |  Date a product was moved in or out of inventory  | The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement. |
|               Produto               |   Procurar    |                                                                                                                                       |                    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |              Product, Service, Item               |                                     Identifies an item which is either purchased or sold in this organization.                                     |
|          Linha de Produção          | Tabela Direta |                                                                                                                                       |                    |                                                                                                                                                                      |      Document Line representing a production      |                          The Production Line indicates the production document line (if applicable) for this transaction                           |
|             Quantidade              |  Quantidade   |                                                                                                                                       |                    |                                                                                                                                                                      |                     Quantity                      |                                 The Quantity indicates the number of a specific product or item for this document.                                 |
|         quantidade\_antiga          |    Número     |                                                                                                                                       |                    |                                                                                                                                                                      |                                                   |                                                                                                                                                    |
|          quantidade\_atual          |    Número     |                                                                                                                                       |                    |                                                                                                                                                                      |                                                   |                                                                                                                                                    |

</div>

</div>

  

</div>
