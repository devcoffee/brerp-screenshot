---
title: "Ferramenta"
id: Ferramenta
---
<div id="d104536e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ferramenta

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ferramenta -
    COF\_PP\_Ferramenta](#d104536e22)</span>
  - <span class="section">[2. Tabela: Restrições de Uso -
    COF\_PP\_FerramentaRest](#d104536e174)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-19 13:55:26.0

<span class="emphasis">*Atualizado em:* </span>2017-01-19 13:55:26.0

<div id="d104536e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ferramenta - COF\_PP\_Ferramenta

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_PP_Ferramenta_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d104536e31" class="table">

<div class="table-title">

Table 1.1. Ferramenta
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------: | :------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Ferramenta   |          ID          |                      |                         |                                                  |         Primary Key : Ferramenta         |                                                           Primary Key : Ferramenta                                                           |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Chave de Busca | Texto Curto (String) |                      |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Nome      | Texto Curto (String) |                      |                         |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição    | Texto Curto (String) |                      |                         |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|     Ativo      |       Procurar       |                      | AAsset\_COFPPFerramenta |                                                  |  Asset used internally or by customers   |         An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.         |
|     Ativo      |       Sim-Não        |         (Y)          |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d104536e174" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Restrições de Uso - COF\_PP\_FerramentaRest

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d104536e181" class="table">

<div class="table-title">

Table 1.2. Restrições de Uso
Fields

</div>

<div class="table-contents">

|        Nome do campo        |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                                                                          Regra de validação                                                                          |                   Descrição                   |                              Comentário/Ajuda                              |
| :-------------------------: | :-----------: | :------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------: | :------------------------------------------------------------------------: |
| COF\_PP\_FerramentaRest\_ID |      ID       |                      |                                 |                                                                                                                                                                      | Primary Key : Restrições de Uso (Ferramentas) |               Primary Key : Restrições de Uso (Ferramentas)                |
|           Empresa           | Tabela Direta | (@\#AD\_Client\_ID@) |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |      (semelhante ao primeiro relatório)       |                            (ver o mesmo acima)                             |
|         Organização         | Tabela Direta |  (@\#AD\_Org\_ID@)   |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |      (semelhante ao primeiro relatório)       |                            (ver o mesmo acima)                             |
|         Ferramenta          | Tabela Direta |                      | COFPPFerramenta\_COFPPFerrament |                                                                                                                                                                      |           Primary Key : Ferramenta            |                          Primary Key : Ferramenta                          |
|          Recursos           | Tabela Direta |                      | COFPPRecursos\_COFPPFerramentaR |                                                                                                                                                                      |            Primary Key : Recursos             |                           Primary Key : Recursos                           |
|           Produto           |   Procurar    |                      |  MProduct\_COFPPFerramentaRest  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |            Product, Service, Item             | Identifies an item which is either purchased or sold in this organization. |
|       Tipo do Produto       | Tabela Direta |                      | COFProductType\_COFPPFerramenta |                                                                                                                                                                      |          Primary Key : Product Type           |                         Primary Key : Product Type                         |
|      Classe do Produto      | Tabela Direta |                      | COFProductClass\_COFPPFerrament |                                                                                                                                                                      |          Primary Key : Product Class          |                        Primary Key : Product Class                         |
|      Grupo do Produto       | Tabela Direta |                      | COFProductGroup\_COFPPFerrament |                                                                                                                                                                      |          Primary Key : Product Group          |                        Primary Key : Product Group                         |
|            Ativo            |    Sim-Não    |         (Y)          |                                 |                                                                                                                                                                      |      (semelhante ao primeiro relatório)       |                            (ver o mesmo acima)                             |

</div>

</div>

  

</div>
