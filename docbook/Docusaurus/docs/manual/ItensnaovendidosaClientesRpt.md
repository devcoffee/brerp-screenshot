---
title: "Itens não vendidos a Clientes"
id: ItensnaovendidosaClientesRpt
---
<div id="d133015e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Itens não vendidos a Clientes

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-05-26 11:20:59.0

<span class="emphasis">*Atualizado:*</span>2017-05-26 11:23:03.0

<span class="emphasis"> *ReportView:*
</span>RV\_COF\_T\_ItensNaoVendidosAClientes

![](/img/manual/ItensnaovendidosaClientes.png)

<div id="d133015e18" class="table">

<div class="table-title">

Table 1.1. ItensnaovendidosaClientes
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |             Valores(Padrão)              |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :----------------------: | :-----------: | :--------------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |                                          |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|  Categoria de Produto   | M\_Product\_Category\_ID | Tabela Direta |                                          |                           Categoria de um Produto                            |                                                     Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                      |
|   Grupo de Parceiros    |     C\_BP\_Group\_ID     | Tabela Direta |                                          |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
| Representante de Vendas |       SalesRep\_ID       |   Procurar    |             (@SalesRep\_ID@)             |          Representante de Vendas ou Promotor de Vendas da Companhia          |                                   O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                    |
|  Parceiro de Negócios   |     C\_BPartner\_ID      |   Procurar    | C\_BPartner Customers(@C\_BPartner\_ID@) |                     Identifica um Parceiro de Negócios.                      |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|     Tipo do Produto     |   COF\_ProductType\_ID   |   Procurar    |                                          |              Coluna de relação com a tabela de tipo de produto               |                                                                                                    Primary Key : Product Type                                                                                                     |
|    Classe do Produto    |  COF\_ProductClass\_ID   |   Procurar    |                                          |             Coluna de relação com a tabela de classe de produto              |                                                                                                    Primary Key : Product Class                                                                                                    |
|    Grupo do Produto     |  COF\_ProductGroup\_ID   |   Procurar    |                                          |              Coluna de relação com a tabela de grupo do produto              |                                                                                                    Primary Key : Product Group                                                                                                    |
|    Classificação ABC    |         COF\_ABC         |     Lista     |                  A B C                   |                                     null                                     |                                                                                                               null                                                                                                                |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios  |    Sim-Não    |                  ('Y')                   | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|  Grupo de Fornecedores  | COF\_GrupoFornecedor\_ID | Tabela Direta |                                          |                     Identifica um grupo de fornecedores                      |                                                                                                       Grupo de Fornecedores                                                                                                       |
|      Data Faturada      |       DateInvoiced       |     Data      |        (@SQL=SELECT SYSDATE - 90)        |                    Data impressa na Fatura (Nota Fiscal)                     |                                                                                  A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                  |

</div>

</div>

  

<div id="d133015e199" class="table">

<div class="table-title">

Table 1.2. RV\_COF\_T\_ItensNaoVendidosAClientes -
Colunas

</div>

<div class="table-contents">

|          Nome da coluna          |      Referência      |        Valores padrão        |       Valor de restrição        |                                                                          Regra de validação                                                                          |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :------------------------------: | :------------------: | :--------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Empresa              |    Tabela Direta     |     (@\#AD\_Client\_ID@)     |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                                 (ver acima)                                  |                                                                                                            (ver acima)                                                                                                            |
|           Organização            |    Tabela Direta     |      (@\#AD\_Org\_ID@)       |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                                 (ver acima)                                  |                                                                                                            (ver acima)                                                                                                            |
|      Instância de Processo       |    Tabela Direta     |                              | ADPInstance\_TItensNaoVendidosA |                                                                                                                                                                      |                           Instance of the process                            |                                                                                                                                                                                                                                   |
|       Parceiro de Negócios       |       Procurar       |                              | CBPartner\_TItensNaoVendidosACl |                                                                                                                                                                      |                        Identifies a Business Partner                         |                                                          A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                          |
|        Grupo de Parceiros        |    Tabela Direta     |                              | CBPGroup\_TItensNaoVendidosACli |                                                                                                                                                                      |                            Business Partner Group                            |                                                          The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.                                                           |
|        Classificação ABC         |        Lista         |            A B C             |                                 |                                                                                                                                                                      |                                                                              |                                                                                                                                                                                                                                   |
|       Exibir em Relatórios       |       Sim-Não        |            ('Y')             |                                 |                                                                                                                                                                      | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|      Grupo de Fornecedores       |    Tabela Direta     |                              | COFGrupoFornecedor\_TItensNaoVe |                                                                                                                                                                      |                            Grupo de Fornecedores                             |                                                                                                       Grupo de Fornecedores                                                                                                       |
|        Classe do Produto         |        Tabela        | COF\_ProductClass Value Name | COFProductClass\_TItensNaoVendi |                                                                                                                                                                      |                         Primary Key : Product Class                          |                                                                                                    Primary Key : Product Class                                                                                                    |
|         Grupo do Produto         |        Tabela        | COF\_ProductGroup Value Name | COFProductGroup\_TItensNaoVendi |                                                                                                                                                                      |                         Primary Key : Product Group                          |                                                                                                    Primary Key : Product Group                                                                                                    |
|         Tipo do Produto          |        Tabela        | COF\_ProductType Name Value  | COFProductType\_TItensNaoVendid |                                                                                                                                                                      |                          Primary Key : Product Type                          |                                                                                                    Primary Key : Product Type                                                                                                     |
|               UDM                |    Tabela Direta     |                              | CUOM\_TItensNaoVendidosACliente |                                                                                                                                                                      |                               Unit of Measure                                |                                                                                       The UOM defines a unique non monetary Unit of Measure                                                                                       |
|          Data Faturada           |         Data         |                              |                                 |                                                                                                                                                                      |                           Date printed on Invoice                            |                                                                                    The Date Invoice indicates the date printed on the invoice.                                                                                    |
|       Categoria de Produto       |    Tabela Direta     |                              | MProductCategory\_TItensNaoVend |                                                                                                                                                                      |                            Category of a Product                             |                                                           Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                           |
|             Produto              |       Procurar       |                              | MProduct\_TItensNaoVendidosACli | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                            Product, Service, Item                            |                                                                            Identifies an item which is either purchased or sold in this organization.                                                                             |
|     Representante de Vendas      |        Tabela        |     AD\_User - SalesRep      | SalesRep\_TItensNaoVendidosACli |                                                                                                                                                                      |                    Sales Representative or Company Agent                     |                                                          The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                                           |
| T\_ItensNaoVendidosAClientes\_UU | Texto Curto (String) |                              |                                 |                                                                                                                                                                      |                                                                              |                                                                                                                                                                                                                                   |

</div>

</div>

  

</div>
