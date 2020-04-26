package com.example.slotBooking.constants;

public interface AuthUserConstants {

    /** Constant <code>TABLE_NAME="auth_users"</code> */
    String TABLE_NAME = "auth_users";

    /** Constant <code>ID="id"</code> */
    String ID = "id";

    /** Constant <code>USER_TYPE="user_type"</code> */
    String USER_TYPE = "user_type";

    /** Constant <code>GROUP_ID="group_id"</code> */
    String GROUP_ID = "group_id";

    /** The Constant FIRSTNAME. */
    String FIRST_NAME = "first_name";

    /** The Constant LASTNAME. */
    String LAST_NAME = "last_name";

    String USERNAME = "username";

    /** Constant <code>PASSWORD="password"</code> */
    String PASSWORD = "password";

    /** Constant <code>EMAIL="email"</code> */
    String EMAIL = "email";

    /** Constant <code>COUNTRY_CODE="country_code"</code> */
    String COUNTRY_CODE = "country_code";

    /** Constant <code>PHONE="phone"</code> */
    String PHONE = "phone";

    /** Constant <code>PHONE_VERIFIED="phone_verified"</code> */
    String PHONE_VERIFIED = "phone_verified";

    /** Constant <code>THUMBNAIL="thumbnail"</code> */
    String THUMBNAIL = "thumbnail";

    /** Constant <code>ACTIVE="active"</code> */
    String ACTIVE = "active";

    /** Constant <code>NEW_PASSWORD_KEY="new_password_key"</code> */
    String NEW_PASSWORD_KEY = "new_password_key";

    /** Constant <code>NEW_PASSWORD_REQUESTED="new_password_requested"</code> */
    String NEW_PASSWORD_REQUESTED = "new_password_requested";

    /** Constant <code>NEW_EMAIL="new_email"</code> */
    String NEW_EMAIL = "new_email";

    /** Constant <code>NEW_EMAIL_KEY="new_email_key"</code> */
    String NEW_EMAIL_KEY = "new_email_key";

    /** Constant <code>VERIFICATION_CODE="verification_code"</code> */
    String VERIFICATION_CODE = "verification_code";

    /** Constant <code>LAST_IP="last_ip"</code> */
    String LAST_IP = "last_ip";

    /** Constant <code>LAST_LOGIN="last_login"</code> */
    String LAST_LOGIN = "last_login";

    /** Constant <code>REVIEWED_BY="reviewed_by"</code> */
    String REVIEWED_BY = "reviewed_by";

    /** Constant <code>REVIEWED_ON="reviewed_on"</code> */
    String REVIEWED_ON = "reviewed_on";

    /** Constant <code>NOTES="notes"</code> */
    String NOTES = "notes";

    /** Constant <code>FLAG="flag"</code> */
    String FLAG = "flag";

    /** Constant <code>OTP="otp"</code> */
    String OTP = "otp";

    /** Constant <code>OTP_EXPIRE_ON="otp_expire_on"</code> */
    String OTP_EXPIRE_ON = "otp_expire_on";

    /** Constant <code>REMEMBER_TOKEN="remember_token"</code> */
    String TOKEN = "token";

    /** Constant <code>USER_STATUS="user_status"</code> */
    String USER_STATUS = "user_status";

    String DEFAULT_COUNTRY_CODE = "+91";

    interface AuthUserStatus {
        Integer APPROVED = 1;
        Integer PENDING = 0;
        Integer UNDER_REVIEW = 2;
    }

    interface AuthUserType {

        String ADMIN = "admin";
        String CUSTOMER = "customer";
    }

    interface Query {
        String GET_USER_BY_PHONE = "select e from AuthUserEntity e where e.phone =?1 and flag = 1";
        String GET_USER_BY_EMAIL = "select	 e from AuthUserEntity e where e.email =?1 and flag = 1";
        String GET_USER_BY_EMAIL_OR_PHONE = "select e from AuthUserEntity e where (e.email =?1 or e.phone =?2) and flag = 1";

        String ADD_OTP = "update AuthUserEntity e set e.otp =?2, e.otpExpireOn =?3 where e.phone =?1 and flag = 1 and active = 1 and userType = ?4";
        String CLEAR_OTP = "update AuthUserEntity e set e.otp = null, e.otpExpireOn = null where e.phone =?1";
        String UPDATE_LAST_IP = "update AuthUserEntity e set e.lastIp =?2 where e.id =?1";
        String UPDATE_LAST_LOGIN = "update AuthUserEntity e set e.lastLogin =?2 where e.id =?1";
        String UPDATE_LAST_LOGIN_WITH_IP = "update AuthUserEntity e set e.lastLogin =?2, e.lastIp =?3 where e.id =?1";
        String GET_INACTIVE_USER_IDS = "select e.id from AuthUserEntity e where e.active = 0";
        String UPDATE_VALIDITY = "update AuthUserEntity e set e.otpExpireOn =?2 where e.phone =?1 and flag = 1 and active = 1 and userType = ?3";

    }

    enum Events {
        auth_captcha_error, auth_banner_user, auth_incorrect_login, auth_incorrect_password, login, update_user_group, otp_login, login_with_otp, login_otp, otp_verified, otp_mobile, user_register, direct_login, customer_logout, admin_logout, auth_user_create, auth_user_delete, auth_user_update, auth_user_inactive, auth_user_active, auth_user_set_password, forgot_password, change_password, verify_otp, phone_update, email_update, profile_update, reset_password, admin_google_login
    }
}
