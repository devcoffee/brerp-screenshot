---
title: "Detalhes de Embarque"
id: DetalhesdeEmbarqueRpt
---
<div id="d54528e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Detalhes de Embarque

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-06-03 09:22:55.0

<span class="emphasis">*Atualizado:*</span>2018-07-02 10:49:26.0

<span class="emphasis"> *Descrição:* </span>Detalhes de Embarque

<span class="emphasis"> *Comentário/Ajuda:* </span>Imprime um documento
com informações detalhadas da lista de embarque e seus documentos
relacionados (Expedição, Ordem de Venda, Produtos, Etc)

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/DetalhesdeEmbarque.png)

<div id="d54528e26" class="table">

<div class="table-title">

Table 1.1. DetalhesdeEmbarque
Parâmetros

</div>

<div class="table-contents">

|           Nome            |    Nome da coluna    |  Referência   |             Valores(Padrão)              |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :-----------------------: | :------------------: | :-----------: | :--------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Tipo da Lista de Embarque |   cof\_PackingType   |     Lista     |      Entrega Retirar Transportadora      |                   null                    |                                                                                  null                                                                                  |
|          Empresa          |    AD\_Client\_ID    | Tabela Direta |           (@\#AD\_Client\_ID@)           |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|        Organização        |     AD\_Org\_ID      | Tabela Direta |            (@\#AD\_Org\_ID@)             | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Data de Lista de Embarque |   cof\_PackingDate   |     Data      |                                          |                   null                    |                                                                                  null                                                                                  |
|          Estado           |        Status        |     Lista     |  Encerrado Despachado Finalizado Aberto  |         Estado da execução atual          |                                                                        Estado da execução atual                                                                        |
|     Região de Vendas      |  C\_SalesRegion\_ID  |   Procurar    |                                          |       Cobertura da Região de Vendas       |                                                A "Região de Vendas" indica uma área específica de cobertura de vendas.                                                 |
|     Lista de Embarque     | COF\_PackingList\_ID |   Procurar    | COF\_PackingList(@COF\_PackingList\_ID@) |        Primary Key : Packing-List         |                                                                       Primary Key : Packing-List                                                                       |
|   Parceiro de Negócios    |   C\_BPartner\_ID    |   Procurar    |                                          |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |

</div>

</div>

  

</div>
