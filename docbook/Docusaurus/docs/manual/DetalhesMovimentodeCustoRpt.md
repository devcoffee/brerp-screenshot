---
title: "Detalhes Movimento de Custo"
id: DetalhesMovimentodeCustoRpt
---
<div id="d48156e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Detalhes Movimento de Custo

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-07-12 08:36:43.0

<span class="emphasis">*Atualizado:*</span>2018-07-12 08:38:22.0

<span class="emphasis"> *ReportView:*
</span>cof\_rv\_detalhesMovimentoCusto

![](/img/manual/DetalhesMovimentodeCusto.png)

<div id="d48156e18" class="table">

<div class="table-title">

Table 1.1. DetalhesMovimentodeCusto
Parâmetros

</div>

<div class="table-contents">

|       Nome        |    Nome da coluna     |  Referência   | Valores(Padrão) |                      Descrição                      |                                                                      Comentário/Ajuda                                                                       |
| :---------------: | :-------------------: | :-----------: | :-------------: | :-------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Organização    |      AD\_Org\_ID      | Tabela Direta |                 |      Entidade organizacional dentro da Empresa      | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|  Tipo do Produto  | COF\_ProductType\_ID  |   Procurar    |                 |  Coluna de relação com a tabela de tipo de produto  |                                                                 Primary Key : Product Type                                                                  |
| Classe do Produto | COF\_ProductClass\_ID |   Procurar    |                 | Coluna de relação com a tabela de classe de produto |                                                                 Primary Key : Product Class                                                                 |
| Grupo do Produto  | COF\_ProductGroup\_ID |   Procurar    |                 | Coluna de relação com a tabela de grupo do produto  |                                                                 Primary Key : Product Group                                                                 |
| Elemento de Custo |  M\_CostElement\_ID   | Tabela Direta |                 |            Elemento de Custo de Produto             |                                                                            null                                                                             |
|      Criado       |        Created        |     Data      |                 |           Data de criação deste registro            |                                               O Campo "Criado" indica a data em que este registro foi criado.                                               |
|      Produto      |    M\_Product\_ID     |   Procurar    |                 |               Produto, Serviço, Item                |                                            Identifica um item que é ou comprado ou vendido por esta organização.                                            |

</div>

</div>

  

<div id="d48156e134" class="table">

<div class="table-title">

Table 1.2. cof\_rv\_detalhesMovimentoCusto -
Colunas

</div>

<div class="table-contents">

|           Nome da coluna           |      Referência      |        Valores padrão        | Valor de restrição |                                                                          Regra de validação                                                                          |                           Descrição                           |                                                 Comentário/Ajuda                                                 |
| :--------------------------------: | :------------------: | :--------------------------: | :----------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
|              Empresa               |    Tabela Direta     |     (@\#AD\_Client\_ID@)     |                    |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                          (ver acima)                          |                                                   (ver acima)                                                    |
|            Organização             |    Tabela Direta     |      (@\#AD\_Org\_ID@)       |                    |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                          (ver acima)                          |                                                   (ver acima)                                                    |
|               Valor                |        Valor         |                              |                    |                                                                                                                                                                      |                            Amount                             |                                                      Amount                                                      |
|          Esquema Contábil          |    Tabela Direta     |                              |                    |                                                                                                                                                                      |                     Rules for accounting                      |     An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar      |
|         Classe do Produto          |        Tabela        | COF\_ProductClass Value Name |                    |                                                                                                                                                                      |                  Primary Key : Product Class                  |                                           Primary Key : Product Class                                            |
|          Grupo do Produto          |        Tabela        | COF\_ProductGroup Value Name |                    |                                                                                                                                                                      |                  Primary Key : Product Group                  |                                           Primary Key : Product Group                                            |
|          Tipo do Produto           |        Tabela        | COF\_ProductType Name Value  |                    |                                                                                                                                                                      |                  Primary Key : Product Type                   |                                            Primary Key : Product Type                                            |
|               Criado               |      Data+Hora       |          (SYSDATE)           |                    |                                                                                                                                                                      |                 Date this record was created                  |                        The Created field indicates the date that this record was created.                        |
|           Delta de Valor           |        Valor         |                              |                    |                                                                                                                                                                      |                       Difference Amount                       |                                                                                                                  |
|        Delta de Quantidade         |      Quantidade      |                              |                    |                                                                                                                                                                      |                      Quantity Difference                      |                                                                                                                  |
|             Descrição              | Texto Curto (String) |                              |                    |                                                                                                                                                                      |           Optional short description of the record            |                                   A description is limited to 255 characters.                                    |
| Instância do Conjunto de Atributos | Atributo de Produto  |                              |                    |                                                                                                                                                                      |                Product Attribute Set Instance                 | The values of the actual Product Attribute Instances. The product level attributes are defined on Product level. |
|          Detalhe de Custo          |    Tabela Direta     |                              |                    |                                                                                                                                                                      |                    Cost Detail Information                    |                                                                                                                  |
|         Elemento de Custo          |    Tabela Direta     |                              |                    |                                                                                                                                                                      |                     Product Cost Element                      |                                                                                                                  |
|           Tipo de Custo            |    Tabela Direta     |                              |                    |                                                                                                                                                                      |           Type of Cost (e.g. Current, Plan, Future)           |     You can define multiple cost types. A cost type selected in an Accounting Schema is used for accounting.     |
|      Linha de Estoque Físico       |       Procurar       |                              |                    |                                                                                                                                                                      |             Unique line in an Inventory document              |      The Physical Inventory Line indicates the inventory document line (if applicable) for this transaction      |
|              Produto               |       Procurar       |                              |                    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                    Product, Service, Item                     |                    Identifies an item which is either purchased or sold in this organization.                    |
|        Novo Valor Acumulado        |        Valor         |                              |                    |                                                                                                                                                                      |       Accumulated Amt after processing of M\_CostDetail       |                                                                                                                  |
|        Novo Preço de Custo         |    Custos+Preços     |                              |                    |                                                                                                                                                                      |   New current cost price after processing of M\_CostDetail    |                                                                                                                  |
|     Nova Quantidade Acumulada      |      Quantidade      |                              |                    |                                                                                                                                                                      |     New Accumulated Qty after processing of M\_CostDetail     |                                                                                                                  |
|       Nova Quantidade Atual        |      Quantidade      |                              |                    |                                                                                                                                                                      |    New current quantity after processing of M\_CostDetail     |                                                                                                                  |
|       Valor Antigo Acumulado       |        Valor         |                              |                    |                                                                                                                                                                      |  Old accumulated amt before the processing of M\_CostDetail   |                                                                                                                  |
|    Antigo Preço de Custo Atual     |    Custos+Preços     |                              |                    |                                                                                                                                                                      | Old current cost price before the processing of M\_CostDetail |                                                                                                                  |
|       Antiga Qtd. Acumulada        |      Quantidade      |                              |                    |                                                                                                                                                                      |  Old accumulated qty before the processing of M\_CostDetail   |                                                                                                                  |
|      Antiga Quantidade Atual       |      Quantidade      |                              |                    |                                                                                                                                                                      |  Old current quantity before the processing of M\_CostDetail  |                                                                                                                  |
|             Quantidade             |      Quantidade      |                              |                    |                                                                                                                                                                      |                           Quantity                            |                The Quantity indicates the number of a specific product or item for this document.                |

</div>

</div>

  

</div>
