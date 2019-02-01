---
title: "Formato de Impressão de Tabela"
id: FormatodeImpressaodeTabela
---
<div id="d107708e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Formato de Impressão de Tabela

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Formato de Impressão de Tabela -
    AD\_PrintTableFormat](#d107708e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir Formato de Tabela de
Relatório

<span class="emphasis">*Comentário/Ajuda:* </span>O Formato de Impressão
de Tabela permite definir como o cabeçalho de uma tabela, etc. é
impresso. Por favor note que o Formato de Tabela de Relatório é
armazenado em memória cache para melhorar a performance.

<span class="emphasis"> *Criado em:* </span>2002-08-24 16:57:43.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/FormatodeImpressaodeTabela.png)

<div id="d107708e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Formato de Impressão de Tabela - AD\_PrintTableFormat

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PrintTableFormat_data)

<span class="emphasis">*Descrição:*</span> Definir Formato de Tabela de
Relatório

<span class="emphasis">*Comentário/Ajuda:* </span> O Formato de
Impressão de Tabela permite definir como o cabeçalho de uma tabela,
etc. é impresso. As cores e fontes padrão serão utilizadas se você
deixar os campos vazios: Fontes são baseadas na Fonte usada no
Relatório; Cabeçalho de Página e Cabeçalho de Tabela estarão em
Negrito, a Fonte de Função será Negrito-Itálica, a fonte do Rodapé será
dois pontos menor, e a Fonte dos Parâmetros será Itálica.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d107708e40" class="table">

<div class="table-title">

