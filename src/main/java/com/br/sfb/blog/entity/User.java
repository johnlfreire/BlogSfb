package com.br.sfb.blog.entity;


import javax.persistence.*;


@Entity
@Table
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @Column
	    private String userName;
	    @Column
	    private String password;
	    @Column
	    private String email;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
}
