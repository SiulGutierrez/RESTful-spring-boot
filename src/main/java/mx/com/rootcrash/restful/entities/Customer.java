package mx.com.rootcrash.restful.entities;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customers")
@ApiModel(value = "Customer", description = "All details about the Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    @ApiModelProperty(value = "idCustomer", notes = "The database generated customer ID")
    private Long idCustomer;

    @Column(name = "name")
    @ApiModelProperty(value = "name", notes = "Name customer")
    private String name;

    @Column(name = "email")
    @Email
    @ApiModelProperty(value = "email", notes = "Email customer")
    private String email;

    @Column(name = "phone")
    @ApiModelProperty(value = "phone", notes = "Phone customer")
    private String phone;

    @Column(name = "city")
    @ApiModelProperty(value = "city", notes = "City customer")
    private String city;

    @Column(name = "state")
    @ApiModelProperty(value = "state", notes = "State customer")
    private String state;

    @Column(name = "country")
    @ApiModelProperty(value = "country", notes = "Country customer")
    private String country;

    @Column(name = "gender")
    @ApiModelProperty(value = "gender", notes = "Gender customer")
    private String gender;

}
