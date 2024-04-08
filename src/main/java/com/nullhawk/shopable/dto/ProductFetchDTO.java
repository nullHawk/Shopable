package com.nullhawk.shopable.dto;


public record ProductFetchDTO(Long id, String title, String description, double price, String category, String image) {
}