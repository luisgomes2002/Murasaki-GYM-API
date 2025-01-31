package gym.murasaki.MurasakiGym.Users;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    private UsersEnum type;

}
