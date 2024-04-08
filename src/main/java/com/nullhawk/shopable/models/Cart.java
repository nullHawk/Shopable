package com.nullhawk.shopable.models;

import java.util.List;


import java.util.List;

public record Cart(long id, long userId, String date, List<Product> products) {}
