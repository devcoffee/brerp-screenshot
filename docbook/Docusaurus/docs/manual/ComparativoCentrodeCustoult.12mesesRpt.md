---
title: "Comparativo Centro de Custo últ. 12 meses"
id: ComparativoCentrodeCustoult.12mesesRpt
---
<div id="d29124e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Comparativo Centro de Custo últ. 12 meses

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-04-14 19:12:33.0

<span class="emphasis">*Atualizado:*</span>2017-11-21 11:05:12.0

<span class="emphasis"> *Descrição:* </span>Comparativo Centrro de Custo
últ. 12 meses

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório
Comparativo Centro de Custo últimos 12 meses apresenta o centro de custo
e a evolução contábil das contas mensalmente.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/ComparativoCentrodeCustoult.12meses.png)

<div id="d29124e26" class="table">

<div class="table-title">

Table 1.1. ComparativoCentrodeCustoult.12meses
Parâmetros

</div>

<div class="table-contents">

|              Nome               |   Nome da coluna    |      Referência      |                           Valores(Padrão)                            |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :-----------------------------: | :-----------------: | :------------------: | :------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Empresa             |   AD\_Client\_ID    |    Tabela Direta     |                         (@\#AD\_Client\_ID@)                         |                         Empresa/Locatário para esta instalação.                         |                                                                                                                 Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                 |
|           Organização           |     AD\_Org\_ID     |    Tabela Direta     |                          (@\#AD\_Org\_ID@)                           |                        Entidade organizacional dentro da Empresa                        |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |
|          Tipo de Conta          |     AccountType     |        Lista         | Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita |                                 Indica o tipo de conta                                  |          Os tipos válidos de contas são A - Ativo, E - despesa (Expense), L - Passivo (Liability), O - Patrimônio dos Acionistas, R - Receita e M - Memorando. O tipo de conta é utilizado para determinar que impostos, se aplicáveis, validando contas a pagar e a receber dos parceiros de negócios. Nota: Os montantes das contas de tipo memorando são ignorados ao conferir os balanços          |
|        Esquema Contábil         |  C\_AcctSchema\_ID  |    Tabela Direta     |                                                                      |                                Regras para contabilidade                                |                                                                                                                                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                                                                                         |
|            Atividade            |   C\_Activity\_ID   |    Tabela Direta     |                                                                      |                                  Atividade de Negócio                                   |                                                                                                                                                 "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                                                                                                                                  |
|       Elemento de Contas        | C\_ElementValue\_ID |       Procurar       |                                                                      |                                   Elemento de Contas                                    |                                                                                                                                                         Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                                                                                                                                          |
|         Centro de Custo         |      User1\_ID      |       Procurar       |                         Account\_ID - User1                          |                                     Centro de Custo                                     |                                                                                                                                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                                                                                               |
| Chave de Busca (Conta Contábil) |        Value        | Texto Curto (String) |                                                                      |                             Chave de Busca (Conta Contábil)                             |                                                                                                                                                                                    Chave de Busca (Conta Contábil)                                                                                                                                                                                     |
|          Data da Conta          |      DateAcct       |         Data         |                              (@\#Date@)                              |                                      Data Contábil                                      |                                                                                                                  A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                                                                                                  |
|         Chave de Busca          |     cof\_Value      | Texto Curto (String) |                                                                      | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |

</div>

</div>

  

</div>
