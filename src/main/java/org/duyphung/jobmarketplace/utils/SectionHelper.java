package org.duyphung.jobmarketplace.utils;

import org.duyphung.jobmarketplace.entities.UserEntity;
import org.duyphung.jobmarketplace.sercurity.UserPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SectionHelper {
    public static UserEntity getUserFromSection() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof UserPrincipal userPrincipal) {
                return userPrincipal.getUser();
            }
        }
        return null;
    }
}
