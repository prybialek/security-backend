package pl.rybialek.backend.web.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDTO {

    private Long id;

    @NotEmpty
    @Size(min=5, message="Username must be at least 5 characters long")
    private String username;

    @NotEmpty
    @Size(min=5, message="Password must be at least 5 characters long")
    private String password;

    private String roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
