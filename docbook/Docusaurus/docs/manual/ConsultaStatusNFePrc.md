---
title: "Consulta Status NFe"
id: ConsultaStatusNFePrc
---
<div id="d35835e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Consulta Status NFe

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2010-11-25 14:49:29.0

<span class="emphasis">*Atualizado:*</span>2018-01-15 16:23:39.0

<span class="emphasis"> *Descrição:* </span>Testa o status do serviço da
NF-e

<span class="emphasis"> *Comentário/Ajuda:* </span>Serviço destinado à
consulta do status do serviço prestado pelo Portal da Secretaria de
Fazenda Estadual. Links para consulta :
http://hom.nfe.fazenda.gov.br/portal/disponibilidade.aspx (Homologação)
http://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx (Produção)

![](/img/manual/ConsultaStatusNFe.png)

<div id="d35835e22" class="table">

<div class="table-title">

Table 1.1. ConsultaStatusNFe
Parâmetros

</div>

<div class="table-contents">

|        Nome         | Nome da coluna |  Referência   |                                                                                                               Valores(Padrão)                                                                                                                |                 Descrição                 |                                                                      Comentário/Ajuda                                                                       |
| :-----------------: | :------------: | :-----------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Organização     |  AD\_Org\_ID   | Tabela Direta |                                                                                                              (@\#AD\_Org\_ID@)                                                                                                               | Entidade organizacional dentro da Empresa | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|    Modelo da NF     |  lbr\_NFModel  |     Lista     |                                                                                                           55 - NFe 65 - NFCe (55)                                                                                                            |    Identifica o modelo da Nota Fiscal     |                                                                            null                                                                             |
| Tipo de Emissão NFe | lbr\_NFeTpEmi  |     Lista     | Normal Contingência FS Contingência SCAN Contingência DPEC Contingência FSDA Contingência SVCAN Contingência SVCRS Contingência off-line da NFC-e (@SQL=SELECT lbr\_NFeTpEmi FROM AD\_OrgInfo WHERE AD\_OrgInfo.AD\_Org\_ID = @AD\_Org\_ID@) |                   null                    |                                                                            null                                                                             |

</div>

</div>

  

</div>
