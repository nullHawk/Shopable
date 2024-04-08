package com.nullhawk.shopable.dto;


import java.util.List;


public record CartRecieveDTO<ProductCartDTO>(long id, long userId, String date, List<ProductCartDTO> products) {

}


