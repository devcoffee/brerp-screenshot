---
title: "Grupo de Paises"
id: GrupodePaises
---
<div id="d111406e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Paises

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Country Group -
    C\_CountryGroup](#d111406e23)</span>
  - <span class="section">[2. Tabela: Country -
    C\_CountryGroupCountry](#d111406e201)</span>
  - <span class="section">[3. Tabela: Translation -
    C\_CountryGroup\_Trl](#d111406e355)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2014-08-07 18:38:48.0

<span class="emphasis">*Atualizado em:* </span>2014-08-07 18:38:48.0

![](/img/manual/GrupodePaises.png)

<div id="d111406e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Country Group - C\_CountryGroup

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d111406e30" class="table">

<div class="table-title">

Table 1.1. Country Group
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Country Group   |                ID                 |                      |                         |                                                  |                                          |                                                                                                                                              |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) | ADClient\_CCountryGroup |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |  ADOrg\_CCountryGroup   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca  |       Texto Curto (String)        |                      |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Ativo       |              Sim-Não              |         (Y)          |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                         |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                         |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                         |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Do dia      |               Data                |                      |                         |                                                  |        Starting date for a range         |                                            The Date From indicates the starting date of a range.                                             |
|      Ao dia      |               Data                |                      |                         |                                                  |         End date of a date range         |                                          The Date To indicates the end date of a range (inclusive)                                           |

</div>

</div>

  

<div id="d111406e201" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Country - C\_CountryGroupCountry

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Country Group

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d111406e212" class="table">

<div class="table-title">

Table 1.2. Country
Fields

</div>

<div class="table-contents">

|      Nome do campo       |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                          Comentário/Ajuda                                          |
| :----------------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------: |
| Country on Country Group |      ID       |                      |                                 |                                                  |                                    |                                                                                                    |
|         Empresa          | Tabela Direta | (@\#AD\_Client\_ID@) | ADClient\_CCountryGroupCountry  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                        (ver o mesmo acima)                                         |
|       Organização        | Tabela Direta |  (@\#AD\_Org\_ID@)   |   ADOrg\_CCountryGroupCountry   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                        (ver o mesmo acima)                                         |
|      Country Group       | Tabela Direta |                      | CCountryGroup\_CCountryGroupCou |                                                  |                                    |                                                                                                    |
|           País           | Tabela Direta |                      | CCountry\_CCountryGroupCountry  |                                                  |              Country               | The Country defines a Country. Each Country must be defined before it can be used in any document. |
|          Do dia          |     Data      |                      |                                 |                                                  |     Starting date for a range      |                       The Date From indicates the starting date of a range.                        |
|          Ao dia          |     Data      |                      |                                 |                                                  |      End date of a date range      |                     The Date To indicates the end date of a range (inclusive)                      |
|          Ativo           |    Sim-Não    |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                        (ver o mesmo acima)                                         |

</div>

</div>

  

<div id="d111406e355" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Translation - C\_CountryGroup\_Trl

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Country Group

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d111406e366" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------: | :------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa    |    Tabela Direta     | (@AD\_Client\_ID@) |   ADClient\_CCountryGroupTrl    |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização  |    Tabela Direta     |  (@AD\_Org\_ID@)   |     ADOrg\_CCountryGroupTrl     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Nome      | Texto Curto (String) |                    |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição   | Texto Curto (String) |                    |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Idioma     |        Tabela        |    AD\_Language    |  ADLanguage\_CCountryGroupTrl   |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
| Country Group |    Tabela Direta     |                    | CCountryGroup\_CCountryGroupTrl |                                                  |                                          |                                                                                                                                              |
|   Traduzida   |       Sim-Não        |                    |                                 |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|     Ativo     |       Sim-Não        |        (Y)         |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
