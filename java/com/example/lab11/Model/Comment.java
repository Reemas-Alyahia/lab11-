package com.example.lab11.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;


    @NotNull(message = "User Id cannot be Empty!..")
    @Column(columnDefinition = "int not null")
    private Integer userId;

    @NotNull(message = "User Id cannot be Empty!..")
    @Column(columnDefinition = "int not null")
    private Integer postId;


    @NotEmpty(message = "content cannot be Empty!..")
    @Column(columnDefinition = "varchar(30) not null")
    private String content;


    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate commentDate= LocalDate.now();
}
