---
title: "Localizador"
id: LocalizadorI
---
<div id="d138272e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Localizador

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2017-02-22 09:39:25.0

<span class="emphasis"> *Atualizado:* </span>2017-06-14 14:46:41.0

<span class="emphasis"> *Descrição:* </span>Info window dos
localizadores

<span class="emphasis"> *Comentário/Ajuda:* </span>Info window dos
localizadores

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>M\_Locator a

<span class="emphasis"> *Order By :*</span>null

<div id="d138272e33" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|        Nome         |      Referência      |     Sql SELECT     |                                       QueryCriteria                                       |                                        Descrição                                        |                                                                                                                                                                                                                                                                                                                                                               Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                                |
| :-----------------: | :------------------: | :----------------: | :---------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Prioridade Relativa |       Inteiro        |    a.PriorityNo    |  <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |           De onde o estoque deve ser separado para entrega em primeiro lugar            | O campo "Prioridade Relativa" indica a localização da escolha prioritária se um produto estiver armazenado em mais de um lugar. (100 = maior prioridade, 0 = menor). Para remessas de saída, a localização de origem escolhida é a de maior prioridade de onde a quantidade total puder ser enviada. Se não houver uma localização que atenda a estes critérios, a localização de maior prioridade será a escolhida. A Prioridade será ignorada para produtos com "Data de Validade" (o mais antigo é sempre escolhido em primeiro lugar) ou se uma instância específica for selecionada. Caso não tenha sido especificamente selecionado um local em particular, os recebimentos de entrada serão estocados no local com a maior prioridade. |
|   Chave de Busca    | Texto Curto (String) |      a.Value       |  <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>Upper  | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo |                                                                                                                                                                    Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order).                                                                                                                                                                     |
|     Estante (Y)     | Texto Curto (String) |        a.Y         | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>null |                      Dimensão Y, ex., Estante, Armário, Container                       |                                                                                                                                                                                                                                                                                                                                      A dimensão "Y" indica a estante em que um produto está localizado.                                                                                                                                                                                                                                                                                                                                       |
|    Corredor (X)     | Texto Curto (String) |        a.X         | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>null |                                Dimensão X, ex., Corredor                                |                                                                                                                                                                                                                                                                                                                                      A dimensão "X" indica o corredor em que um produto está localizado.                                                                                                                                                                                                                                                                                                                                      |
|      Nível (Z)      | Texto Curto (String) |        a.Z         | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>null |                                 Dimensão Z , ex., Nível                                 |                                                                                                                                                                                                                                                                                                                                       A dimensão "Z" indica o Nível em que um produto está localizado.                                                                                                                                                                                                                                                                                                                                        |
|       Armazém       |    Tabela Direta     | a.M\_Warehouse\_ID |  <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                         Armazém de estocagem e Ponto de Serviço                         |                                                                                                                                                                                                                                                                                                             O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                                                                                                                                                                                                                                                                                                              |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/LocatorInfoinfodata.html),

</div>
