package com.devsuperior.dslist.dto;

import lombok.Data;

@Data
public class GameMinDTO {
    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;
}
