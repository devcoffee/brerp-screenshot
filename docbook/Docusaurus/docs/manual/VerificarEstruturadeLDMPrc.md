---
title: "Verificar Estrutura de LDM"
id: VerificarEstruturadeLDMPrc
---
<div id="d254039e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Verificar Estrutura de LDM

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2011-07-27 15:21:51.0

<span class="emphasis">*Atualizado:*</span>2011-07-27 15:21:51.0

<span class="emphasis"> *Descrição:* </span>Verificar LDM para correção

<span class="emphasis"> *Comentário/Ajuda:* </span>O processo de
Verificar Estrutura de LDM percorre a LDM para encontrar referẽncias
circulares (não suportado).

![](/img/manual/VerificarEstruturadeLDM.png)

<div id="d254039e22" class="table">

<div class="table-title">

Table 1.1. VerificarEstruturadeLDM
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna      |  Referência   |  Valores(Padrão)   |        Descrição        |                                                     Comentário/Ajuda                                                     |
| :------------------: | :----------------------: | :-----------: | :----------------: | :---------------------: | :----------------------------------------------------------------------------------------------------------------------: |
| Categoria de Produto | M\_Product\_Category\_ID | Tabela Direta |        (-1)        | Categoria de um Produto | Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção. |
|       Produto        |      M\_Product\_ID      |   Procurar    | (@M\_Product\_ID@) | Produto, Serviço, Item  |                          Identifica um item que é ou comprado ou vendido por esta organização.                           |
|     Re-Validate      |       IsReValidate       |    Sim-Não    |        (Y)         |   Re-Validate entries   |                                                           null                                                           |

</div>

</div>

  

</div>
