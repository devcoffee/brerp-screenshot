---
title: "Inutilização de numeração de NFe"
id: InutilizacaodenumeracaodeNFePrc
---
<div id="d130726e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Inutilização de numeração de NFe

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2012-08-26 23:43:33.0

<span class="emphasis">*Atualizado:*</span>2012-08-26 23:43:33.0

<span class="emphasis"> *Descrição:* </span>Realiza a inutlização de
numeração de NFe

<span class="emphasis"> *Comentário/Ajuda:* </span>Servico destinado a
inutilização de numeração de NFe na Base de Dados do Portal da
Secretaria de Fazenda Estadual.

![](/img/manual/InutilizacaodenumeracaodeNFe.png)

<div id="d130726e22" class="table">

<div class="table-title">

Table 1.1. InutilizacaodenumeracaodeNFe
Parâmetros

</div>

<div class="table-contents">

|          Nome          |  Nome da coluna   |      Referência      |  Valores(Padrão)  |                     Descrição                      |                                                                      Comentário/Ajuda                                                                       |
| :--------------------: | :---------------: | :------------------: | :---------------: | :------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Organização       |    AD\_Org\_ID    |    Tabela Direta     | (@\#AD\_Org\_ID@) |     Entidade organizacional dentro da Empresa      | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|   Tipo de Documento    |  C\_DocType\_ID   |        Tabela        |                   |            Tipo de Documento ou regras             |                                    O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                    |
| Motivo do Cancelamento | lbr\_MotivoCancel | Texto Curto (String) |                   | Motivo do Cancelamento (Entre 15 e 255 caracteres) |            Campo para ser lancado o motivo do cancelamento da NF, deve conter entre 15 e 255 caracteres e é obrigatório para cancelar uma NF-e.             |
|   Data do Documento    |      DateDoc      |         Data         |    (@\#Date@)     |                 Data do Documento                  |                      A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                       |
|         Faixa          |      IsRange      |       Sim-Não        |       ('N')       |         O parâmetro é uma faixa de valores         |                                      A caixa de verificação "Faixa" indica que este parâmetro é uma faixa de valores.                                       |
|       Núm.Final        |       EndNo       |       Inteiro        |                   |                        null                        |                                                                            null                                                                             |
|      Núm. Inicial      |      StartNo      |       Inteiro        |                   |               Número Inicial/posição               |                                     O "Número Inicial" indica a posição de início na linha ou número do campo na linha                                      |

</div>

</div>

  

</div>
