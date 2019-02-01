---
title: "Razão Analítico"
id: RazaoAnaliticoRpt
---
<div id="d188734e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Razão Analítico

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2014-05-12 17:13:07.0

<span class="emphasis">*Atualizado:*</span>2014-08-11 16:03:38.0

<span class="emphasis"> *Descrição:* </span>Razão Analítico

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de Razao
Analitico provê informações das contas e contrapartidas.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RazaoAnalitico.png)

<div id="d188734e26" class="table">

<div class="table-title">

Table 1.1. RazaoAnalitico
Parâmetros

</div>

<div class="table-contents">

|               Nome               |   Nome da coluna    |      Referência      |                            Valores(Padrão)                            |                 Descrição                  |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :------------------------------: | :-----------------: | :------------------: | :-------------------------------------------------------------------: | :----------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Empresa              |   AD\_Client\_ID    |    Tabela Direta     |                    AD\_Client(@\#AD\_Client\_ID@)                     |  Empresa/Locatário para esta instalação.   |                                                                                                                 Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                 |
|           Organização            |     AD\_Org\_ID     |    Tabela Direta     |                    AD\_Org (Trx)(@\#AD\_Org\_ID@)                     | Entidade organizacional dentro da Empresa  |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |
|        Elemento de Contas        | C\_ElementValue\_ID |       Procurar       |                                                                       |             Elemento de Contas             |                                                                                                                                                         Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                                                                                                                                          |
|           Núm. Inicial           |       StartNo       |        Número        |                                  (1)                                  |           Número Inicial/posição           |                                                                                                                                                           O "Número Inicial" indica a posição de início na linha ou número do campo na linha                                                                                                                                                           |
|         Centro de Custo          |      User1\_ID      |        Tabela        |                          Account\_ID - User1                          |              Centro de Custo               |                                                                                                                                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                                                                                               |
|       Parceiro de Negócios       |   C\_BPartner\_ID   |       Procurar       |                                                                       |    Identifica um Parceiro de Negócios.     |                                                                                                                  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                                                                                                  |
|        Tipo de Lançamento        |     PostingType     |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A) | É o tipo de valor lançado para a transação |                                                                                                                                    O campo "Tipo de Lançamento" indica o tipo do montante (Real, Orçamento, Reserva, Comprometimento, Estatística) desta transação.                                                                                                                                    |
|         Esquema Contábil         |  C\_AcctSchema\_ID  |    Tabela Direta     |                                                                       |         Regras para contabilidade          |                                                                                                                                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                                                                                         |
|   Agrupar por Centro de Custo    |  cof\_GroupByUser1  |       Sim-Não        |                                 ('N')                                 |                    null                    |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
| Chave de Busca (Conta Contabil)  |        Value        | Texto Curto (String) |                                                                       |      Chave de Busca (Conta Contabil)       | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
| Chave de Busca (Centro de Custo) |     cof\_Value      | Texto Curto (String) |                                                                       |      Chave de Busca (Centro de Custo)      | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|          Data da Conta           |      DateAcct       |         Data         |                              (@\#Date@)                               |               Data Contábil                |                                                                                                                  A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                                                                                                  |

</div>

</div>

  

</div>
