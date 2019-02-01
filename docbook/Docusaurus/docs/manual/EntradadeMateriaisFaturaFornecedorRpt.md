---
title: "Entrada de Materiais - Fatura (Fornecedor)"
id: EntradadeMateriaisFaturaFornecedorRpt
---
<div id="d85238e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Entrada de Materiais - Fatura (Fornecedor)

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-17 17:57:04.0

<span class="emphasis">*Atualizado:*</span>2016-05-18 12:18:01.0

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/EntradadeMateriaisFaturaFornecedor.png)

<div id="d85238e18" class="table">

<div class="table-title">

Table 1.1. EntradadeMateriaisFaturaFornecedor
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |                               Valores(Padrão)                               |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :---------------------: | :----------------------: | :-----------: | :-------------------------------------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Possui Documento Fiscal |  cof\_HasFiscalDocument  |     Lista     |                                   Não Sim                                   |                   null                    |                                                                                  null                                                                                  |
|         Empresa         |      AD\_Client\_ID      | Tabela Direta |                            (@\#AD\_Client\_ID@)                             |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |                               (@AD\_Org\_ID@)                               | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|  Categoria de Produto   | M\_Product\_Category\_ID |   Procurar    |                             M\_Product Category                             |          Categoria de um Produto          |                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                        |
|         Produto         |      M\_Product\_ID      |   Procurar    |                            M\_Product (stocked)                             |          Produto, Serviço, Item           |                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                  |
|  Parceiro de Negócios   |     C\_BPartner\_ID      |   Procurar    |                              C\_BPartner (Trx)                              |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
| Organização do Produto  |   COF\_OrgProduct\_ID    |    Tabela     |                                AD\_Org (all)                                |                   null                    |                                                                                  null                                                                                  |
|      Data Faturada      |       DateInvoiced       |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |   Data impressa na Fatura (Nota Fiscal)   |                                                    A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                     |

</div>

</div>

  

</div>
