---
title: "Motorista"
id: Motorista
---
<div id="d148568e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Motorista

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Motorista -
    COF\_Driver](#d148568e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-04-22 10:27:44.0

<span class="emphasis">*Atualizado em:* </span>2015-04-22 10:27:44.0

![](/img/manual/Motorista.png)

<div id="d148568e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Motorista - COF\_Driver

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_Driver_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d148568e32" class="table">

<div class="table-title">

Table 1.1. Driver
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |   Valores (Padrão)    |   Chave restritiva   |                Regra de validação                |               Descrição                |                                                                                                                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                                                                                                                             |
| :-------------------: | :------------------: | :-------------------: | :------------------: | :----------------------------------------------: | :------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Motorista       |          ID          |                       |                      |                                                  |          Primary Key : Driver          |                                                                                                                                                                                                                                                                                                                           Primary Key : Driver                                                                                                                                                                                                                                                                                                                           |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@)  |                      |        AD\_Client.AD\_Client\_ID \< \> 0         |   (semelhante ao primeiro relatório)   |                                                                                                                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                            |
|      Organização      |    Tabela Direta     |   (@\#AD\_Org\_ID@)   |                      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |   (semelhante ao primeiro relatório)   |                                                                                                                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                            |
|         Ativo         |       Sim-Não        |          (Y)          |                      |                                                  |   (semelhante ao primeiro relatório)   |                                                                                                                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                            |
|         Nome          | Texto Curto (String) |                       |                      |                                                  | Alphanumeric identifier of the entity  |                                                                                                                                                                                                                                                               The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                                                                               |
|          CPF          | Texto Curto (String) |                       |                      |                                                  | Used to identify individuals in Brazil | \< a href="http://www.serasa.com.br" target="\_blank"\> Serasa\< /a\> \< a href="http://www.sintegra.gov.br" target="\_blank"\> Sintegra\< /a\> \< a href="https://www.ccfacil.com.br/Login.asp?ret\_link=%2FConsulta%2Easp%3FCodConsulta%3D34" target="\_blank"\> CCFácil\< /a\> \< a href="http://www.receita.fazenda.gov.br/PessoaJuridica/CNPJ/cnpjreva/Cnpjreva\_Solicitacao.asp" target="\_blank"\> Receita \< /a\> \< a href="http://www.sci.com.br/" target="\_blank"\> Equifax (SCI)\< /a\> \< a href="http://www8.receita.fazenda.gov.br/SimplesNacional/Aplicacoes/ATBHE/ConsultaOptantes.app/ConsultarOpcao.aspx" target="\_blank"\> Simples Nacional\< /a\> |
|  Número Habilitação   | Texto Curto (String) |                       |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| Categoria Habilitação |        Lista         | A AB AC AD AE B C D E |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|     Data Emissão      |         Data         |                       |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|    Data Vencimento    |         Data         |                       |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|        Vinculo        |        Lista         | Funcionário Terceiro  |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| Parceiro de Negócios  |       Procurar       |                       | CBPartner\_COFDriver |           C\_BPartner.IsEmployee = 'Y'           |     Identifies a Business Partner      |                                                                                                                                                                                                                                                                             A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                                                                                                                                                                              |
|       Bloqueado       |       Sim-Não        |          (N)          |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|      Notificar a      | Texto Curto (String) |                       |                      |                                                  |                                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
