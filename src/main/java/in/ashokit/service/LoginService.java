package in.ashokit.service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserRepository repo;

    public  boolean saveUser(User user){
        if (repo.findByUsername(user.getUsername())!=null){
            return false;
        } else if (repo.findByEmail(user.getEmail())!=null) {
            return  false;
        } else {
            repo.save(user);
            return true;
        }
    }
    public User loginUser(User user){

        if (user.getEmail() == null || user.getEmail().isBlank()
                || user.getPassword() == null || user.getPassword().isBlank()) {
            return null;
        }
        User fromDB = repo.findByEmail(user.getEmail());
        if (fromDB !=null && fromDB.getPassword().equals(user.getPassword())){
            return fromDB;
        }
        return  null;
    }
}
