package com.electronic.store.ElectronicStore.dtos;

import com.electronic.store.ElectronicStore.validate.ImageNameValid;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {


    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    //@Column(name="user_name")//changing name of column in table
    @Size(min=3,max=15,message="Invalid name")
    private String name;
    //@Column(name="user_email",unique=true)
    @Email(message="Invalid user Email")
    @NotBlank(message="email is required")
    private String email;
    //@Column(name="user_password",length=10)
    @NotBlank(message="password required")
    private String password;

    @Size(min=4,max=6,message="Invalid gender")
    private String gender;

    //@Column(length = 1000)
    @NotBlank(message="write about urself")
    private String about;

    //@Column(name="user_image_name")
    @ImageNameValid
    private String imageName;
}
