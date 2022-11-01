package com.example.fridgekeeper.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor()
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "new","enabled", "username",
        "credentialsNonExpired", "accountNonExpired", "accountNonLocked", "authorities"})
public class User extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "role"}, name = "user_roles_unique")})
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Column(name = "password")
    private String password;


}
