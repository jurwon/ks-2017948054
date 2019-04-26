package ac.ks4.repository;

import ac.ks4.domain.Basic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BasicRepository extends JpaRepository<Basic,Long> {
    Basic findByName(final String name);
}
