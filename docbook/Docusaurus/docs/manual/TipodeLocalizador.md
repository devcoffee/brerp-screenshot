---
title: "Tipo de Localizador"
id: TipodeLocalizador
---
<div id="d242658e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Localizador

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Localizador -
    M\_LocatorType](#d242658e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-06-09 18:08:50.0

<span class="emphasis">*Atualizado em:* </span>2015-06-09 18:08:50.0

![](/img/manual/TipodeLocalizador.png)

<div id="d242658e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Localizador - M\_LocatorType

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d242658e30" class="table">

<div class="table-title">

Table 1.1. Locator Type
Fields

</div>

<div class="table-contents">

|          Nome do campo          |            Referência             |   Valores (Padrão)   |    Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------------------: | :-------------------------------: | :------------------: | :--------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|          Locator Type           |                ID                 |                      |                        |                                                  |                                          |                                                                                                                                              |
|             Empresa             |           Tabela Direta           | (@\#AD\_Client\_ID@) | ADClient\_MLocatorType |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Organização           |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |  ADOrg\_MLocatorType   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|              Nome               |       Texto Curto (String)        |                      |                        |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|            Descrição            |       Texto Curto (String)        |                      |                        |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Comentário/Ajuda         | Texto Médio (até 2000 caracteres) |                      |                        |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| Disponível para reabastecimento |              Sim-Não              |         (Y)          |                        |                                                  |                                          |                                                                                                                                              |
|    Disponível para Reservas     |              Sim-Não              |         (Y)          |                        |                                                  |                                          |                                                                                                                                              |
|    Disponível para expedição    |              Sim-Não              |         (Y)          |                        |                                                  |                                          |                                                                                                                                              |
|              Ativo              |              Sim-Não              |         (Y)          |                        |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
