---
title: "Estilos CSS"
id: EstilosCSS
---
<div id="d88835e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Estilos CSS

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: CSS Style -
    AD\_Style](#d88835e22)</span>
  - <span class="section">[2. Tabela: Style Line -
    AD\_StyleLine](#d88835e150)</span>

</div>

<span class="emphasis">*Descrição:* </span> Permite criar e manter
estilos CSS usados na aplicação.

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-05-05 17:35:44.0

<span class="emphasis">*Atualizado em:* </span>2016-05-05 17:35:44.0

<div id="d88835e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: CSS Style - AD\_Style

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Style_data)

<span class="emphasis">*Descrição:*</span> CSS Inline Style Definitions

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d88835e35" class="table">

<div class="table-title">

Table 1.1. CSS Style
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Style     |          ID          |                      |                  |                                                  |      CSS style for field and label       |                                                                                                                                              |
|    Empresa    |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização  |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Nome      | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição   | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|     Ativo     |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

<div id="d88835e150" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Style Line - AD\_StyleLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_StyleLine_data)

<span class="emphasis">*Descrição:*</span> CSS Style Lines

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d88835e163" class="table">

<div class="table-title">

Table 1.2. Style Line
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |                                        Valores (Padrão)                                        |   Chave restritiva   |                Regra de validação                |                                      Descrição                                      |                                                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                                                              |
| :--------------------: | :-------------------------------: | :--------------------------------------------------------------------------------------------: | :------------------: | :----------------------------------------------: | :---------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Style Line       |                ID                 |                                                                                                |                      |                                                  |                                   CSS Style Line                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|        Empresa         |           Tabela Direta           |                                      (@\#AD\_Client\_ID@)                                      |                      |        AD\_Client.AD\_Client\_ID \< \> 0         |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                                                                                                            |
|      Organização       |           Tabela Direta           |                                       (@\#AD\_Org\_ID@)                                        |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                                                                                                            |
|         Style          |           Tabela Direta           |                                                                                                | ADStyle\_ADStyleLine |                                                  |                            CSS style for field and label                            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|       Linha Núm.       |              Inteiro              | (@SQL=SELECT COALESCE(MAX(Line),0)+10 FROM AD\_StyleLine WHERE AD\_Style\_ID =@AD\_Style\_ID@) |                      |                                                  |                            Unique line for this document                            |                                                                                                                                                                                                             Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                                                                                                                                                                              |
|      Inline Style      |       Texto Curto (String)        |                                                                                                |                      |                                                  |                                  CSS Inline Style                                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| Lógica de Visualização | Texto Médio (até 2000 caracteres) |                                                                                                |                      |                                                  | If the Field is displayed, the result determines if the field is actually displayed | format := { expression} \[ { logic} { expression} \] expression := @ { context} @ { operand} { value} or @ { context} @ { operand} { value} logic := { |} | { %26} context := any global or window context value := strings or numbers logic operators := AND or OR with the previous result from left to right operand := eq { =} , gt { %26gt; } , le { %26lt; } , not { \~^\!} Examples: @AD\_Table\_ID@=14 | @Language@\!GERGER @PriceLimit@\> 10 | @PriceList@\> @PriceActual@ @Name@\> J Strings may be in single quotes (optional) |
|         Theme          |       Texto Curto (String)        |                                                                                                |                      |                                                  |                                     Theme name                                      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|         Ativo          |              Sim-Não              |                                              (Y)                                               |                      |                                                  |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                                                                                                            (ver o mesmo acima)                                                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
