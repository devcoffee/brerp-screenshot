---
title: "Organização de Produto"
id: OrganizacaodeProdutoPrc
---
<div id="d157205e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Organização de Produto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-12-23 23:19:34.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Ajustar e Verificar
Propriedade de Produtos na Organização

<span class="emphasis"> *Comentário/Ajuda:* </span>O processo permite a
você alterar ou verificar a participação da organização de Produtos e
suas entidades dependentes (LDM, Substitutos, Reabastecimento, Compras,
Informações de Parceiro de Negócios, Custos). Selecione ou uma Categoria
de Produto ou um Produto específico.

![](/img/manual/OrganizacaodeProduto.png)

<div id="d157205e22" class="table">

<div class="table-title">

Table 1.1. OrganizacaodeProduto
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna      |  Referência   | Valores(Padrão) |                 Descrição                 |                                                                      Comentário/Ajuda                                                                       |
| :------------------: | :----------------------: | :-----------: | :-------------: | :---------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Organização      |       AD\_Org\_ID        | Tabela Direta |                 | Entidade organizacional dentro da Empresa | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|       Produto        |      M\_Product\_ID      |   Procurar    |                 |          Produto, Serviço, Item           |                                            Identifica um item que é ou comprado ou vendido por esta organização.                                            |
| Categoria de Produto | M\_Product\_Category\_ID | Tabela Direta |      (-1)       |          Categoria de um Produto          |                  Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                   |

</div>

</div>

  

</div>
