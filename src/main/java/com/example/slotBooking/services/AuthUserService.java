package com.example.slotBooking.services;

import com.example.slotBooking.entity.AuthUserEntity;

import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Map;
import java.util.Set;


public interface AuthUserService {

    boolean exists(Long id);

    AuthUserEntity createUser(AuthUserEntity entity, String password);

    AuthUserEntity updateAuthBasicProfile(Long id, String firstName, String lastName, String email, String phoneNo, String password) throws ValidationException;

    AuthUserEntity resetCustomerPassword(Long id, String password);



    void deleteById(Long id);

    void softDelete(Long id);

    boolean isUniqueEmail(Long id, String email);

    boolean isUniquePhone(Long id, String phone);

    void setPassword(String token, String password);

    void forgotPassword(String email);

    void changePassword(Long authUserId, String newPassword);

    AuthUserEntity findByPhone(String phone);

    AuthUserEntity findByEmail(String email);

    AuthUserEntity findUser(Long id);

    void updateUserGroup(AuthUserEntity user, Long userId, Long groupId);

    void updateUserActiveInactive(AuthUserEntity user, Long userId, Integer active);

    void updateUser(AuthUserEntity user);

    List<Long> getInactiveUserIds();

    List<AuthUserEntity> findByGroup(Long groupId);

    Long findAuthUserCount(Map<String, Object> searchParams);

    AuthUserEntity updateAuthName(Long id, String firstName, String lastName);

    List<AuthUserEntity> findByEmailOrPhone(String email, String phone);

    List<AuthUserEntity> findCustomers(Set<Long> userIds);

    AuthUserEntity updateAuthEmailAndName(Long id, String firstName, String lastName, String email);

}
