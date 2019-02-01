---
title: "Papel de Impressão"
id: PapeldeImpressao
---
<div id="d163575e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Papel de Impressão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Papel de Impressão -
    AD\_PrintPaper](#d163575e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Papéis de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span>Tamanho, Orientação e
Margens do Papel da Impressora

<span class="emphasis"> *Criado em:* </span>2002-07-11 19:15:33.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/PapeldeImpressao.png)

<div id="d163575e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Papel de Impressão - AD\_PrintPaper

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PrintPaper_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento dos Papéis de
Impressão

<span class="emphasis">*Comentário/Ajuda:* </span> Tamanho, Orientação e
Margens do Papel da Impressora. O Código de Validação contém o nome do
Tamanho da Mídia. The names of the media sizes correspond to those in
the IPP 1.1 RFC 2911 - http://www.ietf.org/rfc/rfc2911.txt If the name
is not found, the SizeX/Y with the dimension is used. Size and dimension
are ignored, if a valid media size name is used.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d163575e40" class="table">

<div class="table-title">

Table 1.1. Print Paper
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Papel de Impressão        |          ID          |                      |                  |                                                  |         Printer paper definition         |                                                 Printer Paper Size, Orientation and Margins                                                  |
|             Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|              Nome               | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|            Descrição            | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|              Ativo              |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Padrão              |       Sim-Não        |                      |                  |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|            Paisagem             |       Sim-Não        |         (Y)          |                  |                                                  |          Landscape orientation           |                                                                                                                                              |
|       Código de Validação       | Texto Curto (String) |       (iso-a4)       |                  |                                                  |             Validation Code              |                                    The Validation Code displays the date, time and message of the error.                                     |
|         Dimension Units         |        Lista         |       Inch MM        |                  |                                                  |            Units of Dimension            |                                                                                                                                              |
|           Medida de X           |        Número        |                      |                  |                                                  |      X (horizontal) dimension size       |                                                  Size of X (horizontal) dimension in Units                                                   |
|             Size Y              |        Número        |                      |                  |                                                  |       Y (vertical) dimension size        |                                                   Size of Y (vertical) dimension in Units                                                    |
|         Margem Superior         |       Inteiro        |         (36)         |                  |                                                  |          Top Space in 1/72 inch          |                                                     Space on top of a page in 1/72 inch                                                      |
|         Margem Inferior         |       Inteiro        |         (36)         |                  |                                                  |        Bottom Space in 1/72 inch         |                                                    Space on bottom of a page in 1/72 inch                                                    |
|         Margem Esquerda         |       Inteiro        |         (36)         |                  |                                                  |         Left Space in 1/72 inch          |                                                  Space on left side of a page in 1/72 inch                                                   |
|         Margem Direita          |       Inteiro        |         (36)         |                  |                                                  |         Right Space in 1/72 inch         |                                                  Space on right side of a page in 1/72 inch                                                  |
| Configurar Formato de Impressão |        Botão         |                      |                  |                                                  |                                          |                                                                                                                                              |
|       AD\_PrintPaper\_UU        | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
