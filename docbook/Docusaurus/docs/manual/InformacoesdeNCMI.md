---
title: "Informações de NCM"
id: InformacoesdeNCMI
---
<div id="d125150e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de NCM

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2015-05-08 09:33:10.0

<span class="emphasis"> *Atualizado:* </span>2015-05-08 10:25:15.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>LBR\_NCM n

<span class="emphasis"> *Order By :*</span>n.Value

<div id="d125150e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|      Nome      |      Referência      |    Sql SELECT    |                                       QueryCriteria                                        |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :------------: | :------------------: | :--------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Descrição    | Texto Curto (String) |  n.Description   | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                         Descrição resumida opcional do registro                         |                                                                                                                                                                               Uma descrição é limitada a 255 caracteres.                                                                                                                                                                               |
| Chave de Busca | Texto Curto (String) |     n.Value      | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|     Is DBN     |       Sim-Não        |   n.cof\_isDBN   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                 Flag to indicate a DBN                                  |                                                                                                                                                                     Flag to indicate a DBN - (Detailing Brazilian of Nomenclature)                                                                                                                                                                     |
|    Empresa     |    Tabela Direta     | n.AD\_Client\_ID |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                         Empresa/Locatário para esta instalação.                         |                                                                                                                 Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                 |
|  Organização   |    Tabela Direta     |  n.AD\_Org\_ID   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                        Entidade organizacional dentro da Empresa                        |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/NCMInfoinfodata.html),

</div>
