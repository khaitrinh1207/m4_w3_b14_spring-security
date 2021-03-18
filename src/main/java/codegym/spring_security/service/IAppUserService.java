package codegym.spring_security.service;

import codegym.spring_security.model.AppUser;

public interface IAppUserService {

    AppUser getUserByName(String name);

}
