package com.lambdaschool.starthere.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lambdaschool.starthere.models.Role;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.repository.RoleRepository;
import com.lambdaschool.starthere.repository.UserRepository;

public class Query implements GraphQLQueryResolver {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public Query(RoleRepository roleRepository, UserRepository userRepository) {

        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Iterable<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    public long countUsers() {
        return userRepository.count();
    }
}
