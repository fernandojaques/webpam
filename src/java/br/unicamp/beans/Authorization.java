/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author fernando
 */
@Entity
public class Authorization implements Serializable {

    @Id
    private Long id;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
