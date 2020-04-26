package com.example.slotBooking.constants;

public interface UserSlotConstants {

    /** Constant <code>TABLE_NAME="auth_users"</code> */
    String TABLE_NAME = "user_slots";

    /** Constant <code>ID="id"</code> */
    String ID = "id";

    /** Constant <code>USER_TYPE="user_type"</code> */
    String USER_ID = "user_id";

    /** Constant <code>GROUP_ID="group_id"</code> */
    String ALLOTED_USER_ID = "alloted_user_id";

    /** The Constant FIRSTNAME. */
    String DATE = "date";

    /** The Constant LASTNAME. */
    String START_TIME = "start_time";

    String END_TIME = "end_time";

    /** Constant <code>USER_STATUS="user_status"</code> */
    String STATUS = "status";

    /** Constant <code>FLAG="flag"</code> */
    String FLAG = "flag";

    interface SlotStatus {
        Integer APPROVED = 1;
        Integer PENDING = 0;
        Integer REJECTED = 2;
    }

    interface Query {
        String GET_USER_BY_PHONE = "select e from AuthUserEntity e where e.phone =?1 and flag = 1";
        String GET_USER_BY_EMAIL = "select	 e from AuthUserEntity e where e.email =?1 and flag = 1";
        String GET_USER_BY_EMAIL_OR_PHONE = "select e from AuthUserEntity e where (e.email =?1 or e.phone =?2) and flag = 1";
        String UPDATE_VALIDITY = "update AuthUserEntity e set e.otpExpireOn =?2 where e.phone =?1 and flag = 1 and active = 1 and userType = ?3";

    }
}
