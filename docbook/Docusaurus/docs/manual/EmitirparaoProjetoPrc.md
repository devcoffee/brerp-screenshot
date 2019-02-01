---
title: "Emitir para o Projeto"
id: EmitirparaoProjetoPrc
---
<div id="d84163e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Emitir para o Projeto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-09-02 20:02:22.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Emitir Material para Projeto
a partir do Recebimento ou da Localização Manual de Estoque

<span class="emphasis"> *Comentário/Ajuda:* </span>Selecione um Projeto
e ou - Recebimento de Material - Relatório de Despesa \< br\< -
Localização de Estoque e Linha de Projeto não emitida ainda -
Localização de Estoque, Produto e Quantidade. A data de Movimentação
padrão é a data de hoje.

![](/img/manual/EmitirparaoProjeto.png)

<div id="d84163e22" class="table">

<div class="table-title">

Table 1.1. EmitirparaoProjeto
Parâmetros

</div>

<div class="table-contents">

|                Nome                |       Nome da coluna        |      Referência      | Valores(Padrão) |                                Descrição                                 |                                                                                     Comentário/Ajuda                                                                                      |
| :--------------------------------: | :-------------------------: | :------------------: | :-------------: | :----------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Instância do Conjunto de Atributos | M\_AttributeSetInstance\_ID | Atributo de Produto  |                 |              Instância de Conjunto de Atributos de Produto               |                           São os valores dos "Atributos das Instâncias de Produtos" reais. Os atributos de nível de produto são definidos no nível de Produto.                            |
|            Localizador             |       M\_Locator\_ID        |  Locator (Armazém)   |       (0)       |                          Localizador de Armazém                          |                                                           O "Localizador" indica onde um produto está localizado em um armazém.                                                           |
|        Relatório de Despesa        |     S\_TimeExpense\_ID      |    Tabela Direta     |                 |                      Relatório de Horas e Despesas                       |                                                                                           null                                                                                            |
|             Descrição              |         Description         | Texto Curto (String) |                 |                 Descrição resumida opcional do registro                  |                                                                        Uma descrição é limitada a 255 caracteres.                                                                         |
|          Linha de Projeto          |     C\_ProjectLine\_ID      |    Tabela Direta     |                 |                      Tarefa ou passo em um projeto                       |                                                            A "Linha de Projeto" indica uma linha de projeto única e exclusiva.                                                            |
|              Projeto               |       C\_Project\_ID        |    Tabela Direta     |                 |                            Projeto Financeiro                            |                                                     Um "Projeto" permite a você rastrear e controlar atividades internas ou externas.                                                     |
|       Quantidade Movimentada       |         MovementQty         |      Quantidade      |       (1)       |              Quantidade de um produto que foi movimentada.               |                                                       A "Quantidade Movimentada" indica a quantidade de um produto que foi movida.                                                        |
|        Remessa/Recebimento         |        M\_InOut\_ID         |       Procurar       |                 |                     Documento de Remessa de Material                     |                                                                              Remessa/Recebimento de Material                                                                              |
|              Produto               |       M\_Product\_ID        |       Procurar       |                 |                          Produto, Serviço, Item                          |                                                           Identifica um item que é ou comprado ou vendido por esta organização.                                                           |
|        Data da Movimentação        |        MovementDate         |         Data         |                 | Data em que um produto foi movido para dentro ou para fora de um estoque | A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento. |

</div>

</div>

  

</div>
