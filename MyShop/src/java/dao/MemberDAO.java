package dao;

import model.Member;

/**
 *
 * @author TVD
 */
public interface MemberDAO {

    // login
    public Member login(String uname, String passwd);

}
