package ua.com.public_utilities_admin;


        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Bean;
        import ua.com.public_utilities_admin.entity.Role;
        import ua.com.public_utilities_admin.repository.RoleRepository;

@SpringBootApplication
public class PublicUtilitiesAdminApplication {

    private final RoleRepository roleRepository;

    public PublicUtilitiesAdminApplication(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PublicUtilitiesAdminApplication.class, args);
    }


    @Bean
    public void saveRolesToDB() {

        if (roleRepository.findAll().isEmpty()) {
            roleRepository.save(new Role(1L, "ROLE_User"));
            roleRepository.save(new Role(2L, "ROLE_Manager"));
            roleRepository.save(new Role(3L, "ROLE_Admin"));
        }
    }

}