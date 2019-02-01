---
title: "Processos da Janela"
id: ProcessosdaJanelaI
---
<div id="d181066e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Processos da Janela

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-07-19 16:28:10.0

<span class="emphasis"> *Atualizado:* </span>2018-07-19 16:34:29.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_RV\_ProcessosDeJanela
p LEFT JOIN ad\_process\_trl pt ON (p.ad\_process\_id =
pt.ad\_process\_id AND pt.ad\_language = '@\#AD\_Language@' )

<span class="emphasis"> *Order By :*</span>null

<div id="d181066e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|           Nome            |            Referência             |                       Sql SELECT                       | QueryCriteria |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :-----------------------: | :-------------------------------: | :----------------------------------------------------: | :-----------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Janela           |           Tabela Direta           |                    p.AD\_Window\_ID                    |               |                         Entrada de dados ou janela de exposição                         |                                                                                                                                                                        O campo "Janela" identifica uma Janela única no sistema.                                                                                                                                                                        |
|          Janela           |           Tabela Direta           |                    p.AD\_Window\_ID                    |               |                         Entrada de dados ou janela de exposição                         |                                                                                                                                                                        O campo "Janela" identifica uma Janela única no sistema.                                                                                                                                                                        |
|      Chave de Busca       |       Texto Curto (String)        |                        p.Value                         |               | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|           Nome            |       Texto Curto (String)        |           COALESCE(pt.name, p.name) AS Name            |               |                         Identificador Alfanumérico da entidade                          |                                                                                                                      O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento.                                                                                                                      |
|     Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |           COALESCE(pt.Help, p.Help) AS Help            |               |                                   Comentário ou Dica                                    |                                                                                                                                                              O campo "Ajuda" contém uma dica, comentário ou ajuda sobre o uso deste item.                                                                                                                                                              |
|         Descrição         |       Texto Curto (String)        | COALESCE(pt.Description, p.Description) AS Description |               |                         Descrição resumida opcional do registro                         |                                                                                                                                                                               Uma descrição é limitada a 255 caracteres.                                                                                                                                                                               |
|         Relatório         |              Sim-Não              |                       p.IsReport                       |               |                             Indica um registro de Relatório                             |                                                                                                                                                   A caixa de verificação "Relatório" indica que este registro é um relatório em oposição a processo                                                                                                                                                    |
|     Fluxo de Trabalho     |             Procurar              |                   p.AD\_Workflow\_ID                   |               |                       Fluxo de Trabalho ou combinação de tarefas                        |                                                                                                                                                             O campo "Fluxo de Trabalho" identifica um Fluxo de Trabalho único no sistema.                                                                                                                                                              |
|    Formulário Especial    |           Tabela Direta           |                     p.AD\_Form\_ID                     |               |                                   Formulário Especial                                   |                                                                                                                                                           O campo "Formulário Especial" identifica um Formulário Especial único no sistema.                                                                                                                                                            |
| Visualização de Relatório |           Tabela Direta           |                  p.AD\_ReportView\_ID                  |               |                      Visualização usada para gerar este relatório                       |                                                                                                                                                         Uma "Visualização de Relatório" indica a visualização usada para gerar este relatório.                                                                                                                                                         |
|   Formato de Impressão    |           Tabela Direta           |                 p.AD\_PrintFormat\_ID                  |               |                              Formato de Impressão de Dados                              |                                                                                                                                                             O formato de impressão determina como os dados são manipulados para impressão.                                                                                                                                                             |

</div>

</div>

  

\[DADOS INVÁLIDOS\]

</div>
