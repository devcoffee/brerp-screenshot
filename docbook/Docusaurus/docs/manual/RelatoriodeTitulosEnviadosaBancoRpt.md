---
title: "Relatório de Titulos Enviados a Banco"
id: RelatoriodeTitulosEnviadosaBancoRpt
---
<div id="d202472e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Titulos Enviados a Banco

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2014-08-20 16:55:33.0

<span class="emphasis">*Atualizado:*</span>2015-05-31 20:28:18.0

<span class="emphasis"> *Descrição:* </span>Relatório de Titulos
Enviados a Banco

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeTitulosEnviadosaBanco.png)

<div id="d202472e22" class="table">

<div class="table-title">

Table 1.1. RelatoriodeTitulosEnviadosaBanco
Parâmetros

</div>

<div class="table-contents">

|         Nome         |       Nome da coluna        |  Referência   |                                      Valores(Padrão)                                       |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :-------------------------: | :-----------: | :----------------------------------------------------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Integração Bancária  | COF\_C\_BankIntegration\_ID |    Tabela     |                   COF\_BankIntegration (With CNAB Return Configuration)                    |            Integração Bancária            |                                                                          Integração Bancária                                                                           |
|       Borderô        |      cof\_BorderoName       |   Procurar    |                                                                                            |                   null                    |                                                                                  null                                                                                  |
|       Empresa        |       AD\_Client\_ID        | Tabela Direta |                                    (@\#AD\_Client\_ID@)                                    |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |         AD\_Org\_ID         | Tabela Direta |                                     (@\#AD\_Org\_ID@)                                      | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|    Conta Bancária    |     C\_BankAccount\_ID      | Tabela Direta |                                                                                            |              Conta no Banco               |                                                          A "Conta Bancária" identifica uma conta neste Banco.                                                          |
| Parceiro de Negócios |       C\_BPartner\_ID       |   Procurar    |                                                                                            |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
|   Tipo de Carteira   |      cof\_BillFoldType      |     Lista     | Cobrança Caucionada Cobrança Descontada Compror Cobrança Simples Cobrança Vinculada Vendor |        Tipo da Carteira do Título         |                                                                                  null                                                                                  |
|  Data do Documento   | cof\_titulo\_DataDocumento  |     Data      |        (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy'))         |                   null                    |                                                                                  null                                                                                  |

</div>

</div>

  

</div>
