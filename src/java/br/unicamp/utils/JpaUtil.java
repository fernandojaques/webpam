package br.unicamp.utils;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean(name ="emu")
@SessionScoped
public class JpaUtil {

    private EntityManagerFactory emf;
    private EntityManager em;

    public JpaUtil() {
        this.emf = Persistence.createEntityManagerFactory("WebPamPU");
    }

    public EntityManager getEM() {
        if (this.em == null || !this.em.isOpen()) {
            this.em = this.emf.createEntityManager();
        }
        return this.em;
    }

    public static JpaUtil getInstance() {
        ELContext context = FacesContext.getCurrentInstance().getELContext();
        ELResolver resolver = FacesContext.getCurrentInstance().getApplication().getELResolver();
        JpaUtil emu = (JpaUtil) resolver.getValue(context, null, "emu");
        return emu;
    }

    public void beginTransaction() {
        this.getEM().getTransaction().begin();
    }

    public void commitTransaction() {
        this.getEM().getTransaction().commit();
    }
}
