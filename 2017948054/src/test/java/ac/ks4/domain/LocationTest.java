package ac.ks4.domain;

import ac.ks4.repository.LocationRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LocationTest {

    @Autowired
    private LocationRepository locationRepository;

    private Location saveLocation;

    @Before
    public void init(){
        saveLocation = locationRepository.save(Location.builder()
                .address("부산광역시 OO구 OO번길 OOO")
                .postcode("12345")
                .build());
    }

    @Test
    public void testFindAddressLocation(){
        Location foundAddressLocation = locationRepository.findByAddress("부산광역시 OO구 OO번길 OOO");
        assertThat(foundAddressLocation.getAddress()).isEqualTo(saveLocation.getAddress());
    }
}
