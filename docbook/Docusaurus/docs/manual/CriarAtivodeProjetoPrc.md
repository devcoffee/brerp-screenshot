---
title: "Criar Ativo de Projeto"
id: CriarAtivodeProjetoPrc
---
<div id="d38359e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Criar Ativo de Projeto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2012-03-15 17:54:36.0

<span class="emphasis">*Atualizado:*</span>2012-03-15 17:54:36.0

<span class="emphasis"> *Descrição:* </span>Este processo cria um ativo
à partir de um projeto e automaticamente fecha o projeto.

<span class="emphasis"> *Comentário/Ajuda:* </span>Os quatro parâmetros
disponíveis são: 1 - Projeto: é o projeto que será convertivo para
Ativo. Este projeto será fechado após o processo completar. 2 - Produto:
é o produto do tipo ativo que será utilizado como base para o novo ativo
criado. 3 - Vida Útil: é um parâmetro opcional. Utilize este se você
precisa definir uma vida util diferente para o novo ativo, ao invés do
padrão definido no grupo (contabilidade); 4 - Data da Transação: irá se
tornar a data de serviço do novo ativo.

![](/img/manual/CriarAtivodeProjeto.png)

<div id="d38359e22" class="table">

<div class="table-title">

Table 1.1. CriarAtivodeProjeto
Parâmetros

</div>

<div class="table-contents">

|       Nome        | Nome da coluna | Referência |  Valores(Padrão)   |         Descrição          |                                 Comentário/Ajuda                                  |
| :---------------: | :------------: | :--------: | :----------------: | :------------------------: | :-------------------------------------------------------------------------------: |
| Data da Transação |    DateTrx     |    Data    |     (@\#Date@)     |     Data da Transação      |            A "Data da Transação" indica a data da transação comercial.            |
| Vida Útil - Anos  |  UseLifeYears  |  Inteiro   |                    | Anos de vida útil do ativo |                                       null                                        |
|      Projeto      | C\_Project\_ID |  Procurar  | (@C\_Project\_ID@) |     Projeto Financeiro     | Um "Projeto" permite a você rastrear e controlar atividades internas ou externas. |

</div>

</div>

  

</div>
