---
title: "Tipo da Organização"
id: TipodaOrganizacao
---
<div id="d240318e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo da Organização

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Org. -
    AD\_OrgType](#d240318e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Tipos de
Organização

<span class="emphasis">*Comentário/Ajuda:* </span>O Tipo da Organização
permite a você classificar as suas organizações por categorias para fins
de relatórios

<span class="emphasis"> *Criado em:* </span>2004-02-19 10:49:23.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/TipodaOrganizacao.png)

<div id="d240318e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Org. - AD\_OrgType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_OrgType_data)

<span class="emphasis">*Descrição:*</span> O Tipo da Organização permite
a você classificar as suas organizações por categorias

<span class="emphasis">*Comentário/Ajuda:* </span> O Tipo da Organização
permite a você classificar as suas organizações por categorias para fins
de relatórios

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240318e40" class="table">

<div class="table-title">

Table 1.1. Org Type
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Tipo da Organização |          ID          |                      |                         |                                                  |            Organization Type             |                             Organization Type allows you to categorize your organizations for reporting purposes                             |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                         |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                         |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      | Texto Curto (String) |                      |                         |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |       Sim-Não        |         (Y)          |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Cor de Impressão   |    Tabela Direta     |                      | adprintcolor\_adorgtype |                                                  |   Color used for printing and display    |                                                     Colors used for printing and display                                                     |
|   AD\_OrgType\_UU   | Texto Curto (String) |                      |                         |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
