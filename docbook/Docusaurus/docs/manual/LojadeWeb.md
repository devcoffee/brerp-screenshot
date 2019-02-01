---
title: "Loja de Web"
id: LojadeWeb
---
<div id="d138326e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Loja de Web

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Loja de Web -
    W\_Store](#d138326e22)</span>
  - <span class="section">[2. Tabela: Armazenar Tradução -
    W\_Store\_Trl](#d138326e627)</span>
  - <span class="section">[3. Tabela: Mensagem da Loja Virtual -
    W\_MailMsg](#d138326e900)</span>
  - <span class="section">[4. Tabela: Tradução de Mensagem -
    W\_MailMsg\_Trl](#d138326e1129)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir Loja Virtual

<span class="emphasis">*Comentário/Ajuda:* </span>Define a configuração
da loja virtual na Internet.

<span class="emphasis"> *Criado em:* </span>2005-05-02 19:30:27.0

<span class="emphasis">*Atualizado em:* </span>2005-07-02 08:39:55.0

<div id="d138326e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Loja de Web - W\_Store

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/W_Store_data)

<span class="emphasis">*Descrição:*</span> Definir Loja Virtual

<span class="emphasis">*Comentário/Ajuda:* </span> Define as
configurações da loja virtual na Internet. O contexto do servidor de
intenet deve ser único e determina as configurações utilizadas na
transação real. O armazém selecionado determina a organização. As
configurações de email são testadas com os parâmetros de configuração de
email da empresa.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d138326e39" class="table">

<div class="table-title">

Table 1.1. Web Store
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |   Valores (Padrão)   |   Chave restritiva   |                Regra de validação                |                               Descrição                               |                                                                                                         Comentário/Ajuda                                                                                                         |
| :---------------------: | :-------------------------------: | :------------------: | :------------------: | :----------------------------------------------: | :-------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Loja de Web       |                ID                 |                      |                      |                                                  |                       A Web Store of the Client                       |                                                                                                                                                                                                                                  |
|         Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |   adclient\_wstore   |        AD\_Client.AD\_Client\_ID \< \> 0         |                  (semelhante ao primeiro relatório)                   |                                                                                                       (ver o mesmo acima)                                                                                                        |
|       Organização       |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                  (semelhante ao primeiro relatório)                   |                                                                                                       (ver o mesmo acima)                                                                                                        |
|          Nome           |       Texto Curto (String)        |                      |                      |                                                  |                 Alphanumeric identifier of the entity                 |                                           The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                           |
|        Descrição        |       Texto Curto (String)        |                      |                      |                                                  |               Optional short description of the record                |                                                                                           A description is limited to 255 characters.                                                                                            |
|    Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |                            Comment or Hint                            |                                                                           The Help field contains a hint, comment or help about the use of this item.                                                                            |
|          Ativo          |              Sim-Não              |         (Y)          |                      |                                                  |                  (semelhante ao primeiro relatório)                   |                                                                                                       (ver o mesmo acima)                                                                                                        |
|         Padrão          |              Sim-Não              |                      |                      |                                                  |                             Default value                             |                                                                          The Default Checkbox indicates if this record will be used as a default value.                                                                          |
|           URL           |                URL                |                      |                      |                                                  |           Full URL address - e.g. http://www.idempiere.org            |                                                                           The URL defines an fully qualified web address like http://www.idempiere.org                                                                           |
|      Contexto Web       |       Texto Curto (String)        |                      |                      |                                                  |                   Web Server Context - e.g. /wstore                   |                        Unique Web Server Context for this Web Store - will set context-root in application.xml. The web context usually starts with / and needs to be a valid context name (not checked).                        |
|       Stylesheet        |       Texto Curto (String)        |                      |                      |                                                  |                         CSS (Stylesheet) used                         |                                                         Base Stylesheet (.css file) to use - if empty, the default (standard.css) is used. The Style sheet can be a URL.                                                         |
| Representante de Vendas |             Procurar              | AD\_User - SalesRep  |   salesrep\_wstore   |                                                  |                 Sales Representative or Company Agent                 |                                                          The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                                          |
|         Armazém         |           Tabela Direta           |                      |  mwarehouse\_wstore  |                                                  |                  Storage Warehouse and Service Point                  |                                                                 The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                  |
|     Lista de Preço      |           Tabela Direta           |                      |  mpricelist\_wstore  |                                                  |                   Unique identifier of a Price List                   |                                                                    Price Lists are used to determine the pricing, margin and cost of items purchased or sold.                                                                    |
|  Condição de Pagamento  |           Tabela Direta           |                      | cpaymentterm\_wstore |                                                  |                The terms of Payment (timing, discount)                |                                                                                     Payment Terms identify the method and timing of payment.                                                                                     |
| Informação da Loja Web  | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |                     Web Store Header Information                      |                                                                                  Display HTML Info in the Web Store - by default in the header.                                                                                  |
|  Email da Loja Virtual  |       Texto Curto (String)        |                      |                      |                                                  |                EMail address used as the sender (From)                |                                                                                The EMail address is used to send mails to users of the web store                                                                                 |
|   Email de Pedido Web   |       Texto Curto (String)        |                      |                      |                                                  | EMail address to receive notifications when web orders were processed |                                 When processing a web order, a confirmation is sent to the EMail address of the customer from the request EMail address copying this email address when entered.                                 |
| Usuário da Loja Virtual |       Texto Curto (String)        |                      |                      |                                                  |                User ID of the Web Store EMail address                 |                                                                                              User ID to connect to the Mail Server                                                                                               |
|  Senha da Loja Virtual  |       Texto Curto (String)        |                      |                      |                                                  |                Password of the Web Store EMail address                |                                                                                              Password to connect to the Mail Server                                                                                              |
|   Cabeçalho de email    | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |                        Header added to EMails                         |                                                                                               The header is added to every email.                                                                                                |
|     Rodapé de email     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |                        Footer added to EMails                         |                                                                                               The footer is added to every email.                                                                                                |
|     Menu de Pedidos     |              Sim-Não              |         (Y)          |                      |                                                  |                           Show Menu Orders                            |                                                                                                                                                                                                                                  |
|    Menu de Entregas     |              Sim-Não              |         (Y)          |                      |                                                  |                          Show Menu Shipments                          |                                                                                                                                                                                                                                  |
|     Menu de Faturas     |              Sim-Não              |         (Y)          |                      |                                                  |                          Show Menu Invoices                           |                                                                                                                                                                                                                                  |
|     Menu de Ativos      |              Sim-Não              |         (Y)          |                      |                                                  |                           Show Menu Assets                            |                                                                                                                                                                                                                                  |
|   Menu de Pagamentos    |              Sim-Não              |         (Y)          |                      |                                                  |                          Show Menu Payments                           |                                                                                                                                                                                                                                  |
|      Menu de RdCs       |              Sim-Não              |         (Y)          |                      |                                                  |                            Show Menu RfQs                             |                                                                                                                                                                                                                                  |
|  Menu de Solicitações   |              Sim-Não              |         (Y)          |                      |                                                  |                          Show Menu Requests                           |                                                                                                                                                                                                                                  |
|    Menu de Registros    |              Sim-Não              |         (Y)          |                      |                                                  |                        Show Menu Registrations                        |                                                                                                                                                                                                                                  |
|      Menu de Juros      |              Sim-Não              |         (Y)          |                      |                                                  |                          Show Menu Interests                          |                                                                                                                                                                                                                                  |
|    Menu de Contatos     |              Sim-Não              |         (Y)          |                      |                                                  |                           Show Menu Contact                           |                                                                                                                                                                                                                                  |
|     Parâmetro Web 1     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |             Web Site Parameter 1 (default: header image)              |     The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam1 - By default, it is positioned on the upper left side with 130 pixel width.     |
|     Parâmetro Web 2     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |               Web Site Parameter 2 (default index page)               |    The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam2 - By default, it is positioned after the header on the web store index page.     |
|     Parâmetro Web 3     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |              Web Site Parameter 3 (default left - menu)               | The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam3 - By default, it is positioned at the end in the menu column with 130 pixel width.  |
|     Parâmetro Web 4     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |              Web Site Parameter 4 (default footer left)               | The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam4 - By default, it is positioned on the left side of the footer with 130 pixel width. |
|     Parâmetro Web 5     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |             Web Site Parameter 5 (default footer center)              |             The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam5 - By default, it is positioned in the center of the footer.             |
|     Parâmetro Web 6     | Texto Médio (até 2000 caracteres) |                      |                      |                                                  |              Web Site Parameter 6 (default footer right)              |           The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam6 - By default, it is positioned on the right side of the footer.           |
|      W\_Store\_UU       |       Texto Curto (String)        |                      |                      |                                                  |                                                                       |                                                                                                                                                                                                                                  |

</div>

</div>

  

<div id="d138326e627" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Armazenar Tradução - W\_Store\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/W_Store_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Web Store

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d138326e644" class="table">

<div class="table-title">

Table 1.2. Store Translation
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                  Descrição                   |                                                                                                         Comentário/Ajuda                                                                                                         |
| :--------------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa         |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                                                                                                       (ver o mesmo acima)                                                                                                        |
|      Organização       |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                                                                                                       (ver o mesmo acima)                                                                                                        |
|      Loja de Web       |           Tabela Direta           |                    |   wstore\_wstoretrl   |                                                  |          A Web Store of the Client           |                                                                                                                                                                                                                                  |
|         Idioma         |              Tabela               |    AD\_Language    | wstoretrl\_adlangauge |                                                  |           Language for this entity           |                                                                              The Language identifies the language to use for display and formatting                                                                              |
|         Ativo          |              Sim-Não              |        (Y)         |                       |                                                  |      (semelhante ao primeiro relatório)      |                                                                                                       (ver o mesmo acima)                                                                                                        |
|       Traduzida        |              Sim-Não              |                    |                       |                                                  |          This column is translated           |                                                                                 The Translated checkbox indicates if this column is translated.                                                                                  |
| Informação da Loja Web | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |         Web Store Header Information         |                                                                                  Display HTML Info in the Web Store - by default in the header.                                                                                  |
|   Cabeçalho de email   | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |            Header added to EMails            |                                                                                               The header is added to every email.                                                                                                |
|    Rodapé de email     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |            Footer added to EMails            |                                                                                               The footer is added to every email.                                                                                                |
|    Parâmetro Web 1     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  | Web Site Parameter 1 (default: header image) |     The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam1 - By default, it is positioned on the upper left side with 130 pixel width.     |
|    Parâmetro Web 2     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |  Web Site Parameter 2 (default index page)   |    The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam2 - By default, it is positioned after the header on the web store index page.     |
|    Parâmetro Web 3     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |  Web Site Parameter 3 (default left - menu)  | The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam3 - By default, it is positioned at the end in the menu column with 130 pixel width.  |
|    Parâmetro Web 4     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |  Web Site Parameter 4 (default footer left)  | The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam4 - By default, it is positioned on the left side of the footer with 130 pixel width. |
|    Parâmetro Web 5     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  | Web Site Parameter 5 (default footer center) |             The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam5 - By default, it is positioned in the center of the footer.             |
|    Parâmetro Web 6     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  | Web Site Parameter 6 (default footer right)  |           The parameter could be used in the JSP page for variables like logos, passwords, URLs or entire HTML blocks. The access is via ctx.webParam6 - By default, it is positioned on the right side of the footer.           |
|   W\_Store\_Trl\_UU    |       Texto Curto (String)        |                    |                       |                                                  |                                              |                                                                                                                                                                                                                                  |

</div>

</div>

  

<div id="d138326e900" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Mensagem da Loja Virtual - W\_MailMsg

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Define Mensagens da Loja
Virtual

<span class="emphasis">*Coluna linkada:* </span> Web Store

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d138326e915" class="table">

<div class="table-title">

Table 1.3. Web Store Message
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             |                                                                  Valores (Padrão)                                                                  | Chave restritiva |                Regra de validação                |                 Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------------: | :-------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Enviar Mensagem por email |                ID                 |                                                                                                                                                    |                  |                                                  |      Web Store Mail Message Template      |                                                                                                                                              |
|          Empresa          |           Tabela Direta           |                                                                 (@AD\_Client\_ID@)                                                                 |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)     |                                                             (ver o mesmo acima)                                                              |
|        Organização        |           Tabela Direta           |                                                                  (@AD\_Org\_ID@)                                                                   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)     |                                                             (ver o mesmo acima)                                                              |
|        Loja de Web        |           Tabela Direta           |                                                                                                                                                    | wstore\_wmailmsg |                                                  |         A Web Store of the Client         |                                                                                                                                              |
|     Tipo de Mensagem      |               Lista               | Assinar Cancelar Assinatura Aceitar o Pedido Aceitar o Pagamento Erro de Pagamento Conta do Usuário Senha do Usuário User Verification Solicitação |                  |                                                  |             Mail Message Type             |                                                                                                                                              |
|           Nome            |       Texto Curto (String)        |                                                                                                                                                    |                  |                                                  |   Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição         |       Texto Curto (String)        |                                                                                                                                                    |                  |                                                  | Optional short description of the record  |                                                 A description is limited to 255 characters.                                                  |
|           Ativo           |              Sim-Não              |                                                                        (Y)                                                                         |                  |                                                  |    (semelhante ao primeiro relatório)     |                                                             (ver o mesmo acima)                                                              |
|          Assunto          | Texto Médio (até 2000 caracteres) |                                                                                                                                                    |                  |                                                  |           Email Message Subject           |                                                             Subject of the EMail                                                             |
|         Mensagem          | Texto Médio (até 2000 caracteres) |                                                                                                                                                    |                  |                                                  |               EMail Message               |                                                             Message of the EMail                                                             |
|        Mensagem 2         | Texto Médio (até 2000 caracteres) |                                                                                                                                                    |                  |                                                  | Optional second part of the EMail Message |                                                             Message of the EMail                                                             |
|        Mensagem 3         | Texto Médio (até 2000 caracteres) |                                                                                                                                                    |                  |                                                  | Optional third part of the EMail Message  |                                                             Message of the EMail                                                             |
|      W\_MailMsg\_UU       |       Texto Curto (String)        |                                                                                                                                                    |                  |                                                  |                                           |                                                                                                                                              |

</div>

</div>

  

<div id="d138326e1129" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tradução de Mensagem - W\_MailMsg\_Trl

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Mail Message

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d138326e1144" class="table">

<div class="table-title">

Table 1.4. Message Translation
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             |  Valores (Padrão)  |    Chave restritiva     |                Regra de validação                |                 Descrição                 |                            Comentário/Ajuda                            |
| :-----------------------: | :-------------------------------: | :----------------: | :---------------------: | :----------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------: |
|          Empresa          |           Tabela Direta           | (@AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)     |                          (ver o mesmo acima)                           |
|        Organização        |           Tabela Direta           |  (@AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)     |                          (ver o mesmo acima)                           |
| Enviar Mensagem por email |           Tabela Direta           |                    |  wmailmsg\_wmailmsgtrl  |                                                  |      Web Store Mail Message Template      |                                                                        |
|          Idioma           |              Tabela               |    AD\_Language    | adlanguage\_wmailmsgtrl |                                                  |         Language for this entity          | The Language identifies the language to use for display and formatting |
|           Ativo           |              Sim-Não              |        (Y)         |                         |                                                  |    (semelhante ao primeiro relatório)     |                          (ver o mesmo acima)                           |
|         Traduzida         |              Sim-Não              |                    |                         |                                                  |         This column is translated         |    The Translated checkbox indicates if this column is translated.     |
|          Assunto          | Texto Médio (até 2000 caracteres) |                    |                         |                                                  |           Email Message Subject           |                          Subject of the EMail                          |
|         Mensagem          | Texto Médio (até 2000 caracteres) |                    |                         |                                                  |               EMail Message               |                          Message of the EMail                          |
|        Mensagem 2         | Texto Médio (até 2000 caracteres) |                    |                         |                                                  | Optional second part of the EMail Message |                          Message of the EMail                          |
|        Mensagem 3         | Texto Médio (até 2000 caracteres) |                    |                         |                                                  | Optional third part of the EMail Message  |                          Message of the EMail                          |
|    W\_MailMsg\_Trl\_UU    |       Texto Curto (String)        |                    |                         |                                                  |                                           |                                                                        |

</div>

</div>

  

</div>
