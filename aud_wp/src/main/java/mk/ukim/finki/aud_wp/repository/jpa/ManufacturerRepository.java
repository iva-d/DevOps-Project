package mk.ukim.finki.aud_wp.repository.jpa;

import mk.ukim.finki.aud_wp.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
