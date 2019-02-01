---
title: "Retorno CNAB"
id: RetornoCNABPrc
---
<div id="d208759e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Retorno CNAB

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2007-12-03 15:17:27.0

<span class="emphasis">*Atualizado:*</span>2013-11-11 20:13:32.0

![](/img/manual/RetornoCNAB.png)

<div id="d208759e14" class="table">

<div class="table-title">

Table 1.1. RetornoCNAB
Parâmetros

</div>

<div class="table-contents">

|               Nome               |       Nome da coluna        | Referência |                    Valores(Padrão)                    |          Descrição           |                                              Comentário/Ajuda                                              |
| :------------------------------: | :-------------------------: | :--------: | :---------------------------------------------------: | :--------------------------: | :--------------------------------------------------------------------------------------------------------: |
|         Nome do Arquivo          |          FileName           |  FileName  |                                                       | Nome do arquivo local ou URL |         Nome de um arquivo no espaço de diretórios local - ou URL (file://.., http://.., ftp://..)         |
|       Integração Bancária        | COF\_C\_BankIntegration\_ID |   Tabela   | COF\_BankIntegration (With CNAB Return Configuration) |     Integração Bancária      |                                            Integração Bancária                                             |
|         Centro de Custo          |          User1\_ID          |   Tabela   |                  Account\_ID - User1                  |       Centro de Custo        | O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas. |
|        Centro de Custo 2         |          User2\_ID          |   Tabela   |                  Account\_ID - User2                  |     Centro de Custo \#2      | O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas. |
| Forçar Centro de Custo da Fatura |       ForceUELInvoice       |  Sim-Não   |                                                       |             null             |                                                    null                                                    |

</div>

</div>

  

</div>
