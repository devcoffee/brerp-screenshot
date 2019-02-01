---
title: "Transmissão e Impressão de NFe"
id: TransmissaoeImpressaodeNFeI
---
<div id="d249652e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Transmissão e Impressão de NFe

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2014-10-24 10:56:15.0

<span class="emphasis"> *Atualizado:* </span>2014-12-12 16:45:21.0

<span class="emphasis"> *Descrição:* </span>Formulário para Transmissão
de NFe e Impressão de DANFe

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>LBR\_DocFiscal df

<span class="emphasis"> *Order By :*</span>df.DocumentNo

<div id="d249652e29" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome          |      Referência      |                                                                       Sql SELECT                                                                       |                                     QueryCriteria                                      |                   Descrição                    |                                                                                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                       |
| :--------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :--------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Número do Documento   | Texto Curto (String) |                                                                     df.DocumentNo                                                                      | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |  Documenta o número seqüencial dos documentos  | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|   Data de Impressão    |         Data         |                                                                     df.DatePrinted                                                                     |                                                                                        |     Data em que um documento foi impresso.     |                                                                                                                                                                                                                                                                                                                                       Indica a data em que um documento foi impresso.                                                                                                                                                                                                                                                                                                                                        |
|    Tipo de Operação    |        Lista         |                                                                      df.ide\_tpNF                                                                      | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |     Define o Tipo de Operação do Documento     |                                                                                                                                                                                                                                                                                                                                                   0 - Entradas 1 - Saídas                                                                                                                                                                                                                                                                                                                                                    |
|        Impresso        |       Sim-Não        |                                                                      df.IsPrinted                                                                      | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null | Indica se este documento / linha será impresso |                                                                                                                                                                                                                                                                                                                A caixa de verificação "Impresso" indica se este documento ou linha será incluído ao imprimir.                                                                                                                                                                                                                                                                                                                |
|      Organização       |    Tabela Direta     |                                                                     df.AD\_Org\_ID                                                                     | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |   Entidade organizacional dentro da Empresa    |                                                                                                                                                                                                                                                                                 Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                                                                                                                                                                                  |
|       Status NFe       |        Lista         | (CASE WHEN df.lbr\_NFeStatus='100' THEN '1' WHEN COALESCE(lbr\_NFeStatus,'VAZIO')='VAZIO' THEN '2' WHEN lbr\_NFeStatus NOT IN ('1', '2') THEN '3' END) | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                 Status da NFe                  |                                                                                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                                                                                             |
| Parceiro Destinatário  |       Procurar       |                                                                 df.dest\_BPartner\_ID                                                                  | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                      null                      |                                                                                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                                                                                             |
| Data e Hora de Emissão |      Data+Hora       |                                                                     df.ide\_dhEmi                                                                      |                                                                                        |   Data e Hora de Emissão do Documento Fiscal   |                                                                                                                                                                                                                                                                                                                                                 Formato AAAA-MM-DDTHH:MM:DD                                                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/TransmissaoeImpressaodeNFeinfodata.html),

</div>
