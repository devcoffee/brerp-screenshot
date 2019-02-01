---
title: "Gerar Lançamentos Contábeis"
id: GerarLancamentosContabeis
---
<div id="d109336e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Gerar Lançamentos Contábeis

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: GL Journal Generator -
    GL\_JournalGenerator](#d109336e23)</span>
  - <span class="section">[2. Tabela: Gerador de Linha -
    GL\_JournalGeneratorLine](#d109336e278)</span>
  - <span class="section">[3. Tabela: Gerador de Origem -
    GL\_JournalGeneratorSource](#d109336e583)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-09-24 12:16:25.0

<span class="emphasis">*Atualizado em:* </span>2012-09-24 12:16:25.0

![](/img/manual/GerarLancamentosContabeis.png)

<div id="d109336e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: GL Journal Generator - GL\_JournalGenerator

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/GL_JournalGenerator_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d109336e32" class="table">

<div class="table-title">

Table 1.1. GL Journal Generator
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |                           Valores (Padrão)                            |        Chave restritiva         |                                                                                               Regra de validação                                                                                               |                   Descrição                   |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :-------------------------------: | :-------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Gerador de Razão     |                ID                 |                                                                       |                                 |                                                                                                                                                                                                                |                                               |                                                                                                                                              |
|         Empresa          |           Tabela Direta           |                         (@\#AD\_Client\_ID@)                          |                                 |                                                                                       AD\_Client.AD\_Client\_ID \< \> 0                                                                                        |      (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|       Organização        |           Tabela Direta           |                           (@\#AD\_Org\_ID@)                           |                                 |                                                                                (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                |      (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|           Nome           |       Texto Curto (String)        |                                                                       |                                 |                                                                                                                                                                                                                |     Alphanumeric identifier of the entity     | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         |       Texto Curto (String)        |                                                                       |                                 |                                                                                                                                                                                                                |   Optional short description of the record    |                                                 A description is limited to 255 characters.                                                  |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                                                                       |                                 |                                                                                                                                                                                                                |                Comment or Hint                |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|    Tipo de Documento     |           Tabela Direta           |                                                                       |  cdoctype\_qssjournalgenerator  |                                                                 C\_DocType.DocBaseType='GLJ' AND C\_DocType.AD\_Org\_ID IN (0, @AD\_Org\_ID@)                                                                  |            Document type or rules             |                                     The Document Type determines document sequence and processing rules                                      |
| Categoria de Razão Geral |           Tabela Direta           |                         (@GL\_Category\_ID@)                          | glcategory\_qssjournalgenerator |                                                                                                      null                                                                                                      |            General Ledger Category            |                          The General Ledger Category is an optional, user defined method of grouping journal lines.                          |
|    Tipo de Lançamento    |               Lista               | Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A) |                                 |                                                                                                                                                                                                                | The type of posted amount for the transaction |            The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.             |
|     Esquema Contábil     |           Tabela Direta           |                        (@$C\_AcctSchema\_ID@)                         | cacctschema\_qssjournalgenerato |                                                                                                                                                                                                                |             Rules for accounting              |                   An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                    |
|     Conta Ajuste DR      |              Tabela               |                         C\_ElementValue (trx)                         | celementvalueadjustdr\_qssjourn | EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='AC' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@) AND C\_ElementValue.IsActive='Y' |                                               |                                                                                                                                              |
|     Ajustar Conta CR     |              Tabela               |                         C\_ElementValue (trx)                         | celementvalueadjustcr\_qssjourn | EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='AC' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@) AND C\_ElementValue.IsActive='Y' |                                               |                                                                                                                                              |
|   Generate GL Journal    |               Botão               |                                                                       |                                 |                                                                                                                                                                                                                |                                               |                                                                                                                                              |
|          Ativo           |              Sim-Não              |                                  (Y)                                  |                                 |                                                                                                                                                                                                                |      (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
| GL\_JournalGenerator\_UU |       Texto Curto (String)        |                                                                       |                                 |                                                                                                                                                                                                                |                                               |                                                                                                                                              |

</div>

</div>

  

<div id="d109336e278" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Gerador de Linha - GL\_JournalGeneratorLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/GL_JournalGeneratorLine_data)

<span class="emphasis">*Coluna linkada:* </span> GL Journal Generator

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d109336e291" class="table">

<div class="table-title">

Table 1.2. Generator Line
Fields

</div>

<div class="table-contents">

|        Nome do campo         |            Referência             |                                                              Valores (Padrão)                                                              |        Chave restritiva         |                                                                                               Regra de validação                                                                                               |                       Descrição                       |                                                Comentário/Ajuda                                                 |
| :--------------------------: | :-------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|       Gerador de Linha       |                ID                 |                                                                                                                                            |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|           Empresa            |           Tabela Direta           |                                                            (@\#AD\_Client\_ID@)                                                            |                                 |                                                                                       AD\_Client.AD\_Client\_ID \< \> 0                                                                                        |          (semelhante ao primeiro relatório)           |                                               (ver o mesmo acima)                                               |
|         Organização          |           Tabela Direta           |                                                             (@\#AD\_Org\_ID@)                                                              |                                 |                                                                                (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                |          (semelhante ao primeiro relatório)           |                                               (ver o mesmo acima)                                               |
|       Gerador de Razão       |           Tabela Direta           |                                                                                                                                            | qssjournalgenerator\_qssjournal |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|          Seqüência           |              Inteiro              | (@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM GL\_JournalGeneratorLine WHERE GL\_JournalGenerator\_ID=@GL\_JournalGenerator\_ID@) |                                 |                                                                                                                                                                                                                | Method of ordering records; lowest number comes first |                                   The Sequence indicates the order of records                                   |
|          Descrição           |       Texto Curto (String)        |                                                                                                                                            |                                 |                                                                                                                                                                                                                |       Optional short description of the record        |                                   A description is limited to 255 characters.                                   |
|       Comentário/Ajuda       | Texto Médio (até 2000 caracteres) |                                                                                                                                            |                                 |                                                                                                                                                                                                                |                    Comment or Hint                    |                   The Help field contains a hint, comment or help about the use of this item.                   |
|           Conta DR           |              Tabela               |                                                           C\_ElementValue (trx)                                                            | celementvaluedr\_qssjournalgene | EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='AC' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@) AND C\_ElementValue.IsActive='Y' |                                                       |                                                                                                                 |
|           Conta CR           |              Tabela               |                                                           C\_ElementValue (trx)                                                            | celementvaluecr\_qssjournalgene | EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='AC' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@) AND C\_ElementValue.IsActive='Y' |                                                       |                                                                                                                 |
|     Type of BP Dimension     |               Lista               |                                                             Column Fixed Same                                                              |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|     Parceiro de Negócios     |             Procurar              |                                                             C\_BPartner (Trx)                                                              | cbpartner\_qssjournalgeneratorl |                                                                                                                                                                                                                |             Identifies a Business Partner             | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|         Coluna do BP         |       Texto Curto (String)        |                                                                                                                                            |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|        Mesmo Produto         |              Sim-Não              |                                                                    (N)                                                                     |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|   Copie Todas as Dimensões   |              Sim-Não              |                                                                    (N)                                                                     |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|     Valor Multiplicador      |              Número               |                                                                    (1)                                                                     |                                 |                                                                                                                                                                                                                |     Multiplier Amount for generating commissions      |  The Multiplier Amount indicates the amount to multiply the total amount generated by this commission run by.   |
|   Fator de Arredondamento    |              Inteiro              |                                                                    (0)                                                                     |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |
|            Ativo             |              Sim-Não              |                                                                    (Y)                                                                     |                                 |                                                                                                                                                                                                                |          (semelhante ao primeiro relatório)           |                                               (ver o mesmo acima)                                               |
| GL\_JournalGeneratorLine\_UU |       Texto Curto (String)        |                                                                                                                                            |                                 |                                                                                                                                                                                                                |                                                       |                                                                                                                 |

</div>

</div>

  

<div id="d109336e583" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Gerador de Origem - GL\_JournalGeneratorSource

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/GL_JournalGeneratorSource_data)

