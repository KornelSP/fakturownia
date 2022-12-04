package pl.sda.hibernate.fakturownia.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kontrachent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private String nip;
    private String adres;

    @OneToMany
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Faktura> faktury;
}

