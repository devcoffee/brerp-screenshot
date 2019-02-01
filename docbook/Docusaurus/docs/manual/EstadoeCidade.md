---
title: "Estado e Cidade"
id: EstadoeCidade
---
<div id="d87965e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Estado e Cidade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: País -
    C\_Country](#d87965e22)</span>
  - <span class="section">[2. Tabela: Região -
    C\_Region](#d87965e635)</span>
  - <span class="section">[3. Tabela: Cidade -
    C\_City](#d87965e827)</span>
  - <span class="section">[4. Tabela: Translation -
    C\_Region\_Trl](#d87965e1066)</span>
  - <span class="section">[5. Tabela: Cidade (sem regiões) -
    C\_City](#d87965e1212)</span>
  - <span class="section">[6. Tabela: Tradução -
    C\_Country\_Trl](#d87965e1447)</span>
  - <span class="section">[7. Tabela: Country Group -
    C\_CountryGroupCountry](#d87965e1762)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Estados e
Cidades

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Países,
Estados e Cidades" define as diferentes entidades que podem ser usadas
em qualquer campo de endereço. Ela define o formato do endereço assim
como associa Estados (ou Regiões) a Países e Cidades a Estados ou
Países. \< p\> Você deveria definir Países usualmente no Nível do
Sistema.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d87965e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: País - C\_Country

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Country_data)

<span class="emphasis">*Descrição:*</span> Definir País

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "País" define
qualquer país com o qual você negocia. Valores digitados aqui são
referenciados em registros de localização de Parceiros de Negócios.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d87965e39" class="table">

<div class="table-title">

Table 1.1. Country
Fields

</div>

<div class="table-contents">

|             Nome do campo              |      Referência      |   Valores (Padrão)   |   Chave restritiva   |                Regra de validação                |                                                                Descrição                                                                |                                                                                                                                                                                                                                                     Comentário/Ajuda                                                                                                                                                                                                                                                      |
| :------------------------------------: | :------------------: | :------------------: | :------------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             C\_Country\_UU             | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|                  País                  |    Tabela Direta     |                      |  ccountry\_ccountry  |                                                  |                                                                 Country                                                                 |                                                                                                                                                                                                            The Country defines a Country. Each Country must be defined before it can be used in any document.                                                                                                                                                                                                             |
|                Empresa                 |    Tabela Direta     | (@\#AD\_Client\_ID@) |   c\_countryclient   |        AD\_Client.AD\_Client\_ID \< \> 0         |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|              Organização               |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |    c\_countryorg     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|           Código ISO de País           | Texto Curto (String) |                      |                      |                                                  | Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO\_3166.html |                                                                                                                                                                                                 For details - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm                                                                                                                                                                                                  |
|                  Nome                  | Texto Curto (String) |                      |                      |                                                  |                                                  Alphanumeric identifier of the entity                                                  |                                                                                                                                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                        |
|               Descrição                | Texto Curto (String) |                      |                      |                                                  |                                                Optional short description of the record                                                 |                                                                                                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                                                                                                        |
|                 Ativo                  |       Sim-Não        |         (Y)          |                      |                                                  |                                                   (semelhante ao primeiro relatório)                                                    |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|     País possui Regiões (Estados)      |       Sim-Não        |                      |                      |                                                  |                                                        Country contains Regions                                                         |                                                                                                                                                                               The Country has Region checkbox is selected if the Country being defined is divided into regions. If this checkbox is selected, the Region Tab is accessible.                                                                                                                                                                               |
|                 Região                 | Texto Curto (String) |       (State)        |                      |                                                  |                                                           Name of the Region                                                            |                                                                                                                                                                                                                 The Region Name defines the name that will print when this region is used in a document.                                                                                                                                                                                                                  |
|    Formato de Impressão de Endereço    | Texto Curto (String) |    (@C@, @R@ @P@)    |                      |                                                  |                                                    Format for printing this Address                                                     |                                                                                                                                                                              The Address Print format defines the format to be used when this address prints. The following notations are used: @C@=City @P@=Postal @A@=PostalAdd @R@=Region                                                                                                                                                                              |
|      Reverter Linhas de Endereço       |       Sim-Não        |                      |                      |                                                  |                                                     Print Address in reverse Order                                                      |                                                                                                                   If NOT selected the sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country. If selected the sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1. The sequence of City/Region/Postal is determined by the address format.                                                                                                                   |
|          Seqüência de Captura          | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                  The Capture Sequence defines the fields to be used when capturing an address on this country. The following notations are used: @CO@=Country, @C@=City, @P@=Postal, @A@=PostalAdd, @R@=Region, @A1@=Address 1 to @A4@=Address 4. Country is always mandatory, add a bang \! to make another field mandatory, for example @C\!@ makes city mandatory, @A1\!@ makes Address 1 mandatory.                                                                   |
|       Formato Local de Endereço        | Texto Curto (String) |                      |                      |                                                  |                                                Format for printing this Address locally                                                 |                                                                                                     The optional Local Address Print format defines the format to be used when this address prints for the Country. If defined, this format is used for printing the address for the country rather then the standard address format. The following notations are used: @C@=City @P@=Postal @A@=PostalAdd @R@=Region                                                                                                      |
|   Reverter Linhas de Endereço Local    |       Sim-Não        |                      |                      |                                                  |                                                  Print Local Address in reverse Order                                                   |                                                                                                          If NOT selected the local sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country. If selected the local sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1. The sequence of City/Region/Postal is determined by the local address format.                                                                                                          |
|        Formato do Código Postal        | Texto Curto (String) |                      |                      |                                                  |                        Format of the postal code; Can contain fixed format elements, Variables: "\_lLoOaAcCa09"                         | \< B\> Validation elements:\< /B\> (Space) any character \_ Space (fixed character) l any Letter a..Z NO space L any Letter a..Z NO space converted to upper case o any Letter a..Z or space O any Letter a..Z or space converted to upper case a any Letters %26 Digits NO space A any Letters %26 Digits NO space converted to upper case c any Letters %26 Digits or space C any Letters %26 Digits or space converted to upper case 0 Digits 0..9 NO space 9 Digits 0..9 or space Example of format "(000)\_000-0000" |
|        Código Postal Adicional         |       Sim-Não        |                      |                      |                                                  |                                                       Has Additional Postal Code                                                        |                                                                                                                                                                   The Additional Postal Code checkbox indicates if this address uses an additional Postal Code. If it is selected an additional field displays for entry of the additional Postal Code.                                                                                                                                                                   |
|        Formato Postal Adicional        | Texto Curto (String) |                      |                      |                                                  |                           Format of the value; Can contain fixed format elements, Variables: "\_lLoOaAcCa09"                            | \< B\> Validation elements:\< /B\> (Space) any character \_ Space (fixed character) l any Letter a..Z NO space L any Letter a..Z NO space converted to upper case o any Letter a..Z or space O any Letter a..Z or space converted to upper case a any Letters %26 Digits NO space A any Letters %26 Digits NO space converted to upper case c any Letters %26 Digits or space C any Letters %26 Digits or space converted to upper case 0 Digits 0..9 NO space 9 Digits 0..9 or space Example of format "(000)\_000-0000" |
|          Formato de Telefone           | Texto Curto (String) |                      |                      |                                                  |                           Format of the phone; Can contain fixed format elements, Variables: "\_lLoOaAcCa09"                            | \< B\> Validation elements:\< /B\> (Space) any character \_ Space (fixed character) l any Letter a..Z NO space L any Letter a..Z NO space converted to upper case o any Letter a..Z or space O any Letter a..Z or space converted to upper case a any Letters %26 Digits NO space A any Letters %26 Digits NO space converted to upper case c any Letters %26 Digits or space C any Letters %26 Digits or space converted to upper case 0 Digits 0..9 NO space 9 Digits 0..9 or space Example of format "(000)\_000-0000" |
|            Tamanho do Papel            | Texto Curto (String) |                      |                      |                                                  |                                                             Java Media Size                                                             |                                                                                                            The Java Media Size. Example: "MediaSize.ISO.A4" (the package javax.print.attribute.standard is assumed). If you define your own media size, use the fully qualified name. If the pattern for your language is not correct, please create a iDempiere support request with the correct information                                                                                                             |
| Formato do Núm. do Rastreador Bancário | Texto Curto (String) |                      |                      |                                                  |                                                    Format of the Bank Routing Number                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|   Formato do Núm. da Conta Bancária    | Texto Curto (String) |                      |                      |                                                  |                                                       Format of the Bank Account                                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|                 Idioma                 |        Tabela        |     AD\_Language     | adlanguage\_ccountry |                                                  |                                                        Language for this entity                                                         |                                                                                                                                                                                                                          The Language identifies the language to use for display and formatting                                                                                                                                                                                                                           |
|                Moeda De                |    Tabela Direta     |                      | ccurrency\_ccountry  |                                                  |                                                      The Currency for this record                                                       |                                                                                                                                                                                                                       Indicates the Currency to be used when processing or reporting on this record                                                                                                                                                                                                                       |
|            IsPostcodeLookup            |       Sim-Não        |         (N)          |                      |                                                  |                                             Does this country have a post code web service                                              |                                                                                                                                                                                                                    Enable the IsPostcodeLookup if you wish to configure a post code lookup web service                                                                                                                                                                                                                    |
|     Permitir cidades fora da lista     |       Sim-Não        |         (Y)          |                      |                                                  |                                    A flag to allow cities, currently not in the list, to be entered                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|               LookupUrl                | Texto Curto (String) |                      |                      |                                                  |                        The URL of the web service that the plugin connects to in order to retrieve postcode data                        |                                                                                                                                                                                                              Enter the URL of the web service that the plugin connects to in order to retrieve postcode data                                                                                                                                                                                                              |
|             LookupClientID             | Texto Curto (String) |                      |                      |                                                  |                                            The ClientID or Login submitted to the Lookup URL                                            |                                                                                                                                                                                                                Enter the ClientID or Login for your account provided by the post code web service provider                                                                                                                                                                                                                |
|             LookupPassword             | Texto Curto (String) |                      |                      |                                                  |                                                The password submitted to the Lookup URL                                                 |                                                                                                                                                                                                                    Enter the password for your account provided by the post code web service provider                                                                                                                                                                                                                     |
|            LookupClassName             | Texto Curto (String) |                      |                      |                                                  |                                              The class name of the postcode lookup plugin                                               |                                                                                                                                                                                                                Enter the class name of the post code lookup plugin for your postcode web service provider                                                                                                                                                                                                                 |
|       Placeholder for Address 1        | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|       Placeholder for Address 2        | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|       Placeholder for Address 3        | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|       Placeholder for Address 4        | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|       Placeholder for Address 5        | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|         Placeholder for postal         | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|     Placeholder for additional zip     | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|          Placeholder for city          | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|        Placeholder for comments        | Texto Curto (String) |                      |                      |                                                  |                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|             Código do País             | Texto Curto (String) |                      |                      |                                                  |                                                 Country Code used for issue Nota Fiscal                                                 |                                                                                                                                                                                                                     Country Code used for issue Nota Fiscal. Codes from BCB (Banco Central do Brasil)                                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d87965e635" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Região - C\_Region

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Region_data)

<span class="emphasis">*Descrição:*</span> Definir Regiões

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Região" define
uma Região dentro de um País. Esta Aba é habilitada somente se a caixa
de verificação Tem Região for selecionada para o país.

<span class="emphasis">*Lógica de visualização:*</span> @HasRegion@='Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87965e656" class="table">

<div class="table-title">

Table 1.2. Region
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |  Valores (Padrão)  | Chave restritiva  |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------: | :------------------: | :----------------: | :---------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Região     |          ID          |                    |                   |                                                  |     Identifies a geographical Region     |                                           The Region identifies a unique Region for this Country.                                            |
|    Empresa    |    Tabela Direta     | (@AD\_Client\_ID@) |  c\_regionclient  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização  |    Tabela Direta     |  (@AD\_Org\_ID@)   |   c\_regionorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     País      |    Tabela Direta     |                    | ccountry\_cregion |                                                  |                 Country                  |                      The Country defines a Country. Each Country must be defined before it can be used in any document.                      |
|     Nome      | Texto Curto (String) |                    |                   |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|   Descrição   | Texto Curto (String) |                    |                   |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|     Ativo     |       Sim-Não        |        (Y)         |                   |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Padrão     |       Sim-Não        |                    |                   |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| Código da UF  |       Inteiro        |                    |                   |                                                  |                                          |                                                                                                                                              |
| C\_Region\_UU | Texto Curto (String) |                    |                   |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d87965e827" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Cidade - C\_City

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_City_data)

<span class="emphasis">*Descrição:*</span> Definir Cidades

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Cidades"
define as Cidades dentro de um País ou Região (Estado). As Cidades
introduzidas aqui não são referenciadas ao se introduzir o endereço.

<span class="emphasis">*Coluna linkada:* </span> Region

<span class="emphasis">*Lógica de visualização:*</span> @HasRegion@='Y'

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d87965e852" class="table">

<div class="table-title">

Table 1.3. City
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  | Chave restritiva |                Regra de validação                |               Descrição               |                                                                                                                                                                Comentário/Ajuda                                                                                                                                                                |
| :-------------------: | :------------------: | :----------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Cidade         |          ID          |                    |                  |                                                  |                 City                  |                                                                                                                                                               City in a country                                                                                                                                                                |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |  c\_cityclient   |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                                                                                                                              (ver o mesmo acima)                                                                                                                                                               |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |    c\_cityorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                                                                                                                              (ver o mesmo acima)                                                                                                                                                               |
|         País          |    Tabela Direta     |                    | ccountry\_ccity  |                                                  |                Country                |                                                                                                                       The Country defines a Country. Each Country must be defined before it can be used in any document.                                                                                                                       |
|        Região         |        Tabela        |     C\_Region      |  cregion\_ccity  |    C\_Region.C\_Country\_ID=@C\_Country\_ID@     |   Identifies a geographical Region    |                                                                                                                                            The Region identifies a unique Region for this Country.                                                                                                                                             |
|         Nome          | Texto Curto (String) |                    |                  |                                                  | Alphanumeric identifier of the entity |                                                                                                  The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                  |
|         Ativo         |       Sim-Não        |        (Y)         |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                                                                                                                              (ver o mesmo acima)                                                                                                                                                               |
|          CEP          | Texto Curto (String) |                    |                  |                                                  |              Postal code              |                                                                                                                                  The Postal Code or ZIP identifies the postal code for this entity's address.                                                                                                                                  |
|    Código de Área     | Texto Curto (String) |                    |                  |                                                  |            Phone Area Code            |                                                                                                                                                                Phone Area Code                                                                                                                                                                 |
| Código de Localização | Texto Curto (String) |                    |                  |                                                  |       Location code - UN/LOCODE       |                                                  UN/Locode is a combination of a 2-character country code and a 3-character location code, e.g. BEANR is known as the city of Antwerp (ANR) which is located in Belgium (BE). \< p\> See: http://www.unece.org/cefact/locode/service/main.htm                                                  |
|      Coordenadas      | Texto Curto (String) |                    |                  |                                                  |          Location coordinate          | This column contains the geographical coordinates (latitude/longitude) of the location.\< p\> In order to avoid unnecessary use of non-standard characters and space, the following standard presentation is used: 0000N 00000W 0000S 00000E where the two last digits refer to minutes and the two or three first digits indicate the degrees |
|      Cod. Cidade      |       Inteiro        |                    |                  |                                                  |                                       |                                                                                                                                                                                                                                                                                                                                                |
|      C\_City\_UU      | Texto Curto (String) |                    |                  |                                                  |                                       |                                                                                                                                                                                                                                                                                                                                                |

</div>

</div>

  

<div id="d87965e1066" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Translation - C\_Region\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Region_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Region

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d87965e1079" class="table">

<div class="table-title">

Table 1.4. Translation
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |   Valores (Padrão)   |    Chave restritiva    |                                  Regra de validação                                   |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------: | :------------------: | :------------------: | :--------------------: | :-----------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Empresa    |    Tabela Direta     | (@\#AD\_Client\_ID@) |  ADClient\_CRegionTrl  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|  Organização  |    Tabela Direta     |                      |   ADOrg\_CRegionTrl    |                                                                                       |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|    Região     |       Procurar       |                      |  CRegion\_CRegionTrl   |                                                                                       |   Identifies a geographical Region    |                                           The Region identifies a unique Region for this Country.                                            |
|    Idioma     |        Tabela        |     AD\_Language     | ADLanguage\_CRegionTrl |                                                                                       |       Language for this entity        |                                    The Language identifies the language to use for display and formatting                                    |
|     Ativo     |       Sim-Não        |         (Y)          |                        |                                                                                       |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|   Traduzida   |       Sim-Não        |         (N)          |                        |                                                                                       |       This column is translated       |                                       The Translated checkbox indicates if this column is translated.                                        |
|     Nome      | Texto Curto (String) |                      |                        |                                                                                       | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |

</div>

</div>

  

<div id="d87965e1212" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Cidade (sem regiões) - C\_City

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_City_data)

<span class="emphasis">*Descrição:*</span> Cidades sem Região

<span class="emphasis">*Coluna linkada:* </span> Country

<span class="emphasis">*Claúsula Where:*</span> C\_Region\_ID IS NULL
AND C\_Country\_ID = @C\_Country\_ID@

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87965e1233" class="table">

<div class="table-title">

Table 1.5. City (Without Regions)
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  | Chave restritiva |                Regra de validação                |               Descrição               |                                                                                                                                                                Comentário/Ajuda                                                                                                                                                                |
| :-------------------: | :------------------: | :----------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Cidade         |          ID          |                    |                  |                                                  |                 City                  |                                                                                                                                                               City in a country                                                                                                                                                                |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |  c\_cityclient   |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                                                                                                                              (ver o mesmo acima)                                                                                                                                                               |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |    c\_cityorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                                                                                                                              (ver o mesmo acima)                                                                                                                                                               |
|         País          |    Tabela Direta     |                    | ccountry\_ccity  |                                                  |                Country                |                                                                                                                       The Country defines a Country. Each Country must be defined before it can be used in any document.                                                                                                                       |
|        Região         |        Tabela        |     C\_Region      |  cregion\_ccity  |    C\_Region.C\_Country\_ID=@C\_Country\_ID@     |   Identifies a geographical Region    |                                                                                                                                            The Region identifies a unique Region for this Country.                                                                                                                                             |
|         Nome          | Texto Curto (String) |                    |                  |                                                  | Alphanumeric identifier of the entity |                                                                                                  The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                  |
|         Ativo         |       Sim-Não        |        (Y)         |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                                                                                                                              (ver o mesmo acima)                                                                                                                                                               |
|          CEP          | Texto Curto (String) |                    |                  |                                                  |              Postal code              |                                                                                                                                  The Postal Code or ZIP identifies the postal code for this entity's address.                                                                                                                                  |
|    Código de Área     | Texto Curto (String) |                    |                  |                                                  |            Phone Area Code            |                                                                                                                                                                Phone Area Code                                                                                                                                                                 |
| Código de Localização | Texto Curto (String) |                    |                  |                                                  |       Location code - UN/LOCODE       |                                                  UN/Locode is a combination of a 2-character country code and a 3-character location code, e.g. BEANR is known as the city of Antwerp (ANR) which is located in Belgium (BE). \< p\> See: http://www.unece.org/cefact/locode/service/main.htm                                                  |
|      Coordenadas      | Texto Curto (String) |                    |                  |                                                  |          Location coordinate          | This column contains the geographical coordinates (latitude/longitude) of the location.\< p\> In order to avoid unnecessary use of non-standard characters and space, the following standard presentation is used: 0000N 00000W 0000S 00000E where the two last digits refer to minutes and the two or three first digits indicate the degrees |
|      Cod. Cidade      |       Inteiro        |                    |                  |                                                  |                                       |                                                                                                                                                                                                                                                                                                                                                |
|      C\_City\_UU      | Texto Curto (String) |                    |                  |                                                  |                                       |                                                                                                                                                                                                                                                                                                                                                |

</div>

</div>

  

<div id="d87965e1447" class="section section">

<div class="titlepage">

<div>

<div>

## 6. Tabela: Tradução - C\_Country\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Country_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Country

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87965e1464" class="table">

<div class="table-title">

Table 1.6. Translation
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |  Valores (Padrão)  |    Chave restritiva     |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------------: | :------------------: | :----------------: | :---------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      C\_Country\_Trl\_UU       | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|            Empresa             |    Tabela Direta     | (@AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Organização           |    Tabela Direta     |  (@AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|              País              |    Tabela Direta     |                    |  ccountry\_ccountrytrl  |                                                  |                 Country                  |                      The Country defines a Country. Each Country must be defined before it can be used in any document.                      |
|             Idioma             |        Tabela        |    AD\_Language    | adlanguage\_ccountrytrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|             Ativo              |       Sim-Não        |        (Y)         |                         |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Traduzida            |       Sim-Não        |                    |                         |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|              Nome              | Texto Curto (String) |                    |                         |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|           Descrição            | Texto Curto (String) |                    |                         |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|             Região             | Texto Curto (String) |                    |                         |                                                  |            Name of the Region            |                           The Region Name defines the name that will print when this region is used in a document.                           |
|   Placeholder for Address 1    | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|   Placeholder for Address 2    | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|   Placeholder for Address 3    | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|   Placeholder for Address 4    | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|   Placeholder for Address 5    | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|     Placeholder for postal     | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
| Placeholder for additional zip | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|      Placeholder for city      | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |
|    Placeholder for comments    | Texto Curto (String) |                    |                         |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d87965e1762" class="section section">

<div class="titlepage">

<div>

<div>

## 7. Tabela: Country Group - C\_CountryGroupCountry

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Country

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d87965e1773" class="table">

<div class="table-title">

Table 1.7. Country Group
Fields

</div>

<div class="table-contents">

|      Nome do campo       |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                          Comentário/Ajuda                                          |
| :----------------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------: |
| Country on Country Group |      ID       |                      |                                 |                                                  |                                    |                                                                                                    |
|         Empresa          | Tabela Direta | (@\#AD\_Client\_ID@) | ADClient\_CCountryGroupCountry  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                        (ver o mesmo acima)                                         |
|       Organização        | Tabela Direta |  (@\#AD\_Org\_ID@)   |   ADOrg\_CCountryGroupCountry   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                        (ver o mesmo acima)                                         |
|           País           | Tabela Direta |                      | CCountry\_CCountryGroupCountry  |                                                  |              Country               | The Country defines a Country. Each Country must be defined before it can be used in any document. |
|      Country Group       | Tabela Direta |                      | CCountryGroup\_CCountryGroupCou |                                                  |                                    |                                                                                                    |
|          Do dia          |     Data      |                      |                                 |                                                  |     Starting date for a range      |                       The Date From indicates the starting date of a range.                        |
|          Ao dia          |     Data      |                      |                                 |                                                  |      End date of a date range      |                     The Date To indicates the end date of a range (inclusive)                      |
|          Ativo           |    Sim-Não    |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                        (ver o mesmo acima)                                         |

</div>

</div>

  

</div>
