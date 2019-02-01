---
title: "Informações de Requisição"
id: InformacoesdeRequisicaoI
---
<div id="d126208e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Requisição

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-08-17 14:39:28.0

<span class="emphasis"> *Atualizado:* </span>2018-08-17 14:59:57.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>M\_Requisition a

<span class="emphasis"> *Order By :*</span>null

<div id="d126208e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|        Nome         |      Referência      |        Sql SELECT        |                                       QueryCriteria                                        |                               Descrição                                |                                                                                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                       |
| :-----------------: | :------------------: | :----------------------: | :----------------------------------------------------------------------------------------: | :--------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Documento  |    Tabela Direta     |     a.C\_DocType\_ID     |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                      Tipo de Documento ou regras                       |                                                                                                                                                                                                                                                                                                                    O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                                                                                                                                                                                                                                                                                                     |
|     Organização     |    Tabela Direta     |      a.AD\_Org\_ID       |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |               Entidade organizacional dentro da Empresa                |                                                                                                                                                                                                                                                                                 Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                                                                                                                                                                                  |
| Estado do Documento |        Lista         |       a.DocStatus        |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                      O estado atual do documento                       |                                                                                                                                                                                                                                                                                     O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"                                                                                                                                                                                                                                                                                     |
|       Armazém       |    Tabela Direta     |    a.M\_Warehouse\_ID    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                Armazém de estocagem e Ponto de Serviço                 |                                                                                                                                                                                                                                                                                                     O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                                                                                                                                                                                                                                                                                                     |
|     Prioridade      |        Lista         |      a.PriorityRule      |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                       Prioridade de um documento                       |                                                                                                                                                                                                                                                                                                                            A Prioridade indica a importância (alta, média, baixa) deste documento                                                                                                                                                                                                                                                                                                                            |
|   Usuário/Contato   |    Tabela Direta     |      a.AD\_User\_ID      |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |                                                                                                                                                                                                                                                                                        O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                                                                                                                                                                                                                                                                        |
|  Data do Documento  |         Data         |        a.DateDoc         |                                                                                            |                           Data do Documento                            |                                                                                                                                                                                                                                                                                                       A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                                                                                                                                                                                                                                                                                                       |
|      Descrição      | Texto Curto (String) |      a.Description       |                                                                                            |                Descrição resumida opcional do registro                 |                                                                                                                                                                                                                                                                                                                                          Uma descrição é limitada a 255 caracteres.                                                                                                                                                                                                                                                                                                                                          |
| Número do Documento | Texto Curto (String) |       a.DocumentNo       |                                                                                            |              Documenta o número seqüencial dos documentos              | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|    Data Exigida     |         Data         |      a.DateRequired      |                                                                                            |                         Data quando necessário                         |                                                                                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                                                                                             |
|   Lista de Preço    |    Tabela Direta     |    a.M\_PriceList\_ID    |                                                                                            |             Identificador Exclusivo de uma Lista de Preço              |                                                                                                                                                                                                                                                                                                            Listas de Preço são usadas para determinar os preços, margens e custos de itens comprados ou vendidos.                                                                                                                                                                                                                                                                                                            |
|   Total de Linhas   |        Valor         |       a.TotalLines       |                                                                                            |                 Total de todas as linhas do documento                  |                                                                                                                                                                                                                                                                                                                            O "Valor Total" exibe o total de todas as linhas na moeda do documento                                                                                                                                                                                                                                                                                                                            |
|       Empresa       |    Tabela Direta     |     a.AD\_Client\_ID     |                                                                                            |                Empresa/Locatário para esta instalação.                 |                                                                                                                                                                                                                                                                            Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                                                                                                                                                                            |
|      Aprovado       |       Sim-Não        |       a.IsApproved       |                                                                                            |                Indica se este documento exige aprovação                |                                                                                                                                                                                                                                                                                                          A caixa de verificação "Aprovado" indica se este documento exige aprovação antes que possa ser processado.                                                                                                                                                                                                                                                                                                          |
|     Processado      |       Sim-Não        |       a.Processed        |                                                                                            |                       O documento foi processado                       |                                                                                                                                                                                                                                                                                                                       A caixa de verificação "Processado" indica que um documento tem sido processado.                                                                                                                                                                                                                                                                                                                       |
|  Data do Documento  |         Data         | a.DateDoc AS DateDocFrom | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |                           Data do Documento                            |                                                                                                                                                                                                                                                                                                       A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                                                                                                                                                                                                                                                                                                       |
|  Data do Documento  |         Data         |  a.DateDoc AS DateDocTo  | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |                           Data do Documento                            |                                                                                                                                                                                                                                                                                                       A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                                                                                                                                                                                                                                                                                                       |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/InformacoesdeRequisicaoinfodata.html),

</div>