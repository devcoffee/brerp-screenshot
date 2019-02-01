---
title: "Template de Email"
id: TemplatedeEmail
---
<div id="d239764e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Template de Email

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Template de Email -
    COF\_TemplateEmail](#d239764e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-10-23 08:54:55.0

<span class="emphasis">*Atualizado em:* </span>2017-10-23 08:54:55.0

<div id="d239764e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Template de Email - COF\_TemplateEmail

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d239764e29" class="table">

<div class="table-title">

Table 1.1. Template de Email
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :--------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| COF\_TemplateEmail\_UU | Texto Curto (String) |                      |                  |                                                  |                                       |                                                                                                                                              |
|   Template de Email    |          ID          |                      |                  |                                                  |    Primary Key : Template de Email    |                                                       Primary Key : Template de Email                                                        |
|        Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|      Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Chave de Busca     | Texto Curto (String) |                      |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|         Ativo          |       Sim-Não        |         (Y)          |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|          Nome          | Texto Curto (String) |                      |                  |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Mensagem        |         HTML         |                      |                  |                                                  |             EMail Message             |                                                             Message of the EMail                                                             |

</div>

</div>

  

</div>
