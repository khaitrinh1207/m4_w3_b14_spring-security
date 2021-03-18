package codegym.spring_security.service;

import codegym.spring_security.model.AppUser;
import codegym.spring_security.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserServiceImp implements IAppUserService, UserDetailsService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Override
    public AppUser getUserByName(String name) {
        return appUserRepository.getAppUserByUsername(name);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = this.getUserByName(username);
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        grantedAuthorityList.add(appUser.getAppRole());
        UserDetails userDetails = new User(appUser.getUsername(),appUser.getPassword(),grantedAuthorityList);
        return userDetails;
    }
}
