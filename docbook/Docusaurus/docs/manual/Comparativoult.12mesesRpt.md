---
title: "Comparativo últ. 12 meses"
id: Comparativoult.12mesesRpt
---
<div id="d29302e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Comparativo últ. 12 meses

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2014-05-12 17:12:54.0

<span class="emphasis">*Atualizado:*</span>2014-08-11 16:05:58.0

<span class="emphasis"> *Descrição:* </span>Comparativo últ. 12 meses

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório
Comparativo últimos 12 meses apresenta a evolução contábil das contas
mensalmente

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/Comparativoult.12meses.png)

<div id="d29302e26" class="table">

<div class="table-title">

Table 1.1. Comparativoult.12meses
Parâmetros

</div>

<div class="table-contents">

|               Nome               |   Nome da coluna    |      Referência      |        Valores(Padrão)         |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :------------------------------: | :-----------------: | :------------------: | :----------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Elemento de Contas        | C\_ElementValue\_ID |       Procurar       |                                |            Elemento de Contas             |                                         Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                          |
|           Organização            |     AD\_Org\_ID     |    Tabela Direta     | AD\_Org (Trx)(@\#AD\_Org\_ID@) | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|             Empresa              |   AD\_Client\_ID    |    Tabela Direta     | AD\_Client(@\#AD\_Client\_ID@) |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|         Esquema Contábil         |  C\_AcctSchema\_ID  |    Tabela Direta     |                                |         Regras para contabilidade         |                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                         |
|         Centro de Custo          |      User1\_ID      |       Procurar       |      Account\_ID - User1       |              Centro de Custo              |                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                               |
|            Atividade             |   C\_Activity\_ID   |        Tabela        |    C\_Activity (No summary)    |           Atividade de Negócio            |                                 "Atividade" indica tarefas que são executadas e utilizadas para Cálculo de Custo Baseado em Atividade                                  |
| Chave de Busca (Centro de Custo) |     cof\_Value      | Texto Curto (String) |                                |     Chave de Busca (Centro de Custo)      |                                                                    Chave de Busca (Centro de Custo)                                                                    |
| Chave de Busca (Conta Contábil)  |        Value        | Texto Curto (String) |                                |      Chave de Busca (Conta Contábil)      |                                                                    Chave de Busca (Conta Contábil)                                                                     |
|          Data da Conta           |      DateAcct       |         Data         |           (@\#Date@)           |               Data Contábil               |  A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.  |

</div>

</div>

  

</div>
