---
title: "Relatório de Cheque Devolvidos"
id: RelatoriodeChequeDevolvidosRpt
---
<div id="d197413e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Cheque Devolvidos

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-05-07 14:28:10.0

<span class="emphasis">*Atualizado:*</span>2015-05-07 15:03:09.0

<span class="emphasis"> *Descrição:* </span>Relatório de Cheque
Devolvidos

<span class="emphasis"> *ReportView:* </span>null

<div id="d197413e21" class="table">

<div class="table-title">

Table 1.1. RelatoriodeChequeDevolvidos
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna   |  Referência   |   Valores(Padrão)    |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :----------------: | :-----------: | :------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |   AD\_Client\_ID   | Tabela Direta | (@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |    AD\_Org\_ID     | Tabela Direta |  (@\#AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Parceiro de Negócios |  C\_BPartner\_ID   |   Procurar    |                      |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
|    Cheque Trocado    | cof\_IsChangeCheck |    Sim-Não    |                      | Indica que o cheque bancário foi trocado. |                                                                                  null                                                                                  |
|  Centro de Custo 2   |     User2\_ID      |    Tabela     | Account\_ID - User2  |            Centro de Custo \#2            |                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                               |
|  Data do Documento   |      DateDoc       |     Data      |      (@\#Date@)      |             Data do Documento             |                            A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                            |

</div>

</div>

  

</div>
