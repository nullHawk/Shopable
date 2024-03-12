package com.nullhawk.shopable.controllers;

import com.nullhawk.shopable.models.Cart;
import com.nullhawk.shopable.services.CartServ;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartServ cartService;

    public CartController(CartServ cartServ) {
        this.cartService = cartServ;
    }

    @GetMapping("")
    public List<Cart> getAll() {
        return cartService.getAll();
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable("id") Long id) {
        return cartService.getCart(id);
    }


    @GetMapping("/dateRange")
    public List<Cart> betweenDateRange(@RequestParam("from") String start, @RequestParam("to") String end) {
        return cartService.inDateRange(start, end);
    }

    @GetMapping("/user/{userId}")
    public List<Cart> getUserCart(@PathVariable("userId") Long userId) {
        return cartService.userCart(userId);
    }

    @PostMapping("")
    public String addNewProduct(@RequestBody Cart cart) {

        try {
            cartService.addNewCart(cart);
        } catch (Exception e) {
            return "Error";
        }

        return "Added Successfully";

    }

    @PutMapping("/update")
    public String updateProduct(@RequestBody Cart cart) {

        try {
            cartService.updateProduct(cart);
        } catch (Exception e) {
            return "Error";
        }

        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id) {

        try {
            cartService.deleteCart(id);
        } catch (Exception e) {
            return "Error";
        }

        return "Deleted";
    }
}