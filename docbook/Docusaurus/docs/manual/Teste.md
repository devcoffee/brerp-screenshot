---
title: "Teste"
id: Teste
---
<div id="d239838e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Teste

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Teste - Test](#d239838e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tela de Teste

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>1999-06-21 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d239838e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Teste - Test

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/Test_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d239838e31" class="table">

<div class="table-title">

Table 1.1. Test
Fields

</div>

<div class="table-contents">

|          Nome do campo           |            Referência             |   Valores (Padrão)   | Chave restritiva  |                                                                          Regra de validação                                                                          |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------------------: | :-------------------------------: | :------------------: | :---------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|             Test\_UU             |       Texto Curto (String)        |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|           ID de Teste            |                ID                 |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|             Empresa              |           Tabela Direta           | (@\#AD\_Client\_ID@) |                   |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Organização            |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                   |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|               Nome               |       Texto Curto (String)        |                      |                   |                                                                                                                                                                      |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|            Descrição             |       Texto Curto (String)        |                      |                   |                                                                                                                                                                      | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|         Comentário/Ajuda         | Texto Médio (até 2000 caracteres) |                      |                   |                                                                                                                                                                      |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|              Ativo               |              Sim-Não              |         (Y)          |                   |                                                                                                                                                                      |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Moeda De             |           Tabela Direta           |                      |                   |                                                                                                                                                                      |       The Currency for this record       |                                Indicates the Currency to be used when processing or reporting on this record                                 |
|              Valor               |               Valor               |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
| Dias para Liberar pós Liquidação |              Inteiro              |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|              Número              |              Número               |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|               UDM                |           Tabela Direta           |                      |                   |                                                                                                                                                                      |             Unit of Measure              |                                            The UOM defines a unique non monetary Unit of Measure                                             |
|               Qde                |            Quantidade             |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|               Data               |               Data                |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|            Data/Hora             |             Data+Hora             |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|       Parceiro de Negócios       |             Procurar              |                      |                   |                                                        C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'                                                        |      Identifies a Business Partner       |               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                |
|            Pagamento             |             Procurar              |                      |                   |                                                                                                                                                                      |            Payment identifier            |                                             The Payment is a unique identifier of this payment.                                              |
|             Produto              |             Procurar              |                      |                   | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |          Product, Service, Item          |                                  Identifies an item which is either purchased or sold in this organization.                                  |
|           Localizador            |         Locator (Armazém)         |                      |                   |                                                                                                                                                                      |            Warehouse Locator             |                                       The Locator indicates where in a Warehouse a product is located.                                       |
|             Endereço             |      Localização (Endereço)       |                      |                   |                                                                                                                                                                      |           Location or Address            |                                       The Location / Address field defines the location of an entity.                                        |
|          Conta Contábil          |               Conta               |                      | vc\_account\_test |                                                                                                                                                                      |                                          |                                                                                                                                              |
|              Color               |                Cor                |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|          Dados Binários          |              Imagem               |                      |                   |                                                                                                                                                                      |               Binary Data                |                                                     The Binary field stores binary data.                                                     |
|       Dados de Caracteres        | Texto Longo (\> 2000 caracteres)  |                      |                   |                                                                                                                                                                      |           Long Character Field           |                                                                                                                                              |
|            Processado            |              Sim-Não              |                      |                   |                                                                                                                                                                      |     The document has been processed      |                                     The Processed checkbox indicates that a document has been processed.                                     |
|         Processar Agora          |               Botão               |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |
|        Imposto Brasileiro        |       Impostos Brasileiros        |                      |                   |                                                                                                                                                                      |        Primary key table LBR\_Tax        |                                                          Primary key table LBR\_Tax                                                          |
|        COF\_R\_Survey\_ID        |       Survey (Questionário)       |                      |                   |                                                                                                                                                                      |           Primary Key : Survey           |                                                             Primary Key : Survey                                                             |
|               HTML               |               HTML                |                      |                   |                                                                                                                                                                      |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
