package ac.ks4.repository;

import ac.ks4.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location,Long> {
    Location findByAddress(final String address);
}
