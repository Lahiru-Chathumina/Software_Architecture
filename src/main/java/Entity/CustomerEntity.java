package Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "cust_v2")
public class CustomerEntity {
    @Id
    //    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    private String Name;
    private String Address;
}
