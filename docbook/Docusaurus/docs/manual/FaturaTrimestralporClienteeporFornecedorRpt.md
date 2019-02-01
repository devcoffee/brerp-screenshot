---
title: "Fatura Trimestral por Cliente e por Fornecedor"
id: FaturaTrimestralporClienteeporFornecedorRpt
---
<div id="d100685e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Fatura Trimestral por Cliente e por Fornecedor

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-12-04 16:20:51.0

<span class="emphasis">*Atualizado:*</span>2005-02-07 20:50:30.0

<span class="emphasis"> *Descrição:* </span>Relatório de Fatura
Trimestral por Cliente e por Fornecedor de Produtos

<span class="emphasis"> *Comentário/Ajuda:* </span>Valor Faturado por
Cliente e Fornecedor (qual cliente comprou de qual fornecedor)

<span class="emphasis"> *ReportView:*
</span>RV\_C\_Invoice\_CustomerVendQtr

<div id="d100685e25" class="table">

<div class="table-title">

Table 1.1. FaturaTrimestralporClienteeporFornecedor
Parâmetros

</div>

<div class="table-contents">

|         Nome         | Nome da coluna  |  Referência   |                                                                  Valores(Padrão)                                                                  |                 Descrição                 |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :-------------: | :-----------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Fornecedor      |   Vendor\_ID    |   Procurar    |                                                                C\_BPartner Vendors                                                                |     É o Fornecedor de produto/serviço     |                                                                                 null                                                                                 |
| Parceiro de Negócios | C\_BPartner\_ID |   Procurar    |                                                                                                                                                   |    Identifica um Parceiro de Negócios.    | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|     Organização      |   AD\_Org\_ID   | Tabela Direta |                                                                                                                                                   | Entidade organizacional dentro da Empresa |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
|      Atividade       | C\_Activity\_ID | Tabela Direta |                                                                                                                                                   |           Atividade de Negócio            |                                "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                 |
|  Centro de Custo 2   |    User2\_ID    |    Tabela     |                                                                Account\_ID - User2                                                                |            Centro de Custo \#2            |                              O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                              |
|   Centro de Custo    |    User1\_ID    |    Tabela     |                                                                Account\_ID - User1                                                                |              Centro de Custo              |                              O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                              |
| Estado do Documento  |    DocStatus    |     Lista     | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |        O estado atual do documento        |         O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"         |
|   Tipo de Produto    |   ProductType   |     Lista     |                                                Ativo Tipo de Despesa Item Online Recurso Serviços                                                 |              Tipo de Produto              |                                                    O Tipo de Produto também determina as conseqüências contábeis.                                                    |
|  Tipo de Documento   | C\_DocType\_ID  | Tabela Direta |                                                                                                                                                   |        Tipo de Documento ou regras        |                                        O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                         |
|    Data Faturada     |  DateInvoiced   |     Data      |                                                                                                                                                   |   Data impressa na Fatura (Nota Fiscal)   |                                                   A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                    |

</div>

</div>

  

<div id="d100685e180" class="table">

<div class="table-title">

Table 1.2. RV\_C\_Invoice\_CustomerVendQtr -
Colunas

</div>

<div class="table-contents">

|     Nome da coluna      |  Referência   |                                                                     Valores padrão                                                                     | Valor de restrição |                Regra de validação                |                                  Descrição                                  |                                                                                                                       Comentário/Ajuda                                                                                                                       |
| :---------------------: | :-----------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :-------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         | Tabela Direta |                                                                                                                                                        |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                                 (ver acima)                                 |                                                                                                                         (ver acima)                                                                                                                          |
|       Organização       | Tabela Direta |                                                                                                                                                        |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                 (ver acima)                                 |                                                                                                                         (ver acima)                                                                                                                          |
|        Atividade        | Tabela Direta |                                                                                                                                                        |                    |                                                  |                              Business Activity                              |                                                                                   Activities indicate tasks that are performed and used to utilize Activity based Costing                                                                                    |
|  Parceiro de Negócios   |   Procurar    |                                                                                                                                                        |                    |                                                  |                        Identifies a Business Partner                        |                                                                       A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                        |
|    Tipo de Documento    | Tabela Direta |                                                                                                                                                        |                    |                                                  |                           Document type or rules                            |                                                                                             The Document Type determines document sequence and processing rules                                                                                              |
|      Data Faturada      |     Data      |                                                                                                                                                        |                    |                                                  |                           Date printed on Invoice                           |                                                                                                 The Date Invoice indicates the date printed on the invoice.                                                                                                  |
|   Estado do Documento   |     Lista     | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento (DR) |                    |                                                  |                     The current status of the document                      |                                                        The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                         |
|   Desconto da Linha %   |    Número     |                                                                                                                                                        |                    |                                                  |                        Line Discount as a percentage                        |                                                                                       The Line Discount Percent indicates the discount for this line as a percentage.                                                                                        |
|    Desconto da Linha    |     Valor     |                                                                                                                                                        |                    |                                                  |                            Line Discount Amount                             |                                                                                                      Indicates the discount for this line as an amount.                                                                                                      |
|  Valor Limite da Linha  |     Valor     |                                                                                                                                                        |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
| Valor da Lista de Linha |     Valor     |                                                                                                                                                        |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|     Valor da Linha      |     Valor     |                                                                                                                                                        |                    |                                                  | Line Extended Amount (Quantity \* Actual Price) without Freight and Charges | Indicates the extended line amount based on the quantity and the actual price. Any additional charges or freight are not included. The Amount may or may not include tax. If the price list is inclusive tax, the line amount is the same as the line total. |
|     Margem Bruta %      |    Número     |                                                                                                                                                        |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|      Margem Bruta       |     Valor     |                                                                                                                                                        |                    |                                                  |                                                                             |                                                                                                                                                                                                                                                              |
|     Tipo de Produto     |    Sim-Não    |                                                                                                                                                        |                    |                                                  |                               Type of product                               |                                                                                                 The type of product also determines accounting consequences.                                                                                                 |
|   Quantidade Faturada   |  Quantidade   |                                                                                                                                                        |                    |                                                  |                              Invoiced Quantity                              |                                                                                      The Invoiced Quantity indicates the quantity of a product that have been invoiced.                                                                                      |
|     Centro de Custo     |    Tabela     |                                                                  Account\_ID - User1                                                                   |                    |                                                  |                        User defined list element \#1                        |                                                                         The user defined element displays the optional elements that have been defined for this account combination.                                                                         |
|    Centro de Custo 2    |    Tabela     |                                                                  Account\_ID - User2                                                                   |                    |                                                  |                        User defined list element \#2                        |                                                                         The user defined element displays the optional elements that have been defined for this account combination.                                                                         |
|       Fornecedor        |    Tabela     |                                                                  C\_BPartner Vendors                                                                   |                    |                                                  |                      The Vendor of the product/service                      |                                                                                                                                                                                                                                                              |

</div>

</div>

  

</div>