---
title: "Informações de Equipamento"
id: InformacoesdeEquipamentoI
---
<div id="d124843e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Equipamento

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-08-01 11:36:10.0

<span class="emphasis"> *Atualizado:* </span>2018-08-01 11:36:35.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_Equipments a

<span class="emphasis"> *Order By :*</span>null

<div id="d124843e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|         Nome          |      Referência      |                     Sql SELECT                     |                                       QueryCriteria                                        |      Descrição       |   Comentário/Ajuda   |
| :-------------------: | :------------------: | :------------------------------------------------: | :----------------------------------------------------------------------------------------: | :------------------: | :------------------: |
|   Número Ativo Fixo   | Texto Curto (String) |                 a.cof\_AssetNumber                 |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |         null         |         null         |
|        Chassi         | Texto Curto (String) |                   a.cof\_Chassi                    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |         null         |         null         |
|     Estado Placa      |        Tabela        |               a.cof\_StatePlate\_ID                |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |         null         |         null         |
|         Marca         | Texto Curto (String) |                    a.cof\_Brand                    |                                                                                            |         null         |         null         |
| Habilitação Requerida |        Lista         |               a.cof\_LicenseRequired               |                                                                                            |         null         |         null         |
|        RENAVAM        | Texto Curto (String) |                   a.cof\_RENAVAM                   |                                                                                            |         null         |         null         |
|  Próxima Manutenção   |         Data         |               a.cof\_NextMaintenance               |                                                                                            |         null         |         null         |
|  Próxima Manutenção   |         Data         |  a.cof\_NextMaintenance AS cof\_NextMaintenanceTo  | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |         null         |         null         |
|       Motorista       |       Procurar       |                 a.COF\_Driver\_ID                  |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Primary Key : Driver | Primary Key : Driver |
|         Placa         | Texto Curto (String) |                 a.cof\_PlateNumber                 | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |         null         |         null         |
|  Próxima Manutenção   |         Data         | a.cof\_NextMaintenance AS cof\_NextMaintenanceFrom | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |         null         |         null         |
|        Modelo         | Texto Curto (String) |                    a.cof\_Model                    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |         null         |         null         |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/COFEquipmentsIDinfodata.html),

</div>
