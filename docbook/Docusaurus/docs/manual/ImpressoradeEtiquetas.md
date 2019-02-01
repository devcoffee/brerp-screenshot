---
title: "Impressora de Etiquetas"
id: ImpressoradeEtiquetas
---
<div id="d120393e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Impressora de Etiquetas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Impressora -
    AD\_LabelPrinter](#d120393e23)</span>
  - <span class="section">[2. Tabela: Função -
    AD\_LabelPrinterFunction](#d120393e163)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Definições
de Impressoras de Etiquetas

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2003-10-07 17:16:48.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ImpressoradeEtiquetas.png)

<div id="d120393e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Impressora - AD\_LabelPrinter

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Definir Impressora de
Etiqueta

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d120393e34" class="table">

<div class="table-title">

Table 1.1. Printer
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Impressora de Etiquetas |          ID          |                      |                  |                                                  |         Label Printer Definition         |                                                                                                                                              |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Nome           | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|          Ativo          |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  AD\_LabelPrinter\_UU   | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d120393e163" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Função - AD\_LabelPrinterFunction

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Função da Impressora de
Etiqueta

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d120393e174" class="table">

<div class="table-title">

Table 1.2. Function
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                  Descrição                  |                                                               Comentário/Ajuda                                                               |
| :------------------------------: | :------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :-----------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Função da Impressora de Etiqueta |          ID          |                    |                          |                                                  |          Function of Label Printer          |                                                                                                                                              |
|             Empresa              |    Tabela Direta     | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|           Organização            |    Tabela Direta     |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|     Impressora de Etiquetas      |    Tabela Direta     |                    | adlabelprinter\_function |                                                  |          Label Printer Definition           |                                                                                                                                              |
|               Nome               | Texto Curto (String) |                    |                          |                                                  |    Alphanumeric identifier of the entity    | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|            Descrição             | Texto Curto (String) |                    |                          |                                                  |  Optional short description of the record   |                                                 A description is limited to 255 characters.                                                  |
|              Ativo               |       Sim-Não        |        (Y)         |                          |                                                  |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|        Prefixo de Função         | Texto Curto (String) |                    |                          |                                                  |        Data sent before the function        |                                                                                                                                              |
|            Posição XY            |       Sim-Não        |                    |                          |                                                  |         The Function is XY position         |                                             This function positions for the next print operation                                             |
|           Separador XY           | Texto Curto (String) |                    |                          |                                                  | The separator between the X and Y function. |                                                                                                                                              |
|         Sufixo de Função         | Texto Curto (String) |                    |                          |                                                  |        Data sent after the function         |                                                                                                                                              |
|   AD\_LabelPrinterFunction\_UU   | Texto Curto (String) |                    |                          |                                                  |                                             |                                                                                                                                              |

</div>

</div>

  

</div>
