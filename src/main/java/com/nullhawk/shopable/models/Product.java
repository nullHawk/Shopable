package com.nullhawk.shopable.models;

public record Product(Long id, String title, String description, double price, Category category, String imageUrl) {
}