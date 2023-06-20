package day2.Qns3;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "customer")
@TableGenerator(
        name = "key_generator",
        table = "key_generator",
        pkColumnName = "key_name",
        valueColumnName = "key_value",
        pkColumnValue = "customer_id",
        allocationSize = 1
)
public class Customers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
    private Long idWithSequence;

    private String firstName;
    private String lastName;
    private String email;

    public Customers() {}

    public Customers(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Long getIdWithSequence() {
        return idWithSequence;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
