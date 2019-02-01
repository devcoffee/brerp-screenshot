---
title: "Idioma"
id: Idioma
---
<div id="d113239e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Idioma

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Idioma -
    AD\_Language](#d113239e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Idiomas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Idioma"
permite a você definir múltiplos idiomas paralelos para os usuários.
Isto permite aos usuários acessar os mesmos dados mas ter janelas, abas
e campos aparecendo em diferentes idiomas. Se o idioma for um Idioma de
Sistema, você pode alterar a Interface do Usuário para este idioma (após
a tradução). Senão, esse idioma será usado apenas para imprimir
documentos. Para códigos de idiomas, nós sugerimos usar a convenção de
país e idiomas do Java (ex. pt\_BR - Português do Brasil). Verifique que
a tradução crie os registros de tradução faltantes. Inicie este processo
após criar um novo idioma.

<span class="emphasis"> *Criado em:* </span>1999-05-21 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d113239e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Idioma - AD\_Language

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Language_data)

<span class="emphasis">*Descrição:*</span> Idiomas de Sistema e de
Usuários

<span class="emphasis">*Comentário/Ajuda:* </span> Se você quiser
acrescentar um novo Idioma de Interface de Usuário, selecione "Idioma do
Sistema". Por outro lado, o sistema permite que você traduza apenas os
elementos para imprimir documentos.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d113239e39" class="table">

<div class="table-title">

Table 1.1. Language
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |                                Valores (Padrão)                                |     Chave restritiva     |                Regra de validação                |                                                                Descrição                                                                |                                                                                                                           Comentário/Ajuda                                                                                                                            |
| :-------------------: | :------------------: | :----------------------------------------------------------------------------: | :----------------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     ID de Idioma      |          ID          | (@SQL=SELECT NVL(MAX(AD\_Language\_ID),0)+1 AS DefaultValue FROM AD\_Language) |                          |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                       |
|     Ponto Decimal     |       Sim-Não        |                                                                                |                          |                                                  |                                       The number notation has a decimal point (no decimal comma)                                        |    If selected, Numbers are printed with a decimal point "." - otherwise with a decimal comma ",". The thousand separator is the opposite. If the pattern for your language is not correct, please create a iDempiere support request with the correct information    |
|        Empresa        |    Tabela Direta     |                              (@\#AD\_Client\_ID@)                              |      languageclient      |        AD\_Client.AD\_Client\_ID \< \> 0         |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|      Organização      |    Tabela Direta     |                               (@\#AD\_Org\_ID@)                                |       languageorg        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|        Idioma         | Texto Curto (String) |                                                                                |                          |                                                  |                                                        Language for this entity                                                         |                                                                                                The Language identifies the language to use for display and formatting                                                                                                 |
|         Nome          | Texto Curto (String) |                                                                                |                          |                                                  |                                                  Alphanumeric identifier of the entity                                                  |                                                             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                              |
|  Texto de Impressão   | Texto Curto (String) |                                                                                |                          |                                                  |                                      The label text to be printed on a document or correspondence.                                      |                                                                  The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.                                                                  |
| Código de Idioma ISO  | Texto Curto (String) |                                                                                |                          |                                                  |                      Lower-case two-letter ISO-3166 code - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt                      |                                                The ISO Language Code indicates the standard ISO code for a language in lower case. Information can be found at http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt                                                |
|  Código ISO de País   | Texto Curto (String) |                                                                                |                          |                                                  | Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO\_3166.html |                                                                       For details - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm                                                                        |
|   Idioma de Sistema   |       Sim-Não        |                                                                                |                          |                                                  |                                            The screens, etc. are maintained in this Language                                            | Select, if you want to have translated screens available in this language. Please notify your system administrator to run the language maintenance scripts to enable the use of this language. If the language is not supplied, you can translate the terms yourself. |
|  Localidade do Login  |       Sim-Não        |                                      (N)                                       |                          |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                       |
|      Idioma Base      |       Sim-Não        |                                      (N)                                       |                          |                                                  |                                          The system information is maintained in this language                                          |                                                                                                                                                                                                                                                                       |
|         Ativo         |       Sim-Não        |                                      (Y)                                       |                          |                                                  |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|    Formato de Data    | Texto Curto (String) |                                                                                |                          |                                                  |                                                            Java Date Pattern                                                            |                                    Option Date pattern in Java notation. Examples: dd.MM.yyyy - dd/MM/yyyy If the pattern for your language is not correct, please create a iDempiere support request with the correct information                                    |
|   Formato de Horas    | Texto Curto (String) |                                                                                |                          |                                                  |                                                            Java Time Pattern                                                            |                                 Option Time pattern in Java notation. Examples: "hh:mm:ss aaa z" - "HH:mm:ss" If the pattern for your language is not correct, please create a iDempiere support request with the correct information                                 |
|  Papel de Impressão   |    Tabela Direta     |                                                                                | adprintpaper\_adlanguage |                                                  |                                                        Printer paper definition                                                         |                                                                                                              Printer Paper Size, Orientation and Margins                                                                                                              |
| Manutenção de Idiomas |        Botão         |                                                                                |                          |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                       |

</div>

</div>

  

</div>
