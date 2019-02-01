---
title: "Importar Tabela IBPT"
id: ImportarTabelaIBPTPrc
---
<div id="d118785e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Importar Tabela IBPT

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-12-04 13:25:31.0

<span class="emphasis">*Atualizado:*</span>2017-12-13 12:28:41.0

<span class="emphasis"> *Descrição:* </span>Importar valores de impostos
à partir da API ou de um CSV gerado peo IBPT

![](/img/manual/ImportarTabelaIBPT.png)

<div id="d118785e18" class="table">

<div class="table-title">

Table 1.1. ImportarTabelaIBPT
Parâmetros

</div>

<div class="table-contents">

|         Nome         | Nome da coluna | Referência |           Valores(Padrão)            |                 Descrição                 |                                                                      Comentário/Ajuda                                                                       |
| :------------------: | :------------: | :--------: | :----------------------------------: | :---------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      DeleteOld       |   DeleteOld    |  Sim-Não   |                ('N')                 |                   null                    |                                                                            null                                                                             |
|     Organização      |  AD\_Org\_ID   |   Tabela   | AD\_Org (all but 0)(@\#AD\_Org\_ID@) | Entidade organizacional dentro da Empresa | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|   Nome do Arquivo    |    FileName    |  FileName  |                                      |       Nome do arquivo local ou URL        |                                 Nome de um arquivo no espaço de diretórios local - ou URL (file://.., http://.., ftp://..)                                  |
| Processamento Online |  OProcessing   |  Sim-Não   |                ('Y')                 | Este pagamento pode ser processado online |                                         O "Processamento Online" indica se o pagamento pode ser processado online.                                          |

</div>

</div>

  

</div>
