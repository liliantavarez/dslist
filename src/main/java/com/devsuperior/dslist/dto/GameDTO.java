package com.devsuperior.dslist.dto;

import lombok.Data;

@Data
public class GameDTO {
    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
}
