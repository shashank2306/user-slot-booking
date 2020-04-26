package com.example.slotBooking.repository;

import com.example.slotBooking.entity.UserSlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSlotRepository extends JpaRepository<UserSlotEntity, Long> {

//    @Query(value = AuthUserConstants.Query.GET_USER_BY_PHONE)
//    AuthUserEntity getUserByPhone(String phone);

//    @Query(value = AuthUserConstants.Query.GET_USER_BY_EMAIL)
//    AuthUserEntity getUserByEmail(String email);
//
//    @Query(value = AuthUserConstants.Query.GET_USER_BY_EMAIL_OR_PHONE)
//    List<AuthUserEntity> getUserByEmailOrPhone(String email, String phone);

//    @Modifying
//    @Transactional(propagation = Propagation.REQUIRED)
//    @Query(value = AuthUserConstants.Query.ADD_OTP)
//    int updateOtpAndValidity(String mobileNo, String otp, Date expiry, String userType);

//    @Modifying
//    @Transactional(propagation = Propagation.REQUIRED)
//    @Query(value = AuthUserConstants.Query.UPDATE_VALIDITY)
//    int updateValidity(String mobileNo, Date expiry, String userType);
//
//    @Modifying
//    @Transactional(propagation = Propagation.REQUIRED)
//    @Query(value = AuthUserConstants.Query.CLEAR_OTP)
//    int clearOtpAndValidity(String mobileNo);
//
//    @Modifying
//    @Transactional(propagation = Propagation.REQUIRED)
//    @Query(value = AuthUserConstants.Query.UPDATE_LAST_IP)
//    int updateLastIp(Long id, String ip);
//
//    @Modifying
//    @Transactional(propagation = Propagation.REQUIRED)
//    @Query(value = AuthUserConstants.Query.UPDATE_LAST_LOGIN)
//    int updateLastLogin(Long id, Date lastLogin);
//
//    @Modifying
//    @Transactional(propagation = Propagation.REQUIRED)
//    @Query(value = AuthUserConstants.Query.UPDATE_LAST_LOGIN_WITH_IP)
//    int updateLastLoginWithIp(Long id, Date lastLogin, String ip);
//
//    @Query(value = AuthUserConstants.Query.GET_INACTIVE_USER_IDS)
//    List<Long> getInactiveUserIds();
}
