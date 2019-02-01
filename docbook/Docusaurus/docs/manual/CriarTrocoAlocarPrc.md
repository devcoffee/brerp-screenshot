---
title: "Criar Troco / Alocar"
id: CriarTrocoAlocarPrc
---
<div id="d38595e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Criar Troco / Alocar

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-07-17 22:07:01.0

<span class="emphasis">*Atualizado:*</span>2018-07-17 22:07:01.0

<span class="emphasis"> *Descrição:* </span>Verifica se sobraram
registros sem alocação na aba "Alocar" e gera documentos automaticamente
para completar o processo.

<span class="emphasis"> *Comentário/Ajuda:* </span>Cria um documento
referente ao saldo em documentos à alocar para a conta bancária e a
finalidade do troco , em seguida cria um novo documento e vincula os
registros pendentes da aba alocar antes de completar fazendo com que os
saldos fiquem alocados corretamente.

![](/img/manual/CriarTroco/Alocar.png)

<div id="d38595e22" class="table">

<div class="table-title">

Table 1.1. CriarTroco/Alocar
Parâmetros

</div>

<div class="table-contents">

|            Nome            |    Nome da coluna    |  Referência   | Valores(Padrão) |          Descrição          |                                   Comentário/Ajuda                                    |
| :------------------------: | :------------------: | :-----------: | :-------------: | :-------------------------: | :-----------------------------------------------------------------------------------: |
|       Conta Bancária       |  C\_BankAccount\_ID  |   Procurar    | C\_BankAccount  |       Conta no Banco        |                 A "Conta Bancária" identifica uma conta neste Banco.                  |
|         Pagamento          |    C\_Payment\_ID    |   Procurar    |   C\_Payment    | Identificador de Pagamento  |              O "Pagamento" é um identificador exclusivo deste pagamento.              |
|       Conta Bancária       | cof\_BankAccount\_ID |   Procurar    | C\_BankAccount  |       Conta no Banco        |                 A "Conta Bancária" identifica uma conta neste Banco.                  |
| Tipo de Documento de Venda | cof\_DocTypeSale\_ID |    Tabela     |   C\_DocType    |            null             |                                         null                                          |
|     Tipo de Documento      |    C\_DocType\_ID    | Tabela Direta |                 | Tipo de Documento ou regras | O "Tipo de Documento" determina a seqüência do documento e as regras de processamento |

</div>

</div>

  

</div>
