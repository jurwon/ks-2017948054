package ac.ks4.domain;

import ac.ks4.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfileTest {

    @Autowired
    private ProfileRepository profileRepository;

    private Profile saveProfile;

    @Before
    public void init(){
        saveProfile = profileRepository.save(Profile.builder()
                .network("Twitter")
                .username("홍길동")
                .url("http://www.twitter.com/홍길동")
                .build());
    }

    @Test
    public void testFindNetworkProfile(){
        Profile foundProfile = profileRepository.findByNetwork("Twitter");
        assertThat(foundProfile.getNetwork()).isEqualTo(saveProfile.getNetwork());
    }
}
