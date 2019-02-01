---
title: "Fonte de Impressão"
id: FontedeImpressao
---
<div id="d106424e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Fonte de Impressão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Fonte de Impressão -
    AD\_PrintFont](#d106424e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Fontes de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span>Fonte utilizada para
impressão

<span class="emphasis"> *Criado em:* </span>2002-07-11 18:57:07.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/FontedeImpressao.png)

<div id="d106424e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Fonte de Impressão - AD\_PrintFont

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PrintFont_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento das Fontes de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span> Fonte utilizada para
impressão

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d106424e40" class="table">

<div class="table-title">

Table 1.1. Print Font
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Fonte de Impressão  |          ID          |                      |                  |                                                  |          Maintain Print Font          |                                                            Font used for printing                                                            |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Padrão        |       Sim-Não        |                      |                  |                                                  |             Default value             |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| Código de Validação | Texto Curto (String) |                      |                  |                                                  |            Validation Code            |                                    The Validation Code displays the date, time and message of the error.                                     |
|  AD\_PrintFont\_UU  | Texto Curto (String) |                      |                  |                                                  |                                       |                                                                                                                                              |

</div>

</div>

  

</div>
