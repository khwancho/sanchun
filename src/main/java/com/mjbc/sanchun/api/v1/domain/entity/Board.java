package com.mjbc.sanchun.api.v1.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity(name = "board")
@Table(name = "board",
            uniqueConstraints={
                    @UniqueConstraint(
                            columnNames={"id","type","num"}
                    )
            }
        )
@Getter
@Setter
@Builder
public class Board extends BaseTime {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "type", nullable = false,length = 10)
    private String type;

    @Column(name = "num", nullable = false)
    private long num;

    @Column(name="title", nullable = false,length = 100)
    private String title;

    @Column(name="contents" , length = 4000)
    private String contents;

    @Column(name="reg_user" ,length = 20)
    private String regUser;

    @Column(name="update_user" ,length = 20)
    private String updateUser;




}
