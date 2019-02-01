---
title: "Informações de Ativo"
id: InformacoesdeAtivoI
---
<div id="d124519e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Ativo

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2013-02-01 20:54:36.0

<span class="emphasis"> *Atualizado:* </span>2017-06-14 14:42:52.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>A\_ASSET a LEFT OUTER JOIN
M\_Product p ON (a.M\_Product\_ID=p.M\_Product\_ID) LEFT OUTER JOIN
C\_BPartner bp ON (a.C\_BPartner\_ID=bp.C\_BPartner\_ID) LEFT OUTER JOIN
AD\_User u ON (a.AD\_User\_ID=u.AD\_User\_ID)

<span class="emphasis"> *Order By
:*</span>a.Value<span class="emphasis"> *Valor Padrão* </span>

<div id="d124519e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|            Nome            |      Referência      |      Sql SELECT       |                                       QueryCriteria                                        |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :------------------------: | :------------------: | :-------------------: | :----------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Chave de Busca       | Texto Curto (String) |        a.Value        | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|            Nome            | Texto Curto (String) |        a.Name         | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                         Identificador Alfanumérico da entidade                          |                                                                                                                      O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento.                                                                                                                      |
|    Parceiro de Negócios    |       Procurar       |   a.C\_BPartner\_ID   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                           Identifica um Parceiro de Negócios.                           |                                                                                                                  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                                                                                                  |
|      Usuário/Contato       |    Tabela Direta     |    a.AD\_User\_ID     |                                                                                            |         Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios          |                                                                                                                             O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                                                                                                             |
| Data de Entrada em Serviço |         Data         |  a.AssetServiceDate   |                                                                                            |                        Data quando o ativo foi posto em serviço                         |                                                                                                                                                   A data em que o ativo foi posto em serviço - usado geralmente como data inicial para depreciação.                                                                                                                                                    |
|   Vencimento da Garantia   |         Data         |    a.GuaranteeDate    |                                                                                            |                              Data em que a garantia expira                              |                                                                                                                                                                      Data de vencimento da disponibilidade ou da garantia normal                                                                                                                                                                       |
|       Núm. da Versão       | Texto Curto (String) |      a.VersionNo      |                                                                                            |                                    Número da Versão                                     |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|        Organização         |    Tabela Direta     |     a.AD\_Org\_ID     |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                        Entidade organizacional dentro da Empresa                        |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |
|      No do Inventário      | Texto Curto (String) |     a.InventoryNo     | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                                          null                                           |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|       Grupo de Ativo       |       Procurar       | a.A\_Asset\_Group\_ID |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                     Grupo de Ativos                                     |                                                                                                                        O grupo de ativos determina as contas padrão. Se um grupo de ativo for selecionado na categoria de produto, os ativos serão criados ao entregar o ativo.                                                                                                                        |
|      Data de Ativação      |         Data         | a.AssetActivationDate | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>null  |                                          null                                           |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|      Data de Ativação      |         Data         | a.AssetActivationDate | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>null  |                                          null                                           |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|      Status do Ativo       |        Lista         |  a.A\_Asset\_Status   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                          null                                           |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|          Em Posse          |        Lista         |    a.IsInPosession    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                          O ativo está em posse da organização                           |                                                                                                                                        Ativos que não estão em posse, estão por exemplo em poder de um cliente e podem ou não ser de propriedade da companhia.                                                                                                                                         |
|          Em Poder          |        Lista         |       a.IsOwned       |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                         O ativo é de propriedade da organização                         |                                                                                                                                                            O ativo pode não estar em posse, mas é legalmente de propriedade da organização                                                                                                                                                             |
|   Totalmente depreciado    |        Lista         | a.IsFullyDepreciated  |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                           O ativo está totalmente depreciado                            |                                                                                                                                                                            O custos do ativo foram totalmente amortizados.                                                                                                                                                                             |
|         Descartado         |        Lista         |     a.IsDisposed      |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                 O ativo está descartado                                 |                                                                                                                                                                             O ativo não é mais utilizado e foi descartado                                                                                                                                                                              |
|          Produto           |       Procurar       |   a.M\_Product\_ID    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                 Produto, Serviço, Item                                  |                                                                                                                                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                                                                                                                                  |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/AssetInfoinfodata.html),

</div>
