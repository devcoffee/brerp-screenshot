---
title: "Atributos de Registros"
id: AtributosdeRegistros
---
<div id="d14122e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Atributos de Registros

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Atributo -
    A\_RegistrationAttribute](#d14122e22)</span>
  - <span class="section">[2. Tabela: Designação de Produto -
    A\_RegistrationProduct](#d14122e239)</span>

</div>

<span class="emphasis">*Descrição:* </span> Atributos de Registros de
Ativos

<span class="emphasis">*Comentário/Ajuda:* </span>Definir os valores
individuais para o Registro de Ativo

<span class="emphasis"> *Criado em:* </span>2004-01-08 21:02:47.0

<span class="emphasis">*Atualizado em:* </span>2012-03-09 15:16:07.0

<div id="d14122e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Atributo - A\_RegistrationAttribute

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Atributo de Registro de Ativo

<span class="emphasis">*Comentário/Ajuda:* </span> Definir os valores
individuais para o Registro de Ativo

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d14122e37" class="table">

<div class="table-title">

Table 1.1. Attribute
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |     Valores (Padrão)     |        Chave restritiva         |                                     Regra de validação                                      |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :--------------------------: | :------------------: | :----------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Atributo de Registro     |          ID          |                          |                                 |                                                                                             |                        Asset Registration Attribute                        |                                                                            Define the individual values for the Asset Registration                                                                            |
|           Empresa            |    Tabela Direta     |   (@\#AD\_Client\_ID@)   |                                 |                              AD\_Client.AD\_Client\_ID \< \> 0                              |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|         Organização          |    Tabela Direta     |    (@\#AD\_Org\_ID@)     |                                 |                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                       |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|             Nome             | Texto Curto (String) |                          |                                 |                                                                                             |                   Alphanumeric identifier of the entity                    |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|          Descrição           | Texto Curto (String) |                          |                                 |                                                                                             |                  Optional short description of the record                  |                                                                                  A description is limited to 255 characters.                                                                                  |
|            Ativo             |       Sim-Não        |           (Y)            |                                 |                                                                                             |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|          Seqüência           |       Inteiro        |                          |                                 |                                                                                             |           Method of ordering records; lowest number comes first            |                                                                                  The Sequence indicates the order of records                                                                                  |
|          Referência          |        Tabela        | AD\_Reference Data Types |   adreference\_aregattribute    |                                                                                             |                      System Reference and Validation                       |                                                                       The Reference could be a display type, list or table validation.                                                                        |
|      Nome da Coluna BD       | Texto Curto (String) |                          |                                 |                                                                                             |                     Name of the column in the database                     |                                                             The Column Name indicates the name of a column on a table as defined in the database.                                                             |
|     Chave de Referência      |        Tabela        |   AD\_Reference Values   | adreferencevalue\_aregattribute | AD\_Reference.ValidationType=CASE WHEN @AD\_Reference\_ID@ IN (17,28) THEN 'L' ELSE 'T' END |             Required to specify, if data type is Table or List             |                                         The Reference Value indicates where the reference values are stored. It must be specified if the data type is Table or List.                                          |
|         Auto-Serviço         |       Sim-Não        |           (Y)            |                                 |                                                                                             | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
| A\_RegistrationAttribute\_UU | Texto Curto (String) |                          |                                 |                                                                                             |                                                                            |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d14122e239" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Designação de Produto - A\_RegistrationProduct

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Designação de Atributos a
Produtos

<span class="emphasis">*Comentário/Ajuda:* </span> Determina quais
atributos são designados a um produto

<span class="emphasis">*Coluna linkada:* </span> Registration Attribute

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d14122e258" class="table">

<div class="table-title">

Table 1.2. Product Assignment
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |  Valores (Padrão)  |      Chave restritiva      |                                                                          Regra de validação                                                                          |                Descrição                 |                              Comentário/Ajuda                              |
| :------------------: | :------------------: | :----------------: | :------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------: |
|       Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                            |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |    (semelhante ao primeiro relatório)    |                            (ver o mesmo acima)                             |
|     Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                            |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |    (semelhante ao primeiro relatório)    |                            (ver o mesmo acima)                             |
| Atributo de Registro |    Tabela Direta     |                    | aregattribute\_aregproduct |                                                                                                                                                                      |       Asset Registration Attribute       |          Define the individual values for the Asset Registration           |
|       Produto        |       Procurar       |                    |   mproduct\_aregproduct    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |          Product, Service, Item          | Identifies an item which is either purchased or sold in this organization. |
|      Descrição       | Texto Curto (String) |                    |                            |                                                                                                                                                                      | Optional short description of the record |                A description is limited to 255 characters.                 |
|        Ativo         |       Sim-Não        |        (Y)         |                            |                                                                                                                                                                      |    (semelhante ao primeiro relatório)    |                            (ver o mesmo acima)                             |

</div>

</div>

  

</div>
