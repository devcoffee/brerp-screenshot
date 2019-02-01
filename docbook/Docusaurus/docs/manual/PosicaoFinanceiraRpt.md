---
title: "Posição Financeira"
id: PosicaoFinanceiraRpt
---
<div id="d176878e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Posição Financeira

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-10-21 15:59:50.0

<span class="emphasis">*Atualizado:*</span>2015-10-21 17:15:20.0

<span class="emphasis"> *Descrição:* </span>Posição Financeira

<span class="emphasis"> *ReportView:* </span>null

<div id="d176878e21" class="table">

<div class="table-title">

Table 1.1. PosicaoFinanceira
Parâmetros

</div>

<div class="table-contents">

|          Nome          |   Nome da coluna    |  Referência   |           Valores(Padrão)            |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :--------------------: | :-----------------: | :-----------: | :----------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Pago          |       IsPaid        |     Lista     |               Não Sim                |           O documento está pago           |                                                                                  null                                                                                  |
|        Empresa         |   AD\_Client\_ID    | Tabela Direta |         (@\#AD\_Client\_ID@)         |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|      Organização       |     AD\_Org\_ID     | Tabela Direta |          (@\#AD\_Org\_ID@)           | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|  Desconsidera Estorno  | DesconsideraEstorno |    Sim-Não    |                ('Y')                 |                   null                    |                                                                                  null                                                                                  |
| Ordena data de emissão | OrdernaDataEmissao  |    Sim-Não    |                 (N)                  |                   null                    |                                                                                  null                                                                                  |
|  Parceiro de Negócios  |   C\_BPartner\_ID   |   Procurar    | C\_BPartner (Trx)(@C\_BPartner\_ID@) |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |

</div>

</div>

  

</div>
