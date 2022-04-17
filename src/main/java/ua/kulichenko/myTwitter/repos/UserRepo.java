package ua.kulichenko.myTwitter.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kulichenko.myTwitter.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
