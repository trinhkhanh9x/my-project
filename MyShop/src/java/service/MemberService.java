package service;

import model.Member;

/**
 *
 * @author TVD
 */
public interface MemberService {

    // login
    public Member login(String uname, String passwd);

}
