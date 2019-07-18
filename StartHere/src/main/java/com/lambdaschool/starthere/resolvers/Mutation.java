package com.lambdaschool.starthere.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lambdaschool.starthere.models.Role;
import com.lambdaschool.starthere.repository.RoleRepository;
import com.lambdaschool.starthere.repository.UserRepository;

public class Mutation implements GraphQLMutationResolver {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public Mutation(RoleRepository roleRepository, UserRepository userRepository) {

        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    public Role newRole(Long roleId, String userRole) {
        Role role = new Role();
        role.setRoleid(roleId);
        role.setUserRoles(userRole);

        roleRepository.save(role);

        return role;
    }

    // Add other CRUD operations here, new instances of other models, udpate and delete etc.
}
