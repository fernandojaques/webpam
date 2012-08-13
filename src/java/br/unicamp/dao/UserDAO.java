/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.dao;

import br.unicamp.beans.User;
import br.unicamp.utils.JpaUtil;

/**
 *
 * @author Fernando
 */
public class UserDAO {

    public void save(User user) throws Exception{
        JpaUtil.getInstance().beginTransaction();

        if (user.getId() != null) {
            user = JpaUtil.getInstance().getEM().merge(user);
        }

        JpaUtil.getInstance().getEM().persist(user);
        JpaUtil.getInstance().commitTransaction();
    }

    public void remove(User user) throws Exception{
        JpaUtil.getInstance().beginTransaction();

        if (user.getId() != null) {
            user = JpaUtil.getInstance().getEM().merge(user);
        }

        JpaUtil.getInstance().getEM().remove(user);
        JpaUtil.getInstance().commitTransaction();
    }
}
