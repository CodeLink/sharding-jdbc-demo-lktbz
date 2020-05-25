package lktbz.dao;


import lktbz.entity.User;

/**

 */
public interface UserDao  {

    void addOne(User user);

    User getOneById(long id);
}
