---
title: "Promoção"
id: Promocao
---
<div id="d186757e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Promoção

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Promoção -
    M\_Promotion](#d186757e22)</span>
  - <span class="section">[2. Tabela: Pré Condição -
    M\_PromotionPreCondition](#d186757e187)</span>
  - <span class="section">[3. Tabela: Linha de Promoção -
    M\_PromotionLine](#d186757e472)</span>
  - <span class="section">[4. Tabela: Quantidade de Distribuição -
    M\_PromotionDistribution](#d186757e637)</span>
  - <span class="section">[5. Tabela: Recompensa -
    M\_PromotionReward](#d186757e848)</span>

</div>

<span class="emphasis">*Descrição:* </span> Configurar regras de
promoção

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2009-04-09 16:57:36.0

<span class="emphasis">*Atualizado em:* </span>2009-04-09 16:57:36.0

<div id="d186757e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Promoção - M\_Promotion

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d186757e29" class="table">

<div class="table-title">

Table 1.1. Promotion
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                  Descrição                   |                                                                           Comentário/Ajuda                                                                           |
| :-------------------: | :------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Promoção        |          ID          |                    |                       |                                                  |                                              |                                                                                                                                                                      |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                                                                         (ver o mesmo acima)                                                                          |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                                                                         (ver o mesmo acima)                                                                          |
|         Ativo         |       Sim-Não        |        (Y)         |                       |                                                  |      (semelhante ao primeiro relatório)      |                                                                         (ver o mesmo acima)                                                                          |
|         Nome          | Texto Curto (String) |                    |                       |                                                  |    Alphanumeric identifier of the entity     |             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.             |
|       Descrição       | Texto Curto (String) |                    |                       |                                                  |   Optional short description of the record   |                                                             A description is limited to 255 characters.                                                              |
| Prioridade em Relação |       Inteiro        |        (0)         |                       |                                                  | Which promotion should be apply to a product |      The relative priority indicate the promotion to use when a product exists in more than one promotion. Promotion with the highest priority take precedence.      |
|       Campanha        |    Tabela Direta     |                    | ccampaign\_mpromotion |                                                  |              Marketing Campaign              | The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign. |
|   M\_Promotion\_UU    | Texto Curto (String) |                    |                       |                                                  |                                              |                                                                                                                                                                      |

</div>

</div>

  

<div id="d186757e187" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Pré Condição - M\_PromotionPreCondition

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186757e194" class="table">

<div class="table-title">

Table 1.2. Pre Condition
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                                      Regra de validação                                                      |                       Descrição                       |                                                Comentário/Ajuda                                                 |
| :--------------------------: | :------------------: | :------------------: | :-----------------------------: | :--------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|  Pré Condições da Promoção   |          ID          |                      |                                 |                                                                                                                              |                                                       |                                                                                                                 |
|           Empresa            |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                              AD\_Client.AD\_Client\_ID \< \> 0                                               |          (semelhante ao primeiro relatório)           |                                               (ver o mesmo acima)                                               |
|         Organização          |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |                                       (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                       |          (semelhante ao primeiro relatório)           |                                               (ver o mesmo acima)                                               |
|            Ativo             |       Sim-Não        |         (Y)          |                                 |                                                                                                                              |          (semelhante ao primeiro relatório)           |                                               (ver o mesmo acima)                                               |
|           Promoção           |    Tabela Direta     |                      | mpromotion\_mpromotionprecondit |                                                                                                                              |                                                       |                                                                                                                 |
|          Seqüência           |       Inteiro        |         (0)          |                                 |                                                                                                                              | Method of ordering records; lowest number comes first |                                   The Sequence indicates the order of records                                   |
|     Parceiro de Negócios     |       Procurar       |                      | cbpartner\_mpromotionpreconditi | C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N' <span class="emphasis">*ReadOnly Logic*</span>: @C\_BP\_Group\_ID@\!0 |             Identifies a Business Partner             | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|      Grupo de Parceiros      |    Tabela Direta     |                      | cbpgroup\_mpromotionpreconditio |                             <span class="emphasis">*ReadOnly Logic*</span>: @C\_BPartner\_ID@\!0                             |                Business Partner Group                 | The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.  |
|        Lista de Preço        |    Tabela Direta     |                      | mpricelist\_mpromotionprecondit |                                                                                                                              |           Unique identifier of a Price List           |           Price Lists are used to determine the pricing, margin and cost of items purchased or sold.            |
|           Armazém            |    Tabela Direta     |                      | mwarehouse\_mpromotionprecondit |                                                                                                                              |          Storage Warehouse and Service Point          |         The Warehouse identifies a unique Warehouse where products are stored or Services are provided.         |
|       Código Promoção        | Texto Curto (String) |                      |                                 |                                                                                                                              |       User entered promotion code at sales time       |                 If present, user entered the promotion code at sales time to get this promotion                 |
|    Contador de Utilização    |       Inteiro        |         (0)          |                                 |                                                                                                                              |                     Usage counter                     |                         Counter to record how many times this promotion have been used                          |
|        Limite de Uso         |       Inteiro        |         (0)          |                                 |                                                                                                                              |                  Maximum usage limit                  |                                Maximum number of time this promotion can be use                                 |
|        Data de Início        |      Data+Hora       |                      |                                 |                                                                                                                              |            First effective day (inclusive)            |                               The Start Date indicates the first or starting date                               |
|          Data Final          |      Data+Hora       |                      |                                 |                                                                                                                              |            Last effective date (inclusive)            |                               The End Date indicates the last date in this range.                               |
|          Atividade           |    Tabela Direta     |                      | cactivity\_mpromotionpreconditi |                                                                                                                              |                   Business Activity                   |             Activities indicate tasks that are performed and used to utilize Activity based Costing             |
| M\_PromotionPreCondition\_UU | Texto Curto (String) |                      |                                 |                                                                                                                              |                                                       |                                                                                                                 |

</div>

</div>

  

<div id="d186757e472" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Linha de Promoção - M\_PromotionLine

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186757e479" class="table">

<div class="table-title">

Table 1.3. Promotion Line
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |              Descrição              |                                     Comentário/Ajuda                                     |
| :---------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :---------------------------------: | :--------------------------------------------------------------------------------------: |
|       Linha da Promoção       |          ID          |                      |                                 |                                                  |                                     |                                                                                          |
|            Empresa            |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório)  |                                   (ver o mesmo acima)                                    |
|          Organização          |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório)  |                                   (ver o mesmo acima)                                    |
|             Ativo             |       Sim-Não        |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório)  |                                   (ver o mesmo acima)                                    |
|           Promoção            |    Tabela Direta     |                      |   mpromotion\_mpromotionline    |                                                  |                                     |                                                                                          |
|       Grupo da Promoção       |    Tabela Direta     |                      | mpromotiongroup\_mpromotionline |                                                  |                                     |                                                                                          |
|         Valor Mínimo          |        Valor         |                      |                                 |                                                  | Minimum Amount in Document Currency |                                                                                          |
| Linha de Promoção Obrigatória |       Sim-Não        |         (Y)          |                                 |                                                  | Order must have this promotion line | The mandatory promotion check box indicates that the order must have this promotion line |
|     M\_PromotionLine\_UU      | Texto Curto (String) |                      |                                 |                                                  |                                     |                                                                                          |

</div>

</div>

  

<div id="d186757e637" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Quantidade de Distribuição - M\_PromotionDistribution

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186757e644" class="table">

<div class="table-title">

Table 1.4. Quantity Distribution
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |                                                        Valores (Padrão)                                                         |        Chave restritiva         |                   Regra de validação                   |                                        Descrição                                        |                                  Comentário/Ajuda                                  |
| :---------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------------: | :-------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------: |
|   Distribuição da Promoção    |          ID          |                                                                                                                                 |                                 |                                                        |                                                                                         |                                                                                    |
|            Empresa            |    Tabela Direta     |                                                      (@\#AD\_Client\_ID@)                                                       |                                 |           AD\_Client.AD\_Client\_ID \< \> 0            |                           (semelhante ao primeiro relatório)                            |                                (ver o mesmo acima)                                 |
|          Organização          |    Tabela Direta     |                                                        (@\#AD\_Org\_ID@)                                                        |                                 |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)    |                           (semelhante ao primeiro relatório)                            |                                (ver o mesmo acima)                                 |
|             Ativo             |       Sim-Não        |                                                               (Y)                                                               |                                 |                                                        |                           (semelhante ao primeiro relatório)                            |                                (ver o mesmo acima)                                 |
|           Promoção            |    Tabela Direta     |                                                                                                                                 | mpromotion\_mpromotiondistribut |                                                        |                                                                                         |                                                                                    |
|           Seqüência           |       Inteiro        | (@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M\_PromotionDistribution WHERE M\_Promotion\_ID=@M\_Promotion\_ID@) |                                 |                                                        |                  Method of ordering records; lowest number comes first                  |                    The Sequence indicates the order of records                     |
|       Linha da Promoção       |    Tabela Direta     |                                                                                                                                 | mpromotionline\_mpromotiondistr | M\_PromotionLine.M\_Promotion\_ID = @M\_Promotion\_ID@ |                                                                                         |                                                                                    |
|           Operação            |        Lista         |                                                            \< = \> =                                                            |                                 |                                                        |                                    Compare Operation                                    |                                                                                    |
|          Quantidade           |      Quantidade      |                                                               (0)                                                               |                                 |                                                        |                                        Quantity                                         | The Quantity indicates the number of a specific product or item for this document. |
|     Tipo de Distribuição      |        Lista         |                                                          Min Minus Max                                                          |                                 |                                                        | Type of quantity distribution calculation using comparison qty and order qty as operand |                                                                                    |
| Classificação da Distribuição |        Lista         |                                                      Ascending Descending                                                       |                                 |                                                        |                       Quantity distribution sorting by unit price                       |                                                                                    |
| M\_PromotionDistribution\_UU  | Texto Curto (String) |                                                                                                                                 |                                 |                                                        |                                                                                         |                                                                                    |

</div>

</div>

  

<div id="d186757e848" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Recompensa - M\_PromotionReward

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186757e855" class="table">

<div class="table-title">

Table 1.5. Reward
Fields

</div>

<div class="table-contents">

|              Nome do campo              |      Referência      |                                                     Valores (Padrão)                                                      |        Chave restritiva         |                                                                       Regra de validação                                                                       |                                       Descrição                                        |                                                                                       Comentário/Ajuda                                                                                       |
| :-------------------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Prêmio da Promoção            |          ID          |                                                                                                                           |                                 |                                                                                                                                                                |                                                                                        |                                                                                                                                                                                              |
|                 Empresa                 |    Tabela Direta     |                                                   (@\#AD\_Client\_ID@)                                                    |                                 |                                                               AD\_Client.AD\_Client\_ID \< \> 0                                                                |                           (semelhante ao primeiro relatório)                           |                                                                                     (ver o mesmo acima)                                                                                      |
|               Organização               |    Tabela Direta     |                                                     (@\#AD\_Org\_ID@)                                                     |                                 |                                                        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                        |                           (semelhante ao primeiro relatório)                           |                                                                                     (ver o mesmo acima)                                                                                      |
|                  Ativo                  |       Sim-Não        |                                                            (Y)                                                            |                                 |                                                                                                                                                                |                           (semelhante ao primeiro relatório)                           |                                                                                     (ver o mesmo acima)                                                                                      |
|                Promoção                 |    Tabela Direta     |                                                                                                                           |  mpromotion\_mpromotionreward   |                                                                                                                                                                |                                                                                        |                                                                                                                                                                                              |
|                Seqüência                |       Inteiro        | (@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M\_PromotionReward WHERE M\_Promotion\_ID=@M\_Promotion\_ID@) |                                 |                                                                                                                                                                |                 Method of ordering records; lowest number comes first                  |                                                                         The Sequence indicates the order of records                                                                          |
|         Por toda a distribuição         |       Sim-Não        |                                                            (N)                                                            |                                 |                                                                                                                                                                |                          This reward is for all distribution                           |                                                                                                                                                                                              |
|        Distribuição da Promoção         |    Tabela Direta     |                                                                                                                           | mpromotiondistribution\_mpromot |            M\_PromotionDistribution.M\_Promotion\_ID = @M\_Promotion\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @IsForAllDistribution@=Y             |                                                                                        |                                                                                                                                                                                              |
| Same distribution for source and target |       Sim-Não        |                                                            (Y)                                                            |                                 |                                            <span class="emphasis">*ReadOnly Logic*</span>: @IsForAllDistribution@=Y                                            |                    Use the same distribution for source and target                     | Use the same distribution for source and target. Source distribution is for the entitlement of the reward, target distribution is the distribution to get the product to apply the reward to |
|           Meta de Distibuição           |        Tabela        |                                                 M\_PromotionDistribution                                                  | mtargetdistribution\_mpromotion | M\_PromotionDistribution.M\_Promotion\_ID = @M\_Promotion\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @IsForAllDistribution@=Y|@IsSameDistribution@=Y |           Get product from target distribution to apply the promotion reward           |                                                                                                                                                                                              |
|             Tipo de Prêmio              |        Lista         |                                         Absolute Amount Flat Discount Percentage                                          |                                 |                                                                                                                                                                | Type of reward which consists of percentage discount, flat discount or absolute amount |                                                                                                                                                                                              |
|                  Valor                  |        Valor         |                                                                                                                           |                                 |                                                                                                                                                                |                              Amount in a defined currency                              |                                                                   The Amount indicates the amount for this document line.                                                                    |
|               Quantidade                |      Quantidade      |                                                                                                                           |                                 |                                                                                                                                                                |                                        Quantity                                        |                                                      The Quantity indicates the number of a specific product or item for this document.                                                      |
|      Classificação da Distribuição      |        Lista         |                                                   Ascending Descending                                                    |                                 |                                                    <span class="emphasis">*ReadOnly Logic*</span>: @Qty@=0                                                     |                      Quantity distribution sorting by unit price                       |                                                                                                                                                                                              |
|               Finalidade                |    Tabela Direta     |                                                                                                                           |    ccharge\_mpromotionreward    |                                                                                                                                                                |                              Additional document charges                               |                                                            The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                                            |
|         M\_PromotionReward\_UU          | Texto Curto (String) |                                                                                                                           |                                 |                                                                                                                                                                |                                                                                        |                                                                                                                                                                                              |

</div>

</div>

  

</div>
