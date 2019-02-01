---
title: "Tipo do Processador de Importação"
id: TipodoProcessadordeImportacao
---
<div id="d243871e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo do Processador de Importação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: tipo do Processador de Importação
    - IMP\_Processor\_Type](#d243871e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-03-05 00:55:58.0

<span class="emphasis">*Atualizado em:* </span>2008-03-05 00:55:58.0

![](/img/manual/TipodoProcessadordeImportacao.png)

<div id="d243871e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: tipo do Processador de Importação - IMP\_Processor\_Type

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/IMP_Processor_Type_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d243871e32" class="table">

<div class="table-title">

Table 1.1. Import Processor Type
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             |  Valores (Padrão)  | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------------: | :-------------------------------: | :----------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Importe o Tipo do Processo |                ID                 |                    |                  |                                                  |                                          |                                                                                                                                              |
|          Empresa           |           Tabela Direta           | (@AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Organização         |           Tabela Direta           |  (@AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Chave de Busca       |       Texto Curto (String)        |                    |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Nome            |       Texto Curto (String)        |                    |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição          |       Texto Curto (String)        |                    |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|           Ativo            |              Sim-Não              |       ('Y')        |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                    |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|        Classe Java         |       Texto Curto (String)        |                    |                  |                                                  |                                          |                                                                                                                                              |
|  IMP\_Processor\_Type\_UU  |       Texto Curto (String)        |                    |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
