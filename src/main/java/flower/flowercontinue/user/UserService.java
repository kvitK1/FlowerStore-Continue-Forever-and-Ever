package flower.flowercontinue.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getUser() {
        return List.of(new User());
    }
}
