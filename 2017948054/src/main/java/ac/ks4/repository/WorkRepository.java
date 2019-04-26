package ac.ks4.repository;

import ac.ks4.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work,Long> {
    Work findByCompany(final String company);
}
