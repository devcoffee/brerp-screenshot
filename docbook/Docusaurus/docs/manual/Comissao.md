---
title: "Comissão"
id: Comissao
---
<div id="d28719e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Comissão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Comissão -
    C\_Commission](#d28719e23)</span>
  - <span class="section">[2. Tabela: Linha de Comissão -
    C\_CommissionLine](#d28719e298)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Comissões e
Direitos de Exploração (Royalties)

<span class="emphasis">*Comentário/Ajuda:* </span>Define como e quando
você quer que as comissões sejam calculadas e a quem pagar. A Janela
"Comissão" permite a você definir como as comissões e direitos de
exploração (royalties) serão pagos. Você pode pagar múltiplas comissões
sobre um mesmo pedido ou fatura (ex. à pessoa que digitou a transação, à
pessoa responsável pela venda do produto (categoria) e/ou ao parceiro de
negócios (grupo).

<span class="emphasis"> *Criado em:* </span>2001-03-11 17:40:39.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Comissao.png)

<div id="d28719e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Comissão - C\_Commission

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Commission_data)

<span class="emphasis">*Descrição:*</span> Definir Regra de Comissão

<span class="emphasis">*Comentário/Ajuda:* </span> Define quando e a
quem pagar uma comissão. Para cada período, você inicia o cálculo de
comissões após a transação para aquele período ser completada ou
fechada.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d28719e40" class="table">

<div class="table-title">

Table 1.1. Commission
Fields

</div>

<div class="table-contents">

|                  Nome do campo                  |      Referência      |                    Valores (Padrão)                     |    Chave restritiva    |                  Regra de validação                   |                                   Descrição                                    |                                                               Comentário/Ajuda                                                               |
| :---------------------------------------------: | :------------------: | :-----------------------------------------------------: | :--------------------: | :---------------------------------------------------: | :----------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|                    Comissão                     |          ID          |                                                         |                        |                                                       |                                   Commission                                   |                             The Commission Rules or internal or external company agents, sales reps or vendors.                              |
|                     Empresa                     |    Tabela Direta     |                  (@\#AD\_Client\_ID@)                   |                        |           AD\_Client.AD\_Client\_ID \< \> 0           |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|                   Organização                   |    Tabela Direta     |                    (@\#AD\_Org\_ID@)                    |                        | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|                      Nome                       | Texto Curto (String) |                                                         |                        |                                                       |                     Alphanumeric identifier of the entity                      | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                    Descrição                    | Texto Curto (String) |                                                         |                        |                                                       |                    Optional short description of the record                    |                                                 A description is limited to 255 characters.                                                  |
|                      Ativo                      |       Sim-Não        |                           (Y)                           |                        |                                                       |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
| Parceiros de Negócios / Representante de Vendas |       Procurar       |             C\_BPartner Vendor or SalesRep              | cbpartner\_ccommission |                                                       |                         Identifies a Business Partner                          |               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                |
|                    Moeda De                     |    Tabela Direta     |                                                         | ccurrency\_ccommission |                                                       |                          The Currency for this record                          |                                Indicates the Currency to be used when processing or reporting on this record                                 |
|                   Finalidade                    |    Tabela Direta     |                                                         |  ccharge\_ccommission  |                                                       |                          Additional document charges                           |                                    The Charge indicates a type of Charge (Handling, Shipping, Restocking)                                    |
|                 Base de Cálculo                 |        Lista         |                Fatura Pedido Recibo (I)                 |                        |                                                       |                    Basis for the calculation the commission                    |                             The Calculation Basis indicates the basis to be used for the commission calculation.                             |
|               Tipo de Freqüência                |        Lista         | Mensalmente Trimestralmente Semanalmente Anualmente (M) |                        |                                                       |                               Frequency of event                               |                                    The frequency type is used for calculating the date of the next event.                                    |
|                  Copiar Linhas                  |        Botão         |                                                         |                        |                                                       | Process which will generate a new document lines based on an existing document |            The Create From process will create a new document based on information in an existing document selected by the user.             |
|                 Listar Detalhes                 |       Sim-Não        |                                                         |                        |                                                       |                             List document details                              |                        The List Details checkbox indicates that the details for each document line will be displayed.                        |
|                 Gerar Comissão                  |        Botão         |                                                         |                        |                                                       |                                                                                |                                                                                                                                              |
|          Data do último processamento           |      Data+Hora       |                                                         |                        |                                                       |                         Date the process was last run.                         |                                      The Date Last Run indicates the last time that a process was run.                                       |
|                C\_Commission\_UU                | Texto Curto (String) |                                                         |                        |                                                       |                                                                                |                                                                                                                                              |

</div>

</div>

  

<div id="d28719e298" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha de Comissão - C\_CommissionLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_CommissionLine_data)

<span class="emphasis">*Descrição:*</span> Define sua regra de cálculo
de comissão

<span class="emphasis">*Comentário/Ajuda:* </span> Define o critério de
seleção para pagar a comissão. Se você não estipular parâmetros de
restrição (ex. para um específico Parceiro de Negócios (Grupos) ou
Produto (Categorias), etc.) todas as transações para o período serão
usadas para calcular a comissão. Após converter da moeda de transação
para a moeda de comissão, a fórmula para o cálculo da comissão será:
(Valor Convertido - Valor a Subtrair) \* Multiplicador de Valor +
(Quantidade Real - Quantidade a Subtrair) \* Multiplicador de Quantidade
Você pode escolher que somente valores positivos (Valor Convertido -
Valor a Subtrair) e quantidades positivas (Quantidade Real - Quantidade
a Subtrair) sejam usados nos cálculos.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d28719e315" class="table">

<div class="table-title">

Table 1.2. Commission Line
Fields

</div>

<div class="table-contents">

|            Nome do campo             |      Referência      |                                                   Valores (Padrão)                                                   |        Chave restritiva         |                                                                          Regra de validação                                                                          |                              Descrição                              |                                                                                                                                                      Comentário/Ajuda                                                                                                                                                      |
| :----------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Linha de Comissão           |          ID          |                                                                                                                      |                                 |                                                                                                                                                                      |                           Commission Line                           | The Commission Line is a unique instance of a Commission Run. If the commission run was done in summary mode then there will be a single line representing the selected documents totals. If the commission run was done in detail mode then each document that was included in the run will have its own commission line. |
|               Empresa                |    Tabela Direta     |                                                  (@AD\_Client\_ID@)                                                  |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                 (semelhante ao primeiro relatório)                  |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|             Organização              |    Tabela Direta     |                                                   (@AD\_Org\_ID@)                                                    |                                 |                                                        AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                                                         |                 (semelhante ao primeiro relatório)                  |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|               Comissão               |    Tabela Direta     |                                                                                                                      |  ccommission\_ccommissionline   |                                                                                                                                                                      |                             Commission                              |                                                                                                                    The Commission Rules or internal or external company agents, sales reps or vendors.                                                                                                                     |
|              Linha Núm.              |       Inteiro        | (@SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C\_CommissionLine WHERE C\_Commission\_ID=@C\_Commission\_ID@) |                                 |                                                                                                                                                                      |                    Unique line for this document                    |                                                                                                      Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                                                      |
|              Descrição               | Texto Curto (String) |                                                                                                                      |                                 |                                                                                                                                                                      |              Optional short description of the record               |                                                                                                                                        A description is limited to 255 characters.                                                                                                                                         |
|                Ativo                 |       Sim-Não        |                                                         (Y)                                                          |                                 |                                                                                                                                                                      |                 (semelhante ao primeiro relatório)                  |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
| Comissionar só Pedidos especificados |       Sim-Não        |                                                                                                                      |                                 |                                                                                                                                                                      | Commission only Orders or Invoices, where this Sales Rep is entered |                                                                                Sales Reps are entered in Orders and Invoices. If selected, only Orders and Invoices for this Sales Reps are included in the calculation of the commission.                                                                                 |
|             Organização              |        Tabela        |                                                    AD\_Org (Trx)                                                     |    adorgtrx\_ccommissionline    |                                                                                                                                                                      |                 (semelhante ao primeiro relatório)                  |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|          Grupo de Parceiros          |    Tabela Direta     |                                                                                                                      |    cbpgroup\_commissionline     |                                                                                                                                                                      |                       Business Partner Group                        |                                                                                                       The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.                                                                                                       |
|         Parceiro de Negócios         |       Procurar       |                                                                                                                      |   cbpartner\_ccommissionline    |                                                        C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                        |                    Identifies a Business Partner                    |                                                                                                      A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                       |
|         Categoria de Produto         |    Tabela Direta     |                                                                                                                      |  mproductcat\_ccommissionline   |                                                                                                                                                                      |                        Category of a Product                        |                                                                                                       Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                                                                        |
|               Produto                |       Procurar       |                                                                                                                      |    mproduct\_ccommissionline    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                       Product, Service, Item                        |                                                                                                                         Identifies an item which is either purchased or sold in this organization.                                                                                                                         |
|           Tipo do Produto            |        Tabela        |                                             COF\_ProductType Name Value                                              | COFProductType\_CCommissionLine |                                                                                                                                                                      |                     Primary Key : Product Type                      |                                                                                                                                                 Primary Key : Product Type                                                                                                                                                 |
|          Classe do Produto           |        Tabela        |                                             COF\_ProductClass Value Name                                             | COFProductClass\_CCommissionLin |                                                                                                                                                                      |                     Primary Key : Product Class                     |                                                                                                                                                Primary Key : Product Class                                                                                                                                                 |
|           Grupo do Produto           |        Tabela        |                                             COF\_ProductGroup Value Name                                             | COFProductGroup\_CCommissionLin |                                                                                                                                                                      |                     Primary Key : Product Group                     |                                                                                                                                                Primary Key : Product Group                                                                                                                                                 |
|        Grupo de Fornecedores         |    Tabela Direta     |                                                                                                                      | COFGrupoFornecedor\_CCommission |                                                                                                                                                                      |                        Grupo de Fornecedores                        |                                                                                                                                                   Grupo de Fornecedores                                                                                                                                                    |
|           Região de Vendas           |    Tabela Direta     |                                                                                                                      |  csalesregion\_ccommissionline  |                                                                                                                                                                      |                        Sales coverage region                        |                                                                                                                               The Sales Region indicates a specific area of sales coverage.                                                                                                                                |
|          Regra de Pagamento          |        Lista         |                   Dinheiro Débito Direto Cartão de Crédito Mixed Em Crédito Cheque Depósito Direto                   |                                 |                                                                    AD\_Ref\_List.Value \< \> 'M'                                                                     |                       How you pay the invoice                       |                                                                                                                                 The Payment Rule indicates the method of invoice payment.                                                                                                                                  |
|         Quantidade a Deduzir         |        Número        |                                                                                                                      |                                 |                                                                                                                                                                      |          Quantity to subtract when generating commissions           |                                                                                                                    The Quantity Subtract identifies the quantity to be subtracted before multiplication                                                                                                                    |
|     Multiplicador de Quantidade      |        Número        |                                                                                                                      |                                 |                                                                                                                                                                      |     Value to multiply quantities by for generating commissions.     |                                                                                                     The Multiplier Quantity field indicates the amount to multiply the quantities accumulated for this commission run.                                                                                                     |
|           Valor a Subtrair           |        Valor         |                                                                                                                      |                                 |                                                                                                                                                                      |             Subtract Amount for generating commissions              |                                                                                                            The Subtract Amount indicates the amount to subtract from the total amount prior to multiplication.                                                                                                             |
|         Valor Multiplicador          |        Número        |                                                                                                                      |                                 |                                                                                                                                                                      |            Multiplier Amount for generating commissions             |                                                                                                        The Multiplier Amount indicates the amount to multiply the total amount generated by this commission run by.                                                                                                        |
|             Só Positivo              |       Sim-Não        |                                                                                                                      |                                 |                                                                                                                                                                      |                Do not generate negative commissions                 |                                                                         The Positive Only check box indicates that if the result of the subtraction is negative, it is ignored. This would mean that negative commissions would not be generated.                                                                          |
|        C\_CommissionLine\_UU         | Texto Curto (String) |                                                                                                                      |                                 |                                                                                                                                                                      |                                                                     |                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
