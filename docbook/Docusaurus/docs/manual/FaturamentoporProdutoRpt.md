---
title: "Faturamento por Produto"
id: FaturamentoporProdutoRpt
---
<div id="d101235e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Faturamento por Produto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-18 16:57:38.0

<span class="emphasis">*Atualizado:*</span>2016-05-18 17:03:26.0

<span class="emphasis"> *Descrição:* </span>Exibe todo o Faturamento da
Empresa Agrupado por Produto

<span class="emphasis"> *Comentário/Ajuda:* </span>Apresentação de
Faturamento Agrupado e Totalizado por Produtos

<span class="emphasis"> *ReportView:* </span>null

<div id="d101235e25" class="table">

<div class="table-title">

Table 1.1. FaturamentoporProduto
Parâmetros

</div>

<div class="table-contents">

|         Nome          |      Nome da coluna      |  Referência   |                               Valores(Padrão)                               |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :-------------------: | :----------------------: | :-----------: | :-------------------------------------------------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo de Fornecedores | COF\_GrupoFornecedor\_ID | Tabela Direta |                                                                             |                     Identifica um grupo de fornecedores                      |                                                                                                       Grupo de Fornecedores                                                                                                       |
|        Empresa        |      AD\_Client\_ID      | Tabela Direta |                       AD\_Client(@\#AD\_Client\_ID@)                        |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|      Organização      |       AD\_Org\_ID        | Tabela Direta |                     AD\_Org (all but 0)(@AD\_Org\_ID@)                      |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Categoria de Produto  | M\_Product\_Category\_ID |   Procurar    |                             M\_Product Category                             |                           Categoria de um Produto                            |                                                     Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                      |
|        Produto        |      M\_Product\_ID      |   Procurar    |                            M\_Product (stocked)                             |                            Produto, Serviço, Item                            |                                                                               Identifica um item que é ou comprado ou vendido por esta organização.                                                                               |
|   Esquema Contábil    |    C\_AcctSchema\_ID     | Tabela Direta |                                                                             |                          Regras para contabilidade                           |                                                      Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                      |
| Exibir em Relatórios  | cof\_ExibirEmRelatorios  |     Lista     |                                   Não Sim                                   | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|    Tipo do Produto    |   COF\_ProductType\_ID   |   Procurar    |                                                                             |              Coluna de relação com a tabela de tipo de produto               |                                                                                                    Primary Key : Product Type                                                                                                     |
|   Classe do Produto   |  COF\_ProductClass\_ID   |   Procurar    |                                                                             |             Coluna de relação com a tabela de classe de produto              |                                                                                                    Primary Key : Product Class                                                                                                    |
|   Grupo do Produto    |  COF\_ProductGroup\_ID   |   Procurar    |                                                                             |              Coluna de relação com a tabela de grupo do produto              |                                                                                                    Primary Key : Product Group                                                                                                    |
| Parceiro de Negócios  |     C\_BPartner\_ID      |   Procurar    |                                                                             |                     Identifica um Parceiro de Negócios.                      |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|  Grupo de Parceiros   |     C\_BP\_Group\_ID     | Tabela Direta |                                                                             |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
|     Tipo de Custo     |     M\_CostType\_ID      | Tabela Direta |                                                                             |                 Tipo de Custo (ex. Atual, Planejado, Futuro)                 |                                                Você pode definir múltiplos tipos de custos. O tipo de custo selecionado em um "Esquema Contábil" é utilizada para a contabilidade.                                                |
|   Elemento de Custo   |    M\_CostElement\_ID    | Tabela Direta |                                                                             |                         Elemento de Custo de Produto                         |                                                                                                               null                                                                                                                |
|     Data Faturada     |       DateInvoiced       |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |                    Data impressa na Fatura (Nota Fiscal)                     |                                                                                  A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                  |

</div>

</div>

  

</div>
