package com.rvmagrini.springjpa.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQueries({
        @NamedQuery(name = Registration.REGISTRATION_REPORT,
                    query = Registration.REGISTRATION_REPORT_JPQL)
})
public class Registration {

    public static final String REGISTRATION_REPORT = "registrationReport";

    public static final String REGISTRATION_REPORT_JPQL =
            "Select new com.rvmagrini.springjpa.model.RegistrationReport" +
            "(r.name, c.name, c.description) " +
            "from Registration r, Course c " +
            "where r.id = c.registration.id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    @NotEmpty
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "registration",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Course> courses = new ArrayList<>();

}
