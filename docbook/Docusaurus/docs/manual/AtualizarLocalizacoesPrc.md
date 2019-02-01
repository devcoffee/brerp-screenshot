---
title: "Atualizar Localizações"
id: AtualizarLocalizacoesPrc
---
<div id="d14382e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Atualizar Localizações

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-12-19 10:03:12.0

<span class="emphasis">*Atualizado:*</span>2018-07-23 13:04:01.0

<span class="emphasis"> *Comentário/Ajuda:* </span>Processo responsável
por atualizar os campos Latitude e Longitude na janela de Localização,
podendo ser filtrado por Parceiro (atualiza todas as localizações
daquele parceiro), Grupo de Parceiros (atualiza todas as localizações
daquele Grupo) e por Localização (Lista as Localizações do parceiro
selecionado, podendo escolher qual será atualizada)

![](/img/manual/AtualizarLocalizacoes.png)

<div id="d14382e18" class="table">

<div class="table-title">

Table 1.1. AtualizarLocalizacoes
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna       |  Referência   | Valores(Padrão) |                             Descrição                              |                                                                           Comentário/Ajuda                                                                           |
| :---------------------: | :-----------------------: | :-----------: | :-------------: | :----------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Parceiro de Negócios   |      C\_BPartner\_ID      |   Procurar    |                 |                Identifica um Parceiro de Negócios.                 | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|   Grupo de Parceiros    |     C\_BP\_Group\_ID      | Tabela Direta |                 |                   Grupo de Parceiros de Negócios                   |                 O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                  |
| Localização do Parceiro | C\_BPartner\_Location\_ID | Tabela Direta |                 | Identifica o endereço (de remessa para) este Parceiro de Negócios. |                                              O "Endereço do Parceiro" indica a localização de um Parceiro de Negócios.                                               |

</div>

</div>

  

</div>
