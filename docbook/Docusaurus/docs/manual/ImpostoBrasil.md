---
title: "Imposto (Brasil)"
id: ImpostoBrasil
---
<div id="d119225e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Imposto (Brasil)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Imposto -
    LBR\_TaxName](#d119225e22)</span>
  - <span class="section">[2. Tabela: Fórmula -
    LBR\_TaxFormula](#d119225e295)</span>
  - <span class="section">[3. Tabela: CST -
    LBR\_TaxStatus](#d119225e554)</span>
  - <span class="section">[4. Tabela: Mod BC -
    COF\_ModBC](#d119225e800)</span>
  - <span class="section">[5. Tabela: Retention Configuration -
    COF\_RetentionConfig](#d119225e961)</span>
  - <span class="section">[6. Tabela: Código de Enquadramento Legal -
    COF\_CEnq](#d119225e1180)</span>
  - <span class="section">[7. Tabela: Motivo Desoneração -
    COF\_MotDeson](#d119225e1355)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-15 10:58:06.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:59:55.0

<div id="d119225e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Imposto - LBR\_TaxName

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_TaxName_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d119225e31" class="table">

<div class="table-title">

Table 1.1. Tax
Fields

</div>

<div class="table-contents">

|            Nome do campo             |      Referência      |                    Valores (Padrão)                    | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------------------: | :------------------: | :----------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|                Ativo                 |       Sim-Não        |                         ('Y')                          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|               Imposto                |          ID          |                                                        |                  |                                                  |      Primary key table LBR\_TaxName      |                                                        Primary key table LBR\_TaxName                                                        |
|               Empresa                |    Tabela Direta     |                  (@\#AD\_Client\_ID@)                  |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Organização              |    Tabela Direta     |                   (@\#AD\_Org\_ID@)                    |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                 Nome                 | Texto Curto (String) |                                                        |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Descrição               |      Memorando       |                                                        |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|           Tipo de Imposto            |        Lista         | Produto Serviço Substituição Tributária Variável ('P') |                  |                                                  |           Define the Tax Type            |                                                             Define the Tax Type                                                              |
|        Freqüência da Retenção        |        Lista         |          Sempre Reter Quinzenal Mensal ('M')           |                  |                                                  |      Defines the Withhold Frequency      |                                                        Defines the Withhold Frequency                                                        |
|         Imposto Substituído          |        Tabela        |                      LBR\_TaxName                      |                  |      LBR\_TaxName.lbr\_TaxType IN ('P','S')      |       Defines the Tax Substitution       |                                                         Defines the Tax Substitution                                                         |
|           Possui Retenção            |       Sim-Não        |                         ('N')                          |                  |                                                  |     Defines if the Tax, has WithHold     |                                                       Defines if the Tax, has WithHold                                                       |
|          Limiar da Retenção          |        Valor         |                                                        |                  |                                                  |      Defines the WithHold Threshold      |                                                        Defines the WithHold Threshold                                                        |
|           Base de Cálculo            |        Lista         |          Total Fatura Total do Imposto ('I')           |                  |                                                  |                                          |                                                                                                                                              |
|       Possui Modalidade de BC        |       Sim-Não        |                         ('Y')                          |                  |                                                  |                                          |                                                                                                                                              |
|              Possui CST              |       Sim-Não        |                         ('Y')                          |                  |                                                  |                                          |                                                                                                                                              |
| Possui Código de Enquadramento Legal |       Sim-Não        |                          (N)                           |                  |                                                  |                                          |                                                                                                                                              |
|          Motivo Desoneração          |       Sim-Não        |                         ('N')                          |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d119225e295" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Fórmula - LBR\_TaxFormula

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_TaxFormula_data)

<span class="emphasis">*Coluna linkada:* </span> Tax Name

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119225e308" class="table">

<div class="table-title">

Table 1.2. Formula
Fields

</div>

<div class="table-contents">

|     Nome do campo     |  Referência   |                                                       Valores (Padrão)                                                       | Chave restritiva |                Regra de validação                |                 Descrição                  |                                           Comentário/Ajuda                                            |
| :-------------------: | :-----------: | :--------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :----------------------------------------: | :---------------------------------------------------------------------------------------------------: |
|  Fórmula do Imposto   |      ID       |                                                                                                                              |                  |                                                  |     Primary key table LBR\_TaxFormula      |                                   Primary key table LBR\_TaxFormula                                   |
|        Fórmula        |   Memorando   |                                                                                                                              |                  |                                                  |          Defines the Tax Formula           |                                        Defines the Tax Formula                                        |
| Fórmula Valor Líquido |   Memorando   |                                                                                                                              |                  |                                                  |      Defines the Tax Formula NetWorth      |                                   Defines the Tax Formula NetWorth                                    |
|   Fator de Serviço    |   Memorando   |                                                                                                                              |                  |                                                  |     Define the Service Factor Formula      |                                   Define the Service Factor Formula                                   |
|        Empresa        | Tabela Direta |                                                     (@\#AD\_Client\_ID@)                                                     |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |     (semelhante ao primeiro relatório)     |                                          (ver o mesmo acima)                                          |
|      Organização      | Tabela Direta |                                                      (@\#AD\_Org\_ID@)                                                       |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                                          (ver o mesmo acima)                                          |
|        Imposto        | Tabela Direta |                                                                                                                              |                  |                                                  |       Primary key table LBR\_TaxName       |                                    Primary key table LBR\_TaxName                                     |
|         Ativo         |    Sim-Não    |                                                            ('Y')                                                             |                  |                                                  |     (semelhante ao primeiro relatório)     |                                          (ver o mesmo acima)                                          |
|     Válido desde      |     Data      |                                                                                                                              |                  |                                                  | Valid from including this date (first day) |                      The Valid From date indicates the first day of a date range                      |
|        Fórmula        | Tabela Direta |                                                                                                                              |                  |                                                  |                                            |                                                                                                       |
|   Formula Net (BR)    |    Tabela     |                                                         LBR\_Formula                                                         |                  |                                                  |                                            |                                                                                                       |
|   Fórmula Adicional   |    Tabela     |                                                         LBR\_Formula                                                         |                  |                                                  |                                            |                                                                                                       |
|     Fórmula Base      |    Tabela     |                                                         LBR\_Formula                                                         |                  |                                                  |                                            |                                                                                                       |
| Preço Inclui Imposto  |    Sim-Não    |                                                             (N)                                                              |                  |                                                  |        Tax is included in the price        | The Tax Included checkbox indicates if the prices include tax. This is also known as the gross price. |
|   Tipo de Transação   |     Lista     | Consumidor Final Exportação Indireta Exportação Importação Uso Interno Industrialização Outros Remessa Revenda Transferência |                  |                                                  |        Defines the Transaction Type        |                                     Defines the Transaction Type                                      |

</div>

</div>

  

<div id="d119225e554" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: CST - LBR\_TaxStatus

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_TaxStatus_data)

<span class="emphasis">*Coluna linkada:* </span> Tax Name

<span class="emphasis">*Lógica de visualização:*</span>
@cof\_hasTaxStatus@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119225e571" class="table">

<div class="table-title">

Table 1.3. Tax Status
Fields

</div>

<div class="table-contents">

|         Nome do campo         |            Referência             |              Valores (Padrão)              | Chave restritiva | Regra de validação |                    Descrição                     |                                                               Comentário/Ajuda                                                               |
| :---------------------------: | :-------------------------------: | :----------------------------------------: | :--------------: | :----------------: | :----------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|           CST/CSOSN           |                ID                 |                                            |                  |                    |                                                  |                                                                                                                                              |
|            Empresa            |           Tabela Direta           |                                            |                  |                    |        (semelhante ao primeiro relatório)        |                                                             (ver o mesmo acima)                                                              |
|          Organização          |           Tabela Direta           |                    (0)                     |                  |                    |        (semelhante ao primeiro relatório)        |                                                             (ver o mesmo acima)                                                              |
|             Nome              |       Texto Curto (String)        |                                            |                  |                    |      Alphanumeric identifier of the entity       | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|           Grupo CST           |               Lista               | Imunidade Isenção Outros Redução Suspensão |                  |                    |                                                  |                                                                                                                                              |
| Utilizado no Simples Nacional |              Sim-Não              |                   ('N')                    |                  |                    |                                                  |                                                                                                                                              |
|      Transação de Vendas      |              Sim-Não              |                   ('N')                    |                  |                    |           This is a Sales Transaction            |                                The Sales Transaction checkbox indicates if this item is a Sales Transaction.                                 |
|           Descrição           | Texto Médio (até 2000 caracteres) |                                            |                  |                    |     Optional short description of the record     |                                                 A description is limited to 255 characters.                                                  |
|          Observações          |       Texto Curto (String)        |                                            |                  |                    |        Observation for Tax Determination         |                                                                                                                                              |
|         Válido desde          |               Data                |                 (@\#Date@)                 |                  |                    |    Valid from including this date (first day)    |                                         The Valid From date indicates the first day of a date range                                          |
|          Válido até           |               Data                |                                            |                  |                    |     Valid to including this date (last day)      |                                           The Valid To date indicates the last day of a date range                                           |
|            Imposto            |           Tabela Direta           |                                            |                  |                    |          Primary key table LBR\_TaxName          |                                                        Primary key table LBR\_TaxName                                                        |
|             Ativo             |              Sim-Não              |                                            |                  |                    |        (semelhante ao primeiro relatório)        |                                                             (ver o mesmo acima)                                                              |
|       Roteiro (Script)        |             Memorando             |                                            |                  |                    | Dynamic Java Language Script to calculate result |                                     Use Java language constructs to define the result of the calculation                                     |

</div>

</div>

  

<div id="d119225e800" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Mod BC - COF\_ModBC

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ModBC_data)

<span class="emphasis">*Coluna linkada:* </span> Tax Name

<span class="emphasis">*Lógica de visualização:*</span>
@cof\_hasModBC@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119225e817" class="table">

<div class="table-title">

Table 1.4. Mod BC
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   |   Chave restritiva   |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :------------------: | :------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Modalidade da BC |          ID          |                      |                      |                                                  |  Primary Key : Mode Calculation Base  |                                                     Primary Key : Mode Calculation Base                                                      |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                      |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Imposto      |    Tabela Direta     |                      | LBRTaxName\_COFModBC |                                                  |    Primary key table LBR\_TaxName     |                                                        Primary key table LBR\_TaxName                                                        |
|  Chave de Busca  | Texto Curto (String) |                      |                      |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Nome       | Texto Curto (String) |                      |                      |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Tipo       |        Lista         |   Percentual Valor   |                      |                                                  |                                       |                                                                                                                                              |
|      Ativo       |       Sim-Não        |         (Y)          |                      |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d119225e961" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Retention Configuration - COF\_RetentionConfig

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_RetentionConfig_data)

<span class="emphasis">*Coluna linkada:* </span> Tax Name

<span class="emphasis">*Lógica de visualização:*</span>
@lbr\_TaxType@='S' %26 @HasWithHold@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119225e978" class="table">

<div class="table-title">

Table 1.5. Retention Configuration
Fields

</div>

<div class="table-contents">

|         Nome do campo          |  Referência   |     Valores (Padrão)     |        Chave restritiva         |                   Regra de validação                    |                         Descrição                          |                                                Comentário/Ajuda                                                 |
| :----------------------------: | :-----------: | :----------------------: | :-----------------------------: | :-----------------------------------------------------: | :--------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|            Imposto             |   Procurar    |       LBR\_TaxName       | LBRTaxName\_COFRetentionConfig  |                                                         |               Primary key table LBR\_TaxName               |                                         Primary key table LBR\_TaxName                                          |
|            Empresa             | Tabela Direta |   (@\#AD\_Client\_ID@)   |  ADClient\_COFRetentionConfig   |            AD\_Client.AD\_Client\_ID \< \> 0            |             (semelhante ao primeiro relatório)             |                                               (ver o mesmo acima)                                               |
|          Organização           | Tabela Direta |    (@\#AD\_Org\_ID@)     |    ADOrg\_COFRetentionConfig    |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)     |             (semelhante ao primeiro relatório)             |                                               (ver o mesmo acima)                                               |
|           Finalidade           | Tabela Direta |                          |   CCharge\_COFRetentionConfig   |                                                         |                Additional document charges                 |                     The Charge indicates a type of Charge (Handling, Shipping, Restocking)                      |
|      Parceiro de Negócios      |   Procurar    |                          |  CBPartner\_COFRetentionConfig  |                                                         |               Identifies a Business Partner                | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|    Localização do Parceiro     | Tabela Direta |                          | CBPartnerLocation\_COFRetention | C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@ | Identifies the (ship to) address for this Business Partner |                        The Partner address indicates the location of a Business Partner                         |
|       Tipo de Documento        | Tabela Direta |                          |  CDocType\_COFRetentionConfig   |                                                         |                   Document type or rules                   |                       The Document Type determines document sequence and processing rules                       |
|     Condição de Pagamento      | Tabela Direta |                          | CPaymentTerm\_COFRetentionConfi |                                                         |          The terms of Payment (timing, discount)           |                            Payment Terms identify the method and timing of payment.                             |
|             Ativo              |    Sim-Não    |           (Y)            |                                 |                                                         |             (semelhante ao primeiro relatório)             |                                               (ver o mesmo acima)                                               |
| Condição de Pagamento Auxuliar |    Tabela     |      C\_PaymentTerm      | COFPaymentTerm\_COFRetentionCon |                                                         |          The terms of Payment (timing, discount)           |                            Payment Terms identify the method and timing of payment.                             |
|    Configuração de Retenção    |     Lista     | Ambos Compra Venda ('A') |                                 |                                                         |                                                            |                                                                                                                 |
|    COF\_RetentionConfig\_ID    |      ID       |                          |                                 |                                                         |           Primary Key : Retention Configurations           |                                     Primary Key : Retention Configurations                                      |

</div>

</div>

  

<div id="d119225e1180" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Código de Enquadramento Legal - COF\_CEnq

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_CEnq_data)

<span class="emphasis">*Coluna linkada:* </span> Tax Name

<span class="emphasis">*Lógica de visualização:*</span>
@cof\_hasCEnq@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119225e1197" class="table">

<div class="table-title">

Table 1.6. Código de Enquadramento Legal
Fields

</div>

<div class="table-contents">

|  Nome do campo  |            Referência             |              Valores (Padrão)              |  Chave restritiva   |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------: | :-------------------------------: | :----------------------------------------: | :-----------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Cód. Enq. Legal |                ID                 |                                            |                     |                                                  |      Código de Enquadramento Legal       |                                                        Código de Enquadramento Legal                                                         |
|     Empresa     |           Tabela Direta           |            (@\#AD\_Client\_ID@)            |                     |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização   |           Tabela Direta           |             (@\#AD\_Org\_ID@)              |                     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Imposto     |           Tabela Direta           |                                            | LBRTaxName\_COFCEnq |                                                  |      Primary key table LBR\_TaxName      |                                                        Primary key table LBR\_TaxName                                                        |
| Chave de Busca  |       Texto Curto (String)        |                                            |                     |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Nome       |       Texto Curto (String)        |                                            |                     |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição    | Texto Médio (até 2000 caracteres) |                                            |                     |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Grupo CST    |               Lista               | Imunidade Isenção Outros Redução Suspensão |                     |                                                  |                                          |                                                                                                                                              |
|      Ativo      |              Sim-Não              |                    (Y)                     |                     |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d119225e1355" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Motivo Desoneração - COF\_MotDeson

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_MotDeson_data)

<span class="emphasis">*Lógica de visualização:*</span>
@cof\_hasMotDeson@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119225e1368" class="table">

<div class="table-title">

Table 1.7. Motivo Desoneração
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Motivo de Desoneração |          ID          |                      |                         |                                                  |         Motivo de Desoneração         |                                                            Motivo de Desoneração                                                             |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|      Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|        Imposto        |       Procurar       |     LBR\_TaxName     | LBRTaxName\_COFMotDeson |                                                  |    Primary key table LBR\_TaxName     |                                                        Primary key table LBR\_TaxName                                                        |
|    Chave de Busca     | Texto Curto (String) |                      |                         |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|         Nome          | Texto Curto (String) |                      |                         |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Ativo         |       Sim-Não        |         (Y)          |                         |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
