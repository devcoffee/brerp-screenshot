---
title: "Margem"
id: Margem
---
<div id="d144204e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Margem

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Margem -
    COF\_C\_Markup](#d144204e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-03-16 13:39:55.0

<span class="emphasis">*Atualizado em:* </span>2015-03-16 13:39:55.0

<div id="d144204e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Margem - COF\_C\_Markup

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_Markup_data)

<span class="emphasis">*Coluna linkada:* </span> COF\_C\_Markup\_ID

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d144204e35" class="table">

<div class="table-title">

Table 1.1. Markup
Fields

</div>

<div class="table-contents">

|            Nome do campo             |  Referência   |   Valores (Padrão)   |       Chave restritiva       |                                                                                                                 Regra de validação                                                                                                                  |                  Descrição                  |                                                                                                                                                                                                                                                                                    Comentário/Ajuda                                                                                                                                                                                                                                                                                     |
| :----------------------------------: | :-----------: | :------------------: | :--------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                Markup                |      ID       |                      |                              |                                                                                                                                                                                                                                                     |            Primary Key : Markup             |                                                                                                                                                                                                                                                                                  Primary Key : Markup                                                                                                                                                                                                                                                                                   |
|               Empresa                | Tabela Direta | (@\#AD\_Client\_ID@) |                              |                                                                                                          AD\_Client.AD\_Client\_ID \< \> 0                                                                                                          |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
|             Organização              | Tabela Direta |  (@\#AD\_Org\_ID@)   |                              |                                                                                                  (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                                   |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
|                Ativo                 |    Sim-Não    |         (Y)          |                              |                                                                                                                                                                                                                                                     |     (semelhante ao primeiro relatório)      |                                                                                                                                                                                                                                                                                   (ver o mesmo acima)                                                                                                                                                                                                                                                                                   |
|             Válido desde             |     Data      |      (@\#Date@)      |                              |                                                                                                                                                                                                                                                     | Valid from including this date (first day)  |                                                                                                                                                                                                                                                               The Valid From date indicates the first day of a date range                                                                                                                                                                                                                                                               |
|              Válido até              |     Data      |      (@\#Date@)      |                              |                                                                                                                                                                                                                                                     |   Valid to including this date (last day)   |                                                                                                                                                                                                                                                                The Valid To date indicates the last day of a date range                                                                                                                                                                                                                                                                 |
|         Parceiro de Negócios         |   Procurar    |                      |    CBPartner\_COFCMarkup     |                                                                                               C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                                                                |        Identifies a Business Partner        |                                                                                                                                                                                                                                     A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                                                                                                                                     |
|          Tipo de Documento           |   Procurar    |      C\_DocType      |     CDocType\_COFCMarkup     |                                                                                                               C\_DocType.IsSOTrx='Y'                                                                                                                |           Document type or rules            |                                                                                                                                                                                                                                                           The Document Type determines document sequence and processing rules                                                                                                                                                                                                                                                           |
|               Produto                |   Procurar    |                      |     MProduct\_COFCMarkup     | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) <span class="emphasis">*ReadOnly Logic*</span>: @M\_Product\_Category\_ID@\> 0 |           Product, Service, Item            |                                                                                                                                                                                                                                                       Identifies an item which is either purchased or sold in this organization.                                                                                                                                                                                                                                                        |
|         Categoria de Produto         |   Procurar    |                      | MProductCategory\_COFCMarkup |                                                                                        <span class="emphasis">*ReadOnly Logic*</span>: @M\_Product\_ID@\> 0                                                                                         |            Category of a Product            |                                                                                                                                                                                                                                      Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                                                                                                                                                                                                      |
|         Prioridade Relativa          |    Inteiro    |         (0)          |                              |                                                                                                                                                                                                                                                     | Where inventory should be picked from first | The Relative Priority indicates the location to pick from first if an product is stored in more than one location. (100 = highest priority, 0 = lowest). For outgoing shipments, the location is picked with the highest priority where the entire quantity can be shipped from. If there is no location, the location with the highest priority is used. The Priority is ignored for products with Guarantee Date (always the oldest first) or if a specific instance is selected. Incoming receipts are stored at the location with the highest priority, if not explicitly selected. |
|           Margem Mínima %            |     Valor     |         (0)          |                              |                                                                                                                                                                                                                                                     |                                             |                                                                                                                                                                            Os valor acima serão utilizados para calcular o Markup de um preço base de vendas conforme a fórmula : Preço/(1-Markup) . Para obter a margem equivalente ao fator de markup , pode-se utilizar a fórmula 1/((1-(Markup/100))-1)                                                                                                                                                                             |
|           Margem Máxima %            |     Valor     |         (0)          |                              |                                                                                                                                                                                                                                                     |                                             |                                                                                                                                                                            Os valor acima serão utilizados para calcular o Markup de um preço base de vendas conforme a fórmula : Preço/(1-Markup) . Para obter a margem equivalente ao fator de markup , pode-se utilizar a fórmula 1/((1-(Markup/100))-1)                                                                                                                                                                             |
| Permite Apresentação em Info Produto |    Sim-Não    |        ('Y')         |                              |                                                                                                                                                                                                                                                     |                                             |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |

</div>

</div>

  

</div>
