---
title: "Imposto Brasileiro"
id: ImpostoBrasileiro
---
<div id="d119886e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Imposto Brasileiro

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Imposto Brasileiro -
    LBR\_Tax](#d119886e22)</span>
  - <span class="section">[2. Tabela: Linha de Imposto -
    LBR\_TaxLine](#d119886e160)</span>

</div>

<span class="emphasis">*Descrição:* </span> Manutenção dos Impostos
Brasileiros utilizados por documentos do sistema

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-12-29 15:41:59.0

<span class="emphasis">*Atualizado em:* </span>2015-12-29 15:41:59.0

<div id="d119886e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Imposto Brasileiro - LBR\_Tax

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_Tax_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d119886e31" class="table">

<div class="table-title">

Table 1.1. Imposto Brasileiro
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                                                                   Comentário/Ajuda                                                                                                   |
| :----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Imposto Brasileiro |          ID          |                      |                  |                                                  |        Primary key table LBR\_Tax        |                                                                                              Primary key table LBR\_Tax                                                                                              |
|      Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                  |
|    Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Descrição      | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                                                     A description is limited to 255 characters.                                                                                      |
|       Ativo        |       Sim-Não        |        ('Y')         |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                 (ver o mesmo acima)                                                                                                  |
|       Tabela       |    Tabela Direta     |                      | ADTable\_LBRTax  |                                                  |        Database Table information        |                                                                         The Database Table provides the information of the table definition                                                                          |
|   ID do Registro   |        Botão         |                      |                  |                                                  |        Direct internal record ID         | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |

</div>

</div>

  

<div id="d119886e160" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha de Imposto - LBR\_TaxLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_TaxLine_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d119886e169" class="table">

<div class="table-title">

Table 1.2. Linha de Imposto
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                 Regra de validação                 |                  Descrição                   |                                                   Comentário/Ajuda                                                    |
| :---------------------------: | :------------------: | :------------------: | :-----------------------------: | :------------------------------------------------: | :------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------: |
|       Linha do Imposto        |          ID          |                      |                                 |                                                    |        Primary key table LBR\_TaxLine        |                                            Primary key table LBR\_TaxLine                                             |
|            Empresa            |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |    AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@    |      (semelhante ao primeiro relatório)      |                                                  (ver o mesmo acima)                                                  |
|          Organização          |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 |  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)  |      (semelhante ao primeiro relatório)      |                                                  (ver o mesmo acima)                                                  |
|      Imposto Brasileiro       |    Tabela Direta     |                      |   lbr\_taxline\_lbr\_tax\_fk1   |                                                    |          Primary key table LBR\_Tax          |                                              Primary key table LBR\_Tax                                               |
|             Ativo             |       Sim-Não        |        ('Y')         |                                 |                                                    |      (semelhante ao primeiro relatório)      |                                                  (ver o mesmo acima)                                                  |
|            Imposto            |       Procurar       |     LBR\_TaxName     |                                 |                                                    |        Primary key table LBR\_TaxName        |                                            Primary key table LBR\_TaxName                                             |
|            Manual             |       Sim-Não        |                      |                                 |                                                    |           This is a manual process           |                           The Manual check box indicates if the process will done manually.                           |
|     Preço Inclui Imposto      |       Sim-Não        |         (N)          |                                 |                                                    |         Tax is included in the price         |         The Tax Included checkbox indicates if the prices include tax. This is also known as the gross price.         |
|     Valor Base de Cálculo     |        Valor         |                      |                                 |                                                    |         Defines the Tax Base Amount          |                                              Defines the Tax Base Amount                                              |
|         Valor Imposto         |        Valor         |                      |                                 |                                                    |            Defines the Tax Amount            |                                                Defines the Tax Amount                                                 |
|           Deson Amt           |        Valor         |                      |                                 |                                                    |                                              |                                                                                                                       |
|       Valor Diferimento       |        Número        |         (0)          |                                 |                                                    |                                              |                                                                                                                       |
|  Sobreescrever Alíquota (%)   |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|         Alíquota (%)          |        Valor         |                      |                                 |                                                    |            Indicates the Tax Rate            |                                                Indicates the Tax Rate                                                 |
|   Sobreescrever Red BC (%)    |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|          Red. BC (%)          |        Valor         |                      |                                 |                                                    |            Indicates the Tax Base            |                                                Indicates the Tax Base                                                 |
|    Sobreescrever CST/CSOSN    |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|           CST/CSOSN           |       Procurar       |                      |                                 | LBR\_TaxStatus.LBR\_TaxName\_ID=@LBR\_TaxName\_ID@ |                                              |                                                                                                                       |
| Sobreescrever Mensagem Legal  |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|        Mensagem Legal         |       Procurar       |                      |                                 |                                                    |          Defines the Legal Message           |                                          Primary key table LBR\_LegalMessage                                          |
|     Sobreescrever Mod BC      |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|       Modalidade da BC        |       Procurar       |                      |                                 |   COF\_ModBC.LBR\_TaxName\_ID=@LBR\_TaxName\_ID@   |     Primary Key : Mode Calculation Base      |                                          Primary Key : Mode Calculation Base                                          |
| Sobreescrever Valor de Lista  |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|        Valor de Lista         |        Número        |         (0)          |                                 |                                                    |                                              |                                                                                                                       |
|     Sobreescrever MVA (%)     |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|            MVA (%)            |        Número        |         (0)          |                                 |                                                    |                                              |                                                                                                                       |
| Sobreescrever Cód. Enq. Legal |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|        Cód. Enq. Legal        |       Procurar       |                      |                                 |   COF\_CEnq.LBR\_TaxName\_ID=@LBR\_TaxName\_ID@    |        Código de Enquadramento Legal         |                                             Código de Enquadramento Legal                                             |
|      Destacar na Remessa      |       Sim-Não        |        ('N')         |                                 |                                                    |                                              |                                                                                                                       |
|      CST/CSOSN (Remessa)      |       Procurar       |    LBR\_TaxStatus    | cofTaxStatusDelivery\_LBRTaxLin | LBR\_TaxStatus.LBR\_TaxName\_ID=@LBR\_TaxName\_ID@ |                                              |                                                                                                                       |
|     Sobreescrever Fórmula     |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|            Fórmula            |       Procurar       |                      |     LBRFormula\_LBRTaxLine      |                                                    |                                              |                                                                                                                       |
|    Sobreescrever Mot Deson    |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|     Motivo de Desoneração     |    Tabela Direta     |                      |     COFMotDeson\_LBRTaxLine     |                                                    |            Motivo de Desoneração             |                                                 Motivo de Desoneração                                                 |
| Sobreescrever Desoneração (%) |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|        Desoneração (%)        |        Número        |         (0)          |                                 |                                                    |                                              |                                                                                                                       |
| Sobreescrever Diferimento (%) |       Sim-Não        |         (N)          |                                 |                                                    |                                              |                                                                                                                       |
|        Diferimento (%)        |        Número        |         (0)          |                                 |                                                    |                                              |                                                                                                                       |
|      Despesas Aduaneiras      |        Valor         |         (0)          |                                 |                                                    |          Valor despesas aduaneiras           |                                                                                                                       |
|       Valor do Siscomex       |        Valor         |                      |                                 |                                                    |                                              |                                                                                                                       |
|         CNPJ Produtor         | Texto Curto (String) |                      |                                 |                                                    |                CNPJ Produtor                 | CNPJ do produtor da mercadoria, quando diferente do emitente. Somente para os casos de exportação direta ou indireta. |
|              IOF              |        Valor         |                      |                                 |                                                    | Valor do Imposto sobre Operações Financeiras |                                                                                                                       |

</div>

</div>

  

</div>
