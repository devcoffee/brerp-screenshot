---
title: "Informações de CFOP"
id: InformacoesdeCFOPI
---
<div id="d124643e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de CFOP

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2015-05-08 09:54:19.0

<span class="emphasis"> *Atualizado:* </span>2015-05-08 10:25:09.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>LBR\_CFOP c

<span class="emphasis"> *Order By :*</span>c.Value

<div id="d124643e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|         Nome          |      Referência      |      Sql SELECT       |                                       QueryCriteria                                        |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :-------------------: | :------------------: | :-------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Descrição       | Texto Curto (String) |     c.Description     | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                         Descrição resumida opcional do registro                         |                                                                                                                                                                               Uma descrição é limitada a 255 caracteres.                                                                                                                                                                               |
|   Tipo de Movimento   |        Lista         |    c.cof\_Movement    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                           Lista de Tipo de Movimento de CFOP                            |                                                                                                                                                                                   Lista de Tipo de Movimento de CFOP                                                                                                                                                                                   |
| Tipo de Classificação |        Lista         | c.cof\_Classification |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                        Lista para Tipo de Classificação de CFOP                         |                                                                                                                                                                                Lista para Tipo de Classificação de CFOP                                                                                                                                                                                |
|        Empresa        |    Tabela Direta     |   c.AD\_Client\_ID    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                         Empresa/Locatário para esta instalação.                         |                                                                                                                 Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                 |
|      Organização      |    Tabela Direta     |     c.AD\_Org\_ID     |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                        Entidade organizacional dentro da Empresa                        |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |
|    Chave de Busca     | Texto Curto (String) |        c.Value        | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/CFOPInfoinfodata.html),

</div>
