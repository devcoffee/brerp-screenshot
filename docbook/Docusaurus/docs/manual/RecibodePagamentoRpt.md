---
title: "Recibo de Pagamento"
id: RecibodePagamentoRpt
---
<div id="d191840e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Recibo de Pagamento

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-07-29 11:29:23.0

<span class="emphasis">*Atualizado:*</span>2016-07-29 11:29:23.0

<span class="emphasis"> *Descrição:* </span>Relatório de Recibo de
Pagamento

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de Recibo
de Pagamento gera um recibo com informações de um Pedido, Fatura ou a
partir de um Parceiro e um Valor

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RecibodePagamento.png)

<div id="d191840e26" class="table">

<div class="table-title">

Table 1.1. RecibodePagamento
Parâmetros

</div>

<div class="table-contents">

|         Nome         |    Nome da coluna    |            Referência             |   Valores(Padrão)    |                               Descrição                                |                                                                                                         Comentário/Ajuda                                                                                                          |
| :------------------: | :------------------: | :-------------------------------: | :------------------: | :--------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Usuário/Contato    |     AD\_User\_ID     |           Tabela Direta           |  (@\#AD\_User\_ID@)  | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |                                          O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                           |
|   Dados Adicionais   | COF\_DadosAdicionais | Texto Médio (até 2000 caracteres) |                      |                Dados adicionais do Recibo do Pagamento                 |                                                                                                               null                                                                                                                |
|       Empresa        |    AD\_Client\_ID    |           Tabela Direta           | (@\#AD\_Client\_ID@) |                Empresa/Locatário para esta instalação.                 |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|     Organização      |     AD\_Org\_ID      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |               Entidade organizacional dentro da Empresa                |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Transação de Vendas  |       IsSOTrx        |               Lista               | Não Sim (@IsSOTrx@)  |                     Esta é uma Transação de Vendas                     |                                                                    A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                                                    |
| Parceiro de Negócios |   C\_BPartner\_ID    |             Procurar              | (@C\_BPartner\_ID@)  |                  Identifica um Parceiro de Negócios.                   |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|     Total Geral      |      GrandTotal      |               Valor               |                      |                        Valor Total do documento                        |                                                                       O "Total Geral" mostra o valor total incluindo Impostos e Frete na moeda do documento                                                                       |
|    Data da Conta     |       DateAcct       |             Data+Hora             |     (@DateAcct@)     |                             Data Contábil                              |                               A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                |
|        Fatura        |    C\_Invoice\_ID    |             Procurar              | C\_Invoice (Vendor)  |                        Identificador de Fatura                         |                                                                                                      O Documento da Fatura.                                                                                                       |
|        Pedido        |     C\_Order\_ID     |             Procurar              |       C\_Order       |                                 Pedido                                 | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|      Pagamento       |    C\_Payment\_ID    |             Procurar              |  (@C\_Payment\_ID@)  |                       Identificador de Pagamento                       |                                                                                    O "Pagamento" é um identificador exclusivo deste pagamento.                                                                                    |

</div>

</div>

  

</div>
