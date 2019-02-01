---
title: "Seqüência de Documento"
id: SequenciadeDocumento
---
<div id="d211395e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Seqüência de Documento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Seqüência -
    AD\_Sequence](#d211395e23)</span>
  - <span class="section">[2. Tabela: Número de Sequência -
    AD\_Sequence\_No](#d211395e460)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Seqüências
de Documento e Sistema

<span class="emphasis">*Comentário/Ajuda:* </span>A janela "Seqüência"
define como os números dos documentos serão seqüenciados. Alterar o modo
que os números de documentos são gerados. Você pode acrescentar um
prefixo ou um sufixo ou alterar o número atual.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/SequenciadeDocumento.png)

<div id="d211395e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Seqüência - AD\_Sequence

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Sequence_data)

<span class="emphasis">*Descrição:*</span> Definição de Seqüência

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Seqüência"
define o sequenciamento numérico a ser usado para os documentos. Estes
também podem incluir um sufixo e/ou prefixo alfabético.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d211395e40" class="table">

<div class="table-title">

Table 1.1. Sequence
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |   Valores (Padrão)   | Chave restritiva |                                     Regra de validação                                      |                                     Descrição                                      |                                                                                                                                                                                                                                                     Comentário/Ajuda                                                                                                                                                                                                                                                      |
| :---------------------------------: | :------------------: | :------------------: | :--------------: | :-----------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Seqüência              |          ID          |                      |                  |                                                                                             |                                 Document Sequence                                  |                                                                                                                                                                                                                           The Sequence defines the numbering sequence to be used for documents.                                                                                                                                                                                                                           |
| Próxima Núm. de Seqüência (Sistema) |       Inteiro        |        (100)         |                  |                                                                                             |                            Next sequence for system use                            |                                                                                                                                                                                                                               This field is for system use only and should not be modified.                                                                                                                                                                                                                               |
|               Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |  sequenceclient  |                              AD\_Client.AD\_Client\_ID \< \> 0                              |                         (semelhante ao primeiro relatório)                         |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|             Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |   sequenceorg    |                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                       |                         (semelhante ao primeiro relatório)                         |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|                Nome                 | Texto Curto (String) |                      |                  |                                                                                             |                       Alphanumeric identifier of the entity                        |                                                                                                                                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                        |
|              Descrição              | Texto Curto (String) |                      |                  |                                                                                             |                      Optional short description of the record                      |                                                                                                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                                                                                                        |
|                Ativo                |       Sim-Não        |         (Y)          |                  |                                                                                             |                         (semelhante ao primeiro relatório)                         |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|           Auto Numeração            |       Sim-Não        |                      |                  |                                                                                             |                        Automatically assign the next number                        |                                                                                                                                                                                                              The Auto Numbering checkbox indicates if the system will assign the next number automatically.                                                                                                                                                                                                               |
|      Usado como ID do Registro      |       Sim-Não        |                      |                  |                                                                                             |                 The document number will be used as the record key                 |                                                                                                                                                                                                            The Used for Record ID checkbox indicates if the document id will be used as the key to the record                                                                                                                                                                                                             |
|          Formato do Valor           | Texto Curto (String) |                      |                  |                                                                                             | Format of the value; Can contain fixed format elements, Variables: "\_lLoOaAcCa09" | \< B\> Validation elements:\< /B\> (Space) any character \_ Space (fixed character) l any Letter a..Z NO space L any Letter a..Z NO space converted to upper case o any Letter a..Z or space O any Letter a..Z or space converted to upper case a any Letters %26 Digits NO space A any Letters %26 Digits NO space converted to upper case c any Letters %26 Digits or space C any Letters %26 Digits or space converted to upper case 0 Digits 0..9 NO space 9 Digits 0..9 or space Example of format "(000)\_000-0000" |
|             Incremento              |       Inteiro        |         (1)          |                  |                                                                                             |                The number to increment the last document number by                 |                                                                                                                                                                                                     The Increment indicates the number to increment the last document number by to arrive at the next sequence number                                                                                                                                                                                                     |
|           Próximo Número            |       Inteiro        |      (1000000)       |                  |                                                                                             |                             The next number to be used                             |                                                                                                                                                                                                                            The Current Next indicates the next number to use for this document                                                                                                                                                                                                                            |
|           Padrão Decimal            | Texto Curto (String) |                      |                  |                                                                                             |                                Java Decimal Pattern                                |                                                                                                                                                                                                                      Option Decimal pattern in Java notation. Examples: 0000 will format 23 to 0023                                                                                                                                                                                                                       |
|               Prefixo               | Texto Curto (String) |                      |                  |                                                                                             |                         Prefix before the sequence number                          |                                                                                                                                                                                                                       The Prefix indicates the characters to print in front of the document number.                                                                                                                                                                                                                       |
|               Sufixo                | Texto Curto (String) |                      |                  |                                                                                             |                              Suffix after the number                               |                                                                                                                                                                                                                           The Suffix indicates the characters to append to the document number.                                                                                                                                                                                                                           |
|        Nível de Organização         |       Sim-Não        |         (N)          |                  |                                                                                             |                 This sequence can be defined for each organization                 |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|           Coluna da Org.            | Texto Curto (String) |                      |                  |                                                                                             |                 Fully qualified Organization column (AD\_Org\_ID)                  |                                                                                                                                                                                                              The Organization Column indicates the organization to be used in calculating this measurement.                                                                                                                                                                                                               |
| Reiniciar a seqüência todos os Anos |       Sim-Não        |                      |                  |                                                                                             |                    Restart the sequence with Start on every 1/1                    |                                                                                                                                                                                    The Restart Sequence Every Year checkbox indicates that the documents sequencing should return to the starting number on the first day of the year.                                                                                                                                                                                    |
|           Coluna de Data            | Texto Curto (String) |                      |                  |                                                                                             |                            Fully qualified date column                             |                                                                                                                                                                                                                      The Date Column indicates the date to be used when calculating this measurement                                                                                                                                                                                                                      |
|   Reiniciar seqüência a cada mês    |       Sim-Não        |         (N)          |                  |                                                                                             |                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|            Núm. Inicial             |       Inteiro        |      (1000000)       |                  | <span class="emphasis">*ReadOnly Logic*</span>: @StartNewYear@=N %26 @IsOrgLevelSequence@=N |                              Starting number/position                              |                                                                                                                                                                                                                 The Start Number indicates the starting position in the line or field number in the line                                                                                                                                                                                                                  |
|           Activate Audit            |       Sim-Não        |                      |                  |                                                                                             |                 Activate Audit Trail of what numbers are generated                 |                                                                                                                                                                                                                The Activate Audit checkbox indicates if an audit trail of numbers generated will be kept.                                                                                                                                                                                                                 |
|                Faixa                |       Sim-Não        |         (N)          |                  |                                                                                             |                         The parameter is a range of values                         |                                                                                                                                                                                                                          The Range checkbox indicates that this parameter is a range of values.                                                                                                                                                                                                                           |
|             Mín. Valor              |       Inteiro        |                      |                  |                                                                                             |                             Minimum Value for a field                              |                                                                                                                                                                                                                            The Minimum Value indicates the lowest allowable value for a field.                                                                                                                                                                                                                            |
|             Máx. Valor              |       Inteiro        |                      |                  |                                                                                             |                             Maximum Value for a field                              |                                                                                                                                                                                                                            The Maximum Value indicates the highest allowable value for a field                                                                                                                                                                                                                            |
|       Controle de Boleto/CNAB       |       Sim-Não        |         (N)          |                  |                                                                                             |                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|          AD\_Sequence\_UU           | Texto Curto (String) |                      |                  |                                                                                             |                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d211395e460" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Número de Sequência - AD\_Sequence\_No

