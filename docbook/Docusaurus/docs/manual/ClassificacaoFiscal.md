---
title: "Classificação Fiscal"
id: ClassificacaoFiscal
---
<div id="d21301e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Classificação Fiscal

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Classificação Fiscal -
    COF\_C\_TaxClassification](#d21301e22)</span>
  - <span class="section">[2. Tabela: Linhas de Classificação -
    COF\_C\_TaxClassificationLine](#d21301e205)</span>

</div>

<span class="emphasis">*Descrição:* </span> Utilizado para classificação
dos CSTs para enquadrar os documentações Fiscais

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-08-05 15:18:31.0

<span class="emphasis">*Atualizado em:* </span>2015-08-05 15:18:31.0

<div id="d21301e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Classificação Fiscal - COF\_C\_TaxClassification

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_TaxClassification_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d21301e31" class="table">

<div class="table-title">

Table 1.1. Tax Classification
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                 Descrição                  |                      Comentário/Ajuda                       |
| :------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :----------------------------------------: | :---------------------------------------------------------: |
| Classificação Fiscal |          ID          |                      |                                 |                                                  |      Primary Key : Tax Classification      |              Primary Key : Tax Classification               |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|        Ativo         |       Sim-Não        |         (Y)          |                                 |                                                  |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|   Simples Nacional   |       Sim-Não        |        ('N')         |                                 |                                                  |     Is National Simple Classification      |                                                             |
|    Chave de Busca    | Texto Curto (String) |                      |                                 |                                                  |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|     Válido desde     |         Data         |      (@\#Date@)      |                                 |                                                  | Valid from including this date (first day) | The Valid From date indicates the first day of a date range |
|      Válido até      |         Data         |                      |                                 |                                                  |  Valid to including this date (last day)   |  The Valid To date indicates the last day of a date range   |
|       Imposto        |       Procurar       |     LBR\_TaxName     | LBRTaxName\_COFCTaxClassificati |                                                  |       Primary key table LBR\_TaxName       |               Primary key table LBR\_TaxName                |
|    Copiar Linhas     |        Botão         |                      |                                 |                                                  |                                            |                                                             |

</div>

</div>

  

<div id="d21301e205" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linhas de Classificação - COF\_C\_TaxClassificationLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_TaxClassificationLine_data)

<span class="emphasis">*Coluna linkada:* </span>
COF\_C\_TaxClassification\_ID

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d21301e218" class="table">

<div class="table-title">

Table 1.2. Tax Classification Line
Fields

</div>

<div class="table-contents">

|           Nome do campo           |  Referência   |                                                                                                                      Valores (Padrão)                                                                                                                      |        Chave restritiva         |                        Regra de validação                        |                Descrição                 |             Comentário/Ajuda             |
| :-------------------------------: | :-----------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :--------------------------------------------------------------: | :--------------------------------------: | :--------------------------------------: |
| COF\_C\_TaxClassificationLine\_ID |      ID       |                                                                                                                                                                                                                                                            |                                 |                                                                  |  Primary Key : Tax Classification Line   |  Primary Key : Tax Classification Line   |
|       Classificação Fiscal        | Tabela Direta |                                                                                                                                                                                                                                                            | COFCTaxClassification\_COFCTaxC |                                                                  |     Primary Key : Tax Classification     |     Primary Key : Tax Classification     |
|              Empresa              | Tabela Direta |                                                                                                                    (@\#AD\_Client\_ID@)                                                                                                                    |                                 |                AD\_Client.AD\_Client\_ID \< \> 0                 |    (semelhante ao primeiro relatório)    |           (ver o mesmo acima)            |
|            Organização            | Tabela Direta |                                                                                                                     (@\#AD\_Org\_ID@)                                                                                                                      |                                 |         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)         |    (semelhante ao primeiro relatório)    |           (ver o mesmo acima)            |
|               Ativo               |    Sim-Não    |                                                                                                                            (Y)                                                                                                                             |                                 |                                                                  |    (semelhante ao primeiro relatório)    |           (ver o mesmo acima)            |
|         Grupo de Apuração         |    Tabela     |                                                                                                                 COF\_C\_DeterminationGroup                                                                                                                 | COFCDeterminationGroup\_COFCTax | COF\_C\_Determination\_Group.LBR\_TaxName\_ID=@LBR\_TaxName\_ID@ |    Primary Key : Determination Group     |    Primary Key : Determination Group     |
|         Tipo de Operação          |     Lista     |                                                                                                                   0 - Entrada 1 - Saída                                                                                                                    |                                 |                                                                  |                                          |                                          |
|       Tipo de Classificação       |     Lista     | ENTRADA COM CRÉDITO DE IMPOSTO ENTRADA SEM CRÉDITO DE IMPOSTO - ISENTAS OU NÃO TRIBUTADAS ENTRADA SEM CRÉDITO DE IMPOSTO - OUTRAS SAÍDA COM DÉBITO DE IMPOSTO SAIDA SEM DÉBITO DE IMPOSTO - ISENTAS OU NÃO TRIBUTADAS SAIDA SEM DÉBITO DE IMPOSTO - OUTRAS |                                 |                                                                  | Lista para Tipo de Classificação de CFOP | Lista para Tipo de Classificação de CFOP |
|             CST/CSOSN             |   Procurar    |                                                                                                                       LBR\_TaxStatus                                                                                                                       | LBRTaxStatus\_COFCTaxClassifica |        LBR\_TaxStatus.LBR\_TaxName\_ID=@LBR\_TaxName\_ID@        |                                          |                                          |
|               CFOP                |   Procurar    |                                                                                                                         LBR\_CFOP                                                                                                                          | LBRCFOP\_COFCTaxClassificationL |                                                                  |       Primary key table LBR\_CFOP        |       Primary key table LBR\_CFOP        |

</div>

</div>

  

</div>
