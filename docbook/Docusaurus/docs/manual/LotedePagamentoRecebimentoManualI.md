---
title: "Lote de Pagamento/Recebimento (Manual)"
id: LotedePagamentoRecebimentoManualI
---
<div id="d142154e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Lote de Pagamento/Recebimento (Manual)

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2017-05-09 10:10:46.0

<span class="emphasis"> *Atualizado:* </span>2018-07-02 15:13:45.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>RV\_OpenItem a

<span class="emphasis"> *Order By :*</span>null

<div id="d142154e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome          |      Referência      |                                                                              Sql SELECT                                                                               |                                       QueryCriteria                                        |                    Descrição                     |                                                                                                 Comentário/Ajuda                                                                                                  |
| :--------------------: | :------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :----------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Nosso Número      | Texto Curto (String) |                                                                      a.cof\_titulo\_nossoNumero                                                                       |                                                                                            |                       null                       |                                                                                                       null                                                                                                        |
|   Número da Parcela    | Texto Curto (String) |                                                                         a.cof\_PayScheduleNo                                                                          |                                                                                            |                       null                       |                                                                                                       null                                                                                                        |
|         Fatura         |       Procurar       |                                                                           a.C\_Invoice\_ID                                                                            |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |             Identificador de Fatura              |                                                                                              O Documento da Fatura.                                                                                               |
|       Open Item        |          ID          |                                                                          a.RV\_OpenItem\_ID                                                                           |                                                                                            |                       null                       |                                                                                                       null                                                                                                        |
|    Boleto Impresso     |        Lista         |                                                                           a.cof\_Processed                                                                            |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                 Boleto Impresso                  |                                                                                                       null                                                                                                        |
|   Data do Vencimento   |         Data         |                                                                        a.DueDate AS DueDateTo                                                                         | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |    Data em que o pagamento deve ser efetuado     |                                                                         Data em que o pagamento deve ser feito sem deduções ou descontos                                                                          |
|   Data do Vencimento   |         Data         |                                                                       a.DueDate AS DueDateFrom                                                                        | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>null  |    Data em que o pagamento deve ser efetuado     |                                                                         Data em que o pagamento deve ser feito sem deduções ou descontos                                                                          |
|      Organização       |    Tabela Direta     |                                                                             a.AD\_Org\_ID                                                                             |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |    Entidade organizacional dentro da Empresa     |                            Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                            |
|  Parceiro de Negócios  |       Procurar       |                                                                           a.C\_BPartner\_ID                                                                           |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |       Identifica um Parceiro de Negócios.        |                       Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                        |
|     Data Faturada      |         Data         |                                                                  a.DateInvoiced AS DateInvoicedFrom                                                                   | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |      Data impressa na Fatura (Nota Fiscal)       |                                                                          A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                          |
|     Data Faturada      |         Data         |                                                                   a.DateInvoiced AS DateInvoicedTo                                                                    | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |      Data impressa na Fatura (Nota Fiscal)       |                                                                          A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                          |
|     Data Faturada      |         Data         |                                                                            a.DateInvoiced                                                                             |                                                                                            |      Data impressa na Fatura (Nota Fiscal)       |                                                                          A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                          |
|   Data do Vencimento   |         Data         |                                                                               a.DueDate                                                                               |                                                                                            |    Data em que o pagamento deve ser efetuado     |                                                                         Data em que o pagamento deve ser feito sem deduções ou descontos                                                                          |
|      Total Geral       |        Valor         |                                                                             a.GrandTotal                                                                              |                                                                                            |             Valor Total do documento             |                                                               O "Total Geral" mostra o valor total incluindo Impostos e Frete na moeda do documento                                                               |
|      Valor Aberto      |        Valor         |                                                                               a.OpenAmt                                                                               |                                                                                            |             Valor do Item em Aberto              |                                                                                                       null                                                                                                        |
|    Documento Fiscal    | Texto Curto (String) | (CASE WHEN a.LBR\_DocFiscal\_ID IS NULL THEN a.lbr\_NFEntrada ELSE (select DocumentNo from LBR\_DocFiscal df where df.LBR\_DocFiscal\_ID = a.LBR\_DocFiscal\_ID) END) |                                                                                            |                       null                       |                                                                                                       null                                                                                                        |
|    Centro de Custo     |        Tabela        |                                                                              a.User1\_ID                                                                              |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                 Centro de Custo                  |                                                    O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                     |
|   Centro de Custo 2    |        Tabela        |                                                                              a.User2\_ID                                                                              |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |               Centro de Custo \#2                |                                                    O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                     |
| Tipo de Documento Alvo |        Tabela        |                                                                        a.C\_DocTypeTarget\_ID                                                                         |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Tipo de Documento Alvo para converter documentos | Você pode converter tipos de documento (por exemplo de Oferta para Pedido ou Fatura). A conversão é então refletida no tipo atual. Este processamento é iniciado ao se selecionar a Ação de Documento apropriada. |
|  Transação de Vendas   |       Sim-Não        |                                                                               a.IsSOTrx                                                                               |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |          Esta é uma Transação de Vendas          |                                                            A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                                            |

</div>

</div>

  

[\[BANCO DE
DADOS\]](data/LotedePagamento/RecebimentoManualinfodata.html),

</div>
