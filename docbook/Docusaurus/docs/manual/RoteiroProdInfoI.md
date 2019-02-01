---
title: "Roteiro Prod Info"
id: RoteiroProdInfoI
---
<div id="d208876e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Roteiro Prod Info

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2017-02-20 02:00:21.0

<span class="emphasis"> *Atualizado:* </span>2017-06-13 14:32:27.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_PP\_RoteiroProd a

<span class="emphasis"> *Order By :*</span>null

<div id="d208876e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|         Nome         |      Referência      |       Sql SELECT        |                                       QueryCriteria                                        |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :------------------: | :------------------: | :---------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Quantidade de Ciclos |        Número        |   a.COF\_PP\_QtdCiclo   |                                                                                            |                                          null                                           |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|    Chave de Busca    | Texto Curto (String) |         a.Value         | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|       Produto        |       Procurar       |    a.M\_Product\_ID     |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                 Produto, Serviço, Item                                  |                                                                                                                                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                                                                                                                                  |
|   Tipo do Produto    |        Tabela        | a.COF\_ProductType\_ID  |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                    Coluna de relação com a tabela de tipo de produto                    |                                                                                                                                                                                       Primary Key : Product Type                                                                                                                                                                                       |
|  Classe do Produto   |        Tabela        | a.COF\_ProductClass\_ID |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                   Coluna de relação com a tabela de classe de produto                   |                                                                                                                                                                                      Primary Key : Product Class                                                                                                                                                                                       |
|   Grupo do Produto   |        Tabela        | a.COF\_ProductGroup\_ID |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                   Coluna de relação com a tabela de grupo do produto                    |                                                                                                                                                                                      Primary Key : Product Group                                                                                                                                                                                       |
|      Descrição       | Texto Curto (String) |      a.Description      |                                                                                            |                         Descrição resumida opcional do registro                         |                                                                                                                                                                               Uma descrição é limitada a 255 caracteres.                                                                                                                                                                               |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/RoteiroProdInfoinfodata.html),

</div>
