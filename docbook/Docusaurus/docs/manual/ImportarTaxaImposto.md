---
title: "Importar Taxa (Imposto)"
id: ImportarTaxaImposto
---
<div id="d118822e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Taxa (Imposto)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Importar -
    I\_TaxImport](#d118822e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-07-17 13:56:10.0

<span class="emphasis">*Atualizado em:* </span>2013-07-17 13:56:10.0

![](/img/manual/ImportarTaxaImposto.png)

<div id="d118822e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Importar - I\_TaxImport

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d118822e30" class="table">

<div class="table-title">

Table 1.1. Importar
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                    Descrição                    |                                                                                                                 Comentário/Ajuda                                                                                                                 |
| :---------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    I\_TaxImport\_ID     |          ID          |                      |                  |                                                  |            Primary Key : Tax Import             |                                                                                                             Primary Key : Tax Import                                                                                                             |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)        |                                                                                                               (ver o mesmo acima)                                                                                                                |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)        |                                                                                                               (ver o mesmo acima)                                                                                                                |
|          Ativo          |       Sim-Não        |         (Y)          |                  |                                                  |       (semelhante ao primeiro relatório)        |                                                                                                               (ver o mesmo acima)                                                                                                                |
|     Chave de Busca      | Texto Curto (String) |                      |                  |                                                  |       (semelhante ao primeiro relatório)        |                                                                                                               (ver o mesmo acima)                                                                                                                |
|         Ex TIPI         | Texto Curto (String) |                      |                  |                                                  |                                                 |                                                                                                                                                                                                                                                  |
|  Nome da Tabela no BD   |       Inteiro        |                      |                  |                                                  |        Name of the table in the database        |                                                                                          The DB Table Name indicates the name of the table in database.                                                                                          |
|        Descrição        |      Memorando       |                      |                  |                                                  |    Optional short description of the record     |                                                                                                   A description is limited to 255 characters.                                                                                                    |
| Alíquota de Importacao  |        Número        |         (0)          |                  |                                                  |                                                 | A alíquota de produtos importados é utilizada quando o primeiro caractere que identifica a Origem da Mercadoria ou Serviço, utilizado em conjunto com a CST – Código de Situação Tributária, do cadastro do produto for diferente de: 0, 3, 4, 5 |
|    Alíquota Nacional    |        Número        |         (0)          |                  |                                                  | Alíquotas para os produtos e serviços nacionais |                                                                                                 Alíquotas para os produtos e serviços nacionais                                                                                                  |
|     Aliquota do IPI     |        Número        |         (0)          |                  |                                                  |                                                 |                                                                                   Informar os campos O10 e O13 se o cálculo do IPI for por alíquota. Ref.: O13                                                                                   |
|           NCM           |    Tabela Direta     |                      |                  |                                                  |           Primary key table LBR\_NCM            |                                                   \< a href="http://www4.receita.fazenda.gov.br/simulador/PesquisarNCM.jsp" target="\_blank"\> Pesquisar NCM\< /a\> Primary key table LBR\_NCM                                                   |
|    Aliquota de ICMS     |        Número        |         (0)          |                  |                                                  |                Alíquota de ICMS                 |                                                                                                                                                                                                                                                  |
|     Aliquota do PIS     |        Número        |         (0)          |                  |                                                  |                                                 |                                                                                       Informar os campos R04 e R05 para cálculo do PIS em valor. Ref.: R05                                                                                       |
|   Aliquota da COFINS    |        Número        |         (0)          |                  |                                                  |       Alíquota da COFINS (em percentual)        |                                                                       Informar os campos T02 e T03 para cálculo da COFINS Substituição Tributária em percentual. Ref: T02                                                                        |
| Importar\_Taxa(Imposto) |        Botão         |                      |                  |                                                  |                                                 |                                                                                                                                                                                                                                                  |
|     Núm. da Versão      | Texto Curto (String) |                      |                  |                                                  |                 Version Number                  |                                                                                                                                                                                                                                                  |
|        Importado        |       Sim-Não        |                      |                  |                                                  |         Has this import been processed          |                                                                                       The Imported check box indicates if this import has been processed.                                                                                        |
|       Processado        |       Sim-Não        |                      |                  |                                                  |         The document has been processed         |                                                                                       The Processed checkbox indicates that a document has been processed.                                                                                       |

</div>

</div>

  

</div>