<span class="emphasis">*Coluna linkada:* </span> Generator Line

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d109336e596" class="table">

<div class="table-title">

Table 1.3. Generator Source
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |   Valores (Padrão)    |        Chave restritiva         |                                                                                               Regra de validação                                                                                               |                  Descrição                   |                                               Comentário/Ajuda                                               |
| :----------------------------: | :-------------------------------: | :-------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------: | :----------------------------------------------------------------------------------------------------------: |
|        Gerador de Fonte        |                ID                 |                       |                                 |                                                                                                                                                                                                                |                                              |                                                                                                              |
|            Empresa             |           Tabela Direta           | (@\#AD\_Client\_ID@)  |                                 |                                                                                       AD\_Client.AD\_Client\_ID \< \> 0                                                                                        |      (semelhante ao primeiro relatório)      |                                             (ver o mesmo acima)                                              |
|          Organização           |           Tabela Direta           |   (@\#AD\_Org\_ID@)   |                                 |                                                                                (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                                |      (semelhante ao primeiro relatório)      |                                             (ver o mesmo acima)                                              |
|        Gerador de Linha        |           Tabela Direta           |                       | qssjournalgeneratorline\_qssjou |                                                                                                                                                                                                                |                                              |                                                                                                              |
|       Elemento de Contas       |              Tabela               | C\_ElementValue (all) | celementvalue\_qssjournalgenera | EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='AC' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@) AND C\_ElementValue.IsActive='Y' |               Account Element                |                       Account Elements can be natural accounts or user defined values.                       |
|    Categoria de Razão Geral    |           Tabela Direta           |                       | glcategory\_gljournalgenerators |                                                                                                                                                                                                                |           General Ledger Category            |          The General Ledger Category is an optional, user defined method of grouping journal lines.          |
|      Valor Multiplicador       |              Número               |          (1)          |                                 |                                                                                                                                                                                                                | Multiplier Amount for generating commissions | The Multiplier Amount indicates the amount to multiply the total amount generated by this commission run by. |
|    Fator de Arredondamento     |              Inteiro              |                       |                                 |                                                                                                                                                                                                                |                                              |                                                                                                              |
|        Comentário/Ajuda        | Texto Médio (até 2000 caracteres) |                       |                                 |                                                                                                                                                                                                                |               Comment or Hint                |                 The Help field contains a hint, comment or help about the use of this item.                  |
|             Ativo              |              Sim-Não              |          (Y)          |                                 |                                                                                                                                                                                                                |      (semelhante ao primeiro relatório)      |                                             (ver o mesmo acima)                                              |
| GL\_JournalGeneratorSource\_UU |       Texto Curto (String)        |                       |                                 |                                                                                                                                                                                                                |                                              |                                                                                                              |

</div>

</div>

  

</div>
