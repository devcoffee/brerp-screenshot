---
title: "Gerar DIEF / PA"
id: GerarDIEFPAPrc
---
<div id="d109168e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Gerar DIEF / PA

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-31 09:40:01.0

<span class="emphasis">*Atualizado:*</span>2016-05-31 16:51:43.0

![](/img/manual/GerarDIEF/PA.png)

<div id="d109168e14" class="table">

<div class="table-title">

Table 1.1. GerarDIEF/PA
Parâmetros

</div>

<div class="table-contents">

|       Nome        |  Nome da coluna   | Referência |   Valores(Padrão)   |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :---------------: | :---------------: | :--------: | :-----------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa      |  AD\_Client\_ID   |   Tabela   |                     |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|    Organização    |    AD\_Org\_ID    |   Tabela   |                     | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
| Esquema Contábil  | C\_AcctSchema\_ID |   Tabela   |                     |         Regras para contabilidade         |                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                         |
| Centro de Custo 2 |     User2\_ID     |   Tabela   | Account\_ID - User2 |            Centro de Custo \#2            |                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                               |
| Data da Transação |      DateTrx      |    Data    |                     |             Data da Transação             |                                                      A "Data da Transação" indica a data da transação comercial.                                                       |

</div>

</div>

  

</div>
