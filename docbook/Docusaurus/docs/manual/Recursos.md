---
title: "Recursos"
id: Recursos
---
<div id="d193070e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Recursos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Recursos -
    COF\_PP\_Recursos](#d193070e22)</span>
  - <span class="section">[2. Tabela: Configuração de Recurso -
    COF\_PP\_RecursosConfig](#d193070e277)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-19 11:05:23.0

<span class="emphasis">*Atualizado em:* </span>2017-01-19 11:05:23.0

<div id="d193070e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Recursos - COF\_PP\_Recursos

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_PP_Recursos_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d193070e31" class="table">

<div class="table-title">

Table 1.1. Recursos
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |               Valores (Padrão)                |        Chave restritiva         |                Regra de validação                |                     Descrição                      |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :-------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        Recursos         |          ID          |                                               |                                 |                                                  |               Primary Key : Recursos               |                                                            Primary Key : Recursos                                                            |
|         Empresa         |    Tabela Direta     |             (@\#AD\_Client\_ID@)              |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |         (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |               (@\#AD\_Org\_ID@)               |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |         (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
|     Chave de Busca      | Texto Curto (String) |                                               |                                 |                                                  |         (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
|          Nome           | Texto Curto (String) |                                               |                                 |                                                  |       Alphanumeric identifier of the entity        | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        | Texto Curto (String) |                                               |                                 |                                                  |      Optional short description of the record      |                                                 A description is limited to 255 characters.                                                  |
|     Tipo do Recurso     |        Lista         | Máquinas e Equipamentos Mão de Obra Terceiros |                                 |                                                  |                                                    |                                                                                                                                              |
|          Ativo          |       Procurar       |                                               |      AAsset\_COFPPRecursos      |                                                  |       Asset used internally or by customers        |         An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.         |
|   Recurso Substituto    |        Tabela        |             COF\_PP\_Recursos\_ID             | COFPPRecursoSubstituto\_COFPPRe |                                                  |                                                    |                                                                                                                                              |
| Capacidade Uso em Horas |        Número        |                     (24)                      |                                 |                                                  |              Horas de uso do recurso               |                                                                                                                                              |
|    Ultima Manutenção    |         Data         |                                               |                                 |                                                  |         Indica a data da última manutenção         |                                                                                                                                              |
|   Centro de Trabalho    |        Tabela        |     COF\_PP\_CentroTrabalho name + value      | COFPPCentroTrabalho\_COFPPRecur |                                                  |           Primary Key : Centro Trabalho            |                                                        Primary Key : Centro Trabalho                                                         |
|     Centro de Custo     |        Tabela        |              Account\_ID - User1              |      User1\_COFPPRecursos       |                                                  |           User defined list element \#1            |                 The user defined element displays the optional elements that have been defined for this account combination.                 |
|          Ativo          |       Sim-Não        |                      (Y)                      |                                 |                                                  |         (semelhante ao primeiro relatório)         |                                                             (ver o mesmo acima)                                                              |
|        Bloqueado        |       Sim-Não        |                                               |                                 |                                                  | Indica se o recurso está bloqueado ou não para uso |                                                                                                                                              |

</div>

</div>

  

<div id="d193070e277" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Configuração de Recurso - COF\_PP\_RecursosConfig

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_PP_RecursosConfig_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d193070e286" class="table">

<div class="table-title">

Table 1.2. Configuração de Recurso
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |                                                            Valores (Padrão)                                                             |        Chave restritiva         |                                                                          Regra de validação                                                                          |                                   Descrição                                    |                                                 Comentário/Ajuda                                                 |
| :-------------------------: | :-------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------: |
| COF\_PP\_RecursosConfig\_ID |                ID                 |                                                                                                                                         |                                 |                                                                                                                                                                      |                     Primary Key : Configuração de Recurso                      |                                      Primary Key : Configuração de Recurso                                       |
|           Empresa           |           Tabela Direta           |                                                          (@\#AD\_Client\_ID@)                                                           |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                       (semelhante ao primeiro relatório)                       |                                               (ver o mesmo acima)                                                |
|         Organização         |           Tabela Direta           |                                                            (@\#AD\_Org\_ID@)                                                            |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                       (semelhante ao primeiro relatório)                       |                                               (ver o mesmo acima)                                                |
|         Linha Núm.          |              Inteiro              | (@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM COF\_PP\_RecursosConfig WHERE COF\_PP\_Recursos\_ID=@COF\_PP\_Recursos\_ID@) |                                 |                                                                                                                                                                      |                         Unique line for this document                          | Indicates the unique line for a document. It will also control the display order of the lines within a document. |
|          Recursos           |              Tabela               |                                                          COF\_PP\_Recursos\_ID                                                          | COFPPRecursos\_COFPPRecursosCon |                                                                                                                                                                      |                             Primary Key : Recursos                             |                                              Primary Key : Recursos                                              |
|         Ferramenta          |              Tabela               |                                                    COF\_PP\_Ferramenta name + value                                                     | COFPPFerramenta\_COFPPRecursosC |                                                                                                                                                                      |                            Primary Key : Ferramenta                            |                                             Primary Key : Ferramenta                                             |
|           Produto           |             Procurar              |                                                                                                                                         |  MProduct\_COFPPRecursosConfig  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                             Product, Service, Item                             |                    Identifies an item which is either purchased or sold in this organization.                    |
|       Tipo do Produto       |              Tabela               |                                                       COF\_ProductType Name Value                                                       | COFProductType\_COFPPRecursosCo |                                                                                                                                                                      |                           Primary Key : Product Type                           |                                            Primary Key : Product Type                                            |
|      Classe do Produto      |              Tabela               |                                                      COF\_ProductClass Value Name                                                       | COFProductClass\_COFPPRecursosC |                                                                                                                                                                      |                          Primary Key : Product Class                           |                                           Primary Key : Product Class                                            |
|      Grupo do Produto       |              Tabela               |                                                      COF\_ProductGroup Value Name                                                       | COFProductGroup\_COFPPRecursosC |                                                                                                                                                                      |                          Primary Key : Product Group                           |                                           Primary Key : Product Group                                            |
|         Instruções          | Texto Médio (até 2000 caracteres) |                                                                                                                                         |                                 |                                                                                                                                                                      | Instruções para a execução da O.P/Plano Mestre de Produção/Roteiro de Produção |                  Instruções para a execução da O.P/Plano Mestre de Produção/Roteiro de Produção                  |
|            Ativo            |              Sim-Não              |                                                                   (Y)                                                                   |                                 |                                                                                                                                                                      |                       (semelhante ao primeiro relatório)                       |                                               (ver o mesmo acima)                                                |

</div>

</div>

  

</div>
