---
title: "Registro"
id: Registro
---
<div id="d194611e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Registro

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Registro -
    A\_Registration](#d194611e23)</span>
  - <span class="section">[2. Tabela: Valor -
    A\_RegistrationValue](#d194611e349)</span>

</div>

<span class="emphasis">*Descrição:* </span> Registro de Ativos do
Usuário

<span class="emphasis">*Comentário/Ajuda:* </span>Registro de Usuário de
um Ativo

<span class="emphasis"> *Criado em:* </span>2004-01-08 21:10:19.0

<span class="emphasis">*Atualizado em:* </span>2012-03-09 15:15:56.0

![](/img/manual/Registro.png)

<div id="d194611e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Registro - A\_Registration

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Registro de Usuário de Ativo

<span class="emphasis">*Comentário/Ajuda:* </span> Registro de Usuário
de um Ativo

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d194611e38" class="table">

<div class="table-title">

Table 1.1. Registration
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             |   Valores (Padrão)   |     Chave restritiva     |                                                                          Regra de validação                                                                          |                                Descrição                                |                                                               Comentário/Ajuda                                                               |
| :------------------------: | :-------------------------------: | :------------------: | :----------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|          Registro          |                ID                 |                      |                          |                                                                                                                                                                      |                         User Asset Registration                         |                                                        User Registration of an Asset                                                         |
|      Processar Agora       |               Botão               |                      |                          |                                                                                                                                                                      |                                                                         |                                                                                                                                              |
|          Empresa           |           Tabela Direta           | (@\#AD\_Client\_ID@) |                          |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                   (semelhante ao primeiro relatório)                    |                                                             (ver o mesmo acima)                                                              |
|        Organização         |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                          |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                   (semelhante ao primeiro relatório)                    |                                                             (ver o mesmo acima)                                                              |
|            Nome            |       Texto Curto (String)        |                      |                          |                                                                                                                                                                      |                  Alphanumeric identifier of the entity                  | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição          |       Texto Curto (String)        |                      |                          |                                                                                                                                                                      |                Optional short description of the record                 |                                                 A description is limited to 255 characters.                                                  |
|      Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                      |                          |                                                                                                                                                                      |                             Comment or Hint                             |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|           Ativo            |              Sim-Não              |         (Y)          |                          |                                                                                                                                                                      |                   (semelhante ao primeiro relatório)                    |                                                             (ver o mesmo acima)                                                              |
|    Parceiro de Negócios    |             Procurar              |                      | cbpartner\_aregistration |                                                        C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                        |                      Identifies a Business Partner                      |               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                |
|      Usuário/Contato       |           Tabela Direta           |                      |  aduser\_aregistration   |                                                              AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@                                                              |      User within the system - Internal or Business Partner Contact      |                The User identifies a unique user in the system. This could be an internal user or a business partner contact                 |
|          Produto           |             Procurar              |                      | mproduct\_aregistration  | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                         Product, Service, Item                          |                                  Identifies an item which is either purchased or sold in this organization.                                  |
|           Ativo            |             Procurar              |                      |  aasset\_aregistration   |                                                                                                                                                                      |                  Asset used internally or by customers                  |         An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.         |
|         Registrado         |              Sim-Não              |                      |                          |                                                                                                                                                                      |                     The application is registered.                      |                                                                                                                                              |
|    Publicação Permitida    |              Sim-Não              |                      |                          |                                                                                                                                                                      | You allow to publish the information, not just statistical summary info |                                                                                                                                              |
|        Em Produção         |              Sim-Não              |                      |                          |                                                                                                                                                                      |                       The system is in production                       |                                                                                                                                              |
| Data de Entrada em Serviço |               Data                |                      |                          |                                                                                                                                                                      |                  Date when Asset was put into service                   |                         The date when the asset was put into service - usually used as start date for depreciation.                          |
|            Nota            |       Texto Curto (String)        |                      |                          |                                                                                                                                                                      |              Optional additional user defined information               |                          The Note field allows for optional entry of user defined information regarding this record                          |
|     Hospedeiro Remoto      |       Texto Curto (String)        |                      |                          |                                                                                                                                                                      |                            Remote host Info                             |                                                                                                                                              |
|         End.Remoto         |       Texto Curto (String)        |                      |                          |                                                                                                                                                                      |                             Remote Address                              |                                       The Remote Address indicates an alternative or external address.                                       |
|    A\_Registration\_UU     |       Texto Curto (String)        |                      |                          |                                                                                                                                                                      |                                                                         |                                                                                                                                              |

</div>

</div>

  

<div id="d194611e349" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Valor - A\_RegistrationValue

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Valores de Registro

<span class="emphasis">*Comentário/Ajuda:* </span> Valores individuais
de Atributo de Registro

<span class="emphasis">*Coluna linkada:* </span> Registration

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d194611e368" class="table">

<div class="table-title">

Table 1.2. Value
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Registro       |    Tabela Direta     |                    | aregistration\_aregvalue |                                                  |         User Asset Registration          |                                                        User Registration of an Asset                                                         |
| Atributo de Registro |    Tabela Direta     |                    | aregattribute\_aregvalue |                                                  |       Asset Registration Attribute       |                                           Define the individual values for the Asset Registration                                            |
|         Nome         | Texto Curto (String) |                    |                          |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                    |                          |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Ativo         |       Sim-Não        |        (Y)         |                          |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
