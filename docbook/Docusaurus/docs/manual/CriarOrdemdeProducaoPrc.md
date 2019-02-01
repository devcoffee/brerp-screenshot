---
title: "Criar Ordem de Produção"
id: CriarOrdemdeProducaoPrc
---
<div id="d38458e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Criar Ordem de Produção

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-05 09:32:35.0

<span class="emphasis">*Atualizado:*</span>2016-05-05 09:32:55.0

<span class="emphasis"> *Descrição:* </span>Cria uma ordem de produção
para a quantidade informada com base na LDM padrão do Produto

![](/img/manual/CriarOrdemdeProducao.png)

<div id="d38458e18" class="table">

<div class="table-title">

Table 1.1. CriarOrdemdeProducao
Parâmetros

</div>

<div class="table-contents">

|          Nome          | Nome da coluna |            Referência             |       Valores(Padrão)        |                      Descrição                      |                                                                                                         Comentário/Ajuda                                                                                                          |
| :--------------------: | :------------: | :-------------------------------: | :--------------------------: | :-------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Descrição        |  Description   | Texto Médio (até 2000 caracteres) |                              |       Descrição resumida opcional do registro       |                                                                                            Uma descrição é limitada a 255 caracteres.                                                                                             |
|   Ação do Documento    |   DocAction    |               Lista               |   Completar Preparar (PR)    |          O estado de destino do documento           |                                                     Você pode ver o estado atual do documento no campo Estado do Documento. As opções possíveis serão listadas em um diálogo.                                                     |
|      Localizador       | M\_Locator\_ID |         Locator (Armazém)         |                              |               Localizador de Armazém                |                                                                               O "Localizador" indica onde um produto está localizado em um armazém.                                                                               |
|        Produto         | M\_Product\_ID |             Procurar              |                              |               Produto, Serviço, Item                |                                                                               Identifica um item que é ou comprado ou vendido por esta organização.                                                                               |
| Quantidade de Produção | ProductionQty  |               Valor               |                              |          Quantidade de produtos a produzir          |                                                                           A "Quantidade de Produção" identifica o número de produtos a serem produzidos                                                                           |
|         Pedido         |  C\_Order\_ID  |             Procurar              |           C\_Order           |                       Pedido                        | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|          Tipo          |      Type      |               Lista               | Ordem de Venda Produto ('P') | Tipo de Validação (SQL, Java Script, Java Language) |                                                               O "Tipo" indica o tipo de validação que irá ocorrer. Este pode ser SQL, Java Script ou Java Language.                                                               |

</div>

</div>

  

</div>
