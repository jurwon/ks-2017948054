package ac.ks4.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Location implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idx;

    @Column
    private String address;

    @Column
    private String postcode;

    @Builder
    public Location(String address, String postcode) {
        this.address = address;
        this.postcode = postcode;
    }
}
