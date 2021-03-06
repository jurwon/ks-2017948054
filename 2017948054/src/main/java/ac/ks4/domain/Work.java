package ac.ks4.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Work implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String website;

    @Column
    private LocalDate startdate;

    @Column
    private LocalDate enddate;

    @Column
    private String summry;


    @Builder
    public Work(String company, String position, String website, LocalDate startdate, LocalDate enddate, String summry) {
        this.company = company;
        this.position = position;
        this.website = website;
        this.startdate = startdate;
        this.enddate = enddate;
        this.summry = summry;
    }
}