Table 1.1. Print Table Format
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |                            Valores (Padrão)                             |       Chave restritiva       |                Regra de validação                |                      Descrição                       |                                                                                                 Comentário/Ajuda                                                                                                  |
| :--------------------------------: | :------------------: | :---------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Formato de Impressão de Tabela   |          ID          |                                                                         |                              |                                                  |               Table Format in Reports                |                                                                         Print Table Format determines Fonts, Colors of the printed Table                                                                          |
|       Esquerda do Cabeçalho        | Texto Curto (String) |                                                                         |                              |                                                  |      Content of the left portion of the header.      |                                                                                                                                                                                                                   |
|         Esquerda do Rodapé         | Texto Curto (String) |                                                                         |                              |                                                  |      Content of the left portion of the footer.      |                                                                                                                                                                                                                   |
|         Direita do Rodapé          | Texto Curto (String) |                                                                         |                              |                                                  |     Content of the right portion of the footer.      |                                                                                                                                                                                                                   |
|        Direita do Cabeçalho        | Texto Curto (String) |                                                                         |                              |                                                  |     Content of the right portion of the header.      |                                                                                                                                                                                                                   |
|          Centro do Rodapé          | Texto Curto (String) |                                                                         |                              |                                                  |     Content of the center portion of the footer.     |                                                                                                                                                                                                                   |
|        Centro do Cabeçalho         | Texto Curto (String) |                                                                         |                              |                                                  |     Content of the center portion of the header.     |                                                                                                                                                                                                                   |
|              Empresa               |    Tabela Direta     |                          (@\#AD\_Client\_ID@)                           |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)          |                                                                                                (ver o mesmo acima)                                                                                                |
|            Organização             |    Tabela Direta     |                            (@\#AD\_Org\_ID@)                            |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)          |                                                                                                (ver o mesmo acima)                                                                                                |
|                Nome                | Texto Curto (String) |                                                                         |                              |                                                  |        Alphanumeric identifier of the entity         |                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                    |
|             Descrição              | Texto Curto (String) |                                                                         |                              |                                                  |       Optional short description of the record       |                                                                                    A description is limited to 255 characters.                                                                                    |
|               Ativo                |       Sim-Não        |                                   (Y)                                   |                              |                                                  |          (semelhante ao primeiro relatório)          |                                                                                                (ver o mesmo acima)                                                                                                |
|               Padrão               |       Sim-Não        |                                                                         |                              |                                                  |                    Default value                     |                                                                  The Default Checkbox indicates if this record will be used as a default value.                                                                   |
|     Cor da Linha do Cabeçalho      |        Tabela        |                             AD\_PrintColor                              | adprintcolor\_tablehdrtextfg |                                                  |       Foreground color if the table header row       |                                                                                         Table header row foreground color                                                                                         |
| Cor de Fundo da Linha do Cabeçalho |        Tabela        |                             AD\_PrintColor                              | adprintcolor\_tablehdrtextbg |                                                  |            Background color of header row            |                                                                                         Table header row background color                                                                                         |
|    Fonte da Linha de Cabeçalho     |        Tabela        |                              AD\_PrintFont                              |    adprintfont\_tablehdr     |                                                  |                   Header row Font                    |                                                                                           Font of the table header row                                                                                            |
|       Cabeçalho Multi Linha        |       Sim-Não        |                                   (N)                                   |                              |                                                  | Print column headers on mutliple lines if necessary. |                                                       If selected, column header text will wrap onto the next line -- otherwise the text will be truncated.                                                       |
|    Desenhar Linhas de Cabeçalho    |       Sim-Não        |                                   (Y)                                   |                              |                                                  |        Paint Lines over/under the Header Line        |                                                            If selected, a line is painted above and below the header line using the stroke information                                                            |
|     Cor da Linha do Cabeçalho      |        Tabela        |                             AD\_PrintColor                              |  adprintcolor\_tablehdrline  |                                                  |             Table header row line color              |                                                                                        Color of the table header row lines                                                                                        |
|   Tipo da Espessura do Cabeçalho   |        Lista         | Linha Ponto-Tracejada Linha Pontilhada Linha Tracejada Linha Sólida (S) |                              |                                                  |            Type of the Header Line Stroke            |                                                                                             Type of the line printed                                                                                              |
|       Espessura do Cabeçalho       |        Número        |                                   (2)                                   |                              |                                                  |           Width of the Header Line Stroke            |                                                                          The width of the header line stroke (line thickness) in Points.                                                                          |
|      Pintar Linhas Verticais       |       Sim-Não        |                                                                         |                              |                                                  |                 Paint vertical lines                 |                                                                                            Paint vertical table lines                                                                                             |
|     Pintar Linhas Horizontais      |       Sim-Não        |                                                                         |                              |                                                  |                Paint horizontal lines                |                                                                                           Paint horizontal table lines                                                                                            |
|       Pintar Linhas de Borda       |       Sim-Não        |                                                                         |                              |                                                  |              Paint table boundary lines              |                                                                                             Paint lines around table                                                                                              |
|            Cor da Linha            |        Tabela        |                             AD\_PrintColor                              |   adprintcolor\_tableline    |                                                  |                   Table line color                   |                                                                                                                                                                                                                   |
|     Tipo de Espessura da Linha     |        Lista         | Linha Ponto-Tracejada Linha Pontilhada Linha Tracejada Linha Sólida (S) |                              |                                                  |               Type of the Line Stroke                |                                                                                             Type of the line printed                                                                                              |
|         Espessura da Linha         |        Número        |                                   (1)                                   |                              |                                                  |               Width of the Line Stroke               |                                                                             The width of the line stroke (line thickness) in Points.                                                                              |
|    Imprimir Símbolos de Função     |       Sim-Não        |                                                                         |                              |                                                  |  Print Symbols for Functions (Sum, Average, Count)   |                                                                        If selected, print symbols - otherwise print names of the function                                                                         |
|           Cor da Função            |        Tabela        |                             AD\_PrintColor                              |  adprintcolor\_tablefunctfg  |                                                  |              Function Foreground Color               |                                                                                        Foreground color of a function row                                                                                         |
|       Cor de fundo da função       |        Tabela        |                             AD\_PrintColor                              |  adprintcolor\_tablefunctbg  |                                                  |              Function Background Color               |                                                                                        Background color of a function row                                                                                         |
|          Fonte da Função           |        Tabela        |                              AD\_PrintFont                              | adprintfont\_tableformatfunc |                                                  |                  Function row Font                   |                                                                                             Font of the function row                                                                                              |
|           Imagem Anexada           |       Sim-Não        |                                   (N)                                   |                              |                                                  |  The image to be printed is attached to the record   |                                               The image to be printed is stored in the database as attachment to this record. The image can be a gif, jpeg or png.                                                |
|           URL da Imagem            |         URL          |                                                                         |                              |                                                  |                     URL of image                     |                                               URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.                                               |
|               Imagem               |    Tabela Direta     |                                                                         | adimage\_adprinttableformat  |                                                  |                    Image or Icon                     | Images and Icon can be used to display supported graphic formats (gif, jpg, png). You can either load the image (in the database) or point to a graphic via a URI (i.e. it can point to a resource, http address) |
|      AD\_PrintTableFormat\_UU      | Texto Curto (String) |                                                                         |                              |                                                  |                                                      |                                                                                                                                                                                                                   |

</div>

</div>

  

</div>
