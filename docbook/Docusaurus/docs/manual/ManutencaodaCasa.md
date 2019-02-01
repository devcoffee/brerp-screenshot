---
title: "Manutenção da Casa"
id: ManutencaodaCasa
---
<div id="d143348e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Manutenção da Casa

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Manutenção da Casa -
    AD\_HouseKeeping](#d143348e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-09-06 20:12:10.0

<span class="emphasis">*Atualizado em:* </span>2008-09-06 20:12:10.0

<div id="d143348e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Manutenção da Casa - AD\_HouseKeeping

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_HouseKeeping_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d143348e31" class="table">

<div class="table-title">

Table 1.1. House Keeping
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                Descrição                 |                                                                          Comentário/Ajuda                                                                          |
| :-------------------------: | :-------------------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| House Keeping Configuration |                ID                 |                      |                         |                                                  |                                          |                                                                                                                                                                    |
|           Empresa           |           Tabela Direta           | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|         Organização         |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|       Chave de Busca        |       Texto Curto (String)        |                      |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|            Nome             |       Texto Curto (String)        |                      |                         |                                                  |  Alphanumeric identifier of the entity   |            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.            |
|          Descrição          |       Texto Curto (String)        |                      |                         |                                                  | Optional short description of the record |                                                            A description is limited to 255 characters.                                                             |
|      Comentário/Ajuda       | Texto Médio (até 2000 caracteres) |                      |                         |                                                  |             Comment or Hint              |                                            The Help field contains a hint, comment or help about the use of this item.                                             |
|           Tabela            |           Tabela Direta           |                      | adtable\_adhousekeeping |                                                  |        Database Table information        |                                                The Database Table provides the information of the table definition                                                 |
|          Sql WHERE          |       Texto Curto (String)        |                      |                         |                                                  |     Fully qualified SQL WHERE clause     | The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname". |
|     Salvar no Histórico     |              Sim-Não              |                      |                         |                                                  |                                          |                                                                                                                                                                    |
|  Exportação XML de Backup   |              Sim-Não              |                      |                         |                                                  |                                          |                                                                                                                                                                    |
|        Pasta Backup         |             FilePath              |                      |                         |                                                  |              Backup Folder               |                                                                                                                                                                    |
|        Manter a Casa        |               Botão               |                      |                         |                                                  |                                          |                                                                                                                                                                    |
|       Última Execução       |             Data+Hora             |                      |                         |                                                  |                                          |                                                                                                                                                                    |
|       Último Excluído       |              Inteiro              |                      |                         |                                                  |                                          |                                                                                                                                                                    |
|            Ativo            |              Sim-Não              |         (Y)          |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                                        (ver o mesmo acima)                                                                         |
|    AD\_HouseKeeping\_UU     |       Texto Curto (String)        |                      |                         |                                                  |                                          |                                                                                                                                                                    |

</div>

</div>

  

</div>
