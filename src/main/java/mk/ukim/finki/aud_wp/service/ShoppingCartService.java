package mk.ukim.finki.aud_wp.service;

import mk.ukim.finki.aud_wp.model.Product;
import mk.ukim.finki.aud_wp.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);
    ShoppingCart getActiveShoppingCart(String username);
    ShoppingCart addProductToShoppingCart(String username, Long productId);
}

