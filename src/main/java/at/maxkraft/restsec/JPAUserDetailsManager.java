package at.maxkraft.restsec;

import lombok.AllArgsConstructor;
import org.hibernate.NotYetImplementedFor6Exception;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

@AllArgsConstructor
public class JPAUserDetailsManager implements UserDetailsManager {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void createUser(UserDetails user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateUser(UserDetails user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteUser(String username) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean userExists(String username) {
        // TODO Auto-generated method stub
        return false;
    }
}