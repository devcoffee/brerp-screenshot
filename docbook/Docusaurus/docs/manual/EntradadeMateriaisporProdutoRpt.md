---
title: "Entrada de Materiais por Produto"
id: EntradadeMateriaisporProdutoRpt
---
<div id="d85299e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Entrada de Materiais por Produto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-17 14:24:19.0

<span class="emphasis">*Atualizado:*</span>2016-05-17 14:24:19.0

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/EntradadeMateriaisporProduto.png)

<div id="d85299e18" class="table">

<div class="table-title">

Table 1.1. EntradadeMateriaisporProduto
Parâmetros

</div>

<div class="table-contents">

|         Nome          |      Nome da coluna      |  Referência   |                        Valores(Padrão)                        |                      Descrição                      |                                                                            Comentário/Ajuda                                                                            |
| :-------------------: | :----------------------: | :-----------: | :-----------------------------------------------------------: | :-------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo de Fornecedores | COF\_GrupoFornecedor\_ID | Tabela Direta |                                                               |         Identifica um grupo de fornecedores         |                                                                         Grupo de Fornecedores                                                                          |
|        Empresa        |      AD\_Client\_ID      |    Tabela     |                AD\_Client(@\#AD\_Client\_ID@)                 |       Empresa/Locatário para esta instalação.       | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
| Parceiro de Negócios  |     C\_BPartner\_ID      |   Procurar    |                       C\_BPartner (Trx)                       |         Identifica um Parceiro de Negócios.         |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
| Categoria de Produto  | M\_Product\_Category\_ID |   Procurar    |                      M\_Product Category                      |               Categoria de um Produto               |                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                        |
|        Produto        |      M\_Product\_ID      |   Procurar    |                     M\_Product (stocked)                      |               Produto, Serviço, Item                |                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                  |
|    Tipo do Produto    |   COF\_ProductType\_ID   |   Procurar    |                                                               |  Coluna de relação com a tabela de tipo de produto  |                                                                       Primary Key : Product Type                                                                       |
|   Classe do Produto   |  COF\_ProductClass\_ID   |   Procurar    |                                                               | Coluna de relação com a tabela de classe de produto |                                                                      Primary Key : Product Class                                                                       |
|   Grupo do Produto    |  COF\_ProductGroup\_ID   |   Procurar    |                                                               | Coluna de relação com a tabela de grupo do produto  |                                                                      Primary Key : Product Group                                                                       |
|      Organização      |       AD\_Org\_ID        | Tabela Direta |                        (@AD\_Org\_ID@)                        |      Entidade organizacional dentro da Empresa      |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|     Data Faturada     |       DateInvoiced       |     Data      | (@SQL=SELECT FIRSTOF(ADD\_MONTHS(SYSDATE,-1),'MM') FROM DUAL) |        Data impressa na Fatura (Nota Fiscal)        |                                                    A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                     |

</div>

</div>

  

</div>