</div>

</div>

</div>

<span class="emphasis">*Lógica de visualização:*</span>
@StartNewYear@='Y' | @IsOrgLevelSequence@=Y

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d211395e471" class="table">

<div class="table-title">

Table 1.2. Sequence No
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      | Valores (Padrão) |     Chave restritiva     |                Regra de validação                |             Descrição              |                           Comentário/Ajuda                            |
| :------------: | :------------------: | :--------------: | :----------------------: | :----------------------------------------------: | :--------------------------------: | :-------------------------------------------------------------------: |
|    Empresa     |    Tabela Direta     |                  |    sequence\_noclient    |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                          |
|  Organização   |    Tabela Direta     |                  |     sequence\_noorg      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                          |
|   Seqüência    |    Tabela Direta     |                  | ad\_sequence\_sequenceno |                                                  |         Document Sequence          | The Sequence defines the numbering sequence to be used for documents. |
|     Ativo      |       Sim-Não        |       (Y)        |                          |                                                  | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                          |
|     AnoMes     | Texto Curto (String) |                  |                          |                                                  |               YYYYMM               |                                                                       |
| Próximo Número |       Inteiro        |                  |                          |                                                  |     The next number to be used     |  The Current Next indicates the next number to use for this document  |

</div>

</div>

  

</div>
