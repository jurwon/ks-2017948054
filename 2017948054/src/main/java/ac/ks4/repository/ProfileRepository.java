package ac.ks4.repository;

import ac.ks4.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
    Profile findByNetwork(final String network);
}
