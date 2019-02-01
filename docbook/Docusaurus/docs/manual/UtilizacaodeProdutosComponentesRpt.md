---
title: "Utilização de Produtos/Componentes"
id: UtilizacaodeProdutosComponentesRpt
---
<div id="d251585e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Utilização de Produtos/Componentes

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2013-03-01 14:30:39.0

<span class="emphasis">*Atualizado:*</span>2013-03-01 14:30:39.0

<span class="emphasis"> *Descrição:* </span>Utilização de
Produtos/Componentes

<span class="emphasis"> *Comentário/Ajuda:* </span>Utilização de
Produtos/Componentes

<span class="emphasis"> *ReportView:*
</span>RV\_M\_Product\_WhereUsed\_V

![](/img/manual/UtilizacaodeProdutos/Componentes.png)

<div id="d251585e26" class="table">

<div class="table-title">

Table 1.1. UtilizacaodeProdutos/Componentes
Parâmetros

</div>

<div class="table-contents">

|  Nome   | Nome da coluna | Referência | Valores(Padrão) |       Descrição        |                              Comentário/Ajuda                              |
| :-----: | :------------: | :--------: | :-------------: | :--------------------: | :------------------------------------------------------------------------: |
| Product | M\_Product\_ID |  Procurar  |                 | Product, Service, Item | Identifies an item which is either purchased or sold in this organization. |

</div>

</div>

  

<div id="d251585e64" class="table">

<div class="table-title">

Table 1.2. RV\_M\_Product\_WhereUsed\_V -
Colunas

</div>

<div class="table-contents">

|          Nome da coluna          |      Referência      | Valores padrão | Valor de restrição |        Regra de validação         |                Descrição                 |                                                                                                                                                                              Comentário/Ajuda                                                                                                                                                                              |
| :------------------------------: | :------------------: | :------------: | :----------------: | :-------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Empresa              |    Tabela Direta     |                |                    | AD\_Client.AD\_Client\_ID \< \> 0 |               (ver acima)                |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|           Organização            |    Tabela Direta     |                |                    |                                   |               (ver acima)                |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|            Descrição             | Texto Curto (String) |                |                    |                                   | Optional short description of the record |                                                                                                                                                                A description is limited to 255 characters.                                                                                                                                                                 |
|            Linha Núm.            |       Inteiro        |                |                    |                                   |      Unique line for this document       |                                                                                                                              Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                                                                              |
|             Produto              |    Tabela Direta     |                |                    |                                   |          Product, Service, Item          |                                                                                                                                                 Identifies an item which is either purchased or sold in this organization.                                                                                                                                                 |
|               Nome               | Texto Curto (String) |                |                    |                                   |  Alphanumeric identifier of the entity   |                                                                                                                The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                |
|          LM %26 Fórmula          |    Tabela Direta     |                |                    |                                   |             BOM %26 Formula              |                                                                                                                                                                                                                                                                                                                                                                            |
|            Quantidade            |      Quantidade      |                |                    |                                   |  Indicate the Quantity use in this BOM   |                                                                           Exist two way the add a compenent to a BOM or Formula: 1.- Adding a Component based in quantity to use in this BOM 2.- Adding a Component based in % to use the Order Quantity of Manufacturing Order in this Formula.                                                                           |
| Descrição do Produto Selecionado | Texto Curto (String) |                |                    |                                   |                                          |                                                                                                                                                                                                                                                                                                                                                                            |
|   Nome do Produto Selecionado    | Texto Curto (String) |                |                    |                                   |                                          |                                                                                                                                                                                                                                                                                                                                                                            |
|  Código do Produto Selecionado   | Texto Curto (String) |                |                    |                                   |                                          |                                                                                                                                                                                                                                                                                                                                                                            |
|          Chave de Busca          | Texto Curto (String) |                |                    |                                   |               (ver acima)                | A search key allows you a fast method of finding a particular record. If you leave the search key empty, the system automatically creates a numeric number. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |

</div>

</div>

  

</div>
