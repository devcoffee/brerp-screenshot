---
title: "Configuração de Etiqueta"
id: ConfiguracaodeEtiqueta
---
<div id="d31127e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configuração de Etiqueta

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Configuração de Etiqueta -
    COF\_LabelConfig](#d31127e23)</span>
  - <span class="section">[2. Tabela: Campos da Etiqueta -
    COF\_LabelField](#d31127e264)</span>
  - <span class="section">[3. Tabela: Janela -
    COF\_LabelWindow](#d31127e661)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-02 13:10:23.0

<span class="emphasis">*Atualizado em:* </span>2017-01-02 13:10:23.0

![](/img/manual/ConfiguracaodeEtiqueta.png)

<div id="d31127e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Configuração de Etiqueta - COF\_LabelConfig

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_LabelConfig_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d31127e32" class="table">

<div class="table-title">

Table 1.1. Label Config
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |      Valores (Padrão)      | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------------------: | :------------------: | :------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Configuração de Etiqueta     |          ID          |                            |                  |                                                  |        Primary Key : Label Config        |                                                          Primary Key : Label Config                                                          |
|             Empresa              |    Tabela Direta     |    (@\#AD\_Client\_ID@)    |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Organização            |    Tabela Direta     |     (@\#AD\_Org\_ID@)      |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Chave de Busca          | Texto Curto (String) |                            |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|               Nome               | Texto Curto (String) |                            |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|            Descrição             | Texto Curto (String) |                            |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|       Tipo de Configuração       |        Lista         | Ambos Geração Leitura (BO) |                  |                                                  |                                          |                                                                                                                                              |
|         Tipo de Etiqueta         |        Lista         |     Fixa Identificador     |                  |                                                  |                                          |                                                                                                                                              |
|        Digito Verificador        |       Inteiro        |                            |                  |                                                  |                                          |                                                                                                                                              |
| Verificar existência de etiqueta |       Sim-Não        |            (Y)             |                  |                                                  |                                          |                                                                                                                                              |
|  Validar Tamanho do Cód. Barras  |       Sim-Não        |            (N)             |                  |                                                  |                                          |                                                                                                                                              |
|      Caracteres Cód. Barras      |       Inteiro        |            (1)             |                  |                                                  |                                          |                                                                                                                                              |
|    Permitir Etiqueta Repetida    |       Sim-Não        |                            |                  |                                                  |                                          |                                                                                                                                              |
|              Ativo               |       Sim-Não        |            (Y)             |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d31127e264" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Campos da Etiqueta - COF\_LabelField

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d31127e271" class="table">

<div class="table-title">

Table 1.2. Label Field
Fields

</div>

<div class="table-contents">

|             Nome do campo             |      Referência      |      Valores (Padrão)      |        Chave restritiva         |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------------------------------: | :------------------: | :------------------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|          COF\_LabelField\_ID          |          ID          |                            |                                 |                                                  |       Primary Key : Label Field       |                                                          Primary Key : Label Field                                                           |
|                Empresa                |    Tabela Direta     |    (@\#AD\_Client\_ID@)    |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|              Organização              |    Tabela Direta     |     (@\#AD\_Org\_ID@)      |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Configuração de Etiqueta        |    Tabela Direta     |                            |  COFLabelConfig\_COFLabelField  |                                                  |      Primary Key : Label Config       |                                                          Primary Key : Label Config                                                          |
|                 Nome                  | Texto Curto (String) |                            |                                 |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|             Identificador             | Texto Curto (String) |                            |                                 |                                                  |                                       |                                                                                                                                              |
|           Número de Digitos           |       Inteiro        |                            |                                 |                                                  |                                       |                                                                                                                                              |
|               Sequência               |       Inteiro        |                            |                                 |                                                  |                                       |                                                                                                                                              |
|            Posição Inicial            |       Inteiro        |                            |                                 |                                                  |                                       |                                                                                                                                              |
|             Posição Final             |       Inteiro        |                            |                                 |                                                  |                                       |                                                                                                                                              |
|                 Campo                 |    Tabela Direta     |                            |     ADField\_COFLabelField      |          AD\_Field.AD\_Tab\_ID=1500504           |       Field on a database table       |                                              The Field identifies a field on a database table.                                               |
| Coluna de código de barras no produto |        Tabela        |    AD\_Column ColumName    | COFProductBarcodeColumn\_COFLab |           AD\_Column.AD\_Table\_ID=208           |                                       |                                                                                                                                              |
|            Casas decimais             |       Inteiro        |                            |                                 |                                                  |                                       |                                                                                                                                              |
|            Formato de Data            | Texto Curto (String) |                            |                                 |                                                  | Date format used in the input format  |                                    The date format is usually detected, but sometimes need to be defined.                                    |
|             Valor Padrão              |       Sim-Não        |            (N)             |                                 |                                                  |                                       |                                                                                                                                              |
|             Valor Padrão              | Texto Curto (String) |                            |                                 |                                                  |                                       |                                                                                                                                              |
|  Atributo de Instância Personalizado  |       Sim-Não        |            (N)             |                                 |                                                  |                                       |                                                                                                                                              |
|               Atributo                |    Tabela Direta     |                            |    MAttribute\_COFLabelField    |                                                  |           Product Attribute           |                                                      Product Attribute like Color, Size                                                      |
|          Alinhar à Esquerda           |       Sim-Não        |            (N)             |                                 |                                                  |                                       |                                                                                                                                              |
|          Caractere Separador          | Texto Curto (String) |            (0)             |                                 |                                                  |                                       |                                                                                                                                              |
|            Auto Numeração             |       Sim-Não        |            (N)             |                                 |                                                  | Automatically assign the next number  |                        The Auto Numbering checkbox indicates if the system will assign the next number automatically.                        |
|               Seqüência               |        Tabela        | AD\_Sequence for Documents |    ADSequence\_COFLabelField    |                                                  |           Document Sequence           |                                    The Sequence defines the numbering sequence to be used for documents.                                     |
|         Parâmetro de Geração          |       Sim-Não        |            (Y)             |                                 |                                                  |                                       |                                                                                                                                              |
|        Compôe código de barras        |       Sim-Não        |            (Y)             |                                 |                                                  |                                       |                                                                                                                                              |
|                 Ativo                 |       Sim-Não        |            (Y)             |                                 |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d31127e661" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Janela - COF\_LabelWindow

</div>

</div>

</div>

<span class="emphasis">*Lógica de visualização:*</span>
@COF\_LabelConfigType@ \! 'GE'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d31127e672" class="table">

<div class="table-title">

Table 1.3. Label Window
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |   Valores (Padrão)   |        Chave restritiva        |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :------------------: | :----------------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   COF\_LabelWindow\_ID   |          ID          |                      |                                |                                                  |      Primary Key : Label Window       |                                                          Primary Key : Label Window                                                          |
|         Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
| Configuração de Etiqueta |    Tabela Direta     |                      | COFLabelConfig\_COFLabelWindow |                                                  |      Primary Key : Label Config       |                                                          Primary Key : Label Config                                                          |
|           Nome           | Texto Curto (String) |                      |                                |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Tabela          |    Tabela Direta     |                      |    ADTable\_COFLabelWindow     |                                                  |      Database Table information       |                                     The Database Table provides the information of the table definition                                      |
|          Padrão          |       Sim-Não        |         (N)          |                                |                                                  |                                       |                                                                                                                                              |
|          Ativo           |       Sim-Não        |         (Y)          |                                |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
