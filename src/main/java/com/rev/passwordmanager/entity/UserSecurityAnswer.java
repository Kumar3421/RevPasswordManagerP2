package com.rev.passwordmanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_security_answers")
public class UserSecurityAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private SecurityQuestion securityQuestion;

    @Column(nullable = false)
    private String answerHash;

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public SecurityQuestion getSecurityQuestion() {
        return securityQuestion;
    }

    public String getAnswerHash() {
        return answerHash;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSecurityQuestion(SecurityQuestion securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setAnswerHash(String answerHash) {
        this.answerHash = answerHash;
    }
}