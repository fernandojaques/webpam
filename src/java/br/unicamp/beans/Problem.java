/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Fernando
 */
@Entity
public class Problem implements Serializable {

    @Id
    private Long id;
    private String problemName;
    private String description;
    @OneToMany
    private List<User> userGroup = new ArrayList<User>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
