---
title: "Imprimir Notas Fiscais"
id: ImprimirNotasFiscaisPrc
---
<div id="d121119e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Imprimir Notas Fiscais

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-01-29 21:10:38.0

<span class="emphasis">*Atualizado:*</span>2005-07-07 11:38:34.0

<span class="emphasis"> *Descrição:* </span>Imprimir Notas Fiscais /
Fatura em papel ou enviar PDF

<span class="emphasis"> *Comentário/Ajuda:* </span>(Re)Imprimir Faturas
ou enviá-las como anexos em formato PDF ao Contato do Parceiro de
Negócios com um endereço de email válido. Observação: Se você apenas
digitar um Número de documento no Campo "De", todas as faturas maiores
ou iguais ao número de documento serão impressas; você pode
alternativamente usar o caractere % como coringa.

![](/img/manual/ImprimirNotasFiscais.png)

<div id="d121119e22" class="table">

<div class="table-title">

Table 1.1. ImprimirNotasFiscais
Parâmetros

</div>

<div class="table-contents">

|           Nome            |   Nome da coluna   |      Referência      |                                                                  Valores(Padrão)                                                                  |                        Descrição                         |                                                                                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                       |
| :-----------------------: | :----------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Email PDF         |      EMailPDF      |       Sim-Não        |                                                                                                                                                   | Enviar documentos em formato PDF ao parceiro de negócios |                                                                                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                                                                                             |
|          Fatura           |   C\_Invoice\_ID   |       Procurar       |                                                                                                                                                   |                 Identificador de Fatura                  |                                                                                                                                                                                                                                                                                                                                                    O Documento da Fatura.                                                                                                                                                                                                                                                                                                                                                    |
|   Parceiro de Negócios    |  C\_BPartner\_ID   |       Procurar       |                                                                                                                                                   |           Identifica um Parceiro de Negócios.            |                                                                                                                                                                                                                                                                             Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                                                                                                                                                                                                                                                             |
| Modelo de Correspondência |  R\_MailText\_ID   |    Tabela Direta     |                                                                                                                                                   |          Modelos de texto para correspondências          |                                                                 O "Modelo de Correspondência" indica o modelo de texto utilizado nas resposta a mensagens de e-mail. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection.                                                                 |
|     Tipo de Documento     |   C\_DocType\_ID   |    Tabela Direta     |                                                                    C\_DocType                                                                     |               Tipo de Documento ou regras                |                                                                                                                                                                                                                                                                                                                    O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                                                                                                                                                                                                                                                                                                     |
|           Pago            |       IsPaid       |        Lista         |                                                                      Não Sim                                                                      |                  O documento está pago                   |                                                                                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                                                                                             |
|         Impresso          |     IsPrinted      |        Lista         |                                                                      Não Sim                                                                      |      Indica se este documento / linha será impresso      |                                                                                                                                                                                                                                                                                                                A caixa de verificação "Impresso" indica se este documento ou linha será incluído ao imprimir.                                                                                                                                                                                                                                                                                                                |
|    Regra de Pagamento     |    PaymentRule     |      Pagamento       |                                                                                                                                                   |                 Como você paga a fatura                  |                                                                                                                                                                                                                                                                                                                                A Regra de Pagamento indica o método de pagamento de faturas.                                                                                                                                                                                                                                                                                                                                 |
|   Condição de Pagamento   | C\_PaymentTerm\_ID |    Tabela Direta     |                                                                                                                                                   |     São as condições de pagamento (prazo, descontos)     |                                                                                                                                                                                                                                                                                                                             "Condição de Pagamento" identifica o método e o prazo de pagamento.                                                                                                                                                                                                                                                                                                                              |
|    Estado do Documento    |     DocStatus      |        Lista         | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |               O estado atual do documento                |                                                                                                                                                                                                                                                                                     O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"                                                                                                                                                                                                                                                                                     |
|       Data Faturada       |    DateInvoiced    |         Data         |                                                                                                                                                   |          Data impressa na Fatura (Nota Fiscal)           |                                                                                                                                                                                                                                                                                                                               A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                                                                                                                                                                                                                                                                |
|    Número do Documento    |     DocumentNo     | Texto Curto (String) |                                                                                                                                                   |       Documenta o número seqüencial dos documentos       | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |

</div>

</div>

  

</div>