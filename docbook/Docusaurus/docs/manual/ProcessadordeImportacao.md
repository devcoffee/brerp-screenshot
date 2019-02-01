---
title: "Processador de Importação"
id: ProcessadordeImportacao
---
<div id="d178835e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Importação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador de Importação -
    IMP\_Processor](#d178835e23)</span>
  - <span class="section">[2. Tabela: Parâmetro -
    IMP\_ProcessorParameter](#d178835e331)</span>
  - <span class="section">[3. Tabela: Log -
    IMP\_ProcessorLog](#d178835e525)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-03-05 00:54:14.0

<span class="emphasis">*Atualizado em:* </span>2008-03-05 00:54:14.0

![](/img/manual/ProcessadordeImportacao.png)

<div id="d178835e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador de Importação - IMP\_Processor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/IMP_Processor_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d178835e32" class="table">

<div class="table-title">

Table 1.1. Import Processor
Fields

</div>

<div class="table-contents">

|          Nome do campo          |            Referência             |   Valores (Padrão)   |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                                                               Comentário/Ajuda                                                                               |
| :-----------------------------: | :-------------------------------: | :------------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Importar Processo        |                ID                 |                      |                                |                                                  |                                          |                                                                                                                                                                              |
|             Empresa             |           Tabela Direta           | (@\#AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                             (ver o mesmo acima)                                                                              |
|           Organização           |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                             (ver o mesmo acima)                                                                              |
|         Chave de Busca          |       Texto Curto (String)        |                      |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                                             (ver o mesmo acima)                                                                              |
|              Nome               |       Texto Curto (String)        |                      |                                |                                                  |  Alphanumeric identifier of the entity   |                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                 |
|              Ativo              |              Sim-Não              |        ('Y')         |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                                             (ver o mesmo acima)                                                                              |
|            Descrição            |       Texto Curto (String)        |                      |                                |                                                  | Optional short description of the record |                                                                 A description is limited to 255 characters.                                                                  |
|        Comentário/Ajuda         | Texto Médio (até 2000 caracteres) |                      |                                |                                                  |             Comment or Hint              |                                                 The Help field contains a hint, comment or help about the use of this item.                                                  |
|   Importe o Tipo do Processo    |           Tabela Direta           |                      | impprocessortype\_impprocessor |                                                  |                                          |                                                                                                                                                                              |
|       Tipo de Freqüência        |               Lista               |   Dia Hora Minuto    |                                |                                                  |            Frequency of event            |                                                    The frequency type is used for calculating the date of the next event.                                                    |
|           Freqüência            |              Inteiro              |                      |                                |                                                  |           Frequency of events            | The frequency is used in conjunction with the frequency type in determining an event. Example: If the Frequency Type is Week and the Frequency is 2 - it is every two weeks. |
| Dias para manter registro (log) |              Inteiro              |         (7)          |                                |                                                  |  Number of days to keep the log entries  |                                                                       Older Log entries may be deleted                                                                       |
|  Data do último processamento   |             Data+Hora             |                      |                                |                                                  |      Date the process was last run.      |                                                      The Date Last Run indicates the last time that a process was run.                                                       |
|    Data da Próxima Execução     |             Data+Hora             |                      |                                |                                                  |      Date the process will run next      |                                                       The Date Next Run indicates the next time this process will run.                                                       |
|            Servidor             |       Texto Curto (String)        |                      |                                |                                                  |                                          |                                                                                                                                                                              |
|              Porta              |              Inteiro              |                      |                                |                                                  |                                          |                                                                                                                                                                              |
|              Conta              |       Texto Curto (String)        |                      |                                |                                                  |                                          |                                                                                                                                                                              |
|          Info de Senha          |       Texto Curto (String)        |                      |                                |                                                  |                                          |                                                                                                                                                                              |
|       IMP\_Processor\_UU        |       Texto Curto (String)        |                      |                                |                                                  |                                          |                                                                                                                                                                              |

</div>

</div>

  

<div id="d178835e331" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parâmetro - IMP\_ProcessorParameter

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/IMP_ProcessorParameter_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d178835e340" class="table">

<div class="table-title">

Table 1.2. Parameter
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------------------------: | :-------------------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Importar os Paramêtros do Processo |                ID                 |                    |                                 |                                                  |                                          |                                                                                                                                              |
|              Empresa               |           Tabela Direta           | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Organização             |           Tabela Direta           |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Importar Processo          |           Tabela Direta           |                    | impprocessor\_impprocessorparam |                                                  |                                          |                                                                                                                                              |
|           Chave de Busca           |       Texto Curto (String)        |                    |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                Nome                |       Texto Curto (String)        |                    |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|             Descrição              |       Texto Curto (String)        |                    |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|               Ativo                |              Sim-Não              |       ('Y')        |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Comentário/Ajuda          | Texto Médio (até 2000 caracteres) |                    |                                 |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|         Valor de Parâmetro         |       Texto Curto (String)        |                    |                                 |                                                  |                                          |                                                                                                                                              |
|    IMP\_ProcessorParameter\_UU     |       Texto Curto (String)        |                    |                                 |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d178835e525" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Log - IMP\_ProcessorLog

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d178835e532" class="table">

<div class="table-title">

Table 1.3. Log
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             |   Valores (Padrão)   |       Chave restritiva        |                Regra de validação                |                Descrição                 |                              Comentário/Ajuda                               |
| :-----------------------: | :-------------------------------: | :------------------: | :---------------------------: | :----------------------------------------------: | :--------------------------------------: | :-------------------------------------------------------------------------: |
| Importe o Log do Processo |                ID                 |                      |                               |                                                  |                                          |                                                                             |
|          Empresa          |           Tabela Direta           | (@\#AD\_Client\_ID@) |                               |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                             (ver o mesmo acima)                             |
|        Organização        |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                               | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                             (ver o mesmo acima)                             |
|     Importar Processo     |           Tabela Direta           |                      | impprocessor\_impprocessorlog |                                                  |                                          |                                                                             |
|           Ativo           |              Sim-Não              |        ('Y')         |                               |                                                  |    (semelhante ao primeiro relatório)    |                             (ver o mesmo acima)                             |
|         Descrição         |       Texto Curto (String)        |                      |                               |                                                  | Optional short description of the record |                 A description is limited to 255 characters.                 |
|     Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                      |                               |                                                  |             Comment or Hint              | The Help field contains a hint, comment or help about the use of this item. |
|      Dados Binários       |              Binário              |                      |                               |                                                  |               Binary Data                |                    The Binary field stores binary data.                     |
|           Erro            |              Sim-Não              |        ('Y')         |                               |                                                  |    An Error occurred in the execution    |                                                                             |
|        Referência         |       Texto Curto (String)        |                      |                               |                                                  |        Reference for this record         |             The Reference displays the source document number.              |
|          Resumo           | Texto Médio (até 2000 caracteres) |                      |                               |                                                  |     Textual summary of this request      |     The Summary allows free form text entry of a recap of this request.     |
|     Texto de Mensagem     | Texto Médio (até 2000 caracteres) |                      |                               |                                                  |               Text Message               |                                                                             |
|   IMP\_ProcessorLog\_UU   |       Texto Curto (String)        |                      |                               |                                                  |                                          |                                                                             |

</div>

</div>

  

</div>
