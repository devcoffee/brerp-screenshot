---
title: "Relatório de Cheque Geral"
id: RelatoriodeChequeGeralRpt
---
<div id="d197463e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Cheque Geral

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-05-07 10:48:51.0

<span class="emphasis">*Atualizado:*</span>2015-05-07 15:02:57.0

<span class="emphasis"> *Descrição:* </span>Relatório de Cheque Geral

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeChequeGeral.png)

<div id="d197463e22" class="table">

<div class="table-title">

Table 1.1. RelatoriodeChequeGeral
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna      |  Referência   |   Valores(Padrão)    |                                Descrição                                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :----------------------: | :-----------: | :------------------: | :----------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Exibir Rastreio    |  COF\_isDisplayTracking  |    Sim-Não    |                      |                                   null                                   |                                                                                  null                                                                                  |
|     Organização      |       AD\_Org\_ID        | Tabela Direta |  (@\#AD\_Org\_ID@)   |                Entidade organizacional dentro da Empresa                 |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|       Empresa        |      AD\_Client\_ID      | Tabela Direta | (@\#AD\_Client\_ID@) |                 Empresa/Locatário para esta instalação.                  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|  Cheque Compensado   |   cof\_IsClearedCheck    |    Sim-Não    |                      |                    Define se o Cheque foi Compensado                     |                                                                                  null                                                                                  |
| Parceiro de Negócios |     C\_BPartner\_ID      |   Procurar    |                      |                   Identifica um Parceiro de Negócios.                    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
|    Cheque Trocado    |    cof\_IsChangeCheck    |    Sim-Não    |                      |                Indica que o cheque bancário foi trocado.                 |                                                                                  null                                                                                  |
| Cheque de Terceiros  |     cof\_ThirdCheck      |     Lista     |       Não Sim        |              Indica que o Cheque foi Obtido por Terceiros.               |                                                                                  null                                                                                  |
|   Permitir Repasse   |    cof\_UseForPayment    |     Lista     |       Não Sim        | Permitir repasse, ou seja, cheque pode ser usado para efetuar pagamentos |                                                                                  null                                                                                  |
|   Tipo de Portador   | COF\_C\_CheckCustody\_ID |    Tabela     | COF\_C\_CheckCustody |                  Tipo de Portador / Custodia do Cheque                   |                                                                      Primary Key : Check Custody                                                                       |
|  Centro de Custo 2   |        User2\_ID         |    Tabela     | Account\_ID - User2  |                           Centro de Custo \#2                            |                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                               |
|    Data Bom Para     |          DateTo          |     Data      |                      |                              Data Bom Para                               |                                                       The Date To indicates the end date of a range (inclusive)                                                        |
|  Data do Documento   |         DateDoc          |     Data      |                      |                            Data do Documento                             |                            A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                            |

</div>

</div>

  

</div>
