---
title: "Importar Taxa de Conversão de Moedas"
id: ImportarTaxadeConversaodeMoedasPrc
---
<div id="d118973e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Importar Taxa de Conversão de Moedas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-01-16 09:26:56.0

<span class="emphasis">*Atualizado:*</span>2018-01-25 11:48:00.0

<span class="emphasis"> *Descrição:* </span>A importação de taxa só
considera dias uteis (segunda a sexta).

<span class="emphasis"> *Comentário/Ajuda:* </span>A importação de taxa
só considera dias uteis (segunda a sexta).

![](/img/manual/ImportarTaxadeConversaodeMoedas.png)

<div id="d118973e22" class="table">

<div class="table-title">

Table 1.1. ImportarTaxadeConversaodeMoedas
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna    | Referência |           Valores(Padrão)            |                 Descrição                 |                                                                      Comentário/Ajuda                                                                       |
| :------------------: | :-----------------: | :--------: | :----------------------------------: | :---------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Organização      |     AD\_Org\_ID     |   Tabela   | AD\_Org (all but 0)(@\#AD\_Org\_ID@) | Entidade organizacional dentro da Empresa | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|      Moeda para      | C\_Currency\_ID\_To |   Tabela   |            C\_Currencies             |             Moeda de Destino              |                                               A "Moeda para" define a moeda alvo para esta taxa de conversão.                                               |
| Processamento Online |     OProcessing     |  Sim-Não   |                ('Y')                 | Este pagamento pode ser processado online |                                         O "Processamento Online" indica se o pagamento pode ser processado online.                                          |
|       Moeda De       |   C\_Currency\_ID   |   Tabela   |                                      |        A Moeda para este registro         |                                      Indica a moeda a ser utilizada ao fazer processos ou relatórios com este registro                                      |
|   Nome do Arquivo    |      FileName       |  FileName  |                                      |       Nome do arquivo local ou URL        |                                 Nome de um arquivo no espaço de diretórios local - ou URL (file://.., http://.., ftp://..)                                  |
|        Do dia        |      DateFrom       |    Data    |                                      |    Data inicial de uma faixa de datas     |                                                O campo "Do dia" indica a data inicial de uma faixa de datas.                                                |

</div>

</div>

  

</div>
