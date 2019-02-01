---
title: "Verificação de Tradução de Sistema"
id: VerificacaodeTraducaodeSistema
---
<div id="d252648e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Verificação de Tradução de Sistema

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Seleção de Idioma -
    AD\_Language](#d252648e22)</span>
  - <span class="section">[2. Tabela: Tradução de Elemento -
    AD\_Element\_Trl](#d252648e286)</span>
  - <span class="section">[3. Tabela: Tradução de Mensagem -
    AD\_Message\_Trl](#d252648e569)</span>
  - <span class="section">[4. Tabela: Tradução de Janela -
    AD\_Window\_Trl](#d252648e768)</span>
  - <span class="section">[5. Tabela: Tradução de Abas -
    AD\_Tab\_Trl](#d252648e981)</span>
  - <span class="section">[6. Tabela: Tradução de Campos -
    AD\_Field\_Trl](#d252648e1208)</span>
  - <span class="section">[7. Tabela: Tradução de Grupos de Campo -
    AD\_FieldGroup\_Trl](#d252648e1421)</span>
  - <span class="section">[8. Tabela: Tradução de Processo -
    AD\_Process\_Trl](#d252648e1614)</span>
  - <span class="section">[9. Tabela: Tradução de Formulário -
    AD\_Form\_Trl](#d252648e1827)</span>
  - <span class="section">[10. Tabela: Tradução de Tarefas -
    AD\_Task\_Trl](#d252648e2040)</span>
  - <span class="section">[11. Tabela: Tradução de Fluxo de Trabalho -
    AD\_Workflow\_Trl](#d252648e2253)</span>
  - <span class="section">[12. Tabela: Tradução de Nó de Fluxo de
    Trabalho - AD\_WF\_Node\_Trl](#d252648e2466)</span>
  - <span class="section">[13. Tabela: Tradução de Menu -
    AD\_Menu\_Trl](#d252648e2679)</span>
  - <span class="section">[14. Tabela: Tradução de Lista de Referência -
    AD\_Ref\_List\_Trl](#d252648e2886)</span>

</div>

<span class="emphasis">*Descrição:* </span> Verificar Traduções de
Idiomas do Sistema

<span class="emphasis">*Comentário/Ajuda:* </span>Verifique as suas
traduções de idioma para as entidades selecionadas. Você deveria usar
Importação/Exportação de Traduções para uma tradução efetiva. Esta
janela permite a você conferir a tradução das principais entidades de
tradução.

<span class="emphasis"> *Criado em:* </span>2003-01-15 15:46:18.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d252648e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Seleção de Idioma - AD\_Language

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Language_data)

<span class="emphasis">*Descrição:*</span> Selecione o seu Idioma

<span class="emphasis">*Comentário/Ajuda:* </span> O Idioma precisa ser
um Idioma de Sistema (verificado)

<span class="emphasis">*Claúsula Where:*</span>
AD\_Language.IsBaseLanguage='N' AND AD\_Language.IsSystemLanguage='Y'

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d252648e43" class="table">

<div class="table-title">

Table 1.1. Select Language
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |                                Valores (Padrão)                                | Chave restritiva |                Regra de validação                |                                                                Descrição                                                                |                                                                                                                           Comentário/Ajuda                                                                                                                            |
| :-------------------: | :------------------: | :----------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Ponto Decimal     |       Sim-Não        |                                                                                |                  |                                                  |                                       The number notation has a decimal point (no decimal comma)                                        |    If selected, Numbers are printed with a decimal point "." - otherwise with a decimal comma ",". The thousand separator is the opposite. If the pattern for your language is not correct, please create a iDempiere support request with the correct information    |
|   Formato de Horas    | Texto Curto (String) |                                                                                |                  |                                                  |                                                            Java Time Pattern                                                            |                                 Option Time pattern in Java notation. Examples: "hh:mm:ss aaa z" - "HH:mm:ss" If the pattern for your language is not correct, please create a iDempiere support request with the correct information                                 |
| Manutenção de Idiomas |        Botão         |                                                                                |                  |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                       |
|     ID de Idioma      |          ID          | (@SQL=SELECT NVL(MAX(AD\_Language\_ID),0)+1 AS DefaultValue FROM AD\_Language) |                  |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                       |
|    Formato de Data    | Texto Curto (String) |                                                                                |                  |                                                  |                                                            Java Date Pattern                                                            |                                    Option Date pattern in Java notation. Examples: dd.MM.yyyy - dd/MM/yyyy If the pattern for your language is not correct, please create a iDempiere support request with the correct information                                    |
|      Idioma Base      |       Sim-Não        |                                      (N)                                       |                  |                                                  |                                          The system information is maintained in this language                                          |                                                                                                                                                                                                                                                                       |
|         Ativo         |       Sim-Não        |                                      (Y)                                       |                  |                                                  |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|   Idioma de Sistema   |       Sim-Não        |                                                                                |                  |                                                  |                                            The screens, etc. are maintained in this Language                                            | Select, if you want to have translated screens available in this language. Please notify your system administrator to run the language maintenance scripts to enable the use of this language. If the language is not supplied, you can translate the terms yourself. |
|        Empresa        |    Tabela Direta     |                              (@\#AD\_Client\_ID@)                              |  languageclient  |        AD\_Client.AD\_Client\_ID \< \> 0         |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|      Organização      |    Tabela Direta     |                               (@\#AD\_Org\_ID@)                                |   languageorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|        Idioma         | Texto Curto (String) |                                                                                |                  |                                                  |                                                        Language for this entity                                                         |                                                                                                The Language identifies the language to use for display and formatting                                                                                                 |
|         Nome          | Texto Curto (String) |                                                                                |                  |                                                  |                                                  Alphanumeric identifier of the entity                                                  |                                                             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                              |
| Código de Idioma ISO  | Texto Curto (String) |                                                                                |                  |                                                  |                      Lower-case two-letter ISO-3166 code - http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt                      |                                                The ISO Language Code indicates the standard ISO code for a language in lower case. Information can be found at http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt                                                |
|  Código ISO de País   | Texto Curto (String) |                                                                                |                  |                                                  | Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO\_3166.html |                                                                       For details - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm                                                                        |
|   AD\_Language\_UU    | Texto Curto (String) |                                                                                |                  |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                       |

</div>

</div>

  

<div id="d252648e286" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução de Elemento - AD\_Element\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Element_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e299" class="table">

<div class="table-title">

Table 1.2. Element Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |  Valores (Padrão)  |        Chave restritiva        |                Regra de validação                |                                   Descrição                                    |                                                               Comentário/Ajuda                                                               |
| :------------------: | :-------------------------------: | :----------------: | :----------------------------: | :----------------------------------------------: | :----------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |           Tabela Direta           | (@AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|     Organização      |           Tabela Direta           |  (@AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
| Elemento do Sistema  |           Tabela Direta           |                    |    adelement\_adelementtrl     |                                                  | System Element enables the central maintenance of column description and help. |              The System Element allows for the central maintenance of help, descriptions and terminology for a database column.              |
|        Idioma        |              Tabela               |    AD\_Language    | ad\_language\_ad\_element\_trl |                                                  |                            Language for this entity                            |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo         |              Sim-Não              |        (Y)         |                                |                                                  |                       (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|      Traduzida       |              Sim-Não              |                    |                                |                                                  |                           This column is translated                            |                                       The Translated checkbox indicates if this column is translated.                                        |
|         Nome         |       Texto Curto (String)        |                    |                                |                                                  |                     Alphanumeric identifier of the entity                      | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|  Texto de Impressão  |       Texto Curto (String)        |                    |                                |                                                  |         The label text to be printed on a document or correspondence.          |     The Label to be printed indicates the name that will be printed on a document or correspondence. The max length is 2000 characters.      |
|      Descrição       |       Texto Curto (String)        |                    |                                |                                                  |                    Optional short description of the record                    |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                    |                                |                                                  |                                Comment or Hint                                 |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Nome PC        |       Texto Curto (String)        |                    |                                |                                                  |                               Name on PO Screens                               |                                                                                                                                              |
|   Imprimir Nome PC   |       Texto Curto (String)        |                    |                                |                                                  |                        Print name on PO Screens/Reports                        |                                                                                                                                              |
|     Descrição PC     |       Texto Curto (String)        |                    |                                |                                                  |                           Description in PO Screens                            |                                                                                                                                              |
|       Ajuda PC       |       Texto Curto (String)        |                    |                                |                                                  |                              Help for PO Screens                               |                                                                                                                                              |
|    Pré Traduzido     |              Sim-Não              |                    |                                |                                                  |             Element to filter and management of translation system             |                                             Element to filter and translation management system                                              |
|       Checked        |              Sim-Não              |                    |                                |                                                  |             element to filter and management of translation system             |                                                                                                                                              |
| AD\_Element\_Trl\_UU |       Texto Curto (String)        |                    |                                |                                                  |                                                                                |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e569" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução de Mensagem - AD\_Message\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Message_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e582" class="table">

<div class="table-title">

Table 1.3. Message Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                       Descrição                        |                              Comentário/Ajuda                              |
| :------------------: | :-------------------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------: |
|       Empresa        |           Tabela Direta           | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                            (ver o mesmo acima)                             |
|     Organização      |           Tabela Direta           |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                            (ver o mesmo acima)                             |
|       Mensagem       |           Tabela Direta           |                    |      ad\_messagetrl      |                                                  |                     System Message                     |                       Information and Error messages                       |
|        Idioma        |              Tabela               |    AD\_Language    | ad\_language\_messagetrl |                                                  |                Language for this entity                |   The Language identifies the language to use for display and formatting   |
|        Ativo         |              Sim-Não              |        (Y)         |                          |                                                  |           (semelhante ao primeiro relatório)           |                            (ver o mesmo acima)                             |
|      Traduzida       |              Sim-Não              |                    |                          |                                                  |               This column is translated                |      The Translated checkbox indicates if this column is translated.       |
|  Texto de Mensagem   | Texto Médio (até 2000 caracteres) |                    |                          |                                                  |      Textual Informational, Menu or Error Message      |          The Message Text indicates the message that will display          |
|  Dicas de Mensagem   | Texto Médio (até 2000 caracteres) |                    |                          |                                                  |        Additional tip or help for this message         | The Message Tip defines additional help or information about this message. |
|    Pré Traduzido     |              Sim-Não              |                    |                          |                                                  | Element to filter and management of translation system |            Element to filter and translation management system             |
|       Checked        |              Sim-Não              |                    |                          |                                                  | element to filter and management of translation system |                                                                            |
| AD\_Message\_Trl\_UU |       Texto Curto (String)        |                    |                          |                                                  |                                                        |                                                                            |

</div>

</div>

  

<div id="d252648e768" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tradução de Janela - AD\_Window\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Window_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e781" class="table">

<div class="table-title">

Table 1.4. Window Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência             |  Valores (Padrão)  |    Chave restritiva     |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :-------------------------------: | :----------------: | :---------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa       |           Tabela Direta           | (@AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Organização     |           Tabela Direta           |  (@AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Janela        |           Tabela Direta           |                    |      ad\_windowtrl      |                                                  |              Data entry or display window              |                                          The Window field identifies a unique Window in the system.                                          |
|       Idioma        |              Tabela               |    AD\_Language    | ad\_language\_windowtrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo        |              Sim-Não              |        (Y)         |                         |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Traduzida      |              Sim-Não              |                    |                         |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|        Nome         |       Texto Curto (String)        |                    |                         |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |       Texto Curto (String)        |                    |                         |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                    |                         |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|    Pré Traduzido    |              Sim-Não              |                    |                         |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|       Checked       |              Sim-Não              |                    |                         |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_Window\_Trl\_UU |       Texto Curto (String)        |                    |                         |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e981" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Tradução de Abas - AD\_Tab\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Tab_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e994" class="table">

<div class="table-title">

Table 1.5. Tab Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |  Valores (Padrão)  |   Chave restritiva   |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :-------------------------------: | :----------------: | :------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |           Tabela Direta           | (@AD\_Client\_ID@) |                      |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Organização        |           Tabela Direta           |  (@AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|           Aba            |           Tabela Direta           |                    |      ad\_tabtrl      |                                                  |                  Tab within a Window                   |                                            The Tab indicates a tab that displays within a window.                                            |
|          Idioma          |              Tabela               |    AD\_Language    | ad\_language\_tabtrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo           |              Sim-Não              |        (Y)         |                      |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|        Traduzida         |              Sim-Não              |                    |                      |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|           Nome           |       Texto Curto (String)        |                    |                      |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         |       Texto Curto (String)        |                    |                      |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                    |                      |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| Aviso de Comprometimento | Texto Médio (até 2000 caracteres) |                    |                      |                                                  |             Warning displayed when saving              |                                         Warning or information displayed when committing the record                                          |
|      Pré Traduzido       |              Sim-Não              |                    |                      |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|         Checked          |              Sim-Não              |                    |                      |                                                  | element to filter and management of translation system |                                                                                                                                              |
|     AD\_Tab\_Trl\_UU     |       Texto Curto (String)        |                    |                      |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e1208" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Tradução de Campos - AD\_Field\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Field_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e1221" class="table">

<div class="table-title">

Table 1.6. Field Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |  Valores (Padrão)  |    Chave restritiva    |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :----------------: | :--------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa       |           Tabela Direta           | (@AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Campo        |           Tabela Direta           |                    |      ad\_fieldtrl      |                                                  |               Field on a database table                |                                              The Field identifies a field on a database table.                                               |
|       Idioma       |              Tabela               |    AD\_Language    | ad\_language\_fieldtrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo        |              Sim-Não              |        (Y)         |                        |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Traduzida      |              Sim-Não              |                    |                        |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|        Nome        |       Texto Curto (String)        |                    |                        |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição      |       Texto Curto (String)        |                    |                        |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                    |                        |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|   Pré Traduzido    |              Sim-Não              |                    |                        |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|      Checked       |              Sim-Não              |                    |                        |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_Field\_Trl\_UU |       Texto Curto (String)        |                    |                        |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e1421" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Tradução de Grupos de Campo - AD\_FieldGroup\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_FieldGroup_Trl_data)

<span class="emphasis">*Descrição:*</span> Por favor note que a maioria
das traduções de campos são derivadas da tradução de Elemento\!

<span class="emphasis">*Comentário/Ajuda:* </span> Rode Sincronizar
Terminologia para atualizar a tradução do menu. Você necessita apenas
traduzir Campos que não forem mantidos centralizadamente.

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e1442" class="table">

<div class="table-title">

Table 1.7. Field Group Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :----------------: | :-------------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Grupo de Campo      |    Tabela Direta     |                    |      adfieldgroup\_trl      |                                                  |               Logical grouping of fields               |                    The Field Group indicates the logical group that this field belongs to (History, Amounts, Quantities)                     |
|         Idioma          |        Tabela        |    AD\_Language    | adlanguage\_adfieldgrouptrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo          |       Sim-Não        |        (Y)         |                             |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|        Traduzida        |       Sim-Não        |                    |                             |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|          Nome           | Texto Curto (String) |                    |                             |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Pré Traduzido      |       Sim-Não        |                    |                             |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|         Checked         |       Sim-Não        |                    |                             |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_FieldGroup\_Trl\_UU | Texto Curto (String) |                    |                             |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e1614" class="section section">

<div class="titlepage">

<div>

<div>

## 8. Tabela: Tradução de Processo - AD\_Process\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Process_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e1627" class="table">

<div class="table-title">

Table 1.8. Process Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |  Valores (Padrão)  |        Chave restritiva        |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :------------------: | :-------------------------------: | :----------------: | :----------------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |           Tabela Direta           | (@AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Organização      |           Tabela Direta           |  (@AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Processo       |           Tabela Direta           |                    | ad\_process\_ad\_process\_trl  |                                                  |                   Process or Report                    |                                    The Process field identifies a unique Process or Report in the system.                                    |
|        Idioma        |              Tabela               |    AD\_Language    | ad\_language\_ad\_process\_trl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo         |              Sim-Não              |        (Y)         |                                |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Traduzida       |              Sim-Não              |                    |                                |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|         Nome         |       Texto Curto (String)        |                    |                                |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       |       Texto Curto (String)        |                    |                                |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                    |                                |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|    Pré Traduzido     |              Sim-Não              |                    |                                |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|       Checked        |              Sim-Não              |                    |                                |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_Process\_Trl\_UU |       Texto Curto (String)        |                    |                                |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e1827" class="section section">

<div class="titlepage">

<div>

<div>

## 9. Tabela: Tradução de Formulário - AD\_Form\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Form_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e1840" class="table">

<div class="table-title">

Table 1.9. Form Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa       |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Organização     |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
| Formulário Especial |           Tabela Direta           |                    |   adform\_adformtrl   |                                                  |                      Special Form                      |                                    The Special Form field identifies a unique Special Form in the system.                                    |
|       Idioma        |              Tabela               |    AD\_Language    | adlanguage\_adformtrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo        |              Sim-Não              |        (Y)         |                       |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Traduzida      |              Sim-Não              |                    |                       |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|        Nome         |       Texto Curto (String)        |                    |                       |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |       Texto Curto (String)        |                    |                       |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Checked       |              Sim-Não              |                    |                       |                                                  | element to filter and management of translation system |                                                                                                                                              |
|    Pré Traduzido    |              Sim-Não              |                    |                       |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|  AD\_Form\_Trl\_UU  |       Texto Curto (String)        |                    |                       |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e2040" class="section section">

<div class="titlepage">

<div>

<div>

## 10. Tabela: Tradução de Tarefas - AD\_Task\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Task_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e2053" class="table">

<div class="table-title">

Table 1.10. Task Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa      |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Tarefa SO     |           Tabela Direta           |                    |      ad\_tasktrl      |                                                  |                 Operation System Task                  |                                       The Task field identifies a Operation System Task in the system.                                       |
|      Idioma       |              Tabela               |    AD\_Language    | ad\_language\_tasktrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo       |              Sim-Não              |        (Y)         |                       |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Traduzida     |              Sim-Não              |                    |                       |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome        |       Texto Curto (String)        |                    |                       |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     |       Texto Curto (String)        |                    |                       |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|   Pré Traduzido   |              Sim-Não              |                    |                       |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|      Checked      |              Sim-Não              |                    |                       |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_Task\_Trl\_UU |       Texto Curto (String)        |                    |                       |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e2253" class="section section">

<div class="titlepage">

<div>

<div>

## 11. Tabela: Tradução de Fluxo de Trabalho - AD\_Workflow\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Workflow_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e2266" class="table">

<div class="table-title">

Table 1.11. Workflow Translation
Fields

</div>

<div class="table-contents">

|     Nome do campo     |            Referência            |  Valores (Padrão)  |     Chave restritiva      |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------------------: | :----------------: | :-----------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa        |          Tabela Direta           | (@AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Organização      |          Tabela Direta           |  (@AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|   Fluxo de Trabalho   |          Tabela Direta           |                    |      ad\_workflowtrl      |                                                  |            Workflow or combination of tasks            |                                        The Workflow field identifies a unique Workflow in the system.                                        |
|        Idioma         |              Tabela              |    AD\_Language    | ad\_language\_workflowtrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|         Ativo         |             Sim-Não              |        (Y)         |                           |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Traduzida       |             Sim-Não              |                    |                           |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|         Nome          |       Texto Curto (String)       |                    |                           |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       |       Texto Curto (String)       |                    |                           |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda    | Texto Longo (\> 2000 caracteres) |                    |                           |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|     Pré Traduzido     |             Sim-Não              |                    |                           |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|        Checked        |             Sim-Não              |                    |                           |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_Workflow\_Trl\_UU |       Texto Curto (String)       |                    |                           |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e2466" class="section section">

<div class="titlepage">

<div>

<div>

## 12. Tabela: Tradução de Nó de Fluxo de Trabalho - AD\_WF\_Node\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_WF_Node_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e2479" class="table">

<div class="table-title">

Table 1.12. Workflow Node Translation
Fields

</div>

<div class="table-contents">

|     Nome do campo     |            Referência            |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :-------------------: | :------------------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa        |          Tabela Direta           | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|      Organização      |          Tabela Direta           |   (@AD\_Org\_ID@)    |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|          Nó           |          Tabela Direta           |                      |      ad\_wfnodetrl      |                                                  |       Workflow Node (activity), step or process        |                                     The Workflow Node indicates a unique step or process in a Workflow.                                      |
|        Idioma         |              Tabela              |     AD\_Language     | ad\_language\_wfnodetrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|         Ativo         |             Sim-Não              |         (Y)          |                         |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Traduzida       |             Sim-Não              |                      |                         |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|         Nome          |       Texto Curto (String)       |                      |                         |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição       |       Texto Curto (String)       |                      |                         |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda    | Texto Longo (\> 2000 caracteres) |                      |                         |                                                  |                    Comment or Hint                     |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|     Pré Traduzido     |             Sim-Não              |                      |                         |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
|        Checked        |             Sim-Não              |                      |                         |                                                  | element to filter and management of translation system |                                                                                                                                              |
| AD\_WF\_Node\_Trl\_UU |       Texto Curto (String)       |                      |                         |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e2679" class="section section">

<div class="titlepage">

<div>

<div>

## 13. Tabela: Tradução de Menu - AD\_Menu\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Menu_Trl_data)

<span class="emphasis">*Descrição:*</span> Por favor note que a maioria
das traduções de menus são derivadas da tradução de Janela/Formulário/..
\!

<span class="emphasis">*Comentário/Ajuda:* </span> Rode Sincronizar
Terminologia para atualizar a tradução do menu.

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e2700" class="table">

<div class="table-title">

Table 1.13. Menu Translation
Fields

</div>

<div class="table-contents">

|   Nome do campo   |      Referência      |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                       Descrição                        |                                                               Comentário/Ajuda                                                               |
| :---------------: | :------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Empresa      |    Tabela Direta     | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|    Organização    |    Tabela Direta     |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Menu        |    Tabela Direta     |                    |      ad\_menutrl      |                                                  |                   Identifies a Menu                    |               The Menu identifies a unique Menu. Menus are used to control the display of those screens a user has access to.                |
|      Idioma       |        Tabela        |    AD\_Language    | ad\_language\_menutrl |                                                  |                Language for this entity                |                                    The Language identifies the language to use for display and formatting                                    |
|       Ativo       |       Sim-Não        |        (Y)         |                       |                                                  |           (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|     Traduzida     |       Sim-Não        |                    |                       |                                                  |               This column is translated                |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome        | Texto Curto (String) |                    |                       |                                                  |         Alphanumeric identifier of the entity          | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     | Texto Curto (String) |                    |                       |                                                  |        Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|      Checked      |       Sim-Não        |                    |                       |                                                  | element to filter and management of translation system |                                                                                                                                              |
|   Pré Traduzido   |       Sim-Não        |                    |                       |                                                  | Element to filter and management of translation system |                                             Element to filter and translation management system                                              |
| AD\_Menu\_Trl\_UU | Texto Curto (String) |                    |                       |                                                  |                                                        |                                                                                                                                              |

</div>

</div>

  

<div id="d252648e2886" class="section section">

<div class="titlepage">

<div>

<div>

## 14. Tabela: Tradução de Lista de Referência - AD\_Ref\_List\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Ref_List_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Language

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d252648e2899" class="table">

<div class="table-title">

Table 1.14. Reference List Translation
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                       Descrição                        |                                                                     Comentário/Ajuda                                                                      |
| :--------------------: | :------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :----------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |           (semelhante ao primeiro relatório)           |                                                                    (ver o mesmo acima)                                                                    |
|      Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |           (semelhante ao primeiro relatório)           |                                                                    (ver o mesmo acima)                                                                    |
|  Lista de Referência   |    Tabela Direta     |                    |      ad\_reflisttrl      |                                                  |             Reference List based on Table              | The Reference List field indicates a list of reference values from a database tables. Reference lists populate drop down list boxes in data entry screens |
|         Idioma         |        Tabela        |    AD\_Language    | ad\_language\_reflisttrl |                                                  |                Language for this entity                |                                          The Language identifies the language to use for display and formatting                                           |
|         Ativo          |       Sim-Não        |        (Y)         |                          |                                                  |           (semelhante ao primeiro relatório)           |                                                                    (ver o mesmo acima)                                                                    |
|       Traduzida        |       Sim-Não        |                    |                          |                                                  |               This column is translated                |                                              The Translated checkbox indicates if this column is translated.                                              |
|          Nome          | Texto Curto (String) |                    |                          |                                                  |         Alphanumeric identifier of the entity          |       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.        |
|       Descrição        | Texto Curto (String) |                    |                          |                                                  |        Optional short description of the record        |                                                        A description is limited to 255 characters.                                                        |
|     Pré Traduzido      |       Sim-Não        |                    |                          |                                                  | Element to filter and management of translation system |                                                    Element to filter and translation management system                                                    |
|        Checked         |       Sim-Não        |                    |                          |                                                  | element to filter and management of translation system |                                                                                                                                                           |
| AD\_Ref\_List\_Trl\_UU | Texto Curto (String) |                    |                          |                                                  |                                                        |                                                                                                                                                           |

</div>

</div>

  

</div>
