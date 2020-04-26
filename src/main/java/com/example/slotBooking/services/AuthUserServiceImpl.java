package com.example.slotBooking.services;

import com.example.slotBooking.entity.AuthUserEntity;
import com.example.slotBooking.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class AuthUserServiceImpl implements AuthUserService, UserDetailsService {

    @Autowired
    private AuthUserRepository repository;

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public AuthUserEntity createUser(AuthUserEntity entity, String password) {
        return repository.save(entity);
    }

    @Override
    public AuthUserEntity updateAuthBasicProfile(Long id, String firstName, String lastName, String email, String phoneNo, String password) throws ValidationException {
        return null;
    }

    @Override
    public AuthUserEntity resetCustomerPassword(Long id, String password) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void softDelete(Long id) {

    }

    @Override
    public boolean isUniqueEmail(Long id, String email) {
        return false;
    }

    @Override
    public boolean isUniquePhone(Long id, String phone) {
        return false;
    }

    @Override
    public void setPassword(String token, String password) {

    }

    @Override
    public void forgotPassword(String email) {

    }

    @Override
    public void changePassword(Long authUserId, String newPassword) {

    }

    @Override
    public AuthUserEntity findByPhone(String phone) {
        return null;
    }

    @Override
    public AuthUserEntity findByEmail(String email) {
        return null;
    }

    @Override
    public AuthUserEntity findUser(Long id) {
        return null;
    }

    @Override
    public void updateUserGroup(AuthUserEntity user, Long userId, Long groupId) {

    }

    @Override
    public void updateUserActiveInactive(AuthUserEntity user, Long userId, Integer active) {

    }

    @Override
    public void updateUser(AuthUserEntity user) {

    }

    @Override
    public List<Long> getInactiveUserIds() {
        return null;
    }

    @Override
    public List<AuthUserEntity> findByGroup(Long groupId) {
        return null;
    }

    @Override
    public Long findAuthUserCount(Map<String, Object> searchParams) {
        return null;
    }

    @Override
    public AuthUserEntity updateAuthName(Long id, String firstName, String lastName) {
        return null;
    }

    @Override
    public List<AuthUserEntity> findByEmailOrPhone(String email, String phone) {
        return null;
    }

    @Override
    public List<AuthUserEntity> findCustomers(Set<Long> userIds) {
        return null;
    }

    @Override
    public AuthUserEntity updateAuthEmailAndName(Long id, String firstName, String lastName, String email) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("foo","foo",new ArrayList<>());
    }
}
