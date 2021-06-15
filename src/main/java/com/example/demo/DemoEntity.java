package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Table(name = "DEMO") @Data @NoArgsConstructor @EqualsAndHashCode(callSuper = false) @ToString
public class DemoEntity {
    @Id @Column(name = "id", updatable = false, nullable = false)
    private @NotNull Long id;

    @Column(nullable = false) @JsonIgnore
    private @NotNull String name;

}
