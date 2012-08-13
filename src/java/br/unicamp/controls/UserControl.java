/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.controls;

import br.unicamp.beans.User;
import br.unicamp.dao.UserDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fernando
 */
@ManagedBean
@SessionScoped
public class UserControl {

    public static final String INDEX = "index.jsf";
    private User user;
    private UserDAO dao;

    public UserControl() {
        this.dao = new UserDAO();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void newUser() {
        this.user = new User();
    }

    public String save() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            if (this.user.getId() == null)
                this.user.getAuthorizations().add("ROLE_USER");
            
            dao.save(this.user);
            context.addMessage(null, new FacesMessage("Cadastro realizado com sucesso!"));
            return INDEX;

        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Atenção, o email informado já está em uso."));
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
            return INDEX;
        }
    }

    public void remove() {

        FacesContext context = FacesContext.getCurrentInstance();

        try {
            dao.remove(this.user);
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Atenção um erro ocorreu ao tentar excluir o registro!"));
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
