---
title: "Tabela de Impostos do IBPT"
id: TabeladeImpostosdoIBPT
---
<div id="d237897e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tabela de Impostos do IBPT

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tabela de Impostos do IBPT -
    COF\_C\_IBPTax](#d237897e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-12-29 17:50:45.0

<span class="emphasis">*Atualizado em:* </span>2015-12-29 17:50:57.0

![](/img/manual/TabeladeImpostosdoIBPT.png)

<div id="d237897e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tabela de Impostos do IBPT - COF\_C\_IBPTax

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_IBPTax_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d237897e32" class="table">

<div class="table-title">

Table 1.1. Tabela de Impostos do IBPT
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      |   Valores (Padrão)   |  Chave restritiva  |                Regra de validação                |                                                Descrição                                                |                                                               Comentário/Ajuda                                                               |
| :------------------------: | :------------------: | :------------------: | :----------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Tabela de Impostos do IBPT |          ID          |                      |                    |                                                  |                                                                                                         |                                                                                                                                              |
|          Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                                   (semelhante ao primeiro relatório)                                    |                                                             (ver o mesmo acima)                                                              |
|        Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                   (semelhante ao primeiro relatório)                                    |                                                             (ver o mesmo acima)                                                              |
|           Ativo            |       Sim-Não        |         (Y)          |                    |                                                  |                                   (semelhante ao primeiro relatório)                                    |                                                             (ver o mesmo acima)                                                              |
|           Versão           | Texto Curto (String) |                      |                    |                                                  |                                     Version of the table definition                                     |                                         The Version indicates the version of this table definition.                                          |
|           Região           |        Tabela        |      C\_Region       |                    |           C\_Region.C\_Country\_ID=139           |                                    Identifies a geographical Region                                     |                                           The Region identifies a unique Region for this Country.                                            |
|            NCM             |       Procurar       |                      | LBRNCM\_COFCIBPTax |                                                  |                                       Primary key table LBR\_NCM                                        | \< a href="http://www4.receita.fazenda.gov.br/simulador/PesquisarNCM.jsp" target="\_blank"\> Pesquisar NCM\< /a\> Primary key table LBR\_NCM |
|        COF\_NBS\_ID        |       Procurar       |  (@LBR\_NCM\_ID@0)   | COFNBS\_COFCIBPTax |                                                  | Nomenclatura Brasileira de Serviços, Intangíveis e Outras Operações Que Produzam Variação no Patrimônio |                                                                                                                                              |
|       Chave de Busca       | Texto Curto (String) |                      |                    |                                                  |                                   (semelhante ao primeiro relatório)                                    |                                                             (ver o mesmo acima)                                                              |
|        Válido desde        |         Data         |                      |                    |                                                  |                               Valid from including this date (first day)                                |                                         The Valid From date indicates the first day of a date range                                          |
|         Válido até         |         Data         |                      |                    |                                                  |                                 Valid to including this date (last day)                                 |                                           The Valid To date indicates the last day of a date range                                           |
|          Federal           |        Número        |                      |                    |                                                  |                                                                                                         |                                                                                                                                              |
|         Importados         |        Número        |                      |                    |                                                  |                                                                                                         |                                                                                                                                              |
|          Estadual          |        Número        |                      |                    |                                                  |                                                                                                         |                                                                                                                                              |
|         Municipal          |        Número        |                      |                    |                                                  |                                                                                                         |                                                                                                                                              |
|      Fonte dos Dados       | Texto Curto (String) |                      |                    |                                                  |                                                                                                         |                                                                                                                                              |
|         Descrição          | Texto Curto (String) |                      |                    |                                                  |                                Optional short description of the record                                 |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
