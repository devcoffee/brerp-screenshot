---
title: "Imprimir Documentos"
id: ImprimirDocumentosPrc
---
<div id="d120658e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Imprimir Documentos

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-06-30 14:33:26.0

<span class="emphasis">*Atualizado:*</span>2018-07-02 14:20:23.0

<span class="emphasis"> *Comentário/Ajuda:* </span>Permite ao usuário
escolher a quantidade de cópias e imprimir em um único arquivo os
seguinte documentos : Lista de Embarque, Ordem de Venda, Fatura, Títulos
e DANFe. Os documentos são impressos na mesma sequencia das linhas da
Lista de Embarque e ao final da execução do processo marca a Lista de
Embarque como impressa. NOTA: nenhum documento é gerado através desse
processo, eles são apenas impressos, ou seja, precisam estar previamente
gerados para serem apresentados.

![](/img/manual/ImprimirDocumentos.png)

<div id="d120658e18" class="table">

<div class="table-title">

Table 1.1. ImprimirDocumentos
Parâmetros

</div>

<div class="table-contents">

|                   Nome                    |       Nome da coluna        |  Referência   |                  Valores(Padrão)                   |                 Descrição                 |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------------------------: | :-------------------------: | :-----------: | :------------------------------------------------: | :---------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Quantidade de Cópias da Ordem de Venda   |      COF\_QtdCopiasOV       |    Inteiro    |                        (1)                         |                   null                    |                                                                                                               null                                                                                                                |
|      Quantidade de Cópias da Fatura       |    COF\_QtdCopiasFatura     |    Inteiro    |                        (1)                         |                   null                    |                                                                                                               null                                                                                                                |
|       Quantidade de Cópias da DANFE       |     COF\_QtdCopiasDANFE     |    Inteiro    |                        (1)                         |                   null                    |                                                                                                               null                                                                                                                |
|      Quantidade de Cópias do Boleto       |    COF\_QtdCopiasBoleto     |    Inteiro    |                        (1)                         |                   null                    |                                                                                                               null                                                                                                                |
|              Documento Base               |     cof\_DocumentoBase      |     Lista     | Lista de Embarque Ordem de Venda (@BaseTable\_ID@) |    Documento Base Usado Para Impressão    |                                                                                                               null                                                                                                                |
|                  Pedido                   |        C\_Order\_ID         |   Procurar    |                 (@BaseTable\_ID@)                  |                  Pedido                   | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|              AD\_Client\_ID               |       AD\_Client\_ID        | Tabela Direta |                (@\#AD\_Client\_ID@)                |                   null                    |                                                                                                               null                                                                                                                |
|             Lista de Embarque             |    COF\_PackingList\_ID     |   Procurar    |      COF\_PackingList(@COF\_PackingList\_ID@)      |        Primary Key : Packing-List         |                                                                                                    Primary Key : Packing-List                                                                                                     |
| Quantidade de Cópias da Lista de Embarque | COF\_QtdCopiasListaEmbarque |    Inteiro    |                        (1)                         |                   null                    |                                                                                                               null                                                                                                                |
|                Organização                |         AD\_Org\_ID         |    Tabela     |                                                    | Entidade organizacional dentro da Empresa |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
|                  Estado                   |           Status            |     Lista     |       Encerrado Despachado Finalizado Aberto       |         Estado da execução atual          |                                                                                                     Estado da execução atual                                                                                                      |
|                 Impresso                  |       COF\_IsPrinted        |     Lista     |                      Não Sim                       |                   null                    |                                                                                                               null                                                                                                                |
|         Data de Lista de Embarque         |      cof\_PackingDate       |     Data      |                     (@\#Date@)                     |                   null                    |                                                                                                               null                                                                                                                |
|               Data Faturada               |        DateInvoiced         |     Data      |                     (@\#Date@)                     |   Data impressa na Fatura (Nota Fiscal)   |                                                                                  A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                  |
|         Tipo da Lista de Embarque         |      cof\_PackingType       |     Lista     |         Entrega Retirar Transportadora (D)         |                   null                    |                                                                                                               null                                                                                                                |

</div>

</div>

  

</div>
