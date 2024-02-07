package com.automated.trading.stock.StockManager.stock.member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String email;

    private String picture;

    private MemberRole role;

    private LocalDateTime created_dt;

    @Builder
    public Member(String name, String email, String picture) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = MemberRole.USER;
        this.created_dt = LocalDateTime.now();
    }

}
