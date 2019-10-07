package com.Traditional.Blog.domain;

import java.nio.file.attribute.UserPrincipal;

public class CollatedUserPrincipal implements UserPrincipal {
    private CollatedUser collatedUser;

    public CollatedUserPrincipal(CollatedUser collatedUser) {
        this.collatedUser = collatedUser;
    }

    @Override
    public String getName() {
        return collatedUser.getUserName();

    }
}
