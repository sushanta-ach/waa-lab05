package com.miu.waa.assignment5.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data


public class User {
    @Id
    @GeneratedValue
    long id;
    private String name;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    List<Post> posts;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<Role> roles;
}
