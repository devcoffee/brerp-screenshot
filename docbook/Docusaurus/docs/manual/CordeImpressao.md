---
title: "Cor de Impressão"
id: CordeImpressao
---
<div id="d38222e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Cor de Impressão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Cor de Impressão -
    AD\_PrintColor](#d38222e22)</span>
  - <span class="section">[2. Tabela: Translation -
    AD\_PrintColor\_Trl](#d38222e182)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Cores de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span>Cor utilizada para
impressão

<span class="emphasis"> *Criado em:* </span>2002-07-11 18:51:42.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d38222e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Cor de Impressão - AD\_PrintColor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PrintColor_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento das Cores de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span> Cor utilizada para
impressão

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d38222e39" class="table">

<div class="table-title">

Table 1.1. Print Color
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Cor de Impressão   |          ID          |                      |                  |                                                  |  Color used for printing and display  |                                                     Colors used for printing and display                                                     |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Padrão        |       Sim-Não        |                      |                  |                                                  |             Default value             |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| Código de Validação | Texto Curto (String) |                      |                  |                                                  |            Validation Code            |                                    The Validation Code displays the date, time and message of the error.                                     |
| AD\_PrintColor\_UU  | Texto Curto (String) |                      |                  |                                                  |                                       |                                                                                                                                              |

</div>

</div>

  

<div id="d38222e182" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Translation - AD\_PrintColor\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PrintColor_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Print Color

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d38222e195" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   |       Chave restritiva        |                                  Regra de validação                                   |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :------------------: | :---------------------------: | :-----------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |   ADClient\_ADPrintColorTrl   | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |                      |    ADOrg\_ADPrintColorTrl     |                                                                                       |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
| Cor de Impressão |       Procurar       |                      | ADPrintColor\_ADPrintColorTrl |                                                                                       |  Color used for printing and display  |                                                     Colors used for printing and display                                                     |
|      Idioma      |        Tabela        |     AD\_Language     |  ADLanguage\_ADPrintColorTrl  |                                                                                       |       Language for this entity        |                                    The Language identifies the language to use for display and formatting                                    |
|      Ativo       |       Sim-Não        |         (Y)          |                               |                                                                                       |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|    Traduzida     |       Sim-Não        |         (N)          |                               |                                                                                       |       This column is translated       |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome       | Texto Curto (String) |                      |                               |                                                                                       | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |

</div>

</div>

  

</div>
