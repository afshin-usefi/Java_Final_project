package com.sina.parkingApplication.dto.response;import com.sina.parkingApplication.common.BaseDTO;import io.swagger.annotations.ApiModelProperty;import lombok.Data;@Datapublic class ParkingDetailResponseDTO extends BaseDTO {    @ApiModelProperty(required = true, hidden = false)    private Long timeIn;    @ApiModelProperty(required = true, hidden = false)    private Long timeOut;    @ApiModelProperty(required = true, hidden = false)    private Long finalPrice;    @ApiModelProperty(required = true, hidden = false)    private ParkingResponseDTO parkingResponseDTO;    @ApiModelProperty(required = true, hidden = false)    private VehicleResponseDTO vehicleResponseDTO;    @ApiModelProperty(required = true, hidden = false)    private PriceRateResponseDTO priceRateResponseDTO;}