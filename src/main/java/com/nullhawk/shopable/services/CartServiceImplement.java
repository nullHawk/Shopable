package com.nullhawk.shopable.services;

import com.nullhawk.shopable.dto.CartDto;
import com.nullhawk.shopable.models.Cart;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class CartServiceImplement implements CartServ {

    private final String url = "https://fakestoreapi.com/carts";
    private final RestTemplate restTemplate = new RestTemplate();

    private Cart mapToCart(CartDto cartRecieveDTO) {

        return new Cart(cartRecieveDTO.getId(), cartRecieveDTO.getUserId(), cartRecieveDTO.getDate(), cartRecieveDTO.getProducts());

    }
    private CartDto mapToCartDto(Cart cart) {

        return new CartDto(cart.getId(), cart.getUserId(), cart.getDate(), cart.getProducts());

    }
    @Override
    public List<Cart> getAll() {

        List<CartDto> cartFetchDTO = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDto>>() {}).getBody();

        assert cartFetchDTO != null;

        return cartFetchDTO.stream().map(this::mapToCart).toList();
    }
    @Override
    public Cart getCart(long id) {

        CartDto cartRecieveDTO = restTemplate.getForObject(url + "/" + id, CartDto.class);

        assert cartRecieveDTO != null;

        return mapToCart(cartRecieveDTO);
    }

    @Override
    public List<Cart> inDateRange(String start, String end) {

        List<CartDto> cartFetchDTO = restTemplate.exchange(
                url + "?startdate=" + start + "&enddate=" + end,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDto>>() {}).getBody();

        assert cartFetchDTO != null;

        return cartFetchDTO.stream().map(this::mapToCart).toList();

    }

    @Override
    public List<Cart> userCart(long userId) {
        List<CartDto> cartFetchDTO = restTemplate.exchange(
                url + "/user/" + userId,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CartDto>>() {}).getBody();

        assert cartFetchDTO != null;

        return cartFetchDTO.stream().map(this::mapToCart).toList();
    }

    @Override
    public void addNewCart(Cart cart) {
        CartDto sendCart = mapToCartDto(cart);
        sendCart = restTemplate.postForObject(url, sendCart, CartDto.class);

//        The cart could be returned to the user as well but no need to do that right now

    }

    @Override
    public void updateProduct(Cart cart) {
        CartDto sendCart = mapToCartDto(cart);
        restTemplate.put(url + "/" + sendCart.getId(), sendCart);
    }



    @Override
    public void deleteCart(long id) {
        restTemplate.delete(url + "/" + id);
    }
}