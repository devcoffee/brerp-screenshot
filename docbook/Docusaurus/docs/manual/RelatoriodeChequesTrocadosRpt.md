---
title: "Relatório de Cheques Trocados"
id: RelatoriodeChequesTrocadosRpt
---
<div id="d197965e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Cheques Trocados

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2015-05-07 14:43:20.0

<span class="emphasis">*Atualizado:*</span>2015-05-07 15:02:49.0

<span class="emphasis"> *Descrição:* </span>Relatório de Cheques
Trocados

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeChequesTrocados.png)

<div id="d197965e22" class="table">

<div class="table-title">

Table 1.1. RelatoriodeChequesTrocados
Parâmetros

</div>

<div class="table-contents">

|         Nome         | Nome da coluna  |  Referência   |   Valores(Padrão)    |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------: | :-------------: | :-----------: | :------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        | AD\_Client\_ID  | Tabela Direta | (@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|     Organização      |   AD\_Org\_ID   | Tabela Direta |  (@\#AD\_Org\_ID@)   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Parceiro de Negócios | C\_BPartner\_ID |   Procurar    |                      |    Identifica um Parceiro de Negócios.    |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
|    Altera o Tipo     |   ChangeType    |     Lista     |   Cheque Dinheiro    |                   null                    |                                                                                  null                                                                                  |
|  Centro de Custo 2   |    User2\_ID    |    Tabela     | Account\_ID - User2  |            Centro de Custo \#2            |                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                               |
|  Data do Documento   |     DateDoc     |     Data      |      (@\#Date@)      |             Data do Documento             |                            A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                            |

</div>

</div>

  

</div>
