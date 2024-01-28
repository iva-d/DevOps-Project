package mk.ukim.finki.aud_wp.repository.jpa;

import mk.ukim.finki.aud_wp.model.ShoppingCart;
import mk.ukim.finki.aud_wp.model.User;
import mk.ukim.finki.aud_wp.model.enumerations.ShoppingCartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    Optional<ShoppingCart> findByUserAndStatus(User user, ShoppingCartStatus status);
}
