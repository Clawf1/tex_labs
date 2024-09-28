package com.clf.dto;

import com.clf.model.Cat;
import com.clf.model.Owner;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class OwnerDto {
    private Long id;
    private String name;
    private Date birthDate;
    private List<Long> catIds;

    public OwnerDto(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.birthDate = owner.getBirthDate();
        catIds = owner.getCats().stream().map(Cat::getId).toList();
    }
}