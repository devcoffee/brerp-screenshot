---
title: "Relatório de Cobrança"
id: RelatoriodeCobrancaRpt
---
<div id="d198331e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Cobrança

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-18 11:02:19.0

<span class="emphasis">*Atualizado:*</span>2016-05-18 11:02:19.0

<span class="emphasis"> *Descrição:* </span>Apresenta os Itens para
Cobrança

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório de
Cobrança. Apresenta todo itens em Aberto da Empresa

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeCobranca.png)

<div id="d198331e26" class="table">

<div class="table-title">

Table 1.1. RelatoriodeCobranca
Parâmetros

</div>

<div class="table-contents">

|                Nome                 |     Nome da coluna      |  Referência   |                               Valores(Padrão)                               |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------------------: | :---------------------: | :-----------: | :-------------------------------------------------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Saldo a Receber Considerando Cheque |   cof\_EvaluateCheck    |     Lista     |                                   Não Sim                                   |                        Avalia os Cheques no Relatório                        |                                                                                              Considera os Cheques para os Relatórios                                                                                              |
|             Organização             |       AD\_Org\_ID       | Tabela Direta |                               (@AD\_Org\_ID@)                               |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|               Empresa               |     AD\_Client\_ID      | Tabela Direta |                       AD\_Client(@\#AD\_Client\_ID@)                        |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|        Parceiro de Negócios         |     C\_BPartner\_ID     |   Procurar    |                              C\_BPartner (Trx)                              |                     Identifica um Parceiro de Negócios.                      |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|              Custódia               |   COF\_C\_Custody\_ID   |    Tabela     |                               COF\_C\_Custody                               |                     Custódia Vinculada a Este Documento.                     |                                                                                                       Primary Key : Custody                                                                                                       |
|        Exibir em Relatórios         | cof\_ExibirEmRelatorios |     Lista     |                                   Não Sim                                   | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|         Grupo de Parceiros          |    C\_BP\_Group\_ID     |   Procurar    |                                                                             |                        Grupo de Parceiros de Negócios                        |                                                O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                |
|         Data do Vencimento          |         DueDate         |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |                  Data em que o pagamento deve ser efetuado                   |                                                                                 Data em que o pagamento deve ser feito sem deduções ou descontos                                                                                  |

</div>

</div>

  

</div>
