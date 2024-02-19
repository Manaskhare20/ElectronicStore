package com.electronic.store.ElectronicStore.entities;


import jakarta.persistence.*;
import lombok.*;


import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(name="user_name")//changing name of column in table
    private String name;
    @Column(name="user_email",unique=true)
    private String email;
    @Column(name="user_password",length=50)
    private String password;
    private String gender;

    @Column(length = 1000)
    private String about;

    @Column(name="user_image_name")
    private String imageName;


}
