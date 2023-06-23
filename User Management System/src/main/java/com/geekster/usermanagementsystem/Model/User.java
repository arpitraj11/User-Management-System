package com.geekster.usermanagementsystem.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Integer  UserId;
    private String Name;
    private String UserName ;
    private String  Address;
    private Integer PhoneNumber;
}
