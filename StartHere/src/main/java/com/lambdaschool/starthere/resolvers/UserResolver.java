package com.lambdaschool.starthere.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.lambdaschool.starthere.models.Role;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.repository.RoleRepository;

public class UserResolver implements GraphQLResolver<User> {

    private RoleRepository rolerepos;

    public UserResolver(RoleRepository rolerepos) {
        this.rolerepos = rolerepos;
    }

    public Role getUserRoles(User user) {
        return rolerepos.findOne(user.getName().getId());
    }

}
